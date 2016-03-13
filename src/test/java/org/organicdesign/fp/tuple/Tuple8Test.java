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

public class Tuple8Test {
    @Test public void constructionAndAccess() {
        Tuple8<String,String,String,String,String,String,String,String> a = Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th");

        assertEquals("1st", a._1());
        assertEquals("2nd", a._2());
        assertEquals("3rd", a._3());
        assertEquals("4th", a._4());
        assertEquals("5th", a._5());
        assertEquals("6th", a._6());
        assertEquals("7th", a._7());
        assertEquals("8th", a._8());

        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("wrong","2nd","3rd","4th","5th","6th","7th","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","wrong","3rd","4th","5th","6th","7th","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","wrong","4th","5th","6th","7th","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","wrong","5th","6th","7th","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","wrong","6th","7th","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","wrong","7th","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","wrong","8th"));


        equalsDistinctHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                               Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","wrong"));

        equalsDistinctHashCode(Tuple8.of("1st",null,"3rd",null,"5th",null,"7th",null),
                               Tuple8.of("1st",null,"3rd",null,"5th",null,"7th",null),
                               Tuple8.of("1st",null,"3rd",null,"5th",null,"7th",null),
                               Tuple8.of("1st",null,"3rd",null,"5th",null,"7th","wrong"));

        equalsDistinctHashCode(Tuple8.of(null,"2nd",null,"4th",null,"6th",null,"8th"),
                               Tuple8.of(null,"2nd",null,"4th",null,"6th",null,"8th"),
                               Tuple8.of(null,"2nd",null,"4th",null,"6th",null,"8th"),
                               Tuple8.of(null,"2nd",null,"4th",null,"6th",null,"wrong"));

        equalsSameHashCode(a, Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                           Tuple8.of("1st","2nd","3rd","4th","5th","6th","7th","8th"),
                           Tuple8.of("2nd","1st","3rd","4th","5th","6th","7th","8th"));

        assertEquals("Tuple8(1st,2nd,3rd,4th,5th,6th,7th,8th)", a.toString());
    }
}
