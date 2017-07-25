/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 *
 * Contributors:
 *   Stephan D. Cote 
 *      - Initial concept and implementation
 */
package coyote.iot.serial;

/**
 * 
 */
public enum Parity {
  NONE( 0), ODD( 1), EVEN( 2), MARK( 3), SPACE( 4);

  private int index = 0;




  private Parity( int index ) {
    this.index = index;
  }




  public int getIndex() {
    return this.index;
  }




  public static Parity getInstance( String parity ) {
    return Parity.valueOf( parity.toUpperCase() );
  }

}