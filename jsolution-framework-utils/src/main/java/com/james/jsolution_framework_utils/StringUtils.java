package com.james.jsolution_framework_utils;

import java.util.UUID;

public class StringUtils {

	  public static String GetGUID()
      {
		  UUID uuid = UUID.randomUUID();   
		  return uuid.toString();
      }
}
