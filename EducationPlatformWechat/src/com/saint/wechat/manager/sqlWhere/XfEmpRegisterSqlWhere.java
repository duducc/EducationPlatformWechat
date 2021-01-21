package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名XF_EMP_REGISTER
*表说明员工信息申请表
  */
public class XfEmpRegisterSqlWhere extends XfEmpRegisterEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfEmpRegisterSqlWhere() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
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

        public Criteria andDepartIsNull() {
            addCriterion("DEPART is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsNotNull() {
            addCriterion("DEPART is not null");
            return (Criteria) this;
        }

        public Criteria andDepartEqualTo(String value) {
            addCriterion("DEPART =", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotEqualTo(String value) {
            addCriterion("DEPART <>", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThan(String value) {
            addCriterion("DEPART >", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART >=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThan(String value) {
            addCriterion("DEPART <", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThanOrEqualTo(String value) {
            addCriterion("DEPART <=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLike(String value) {
            addCriterion("DEPART like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotLike(String value) {
            addCriterion("DEPART not like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartIn(List<String> values) {
            addCriterion("DEPART in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotIn(List<String> values) {
            addCriterion("DEPART not in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartBetween(String value1, String value2) {
            addCriterion("DEPART between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotBetween(String value1, String value2) {
            addCriterion("DEPART not between", value1, value2, "depart");
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

        public Criteria andYiyuanIsNull() {
            addCriterion("YIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andYiyuanIsNotNull() {
            addCriterion("YIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andYiyuanEqualTo(String value) {
            addCriterion("YIYUAN =", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotEqualTo(String value) {
            addCriterion("YIYUAN <>", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanGreaterThan(String value) {
            addCriterion("YIYUAN >", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("YIYUAN >=", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanLessThan(String value) {
            addCriterion("YIYUAN <", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanLessThanOrEqualTo(String value) {
            addCriterion("YIYUAN <=", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanLike(String value) {
            addCriterion("YIYUAN like", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotLike(String value) {
            addCriterion("YIYUAN not like", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanIn(List<String> values) {
            addCriterion("YIYUAN in", values, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotIn(List<String> values) {
            addCriterion("YIYUAN not in", values, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanBetween(String value1, String value2) {
            addCriterion("YIYUAN between", value1, value2, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotBetween(String value1, String value2) {
            addCriterion("YIYUAN not between", value1, value2, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuannameIsNull() {
            addCriterion("YIYUANNAME is null");
            return (Criteria) this;
        }

        public Criteria andYiyuannameIsNotNull() {
            addCriterion("YIYUANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andYiyuannameEqualTo(String value) {
            addCriterion("YIYUANNAME =", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameNotEqualTo(String value) {
            addCriterion("YIYUANNAME <>", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameGreaterThan(String value) {
            addCriterion("YIYUANNAME >", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameGreaterThanOrEqualTo(String value) {
            addCriterion("YIYUANNAME >=", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameLessThan(String value) {
            addCriterion("YIYUANNAME <", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameLessThanOrEqualTo(String value) {
            addCriterion("YIYUANNAME <=", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameLike(String value) {
            addCriterion("YIYUANNAME like", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameNotLike(String value) {
            addCriterion("YIYUANNAME not like", value, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameIn(List<String> values) {
            addCriterion("YIYUANNAME in", values, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameNotIn(List<String> values) {
            addCriterion("YIYUANNAME not in", values, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameBetween(String value1, String value2) {
            addCriterion("YIYUANNAME between", value1, value2, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andYiyuannameNotBetween(String value1, String value2) {
            addCriterion("YIYUANNAME not between", value1, value2, "yiyuanname");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("ZHUANYE is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("ZHUANYE is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("ZHUANYE =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("ZHUANYE <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("ZHUANYE >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANYE >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("ZHUANYE <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("ZHUANYE <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("ZHUANYE like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("ZHUANYE not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("ZHUANYE in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("ZHUANYE not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("ZHUANYE between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("ZHUANYE not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("XUELI is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XUELI is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("XUELI =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("XUELI <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("XUELI >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("XUELI >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("XUELI <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("XUELI <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("XUELI like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("XUELI not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("XUELI in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("XUELI not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("XUELI between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("XUELI not between", value1, value2, "xueli");
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

        public Criteria andZhichenglvIsNull() {
            addCriterion("ZHICHENGLV is null");
            return (Criteria) this;
        }

        public Criteria andZhichenglvIsNotNull() {
            addCriterion("ZHICHENGLV is not null");
            return (Criteria) this;
        }

        public Criteria andZhichenglvEqualTo(String value) {
            addCriterion("ZHICHENGLV =", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotEqualTo(String value) {
            addCriterion("ZHICHENGLV <>", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvGreaterThan(String value) {
            addCriterion("ZHICHENGLV >", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvGreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHENGLV >=", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvLessThan(String value) {
            addCriterion("ZHICHENGLV <", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvLessThanOrEqualTo(String value) {
            addCriterion("ZHICHENGLV <=", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvLike(String value) {
            addCriterion("ZHICHENGLV like", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotLike(String value) {
            addCriterion("ZHICHENGLV not like", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvIn(List<String> values) {
            addCriterion("ZHICHENGLV in", values, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotIn(List<String> values) {
            addCriterion("ZHICHENGLV not in", values, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvBetween(String value1, String value2) {
            addCriterion("ZHICHENGLV between", value1, value2, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotBetween(String value1, String value2) {
            addCriterion("ZHICHENGLV not between", value1, value2, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("MINZU is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("MINZU is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("MINZU =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("MINZU <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("MINZU >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("MINZU >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("MINZU <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("MINZU <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("MINZU like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("MINZU not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("MINZU in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("MINZU not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("MINZU between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("MINZU not between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andZhengziIsNull() {
            addCriterion("ZHENGZI is null");
            return (Criteria) this;
        }

        public Criteria andZhengziIsNotNull() {
            addCriterion("ZHENGZI is not null");
            return (Criteria) this;
        }

        public Criteria andZhengziEqualTo(String value) {
            addCriterion("ZHENGZI =", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotEqualTo(String value) {
            addCriterion("ZHENGZI <>", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziGreaterThan(String value) {
            addCriterion("ZHENGZI >", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGZI >=", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziLessThan(String value) {
            addCriterion("ZHENGZI <", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziLessThanOrEqualTo(String value) {
            addCriterion("ZHENGZI <=", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziLike(String value) {
            addCriterion("ZHENGZI like", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotLike(String value) {
            addCriterion("ZHENGZI not like", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziIn(List<String> values) {
            addCriterion("ZHENGZI in", values, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotIn(List<String> values) {
            addCriterion("ZHENGZI not in", values, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziBetween(String value1, String value2) {
            addCriterion("ZHENGZI between", value1, value2, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotBetween(String value1, String value2) {
            addCriterion("ZHENGZI not between", value1, value2, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNull() {
            addCriterion("ZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("ZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("ZHIWU =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("ZHIWU <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("ZHIWU >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWU >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("ZHIWU <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("ZHIWU <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("ZHIWU like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("ZHIWU not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("ZHIWU in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("ZHIWU not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("ZHIWU between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("ZHIWU not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNull() {
            addCriterion("XUEWEI is null");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNotNull() {
            addCriterion("XUEWEI is not null");
            return (Criteria) this;
        }

        public Criteria andXueweiEqualTo(String value) {
            addCriterion("XUEWEI =", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotEqualTo(String value) {
            addCriterion("XUEWEI <>", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThan(String value) {
            addCriterion("XUEWEI >", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThanOrEqualTo(String value) {
            addCriterion("XUEWEI >=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThan(String value) {
            addCriterion("XUEWEI <", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThanOrEqualTo(String value) {
            addCriterion("XUEWEI <=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLike(String value) {
            addCriterion("XUEWEI like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotLike(String value) {
            addCriterion("XUEWEI not like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiIn(List<String> values) {
            addCriterion("XUEWEI in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotIn(List<String> values) {
            addCriterion("XUEWEI not in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiBetween(String value1, String value2) {
            addCriterion("XUEWEI between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotBetween(String value1, String value2) {
            addCriterion("XUEWEI not between", value1, value2, "xuewei");
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

        public Criteria andUserphoneIsNull() {
            addCriterion("USERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("USERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("USERPHONE =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("USERPHONE <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("USERPHONE >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("USERPHONE >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("USERPHONE <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("USERPHONE <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("USERPHONE like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("USERPHONE not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("USERPHONE in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("USERPHONE not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("USERPHONE between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("USERPHONE not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("USEREMAIL =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("USEREMAIL <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("USEREMAIL >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("USEREMAIL >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("USEREMAIL <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("USEREMAIL <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("USEREMAIL like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("USEREMAIL not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("USEREMAIL in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("USEREMAIL not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("USEREMAIL between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("USEREMAIL not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterionForJDBCDate("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Timestamp value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Timestamp value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Timestamp value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Timestamp value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUresourceIsNull() {
            addCriterion("URESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUresourceIsNotNull() {
            addCriterion("URESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUresourceEqualTo(String value) {
            addCriterion("URESOURCE =", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotEqualTo(String value) {
            addCriterion("URESOURCE <>", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceGreaterThan(String value) {
            addCriterion("URESOURCE >", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceGreaterThanOrEqualTo(String value) {
            addCriterion("URESOURCE >=", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceLessThan(String value) {
            addCriterion("URESOURCE <", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceLessThanOrEqualTo(String value) {
            addCriterion("URESOURCE <=", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceLike(String value) {
            addCriterion("URESOURCE like", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotLike(String value) {
            addCriterion("URESOURCE not like", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceIn(List<String> values) {
            addCriterion("URESOURCE in", values, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotIn(List<String> values) {
            addCriterion("URESOURCE not in", values, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceBetween(String value1, String value2) {
            addCriterion("URESOURCE between", value1, value2, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotBetween(String value1, String value2) {
            addCriterion("URESOURCE not between", value1, value2, "uresource");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("BEIZHU is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("BEIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("BEIZHU =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("BEIZHU <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("BEIZHU >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHU >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("BEIZHU <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("BEIZHU <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("BEIZHU like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("BEIZHU not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("BEIZHU in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("BEIZHU not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("BEIZHU between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("BEIZHU not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("APPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("APPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("APPLYTIME =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("APPLYTIME <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("APPLYTIME >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPLYTIME >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterionForJDBCDate("APPLYTIME <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPLYTIME <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("APPLYTIME in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("APPLYTIME not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPLYTIME between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPLYTIME not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Timestamp value) {
            addCriterion("APPLYTIME =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Timestamp value) {
            addCriterion("APPLYTIME <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Timestamp value) {
            addCriterion("APPLYTIME >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("APPLYTIME >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Timestamp value) {
            addCriterion("APPLYTIME <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("APPLYTIME <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("APPLYTIME between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("APPLYTIME not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("CHECKED is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("CHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(String value) {
            addCriterion("CHECKED =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(String value) {
            addCriterion("CHECKED <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(String value) {
            addCriterion("CHECKED >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(String value) {
            addCriterion("CHECKED <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(String value) {
            addCriterion("CHECKED <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLike(String value) {
            addCriterion("CHECKED like", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotLike(String value) {
            addCriterion("CHECKED not like", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<String> values) {
            addCriterion("CHECKED in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<String> values) {
            addCriterion("CHECKED not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(String value1, String value2) {
            addCriterion("CHECKED between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(String value1, String value2) {
            addCriterion("CHECKED not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andChecknumberIsNull() {
            addCriterion("CHECKNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andChecknumberIsNotNull() {
            addCriterion("CHECKNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andChecknumberEqualTo(String value) {
            addCriterion("CHECKNUMBER =", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotEqualTo(String value) {
            addCriterion("CHECKNUMBER <>", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberGreaterThan(String value) {
            addCriterion("CHECKNUMBER >", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNUMBER >=", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLessThan(String value) {
            addCriterion("CHECKNUMBER <", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLessThanOrEqualTo(String value) {
            addCriterion("CHECKNUMBER <=", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLike(String value) {
            addCriterion("CHECKNUMBER like", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotLike(String value) {
            addCriterion("CHECKNUMBER not like", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberIn(List<String> values) {
            addCriterion("CHECKNUMBER in", values, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotIn(List<String> values) {
            addCriterion("CHECKNUMBER not in", values, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberBetween(String value1, String value2) {
            addCriterion("CHECKNUMBER between", value1, value2, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotBetween(String value1, String value2) {
            addCriterion("CHECKNUMBER not between", value1, value2, "checknumber");
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