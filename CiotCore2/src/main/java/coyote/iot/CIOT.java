/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot;

import coyote.commons.Version;
import coyote.loader.log.LogMsg.BundleBaseName;


/**
 * 
 */
public class CIOT {
  public static final Version VERSION = new Version(0, 1, 1, Version.EXPERIMENTAL);
  public static final String NAME = "CIOT";

  public static final BundleBaseName MSG;
  static {
    MSG = new BundleBaseName("CiotMsg");
  }

}
