package com.saint.wechat.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDCardUtil {
	
	 /*********************************** ���֤��֤��ʼ ****************************************/  
   /**  
    * ���֤������֤ 1������Ľṹ ������ݺ�������������룬��ʮ��λ���ֱ������һλУ������ɡ�����˳�������������Ϊ����λ���ֵ�ַ�룬  
    * ��λ���ֳ��������룬��λ����˳�����һλ����У���롣 2����ַ��(ǰ��λ����  
    * ��ʾ�������ס����������(�С��졢��)�������������룬��GB/T2260�Ĺ涨ִ�С� 3�����������루����λ��ʮ��λ��  
    * ��ʾ�������������ꡢ�¡��գ���GB/T7408�Ĺ涨ִ�У��ꡢ�¡��մ���֮�䲻�÷ָ����� 4��˳���루��ʮ��λ��ʮ��λ��  
    * ��ʾ��ͬһ��ַ������ʶ������Χ�ڣ���ͬ�ꡢͬ�¡�ͬ�ճ������˱ඨ��˳��ţ� ˳�����������������ԣ�ż�������Ů�ԡ� 5��У���루��ʮ��λ����  
    * ��1��ʮ��λ���ֱ������Ȩ��͹�ʽ S = Sum(Ai * Wi), i = 0, ... , 16 ���ȶ�ǰ17λ���ֵ�Ȩ���  
    * Ai:��ʾ��iλ���ϵ����֤��������ֵ Wi:��ʾ��iλ���ϵļ�Ȩ���� Wi: 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2   
    * ��2������ģ Y = mod(S, 11) ��3��ͨ��ģ�õ���Ӧ��У���� Y: 0 1 2 3 4 5 6 7 8 9 10 У����: 1 0 X 9 8 7 6 5 4 3 2  
    */  
 
   /**  
    * ���ܣ����֤����Ч��֤  
    *   
    * @param IDStr  
    *            ���֤��  
    * @return ��Ч������"" ��Ч������String��Ϣ  
    * @throws ParseException  
    */  
   @SuppressWarnings("unchecked")  
   public static boolean IDCardValidate(String IDStr) throws ParseException {  
       //String errorInfo = "";// ��¼������Ϣ  
       String[] ValCodeArr = { "1", "0", "x", "9", "8", "7", "6", "5", "4",  
               "3", "2" };  
       String[] Wi = { "7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7",  
               "9", "10", "5", "8", "4", "2" };  
       String Ai = "";  
       // ================ ����ĳ��� 15λ��18λ ================  
       if (IDStr.length() != 15 && IDStr.length() != 18) {  
         //  errorInfo = "���֤���볤��Ӧ��Ϊ15λ��18λ��";  
           return false;  
       }  
       // =======================(end)========================  
 
       if(IDStr.length() == 15){
       	IDStr = conver15CardTo18(IDStr);
       }
       
       // ================ ���� �������Ϊ��Ϊ���� ================  
       Ai = IDStr.substring(0, 17); 
       /*if (IDStr.length() == 18) {  
           Ai = IDStr.substring(0, 17);  
       } else if (IDStr.length() == 15) {  
           Ai = IDStr.substring(0, 6) + "19" + IDStr.substring(6, 15);  
       } */ 
       if (isNumeric(Ai) == false) {  
           //errorInfo = "���֤15λ���붼ӦΪ���� ; 18λ��������һλ�⣬��ӦΪ���֡�";  
           return false;  
       }  
       // =======================(end)========================  
 
       // ================ ���������Ƿ���Ч ================  
       String strYear = Ai.substring(6, 10);// ���  
       String strMonth = Ai.substring(10, 12);// �·�  
       String strDay = Ai.substring(12, 14);// �·�  
       if (isDate(strYear + "-" + strMonth + "-" + strDay) == false) {  
          // errorInfo = "���֤������Ч��";  
           return false;  
       }  
       GregorianCalendar gc = new GregorianCalendar();  
       SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");  
       try {  
           if ((gc.get(Calendar.YEAR) - Integer.parseInt(strYear)) > 150  
                   || (gc.getTime().getTime() - s.parse(  
                           strYear + "-" + strMonth + "-" + strDay).getTime()) < 0) {  
              // errorInfo = "���֤���ղ�����Ч��Χ��";  
               return false;  
           }  
       } catch (NumberFormatException e) {  
           e.printStackTrace(); 
           return false;
       } catch (java.text.ParseException e) {  
           e.printStackTrace();  
           return false;
       }  
       if (Integer.parseInt(strMonth) > 12 || Integer.parseInt(strMonth) == 0) {  
           //errorInfo = "���֤�·���Ч";  
           return false;  
       }  
       if (Integer.parseInt(strDay) > 31 || Integer.parseInt(strDay) == 0) {  
          // errorInfo = "���֤������Ч";  
           return false;  
       }  
       // =====================(end)=====================  
 
       // ================ ������ʱ����Ч ================  
       Hashtable h = GetAreaCode();  
       if (h.get(Ai.substring(0, 2)) == null) {  
          // errorInfo = "���֤�����������";  
           return false;  
       }  
       // ==============================================  
 
       // ================ �ж����һλ��ֵ ================  
       int TotalmulAiWi = 0;  
       for (int i = 0; i < 17; i++) {  
           TotalmulAiWi = TotalmulAiWi  
                   + Integer.parseInt(String.valueOf(Ai.charAt(i)))  
                   * Integer.parseInt(Wi[i]);  
       }  
       int modValue = TotalmulAiWi % 11;  
       
       String strVerifyCode = ValCodeArr[modValue];  
       
       Ai = Ai + strVerifyCode;  
 
       if (IDStr.length() == 18) {  
           if (Ai.equalsIgnoreCase(IDStr) == false) {  
              // errorInfo = "���֤��Ч�����ǺϷ������֤����";  
               return false;  
           }  
       } else {  
           return true;  
       }  
       
       // =====================(end)=====================  
       return true;  
   }  
 
   /** �й��������֤������С���ȡ� */  
   public static final int CHINA_ID_MIN_LENGTH = 15;
   
   /** 
    * ������֤ 
    *  
    * @param val 
    * @return ��ȡ�����֡� 
    */  
   public static boolean isNum(String val) {  
       return val == null || "".equals(val) ? false : val  
               .matches("^[0-9]*{1}");  
   }  
   
   public static String conver15CardTo18(String idCard) {  
       String idCard18 = "";  
       if (idCard.length() != CHINA_ID_MIN_LENGTH) {  
           return null;  
       }  
       if (isNum(idCard)) {  
           // ��ȡ����������  
           String birthday = idCard.substring(6, 12);  
           Date birthDate = null;  
           try {  
               birthDate = new SimpleDateFormat("yyMMdd").parse(birthday);  
           } catch (ParseException e) {  
               e.printStackTrace();  
           }  
           Calendar cal = Calendar.getInstance();  
           if (birthDate != null)  
               cal.setTime(birthDate);  
           // ��ȡ������(��ȫ������ʽ,�磺2010)  
           String sYear = String.valueOf(cal.get(Calendar.YEAR));  
           idCard18 = idCard.substring(0, 6) + sYear + idCard.substring(8);  
           // ת���ַ�����  
           char[] cArr = idCard18.toCharArray();  
           if (cArr != null) {  
               int[] iCard = converCharToInt(cArr);  
               int iSum17 = getPowerSum(iCard);  
               // ��ȡУ��λ  
               String sVal = getCheckCode18(iSum17);  
               if (sVal.length() > 0) {  
                   idCard18 += sVal;  
               } else {  
                   return null;  
               }  
           }  
       } else {  
           return null;  
       }  
       return idCard18;  
   }  
   
   /** 
    * ���ַ�����ת������������ 
    *  
    * @param ca 
    *            �ַ����� 
    * @return �������� 
    */  
   public static int[] converCharToInt(char[] ca) {  
       int len = ca.length;  
       int[] iArr = new int[len];  
       try {  
           for (int i = 0; i < len; i++) {  
               iArr[i] = Integer.parseInt(String.valueOf(ca[i]));  
           }  
       } catch (NumberFormatException e) {  
           e.printStackTrace();  
       }  
       return iArr;  
   }  
   
   /** ÿλ��Ȩ���� */  
   public static final int power[] = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9,  
           10, 5, 8, 4, 2 }; 
 
   /** 
    * �����֤��ÿλ�Ͷ�Ӧλ�ļ�Ȩ�������֮���ٵõ���ֵ 
    *  
    * @param iArr 
    * @return ���֤���롣 
    */  
   public static int getPowerSum(int[] iArr) {  
       int iSum = 0;  
       if (power.length == iArr.length) {  
           for (int i = 0; i < iArr.length; i++) {  
               for (int j = 0; j < power.length; j++) {  
                   if (i == j) {  
                       iSum = iSum + iArr[i] * power[j];  
                   }  
               }  
           }  
       }  
       return iSum;  
   }  
   
   /** 
    * ��power��ֵ��11ȡģ�����������У�����ж� 
    *  
    * @param iSum 
    * @return У��λ 
    */  
   public static String getCheckCode18(int iSum) {  
       String sCode = "";  
       switch (iSum % 11) {  
       case 10:  
           sCode = "2";  
           break;  
       case 9:  
           sCode = "3";  
           break;  
       case 8:  
           sCode = "4";  
           break;  
       case 7:  
           sCode = "5";  
           break;  
       case 6:  
           sCode = "6";  
           break;  
       case 5:  
           sCode = "7";  
           break;  
       case 4:  
           sCode = "8";  
           break;  
       case 3:  
           sCode = "9";  
           break;  
       case 2:  
           sCode = "x";  
           break;  
       case 1:  
           sCode = "0";  
           break;  
       case 0:  
           sCode = "1";  
           break;  
       }  
       return sCode;  
   }  
   
   /** 
    * ������ݱ�Ż�ȡ�Ա� 
    *  
    * @param idCard 
    *            ��ݱ�� 
    * @return �Ա�(M-�У�F-Ů��N-δ֪) 
    */  
   public static String getGenderByIdCard(String idCard) {  
       String sGender = "1";  
       if (idCard.length() == CHINA_ID_MIN_LENGTH) {  
           idCard = conver15CardTo18(idCard);  
       }  
       String sCardNum = idCard.substring(16, 17);  
       if (Integer.parseInt(sCardNum) % 2 != 0) {  
           sGender = "1";  
       } else {  
           sGender = "2";  
       }  
       return sGender;  
   } 
   
   
   /** 
    * ������ݱ�Ż�ȡ��������
    *  
    * @param idCard 
    *            ��ݱ�� 
    * @return �Ա�(M-�У�F-Ů��N-δ֪) 
    */  
   public static String getBirthdayByIdCard(String idCard) {  
       if (idCard.length() == CHINA_ID_MIN_LENGTH) {  
           idCard = conver15CardTo18(idCard);  
       }  
       String strYear = idCard.substring(6, 10);// ���  
       String strMonth = idCard.substring(10, 12);// �·�  
       String strDay = idCard.substring(12, 14);// �·�  
       
       return strYear+"-"+strMonth+"-"+strDay;  
   }  
   
   /**  
    * ���ܣ����õ�������  
    *   
    * @return Hashtable ����  
    */  
   @SuppressWarnings("unchecked")  
   private static Hashtable GetAreaCode() {  
       Hashtable hashtable = new Hashtable();  
       hashtable.put("11", "����");  
       hashtable.put("12", "���");  
       hashtable.put("13", "�ӱ�");  
       hashtable.put("14", "ɽ��");  
       hashtable.put("15", "���ɹ�");  
       hashtable.put("21", "����");  
       hashtable.put("22", "����");  
       hashtable.put("23", "������");  
       hashtable.put("31", "�Ϻ�");  
       hashtable.put("32", "����");  
       hashtable.put("33", "�㽭");  
       hashtable.put("34", "����");  
       hashtable.put("35", "����");  
       hashtable.put("36", "����");  
       hashtable.put("37", "ɽ��");  
       hashtable.put("41", "����");  
       hashtable.put("42", "����");  
       hashtable.put("43", "����");  
       hashtable.put("44", "�㶫");  
       hashtable.put("45", "����");  
       hashtable.put("46", "����");  
       hashtable.put("50", "����");  
       hashtable.put("51", "�Ĵ�");  
       hashtable.put("52", "����");  
       hashtable.put("53", "����");  
       hashtable.put("54", "����");  
       hashtable.put("61", "����");  
       hashtable.put("62", "����");  
       hashtable.put("63", "�ຣ");  
       hashtable.put("64", "����");  
       hashtable.put("65", "�½�");  
       hashtable.put("71", "̨��");  
       hashtable.put("81", "���");  
       hashtable.put("82", "����");  
       hashtable.put("91", "����");  
       return hashtable;  
   }  
 
   /**  
    * ���ܣ��ж��ַ����Ƿ�Ϊ����  
    *   
    * @param str  
    * @return  
    */  
   private static boolean isNumeric(String str) {  
       Pattern pattern = Pattern.compile("[0-9]*");  
       Matcher isNum = pattern.matcher(str);  
       if (isNum.matches()) {  
           return true;  
       } else {  
           return false;  
       }  
   }  
 
   /**  
    * ���ܣ��ж��ַ����Ƿ�Ϊ���ڸ�ʽ  
    *   
    * @param str  
    * @return  
    */  
   public static boolean isDate(String strDate) {  
       Pattern pattern = Pattern  
               .compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");  
       Matcher m = pattern.matcher(strDate);  
       if (m.matches()) {  
           return true;  
       } else {  
           return false;  
       }  
   }  
   /** 
    * ������ݱ�Ż�ȡ���� 
    *  
    * @param idCard 
    *            ��ݱ�� 
    * @return ���� 
    */  
   public static int getAgeByIdCard(String idCard) {  
       int iAge = 0;  
       if (idCard.length() == CHINA_ID_MIN_LENGTH) {  
           idCard = conver15CardTo18(idCard);  
       }  
       String year = idCard.substring(6, 10);  
       Calendar cal = Calendar.getInstance();  
       int iCurrYear = cal.get(Calendar.YEAR);  
       iAge = iCurrYear - Integer.valueOf(year);  
       return iAge;  
   }  
 
   /**  
    * @param args  
    * @throws ParseException  
    */  
   public static void main(String[] args) throws ParseException {  
       String IDCardNum = "62210119730806271X"; 
       System.out.println( IDCardUtil.IDCardValidate(IDCardNum) );
       // System.out.println(cc.isDate("1996-02-29"));  
   }  
}
