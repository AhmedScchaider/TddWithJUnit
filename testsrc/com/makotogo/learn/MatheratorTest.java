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
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class MatheratorTest {

  private Matherator classUnderTest;

  @Before
  public void setUp() throws Exception {
    classUnderTest = new Matherator();
  }

  @Test
  public void testAdd() {
    // Let Java add it up
    long result = 10 + 23 + (-1) + 16;
    // Compare that to what the Matherator gives us
    assertEquals(result, classUnderTest.add(10, 23, -1, 16));

    result = 100 + 102;
    assertEquals(result, classUnderTest.add(100 + 102));

    result = 0;
    assertEquals(result, classUnderTest.add(0));

  }

  @Test
  public void testSubtract() {
    long result = 100 - 34 - (-17) - 4;

    assertEquals(result, classUnderTest.subtract(100, 34, -17, 4));

    result = 0;

    assertEquals(result, classUnderTest.subtract(0, 0, 0, 0));
  }

  @Test
  public void testMultiply() {
    long result = 100 * 34 * -17 * 4;

    assertEquals(result, classUnderTest.multiply(100, 34, -17, 4));

    result = 0;
    assertEquals(result, classUnderTest.multiply(0));
  }

  @Test
  public void testDivide() {
    long result = 100 / 3 / 2;

    assertEquals(result, classUnderTest.divide(100, 3, 2));

    result = 0;
    assertEquals(result, classUnderTest.divide(0, 1));

    result = -17;
    assertEquals(result, classUnderTest.divide(-17, 1));

  }

  @Test
  public void testPower() {
    long result = Double.valueOf(Math.pow(12.0, 3.0)).longValue();

    assertEquals(result, classUnderTest.pow(12, 3));

    result = Double.valueOf(Math.pow(Math.pow(12.0, 3.0), 4.0)).longValue();
    assertEquals(result, classUnderTest.pow(12, 3, 4));

    result = Double.valueOf(Math.pow(Math.pow(12.0, -3.0), 4.0)).longValue();
    try {
      classUnderTest.pow(12, -3, 4);
      fail("Expected this to throw IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // This is what we expect
    }
  }

}
