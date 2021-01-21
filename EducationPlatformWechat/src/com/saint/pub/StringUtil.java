package com.saint.pub;

import java.io.*;
import java.sql.Timestamp;
import java.text.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class StringUtil {

	private static boolean debug = false;

	protected static final int BLKSIZ = 8192;

	private static final int li_SecPosValue[] = { 1601, 1637, 1833, 2078, 2274,
			2302, 2433, 2594, 2787, 3106, 3212, 3472, 3635, 3722, 3730, 3858,
			4027, 4086, 4390, 4558, 4684, 4925, 5249, 5590 };

	private static final String lc_FirstLetter[] = { "a", "b", "c", "d", "e",
			"f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "w", "x", "y", "z" };

	public StringUtil() {
	}

	public static void debuginfo(String info) {
		if (debug)
			System.out.println(info);
	}

	public static String getExpMsg(Exception e) {
		String resultString = "";
		boolean isnull = false;
		try {
			resultString = e.getMessage();
			if (resultString == null) {
				isnull = true;
				resultString = "";
			}
			int i = resultString.indexOf("ORA-20001:");
			if (i < 0 && resultString.indexOf("TERR") < 0) {
				StackTraceElement se[] = e.getStackTrace();
				if (se.length > 0) {
					String tmp = null;
					for (int j = 0; j < se.length; j++) {
						tmp = (new StringBuilder()).append(se[j]).toString();
						if (tmp.indexOf("com.tmri") < 0
								|| tmp
										.indexOf("com.tmri.framework.dao.jdbc.FrmJdbcTemplate") >= 0)
							continue;
						resultString = (new StringBuilder(String
								.valueOf(resultString))).append("\\n").append(
								tmp).toString();
						break;
					}

				}
			}
			if (isnull)
				resultString = (new StringBuilder("Null值错误：")).append(
						resultString).toString();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return resultString;
	}

	public static String displayMax(String value, int maxlength) {
		String result = "";
		if (value == null)
			result = "";
		else if (value.length() > maxlength)
			result = (new StringBuilder("<span style='cursor:hand' title='"))
					.append(value).append("'>").append(
							value.substring(0, maxlength)).append("...</span>")
					.toString();
		else
			result = value;
		return result;
	}

	public static String[] splitString(String str, char split) {
		String str2 = str;
		int i = 1;
		int j = 0;
		while (i > -1) {
			j++;
			i = str2.indexOf(split);
			if (i > -1)
				str2 = str2.substring(i + 1);
		}
		String result[] = new String[j];
		for (int k = 0; k < j; k++) {
			i = str.indexOf(split);
			if (i > -1) {
				String str1 = str.substring(0, i);
				str = str.substring(i + 1);
				result[k] = String.valueOf(str1);
			} else {
				result[k] = String.valueOf(str);
			}
		}

		return result;
	}

	private static String readerToString(Reader is) throws IOException {
		StringBuffer sb = new StringBuffer();
		char b[] = new char[8192];
		int n;
		while ((n = is.read(b)) > 0)
			sb.append(b, 0, n);
		return sb.toString();
	}

	public static String inputStreamToString(InputStream is) throws IOException {
		return readerToString(new InputStreamReader(is));
	}

	public static String byte2hex(byte b[]) {
		StringBuffer hs = new StringBuffer();
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = Integer.toHexString(b[n] & 0xff);
			if (stmp.length() == 1) {
				hs.append("0");
				hs.append(stmp);
			} else {
				hs.append(stmp);
			}
		}

		return hs.toString().toUpperCase();
	}

	public static byte[] hex2byte(String strkey) {
		int keylength = strkey.length() / 2;
		String strValue = "";
		byte key[] = new byte[keylength];
		for (int i = 0; i < keylength; i++) {
			strValue = strkey.substring(2 * i, 2 * (i + 1));
			key[i] = Integer.valueOf(strValue, 16).byteValue();
		}

		return key;
	}

	public static String bin2hex(String bin) {
		char digital[] = "0123456789ABCDEF".toCharArray();
		StringBuffer sb = new StringBuffer("");
		byte bs[] = bin.getBytes();
		for (int i = 0; i < bs.length; i++) {
			int bit = (bs[i] & 0xf0) >> 4;
			sb.append(digital[bit]);
			bit = bs[i] & 0xf;
			sb.append(digital[bit]);
		}

		return sb.toString();
	}

	public static Object pupuZipHexString2Object(String hexStr)
			throws IOException, ClassNotFoundException, DataFormatException {
		byte unzip[] = hex2byte(hexStr);
		return byte2Object(unzip);
	}

	public static String popuObject2ZipHexString(Object srcObject)
			throws IOException {
		byte ziped[] = object2Byte(srcObject);
		String tmp = byte2hex(ziped);
		return tmp;
	}

	public static Object byte2Object(byte srcByte[])
			throws ClassNotFoundException, IOException {
		ByteArrayInputStream is = new ByteArrayInputStream(srcByte);
		ObjectInputStream ois = new ObjectInputStream(is);
		return ois.readObject();
	}

	public static byte[] object2Byte(Object srcObject) throws IOException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(srcObject);
		return os.toByteArray();
	}

	public static String formatDoubleToPer(double fzvalue, double fmvalue) {
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		df.applyPattern("##.##%");
		String result = "-";
		if (fmvalue > 0.0D)
			result = df.format(fzvalue / fmvalue);
		return result;
	}

	public static String formatStringToPer(String hgvalue, String bhgvalue) {
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		df.applyPattern("#.##%");
		String result = "-";
		if (hgvalue.equals("-") && bhgvalue.equals("-"))
			result = "-";
		else if (hgvalue.equals("-") && !bhgvalue.equals("-"))
			result = "0.00%";
		else if (!hgvalue.equals("-") && bhgvalue.equals("-")) {
			result = "100%";
		} else {
			double d_hg = Double.parseDouble(hgvalue);
			double d_bhg = Double.parseDouble(bhgvalue);
			if (d_bhg + d_hg > 0.0D)
				result = df.format(d_hg / (d_bhg + d_hg));
		}
		return result;
	}

	public static String formatStringToPer2(String hgvalue, String bhgvalue) {
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		df.applyPattern("#.##%");
		String result = "-";
		if (hgvalue.equals("0") && bhgvalue.equals("0"))
			result = "-";
		else if (hgvalue.equals("0") && !bhgvalue.equals("0"))
			result = "0.00%";
		else if (!hgvalue.equals("0") && bhgvalue.equals("0")) {
			result = "100%";
		} else {
			double d_hg = Double.parseDouble(hgvalue);
			double d_bhg = Double.parseDouble(bhgvalue);
			if (d_bhg > 0.0D)
				result = df.format(d_hg / d_bhg);
		}
		return result;
	}

	public static String formatStringToPer3(String hgvalue, String bhgvalue,
			String chgvalue) {
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		df.applyPattern("#.##%");
		String result = "-";
		if (hgvalue.equals("0") && bhgvalue.equals("0"))
			result = "-";
		else if (hgvalue.equals("0") && !bhgvalue.equals("0"))
			result = "0.00%";
		else if (!hgvalue.equals("0") && bhgvalue.equals("0")) {
			result = "100%";
		} else {
			double d_hg = Double.parseDouble(hgvalue);
			double d_bhg = Double.parseDouble(bhgvalue);
			double d_chg = Double.parseDouble(chgvalue);
			if (d_bhg + d_hg > 0.0D)
				result = df.format(d_hg / (d_bhg + d_hg + d_chg));
		}
		return result;
	}

	public static String transNull(String str) {
		String result = str;
		if (str == null || str.equals("") || str.equals("null")
				|| str.equals("NULL"))
			result = "--";
		return result;
	}

	public static String transNullNum(String str) {
		String result = str;
		if (str == null || str.equals("") || str.equals("null")
				|| str.equals("NULL"))
			result = "0";
		return result;
	}

	public static String transBlank(String str) {
		String result = str;
		if (str == null || str.equals("") || str.equals("null")
				|| str.equals("NULL"))
			result = "";
		return result;
	}

	public static byte[] strToBase64(String content) throws IOException {
		byte result[] = (new BASE64Decoder()).decodeBuffer(content.trim());
		return result;
	}

	public static String base64ToStr(byte bytes[]) throws IOException {
		String content = "";
		content = (new BASE64Encoder()).encode(bytes);
		return content;
	}

	public static String minusStrFromStr(String aString, String bString) {
		String result = "";
		boolean flag = true;
		String tmpString = "";
		String aStrings[] = aString.split(",");
		String bStrings[] = bString.split(",");
		for (int i = 0; i < aStrings.length; i++) {
			flag = false;
			tmpString = aStrings[i];
			for (int j = 0; j < bStrings.length; j++) {
				if (!tmpString.equals(bStrings[j]))
					continue;
				flag = true;
				break;
			}

			if (!flag)
				result = (new StringBuilder(String.valueOf(result))).append(
						tmpString).append(",").toString();
		}

		return result;
	}

	public static String subStringByAsciiLen(String original, int m_length) {
		String tmp = original;
		int iLen = 0;
		for (int i = 0; i < original.length(); i++) {
			char s = original.charAt(i);
			if (s < '\u0100')
				iLen++;
			else
				iLen += 2;
			if (iLen > m_length)
				tmp = original.substring(0, i);
		}

		return tmp;
	}

	public static String transNullOrZero(String _tmp) {
		String _result = "";
		try {
			_result = _tmp;
			if (_tmp == null || _tmp.equals("") || _tmp.equals("0"))
				_result = "--";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return _result;
	}

	public static boolean checkBN(String value) {
		boolean result = true;
		if (value == null || value.equals("") || value.equals("null"))
			result = false;
		return result;
	}

	public static String getAllFirstLetter(String str) {
		if (str == null || str.trim().length() == 0)
			return "";
		String _str = "";
		for (int i = 0; i < str.length(); i++)
			_str = (new StringBuilder(String.valueOf(_str))).append(
					getFirstLetter(str.substring(i, i + 1))).toString();

		return _str;
	}

	public static String getFirstLetter(String chinese) {
		if (chinese == null || chinese.trim().length() == 0)
			return "";
		chinese = conversionStr(chinese, "GB2312", "ISO8859-1");
		if (chinese.length() > 1) {
			int li_SectorCode = chinese.charAt(0);
			int li_PositionCode = chinese.charAt(1);
			li_SectorCode -= 160;
			li_PositionCode -= 160;
			int li_SecPosCode = li_SectorCode * 100 + li_PositionCode;
			if (li_SecPosCode > 1600 && li_SecPosCode < 5590) {
				for (int i = 0; i < 23; i++) {
					if (li_SecPosCode < li_SecPosValue[i]
							|| li_SecPosCode >= li_SecPosValue[i + 1])
						continue;
					chinese = lc_FirstLetter[i];
					break;
				}

			} else {
				chinese = conversionStr(chinese, "ISO8859-1", "GB2312");
				chinese = chinese.substring(0, 1);
			}
		}
		return chinese;
	}

	private static String conversionStr(String str, String charsetName,
			String toCharsetName) {
		try {
			str = new String(str.getBytes(charsetName), toCharsetName);
		} catch (UnsupportedEncodingException ex) {
			System.out.println((new StringBuilder("字符串编码转换异常：")).append(
					ex.getMessage()).toString());
		}
		return str;
	}

	public static String cScriptInfoStr(String strJava) {
		String r = null;
		if (strJava == null) {
			r = "";
		} else {
			r = strJava.replaceAll("'", "\"");
			r = r.replaceAll("\"", "\\\"");
			r = r.replaceAll("\r", "");
			r = r.replaceAll("\n", "A~A~");
		}
		return r;
	}

	public static String[] splitString(String str, String split) {
		String tmpStr = str.trim();
		String result[];
		if (tmpStr.equals(""))
			result = (String[]) null;
		else
			result = tmpStr.split(split);
		return result;
	}

	public static String id15to18(String zjhm) {
		String strJiaoYan[] = { "1", "0", "X", "9", "8", "7", "6", "5", "4",
				"3", "2" };
		int intQuan[] = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2,
				1 };
		int ll_sum = 0;
		zjhm = (new StringBuilder(String.valueOf(zjhm.substring(0, 6))))
				.append("19").append(zjhm.substring(6)).toString();
		for (int i = 0; i < zjhm.length(); i++)
			ll_sum += Integer.parseInt(zjhm.substring(i, i + 1)) * intQuan[i];

		ll_sum %= 11;
		zjhm = (new StringBuilder(String.valueOf(zjhm))).append(
				strJiaoYan[ll_sum]).toString();
		return zjhm;
	}

	public static String id18to15(String zjhm) {
		if (zjhm.length() == 18)
			zjhm = (new StringBuilder(String.valueOf(zjhm.substring(0, 6))))
					.append(zjhm.substring(8, 17)).toString();
		return zjhm;
	}

	public static String formatNumPercent(String fms, String fzs) {
		String returnStr = "";
		if (fms.equals("0")) {
			returnStr = "--";
		} else {
			NumberFormat form = NumberFormat.getInstance();
			float percent = Float.parseFloat(fzs) / Float.parseFloat(fms);
			percent *= 100F;
			form.setMaximumIntegerDigits(3);
			form.setMinimumFractionDigits(2);
			form.setMaximumFractionDigits(2);
			returnStr = (new StringBuilder(String.valueOf(form.format(percent))))
					.append("%").toString();
		}
		return returnStr;
	}

	public static String tranRbspCode(String code) {
		String codefy = "";
		if (code.equals("00"))
			codefy = "正常返回";
		else if (code.equals("01"))
			codefy = "数据源状态不可用";
		else if (code.equals("02"))
			codefy = "要查询的业务对象不存在";
		else if (code.equals("03"))
			codefy = "查询条件信息构造错误";
		else if (code.equals("04"))
			codefy = "内部处理程序错误";
		else if (code.equals("05"))
			codefy = "系统内部对应的查询方案不存在";
		else if (code.equals("06"))
			codefy = "查询对象的字段未做共享映射配置";
		else if (code.equals("07"))
			codefy = "查询结果字段构造错误，即SQL语句的select部分构造错误";
		else if (code.equals("08"))
			codefy = "请求的查询对象没有做结果字段配置";
		else if (code.equals("09"))
			codefy = "数据集转换出错，需转换的数据对象包含非法类型字段类型，合法的类型为：STRING，BIGDECIMAL和TIMESTAMP";
		else if (code.equals("10"))
			codefy = "本地并未配置相应的时间字段类型";
		else if (code.equals("11"))
			codefy = "本地未定义图片标识字段";
		else if (code.equals("12"))
			codefy = "本地未定义图片的定位字段";
		else if (code.equals("13"))
			codefy = "本地未定义图片字段，请检查查询对象配置";
		else if (code.equals("14"))
			codefy = "本地未定义图片存储的实际表，请检查对象配置";
		else if (code.equals("15"))
			codefy = "查询图片出错";
		else if (code.equals("16"))
			codefy = "相关对象没有配置表码类型选项，请配置";
		else if (code.equals("17"))
			codefy = "系统中未找到相关的表码信息";
		else if (code.equals("18"))
			codefy = "查询时间超出设置的最大超时时间";
		else if (code.equals("99"))
			codefy = "其他异常";
		return codefy;
	}

	public static String replaceEnter(String strJava) {
		String r = null;
		if (strJava == null) {
			r = "";
		} else {
			r = strJava.replaceAll("'", "\"");
			r = r.replaceAll("\"", "\\\"");
			r = r.replaceAll("\r", "");
			r = r.replaceAll("\n", "<P>");
			r = r.replaceAll(" ", "&nbsp;");
		}
		return r;
	}

	public static String addQuote2Str(String strobj) {
		String result = "";
		String temp[] = strobj.split(",");
		for (int i = 0; i < temp.length; i++)
			if (temp[i].indexOf("'") < 0)
				result = (new StringBuilder(String.valueOf(result)))
						.append("'").append(temp[i]).append("',").toString();
			else
				result = (new StringBuilder(String.valueOf(result))).append(
						temp[i]).append(",").toString();

		if (!result.equals(""))
			result = result.substring(0, result.length() - 1);
		return result;
	}

	public static Timestamp praseTimestamp(String dateString) {
		String format = "yyyy-MM-dd HH:mm:ss";
		if (dateString.trim().length() >= 17)
			format = "yyyy-MM-dd HH:mm:ss";
		else if (dateString.trim().length() >= 14)
			format = "yyyy-MM-dd HH:mm";
		else if (dateString.trim().length() >= 10)
			format = "yyyy-MM-dd";
		else
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date d = null;
		try {
			d = formatter.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Timestamp(d.getTime());
	}

	public static String tss_title(String title) {
		String s = "";
		s = (new StringBuilder(String.valueOf(s))).append(
				"<fieldset style=\"width:98%; border-width :thin;\">")
				.toString();
		s = (new StringBuilder(String.valueOf(s))).append(
				"<legend class=\"legend\">").append(title).append("</legend>")
				.toString();
		s = (new StringBuilder(String.valueOf(s)))
				.append(
						"<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr><td height=\"2\"></td></tr></table>")
				.toString();
		return s;
	}

	public static String tss_down() {
		String s = "";
		s = (new StringBuilder(String.valueOf(s)))
				.append(
						"<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr><td height=\"2\"></td></tr></table>")
				.toString();
		s = (new StringBuilder(String.valueOf(s))).append("</fieldset>")
				.toString();
		return s;
	}

	public static String HtmlText(String inputString) {
		String htmlStr = inputString;
		String textStr = "";
		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
			String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";
			String regEx_html = "<[^>]+>";
			Pattern p_script = Pattern.compile(regEx_script, 2);
			Matcher m_script = p_script.matcher(htmlStr);
			htmlStr = m_script.replaceAll("");
			Pattern p_style = Pattern.compile(regEx_style, 2);
			Matcher m_style = p_style.matcher(htmlStr);
			htmlStr = m_style.replaceAll("");
			Pattern p_html = Pattern.compile(regEx_html, 2);
			Matcher m_html = p_html.matcher(htmlStr);
			htmlStr = m_html.replaceAll("");
			m_html = p_html.matcher(htmlStr);
			htmlStr = htmlStr.replaceAll(" ", " ");
			textStr = htmlStr;
		} catch (Exception exception) {
		}
		return textStr;
	}

	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		return isNum.matches();
	}

	public static String outInputHtml(String cd, String zdm, String val,
			String maxLen, String lb) {
		String ret = "";
		if (lb.equals("1"))
			ret = (new StringBuilder("<input name=\"")).append(zdm).append(
					"\" type=\"text\" style=\"width: ").append(cd).append(
					";\" maxlength=\"").append(maxLen).append("\" value=\"")
					.append(val).append("\">").toString();
		else if (lb.equals("3"))
			ret = (new StringBuilder("<input name=\"")).append(zdm).append(
					"\" type=\"text\" style=\"width: ").append(cd).append(
					";text-transform: uppercase;\" maxlength=\"")
					.append(maxLen).append("\" value=\"").append(val).append(
							"\">").toString();
		else if (lb.equals("2"))
			ret = (new StringBuilder("<input type=\"hidden\" name=\"")).append(
					zdm).append("\" value=\"").append(val).append(
					"\"><span id='span_").append(zdm).append("'>&nbsp;")
					.append(val).append("</span>").toString();
		return ret;
	}

	public static String outSelectHtml(String cd, String zdm, String val,
			String xsval, String lb) {
		String ret = "";
		if (lb.equals("1"))
			ret = (new StringBuilder("<select name=\"")).append(zdm).append(
					"\" class=\"input_text\" style=\"width: ").append(cd)
					.append(";\">").append(xsval).append("</select>")
					.toString();
		else if (lb.equals("2"))
			ret = (new StringBuilder("<input type=\"hidden\" name=\"")).append(
					zdm).append("\" value=\"").append(val).append(
					"\"><span id='span_").append(zdm).append("'>&nbsp;")
					.append(xsval).append("</span>").toString();
		return ret;
	}

	public static String outTextareaHtml(String cols, String rows, String zdm,
			String val, String lb) {
		String ret = "";
		if (lb.equals("1"))
			ret = (new StringBuilder("<textarea name=\"")).append(zdm).append(
					"\" rows=\"").append(rows).append("\" cols=\"")
					.append(cols).append(
							"\" class=\"text_12\"  onfocus=\"movelast();\" >")
					.append(val).append("</textarea>").toString();
		else if (lb.equals("2"))
			ret = (new StringBuilder("<textarea style=\"display:none\" name=\""))
					.append(zdm).append("\" rows=\"").append(rows).append(
							"\" cols=\"").append(cols).append(
							"\" class=\"text_12\"  onfocus=\"movelast();\" >")
					.append(val).append("</textarea>").append(val).toString();
		return ret;
	}

	public static String outTimeSel(int ks, int js, String val) {
		String ret = "";
		String tmp = "";
		for (int i = ks; i <= js; i++) {
			if (i < 10)
				tmp = (new StringBuilder("0")).append(String.valueOf(i))
						.toString();
			else
				tmp = String.valueOf(i);
			if (tmp.equals(val))
				ret = (new StringBuilder(String.valueOf(ret))).append(
						"<option value=").append(tmp).append(" selected>")
						.append(tmp).append("</option>").toString();
			else
				ret = (new StringBuilder(String.valueOf(ret))).append(
						"<option value=").append(tmp).append(">").append(tmp)
						.append("</option>").toString();
		}

		return ret;
	}

	public static String formatDate(String ret, int length) {
		String result = ret;
		ret = transNull(ret);
		if (ret.length() >= length)
			result = ret.substring(0, length);
		return result;
	}

}
