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
package org.apache.commons.lang3;

import org.apache.commons.lang3.NullArgumentException;

import junit.framework.TestCase;

/**
 * JUnit tests.
 * 
 * @author Apache Software Foundation
 * @author Matthew Hawthorne
 * @version $Id: NullArgumentExceptionTest.java 1067685 2011-02-06 15:38:57Z niallp $
 * @see NullArgumentException
 */
public class NullArgumentExceptionTest extends TestCase {

    public NullArgumentExceptionTest(String testName) {
        super(testName);
    }

    // testConstructor

    public void testConstructor_nullInput() {
        new NullArgumentException(null);
    }

    // testGetMessage

    public void testGetMessage_nullConstructorInput() {
        final Throwable t = new NullArgumentException(null);
        assertEquals("Argument must not be null.", t.getMessage());
    }

    public void testGetMessage_validConstructorInput() {
        final String argName = "name";
        final Throwable t = new NullArgumentException(argName);
        assertEquals(argName + " must not be null.", t.getMessage());
    }

} // NullArgumentExceptionTest

