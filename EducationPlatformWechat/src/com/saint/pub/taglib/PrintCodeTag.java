package com.saint.pub.taglib;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;


@SuppressWarnings("serial")
public class PrintCodeTag extends TagSupport {
	private String dmlb;
	private String dmjc;
	private String dmsm1;
	private String dmsm2;
	private String dmsm3;
	private String dmsm4;
	private String dmmc;
	private String dmz;
	private String onclick;
	private String defaultValue;
	private String type;
	private String linenum;
	private String bShowDmz ; // 是否显示代码值

	@SuppressWarnings("unchecked")
	@Override
	public int doStartTag() throws JspException {
		try {
			ServletContext servletContext = pageContext.getServletContext();
			WebApplicationContext wac = WebApplicationContextUtils
					.getRequiredWebApplicationContext(servletContext);
			JspWriter out = this.pageContext.getOut();
			IFrmCodeService codeService = (IFrmCodeService) wac.getBean("frmCodeService");
			this.type = ("".equals(this.type) || null == this.type) ? "1": this.type;

			FrmCodeSqlWhere sqlWhere = new FrmCodeSqlWhere();
			sqlWhere.setDmjc(dmjc);
			sqlWhere.setDmlb(dmlb);
			sqlWhere.setDmmc(dmmc);
			sqlWhere.setDmz(dmz);
			sqlWhere.setDmsm2(dmsm2);
	        
			List<FrmCodeEntity> codeList = codeService.selectListFrmCodeBySqlWhere(sqlWhere);
			// System.out.println("type::"+this.type);
			if ("1".equals(this.type)) { // 类型为下拉列表
				printCodeBySel(codeList, out);
			} else if ("2".equals(this.type)) {// 类型为复选框
				printCodeByCbo(codeList, out, this.defaultValue);
			} else if ("3".equals(this.type)) {// 单选框
				printCodeByRio(codeList, out, this.defaultValue,this.linenum);
			} else if ("A".equals(this.type)) {// 部门级别下拉显示当前管理部门以下级别
				codeList = codeService.selectListFrmCodeBySqlWhereJB(sqlWhere);
				printCodeBySel(codeList, out);
			} else if ("B".equals(this.type)) {// 部门级别复选显示当前管理部门以下级别
				codeList = codeService.selectListFrmCodeBySqlWhereJB(sqlWhere);
				printCodeByCbo(codeList, out, this.defaultValue);
			} else if( "7".equals(this.type)){
				codeList = codeService.selectListFrmCodeBySqlWhereJB(sqlWhere);
				printCodeNameBySel(codeList, out);
			}
		} catch (Exception e) {
			e.printStackTrace();
			//throw new JspException(e.getMessage());
		}
		return SKIP_BODY;
	}
	

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public void release() {
		super.release();
		this.dmjc = null;
		this.dmlb = null;
		this.dmz = null;
		this.dmmc = null;
		this.dmsm1 = null;
		this.dmsm2 = null;
		this.dmsm3 = null;
		this.dmsm4 = null;
		this.onclick = null;
		this.type = null;
		this.defaultValue = null;
	}

