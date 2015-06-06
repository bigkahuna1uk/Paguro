/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *   which can be found in the file epl-v10.html at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Mar 3, 2008 */
/* glen added types 2015-06-06 any errors are now mine. */

package org.organicdesign.fp.collections;

import org.organicdesign.fp.collections.PersistentHashMap.TransientHashMap;
import org.organicdesign.fp.permanent.Sequence;

import java.util.List;

public class PersistentHashSet<E> implements ImSet<E> {

    public static final PersistentHashSet<Object> EMPTY = new PersistentHashSet<>(PersistentHashMap.EMPTY);

    @SuppressWarnings("unchecked")
    public static <E> PersistentHashSet<E> empty() { return (PersistentHashSet<E>) EMPTY; }

    @SafeVarargs
    public static <E>  PersistentHashSet<E> create(E... init) {
        PersistentHashSet<E> empty = empty();
        TransientHashSet<E> ret = empty.asTransient();
        for (int i = 0; i < init.length; i++) {
            ret = ret.put(init[i]);
        }
        return ret.persistent();
    }

    public static <E>  PersistentHashSet<E> create(List<E> init) {
        PersistentHashSet<E> empty = empty();
        TransientHashSet<E> ret = empty.asTransient();
        for (E key : init) {
            ret = ret.put(key);
        }
        return ret.persistent();
    }

//    static public <E>  PersistentHashSet<E> create(ISeq items) {
//        PersistentHashSet<E> empty = empty();
//        TransientHashSet<E> ret = empty.asTransient();
//        for (; items != null; items = items.next()) {
//            ret = ret.conj(items.first());
//        }
//        return ret.persistent();
//    }

    @SafeVarargs
    public static <E> PersistentHashSet<E> createWithCheck(E... init) {
        PersistentHashSet<E> empty = empty();
        TransientHashSet<E> ret = empty.asTransient();
        for (int i = 0; i < init.length; i++) {
            ret = ret.put(init[i]);
            if (ret.size() != i + 1)
                throw new IllegalArgumentException("Duplicate key: " + init[i]);
        }
        return ret.persistent();
    }

    public static <E> PersistentHashSet<E> createWithCheck(List<E> init) {
        PersistentHashSet<E> empty = empty();
        TransientHashSet<E> ret = empty.asTransient();
        int i = 0;
        for (E key : init) {
            ret = ret.put(key);
            if (ret.size() != i + 1)
                throw new IllegalArgumentException("Duplicate key: " + key);
            ++i;
        }
        return ret.persistent();
    }

//    static public PersistentHashSet<E> createWithCheck(ISeq items) {
//        PersistentHashSet<E> empty = empty();
//        TransientHashSet<E> ret = empty.asTransient();
//        for (int i = 0; items != null; items = items.next(), ++i) {
//            ret = (TransientHashSet<E>) ret.conj(items.first());
//            if (ret.count() != i + 1)
//                throw new IllegalArgumentException("Duplicate key: " + items.first());
//        }
//        return (PersistentHashSet) ret.persistent();
//    }
    private final PersistentHashMap<E,Object> impl;

    PersistentHashSet(PersistentHashMap<E,Object> i) { impl = i; }

    @SuppressWarnings("unchecked")
    @Override public boolean contains(Object key) {
        return impl.entry((E) key).isSome();
    }

    @Override public PersistentHashSet<E> disjoin(E key) {
        if (contains(key))
            return new PersistentHashSet<>(impl.without(key));
        return this;
    }

    @Override public PersistentHashSet<E> put(E o) {
        if (contains(o))
            return this;
        return new PersistentHashSet<>(impl.assoc(o, o));
    }

    @Override public Sequence<E> seq() { return impl.keySet().seq(); }

    @Override public int size() { return impl.size(); }

    private TransientHashSet<E> asTransient() {
        return new TransientHashSet<>(impl.asTransient());
    }

    static final class TransientHashSet<E> implements ImSet<E> {
        TransientHashMap<E,Object> impl;

        TransientHashSet(TransientHashMap<E,Object> impl) {
            this.impl = impl;
        }

        @Override public int size() { return impl.size(); }

        @Override public TransientHashSet<E> put(E val) {
            TransientHashMap<E,Object> m = impl.assoc(val, val);
            if (m != impl) this.impl = m;
            return this;
        }

        @Override public Sequence<E> seq() { return impl.keySet().seq(); }

        @SuppressWarnings("unchecked")
        @Override public boolean contains(Object key) {
            return impl.entry((E) key).isSome();
        }

        /**
         This is a convenience method inherited from Collection that returns true if size() == 0 (if this set contains no
         elements).
         */
        @Override public boolean isEmpty() { return impl.isEmpty(); }

        @Override public TransientHashSet<E> disjoin(E key) {
            TransientHashMap<E,Object> m = impl.without(key);
            if (m != impl) this.impl = m;
            return this;
        }

//        public E get(E key) {
//            return impl.valAt(key);
//        }

//        public Object invoke(Object key, Object notFound) {
//            return impl.valAt(key, notFound);
//        }
//
//        public Object invoke(Object key) {
//            return impl.valAt(key);
//        }

        public PersistentHashSet<E> persistent() {
            return new PersistentHashSet<>(impl.persistent());
        }
    }

}
