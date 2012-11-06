/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.enums;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Broken Operator enumeration, getEnumClass() is ValuedEnum.class.
 *
 * @author Apache Software Foundation
 * @version $Id: Broken4OperationEnum.java 1067685 2011-02-06 15:38:57Z niallp $
 */
public abstract class Broken4OperationEnum extends Enum {
    // This syntax works for JDK 1.3 and upwards:
//    public static final OperationEnum PLUS = new OperationEnum("Plus") {
//        public int eval(int a, int b) {
//            return (a + b);
//        }
//    };
//    public static final OperationEnum MINUS = new OperationEnum("Minus") {
//        public int eval(int a, int b) {
//            return (a - b);
//        }
//    };
    // This syntax works for JDK 1.2 and upwards:
    public static final Broken4OperationEnum PLUS = new PlusOperation();
    private static class PlusOperation extends Broken4OperationEnum {
        private PlusOperation() {
            super("Plus");
        }
        public int eval(int a, int b) {
            return (a + b);
        }
    }
    public static final Broken4OperationEnum MINUS = new MinusOperation();
    private static class MinusOperation extends Broken4OperationEnum {
        private MinusOperation() {
            super("Minus");
        }
        public int eval(int a, int b) {
            return (a - b);
        }
    }

    private Broken4OperationEnum(String name) {
        super(name);
    }
    
    public final Class getEnumClass() {
        return ValuedEnum.class;
    }

    public abstract int eval(int a, int b);

    public static Broken4OperationEnum getEnum(String name) {
        return (Broken4OperationEnum) getEnum(Broken4OperationEnum.class, name);
    }

    public static Map getEnumMap() {
        return getEnumMap(Broken4OperationEnum.class);
    }

    public static List getEnumList() {
        return getEnumList(Broken4OperationEnum.class);
    }

    public static Iterator iterator() {
        return iterator(Broken4OperationEnum.class);
    }
}