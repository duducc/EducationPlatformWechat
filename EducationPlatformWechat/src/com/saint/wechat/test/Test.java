package com.saint.wechat.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;



public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	 public static void main(String[] args) throws Exception {
		 String [][] result = exportExcel("d:/222.xls",7);
		 String zsjbm = "";
		 String sqsjbm = "";
		 for (String[] strings : result) {
			 if(null!=strings[0]&&!strings[0].equals("")){
				 System.out.println("insert into frm_unit values('"+strings[0]+"','"+strings[1]+"','0',null,null,null,sysdate,sysdate,'0',null,'1','1',null);");
//				 System.out.println(strings[0]+"\t"+strings[1]);
			 }else if((null==strings[0]||strings[0].equals(""))&&(null==strings[3]||strings[3].equals(""))){
//				 System.out.println(strings[1]+"\t"+strings[2]+"上级部门：620800");
				 System.out.println("insert into frm_unit values('"+strings[1]+"','"+strings[2]+"','1',null,null,null,sysdate,sysdate,'0',null,'1','1','620800');");
				 zsjbm = strings[1];
			 }else if((null==strings[1]||strings[1].equals(""))&&(null==strings[4]||strings[4].equals(""))){
				 System.out.println("insert into frm_unit values('"+strings[2]+"','"+strings[3]+"','2',null,null,null,sysdate,sysdate,'0',null,'1','1','"+zsjbm+"');");
//				 System.out.println(strings[2]+"\t"+strings[3]+"上级部门："+zsjbm);
				 sqsjbm = strings[2];
			 }else if((null==strings[2]||strings[2].equals(""))){
				 System.out.println("insert into frm_unit values('"+strings[3]+"','"+strings[4]+"','3',null,null,null,sysdate,sysdate,'0',null,'1','1','"+sqsjbm+"');");
//				 System.out.println(strings[3]+"\t"+strings[4]+"上级部门："+sqsjbm);
			 }
		 }
		 
	 }
	     
    public static String[][] exportExcel(String inputFile,int sheetnum) throws Exception{ 
		  Workbook wwb = null;  
	        try {   
	        	InputStream in = new FileInputStream(inputFile);
	            wwb = Workbook.getWorkbook(in); 
	        } catch (IOException e) {   
	            e.printStackTrace();   
	        }   
	        String searchArray[][] = null;
	        if(wwb!=null){   
	            Sheet ws = wwb.getSheet(sheetnum);   
	            searchArray = new String[ws.getRows()][ws.getColumns()];
	            for(int i=0;i<ws.getRows();i++){ 
	                for(int j=0;j<ws.getColumns();j++){   
	                	Cell cell= ws.getCell(j, i);
	                	searchArray[i][j] = cell.getContents()!=null ? cell.getContents() : null;
	                }   
	            }   
	            try {   
	                wwb.close();   
	            } catch (Exception e) {   
	                e.printStackTrace();   
	            }   
	        }   
	        return searchArray;
	  }
    //jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=hldb1)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=hldb2)(PORT=1521))(LOAD_BALANCE=yes))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=gshlwdb)))
}
