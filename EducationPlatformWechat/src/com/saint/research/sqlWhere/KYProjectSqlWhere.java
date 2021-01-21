package com.saint.research.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.research.bean.KYProjectEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名KY_PROJECT
*表说明经费转拨记录信息
  */
public class KYProjectSqlWhere extends KYProjectEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    private List<String> pList ; // 项目编号组
    

    public List<String> getpList() {
		return pList;
	}

	public void setpList(List<String> pList) {
		this.pList = pList;
	}

	public KYProjectSqlWhere() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setListPage(Page listPage) {
        this.listPage = listPage;
    }

    public Page getListPage() {
        return listPage;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        public Criteria addSDWhereSql(String value) {
            addCriterion(value);
            return (Criteria) this;
        }

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, Timestamp value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new Timestamp(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProsequenceIsNull() {
            addCriterion("PROSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andProsequenceIsNotNull() {
            addCriterion("PROSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andProsequenceEqualTo(String value) {
            addCriterion("PROSEQUENCE =", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceNotEqualTo(String value) {
            addCriterion("PROSEQUENCE <>", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceGreaterThan(String value) {
            addCriterion("PROSEQUENCE >", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceGreaterThanOrEqualTo(String value) {
            addCriterion("PROSEQUENCE >=", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceLessThan(String value) {
            addCriterion("PROSEQUENCE <", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceLessThanOrEqualTo(String value) {
            addCriterion("PROSEQUENCE <=", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceLike(String value) {
            addCriterion("PROSEQUENCE like", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceNotLike(String value) {
            addCriterion("PROSEQUENCE not like", value, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceIn(List<String> values) {
            addCriterion("PROSEQUENCE in", values, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceNotIn(List<String> values) {
            addCriterion("PROSEQUENCE not in", values, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceBetween(String value1, String value2) {
            addCriterion("PROSEQUENCE between", value1, value2, "prosequence");
            return (Criteria) this;
        }

        public Criteria andProsequenceNotBetween(String value1, String value2) {
            addCriterion("PROSEQUENCE not between", value1, value2, "prosequence");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("PRONAME is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("PRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("PRONAME =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("PRONAME <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("PRONAME >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("PRONAME >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("PRONAME <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("PRONAME <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("PRONAME like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("PRONAME not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("PRONAME in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("PRONAME not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("PRONAME between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("PRONAME not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andProgradeIsNull() {
            addCriterion("PROGRADE is null");
            return (Criteria) this;
        }

        public Criteria andProgradeIsNotNull() {
            addCriterion("PROGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andProgradeEqualTo(String value) {
            addCriterion("PROGRADE =", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeNotEqualTo(String value) {
            addCriterion("PROGRADE <>", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeGreaterThan(String value) {
            addCriterion("PROGRADE >", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeGreaterThanOrEqualTo(String value) {
            addCriterion("PROGRADE >=", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeLessThan(String value) {
            addCriterion("PROGRADE <", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeLessThanOrEqualTo(String value) {
            addCriterion("PROGRADE <=", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeLike(String value) {
            addCriterion("PROGRADE like", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeNotLike(String value) {
            addCriterion("PROGRADE not like", value, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeIn(List<String> values) {
            addCriterion("PROGRADE in", values, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeNotIn(List<String> values) {
            addCriterion("PROGRADE not in", values, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeBetween(String value1, String value2) {
            addCriterion("PROGRADE between", value1, value2, "prograde");
            return (Criteria) this;
        }

        public Criteria andProgradeNotBetween(String value1, String value2) {
            addCriterion("PROGRADE not between", value1, value2, "prograde");
            return (Criteria) this;
        }

        public Criteria andPronatureIsNull() {
            addCriterion("PRONATURE is null");
            return (Criteria) this;
        }

        public Criteria andPronatureIsNotNull() {
            addCriterion("PRONATURE is not null");
            return (Criteria) this;
        }

        public Criteria andPronatureEqualTo(String value) {
            addCriterion("PRONATURE =", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureNotEqualTo(String value) {
            addCriterion("PRONATURE <>", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureGreaterThan(String value) {
            addCriterion("PRONATURE >", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureGreaterThanOrEqualTo(String value) {
            addCriterion("PRONATURE >=", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureLessThan(String value) {
            addCriterion("PRONATURE <", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureLessThanOrEqualTo(String value) {
            addCriterion("PRONATURE <=", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureLike(String value) {
            addCriterion("PRONATURE like", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureNotLike(String value) {
            addCriterion("PRONATURE not like", value, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureIn(List<String> values) {
            addCriterion("PRONATURE in", values, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureNotIn(List<String> values) {
            addCriterion("PRONATURE not in", values, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureBetween(String value1, String value2) {
            addCriterion("PRONATURE between", value1, value2, "pronature");
            return (Criteria) this;
        }

        public Criteria andPronatureNotBetween(String value1, String value2) {
            addCriterion("PRONATURE not between", value1, value2, "pronature");
            return (Criteria) this;
        }

        public Criteria andProtypeidIsNull() {
            addCriterion("PROTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andProtypeidIsNotNull() {
            addCriterion("PROTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeidEqualTo(String value) {
            addCriterion("PROTYPEID =", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotEqualTo(String value) {
            addCriterion("PROTYPEID <>", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidGreaterThan(String value) {
            addCriterion("PROTYPEID >", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("PROTYPEID >=", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLessThan(String value) {
            addCriterion("PROTYPEID <", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLessThanOrEqualTo(String value) {
            addCriterion("PROTYPEID <=", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLike(String value) {
            addCriterion("PROTYPEID like", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotLike(String value) {
            addCriterion("PROTYPEID not like", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidIn(List<String> values) {
            addCriterion("PROTYPEID in", values, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotIn(List<String> values) {
            addCriterion("PROTYPEID not in", values, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidBetween(String value1, String value2) {
            addCriterion("PROTYPEID between", value1, value2, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotBetween(String value1, String value2) {
            addCriterion("PROTYPEID not between", value1, value2, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidIsNull() {
            addCriterion("PROTYPESUBID is null");
            return (Criteria) this;
        }

        public Criteria andProtypesubidIsNotNull() {
            addCriterion("PROTYPESUBID is not null");
            return (Criteria) this;
        }

        public Criteria andProtypesubidEqualTo(String value) {
            addCriterion("PROTYPESUBID =", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidNotEqualTo(String value) {
            addCriterion("PROTYPESUBID <>", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidGreaterThan(String value) {
            addCriterion("PROTYPESUBID >", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidGreaterThanOrEqualTo(String value) {
            addCriterion("PROTYPESUBID >=", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidLessThan(String value) {
            addCriterion("PROTYPESUBID <", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidLessThanOrEqualTo(String value) {
            addCriterion("PROTYPESUBID <=", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidLike(String value) {
            addCriterion("PROTYPESUBID like", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidNotLike(String value) {
            addCriterion("PROTYPESUBID not like", value, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidIn(List<String> values) {
            addCriterion("PROTYPESUBID in", values, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidNotIn(List<String> values) {
            addCriterion("PROTYPESUBID not in", values, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidBetween(String value1, String value2) {
            addCriterion("PROTYPESUBID between", value1, value2, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andProtypesubidNotBetween(String value1, String value2) {
            addCriterion("PROTYPESUBID not between", value1, value2, "protypesubid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNull() {
            addCriterion("HOSPITALID is null");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNotNull() {
            addCriterion("HOSPITALID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalidEqualTo(String value) {
            addCriterion("HOSPITALID =", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotEqualTo(String value) {
            addCriterion("HOSPITALID <>", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThan(String value) {
            addCriterion("HOSPITALID >", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALID >=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThan(String value) {
            addCriterion("HOSPITALID <", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALID <=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLike(String value) {
            addCriterion("HOSPITALID like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotLike(String value) {
            addCriterion("HOSPITALID not like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIn(List<String> values) {
            addCriterion("HOSPITALID in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotIn(List<String> values) {
            addCriterion("HOSPITALID not in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidBetween(String value1, String value2) {
            addCriterion("HOSPITALID between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotBetween(String value1, String value2) {
            addCriterion("HOSPITALID not between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNull() {
            addCriterion("HOSPITALNAME is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNotNull() {
            addCriterion("HOSPITALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameEqualTo(String value) {
            addCriterion("HOSPITALNAME =", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotEqualTo(String value) {
            addCriterion("HOSPITALNAME <>", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThan(String value) {
            addCriterion("HOSPITALNAME >", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALNAME >=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThan(String value) {
            addCriterion("HOSPITALNAME <", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALNAME <=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLike(String value) {
            addCriterion("HOSPITALNAME like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotLike(String value) {
            addCriterion("HOSPITALNAME not like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIn(List<String> values) {
            addCriterion("HOSPITALNAME in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotIn(List<String> values) {
            addCriterion("HOSPITALNAME not in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameBetween(String value1, String value2) {
            addCriterion("HOSPITALNAME between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotBetween(String value1, String value2) {
            addCriterion("HOSPITALNAME not between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("DEPID is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("DEPID is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(String value) {
            addCriterion("DEPID =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(String value) {
            addCriterion("DEPID <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(String value) {
            addCriterion("DEPID >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPID >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(String value) {
            addCriterion("DEPID <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(String value) {
            addCriterion("DEPID <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLike(String value) {
            addCriterion("DEPID like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotLike(String value) {
            addCriterion("DEPID not like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<String> values) {
            addCriterion("DEPID in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<String> values) {
            addCriterion("DEPID not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(String value1, String value2) {
            addCriterion("DEPID between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(String value1, String value2) {
            addCriterion("DEPID not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Timestamp value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Timestamp value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Timestamp value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Timestamp value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterionForJDBCDate("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterionForJDBCDate("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterionForJDBCDate("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterionForJDBCDate("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLANDATE not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Timestamp value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Timestamp value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Timestamp value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Timestamp value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Timestamp value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andRealdateIsNull() {
            addCriterion("REALDATE is null");
            return (Criteria) this;
        }

        public Criteria andRealdateIsNotNull() {
            addCriterion("REALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealdateEqualTo(Date value) {
            addCriterionForJDBCDate("REALDATE =", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REALDATE <>", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThan(Date value) {
            addCriterionForJDBCDate("REALDATE >", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REALDATE >=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThan(Date value) {
            addCriterionForJDBCDate("REALDATE <", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REALDATE <=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateIn(List<Date> values) {
            addCriterionForJDBCDate("REALDATE in", values, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REALDATE not in", values, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REALDATE between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REALDATE not between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateEqualTo(Timestamp value) {
            addCriterion("REALDATE =", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotEqualTo(Timestamp value) {
            addCriterion("REALDATE <>", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThan(Timestamp value) {
            addCriterion("REALDATE >", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("REALDATE >=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThan(Timestamp value) {
            addCriterion("REALDATE <", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("REALDATE <=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REALDATE between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REALDATE not between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andPmidIsNull() {
            addCriterion("PMID is null");
            return (Criteria) this;
        }

        public Criteria andPmidIsNotNull() {
            addCriterion("PMID is not null");
            return (Criteria) this;
        }

        public Criteria andPmidEqualTo(String value) {
            addCriterion("PMID =", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(String value) {
            addCriterion("PMID <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(String value) {
            addCriterion("PMID >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(String value) {
            addCriterion("PMID >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(String value) {
            addCriterion("PMID <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(String value) {
            addCriterion("PMID <=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLike(String value) {
            addCriterion("PMID like", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotLike(String value) {
            addCriterion("PMID not like", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidIn(List<String> values) {
            addCriterion("PMID in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<String> values) {
            addCriterion("PMID not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(String value1, String value2) {
            addCriterion("PMID between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(String value1, String value2) {
            addCriterion("PMID not between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmnameIsNull() {
            addCriterion("PMNAME is null");
            return (Criteria) this;
        }

        public Criteria andPmnameIsNotNull() {
            addCriterion("PMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPmnameEqualTo(String value) {
            addCriterion("PMNAME =", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameNotEqualTo(String value) {
            addCriterion("PMNAME <>", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameGreaterThan(String value) {
            addCriterion("PMNAME >", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameGreaterThanOrEqualTo(String value) {
            addCriterion("PMNAME >=", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameLessThan(String value) {
            addCriterion("PMNAME <", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameLessThanOrEqualTo(String value) {
            addCriterion("PMNAME <=", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameLike(String value) {
            addCriterion("PMNAME like", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameNotLike(String value) {
            addCriterion("PMNAME not like", value, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameIn(List<String> values) {
            addCriterion("PMNAME in", values, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameNotIn(List<String> values) {
            addCriterion("PMNAME not in", values, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameBetween(String value1, String value2) {
            addCriterion("PMNAME between", value1, value2, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmnameNotBetween(String value1, String value2) {
            addCriterion("PMNAME not between", value1, value2, "pmname");
            return (Criteria) this;
        }

        public Criteria andPmtelIsNull() {
            addCriterion("PMTEL is null");
            return (Criteria) this;
        }

        public Criteria andPmtelIsNotNull() {
            addCriterion("PMTEL is not null");
            return (Criteria) this;
        }

        public Criteria andPmtelEqualTo(String value) {
            addCriterion("PMTEL =", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelNotEqualTo(String value) {
            addCriterion("PMTEL <>", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelGreaterThan(String value) {
            addCriterion("PMTEL >", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelGreaterThanOrEqualTo(String value) {
            addCriterion("PMTEL >=", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelLessThan(String value) {
            addCriterion("PMTEL <", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelLessThanOrEqualTo(String value) {
            addCriterion("PMTEL <=", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelLike(String value) {
            addCriterion("PMTEL like", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelNotLike(String value) {
            addCriterion("PMTEL not like", value, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelIn(List<String> values) {
            addCriterion("PMTEL in", values, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelNotIn(List<String> values) {
            addCriterion("PMTEL not in", values, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelBetween(String value1, String value2) {
            addCriterion("PMTEL between", value1, value2, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmtelNotBetween(String value1, String value2) {
            addCriterion("PMTEL not between", value1, value2, "pmtel");
            return (Criteria) this;
        }

        public Criteria andPmemailIsNull() {
            addCriterion("PMEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andPmemailIsNotNull() {
            addCriterion("PMEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPmemailEqualTo(String value) {
            addCriterion("PMEMAIL =", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailNotEqualTo(String value) {
            addCriterion("PMEMAIL <>", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailGreaterThan(String value) {
            addCriterion("PMEMAIL >", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailGreaterThanOrEqualTo(String value) {
            addCriterion("PMEMAIL >=", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailLessThan(String value) {
            addCriterion("PMEMAIL <", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailLessThanOrEqualTo(String value) {
            addCriterion("PMEMAIL <=", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailLike(String value) {
            addCriterion("PMEMAIL like", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailNotLike(String value) {
            addCriterion("PMEMAIL not like", value, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailIn(List<String> values) {
            addCriterion("PMEMAIL in", values, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailNotIn(List<String> values) {
            addCriterion("PMEMAIL not in", values, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailBetween(String value1, String value2) {
            addCriterion("PMEMAIL between", value1, value2, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPmemailNotBetween(String value1, String value2) {
            addCriterion("PMEMAIL not between", value1, value2, "pmemail");
            return (Criteria) this;
        }

        public Criteria andPromarkIsNull() {
            addCriterion("PROMARK is null");
            return (Criteria) this;
        }

        public Criteria andPromarkIsNotNull() {
            addCriterion("PROMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPromarkEqualTo(String value) {
            addCriterion("PROMARK =", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkNotEqualTo(String value) {
            addCriterion("PROMARK <>", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkGreaterThan(String value) {
            addCriterion("PROMARK >", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkGreaterThanOrEqualTo(String value) {
            addCriterion("PROMARK >=", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkLessThan(String value) {
            addCriterion("PROMARK <", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkLessThanOrEqualTo(String value) {
            addCriterion("PROMARK <=", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkLike(String value) {
            addCriterion("PROMARK like", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkNotLike(String value) {
            addCriterion("PROMARK not like", value, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkIn(List<String> values) {
            addCriterion("PROMARK in", values, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkNotIn(List<String> values) {
            addCriterion("PROMARK not in", values, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkBetween(String value1, String value2) {
            addCriterion("PROMARK between", value1, value2, "promark");
            return (Criteria) this;
        }

        public Criteria andPromarkNotBetween(String value1, String value2) {
            addCriterion("PROMARK not between", value1, value2, "promark");
            return (Criteria) this;
        }

        public Criteria andProstateIsNull() {
            addCriterion("PROSTATE is null");
            return (Criteria) this;
        }

        public Criteria andProstateIsNotNull() {
            addCriterion("PROSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andProstateEqualTo(String value) {
            addCriterion("PROSTATE =", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotEqualTo(String value) {
            addCriterion("PROSTATE <>", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateGreaterThan(String value) {
            addCriterion("PROSTATE >", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateGreaterThanOrEqualTo(String value) {
            addCriterion("PROSTATE >=", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLessThan(String value) {
            addCriterion("PROSTATE <", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLessThanOrEqualTo(String value) {
            addCriterion("PROSTATE <=", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLike(String value) {
            addCriterion("PROSTATE like", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotLike(String value) {
            addCriterion("PROSTATE not like", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateIn(List<String> values) {
            addCriterion("PROSTATE in", values, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotIn(List<String> values) {
            addCriterion("PROSTATE not in", values, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateBetween(String value1, String value2) {
            addCriterion("PROSTATE between", value1, value2, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotBetween(String value1, String value2) {
            addCriterion("PROSTATE not between", value1, value2, "prostate");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkIsNull() {
            addCriterion("SUBMITREMARK is null");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkIsNotNull() {
            addCriterion("SUBMITREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkEqualTo(String value) {
            addCriterion("SUBMITREMARK =", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkNotEqualTo(String value) {
            addCriterion("SUBMITREMARK <>", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkGreaterThan(String value) {
            addCriterion("SUBMITREMARK >", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITREMARK >=", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkLessThan(String value) {
            addCriterion("SUBMITREMARK <", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkLessThanOrEqualTo(String value) {
            addCriterion("SUBMITREMARK <=", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkLike(String value) {
            addCriterion("SUBMITREMARK like", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkNotLike(String value) {
            addCriterion("SUBMITREMARK not like", value, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkIn(List<String> values) {
            addCriterion("SUBMITREMARK in", values, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkNotIn(List<String> values) {
            addCriterion("SUBMITREMARK not in", values, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkBetween(String value1, String value2) {
            addCriterion("SUBMITREMARK between", value1, value2, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSubmitremarkNotBetween(String value1, String value2) {
            addCriterion("SUBMITREMARK not between", value1, value2, "submitremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkIsNull() {
            addCriterion("SETREMARK is null");
            return (Criteria) this;
        }

        public Criteria andSetremarkIsNotNull() {
            addCriterion("SETREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSetremarkEqualTo(String value) {
            addCriterion("SETREMARK =", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkNotEqualTo(String value) {
            addCriterion("SETREMARK <>", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkGreaterThan(String value) {
            addCriterion("SETREMARK >", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkGreaterThanOrEqualTo(String value) {
            addCriterion("SETREMARK >=", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkLessThan(String value) {
            addCriterion("SETREMARK <", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkLessThanOrEqualTo(String value) {
            addCriterion("SETREMARK <=", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkLike(String value) {
            addCriterion("SETREMARK like", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkNotLike(String value) {
            addCriterion("SETREMARK not like", value, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkIn(List<String> values) {
            addCriterion("SETREMARK in", values, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkNotIn(List<String> values) {
            addCriterion("SETREMARK not in", values, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkBetween(String value1, String value2) {
            addCriterion("SETREMARK between", value1, value2, "setremark");
            return (Criteria) this;
        }

        public Criteria andSetremarkNotBetween(String value1, String value2) {
            addCriterion("SETREMARK not between", value1, value2, "setremark");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("SUBMITDATE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("SUBMITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterionForJDBCDate("SUBMITDATE =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SUBMITDATE <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("SUBMITDATE >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SUBMITDATE >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterionForJDBCDate("SUBMITDATE <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SUBMITDATE <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterionForJDBCDate("SUBMITDATE in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SUBMITDATE not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SUBMITDATE between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SUBMITDATE not between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Timestamp value) {
            addCriterion("SUBMITDATE =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Timestamp value) {
            addCriterion("SUBMITDATE <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Timestamp value) {
            addCriterion("SUBMITDATE >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SUBMITDATE >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Timestamp value) {
            addCriterion("SUBMITDATE <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("SUBMITDATE <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SUBMITDATE between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SUBMITDATE not between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNull() {
            addCriterion("SETDATE is null");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNotNull() {
            addCriterion("SETDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSetdateEqualTo(Date value) {
            addCriterionForJDBCDate("SETDATE =", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SETDATE <>", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThan(Date value) {
            addCriterionForJDBCDate("SETDATE >", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETDATE >=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThan(Date value) {
            addCriterionForJDBCDate("SETDATE <", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETDATE <=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateIn(List<Date> values) {
            addCriterionForJDBCDate("SETDATE in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SETDATE not in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETDATE between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETDATE not between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateEqualTo(Timestamp value) {
            addCriterion("SETDATE =", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotEqualTo(Timestamp value) {
            addCriterion("SETDATE <>", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThan(Timestamp value) {
            addCriterion("SETDATE >", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SETDATE >=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThan(Timestamp value) {
            addCriterion("SETDATE <", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("SETDATE <=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SETDATE between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SETDATE not between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterionForJDBCDate("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterionForJDBCDate("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Timestamp value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Timestamp value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Timestamp value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Timestamp value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CREATEUSERID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CREATEUSERID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CREATEUSERID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CREATEUSERID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CREATEUSERID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CREATEUSERID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CREATEUSERID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CREATEUSERID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CREATEUSERID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("CREATEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("CREATEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("CREATEUSERNAME =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("CREATEUSERNAME <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("CREATEUSERNAME >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("CREATEUSERNAME <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("CREATEUSERNAME like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("CREATEUSERNAME not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("CREATEUSERNAME in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("CREATEUSERNAME not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME not between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Timestamp value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Timestamp value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Timestamp value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Timestamp value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNull() {
            addCriterion("RESULTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNotNull() {
            addCriterion("RESULTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResulttypeEqualTo(String value) {
            addCriterion("RESULTTYPE =", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotEqualTo(String value) {
            addCriterion("RESULTTYPE <>", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThan(String value) {
            addCriterion("RESULTTYPE >", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTTYPE >=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThan(String value) {
            addCriterion("RESULTTYPE <", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThanOrEqualTo(String value) {
            addCriterion("RESULTTYPE <=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLike(String value) {
            addCriterion("RESULTTYPE like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotLike(String value) {
            addCriterion("RESULTTYPE not like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeIn(List<String> values) {
            addCriterion("RESULTTYPE in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotIn(List<String> values) {
            addCriterion("RESULTTYPE not in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeBetween(String value1, String value2) {
            addCriterion("RESULTTYPE between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotBetween(String value1, String value2) {
            addCriterion("RESULTTYPE not between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andContractfundsIsNull() {
            addCriterion("CONTRACTFUNDS is null");
            return (Criteria) this;
        }

        public Criteria andContractfundsIsNotNull() {
            addCriterion("CONTRACTFUNDS is not null");
            return (Criteria) this;
        }

        public Criteria andContractfundsEqualTo(BigDecimal value) {
            addCriterion("CONTRACTFUNDS =", value, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACTFUNDS <>", value, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsGreaterThan(BigDecimal value) {
            addCriterion("CONTRACTFUNDS >", value, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTFUNDS >=", value, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsLessThan(BigDecimal value) {
            addCriterion("CONTRACTFUNDS <", value, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTFUNDS <=", value, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsIn(List<BigDecimal> values) {
            addCriterion("CONTRACTFUNDS in", values, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACTFUNDS not in", values, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTFUNDS between", value1, value2, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andContractfundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTFUNDS not between", value1, value2, "contractfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsIsNull() {
            addCriterion("COMPANIONFUNDS is null");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsIsNotNull() {
            addCriterion("COMPANIONFUNDS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsEqualTo(BigDecimal value) {
            addCriterion("COMPANIONFUNDS =", value, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsNotEqualTo(BigDecimal value) {
            addCriterion("COMPANIONFUNDS <>", value, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsGreaterThan(BigDecimal value) {
            addCriterion("COMPANIONFUNDS >", value, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANIONFUNDS >=", value, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsLessThan(BigDecimal value) {
            addCriterion("COMPANIONFUNDS <", value, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANIONFUNDS <=", value, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsIn(List<BigDecimal> values) {
            addCriterion("COMPANIONFUNDS in", values, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsNotIn(List<BigDecimal> values) {
            addCriterion("COMPANIONFUNDS not in", values, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANIONFUNDS between", value1, value2, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andCompanionfundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANIONFUNDS not between", value1, value2, "companionfunds");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeIsNull() {
            addCriterion("SUBJECTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeIsNotNull() {
            addCriterion("SUBJECTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeEqualTo(String value) {
            addCriterion("SUBJECTTYPE =", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeNotEqualTo(String value) {
            addCriterion("SUBJECTTYPE <>", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeGreaterThan(String value) {
            addCriterion("SUBJECTTYPE >", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTTYPE >=", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeLessThan(String value) {
            addCriterion("SUBJECTTYPE <", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTTYPE <=", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeLike(String value) {
            addCriterion("SUBJECTTYPE like", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeNotLike(String value) {
            addCriterion("SUBJECTTYPE not like", value, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeIn(List<String> values) {
            addCriterion("SUBJECTTYPE in", values, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeNotIn(List<String> values) {
            addCriterion("SUBJECTTYPE not in", values, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeBetween(String value1, String value2) {
            addCriterion("SUBJECTTYPE between", value1, value2, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andSubjecttypeNotBetween(String value1, String value2) {
            addCriterion("SUBJECTTYPE not between", value1, value2, "subjecttype");
            return (Criteria) this;
        }

        public Criteria andExploretypeIsNull() {
            addCriterion("EXPLORETYPE is null");
            return (Criteria) this;
        }

        public Criteria andExploretypeIsNotNull() {
            addCriterion("EXPLORETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExploretypeEqualTo(String value) {
            addCriterion("EXPLORETYPE =", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeNotEqualTo(String value) {
            addCriterion("EXPLORETYPE <>", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeGreaterThan(String value) {
            addCriterion("EXPLORETYPE >", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLORETYPE >=", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeLessThan(String value) {
            addCriterion("EXPLORETYPE <", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeLessThanOrEqualTo(String value) {
            addCriterion("EXPLORETYPE <=", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeLike(String value) {
            addCriterion("EXPLORETYPE like", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeNotLike(String value) {
            addCriterion("EXPLORETYPE not like", value, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeIn(List<String> values) {
            addCriterion("EXPLORETYPE in", values, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeNotIn(List<String> values) {
            addCriterion("EXPLORETYPE not in", values, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeBetween(String value1, String value2) {
            addCriterion("EXPLORETYPE between", value1, value2, "exploretype");
            return (Criteria) this;
        }

        public Criteria andExploretypeNotBetween(String value1, String value2) {
            addCriterion("EXPLORETYPE not between", value1, value2, "exploretype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNull() {
            addCriterion("CONTRACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("CONTRACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("CONTRACTTYPE =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("CONTRACTTYPE <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("CONTRACTTYPE >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("CONTRACTTYPE <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("CONTRACTTYPE like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("CONTRACTTYPE not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("CONTRACTTYPE in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("CONTRACTTYPE not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE not between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andDesignmajorIsNull() {
            addCriterion("DESIGNMAJOR is null");
            return (Criteria) this;
        }

        public Criteria andDesignmajorIsNotNull() {
            addCriterion("DESIGNMAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andDesignmajorEqualTo(String value) {
            addCriterion("DESIGNMAJOR =", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorNotEqualTo(String value) {
            addCriterion("DESIGNMAJOR <>", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorGreaterThan(String value) {
            addCriterion("DESIGNMAJOR >", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGNMAJOR >=", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorLessThan(String value) {
            addCriterion("DESIGNMAJOR <", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorLessThanOrEqualTo(String value) {
            addCriterion("DESIGNMAJOR <=", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorLike(String value) {
            addCriterion("DESIGNMAJOR like", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorNotLike(String value) {
            addCriterion("DESIGNMAJOR not like", value, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorIn(List<String> values) {
            addCriterion("DESIGNMAJOR in", values, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorNotIn(List<String> values) {
            addCriterion("DESIGNMAJOR not in", values, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorBetween(String value1, String value2) {
            addCriterion("DESIGNMAJOR between", value1, value2, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDesignmajorNotBetween(String value1, String value2) {
            addCriterion("DESIGNMAJOR not between", value1, value2, "designmajor");
            return (Criteria) this;
        }

        public Criteria andDevfiledIsNull() {
            addCriterion("DEVFILED is null");
            return (Criteria) this;
        }

        public Criteria andDevfiledIsNotNull() {
            addCriterion("DEVFILED is not null");
            return (Criteria) this;
        }

        public Criteria andDevfiledEqualTo(String value) {
            addCriterion("DEVFILED =", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledNotEqualTo(String value) {
            addCriterion("DEVFILED <>", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledGreaterThan(String value) {
            addCriterion("DEVFILED >", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledGreaterThanOrEqualTo(String value) {
            addCriterion("DEVFILED >=", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledLessThan(String value) {
            addCriterion("DEVFILED <", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledLessThanOrEqualTo(String value) {
            addCriterion("DEVFILED <=", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledLike(String value) {
            addCriterion("DEVFILED like", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledNotLike(String value) {
            addCriterion("DEVFILED not like", value, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledIn(List<String> values) {
            addCriterion("DEVFILED in", values, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledNotIn(List<String> values) {
            addCriterion("DEVFILED not in", values, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledBetween(String value1, String value2) {
            addCriterion("DEVFILED between", value1, value2, "devfiled");
            return (Criteria) this;
        }

        public Criteria andDevfiledNotBetween(String value1, String value2) {
            addCriterion("DEVFILED not between", value1, value2, "devfiled");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceIsNull() {
            addCriterion("TECHNIQUESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceIsNotNull() {
            addCriterion("TECHNIQUESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceEqualTo(String value) {
            addCriterion("TECHNIQUESOURCE =", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceNotEqualTo(String value) {
            addCriterion("TECHNIQUESOURCE <>", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceGreaterThan(String value) {
            addCriterion("TECHNIQUESOURCE >", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNIQUESOURCE >=", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceLessThan(String value) {
            addCriterion("TECHNIQUESOURCE <", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceLessThanOrEqualTo(String value) {
            addCriterion("TECHNIQUESOURCE <=", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceLike(String value) {
            addCriterion("TECHNIQUESOURCE like", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceNotLike(String value) {
            addCriterion("TECHNIQUESOURCE not like", value, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceIn(List<String> values) {
            addCriterion("TECHNIQUESOURCE in", values, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceNotIn(List<String> values) {
            addCriterion("TECHNIQUESOURCE not in", values, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceBetween(String value1, String value2) {
            addCriterion("TECHNIQUESOURCE between", value1, value2, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andTechniquesourceNotBetween(String value1, String value2) {
            addCriterion("TECHNIQUESOURCE not between", value1, value2, "techniquesource");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyIsNull() {
            addCriterion("INTELLECTUALPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyIsNotNull() {
            addCriterion("INTELLECTUALPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyEqualTo(String value) {
            addCriterion("INTELLECTUALPROPERTY =", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyNotEqualTo(String value) {
            addCriterion("INTELLECTUALPROPERTY <>", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyGreaterThan(String value) {
            addCriterion("INTELLECTUALPROPERTY >", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("INTELLECTUALPROPERTY >=", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyLessThan(String value) {
            addCriterion("INTELLECTUALPROPERTY <", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyLessThanOrEqualTo(String value) {
            addCriterion("INTELLECTUALPROPERTY <=", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyLike(String value) {
            addCriterion("INTELLECTUALPROPERTY like", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyNotLike(String value) {
            addCriterion("INTELLECTUALPROPERTY not like", value, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyIn(List<String> values) {
            addCriterion("INTELLECTUALPROPERTY in", values, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyNotIn(List<String> values) {
            addCriterion("INTELLECTUALPROPERTY not in", values, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyBetween(String value1, String value2) {
            addCriterion("INTELLECTUALPROPERTY between", value1, value2, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andIntellectualpropertyNotBetween(String value1, String value2) {
            addCriterion("INTELLECTUALPROPERTY not between", value1, value2, "intellectualproperty");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueIsNull() {
            addCriterion("PLANINCREASEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueIsNotNull() {
            addCriterion("PLANINCREASEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueEqualTo(BigDecimal value) {
            addCriterion("PLANINCREASEVALUE =", value, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueNotEqualTo(BigDecimal value) {
            addCriterion("PLANINCREASEVALUE <>", value, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueGreaterThan(BigDecimal value) {
            addCriterion("PLANINCREASEVALUE >", value, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANINCREASEVALUE >=", value, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueLessThan(BigDecimal value) {
            addCriterion("PLANINCREASEVALUE <", value, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANINCREASEVALUE <=", value, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueIn(List<BigDecimal> values) {
            addCriterion("PLANINCREASEVALUE in", values, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueNotIn(List<BigDecimal> values) {
            addCriterion("PLANINCREASEVALUE not in", values, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANINCREASEVALUE between", value1, value2, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlanincreasevalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANINCREASEVALUE not between", value1, value2, "planincreasevalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueIsNull() {
            addCriterion("PLANTOTALVALUE is null");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueIsNotNull() {
            addCriterion("PLANTOTALVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueEqualTo(BigDecimal value) {
            addCriterion("PLANTOTALVALUE =", value, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueNotEqualTo(BigDecimal value) {
            addCriterion("PLANTOTALVALUE <>", value, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueGreaterThan(BigDecimal value) {
            addCriterion("PLANTOTALVALUE >", value, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANTOTALVALUE >=", value, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueLessThan(BigDecimal value) {
            addCriterion("PLANTOTALVALUE <", value, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANTOTALVALUE <=", value, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueIn(List<BigDecimal> values) {
            addCriterion("PLANTOTALVALUE in", values, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueNotIn(List<BigDecimal> values) {
            addCriterion("PLANTOTALVALUE not in", values, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANTOTALVALUE between", value1, value2, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andPlantotalvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANTOTALVALUE not between", value1, value2, "plantotalvalue");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailIsNull() {
            addCriterion("PROTECHNIQUEDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailIsNotNull() {
            addCriterion("PROTECHNIQUEDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailEqualTo(String value) {
            addCriterion("PROTECHNIQUEDETAIL =", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailNotEqualTo(String value) {
            addCriterion("PROTECHNIQUEDETAIL <>", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailGreaterThan(String value) {
            addCriterion("PROTECHNIQUEDETAIL >", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailGreaterThanOrEqualTo(String value) {
            addCriterion("PROTECHNIQUEDETAIL >=", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailLessThan(String value) {
            addCriterion("PROTECHNIQUEDETAIL <", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailLessThanOrEqualTo(String value) {
            addCriterion("PROTECHNIQUEDETAIL <=", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailLike(String value) {
            addCriterion("PROTECHNIQUEDETAIL like", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailNotLike(String value) {
            addCriterion("PROTECHNIQUEDETAIL not like", value, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailIn(List<String> values) {
            addCriterion("PROTECHNIQUEDETAIL in", values, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailNotIn(List<String> values) {
            addCriterion("PROTECHNIQUEDETAIL not in", values, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailBetween(String value1, String value2) {
            addCriterion("PROTECHNIQUEDETAIL between", value1, value2, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andProtechniquedetailNotBetween(String value1, String value2) {
            addCriterion("PROTECHNIQUEDETAIL not between", value1, value2, "protechniquedetail");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsIsNull() {
            addCriterion("HISTORICALACHIEVEMENTS is null");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsIsNotNull() {
            addCriterion("HISTORICALACHIEVEMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsEqualTo(String value) {
            addCriterion("HISTORICALACHIEVEMENTS =", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsNotEqualTo(String value) {
            addCriterion("HISTORICALACHIEVEMENTS <>", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsGreaterThan(String value) {
            addCriterion("HISTORICALACHIEVEMENTS >", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORICALACHIEVEMENTS >=", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsLessThan(String value) {
            addCriterion("HISTORICALACHIEVEMENTS <", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsLessThanOrEqualTo(String value) {
            addCriterion("HISTORICALACHIEVEMENTS <=", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsLike(String value) {
            addCriterion("HISTORICALACHIEVEMENTS like", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsNotLike(String value) {
            addCriterion("HISTORICALACHIEVEMENTS not like", value, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsIn(List<String> values) {
            addCriterion("HISTORICALACHIEVEMENTS in", values, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsNotIn(List<String> values) {
            addCriterion("HISTORICALACHIEVEMENTS not in", values, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsBetween(String value1, String value2) {
            addCriterion("HISTORICALACHIEVEMENTS between", value1, value2, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andHistoricalachievementsNotBetween(String value1, String value2) {
            addCriterion("HISTORICALACHIEVEMENTS not between", value1, value2, "historicalachievements");
            return (Criteria) this;
        }

        public Criteria andCheckstateIsNull() {
            addCriterion("CHECKSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckstateIsNotNull() {
            addCriterion("CHECKSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstateEqualTo(String value) {
            addCriterion("CHECKSTATE =", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotEqualTo(String value) {
            addCriterion("CHECKSTATE <>", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateGreaterThan(String value) {
            addCriterion("CHECKSTATE >", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTATE >=", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLessThan(String value) {
            addCriterion("CHECKSTATE <", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTATE <=", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLike(String value) {
            addCriterion("CHECKSTATE like", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotLike(String value) {
            addCriterion("CHECKSTATE not like", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateIn(List<String> values) {
            addCriterion("CHECKSTATE in", values, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotIn(List<String> values) {
            addCriterion("CHECKSTATE not in", values, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateBetween(String value1, String value2) {
            addCriterion("CHECKSTATE between", value1, value2, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotBetween(String value1, String value2) {
            addCriterion("CHECKSTATE not between", value1, value2, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidIsNull() {
            addCriterion("CHECKOBJECTID is null");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidIsNotNull() {
            addCriterion("CHECKOBJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidEqualTo(String value) {
            addCriterion("CHECKOBJECTID =", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidNotEqualTo(String value) {
            addCriterion("CHECKOBJECTID <>", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidGreaterThan(String value) {
            addCriterion("CHECKOBJECTID >", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKOBJECTID >=", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidLessThan(String value) {
            addCriterion("CHECKOBJECTID <", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidLessThanOrEqualTo(String value) {
            addCriterion("CHECKOBJECTID <=", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidLike(String value) {
            addCriterion("CHECKOBJECTID like", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidNotLike(String value) {
            addCriterion("CHECKOBJECTID not like", value, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidIn(List<String> values) {
            addCriterion("CHECKOBJECTID in", values, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidNotIn(List<String> values) {
            addCriterion("CHECKOBJECTID not in", values, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidBetween(String value1, String value2) {
            addCriterion("CHECKOBJECTID between", value1, value2, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andCheckobjectidNotBetween(String value1, String value2) {
            addCriterion("CHECKOBJECTID not between", value1, value2, "checkobjectid");
            return (Criteria) this;
        }

        public Criteria andIsusercheckIsNull() {
            addCriterion("ISUSERCHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsusercheckIsNotNull() {
            addCriterion("ISUSERCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsusercheckEqualTo(String value) {
            addCriterion("ISUSERCHECK =", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckNotEqualTo(String value) {
            addCriterion("ISUSERCHECK <>", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckGreaterThan(String value) {
            addCriterion("ISUSERCHECK >", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckGreaterThanOrEqualTo(String value) {
            addCriterion("ISUSERCHECK >=", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckLessThan(String value) {
            addCriterion("ISUSERCHECK <", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckLessThanOrEqualTo(String value) {
            addCriterion("ISUSERCHECK <=", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckLike(String value) {
            addCriterion("ISUSERCHECK like", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckNotLike(String value) {
            addCriterion("ISUSERCHECK not like", value, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckIn(List<String> values) {
            addCriterion("ISUSERCHECK in", values, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckNotIn(List<String> values) {
            addCriterion("ISUSERCHECK not in", values, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckBetween(String value1, String value2) {
            addCriterion("ISUSERCHECK between", value1, value2, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andIsusercheckNotBetween(String value1, String value2) {
            addCriterion("ISUSERCHECK not between", value1, value2, "isusercheck");
            return (Criteria) this;
        }

        public Criteria andCheckorderIsNull() {
            addCriterion("CHECKORDER is null");
            return (Criteria) this;
        }

        public Criteria andCheckorderIsNotNull() {
            addCriterion("CHECKORDER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckorderEqualTo(String value) {
            addCriterion("CHECKORDER =", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotEqualTo(String value) {
            addCriterion("CHECKORDER <>", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderGreaterThan(String value) {
            addCriterion("CHECKORDER >", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKORDER >=", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderLessThan(String value) {
            addCriterion("CHECKORDER <", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderLessThanOrEqualTo(String value) {
            addCriterion("CHECKORDER <=", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderLike(String value) {
            addCriterion("CHECKORDER like", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotLike(String value) {
            addCriterion("CHECKORDER not like", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderIn(List<String> values) {
            addCriterion("CHECKORDER in", values, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotIn(List<String> values) {
            addCriterion("CHECKORDER not in", values, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderBetween(String value1, String value2) {
            addCriterion("CHECKORDER between", value1, value2, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotBetween(String value1, String value2) {
            addCriterion("CHECKORDER not between", value1, value2, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidIsNull() {
            addCriterion("CHECKGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidIsNotNull() {
            addCriterion("CHECKGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidEqualTo(String value) {
            addCriterion("CHECKGROUPID =", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidNotEqualTo(String value) {
            addCriterion("CHECKGROUPID <>", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidGreaterThan(String value) {
            addCriterion("CHECKGROUPID >", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKGROUPID >=", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidLessThan(String value) {
            addCriterion("CHECKGROUPID <", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidLessThanOrEqualTo(String value) {
            addCriterion("CHECKGROUPID <=", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidLike(String value) {
            addCriterion("CHECKGROUPID like", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidNotLike(String value) {
            addCriterion("CHECKGROUPID not like", value, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidIn(List<String> values) {
            addCriterion("CHECKGROUPID in", values, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidNotIn(List<String> values) {
            addCriterion("CHECKGROUPID not in", values, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidBetween(String value1, String value2) {
            addCriterion("CHECKGROUPID between", value1, value2, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andCheckgroupidNotBetween(String value1, String value2) {
            addCriterion("CHECKGROUPID not between", value1, value2, "checkgroupid");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNull() {
            addCriterion("REMARKS1 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNotNull() {
            addCriterion("REMARKS1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks1EqualTo(String value) {
            addCriterion("REMARKS1 =", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotEqualTo(String value) {
            addCriterion("REMARKS1 <>", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThan(String value) {
            addCriterion("REMARKS1 >", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS1 >=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThan(String value) {
            addCriterion("REMARKS1 <", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThanOrEqualTo(String value) {
            addCriterion("REMARKS1 <=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Like(String value) {
            addCriterion("REMARKS1 like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotLike(String value) {
            addCriterion("REMARKS1 not like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1In(List<String> values) {
            addCriterion("REMARKS1 in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotIn(List<String> values) {
            addCriterion("REMARKS1 not in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Between(String value1, String value2) {
            addCriterion("REMARKS1 between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotBetween(String value1, String value2) {
            addCriterion("REMARKS1 not between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks2IsNull() {
            addCriterion("REMARKS2 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks2IsNotNull() {
            addCriterion("REMARKS2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks2EqualTo(String value) {
            addCriterion("REMARKS2 =", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotEqualTo(String value) {
            addCriterion("REMARKS2 <>", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2GreaterThan(String value) {
            addCriterion("REMARKS2 >", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS2 >=", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2LessThan(String value) {
            addCriterion("REMARKS2 <", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2LessThanOrEqualTo(String value) {
            addCriterion("REMARKS2 <=", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2Like(String value) {
            addCriterion("REMARKS2 like", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotLike(String value) {
            addCriterion("REMARKS2 not like", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2In(List<String> values) {
            addCriterion("REMARKS2 in", values, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotIn(List<String> values) {
            addCriterion("REMARKS2 not in", values, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2Between(String value1, String value2) {
            addCriterion("REMARKS2 between", value1, value2, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotBetween(String value1, String value2) {
            addCriterion("REMARKS2 not between", value1, value2, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks3IsNull() {
            addCriterion("REMARKS3 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks3IsNotNull() {
            addCriterion("REMARKS3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks3EqualTo(String value) {
            addCriterion("REMARKS3 =", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotEqualTo(String value) {
            addCriterion("REMARKS3 <>", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3GreaterThan(String value) {
            addCriterion("REMARKS3 >", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3GreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS3 >=", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3LessThan(String value) {
            addCriterion("REMARKS3 <", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3LessThanOrEqualTo(String value) {
            addCriterion("REMARKS3 <=", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3Like(String value) {
            addCriterion("REMARKS3 like", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotLike(String value) {
            addCriterion("REMARKS3 not like", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3In(List<String> values) {
            addCriterion("REMARKS3 in", values, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotIn(List<String> values) {
            addCriterion("REMARKS3 not in", values, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3Between(String value1, String value2) {
            addCriterion("REMARKS3 between", value1, value2, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotBetween(String value1, String value2) {
            addCriterion("REMARKS3 not between", value1, value2, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks4IsNull() {
            addCriterion("REMARKS4 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks4IsNotNull() {
            addCriterion("REMARKS4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks4EqualTo(String value) {
            addCriterion("REMARKS4 =", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotEqualTo(String value) {
            addCriterion("REMARKS4 <>", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4GreaterThan(String value) {
            addCriterion("REMARKS4 >", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4GreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS4 >=", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4LessThan(String value) {
            addCriterion("REMARKS4 <", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4LessThanOrEqualTo(String value) {
            addCriterion("REMARKS4 <=", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4Like(String value) {
            addCriterion("REMARKS4 like", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotLike(String value) {
            addCriterion("REMARKS4 not like", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4In(List<String> values) {
            addCriterion("REMARKS4 in", values, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotIn(List<String> values) {
            addCriterion("REMARKS4 not in", values, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4Between(String value1, String value2) {
            addCriterion("REMARKS4 between", value1, value2, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotBetween(String value1, String value2) {
            addCriterion("REMARKS4 not between", value1, value2, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks5IsNull() {
            addCriterion("REMARKS5 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks5IsNotNull() {
            addCriterion("REMARKS5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks5EqualTo(String value) {
            addCriterion("REMARKS5 =", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotEqualTo(String value) {
            addCriterion("REMARKS5 <>", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5GreaterThan(String value) {
            addCriterion("REMARKS5 >", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5GreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS5 >=", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5LessThan(String value) {
            addCriterion("REMARKS5 <", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5LessThanOrEqualTo(String value) {
            addCriterion("REMARKS5 <=", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5Like(String value) {
            addCriterion("REMARKS5 like", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotLike(String value) {
            addCriterion("REMARKS5 not like", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5In(List<String> values) {
            addCriterion("REMARKS5 in", values, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotIn(List<String> values) {
            addCriterion("REMARKS5 not in", values, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5Between(String value1, String value2) {
            addCriterion("REMARKS5 between", value1, value2, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotBetween(String value1, String value2) {
            addCriterion("REMARKS5 not between", value1, value2, "remarks5");
            return (Criteria) this;
        }

        public Criteria andOperateuseridIsNull() {
            addCriterion("OPERATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andOperateuseridIsNotNull() {
            addCriterion("OPERATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateuseridEqualTo(String value) {
            addCriterion("OPERATEUSERID =", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridNotEqualTo(String value) {
            addCriterion("OPERATEUSERID <>", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridGreaterThan(String value) {
            addCriterion("OPERATEUSERID >", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEUSERID >=", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridLessThan(String value) {
            addCriterion("OPERATEUSERID <", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridLessThanOrEqualTo(String value) {
            addCriterion("OPERATEUSERID <=", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridLike(String value) {
            addCriterion("OPERATEUSERID like", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridNotLike(String value) {
            addCriterion("OPERATEUSERID not like", value, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridIn(List<String> values) {
            addCriterion("OPERATEUSERID in", values, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridNotIn(List<String> values) {
            addCriterion("OPERATEUSERID not in", values, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridBetween(String value1, String value2) {
            addCriterion("OPERATEUSERID between", value1, value2, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateuseridNotBetween(String value1, String value2) {
            addCriterion("OPERATEUSERID not between", value1, value2, "operateuserid");
            return (Criteria) this;
        }

        public Criteria andOperateusernameIsNull() {
            addCriterion("OPERATEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperateusernameIsNotNull() {
            addCriterion("OPERATEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateusernameEqualTo(String value) {
            addCriterion("OPERATEUSERNAME =", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameNotEqualTo(String value) {
            addCriterion("OPERATEUSERNAME <>", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameGreaterThan(String value) {
            addCriterion("OPERATEUSERNAME >", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEUSERNAME >=", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameLessThan(String value) {
            addCriterion("OPERATEUSERNAME <", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameLessThanOrEqualTo(String value) {
            addCriterion("OPERATEUSERNAME <=", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameLike(String value) {
            addCriterion("OPERATEUSERNAME like", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameNotLike(String value) {
            addCriterion("OPERATEUSERNAME not like", value, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameIn(List<String> values) {
            addCriterion("OPERATEUSERNAME in", values, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameNotIn(List<String> values) {
            addCriterion("OPERATEUSERNAME not in", values, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameBetween(String value1, String value2) {
            addCriterion("OPERATEUSERNAME between", value1, value2, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperateusernameNotBetween(String value1, String value2) {
            addCriterion("OPERATEUSERNAME not between", value1, value2, "operateusername");
            return (Criteria) this;
        }

        public Criteria andOperatedateIsNull() {
            addCriterion("OPERATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andOperatedateIsNotNull() {
            addCriterion("OPERATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedateEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATEDATE =", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATEDATE <>", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPERATEDATE >", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATEDATE >=", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateLessThan(Date value) {
            addCriterionForJDBCDate("OPERATEDATE <", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATEDATE <=", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATEDATE in", values, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATEDATE not in", values, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATEDATE between", value1, value2, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATEDATE not between", value1, value2, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateEqualTo(Timestamp value) {
            addCriterion("OPERATEDATE =", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotEqualTo(Timestamp value) {
            addCriterion("OPERATEDATE <>", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateGreaterThan(Timestamp value) {
            addCriterion("OPERATEDATE >", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("OPERATEDATE >=", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateLessThan(Timestamp value) {
            addCriterion("OPERATEDATE <", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("OPERATEDATE <=", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPERATEDATE between", value1, value2, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPERATEDATE not between", value1, value2, "operatedate");
            return (Criteria) this;
        }

        public Criteria andSavedateIsNull() {
            addCriterion("SAVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andSavedateIsNotNull() {
            addCriterion("SAVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSavedateEqualTo(Date value) {
            addCriterionForJDBCDate("SAVEDATE =", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SAVEDATE <>", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateGreaterThan(Date value) {
            addCriterionForJDBCDate("SAVEDATE >", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAVEDATE >=", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateLessThan(Date value) {
            addCriterionForJDBCDate("SAVEDATE <", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAVEDATE <=", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateIn(List<Date> values) {
            addCriterionForJDBCDate("SAVEDATE in", values, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SAVEDATE not in", values, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAVEDATE between", value1, value2, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAVEDATE not between", value1, value2, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateEqualTo(Timestamp value) {
            addCriterion("SAVEDATE =", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateNotEqualTo(Timestamp value) {
            addCriterion("SAVEDATE <>", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateGreaterThan(Timestamp value) {
            addCriterion("SAVEDATE >", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SAVEDATE >=", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateLessThan(Timestamp value) {
            addCriterion("SAVEDATE <", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("SAVEDATE <=", value, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SAVEDATE between", value1, value2, "savedate");
            return (Criteria) this;
        }

        public Criteria andSavedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SAVEDATE not between", value1, value2, "savedate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}