// Copyright 2015 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.organicdesign.fp.tuple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.organicdesign.testUtils.EqualsContract.equalsDistinctHashCode;
import static org.organicdesign.testUtils.EqualsContract.equalsSameHashCode;

// ======================================================================================
// THIS CLASS IS GENERATED BY /tupleGenerator/TupleGenerator.java.  DO NOT EDIT MANUALLY!
// ======================================================================================

public class Tuple7Test {
    @Test public void constructionAndAccess() {
        Tuple7<String,String,String,String,String,String,String> a = Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th");

        assertEquals("1st", a._1());
        assertEquals("2nd", a._2());
        assertEquals("3rd", a._3());
        assertEquals("4th", a._4());
        assertEquals("5th", a._5());
        assertEquals("6th", a._6());
        assertEquals("7th", a._7());

        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("wrong","2nd","3rd","4th","5th","6th","7th"));


        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","wrong","3rd","4th","5th","6th","7th"));


        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","wrong","4th","5th","6th","7th"));


        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","wrong","5th","6th","7th"));


        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","wrong","6th","7th"));


        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","wrong","7th"));


        equalsDistinctHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                               Tuple7.of("1st","2nd","3rd","4th","5th","6th","wrong"));

        equalsDistinctHashCode(Tuple7.of("1st",null,"3rd",null,"5th",null,"7th"),
                               Tuple7.of("1st",null,"3rd",null,"5th",null,"7th"),
                               Tuple7.of("1st",null,"3rd",null,"5th",null,"7th"),
                               Tuple7.of("1st",null,"3rd",null,"5th",null,"wrong"));

        equalsDistinctHashCode(Tuple7.of(null,"2nd",null,"4th",null,"6th",null),
                               Tuple7.of(null,"2nd",null,"4th",null,"6th",null),
                               Tuple7.of(null,"2nd",null,"4th",null,"6th",null),
                               Tuple7.of(null,"2nd",null,"4th",null,"6th","wrong"));

        equalsSameHashCode(a, Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                           Tuple7.of("1st","2nd","3rd","4th","5th","6th","7th"),
                           Tuple7.of("2nd","1st","3rd","4th","5th","6th","7th"));

        assertEquals("Tuple7(1st,2nd,3rd,4th,5th,6th,7th)", a.toString());
    }
}
