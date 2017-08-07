/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

/**
 * 
 */
public enum StopBits {
  ONE(1), TWO(2);

  private int stopBits = 0;




  private StopBits(int stopBits) {
    this.stopBits = stopBits;
  }




  public int getValue() {
    return this.stopBits;
  }




  public static StopBits getInstance(int stop_bits) {
    for (StopBits sb : StopBits.values()) {
      if (sb.getValue() == stop_bits) {
        return sb;
      }
    }
    return null;
  }
}