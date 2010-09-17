/*
 * Created on Sep 10, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.error;

import static org.junit.Assert.assertEquals;

import org.junit.*;

/**
 * Tests for <code>{@link ErrorWhenNotEqualFactory#errorWhenNotEqual(Object, Object)}</code>.
 *
 * @author Alex Ruiz
 */
public class ErrorWhenNotEqualFactory_errorWhenNotEqual_Test {

  private static Object e;
  private static Object a;

  @BeforeClass public static void setUpOnce() {
    e = "Yoda";
    a = "Luke";
  }

  @Test public void should_create_new_ErrorWhenNotEqualFactory() {
    AssertionErrorFactory factory = ErrorWhenNotEqualFactory.errorWhenNotEqual(e, a);
    assertEquals(ErrorWhenNotEqualFactory.class, factory.getClass());
  }

  @Test public void should_pass_expected_and_actual() {
    ErrorWhenNotEqualFactory factory = (ErrorWhenNotEqualFactory) ErrorWhenNotEqualFactory.errorWhenNotEqual(e, a);
    assertEquals(e, factory.expected);
    assertEquals(a, factory.actual);
  }
}