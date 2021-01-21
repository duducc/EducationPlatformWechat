package com.saint.pub;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期时间综合管理类
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
	 * 取得本地系统的时间，时间格式由参数决定14:到秒，12到分，8到天
	 * 
	 * @param format
	 *            时间格式由常量决定 参看静态常量定义
	 * @return String 具有format格式的字符串
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
	 * 产生任意位的字符串
	 * 
	 * @param time
	 *            要转换格式的时间
	 * @param format
	 *            转换的格式
	 * @return String 转换的时间
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
	 * 主要用来取得本地系统的系统时间并用下面5种格式显示 1. YYYY-MM-DD 8位 2. YYMMDDHHmm 10位 3.
	 * YYMMDDHHmmss 12位 4. YYYY-MM-DD HH:mm:ss 14位 5. YYMMDDHHmmssxxx 15位
	 * (最后的xxx 是毫秒)
	 */
	// public static final int YYMMDDhhmmssxxx=15;
	// public static final int YYYYMMDDhhmmss=14;
	// public static final int YYMMDDhhmmss=12;
	// public static final int YYMMDDhhmm=10;
	// public static final int YYYYMMDD=8;
	// ----------------------------------------(2)--------------------------------------------------//
	/**
	 * 返回yyyy-MM-dd格式的SimpleDateFormat对象
	 * 
	 * @return
	 */
	private static SimpleDateFormat DateFormatYMD() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat;
	}

	/**
	 * 返回yyyy-MM-dd HH:mm格式的SimpleDateFormat对象
	 * 
	 * @return
	 */
	private static SimpleDateFormat DateFormatYMDHM() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return dateFormat;
	}

	/**
	 * 返回yyyy-MM-dd hh:mm:ss格式的SimpleDateFormat对象
	 * 
	 * @return
	 */
	private static SimpleDateFormat DateFormatYMDHMS() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		return dateFormat;
	}

	/**
	 * 返回返回yyyy-MM-dd格式的Date对象
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
	 * 返回返回yyyy-MM-dd HH:mm格式的Date对象
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
	 * 返回返回yyyy-MM-dd HH:mm:ss格式的Date对象
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
	 * 方法名称:getYMDHMtr <br>
	 * 方法的功能描述:格式"yyyy-MM-dd HH:mm"
	 * 
	 * @param sdate
	 * @return String 返回参数名|返回参数说明
	 * @throws 说明在某情况下,将发生什么异常
	 * @see
	 * @author 孙卫民
	 */
	public static String getYMDHMtr(Date sdate) {
		if (sdate == null)
			return "";
		String dStr = DateFormatYMDHM().format(sdate);
		return dStr;
	}

	/**
	 * 
	 * 方法名称:getYMDHMStr <br>
	 * 方法的功能描述:格式"yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param sdate
	 * @return String 返回参数名|返回参数说明
	 * @throws 说明在某情况下,将发生什么异常
	 * @see
	 * @author 孙卫民
	 */
	public static String getYMDHMStr(Date sdate) {
		if (sdate == null)
			return "";
		String dStr = DateFormatYMDHMS().format(sdate);
		return dStr;
	}

	/**
	 * 
	 * 方法名称:getYMDStr <br>
	 * 方法的功能描述:格式"yyyy-MM-dd"
	 * 
	 * @param sdate
	 * @return String 返回参数名|返回参数说明
	 * @throws 说明在某情况下,将发生什么异常
	 * @see
	 * @author 孙卫民
	 */
	public static String getYMDStr(Date sdate) {
		if (sdate == null)
			return "";
		String dStr = DateFormatYMD().format(sdate);
		return dStr;
	}

	/**
	 * 格式化一个日期字符串，格式为yyyyMMdd
	 * 
	 * @param date
	 * @return java.lang.String
	 */
	public static String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}

	/**
	 * 格式化一个日期字符串，格式为yyyyMMddHHmmss
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

	/** 注意格里历和儒略历交接时的日期差别 */
	private static transient int gregorianCutoverYear = 1582;

	/** 闰年中每月天数 */
	private static final int[] DAYS_P_MONTH_LY = { 31, 29, 31, 30, 31, 30, 31,
			31, 30, 31, 30, 31 };

	/** 平年中每月天数 */
	private static final int[] DAYS_P_MONTH_CY = { 31, 28, 31, 30, 31, 30, 31,
			31, 30, 31, 30, 31 };

	/** 代表数组里的年、月、日 */
	private static final int Y = 0, M = 1, D = 2;

	/** 参与运算用 */
	private int[] ymd = null;

	/**
	 * 检查传入的参数是否合法的日期
	 * 
	 * @param date
	 * @throws IllegalArgumentException
	 */
	public static void validate(String date) throws IllegalArgumentException {

		int[] ymd = splitYMD(date);

		if (ymd[M] == 0 || ymd[M] > 12) {
			throw new IllegalArgumentException("月份数值错误");
		}

		if (true == isLeapYear(ymd[0])) {
			if (ymd[D] == 0 || ymd[D] > DAYS_P_MONTH_LY[ymd[M] - 1]) {
				throw new IllegalArgumentException("日期数值错误");
			}
		} else {
			if (ymd[D] == 0 || ymd[D] > DAYS_P_MONTH_CY[ymd[M] - 1]) {
				throw new IllegalArgumentException("日期数值错误");
			}
		}
	}

	/**
	 * 检查传入的参数代表的年份是否为闰年
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
	 * 日期加1天，注意这里没有考虑儒略历和格里历交接时相差的10天
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
	 * 以循环的方式计算日期加法
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
	 * 日期减1天，注意这里没有考虑儒略历和格里历交接时相差的10天
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
	 * 以循环的方式计算日期减法
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
	 * 指定日期加上指定的天数的操作
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
	 * 方法名称:getDateAddDay() <br>
	 * 方法的功能描述:系统日期增加nd天 参数SorL表示需要长格式或短格式，值为"s"时返回短格式日期，“l”返回长格式日期,默认返回短格式
	 * 
	 * @param nd
	 *            天数
	 * @param SorL
	 *            日期长短格式
	 * @return String 返回日期字符串
	 * @author 李享亮
	 */
	/*
	 * public static String getDateAddDay(int nd,String SorL) //系统日期增加nd天
	 * 参数SorL表示需要长格式或短格式，值为"s"时返回短格式日期，“l”返回长格式日期,默认返回短格式 { String endDate=new
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
	 * 指定日期加上指定的天数的操作
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
	 * 指定日期减去指定的天数的操作
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
	 * 指定日期减去指定的天数的操作
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
	 * 将代表日期的字符串分割为代表年月日的整形数组
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
	 * 将不足两位的月份或日期补足为两位
	 * 
	 * @param decimal
	 * @return
	 */
	public static String formatMonthDay(int decimal) {
		DecimalFormat df = new DecimalFormat("00");
		return df.format(decimal);
	}

	/**
	 * 将不足四位的年份补足为四位
	 * 
	 * @param decimal
	 * @return
	 */
	public static String formatYear(int decimal) {
		DecimalFormat df = new DecimalFormat("0000");
		return df.format(decimal);
	}

	/**
	 * 取绝对值操作
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
	 * 返回两个日期相减的整数
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
	 * 检验日期的合法性
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
	 * 方法名称:getDate() 方法的功能描述:给定一个日期，根据需要增加年、月、日日期量
	 * 
	 * @param dateStr——日期字符串；
	 * @param ymdArg——年/月/周参数(1:年;2:月;3:日)；
	 * @param addInt——增加日期量
	 * @param SorL参数SorL表示需要长格式或短格式，值为"s"时返回短格式日期，"l"返回长格式日期,默认返回短格式
	 * @return String 返回参数名|返回参数说明
	 * @throws 说明在某情况下,将发生什么异常
	 * @see
	 * @author 李亨亮
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
			if (ymdArg == 1 || ymdArg == 2) // 参数为1或2时表示增加年或月的日期量
				GreCald.add(ymdArg, addInt);
			else
				// 否则增加或减少日的日期量
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
	 * 方法名称:getDate <br>
	 * 方法的功能描述:获取当前时间
	 * com.saint.viosys.serviceFactory.SysLoginFactory.checkLogin调用此方法
	 * 
	 * @return String 返回当前时间
	 * @see
	 * @author 孙卫民
	 */
	public static String getDate() {
		String gRtnStr = DateFormatYMDHM().format(new Date());
		return gRtnStr;
	}

	/**
	 * 
	 * 方法名称:getDate <br>
	 * 方法的功能描述:获取当前时间
	 * com.saint.viosys.serviceFactory.SysLoginFactory.checkLogin调用此方法
	 * 
	 * @return String 返回当前时间
	 * @see
	 * @author 孙卫民
	 */
	public static String getDateYMD() {
		String gRtnStr = DateFormatYMD().format(new Date());
		return gRtnStr;
	}

	/**
	 * 
	 * 方法名称:getSysdate <br>
	 * 方法的功能描述:得到系统数据库的日期 此类中getDateAddMonth方法调用了此方法
	 * 
	 * @return String sysdate|得到的值
	 * @author 张钊
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
	 * 将传入的日期格式转换为yyyy-mm-dd格式 支持：yyyyMMdd,yyyy/mm/dd,yyyy.mm.dd,yyyy-mm-dd
	 * 此处没有验证传入的字符串是否为空
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
	 * 1、检验传入的日期的合法性(只支持短格式) 2、检验出入的日期是否大于等于今天 3、未验证读入的值是否不为空
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
	 * 获取当前时间
	 * @return
	 */
	public static String getNowDate(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}
