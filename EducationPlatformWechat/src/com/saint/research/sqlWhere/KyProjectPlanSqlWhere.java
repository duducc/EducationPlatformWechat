package com.saint.research.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.research.bean.KyProjectPlanEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名KY_PROJECTPLAN
*表说明任务进度计划
  */
public class KyProjectPlanSqlWhere extends KyProjectPlanEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KyProjectPlanSqlWhere() {
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

        public Criteria andTasknumIsNull() {
            addCriterion("TASKNUM is null");
            return (Criteria) this;
        }

        public Criteria andTasknumIsNotNull() {
            addCriterion("TASKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTasknumEqualTo(BigDecimal value) {
            addCriterion("TASKNUM =", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotEqualTo(BigDecimal value) {
            addCriterion("TASKNUM <>", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThan(BigDecimal value) {
            addCriterion("TASKNUM >", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TASKNUM >=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThan(BigDecimal value) {
            addCriterion("TASKNUM <", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TASKNUM <=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumIn(List<BigDecimal> values) {
            addCriterion("TASKNUM in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotIn(List<BigDecimal> values) {
            addCriterion("TASKNUM not in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASKNUM between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASKNUM not between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateIsNull() {
            addCriterion("TASKSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateIsNotNull() {
            addCriterion("TASKSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("TASKSTARTDATE =", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TASKSTARTDATE <>", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TASKSTARTDATE >", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASKSTARTDATE >=", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateLessThan(Date value) {
            addCriterionForJDBCDate("TASKSTARTDATE <", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASKSTARTDATE <=", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("TASKSTARTDATE in", values, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TASKSTARTDATE not in", values, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASKSTARTDATE between", value1, value2, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASKSTARTDATE not between", value1, value2, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateEqualTo(Timestamp value) {
            addCriterion("TASKSTARTDATE =", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateNotEqualTo(Timestamp value) {
            addCriterion("TASKSTARTDATE <>", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateGreaterThan(Timestamp value) {
            addCriterion("TASKSTARTDATE >", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("TASKSTARTDATE >=", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateLessThan(Timestamp value) {
            addCriterion("TASKSTARTDATE <", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("TASKSTARTDATE <=", value, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASKSTARTDATE between", value1, value2, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskstartdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASKSTARTDATE not between", value1, value2, "taskstartdate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateIsNull() {
            addCriterion("TASKENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskenddateIsNotNull() {
            addCriterion("TASKENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskenddateEqualTo(Date value) {
            addCriterionForJDBCDate("TASKENDDATE =", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TASKENDDATE <>", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("TASKENDDATE >", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASKENDDATE >=", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateLessThan(Date value) {
            addCriterionForJDBCDate("TASKENDDATE <", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASKENDDATE <=", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateIn(List<Date> values) {
            addCriterionForJDBCDate("TASKENDDATE in", values, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TASKENDDATE not in", values, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASKENDDATE between", value1, value2, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASKENDDATE not between", value1, value2, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateEqualTo(Timestamp value) {
            addCriterion("TASKENDDATE =", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateNotEqualTo(Timestamp value) {
            addCriterion("TASKENDDATE <>", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateGreaterThan(Timestamp value) {
            addCriterion("TASKENDDATE >", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("TASKENDDATE >=", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateLessThan(Timestamp value) {
            addCriterion("TASKENDDATE <", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateLessThanOrEqualTo(Timestamp value) {
            addCriterion("TASKENDDATE <=", value, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASKENDDATE between", value1, value2, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskenddateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASKENDDATE not between", value1, value2, "taskenddate");
            return (Criteria) this;
        }

        public Criteria andTaskgoalIsNull() {
            addCriterion("TASKGOAL is null");
            return (Criteria) this;
        }

        public Criteria andTaskgoalIsNotNull() {
            addCriterion("TASKGOAL is not null");
            return (Criteria) this;
        }

        public Criteria andTaskgoalEqualTo(String value) {
            addCriterion("TASKGOAL =", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalNotEqualTo(String value) {
            addCriterion("TASKGOAL <>", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalGreaterThan(String value) {
            addCriterion("TASKGOAL >", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalGreaterThanOrEqualTo(String value) {
            addCriterion("TASKGOAL >=", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalLessThan(String value) {
            addCriterion("TASKGOAL <", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalLessThanOrEqualTo(String value) {
            addCriterion("TASKGOAL <=", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalLike(String value) {
            addCriterion("TASKGOAL like", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalNotLike(String value) {
            addCriterion("TASKGOAL not like", value, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalIn(List<String> values) {
            addCriterion("TASKGOAL in", values, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalNotIn(List<String> values) {
            addCriterion("TASKGOAL not in", values, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalBetween(String value1, String value2) {
            addCriterion("TASKGOAL between", value1, value2, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskgoalNotBetween(String value1, String value2) {
            addCriterion("TASKGOAL not between", value1, value2, "taskgoal");
            return (Criteria) this;
        }

        public Criteria andTaskconIsNull() {
            addCriterion("TASKCON is null");
            return (Criteria) this;
        }

        public Criteria andTaskconIsNotNull() {
            addCriterion("TASKCON is not null");
            return (Criteria) this;
        }

        public Criteria andTaskconEqualTo(String value) {
            addCriterion("TASKCON =", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconNotEqualTo(String value) {
            addCriterion("TASKCON <>", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconGreaterThan(String value) {
            addCriterion("TASKCON >", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCON >=", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconLessThan(String value) {
            addCriterion("TASKCON <", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconLessThanOrEqualTo(String value) {
            addCriterion("TASKCON <=", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconLike(String value) {
            addCriterion("TASKCON like", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconNotLike(String value) {
            addCriterion("TASKCON not like", value, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconIn(List<String> values) {
            addCriterion("TASKCON in", values, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconNotIn(List<String> values) {
            addCriterion("TASKCON not in", values, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconBetween(String value1, String value2) {
            addCriterion("TASKCON between", value1, value2, "taskcon");
            return (Criteria) this;
        }

        public Criteria andTaskconNotBetween(String value1, String value2) {
            addCriterion("TASKCON not between", value1, value2, "taskcon");
            return (Criteria) this;
        }

        public Criteria andProportionIsNull() {
            addCriterion("PROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("PROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(BigDecimal value) {
            addCriterion("PROPORTION =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(BigDecimal value) {
            addCriterion("PROPORTION <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(BigDecimal value) {
            addCriterion("PROPORTION >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPORTION >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(BigDecimal value) {
            addCriterion("PROPORTION <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPORTION <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<BigDecimal> values) {
            addCriterion("PROPORTION in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<BigDecimal> values) {
            addCriterion("PROPORTION not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPORTION between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPORTION not between", value1, value2, "proportion");
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

        public Criteria andExcuteuseridIsNull() {
            addCriterion("EXCUTEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridIsNotNull() {
            addCriterion("EXCUTEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridEqualTo(String value) {
            addCriterion("EXCUTEUSERID =", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridNotEqualTo(String value) {
            addCriterion("EXCUTEUSERID <>", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridGreaterThan(String value) {
            addCriterion("EXCUTEUSERID >", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridGreaterThanOrEqualTo(String value) {
            addCriterion("EXCUTEUSERID >=", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridLessThan(String value) {
            addCriterion("EXCUTEUSERID <", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridLessThanOrEqualTo(String value) {
            addCriterion("EXCUTEUSERID <=", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridLike(String value) {
            addCriterion("EXCUTEUSERID like", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridNotLike(String value) {
            addCriterion("EXCUTEUSERID not like", value, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridIn(List<String> values) {
            addCriterion("EXCUTEUSERID in", values, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridNotIn(List<String> values) {
            addCriterion("EXCUTEUSERID not in", values, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridBetween(String value1, String value2) {
            addCriterion("EXCUTEUSERID between", value1, value2, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteuseridNotBetween(String value1, String value2) {
            addCriterion("EXCUTEUSERID not between", value1, value2, "excuteuserid");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameIsNull() {
            addCriterion("EXCUTEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameIsNotNull() {
            addCriterion("EXCUTEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameEqualTo(String value) {
            addCriterion("EXCUTEUSERNAME =", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameNotEqualTo(String value) {
            addCriterion("EXCUTEUSERNAME <>", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameGreaterThan(String value) {
            addCriterion("EXCUTEUSERNAME >", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameGreaterThanOrEqualTo(String value) {
            addCriterion("EXCUTEUSERNAME >=", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameLessThan(String value) {
            addCriterion("EXCUTEUSERNAME <", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameLessThanOrEqualTo(String value) {
            addCriterion("EXCUTEUSERNAME <=", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameLike(String value) {
            addCriterion("EXCUTEUSERNAME like", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameNotLike(String value) {
            addCriterion("EXCUTEUSERNAME not like", value, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameIn(List<String> values) {
            addCriterion("EXCUTEUSERNAME in", values, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameNotIn(List<String> values) {
            addCriterion("EXCUTEUSERNAME not in", values, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameBetween(String value1, String value2) {
            addCriterion("EXCUTEUSERNAME between", value1, value2, "excuteusername");
            return (Criteria) this;
        }

        public Criteria andExcuteusernameNotBetween(String value1, String value2) {
            addCriterion("EXCUTEUSERNAME not between", value1, value2, "excuteusername");
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

        public Criteria andIsfinishtaskIsNull() {
            addCriterion("ISFINISHTASK is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskIsNotNull() {
            addCriterion("ISFINISHTASK is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskEqualTo(String value) {
            addCriterion("ISFINISHTASK =", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskNotEqualTo(String value) {
            addCriterion("ISFINISHTASK <>", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskGreaterThan(String value) {
            addCriterion("ISFINISHTASK >", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskGreaterThanOrEqualTo(String value) {
            addCriterion("ISFINISHTASK >=", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskLessThan(String value) {
            addCriterion("ISFINISHTASK <", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskLessThanOrEqualTo(String value) {
            addCriterion("ISFINISHTASK <=", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskLike(String value) {
            addCriterion("ISFINISHTASK like", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskNotLike(String value) {
            addCriterion("ISFINISHTASK not like", value, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskIn(List<String> values) {
            addCriterion("ISFINISHTASK in", values, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskNotIn(List<String> values) {
            addCriterion("ISFINISHTASK not in", values, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskBetween(String value1, String value2) {
            addCriterion("ISFINISHTASK between", value1, value2, "isfinishtask");
            return (Criteria) this;
        }

        public Criteria andIsfinishtaskNotBetween(String value1, String value2) {
            addCriterion("ISFINISHTASK not between", value1, value2, "isfinishtask");
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