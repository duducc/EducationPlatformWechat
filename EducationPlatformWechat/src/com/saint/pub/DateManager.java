package com.saint.pub;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ����ʱ���ۺϹ�����
 * 
 * @author sbh
 *         <p>
 *         Copyright: Copyright (c) 2006
 *         </p>
 *         <p>
 *         Company: saint
 *         </p>
 * @version 1.0
 */
public class DateManager {
	// ----------------------------------------(1)--------------------------------------------------//
	/**
	 * ȡ�ñ���ϵͳ��ʱ�䣬ʱ���ʽ�ɲ�������14:���룬12���֣�8����
	 * 
	 * @param format
	 *            ʱ���ʽ�ɳ������� �ο���̬��������
	 * @return String ����format��ʽ���ַ���
	 */
	public synchronized static String getTime(int format) {
		String csysTime = "";
		Calendar time = Calendar.getInstance();

		int miltime = time.get(Calendar.MILLISECOND);
		int second = time.get(Calendar.SECOND);
		int minute = time.get(Calendar.MINUTE);
		int hour = time.get(Calendar.HOUR_OF_DAY);
		int day = time.get(Calendar.DAY_OF_MONTH);
		int month = time.get(Calendar.MONTH) + 1;
		int year = time.get(Calendar.YEAR);
		switch (format) {
		case 15: {
			csysTime = year + "-" + getFormatTime(month, 2) + "-"
					+ getFormatTime(day, 2) + " " + getFormatTime(hour, 2)
					+ ":" + getFormatTime(minute, 2) + ":"
					+ getFormatTime(second, 2) + ":" + miltime;
		}
			break;
		case 14: {
			csysTime = year + "-" + getFormatTime(month, 2) + "-"
					+ getFormatTime(day, 2) + " " + getFormatTime(hour, 2)
					+ ":" + getFormatTime(minute, 2) + ":"
					+ getFormatTime(second, 2);
		}
			break;
		case 12: {
			csysTime = year + "-" + getFormatTime(month, 2) + "-"
					+ getFormatTime(day, 2) + " " + getFormatTime(hour, 2)
					+ ":" + getFormatTime(minute, 2);
		}
			break;
		case 8: {
			csysTime = year + "-" + getFormatTime(month, 2) + "-"
					+ getFormatTime(day, 2);
		}
		default:
			break;
		}
		return csysTime;
	}

	/**
	 * ��������λ���ַ���
	 * 
	 * @param time
	 *            Ҫת����ʽ��ʱ��
	 * @param format
	 *            ת���ĸ�ʽ
	 * @return String ת����ʱ��
	 */
	private synchronized static String getFormatTime(int time, int format) {
		StringBuffer numm = new StringBuffer();
		int length = String.valueOf(time).length();
		if (format < length)
			return null;
		for (int i = 0; i < format - length; i++) {
			numm.append("0");
		}
		numm.append(time);
		return numm.toString().trim();
	}

