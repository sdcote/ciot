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

/****
 * 
 */
public class SerialConfig {

  private String device = "COM1";
  private Baud baud = Baud.b9600;
  private DataBits dataBits = DataBits.EIGHT;
  private Parity parity = Parity.NONE;
  private StopBits stopBits = StopBits.ONE;
  private FlowControl flowControl = FlowControl.NONE;




  public SerialConfig() {}




  /**
   *  The device address of the serial port to access.
   */
  public String getDevice() {
    return device;
  }




  /**
   *  The device address of the serial port to access.
   */
  public SerialConfig setDevice( String device ) {
    this.device = device;
    return this;
  }




  /**
   * The baud rate to use with the serial port.
   */
  public Baud getBaud() {
    return baud;
  }




  /**
   * The baud rate to use with the serial port.
   */
  public SerialConfig setBaud( Baud baud ) {
    this.baud = baud;
    return this;
  }




  /**
   * The data bits to use for serial communication. (5,6,7,8)
   */
  public DataBits getDataBits() {
    return dataBits;
  }




  /**
   * The data bits to use for serial communication. (5,6,7,8)
   */
  public SerialConfig setDataBits( DataBits dataBits ) {
    this.dataBits = dataBits;
    return this;
  }




  /**
   * The parity setting to use for serial communication. (None, Event, Odd, Mark, Space)
   */
  public Parity getParity() {
    return parity;
  }




  /**
   * The parity setting to use for serial communication. (None, Event, Odd, Mark, Space)
   */
  public SerialConfig setParity( Parity parity ) {
    this.parity = parity;
    return this;
  }




  /**
   * The stop bits to use for serial communication. (1,2)
   */
  public StopBits getStopBits() {
    return stopBits;
  }




  /**
   * The stop bits to use for serial communication. (1,2)
   */
  public SerialConfig setStopBits( StopBits stopBits ) {
    this.stopBits = stopBits;
    return this;
  }




  /**
   * The flow control option to use for serial communication. (none, hardware, software)
   */
  public FlowControl getFlowControl() {
    return flowControl;
  }




  /**
   * The flow control option to use for serial communication. (none, hardware, software)
   */
  public SerialConfig setFlowControl( FlowControl flowControl ) {
    this.flowControl = flowControl;
    return this;
  }




  @Override
  public String toString() {
    return getDevice() + " (" + getBaud().getValue() + "," + getDataBits().getValue() + getParity().toString().substring( 0, 1 ) + getStopBits().getValue() + ") [" + "FC:" + getFlowControl().toString() + "]";
  }

}