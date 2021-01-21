package com.saint.wechat.utils;

public class oConvertUtils {
    public static boolean isEmpty(Object object) {
        if (object == null) {
            return (true);
        }
        if (object.equals("")) {
            return (true);
        }
        if (object.equals("null")) {
            return (true);
        }
        return (false);
    }
    
    public static boolean isNotEmpty(Object object) {
        if (object != null && !object.equals("") && !object.equals("null")) {
            return (true);
        }
        return (false);
    }

    public static String decode(String strIn, String sourceCode, String targetCode) {
        String temp = code2code(strIn, sourceCode, targetCode);
        return temp;
    }

    private static String code2code(String strIn, String sourceCode,
			String targetCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String StrToUTF(String strIn, String sourceCode, String targetCode) {
        strIn = "";
        try {
            strIn = new String(strIn.getBytes("ISO-8859-1"), "GBK");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strIn;

    }
}
