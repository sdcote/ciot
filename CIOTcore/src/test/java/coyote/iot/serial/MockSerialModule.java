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

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import java.util.Map;

import coyote.commons.StringUtil;
import coyote.loader.log.Log;


/**
 * This module is used to return various SerialPort implementations for 
 * specific tests. 
 * 
 * <p>The name of the port is used to select which SerialPort implementation to return.
 */
public class MockSerialModule implements SerialModule {

  static final String COM1 = "COM1";

  private static final Map<String, Class<?>> portMap = new Hashtable<String, Class<?>>();

  static {
    portMap.put( COM1, MockCommPort.class );
  }




  @Override
  public SerialPort open( SerialConfig cfg ) {
    SerialPort retval = null;

    if ( StringUtil.isNotBlank( cfg.getPortName() ) ) {
      if ( portMap.containsKey( cfg.getPortName() ) ) {
        Class<?> clazz = portMap.get( cfg.getPortName() );
        try {
          Constructor<?> ctor = clazz.getConstructor();
          Object object = ctor.newInstance();

          if ( cfg != null ) {
            if ( object instanceof SerialPort ) {
              retval = (SerialPort)object ;
              try {
                retval.configure( cfg );
              } catch ( Exception e ) {
                Log.error( "Could not configure mock serial port " + cfg.getPortName() + " - " + e.getMessage() );
              }
            } else {
              Log.error( "Mock serial port class " + clazz.getName() + " does not implement SerialPort interface" );
            }
          }
        } catch ( Exception e ) {
          e.printStackTrace();
        }
      }
    }
    return retval;
  }




  @Override
  public String[] getPortNames() {
    return new String[0];
  }

}
