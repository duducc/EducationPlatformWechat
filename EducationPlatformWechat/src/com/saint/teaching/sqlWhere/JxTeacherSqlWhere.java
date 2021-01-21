package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxTeacherEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_TEACHER
*表说明教师信息
  */
public class JxTeacherSqlWhere extends JxTeacherEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxTeacherSqlWhere() {
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

        public Criteria andUsernumberIsNull() {
            addCriterion("USERNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNotNull() {
            addCriterion("USERNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumberEqualTo(String value) {
            addCriterion("USERNUMBER =", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotEqualTo(String value) {
            addCriterion("USERNUMBER <>", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThan(String value) {
            addCriterion("USERNUMBER >", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThanOrEqualTo(String value) {
            addCriterion("USERNUMBER >=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThan(String value) {
            addCriterion("USERNUMBER <", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThanOrEqualTo(String value) {
            addCriterion("USERNUMBER <=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLike(String value) {
            addCriterion("USERNUMBER like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotLike(String value) {
            addCriterion("USERNUMBER not like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberIn(List<String> values) {
            addCriterion("USERNUMBER in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotIn(List<String> values) {
            addCriterion("USERNUMBER not in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberBetween(String value1, String value2) {
            addCriterion("USERNUMBER between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotBetween(String value1, String value2) {
            addCriterion("USERNUMBER not between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(BigDecimal value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(BigDecimal value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(BigDecimal value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(BigDecimal value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<BigDecimal> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<BigDecimal> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("USERTEL is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("USERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("USERTEL =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("USERTEL <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("USERTEL >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("USERTEL >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("USERTEL <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("USERTEL <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("USERTEL like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("USERTEL not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("USERTEL in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("USERTEL not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("USERTEL between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("USERTEL not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andOfficetelIsNull() {
            addCriterion("OFFICETEL is null");
            return (Criteria) this;
        }

        public Criteria andOfficetelIsNotNull() {
            addCriterion("OFFICETEL is not null");
            return (Criteria) this;
        }

        public Criteria andOfficetelEqualTo(String value) {
            addCriterion("OFFICETEL =", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotEqualTo(String value) {
            addCriterion("OFFICETEL <>", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelGreaterThan(String value) {
            addCriterion("OFFICETEL >", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICETEL >=", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLessThan(String value) {
            addCriterion("OFFICETEL <", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLessThanOrEqualTo(String value) {
            addCriterion("OFFICETEL <=", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLike(String value) {
            addCriterion("OFFICETEL like", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotLike(String value) {
            addCriterion("OFFICETEL not like", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelIn(List<String> values) {
            addCriterion("OFFICETEL in", values, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotIn(List<String> values) {
            addCriterion("OFFICETEL not in", values, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelBetween(String value1, String value2) {
            addCriterion("OFFICETEL between", value1, value2, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotBetween(String value1, String value2) {
            addCriterion("OFFICETEL not between", value1, value2, "officetel");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Timestamp value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Timestamp value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Timestamp value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Timestamp value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Timestamp value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmialIsNull() {
            addCriterion("EMIAL is null");
            return (Criteria) this;
        }

        public Criteria andEmialIsNotNull() {
            addCriterion("EMIAL is not null");
            return (Criteria) this;
        }

        public Criteria andEmialEqualTo(String value) {
            addCriterion("EMIAL =", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotEqualTo(String value) {
            addCriterion("EMIAL <>", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialGreaterThan(String value) {
            addCriterion("EMIAL >", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialGreaterThanOrEqualTo(String value) {
            addCriterion("EMIAL >=", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialLessThan(String value) {
            addCriterion("EMIAL <", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialLessThanOrEqualTo(String value) {
            addCriterion("EMIAL <=", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialLike(String value) {
            addCriterion("EMIAL like", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotLike(String value) {
            addCriterion("EMIAL not like", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialIn(List<String> values) {
            addCriterion("EMIAL in", values, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotIn(List<String> values) {
            addCriterion("EMIAL not in", values, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialBetween(String value1, String value2) {
            addCriterion("EMIAL between", value1, value2, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotBetween(String value1, String value2) {
            addCriterion("EMIAL not between", value1, value2, "emial");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTeachtypeIsNull() {
            addCriterion("TEACHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTeachtypeIsNotNull() {
            addCriterion("TEACHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtypeEqualTo(String value) {
            addCriterion("TEACHTYPE =", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeNotEqualTo(String value) {
            addCriterion("TEACHTYPE <>", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeGreaterThan(String value) {
            addCriterion("TEACHTYPE >", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHTYPE >=", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeLessThan(String value) {
            addCriterion("TEACHTYPE <", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeLessThanOrEqualTo(String value) {
            addCriterion("TEACHTYPE <=", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeLike(String value) {
            addCriterion("TEACHTYPE like", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeNotLike(String value) {
            addCriterion("TEACHTYPE not like", value, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeIn(List<String> values) {
            addCriterion("TEACHTYPE in", values, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeNotIn(List<String> values) {
            addCriterion("TEACHTYPE not in", values, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeBetween(String value1, String value2) {
            addCriterion("TEACHTYPE between", value1, value2, "teachtype");
            return (Criteria) this;
        }

        public Criteria andTeachtypeNotBetween(String value1, String value2) {
            addCriterion("TEACHTYPE not between", value1, value2, "teachtype");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andBesteducationIsNull() {
            addCriterion("BESTEDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andBesteducationIsNotNull() {
            addCriterion("BESTEDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andBesteducationEqualTo(String value) {
            addCriterion("BESTEDUCATION =", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationNotEqualTo(String value) {
            addCriterion("BESTEDUCATION <>", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationGreaterThan(String value) {
            addCriterion("BESTEDUCATION >", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationGreaterThanOrEqualTo(String value) {
            addCriterion("BESTEDUCATION >=", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationLessThan(String value) {
            addCriterion("BESTEDUCATION <", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationLessThanOrEqualTo(String value) {
            addCriterion("BESTEDUCATION <=", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationLike(String value) {
            addCriterion("BESTEDUCATION like", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationNotLike(String value) {
            addCriterion("BESTEDUCATION not like", value, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationIn(List<String> values) {
            addCriterion("BESTEDUCATION in", values, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationNotIn(List<String> values) {
            addCriterion("BESTEDUCATION not in", values, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationBetween(String value1, String value2) {
            addCriterion("BESTEDUCATION between", value1, value2, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBesteducationNotBetween(String value1, String value2) {
            addCriterion("BESTEDUCATION not between", value1, value2, "besteducation");
            return (Criteria) this;
        }

        public Criteria andBestschoolIsNull() {
            addCriterion("BESTSCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andBestschoolIsNotNull() {
            addCriterion("BESTSCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andBestschoolEqualTo(String value) {
            addCriterion("BESTSCHOOL =", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolNotEqualTo(String value) {
            addCriterion("BESTSCHOOL <>", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolGreaterThan(String value) {
            addCriterion("BESTSCHOOL >", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolGreaterThanOrEqualTo(String value) {
            addCriterion("BESTSCHOOL >=", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolLessThan(String value) {
            addCriterion("BESTSCHOOL <", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolLessThanOrEqualTo(String value) {
            addCriterion("BESTSCHOOL <=", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolLike(String value) {
            addCriterion("BESTSCHOOL like", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolNotLike(String value) {
            addCriterion("BESTSCHOOL not like", value, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolIn(List<String> values) {
            addCriterion("BESTSCHOOL in", values, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolNotIn(List<String> values) {
            addCriterion("BESTSCHOOL not in", values, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolBetween(String value1, String value2) {
            addCriterion("BESTSCHOOL between", value1, value2, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestschoolNotBetween(String value1, String value2) {
            addCriterion("BESTSCHOOL not between", value1, value2, "bestschool");
            return (Criteria) this;
        }

        public Criteria andBestdegreeIsNull() {
            addCriterion("BESTDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andBestdegreeIsNotNull() {
            addCriterion("BESTDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andBestdegreeEqualTo(String value) {
            addCriterion("BESTDEGREE =", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeNotEqualTo(String value) {
            addCriterion("BESTDEGREE <>", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeGreaterThan(String value) {
            addCriterion("BESTDEGREE >", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("BESTDEGREE >=", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeLessThan(String value) {
            addCriterion("BESTDEGREE <", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeLessThanOrEqualTo(String value) {
            addCriterion("BESTDEGREE <=", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeLike(String value) {
            addCriterion("BESTDEGREE like", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeNotLike(String value) {
            addCriterion("BESTDEGREE not like", value, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeIn(List<String> values) {
            addCriterion("BESTDEGREE in", values, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeNotIn(List<String> values) {
            addCriterion("BESTDEGREE not in", values, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeBetween(String value1, String value2) {
            addCriterion("BESTDEGREE between", value1, value2, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andBestdegreeNotBetween(String value1, String value2) {
            addCriterion("BESTDEGREE not between", value1, value2, "bestdegree");
            return (Criteria) this;
        }

        public Criteria andZhichengIsNull() {
            addCriterion("ZHICHENG is null");
            return (Criteria) this;
        }

        public Criteria andZhichengIsNotNull() {
            addCriterion("ZHICHENG is not null");
            return (Criteria) this;
        }

        public Criteria andZhichengEqualTo(String value) {
            addCriterion("ZHICHENG =", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotEqualTo(String value) {
            addCriterion("ZHICHENG <>", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengGreaterThan(String value) {
            addCriterion("ZHICHENG >", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengGreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHENG >=", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLessThan(String value) {
            addCriterion("ZHICHENG <", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLessThanOrEqualTo(String value) {
            addCriterion("ZHICHENG <=", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLike(String value) {
            addCriterion("ZHICHENG like", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotLike(String value) {
            addCriterion("ZHICHENG not like", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengIn(List<String> values) {
            addCriterion("ZHICHENG in", values, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotIn(List<String> values) {
            addCriterion("ZHICHENG not in", values, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengBetween(String value1, String value2) {
            addCriterion("ZHICHENG between", value1, value2, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotBetween(String value1, String value2) {
            addCriterion("ZHICHENG not between", value1, value2, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andGaintimeIsNull() {
            addCriterion("GAINTIME is null");
            return (Criteria) this;
        }

        public Criteria andGaintimeIsNotNull() {
            addCriterion("GAINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andGaintimeEqualTo(Date value) {
            addCriterionForJDBCDate("GAINTIME =", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GAINTIME <>", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GAINTIME >", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GAINTIME >=", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeLessThan(Date value) {
            addCriterionForJDBCDate("GAINTIME <", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GAINTIME <=", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeIn(List<Date> values) {
            addCriterionForJDBCDate("GAINTIME in", values, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GAINTIME not in", values, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GAINTIME between", value1, value2, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GAINTIME not between", value1, value2, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeEqualTo(Timestamp value) {
            addCriterion("GAINTIME =", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeNotEqualTo(Timestamp value) {
            addCriterion("GAINTIME <>", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeGreaterThan(Timestamp value) {
            addCriterion("GAINTIME >", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("GAINTIME >=", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeLessThan(Timestamp value) {
            addCriterion("GAINTIME <", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("GAINTIME <=", value, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GAINTIME between", value1, value2, "gaintime");
            return (Criteria) this;
        }

        public Criteria andGaintimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GAINTIME not between", value1, value2, "gaintime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeIsNull() {
            addCriterion("ENGAGETIME is null");
            return (Criteria) this;
        }

        public Criteria andEngagetimeIsNotNull() {
            addCriterion("ENGAGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andEngagetimeEqualTo(Date value) {
            addCriterionForJDBCDate("ENGAGETIME =", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENGAGETIME <>", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ENGAGETIME >", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENGAGETIME >=", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeLessThan(Date value) {
            addCriterionForJDBCDate("ENGAGETIME <", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENGAGETIME <=", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeIn(List<Date> values) {
            addCriterionForJDBCDate("ENGAGETIME in", values, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENGAGETIME not in", values, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENGAGETIME between", value1, value2, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENGAGETIME not between", value1, value2, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeEqualTo(Timestamp value) {
            addCriterion("ENGAGETIME =", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeNotEqualTo(Timestamp value) {
            addCriterion("ENGAGETIME <>", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeGreaterThan(Timestamp value) {
            addCriterion("ENGAGETIME >", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ENGAGETIME >=", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeLessThan(Timestamp value) {
            addCriterion("ENGAGETIME <", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ENGAGETIME <=", value, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ENGAGETIME between", value1, value2, "engagetime");
            return (Criteria) this;
        }

        public Criteria andEngagetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ENGAGETIME not between", value1, value2, "engagetime");
            return (Criteria) this;
        }

        public Criteria andPlacedeptIsNull() {
            addCriterion("PLACEDEPT is null");
            return (Criteria) this;
        }

        public Criteria andPlacedeptIsNotNull() {
            addCriterion("PLACEDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPlacedeptEqualTo(String value) {
            addCriterion("PLACEDEPT =", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptNotEqualTo(String value) {
            addCriterion("PLACEDEPT <>", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptGreaterThan(String value) {
            addCriterion("PLACEDEPT >", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptGreaterThanOrEqualTo(String value) {
            addCriterion("PLACEDEPT >=", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptLessThan(String value) {
            addCriterion("PLACEDEPT <", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptLessThanOrEqualTo(String value) {
            addCriterion("PLACEDEPT <=", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptLike(String value) {
            addCriterion("PLACEDEPT like", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptNotLike(String value) {
            addCriterion("PLACEDEPT not like", value, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptIn(List<String> values) {
            addCriterion("PLACEDEPT in", values, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptNotIn(List<String> values) {
            addCriterion("PLACEDEPT not in", values, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptBetween(String value1, String value2) {
            addCriterion("PLACEDEPT between", value1, value2, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacedeptNotBetween(String value1, String value2) {
            addCriterion("PLACEDEPT not between", value1, value2, "placedept");
            return (Criteria) this;
        }

        public Criteria andPlacenameIsNull() {
            addCriterion("PLACENAME is null");
            return (Criteria) this;
        }

        public Criteria andPlacenameIsNotNull() {
            addCriterion("PLACENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlacenameEqualTo(String value) {
            addCriterion("PLACENAME =", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotEqualTo(String value) {
            addCriterion("PLACENAME <>", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameGreaterThan(String value) {
            addCriterion("PLACENAME >", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameGreaterThanOrEqualTo(String value) {
            addCriterion("PLACENAME >=", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLessThan(String value) {
            addCriterion("PLACENAME <", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLessThanOrEqualTo(String value) {
            addCriterion("PLACENAME <=", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLike(String value) {
            addCriterion("PLACENAME like", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotLike(String value) {
            addCriterion("PLACENAME not like", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameIn(List<String> values) {
            addCriterion("PLACENAME in", values, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotIn(List<String> values) {
            addCriterion("PLACENAME not in", values, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameBetween(String value1, String value2) {
            addCriterion("PLACENAME between", value1, value2, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotBetween(String value1, String value2) {
            addCriterion("PLACENAME not between", value1, value2, "placename");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("COURSEID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("COURSEID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("COURSEID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("COURSEID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("COURSEID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("COURSEID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("COURSEID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("COURSEID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("COURSEID like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("COURSEID not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("COURSEID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("COURSEID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("COURSEID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("COURSEID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("COURSENAME is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("COURSENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("COURSENAME =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("COURSENAME <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("COURSENAME >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSENAME >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("COURSENAME <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("COURSENAME <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("COURSENAME like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("COURSENAME not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("COURSENAME in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("COURSENAME not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("COURSENAME between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("COURSENAME not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("DIRECTION =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("DIRECTION <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("DIRECTION >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTION >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("DIRECTION <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("DIRECTION <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("DIRECTION like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("DIRECTION not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("DIRECTION in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("DIRECTION not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("DIRECTION between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("DIRECTION not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andOpenbankIsNull() {
            addCriterion("OPENBANK is null");
            return (Criteria) this;
        }

        public Criteria andOpenbankIsNotNull() {
            addCriterion("OPENBANK is not null");
            return (Criteria) this;
        }

        public Criteria andOpenbankEqualTo(String value) {
            addCriterion("OPENBANK =", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotEqualTo(String value) {
            addCriterion("OPENBANK <>", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankGreaterThan(String value) {
            addCriterion("OPENBANK >", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankGreaterThanOrEqualTo(String value) {
            addCriterion("OPENBANK >=", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLessThan(String value) {
            addCriterion("OPENBANK <", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLessThanOrEqualTo(String value) {
            addCriterion("OPENBANK <=", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLike(String value) {
            addCriterion("OPENBANK like", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotLike(String value) {
            addCriterion("OPENBANK not like", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankIn(List<String> values) {
            addCriterion("OPENBANK in", values, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotIn(List<String> values) {
            addCriterion("OPENBANK not in", values, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankBetween(String value1, String value2) {
            addCriterion("OPENBANK between", value1, value2, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotBetween(String value1, String value2) {
            addCriterion("OPENBANK not between", value1, value2, "openbank");
            return (Criteria) this;
        }

        public Criteria andBanknumIsNull() {
            addCriterion("BANKNUM is null");
            return (Criteria) this;
        }

        public Criteria andBanknumIsNotNull() {
            addCriterion("BANKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumEqualTo(String value) {
            addCriterion("BANKNUM =", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotEqualTo(String value) {
            addCriterion("BANKNUM <>", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumGreaterThan(String value) {
            addCriterion("BANKNUM >", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNUM >=", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLessThan(String value) {
            addCriterion("BANKNUM <", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLessThanOrEqualTo(String value) {
            addCriterion("BANKNUM <=", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLike(String value) {
            addCriterion("BANKNUM like", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotLike(String value) {
            addCriterion("BANKNUM not like", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumIn(List<String> values) {
            addCriterion("BANKNUM in", values, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotIn(List<String> values) {
            addCriterion("BANKNUM not in", values, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumBetween(String value1, String value2) {
            addCriterion("BANKNUM between", value1, value2, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotBetween(String value1, String value2) {
            addCriterion("BANKNUM not between", value1, value2, "banknum");
            return (Criteria) this;
        }

        public Criteria andPayoneIsNull() {
            addCriterion("PAYONE is null");
            return (Criteria) this;
        }

        public Criteria andPayoneIsNotNull() {
            addCriterion("PAYONE is not null");
            return (Criteria) this;
        }

        public Criteria andPayoneEqualTo(String value) {
            addCriterion("PAYONE =", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneNotEqualTo(String value) {
            addCriterion("PAYONE <>", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneGreaterThan(String value) {
            addCriterion("PAYONE >", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneGreaterThanOrEqualTo(String value) {
            addCriterion("PAYONE >=", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneLessThan(String value) {
            addCriterion("PAYONE <", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneLessThanOrEqualTo(String value) {
            addCriterion("PAYONE <=", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneLike(String value) {
            addCriterion("PAYONE like", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneNotLike(String value) {
            addCriterion("PAYONE not like", value, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneIn(List<String> values) {
            addCriterion("PAYONE in", values, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneNotIn(List<String> values) {
            addCriterion("PAYONE not in", values, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneBetween(String value1, String value2) {
            addCriterion("PAYONE between", value1, value2, "payone");
            return (Criteria) this;
        }

        public Criteria andPayoneNotBetween(String value1, String value2) {
            addCriterion("PAYONE not between", value1, value2, "payone");
            return (Criteria) this;
        }

        public Criteria andPaytwoIsNull() {
            addCriterion("PAYTWO is null");
            return (Criteria) this;
        }

        public Criteria andPaytwoIsNotNull() {
            addCriterion("PAYTWO is not null");
            return (Criteria) this;
        }

        public Criteria andPaytwoEqualTo(String value) {
            addCriterion("PAYTWO =", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoNotEqualTo(String value) {
            addCriterion("PAYTWO <>", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoGreaterThan(String value) {
            addCriterion("PAYTWO >", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTWO >=", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoLessThan(String value) {
            addCriterion("PAYTWO <", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoLessThanOrEqualTo(String value) {
            addCriterion("PAYTWO <=", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoLike(String value) {
            addCriterion("PAYTWO like", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoNotLike(String value) {
            addCriterion("PAYTWO not like", value, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoIn(List<String> values) {
            addCriterion("PAYTWO in", values, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoNotIn(List<String> values) {
            addCriterion("PAYTWO not in", values, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoBetween(String value1, String value2) {
            addCriterion("PAYTWO between", value1, value2, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaytwoNotBetween(String value1, String value2) {
            addCriterion("PAYTWO not between", value1, value2, "paytwo");
            return (Criteria) this;
        }

        public Criteria andPaythreeIsNull() {
            addCriterion("PAYTHREE is null");
            return (Criteria) this;
        }

        public Criteria andPaythreeIsNotNull() {
            addCriterion("PAYTHREE is not null");
            return (Criteria) this;
        }

        public Criteria andPaythreeEqualTo(String value) {
            addCriterion("PAYTHREE =", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeNotEqualTo(String value) {
            addCriterion("PAYTHREE <>", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeGreaterThan(String value) {
            addCriterion("PAYTHREE >", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTHREE >=", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeLessThan(String value) {
            addCriterion("PAYTHREE <", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeLessThanOrEqualTo(String value) {
            addCriterion("PAYTHREE <=", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeLike(String value) {
            addCriterion("PAYTHREE like", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeNotLike(String value) {
            addCriterion("PAYTHREE not like", value, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeIn(List<String> values) {
            addCriterion("PAYTHREE in", values, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeNotIn(List<String> values) {
            addCriterion("PAYTHREE not in", values, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeBetween(String value1, String value2) {
            addCriterion("PAYTHREE between", value1, value2, "paythree");
            return (Criteria) this;
        }

        public Criteria andPaythreeNotBetween(String value1, String value2) {
            addCriterion("PAYTHREE not between", value1, value2, "paythree");
            return (Criteria) this;
        }

        public Criteria andPayfourIsNull() {
            addCriterion("PAYFOUR is null");
            return (Criteria) this;
        }

        public Criteria andPayfourIsNotNull() {
            addCriterion("PAYFOUR is not null");
            return (Criteria) this;
        }

        public Criteria andPayfourEqualTo(String value) {
            addCriterion("PAYFOUR =", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourNotEqualTo(String value) {
            addCriterion("PAYFOUR <>", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourGreaterThan(String value) {
            addCriterion("PAYFOUR >", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourGreaterThanOrEqualTo(String value) {
            addCriterion("PAYFOUR >=", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourLessThan(String value) {
            addCriterion("PAYFOUR <", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourLessThanOrEqualTo(String value) {
            addCriterion("PAYFOUR <=", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourLike(String value) {
            addCriterion("PAYFOUR like", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourNotLike(String value) {
            addCriterion("PAYFOUR not like", value, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourIn(List<String> values) {
            addCriterion("PAYFOUR in", values, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourNotIn(List<String> values) {
            addCriterion("PAYFOUR not in", values, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourBetween(String value1, String value2) {
            addCriterion("PAYFOUR between", value1, value2, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfourNotBetween(String value1, String value2) {
            addCriterion("PAYFOUR not between", value1, value2, "payfour");
            return (Criteria) this;
        }

        public Criteria andPayfixIsNull() {
            addCriterion("PAYFIX is null");
            return (Criteria) this;
        }

        public Criteria andPayfixIsNotNull() {
            addCriterion("PAYFIX is not null");
            return (Criteria) this;
        }

        public Criteria andPayfixEqualTo(String value) {
            addCriterion("PAYFIX =", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixNotEqualTo(String value) {
            addCriterion("PAYFIX <>", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixGreaterThan(String value) {
            addCriterion("PAYFIX >", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixGreaterThanOrEqualTo(String value) {
            addCriterion("PAYFIX >=", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixLessThan(String value) {
            addCriterion("PAYFIX <", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixLessThanOrEqualTo(String value) {
            addCriterion("PAYFIX <=", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixLike(String value) {
            addCriterion("PAYFIX like", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixNotLike(String value) {
            addCriterion("PAYFIX not like", value, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixIn(List<String> values) {
            addCriterion("PAYFIX in", values, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixNotIn(List<String> values) {
            addCriterion("PAYFIX not in", values, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixBetween(String value1, String value2) {
            addCriterion("PAYFIX between", value1, value2, "payfix");
            return (Criteria) this;
        }

        public Criteria andPayfixNotBetween(String value1, String value2) {
            addCriterion("PAYFIX not between", value1, value2, "payfix");
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

        public Criteria andCreattimeIsNull() {
            addCriterion("CREATTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("CREATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATTIME >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATTIME <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATTIME in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATTIME not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATTIME between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATTIME not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Timestamp value) {
            addCriterion("CREATTIME =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Timestamp value) {
            addCriterion("CREATTIME <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Timestamp value) {
            addCriterion("CREATTIME >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATTIME >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Timestamp value) {
            addCriterion("CREATTIME <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATTIME <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATTIME between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATTIME not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreatperIsNull() {
            addCriterion("CREATPER is null");
            return (Criteria) this;
        }

        public Criteria andCreatperIsNotNull() {
            addCriterion("CREATPER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatperEqualTo(String value) {
            addCriterion("CREATPER =", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperNotEqualTo(String value) {
            addCriterion("CREATPER <>", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperGreaterThan(String value) {
            addCriterion("CREATPER >", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperGreaterThanOrEqualTo(String value) {
            addCriterion("CREATPER >=", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperLessThan(String value) {
            addCriterion("CREATPER <", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperLessThanOrEqualTo(String value) {
            addCriterion("CREATPER <=", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperLike(String value) {
            addCriterion("CREATPER like", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperNotLike(String value) {
            addCriterion("CREATPER not like", value, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperIn(List<String> values) {
            addCriterion("CREATPER in", values, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperNotIn(List<String> values) {
            addCriterion("CREATPER not in", values, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperBetween(String value1, String value2) {
            addCriterion("CREATPER between", value1, value2, "creatper");
            return (Criteria) this;
        }

        public Criteria andCreatperNotBetween(String value1, String value2) {
            addCriterion("CREATPER not between", value1, value2, "creatper");
            return (Criteria) this;
        }

        public Criteria andAddnameIsNull() {
            addCriterion("ADDNAME is null");
            return (Criteria) this;
        }

        public Criteria andAddnameIsNotNull() {
            addCriterion("ADDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddnameEqualTo(String value) {
            addCriterion("ADDNAME =", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotEqualTo(String value) {
            addCriterion("ADDNAME <>", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameGreaterThan(String value) {
            addCriterion("ADDNAME >", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDNAME >=", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameLessThan(String value) {
            addCriterion("ADDNAME <", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameLessThanOrEqualTo(String value) {
            addCriterion("ADDNAME <=", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameLike(String value) {
            addCriterion("ADDNAME like", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotLike(String value) {
            addCriterion("ADDNAME not like", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameIn(List<String> values) {
            addCriterion("ADDNAME in", values, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotIn(List<String> values) {
            addCriterion("ADDNAME not in", values, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameBetween(String value1, String value2) {
            addCriterion("ADDNAME between", value1, value2, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotBetween(String value1, String value2) {
            addCriterion("ADDNAME not between", value1, value2, "addname");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Timestamp value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Timestamp value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Timestamp value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
        
        //-------------------------------
        public Criteria andGetedudateIsNull() {
            addCriterion("GETEDUDATE is null");
            return (Criteria) this;
        }

        public Criteria andGetedudateIsNotNull() {
            addCriterion("GETEDUDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGetedudateEqualTo(Date value) {
            addCriterionForJDBCDate("GETEDUDATE =", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateNotEqualTo(Date value) {
            addCriterionForJDBCDate("GETEDUDATE <>", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateGreaterThan(Date value) {
            addCriterionForJDBCDate("GETEDUDATE >", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GETEDUDATE >=", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateLessThan(Date value) {
            addCriterionForJDBCDate("GETEDUDATE <", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GETEDUDATE <=", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateIn(List<Date> values) {
            addCriterionForJDBCDate("GETEDUDATE in", values, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateNotIn(List<Date> values) {
            addCriterionForJDBCDate("GETEDUDATE not in", values, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GETEDUDATE between", value1, value2, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GETEDUDATE not between", value1, value2, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateEqualTo(Timestamp value) {
            addCriterion("GETEDUDATE =", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateNotEqualTo(Timestamp value) {
            addCriterion("GETEDUDATE <>", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateGreaterThan(Timestamp value) {
            addCriterion("GETEDUDATE >", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("GETEDUDATE >=", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateLessThan(Timestamp value) {
            addCriterion("GETEDUDATE <", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateLessThanOrEqualTo(Timestamp value) {
            addCriterion("GETEDUDATE <=", value, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GETEDUDATE between", value1, value2, "getedudate");
            return (Criteria) this;
        }

        public Criteria andGetedudateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GETEDUDATE not between", value1, value2, "getedudate");
            return (Criteria) this;
        }
        
        //===========================
        public Criteria andBestedudateIsNull() {
            addCriterion("BESTEDUDATE is null");
            return (Criteria) this;
        }

        public Criteria andBestedudateIsNotNull() {
            addCriterion("BESTEDUDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBestedudateEqualTo(Date value) {
            addCriterionForJDBCDate("BESTEDUDATE =", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BESTEDUDATE <>", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateGreaterThan(Date value) {
            addCriterionForJDBCDate("BESTEDUDATE >", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BESTEDUDATE >=", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateLessThan(Date value) {
            addCriterionForJDBCDate("BESTEDUDATE <", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BESTEDUDATE <=", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateIn(List<Date> values) {
            addCriterionForJDBCDate("BESTEDUDATE in", values, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BESTEDUDATE not in", values, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BESTEDUDATE between", value1, value2, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BESTEDUDATE not between", value1, value2, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateEqualTo(Timestamp value) {
            addCriterion("BESTEDUDATE =", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateNotEqualTo(Timestamp value) {
            addCriterion("BESTEDUDATE <>", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateGreaterThan(Timestamp value) {
            addCriterion("BESTEDUDATE >", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BESTEDUDATE >=", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateLessThan(Timestamp value) {
            addCriterion("BESTEDUDATE <", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateLessThanOrEqualTo(Timestamp value) {
            addCriterion("BESTEDUDATE <=", value, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BESTEDUDATE between", value1, value2, "bestedudate");
            return (Criteria) this;
        }

        public Criteria andBestedudateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BESTEDUDATE not between", value1, value2, "bestedudate");
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