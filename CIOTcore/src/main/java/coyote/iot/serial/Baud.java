/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

public enum Baud {

  b50(50), b75(75), b110(110), b134(134), b150(150), b200(200), b300(300), b600(600), b1200(1200), bb1800(1800), b2400(2400), b4800(4800), b9600(9600), b19200(19200), b38400(38400), b57600(57600), b115200(115200), b230400(230400);

  private int baud = 0;




  private Baud(int baud) {
    this.baud = baud;
  }




  public int getValue() {
    return this.baud;
  }




  public static Baud getInstance(int baud_rate) {
    for (Baud b : Baud.values()) {
      if (b.getValue() == baud_rate) {
        return b;
      }
    }
    return null;
  }
}