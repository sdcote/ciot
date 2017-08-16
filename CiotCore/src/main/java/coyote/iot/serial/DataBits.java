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
public enum DataBits {

  FIVE(5), SIX(6), SEVEN(7), EIGHT(8);

  private int dataBits = 0;




  private DataBits(int dataBits) {
    this.dataBits = dataBits;
  }




  public int getValue() {
    return this.dataBits;
  }




  public static DataBits getInstance(int data_bits) {
    for (DataBits db : DataBits.values()) {
      if (db.getValue() == data_bits) {
        return db;
      }
    }
    return null;
  }

}