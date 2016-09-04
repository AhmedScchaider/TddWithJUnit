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
public class Matherator implements Adder, Subtractor, Multiplier, Divider, Power {

  @Override
  public long add(long... operands) {
    long ret = 0;
    for (long operand : operands) {
      ret += operand;
    }
    return ret;
  }

  @Override
  public long subtract(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret -= operands[aa];
    }
    return ret;
  }

  @Override
  public long multiply(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret *= operands[aa];
    }
    return ret;
  }

  @Override
  public long divide(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret /= operands[aa];
    }
    return ret;
  }

  @Override
  public long pow(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      long base = ret;
      long exponent = operands[aa];
      if (exponent < 0) {
        throw new IllegalArgumentException("Unfortunately, this method only accepts positive integer powers. Sorry.");
      }
      long result = 1;
      for (long bb = 0; bb < exponent; bb++) {
        result *= base;
      }
      ret = result;
    }
    return ret;
  }

}
