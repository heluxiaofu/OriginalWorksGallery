package com.spring.util;

import java.io.UnsupportedEncodingException;

public class CharacterEncoderUtil {
	
	/**
	 * @function	change the character encoder ways of the passed string
	 * @param 		str		the target string
	 * @return		String	the result of this translation operation
	 */
	public static String translateEncode(String str) {  
        try {  
            return new String(str.getBytes("ISO-8859-1"), "UTF-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
}
