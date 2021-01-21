package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxLunxunEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_LUNXUN
*表说明教学轮训
  */
public class JxLunxunSqlWhere extends JxLunxunEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxLunxunSqlWhere() {
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andZuidIsNull() {
            addCriterion("ZUID is null");
            return (Criteria) this;
        }

        public Criteria andZuidIsNotNull() {
            addCriterion("ZUID is not null");
            return (Criteria) this;
        }

        public Criteria andZuidEqualTo(String value) {
            addCriterion("ZUID =", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotEqualTo(String value) {
            addCriterion("ZUID <>", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidGreaterThan(String value) {
            addCriterion("ZUID >", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidGreaterThanOrEqualTo(String value) {
            addCriterion("ZUID >=", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidLessThan(String value) {
            addCriterion("ZUID <", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidLessThanOrEqualTo(String value) {
            addCriterion("ZUID <=", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidLike(String value) {
            addCriterion("ZUID like", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotLike(String value) {
            addCriterion("ZUID not like", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidIn(List<String> values) {
            addCriterion("ZUID in", values, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotIn(List<String> values) {
            addCriterion("ZUID not in", values, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidBetween(String value1, String value2) {
            addCriterion("ZUID between", value1, value2, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotBetween(String value1, String value2) {
            addCriterion("ZUID not between", value1, value2, "zuid");
            return (Criteria) this;
        }

        public Criteria andZunameIsNull() {
            addCriterion("ZUNAME is null");
            return (Criteria) this;
        }

        public Criteria andZunameIsNotNull() {
            addCriterion("ZUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andZunameEqualTo(String value) {
            addCriterion("ZUNAME =", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameNotEqualTo(String value) {
            addCriterion("ZUNAME <>", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameGreaterThan(String value) {
            addCriterion("ZUNAME >", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameGreaterThanOrEqualTo(String value) {
            addCriterion("ZUNAME >=", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameLessThan(String value) {
            addCriterion("ZUNAME <", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameLessThanOrEqualTo(String value) {
            addCriterion("ZUNAME <=", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameLike(String value) {
            addCriterion("ZUNAME like", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameNotLike(String value) {
            addCriterion("ZUNAME not like", value, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameIn(List<String> values) {
            addCriterion("ZUNAME in", values, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameNotIn(List<String> values) {
            addCriterion("ZUNAME not in", values, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameBetween(String value1, String value2) {
            addCriterion("ZUNAME between", value1, value2, "zuname");
            return (Criteria) this;
        }

        public Criteria andZunameNotBetween(String value1, String value2) {
            addCriterion("ZUNAME not between", value1, value2, "zuname");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("CLASSID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("CLASSID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("CLASSID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("CLASSID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("CLASSID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("CLASSID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("CLASSID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("CLASSID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("CLASSID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("CLASSID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("CLASSID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("CLASSID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("CLASSID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("CLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("CLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("CLASSNAME =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("CLASSNAME <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("CLASSNAME >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSNAME >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("CLASSNAME <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("CLASSNAME <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("CLASSNAME like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("CLASSNAME not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("CLASSNAME in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("CLASSNAME not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("CLASSNAME between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("CLASSNAME not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DEPTID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DEPTID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
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

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Timestamp value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Timestamp value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Timestamp value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Timestamp value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Timestamp value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("TEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("TEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("TEACHERID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("TEACHERID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("TEACHERID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("TEACHERID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("TEACHERID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("TEACHERID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("TEACHERID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("TEACHERID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("TEACHERID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("TEACHERID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("TEACHERID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("TEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TEACHERNAME =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TEACHERNAME <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TEACHERNAME >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERNAME >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TEACHERNAME <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TEACHERNAME <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TEACHERNAME like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TEACHERNAME not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TEACHERNAME in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TEACHERNAME not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TEACHERNAME between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TEACHERNAME not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachertelIsNull() {
            addCriterion("TEACHERTEL is null");
            return (Criteria) this;
        }

        public Criteria andTeachertelIsNotNull() {
            addCriterion("TEACHERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertelEqualTo(String value) {
            addCriterion("TEACHERTEL =", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotEqualTo(String value) {
            addCriterion("TEACHERTEL <>", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelGreaterThan(String value) {
            addCriterion("TEACHERTEL >", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERTEL >=", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelLessThan(String value) {
            addCriterion("TEACHERTEL <", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelLessThanOrEqualTo(String value) {
            addCriterion("TEACHERTEL <=", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelLike(String value) {
            addCriterion("TEACHERTEL like", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotLike(String value) {
            addCriterion("TEACHERTEL not like", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelIn(List<String> values) {
            addCriterion("TEACHERTEL in", values, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotIn(List<String> values) {
            addCriterion("TEACHERTEL not in", values, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelBetween(String value1, String value2) {
            addCriterion("TEACHERTEL between", value1, value2, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotBetween(String value1, String value2) {
            addCriterion("TEACHERTEL not between", value1, value2, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("NUM like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("NUM not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andWeizhiIsNull() {
            addCriterion("WEIZHI is null");
            return (Criteria) this;
        }

        public Criteria andWeizhiIsNotNull() {
            addCriterion("WEIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andWeizhiEqualTo(String value) {
            addCriterion("WEIZHI =", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotEqualTo(String value) {
            addCriterion("WEIZHI <>", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiGreaterThan(String value) {
            addCriterion("WEIZHI >", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiGreaterThanOrEqualTo(String value) {
            addCriterion("WEIZHI >=", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLessThan(String value) {
            addCriterion("WEIZHI <", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLessThanOrEqualTo(String value) {
            addCriterion("WEIZHI <=", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLike(String value) {
            addCriterion("WEIZHI like", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotLike(String value) {
            addCriterion("WEIZHI not like", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiIn(List<String> values) {
            addCriterion("WEIZHI in", values, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotIn(List<String> values) {
            addCriterion("WEIZHI not in", values, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiBetween(String value1, String value2) {
            addCriterion("WEIZHI between", value1, value2, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotBetween(String value1, String value2) {
            addCriterion("WEIZHI not between", value1, value2, "weizhi");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("EXPLAIN =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("EXPLAIN <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("EXPLAIN >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLAIN >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("EXPLAIN <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("EXPLAIN <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("EXPLAIN like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("EXPLAIN not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("EXPLAIN in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("EXPLAIN not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("EXPLAIN between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("EXPLAIN not between", value1, value2, "explain");
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

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Timestamp value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Timestamp value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Timestamp value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Timestamp value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("REMARK2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("REMARK2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("REMARK2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("REMARK2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("REMARK2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("REMARK2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("REMARK2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("REMARK2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("REMARK2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("REMARK2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("REMARK2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("REMARK3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("REMARK3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("REMARK3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("REMARK3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("REMARK3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("REMARK3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("REMARK3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("REMARK3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("REMARK3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("REMARK3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("REMARK3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("REMARK4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("REMARK4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("REMARK4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("REMARK4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("REMARK4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("REMARK4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("REMARK4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("REMARK4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("REMARK4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("REMARK4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("REMARK4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("REMARK4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("REMARK4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("REMARK5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("REMARK5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("REMARK5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("REMARK5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("REMARK5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("REMARK5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("REMARK5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("REMARK5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("REMARK5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("REMARK5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("REMARK5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("REMARK5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("REMARK5 not between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNull() {
            addCriterion("REMARK6 is null");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNotNull() {
            addCriterion("REMARK6 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark6EqualTo(String value) {
            addCriterion("REMARK6 =", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotEqualTo(String value) {
            addCriterion("REMARK6 <>", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThan(String value) {
            addCriterion("REMARK6 >", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK6 >=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThan(String value) {
            addCriterion("REMARK6 <", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThanOrEqualTo(String value) {
            addCriterion("REMARK6 <=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Like(String value) {
            addCriterion("REMARK6 like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotLike(String value) {
            addCriterion("REMARK6 not like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6In(List<String> values) {
            addCriterion("REMARK6 in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotIn(List<String> values) {
            addCriterion("REMARK6 not in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Between(String value1, String value2) {
            addCriterion("REMARK6 between", value1, value2, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotBetween(String value1, String value2) {
            addCriterion("REMARK6 not between", value1, value2, "remark6");
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