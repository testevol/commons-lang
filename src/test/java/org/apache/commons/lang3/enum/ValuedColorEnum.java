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
package org.apache.commons.lang3.enum;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Color enumeration.
 *
 * @author Apache Software Foundation
 * @version $Id: ValuedColorEnum.java 1067685 2011-02-06 15:38:57Z niallp $
 */

public final class ValuedColorEnum extends ValuedEnum {
    public static final ValuedColorEnum RED = new ValuedColorEnum("Red", 1);
    public static final ValuedColorEnum GREEN = new ValuedColorEnum("Green", 2);
    public static final ValuedColorEnum BLUE = new ValuedColorEnum("Blue", 3);

    private ValuedColorEnum(String color, int value) {
        super(color, value);
    }

    public static ValuedColorEnum getEnum(String color) {
        return (ValuedColorEnum) getEnum(ValuedColorEnum.class, color);
    }

    public static ValuedColorEnum getEnum(int value) {
        return (ValuedColorEnum) getEnum(ValuedColorEnum.class, value);
    }

    public static Map getEnumMap() {
        return getEnumMap(ValuedColorEnum.class);
    }

    public static List getEnumList() {
        return getEnumList(ValuedColorEnum.class);
    }

    public static Iterator iterator() {
        return iterator(ValuedColorEnum.class);
    }
}
