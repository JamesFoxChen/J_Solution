package com.james.jsolution_dataaccess_dao;
import com.james.jsolution_framework_utils.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String guid=StringUtils.GetGUID();
        System.out.println(guid);
    }
}
