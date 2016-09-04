package com.makotogo.learn;

/*
 * Copyright 2016 Makoto Consulting Group, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdderTest {

  private Matherator classUnderTest;

  @Before
  public void setUp() throws Exception {
    classUnderTest = new Matherator();
  }

  @Test
  public void testAdd() {
    assertEquals(4, classUnderTest.add(1, 3));

    assertEquals(10, classUnderTest.add(2, 5, 3));
  }

}