	private void printCodeBySel(List<FrmCodeEntity> codeList, JspWriter out) {
		try {
			String replacestring = "#DMZ#DMJC" ;
			out.println("<option value=''></option>");
			for (FrmCodeEntity code : codeList) {
				// 当defaultValue 和 dmz 相同默认选中
				String string = "<option selected dmsm=\""+code.getDmmc()+"\" dmsm1=\""+code.getDmsm1()+"\" dmsm2=\""+code.getDmsm2()+"\" dmsm3=\""+code.getDmsm3()+"\" dmsm4=\""+code.getDmsm4()+"\"  title=\""+code.getDmsm4()+"\" value='" + code.getDmz() + "'>" +replacestring+ "</option>" ;
				if (null != defaultValue && defaultValue.equals(code.getDmz())) {
				} else {
					string = string.replaceAll("selected", "") ; 
				}
				
				if(null != bShowDmz && "false".equals(bShowDmz) ){
					string = string.replaceAll(replacestring, code.getDmmc());
				}else{
					string = string.replaceAll(replacestring, code.getDmz() + ":" + code.getDmmc());
				}
				
				out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void printCodeNameBySel(List<FrmCodeEntity> codeList, JspWriter out) {
		try {
			if(codeList!= null&& codeList.get(0)!=null){
				out.println(codeList.get(0).getDmmc());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取标志分类（重要）
	 * 
	 * @param codeList
	 * @param out
	 */
	private void printZBZFLBySel(List<FrmCodeEntity> codeList, JspWriter out) {
		try {
			out.print("<option value=''></option>");
			for (FrmCodeEntity code : codeList) {

				if (null != defaultValue && defaultValue.equals(code.getDmz())) {
					out.print("<option selected dmsm=\""+code.getDmmc()+"\" dmsm1=\""+code.getDmsm1()+"\" dmsm2=\""+code.getDmsm2()+"\" dmsm3=\""+code.getDmsm3()+"\" dmsm4=\""+code.getDmsm4()+"\" value='" + code.getDmz()+ ":"+code.getDmsm2()+ "'>" + code.getDmz() + ":" + code.getDmmc()+ "</option>");
				} else
					out.print("<option dmsm=\""+code.getDmmc()+"\" dmsm1=\""+code.getDmsm1()+"\" dmsm2=\""+code.getDmsm2()+"\" dmsm3=\""+code.getDmsm3()+"\" dmsm4=\""+code.getDmsm4()+"\" value='" + code.getDmz()+":"+code.getDmsm2() + "'>"+ code.getDmz() + ":" + code.getDmmc()+ "</option>");
			}
		} catch (Exception e) {
		}
	}
	
	private void printCodeByCbo(List<FrmCodeEntity> codeList, JspWriter out,
			String defaultValue) {
		// System.out.println("size::"+codeList.size());
		try {
			for (FrmCodeEntity code : codeList) {
				try {
					if (defaultValue.contains(code.getDmz())) {
						out.println("<input isparent=\"1\" type=\"checkbox\" value=\""
								+ code.getDmz()
								+ "\" onclick=\""
								+ onclick
								+ "\"  checked='true' name='"
								+ code.getDmjc().toLowerCase()
								+ "' style=\"vertical-align:middle;\"/><span style=\"vertical-align:middle;\" >" + code.getDmmc() + "&nbsp;</span>");
					} else
						out.println("<input isparent=\"1\" type=\"checkbox\" value=\""
								+ code.getDmz()
								+ "\" onclick=\""
								+ onclick
								+ "\"  name='"
								+ code.getDmjc().toLowerCase()
								+ "' style=\"vertical-align:middle;\"/><span style=\"vertical-align:middle;\" >"
								+ code.getDmmc() + "&nbsp;</span>");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void printCodeByRio(List<FrmCodeEntity> codeList, JspWriter out,String defaultValue,String numstr) {
		int tempnum = 100;
		if(null != numstr && !"".equals(numstr)){
			tempnum = Integer.parseInt(numstr);
		}
		
		try {
			int i = 1;
			for (FrmCodeEntity code : codeList) {
				try {
					if (null != defaultValue && defaultValue.contains(code.getDmz())) {
						out.println("<input   type=\"radio\"  value=\""
								+ code.getDmz() + "\" onclick=\"" + onclick
								+ "\" ywcc = '" + code.getDmmc()
								+ "'  checked='true' name='" + code.getDmjc().toLowerCase()
								+ "' style=\"vertical-align:middle;\"/><span style=\"vertical-align:middle;\" >" + code.getDmmc() + "&nbsp;&nbsp;</span>");
					} else {
						out.println("<input   type=\"radio\" value=\""
								+ code.getDmz() + "\" onclick=\"" + onclick
								+ "\" ywcc = '" + code.getDmmc() + "' name='"
								+ code.getDmjc().toLowerCase() + "' style=\"vertical-align:middle;\"/><span style=\"vertical-align:middle;\" >" + code.getDmmc()
								+ "&nbsp;&nbsp;</span>");
					}
					if (i % tempnum == 0) {
						out.println("<br>");
					}
					i++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOnclick() {
		return onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}

	public String getDmlb() {
		return dmlb;
	}

	public void setDmlb(String dmlb) {
		this.dmlb = dmlb;
	}

	public String getDmjc() {
		return dmjc;
	}

	public void setDmjc(String dmjc) {
		this.dmjc = dmjc;
	}

	public String getDmsm1() {
		return dmsm1;
	}

	public void setDmsm1(String dmsm1) {
		this.dmsm1 = dmsm1;
	}

	public String getDmsm2() {
		return dmsm2;
	}

	public void setDmsm2(String dmsm2) {
		this.dmsm2 = dmsm2;
	}

	public String getDmsm3() {
		return dmsm3;
	}

	public void setDmsm3(String dmsm3) {
		this.dmsm3 = dmsm3;
	}

	public String getDmsm4() {
		return dmsm4;
	}

	public void setDmsm4(String dmsm4) {
		this.dmsm4 = dmsm4;
	}

	public String getDmz() {
		return dmz;
	}

	public void setDmz(String dmz) {
		this.dmz = dmz;
	}

	public String getDmmc() {
		return dmmc;
	}

	public void setDmmc(String dmmc) {
		this.dmmc = dmmc;
	}


	public String getbShowDmz() {
		return bShowDmz;
	}


	public void setbShowDmz(String bShowDmz) {
		this.bShowDmz = bShowDmz;
	}

}
