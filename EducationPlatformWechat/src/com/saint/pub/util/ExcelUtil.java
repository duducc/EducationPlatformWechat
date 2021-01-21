package com.saint.pub.util;

import java.io.OutputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;

/**
 * 
 * @author Bruce Xu
 * 
 * @param <T>
 */
public class ExcelUtil<T> {

	/**
	 * ����Excel�ķ���
	 * 
	 * @param title
	 *            excel�е�sheet����
	 * @param headers
	 *            ��ͷ
	 * @param result
	 *            �����
	 * @param out
	 *            �����
	 * @param pattern
	 *            ʱ���ʽ
	 * @throws Exception
	 */
	public void exportExcel(String title, String[] headers, String[] columns,Collection<T> result, OutputStream out, String pattern)throws Exception {
		// ����һ��������
		HSSFWorkbook workbook = new HSSFWorkbook();
		// ����һ�����
		HSSFSheet sheet = workbook.createSheet(title);
		// ���ñ��Ĭ���п��Ϊ20���ֽ�
		sheet.setDefaultColumnWidth((short) 20);

		// ����һ����ʽ
		HSSFCellStyle style = workbook.createCellStyle();
		// ������Щ��ʽ
		style.setFillForegroundColor(HSSFColor.GOLD.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// ����һ������
		HSSFFont font = workbook.createFont();
		font.setColor(HSSFColor.VIOLET.index);
		// font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// ������Ӧ�õ���ǰ����ʽ
		style.setFont(font);

		// ָ������Ԫ��������ʾ����ʱ�Զ�����
		style.setWrapText(true);

		// ����һ����ͼ�Ķ���������
		HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
		/*
		 * 
		 * ���¿����������õ��������ݵ���ʽ
		 * 
		 * // ���ɲ�������һ����ʽ HSSFCellStyle style2 = workbook.createCellStyle();
		 * style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
		 * style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		 * style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		 * style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		 * style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		 * style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		 * style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		 * style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); //
		 * ������һ������ HSSFFont font2 = workbook.createFont();
		 * font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL); // ������Ӧ�õ���ǰ����ʽ
		 * style2.setFont(font2); // ����һ����ͼ�Ķ��������� HSSFPatriarch patriarch =
		 * sheet.createDrawingPatriarch();
		 * 
		 * 
		 * // ����ע�͵Ĵ�С��λ��,����ĵ� HSSFComment comment = patriarch.createComment(new
		 * HSSFClientAnchor(0, 0, 0, 0, (short) 4, 2, (short) 6, 5)); // ����ע������
		 * comment.setString(new HSSFRichTextString("������POI�����ע�ͣ�")); //
		 * ����ע�����ߣ�������ƶ�����Ԫ�����ǿ�����״̬���п���������. comment.setAuthor("leno");
		 */

		// ������������
		// ��ͷ����ʽ
		HSSFCellStyle titleStyle = workbook.createCellStyle();// ������ʽ����
		titleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION);// ˮƽ����
		titleStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// ��ֱ����
		// ��������
		HSSFFont titleFont = workbook.createFont(); // �����������
		titleFont.setFontHeightInPoints((short) 15); // ���������С
		titleFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// ���ô���
		// titleFont.setFontName("����"); // ����Ϊ������
		titleStyle.setFont(titleFont);
		sheet.addMergedRegion(new Region(0, (short) 0, 0,(short) (headers.length - 1)));// ָ���ϲ�����
		HSSFRow rowHeader = sheet.createRow(0);
		HSSFCell cellHeader = rowHeader.createCell((short) 0); // ֻ������һ����д���ݣ�Ȼ��Ӧ����ʽ���Ϳ���ˮƽ��ֱ����
		HSSFRichTextString textHeader = new HSSFRichTextString(title);
		cellHeader.setCellStyle(titleStyle);
		cellHeader.setCellValue(textHeader);

		HSSFRow row = sheet.createRow(1);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell((short) i);
			cell.setCellStyle(style);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}
		// �����������ݣ�����������
		if (result != null) {
			int index = 2;
			for (T t : result) {
				// Field[] fields = t.getClass().getDeclaredFields();
				row = sheet.createRow(index);
				index++;
				for (short i = 0; i < columns.length; i++) {
					HSSFCell cell = row.createCell(i);
					// Field field = fields[i];
					// String fieldName = field.getName();
					String fieldName = columns[i];
					String getMethodName = "get"
							+ fieldName.substring(0, 1).toUpperCase()
							+ fieldName.substring(1);
					Class tCls = t.getClass();
					Method getMethod = tCls.getMethod(getMethodName,new Class[] {});
					// getMethod.getReturnType().isInstance(obj);
					Object value = getMethod.invoke(t, new Class[] {});
					String textValue = null;
					if (value == null) {
						textValue = "";
					} else if (value instanceof Date) {
						Date date = (Date) value;
						SimpleDateFormat sdf = new SimpleDateFormat(pattern);
						textValue = sdf.format(date);
					} else if (value instanceof byte[]) {
						// ��ͼƬʱ�������и�Ϊ60px;
						row.setHeightInPoints(60);
						// ����ͼƬ�����п��Ϊ80px,ע�����ﵥλ��һ������
						sheet.setColumnWidth(i, (short) (35.7 * 80));
						// sheet.autoSizeColumn(i);
						byte[] bsValue = (byte[]) value;
						HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0,
								1023, 255, (short) 6, index, (short) 6, index);
						anchor.setAnchorType(2);
						patriarch.createPicture(anchor, workbook.addPicture(
								bsValue, HSSFWorkbook.PICTURE_TYPE_JPEG));
					} else {
						// �����������Ͷ������ַ����򵥴���
						textValue = value.toString();
					}

					if (textValue != null) {
						Pattern p = Pattern.compile("^//d+(//.//d+)?$");
						Matcher matcher = p.matcher(textValue);
						if (matcher.matches()) {
							// �����ֵ���double����
							cell.setCellValue(Double.parseDouble(textValue));
						} else {
							HSSFRichTextString richString = new HSSFRichTextString(
									textValue);
							// HSSFFont font3 = workbook.createFont();
							// font3.setColor(HSSFColor.BLUE.index);
							// richString.applyFont(font3);
							cell.setCellValue(richString);
						}
					}
				}
			}
		}
		workbook.write(out);
	}
}
