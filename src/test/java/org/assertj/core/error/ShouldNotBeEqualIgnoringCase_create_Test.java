/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2019 the original author or authors.
 */
package org.assertj.core.error;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.error.ShouldNotBeEqualIgnoringCase.shouldNotBeEqualIgnoringCase;

import org.assertj.core.internal.TestDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for
 * <code>{@link org.assertj.core.error.ShouldNotBeEqualIgnoringCase#create(org.assertj.core.description.Description, org.assertj.core.presentation.Representation)}</code>
 * .
 *
 * @author Alexander Bischof
 */
public class ShouldNotBeEqualIgnoringCase_create_Test {

  private ErrorMessageFactory factory;

  @BeforeEach
  public void setUp() {
    factory = shouldNotBeEqualIgnoringCase("Yoda", "Luke");
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TestDescription("Test"));
    assertThat(message).isEqualTo(format("[Test] %n" +
                                         "Expecting:%n" +
                                         "  <\"Yoda\">%n" +
                                         "not to be equal to:%n" +
                                         "  <\"Luke\">%n" +
                                         "ignoring case considerations"));
  }
}
