package com.james.jsolution_test_common;

import org.junit.Test;

import com.james.jsolution_framework_utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void GetUUID()
	{
        String guid=StringUtils.GetGUID();
        System.out.println(guid);
	}
	
	
}
