package com.saint.pub.taglib;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;


@SuppressWarnings("serial")
public class PrintDepTag extends TagSupport {
	// private boolean sfbhxj;
	private String glbm;
	private String bmjb;
	private String sjbm;
	private String defaultValue;
	private String type;
	private String city="";
	private String bShowGlbm = "true" ; 

	@SuppressWarnings("unchecked")
	@Override
	public int doStartTag() throws JspException {
		try {
			
			ServletContext servletContext = pageContext.getServletContext();
			WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
			JspWriter out = this.pageContext.getOut();
			IFrmDepartmentService depService = (IFrmDepartmentService) wac.getBean("frmDepartmentService");
			this.type = ("".equals(this.type) || null == this.type) ? "1": this.type;
			FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
			sqlWhere.setGlbm(glbm);
			sqlWhere.setBmjb(bmjb);
			sqlWhere.setSjbm(sjbm);

			out.println("<option  value='' ></option>");
			List<FrmDepartmentEntity> depList = depService.selectListFrmDepartmentBySqlWhere(sqlWhere);
			//if (depList != null) {
			String replacestring = "#GLBM#BMMC" ; 
			if ("1".equals(this.type)) {// 类型为下拉列表
				for (FrmDepartmentEntity dep : depList) {
					String optionstr = "<option selected value='"+ dep.getGlbm() + "' bmjb='"+ dep.getBmjb() + "' >" + replacestring + "</option>" ;
					if (defaultValue.equals(dep.getGlbm())) {
						
					} else {
						optionstr = optionstr.replaceAll("selected", "");
					}
					
					if("false".equals(bShowGlbm)){
						optionstr = optionstr.replaceAll(replacestring, dep.getBmmc());
					}else{
						optionstr = optionstr.replaceAll(replacestring, dep.getGlbm()+ ":" + dep.getBmmc());
					}
					out.println(optionstr);
				}
			}
			//}
		} catch (Exception e) {
			e.printStackTrace();
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
		this.bmjb = null;
		this.glbm = null;
		this.sjbm = null;
		this.type = null;
		this.defaultValue = null;
		// this.sfbhxj=true;
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

	public String getBmjb() {
		return bmjb;
	}

	public void setBmjb(String bmjb) {
		this.bmjb = bmjb;
	}

	public String getGlbm() {
		return glbm;
	}

	public void setGlbm(String glbm) {
		this.glbm = glbm;
	}
  
	public String getSjbm() {
		return sjbm;
	}

	public void setSjbm(String sjbm) {
		this.sjbm = sjbm;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getbShowGlbm() {
		return bShowGlbm;
	}

	public void setbShowGlbm(String bShowGlbm) {
		this.bShowGlbm = bShowGlbm;
	}

}