	/**
	 * ��Ҫ����ȡ�ñ���ϵͳ��ϵͳʱ�䲢������5�ָ�ʽ��ʾ 1. YYYY-MM-DD 8λ 2. YYMMDDHHmm 10λ 3.
	 * YYMMDDHHmmss 12λ 4. YYYY-MM-DD HH:mm:ss 14λ 5. YYMMDDHHmmssxxx 15λ
	 * (����xxx �Ǻ���)
	 */
	// public static final int YYMMDDhhmmssxxx=15;
	// public static final int YYYYMMDDhhmmss=14;
	// public static final int YYMMDDhhmmss=12;
	// public static final int YYMMDDhhmm=10;
	// public static final int YYYYMMDD=8;
	// ----------------------------------------(2)--------------------------------------------------//
	/**
	 * ����yyyy-MM-dd��ʽ��SimpleDateFormat����
	 * 
	 * @return
	 */
	private static SimpleDateFormat DateFormatYMD() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat;
	}

	/**
	 * ����yyyy-MM-dd HH:mm��ʽ��SimpleDateFormat����
	 * 
	 * @return
	 */
	private static SimpleDateFormat DateFormatYMDHM() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return dateFormat;
	}

	/**
	 * ����yyyy-MM-dd hh:mm:ss��ʽ��SimpleDateFormat����
	 * 
	 * @return
	 */
	private static SimpleDateFormat DateFormatYMDHMS() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		return dateFormat;
	}

	/**
	 * ���ط���yyyy-MM-dd��ʽ��Date����
	 * 
	 * @param sdate
	 * @return
	 * @throws ParseException
	 */
	public static Date getYMDdate(String sdate) {
		Date date = new Date();
		try {
			date = DateFormatYMD().parse(sdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date getYMDdate(Date sdate) {
		Date date = new Date();
		try {
			date = DateFormatYMD().parse(DateFormatYMD().format(sdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * ���ط���yyyy-MM-dd HH:mm��ʽ��Date����
	 * 
	 * @param sdate
	 * @return
	 * @throws ParseException
	 */
	public static Date getYMDHMdate(String sdate) {
		Date date = new Date();
		try {
			date = DateFormatYMDHM().parse(sdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date getYMDHMdate(Date sdate) {
		Date date = new Date();
		try {
			date = DateFormatYMDHM().parse(DateFormatYMDHM().format(sdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * ���ط���yyyy-MM-dd HH:mm:ss��ʽ��Date����
	 * 
	 * @param sdate
	 * @return
	 * @throws ParseException
	 */
	public static Date getYMDHMSdate(String sdate) {
		Date date = new Date();
		try {
			date = DateFormatYMDHMS().parse(sdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date getYMDHMSdate(Date sdate) {
		Date date = new Date();
		try {
			date = DateFormatYMDHMS().parse(DateFormatYMDHMS().format(sdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/*
	 * public static Date getSysDateYMDHMSdate() { return getYMDHMSdate(new
	 * DateManager().getSysdate()); }
	 */
	// ----------------------------------------(3)--------------------------------------------------//
	/**
	 * 
	 * ��������:getYMDHMtr <br>
	 * �����Ĺ�������:��ʽ"yyyy-MM-dd HH:mm"
	 * 
	 * @param sdate
	 * @return String ���ز�����|���ز���˵��
	 * @throws ˵����ĳ�����,������ʲô�쳣
	 * @see
	 * @author ������
	 */
	public static String getYMDHMtr(Date sdate) {
		if (sdate == null)
			return "";
		String dStr = DateFormatYMDHM().format(sdate);
		return dStr;
	}

	/**
	 * 
	 * ��������:getYMDHMStr <br>
	 * �����Ĺ�������:��ʽ"yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param sdate
	 * @return String ���ز�����|���ز���˵��
	 * @throws ˵����ĳ�����,������ʲô�쳣
	 * @see
	 * @author ������
	 */
	public static String getYMDHMStr(Date sdate) {
		if (sdate == null)
			return "";
		String dStr = DateFormatYMDHMS().format(sdate);
		return dStr;
	}

	/**
	 * 
	 * ��������:getYMDStr <br>
	 * �����Ĺ�������:��ʽ"yyyy-MM-dd"
	 * 
	 * @param sdate
	 * @return String ���ز�����|���ز���˵��
	 * @throws ˵����ĳ�����,������ʲô�쳣
	 * @see
	 * @author ������
	 */
	public static String getYMDStr(Date sdate) {
		if (sdate == null)
			return "";
		String dStr = DateFormatYMD().format(sdate);
		return dStr;
	}

	/**
	 * ��ʽ��һ�������ַ�������ʽΪyyyyMMdd
	 * 
	 * @param date
	 * @return java.lang.String
	 */
	public static String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}

	/**
	 * ��ʽ��һ�������ַ�������ʽΪyyyyMMddHHmmss
	 * @param date
	 * @return java.lang.String
	 */
	public static String formatDateLong(Date curTime) {
		if ((curTime == null) || (curTime.equals(""))) {
			return "";
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(curTime);
	}

	public static String formatDatex(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}

	public static String formatDatexx(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		return sdf.format(date);
	}

	public static String formatDatexxx(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		return sdf.format(date);
	}

	/** ********************************************DateUtil******************************************************* */

	/** ע�������������������ʱ�����ڲ�� */
	private static transient int gregorianCutoverYear = 1582;

	/** ������ÿ������ */
	private static final int[] DAYS_P_MONTH_LY = { 31, 29, 31, 30, 31, 30, 31,
			31, 30, 31, 30, 31 };

	/** ƽ����ÿ������ */
	private static final int[] DAYS_P_MONTH_CY = { 31, 28, 31, 30, 31, 30, 31,
			31, 30, 31, 30, 31 };

	/** ������������ꡢ�¡��� */
	private static final int Y = 0, M = 1, D = 2;

	/** ���������� */
	private int[] ymd = null;

	/**
	 * ��鴫��Ĳ����Ƿ�Ϸ�������
	 * 
	 * @param date
	 * @throws IllegalArgumentException
	 */
	public static void validate(String date) throws IllegalArgumentException {

		int[] ymd = splitYMD(date);

		if (ymd[M] == 0 || ymd[M] > 12) {
			throw new IllegalArgumentException("�·���ֵ����");
		}

		if (true == isLeapYear(ymd[0])) {
			if (ymd[D] == 0 || ymd[D] > DAYS_P_MONTH_LY[ymd[M] - 1]) {
				throw new IllegalArgumentException("������ֵ����");
			}
		} else {
			if (ymd[D] == 0 || ymd[D] > DAYS_P_MONTH_CY[ymd[M] - 1]) {
				throw new IllegalArgumentException("������ֵ����");
			}
		}
	}

	/**
	 * ��鴫��Ĳ������������Ƿ�Ϊ����
	 * 
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		return year >= gregorianCutoverYear ? ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
				: // Gregorian
				(year % 4 == 0); // Julian
	}

	/**
	 * ���ڼ�1�죬ע������û�п����������͸���������ʱ����10��
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	private int[] addOneDay(int year, int month, int day) {
		if (isLeapYear(year)) {
			day++;
			if (day > DAYS_P_MONTH_LY[month - 1]) {
				month++;
				if (month > 12) {
					year++;
					month = 1;
				}
				day = 1;
			}
		} else {
			day++;
			if (day > DAYS_P_MONTH_CY[month - 1]) {
				month++;
				if (month > 12) {
					year++;
					month = 1;
				}
				day = 1;
			}
		}
		int[] ymd = { year, month, day };
		return ymd;
	}

	/**
	 * ��ѭ���ķ�ʽ�������ڼӷ�
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public String addDaysByLoop(String date, int days) {
		validate(date);
		int[] ymd = splitYMD(date);
		for (int i = 0; i < days; i++) {
			ymd = addOneDay(ymd[Y], ymd[M], ymd[D]);
		}
		return formatYear(ymd[Y]) + formatMonthDay(ymd[M])
				+ formatMonthDay(ymd[D]);
	}

	/**
	 * ���ڼ�1�죬ע������û�п����������͸���������ʱ����10��
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	private int[] reduceOneDay(int year, int month, int day) {
		if (isLeapYear(year)) {
			day--;
			if (day <= 0) {
				month--;
				if (month < 1) {
					year--;
					month = 12;
				}
				day = DAYS_P_MONTH_LY[month - 1];
			}
		} else {
			day--;
			if (day <= 0) {
				month--;
				if (month < 1) {
					year--;
					month = 12;
				}
				day = DAYS_P_MONTH_CY[month - 1];
			}
		}
		int[] ymd = { year, month, day };
		return ymd;
	}

	/**
	 * ��ѭ���ķ�ʽ�������ڼ���
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public String reduceDaysByLoop(String date, int days) {
		validate(date);
		int[] ymd = splitYMD(date);
		for (int i = 0; i < days; i++) {
			ymd = reduceOneDay(ymd[Y], ymd[M], ymd[D]);
		}
		return formatYear(ymd[Y]) + formatMonthDay(ymd[M])
				+ formatMonthDay(ymd[D]);
	}

	/**
	 * ָ�����ڼ���ָ���������Ĳ���
	 * 
	 * @param date
	 * @param days
	 * @return
	 * @throws IllegalArgumentException
	 */
	public String addDays(Date date, int days) throws IllegalArgumentException {
		return addDays(formatDate(date), days);
	}

	/**
	 * 
	 * ��������:getDateAddDay() <br>
	 * �����Ĺ�������:ϵͳ��������nd�� ����SorL��ʾ��Ҫ����ʽ��̸�ʽ��ֵΪ"s"ʱ���ض̸�ʽ���ڣ���l�����س���ʽ����,Ĭ�Ϸ��ض̸�ʽ
	 * 
	 * @param nd
	 *            ����
	 * @param SorL
	 *            ���ڳ��̸�ʽ
	 * @return String ���������ַ���
	 * @author ������
	 */
	/*
	 * public static String getDateAddDay(int nd,String SorL) //ϵͳ��������nd��
	 * ����SorL��ʾ��Ҫ����ʽ��̸�ʽ��ֵΪ"s"ʱ���ض̸�ʽ���ڣ���l�����س���ʽ����,Ĭ�Ϸ��ض̸�ʽ { String endDate=new
	 * PubMethodDao().getSysdate(); GregorianCalendar GreCald=new
	 * GregorianCalendar(); SimpleDateFormat dateFormat=null; if(SorL!=null) {
	 * if(SorL.equals("s")) {dateFormat=new SimpleDateFormat("yyyy-MM-dd");}
	 * else if(SorL.equals("l")) {dateFormat=new SimpleDateFormat("yyyy-MM-dd
	 * HH:mm:ss");} else {dateFormat=new SimpleDateFormat("yyyy-MM-dd"); } }
	 * else {dateFormat=new SimpleDateFormat("yyyy-MM-dd");}
	 * 
	 * try { GreCald.setTime(dateFormat.parse(endDate));
	 * GreCald.add(Calendar.DAY_OF_MONTH,nd);
	 * GreCald.set(GreCald.get(Calendar.YEAR),GreCald.get(Calendar.MONTH),GreCald.get(Calendar.DATE),GreCald.get(Calendar.HOUR_OF_DAY),GreCald.get(Calendar.MINUTE),GreCald.get(Calendar.SECOND));
	 * endDate=dateFormat.format(GreCald.getTime()); return endDate; }
	 * catch(java.text.ParseException pe) { pe.printStackTrace(); return
	 * endDate; } catch(Exception e) { e.printStackTrace(); return endDate; } }
	 */
	/**
	 * ָ�����ڼ���ָ���������Ĳ���
	 * 
	 * @param date
	 * @param days
	 * @return
	 * @throws IllegalArgumentException
	 */
	public  String addDays(String date, int days)throws IllegalArgumentException {

		validate(date);
		ymd = splitYMD(date);

		if (isLeapYear(ymd[Y])) {
			ymd[D] += days;
			if (ymd[D] > DAYS_P_MONTH_LY[ymd[M] - 1]) {
				ymd[M]++;
				ymd[D] = ymd[D] - DAYS_P_MONTH_LY[ymd[M] - 1 - 1];
				if (ymd[M] > 12) {
					ymd[M] -= 12;
					ymd[Y]++;
				}
				if (ymd[D] > DAYS_P_MONTH_LY[ymd[M] - 1]) {
					addDays(formatYear(ymd[Y]) + formatMonthDay(ymd[M])
							+ formatMonthDay(DAYS_P_MONTH_LY[ymd[M] - 1]),
							ymd[D] - DAYS_P_MONTH_LY[ymd[M] - 1]);
				}
			}
		} else {
			ymd[D] += days;
			if (ymd[D] > DAYS_P_MONTH_CY[ymd[M] - 1]) {
				ymd[M]++;
				ymd[D] = ymd[D] - DAYS_P_MONTH_CY[ymd[M] - 1 - 1];
				if (ymd[M] > 12) {
					ymd[M] -= 12;
					ymd[Y]++;
				}
				if (ymd[D] > DAYS_P_MONTH_CY[ymd[M] - 1]) {
					addDays(formatYear(ymd[Y]) + formatMonthDay(ymd[M])
							+ formatMonthDay(DAYS_P_MONTH_CY[ymd[M] - 1]),
							ymd[D] - DAYS_P_MONTH_CY[ymd[M] - 1]);
				}
			}
		}
		return ResetDate(formatYear(ymd[Y]) + formatMonthDay(ymd[M])
				+ formatMonthDay(ymd[D]));
	}

	/**
	 * ָ�����ڼ�ȥָ���������Ĳ���
	 * 
	 * @param date
	 * @param days
	 * @return
	 * @throws IllegalArgumentException
	 */
	public String reduceDays(Date date, int days)
			throws IllegalArgumentException {
		return reduceDays(formatDate(date), days);
	}

	/**
	 * ָ�����ڼ�ȥָ���������Ĳ���
	 * 
	 * @param date
	 * @param days
	 * @return
	 * @throws IllegalArgumentException
	 */
	public String reduceDays(String date, int days)
			throws IllegalArgumentException {

		validate(date);
		ymd = splitYMD(date);

		if (isLeapYear(ymd[Y])) {
			ymd[D] -= days;
			if (ymd[D] <= 0) {
				ymd[M]--;
				if (ymd[M] < 1) {
					ymd[M] += 12;
					ymd[Y]--;
				}
				ymd[D] = ymd[D] + DAYS_P_MONTH_LY[ymd[M] - 1];
				if (ymd[D] <= 0) {
					reduceDays(formatYear(ymd[Y]) + formatMonthDay(ymd[M])
							+ formatMonthDay(1), abs(ymd[D] - 1));
				}
			}
		} else {
			ymd[D] -= days;
			if (ymd[D] <= 0) {
				ymd[M]--;
				if (ymd[M] < 1) {
					ymd[M] += 12;
					ymd[Y]--;
				}
				ymd[D] = ymd[D] + DAYS_P_MONTH_CY[ymd[M] - 1];
				if (ymd[D] <= 0) {
					reduceDays(formatYear(ymd[Y]) + formatMonthDay(ymd[M])
							+ formatMonthDay(1), abs(ymd[D] - 1));
				}
			}
		}
		return ResetDate(formatYear(ymd[Y]) + formatMonthDay(ymd[M])
				+ formatMonthDay(ymd[D]));
	}

	/**
	 * ���������ڵ��ַ����ָ�Ϊ���������յ���������
	 * 
	 * @param date
	 * @return
	 */
	public static int[] splitYMD(String date) {
		int[] ymd = { 0, 0, 0 };
		ymd[Y] = Integer.parseInt(date.substring(0, 4));
		ymd[M] = Integer.parseInt(date.substring(4, 6));
		ymd[D] = Integer.parseInt(date.substring(6, 8));
		return ymd;
	}

	/**
	 * ��������λ���·ݻ����ڲ���Ϊ��λ
	 * 
	 * @param decimal
	 * @return
	 */
	public static String formatMonthDay(int decimal) {
		DecimalFormat df = new DecimalFormat("00");
		return df.format(decimal);
	}

	/**
	 * ��������λ����ݲ���Ϊ��λ
	 * 
	 * @param decimal
	 * @return
	 */
	public static String formatYear(int decimal) {
		DecimalFormat df = new DecimalFormat("0000");
		return df.format(decimal);
	}

	/**
	 * ȡ����ֵ����
	 * 
	 * @param num
	 * @return
	 */
	public static int abs(int num) {
		return (num > 0) ? num : -num;
	}

	public static String ResetDate(String date) {
		if (date != null || !date.equals("")) {
			date = date.substring(0, 4) + "-" + date.substring(4, 6) + "-"
					+ date.substring(6, 8);
		}
		return date;
	}

	/**
	 * ���������������������
	 * 
	 * @param date1
	 * @param date2
	 * @return java.lang.int
	 */
	public static int BetweenTwoDate(Date date1, Date date2) {
		int a = 0;
		long diff = date2.getTime() - date1.getTime();
		a = (int) (diff / (1000 * 60 * 60 * 24));
		return a;
	}

	/**
	 * �������ڵĺϷ���
	 * 
	 * @param date
	 * @return
	 */
	public static boolean validateT(String date) {

		try {
			int[] ymd = splitYMD(date);

			if (ymd[M] == 0 || ymd[M] > 12) {
				return false;
			}

			if (true == isLeapYear(ymd[0])) {
				if (ymd[D] == 0 || ymd[D] > DAYS_P_MONTH_LY[ymd[M] - 1]) {
					return false;
				}
			} else {
				if (ymd[D] == 0 || ymd[D] > DAYS_P_MONTH_CY[ymd[M] - 1]) {
					return false;
				}
			}
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	/**
	 * 
	 * ��������:getDate() �����Ĺ�������:����һ�����ڣ�������Ҫ�����ꡢ�¡���������
	 * 
	 * @param dateStr���������ַ�����
	 * @param ymdArg������/��/�ܲ���(1:��;2:��;3:��)��
	 * @param addInt��������������
	 * @param SorL����SorL��ʾ��Ҫ����ʽ��̸�ʽ��ֵΪ"s"ʱ���ض̸�ʽ���ڣ�"l"���س���ʽ����,Ĭ�Ϸ��ض̸�ʽ
	 * @return String ���ز�����|���ز���˵��
	 * @throws ˵����ĳ�����,������ʲô�쳣
	 * @see
	 * @author �����
	 */
	public static String getDate(String dateStr, int ymdArg, int addInt,String SorL) {
		String endDate = dateStr;
		SimpleDateFormat dateFormat1;
		if (endDate.length() == 4)
			dateFormat1 = new SimpleDateFormat("yyyy");
		else if (endDate.length() == 7)
			dateFormat1 = new SimpleDateFormat("yyyy-MM");
		else if (endDate.length() == 8)
			dateFormat1 = new SimpleDateFormat("yyyyMMdd");
		else if (endDate.length() == 10)
			dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		else if (endDate.length() == 13)
			dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH");
		else if (endDate.length() == 16)
			dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		else if (endDate.length() == 19)
			dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		else
			dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");

		GregorianCalendar GreCald = new GregorianCalendar();
		SimpleDateFormat dateFormat = null;
		if (SorL != null) {
			if (SorL.equals("s") || SorL.equals("S")) {
				dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			} else if (SorL.equals("l") || SorL.equals("L")) {
				dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			} else {
				dateFormat = dateFormat1;
			}
		} else {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		}

		try {
			GreCald.setTime(dateFormat1.parse(endDate));
			if (ymdArg == 1 || ymdArg == 2) // ����Ϊ1��2ʱ��ʾ��������µ�������
				GreCald.add(ymdArg, addInt);
			else
				// �������ӻ�����յ�������
				GreCald.add(Calendar.DAY_OF_MONTH, addInt);
			GreCald
					.set(GreCald.get(Calendar.YEAR), GreCald
							.get(Calendar.MONTH), GreCald.get(Calendar.DATE),
							GreCald.get(Calendar.HOUR_OF_DAY), GreCald
									.get(Calendar.MINUTE), GreCald
									.get(Calendar.SECOND));
			endDate = dateFormat.format(GreCald.getTime());
			return endDate;
		} catch (java.text.ParseException pe) {
			pe.printStackTrace();
			return endDate;
		} catch (Exception e) {
			e.printStackTrace();
			return endDate;
		}
	}

	/**
	 * 
	 * ��������:getDate <br>
	 * �����Ĺ�������:��ȡ��ǰʱ��
	 * com.saint.viosys.serviceFactory.SysLoginFactory.checkLogin���ô˷���
	 * 
	 * @return String ���ص�ǰʱ��
	 * @see
	 * @author ������
	 */
	public static String getDate() {
		String gRtnStr = DateFormatYMDHM().format(new Date());
		return gRtnStr;
	}

	/**
	 * 
	 * ��������:getDate <br>
	 * �����Ĺ�������:��ȡ��ǰʱ��
	 * com.saint.viosys.serviceFactory.SysLoginFactory.checkLogin���ô˷���
	 * 
	 * @return String ���ص�ǰʱ��
	 * @see
	 * @author ������
	 */
	public static String getDateYMD() {
		String gRtnStr = DateFormatYMD().format(new Date());
		return gRtnStr;
	}

	/**
	 * 
	 * ��������:getSysdate <br>
	 * �����Ĺ�������:�õ�ϵͳ���ݿ������ ������getDateAddMonth���������˴˷���
	 * 
	 * @return String sysdate|�õ���ֵ
	 * @author ����
	 */
	/*
	 * public String getSysdate() { String sysdate = ""; sysdate = "select
	 * to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') sd from dual"; Session session
	 * =getSession(); try { Connection conn = session.connection(); Statement
	 * stmt = conn.createStatement(); ResultSet rst =
	 * stmt.executeQuery(sysdate); while (rst.next()) { sysdate =
	 * rst.getString(1); }
	 *  } catch (SQLException se) { se.printStackTrace(); sysdate= "9999-01-01
	 * 00:00:00"; } finally { closeSession(); } return sysdate; }
	 */
	/**
	 * ����������ڸ�ʽת��Ϊyyyy-mm-dd��ʽ ֧�֣�yyyyMMdd,yyyy/mm/dd,yyyy.mm.dd,yyyy-mm-dd
	 * �˴�û����֤������ַ����Ƿ�Ϊ��
	 * 
	 * @param date
	 * @return java.lang.String
	 */
	public static String FormatDateString(String date) {
		String[] str;
		int chleng = date.length();
		switch (chleng) {
		case 8:
			date = date.substring(0, 4) + "-" + date.substring(4, 6) + "-"
					+ date.substring(6, 8);
			break;
		case 10:
			if (date.indexOf("-") != -1) {
				str = date.split("-");
			} else if (date.indexOf("/") != -1) {
				str = date.split("/");

			} else if (date.indexOf(".") != -1) {
				str = date.split("\\.");
			} else {
				str = null;
			}
			if (str != null && str.length == 3) {
				date = str[0] + "-" + str[1] + "-" + str[2];
			} else {
				date = null;
			}
			break;
		default:
			date = null;
			;
		}
		return date;

	}

	/**
	 * 1�����鴫������ڵĺϷ���(ֻ֧�̸ֶ�ʽ) 2���������������Ƿ���ڵ��ڽ��� 3��δ��֤�����ֵ�Ƿ�Ϊ��
	 * 
	 * @param date
	 * @return java.lang.Boolean
	 */
	public static boolean EqlTwoDate(String date) {
		Date dx = null;
		date = FormatDateString(date);
		if (date != null) {
			dx = getYMDdate(date);
		}
		if (dx != null && validateT(formatDate(dx))) {
			if (BetweenTwoDate(new Date(), dx) > 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
	/*
	 * public static int getDayByMonth(String month) { SimpleDateFormat
	 * dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); int day=0;
	 * if(month!=null && !month.equals("")) { String temp =
	 * DateManager.getDate(new DateManager().getSysdate(), 2,
	 * Integer.parseInt(month), "L"); try { day =
	 * DateManager.BetweenTwoDate(dateformat.parse(new
	 * DateManager().getSysdate()),dateformat.parse(temp)); } catch
	 * (ParseException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } return day; }
	 */
	/**
	 * ��ȡ��ǰʱ��
	 * @return
	 */
	public static String getNowDate(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}
