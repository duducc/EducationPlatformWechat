package com.saint.research.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.research.bean.KyProjectGressEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名KY_PROJECTGRESS
*表说明项目执行情况登记
  */
public class KyProjectGressSqlWhere extends KyProjectGressEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KyProjectGressSqlWhere() {
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

        public Criteria andProgressdescIsNull() {
            addCriterion("PROGRESSDESC is null");
            return (Criteria) this;
        }

        public Criteria andProgressdescIsNotNull() {
            addCriterion("PROGRESSDESC is not null");
            return (Criteria) this;
        }

        public Criteria andProgressdescEqualTo(String value) {
            addCriterion("PROGRESSDESC =", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotEqualTo(String value) {
            addCriterion("PROGRESSDESC <>", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescGreaterThan(String value) {
            addCriterion("PROGRESSDESC >", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescGreaterThanOrEqualTo(String value) {
            addCriterion("PROGRESSDESC >=", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescLessThan(String value) {
            addCriterion("PROGRESSDESC <", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescLessThanOrEqualTo(String value) {
            addCriterion("PROGRESSDESC <=", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescLike(String value) {
            addCriterion("PROGRESSDESC like", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotLike(String value) {
            addCriterion("PROGRESSDESC not like", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescIn(List<String> values) {
            addCriterion("PROGRESSDESC in", values, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotIn(List<String> values) {
            addCriterion("PROGRESSDESC not in", values, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescBetween(String value1, String value2) {
            addCriterion("PROGRESSDESC between", value1, value2, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotBetween(String value1, String value2) {
            addCriterion("PROGRESSDESC not between", value1, value2, "progressdesc");
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

        public Criteria andTasknumEqualTo(String value) {
            addCriterion("TASKNUM =", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotEqualTo(String value) {
            addCriterion("TASKNUM <>", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThan(String value) {
            addCriterion("TASKNUM >", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNUM >=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThan(String value) {
            addCriterion("TASKNUM <", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThanOrEqualTo(String value) {
            addCriterion("TASKNUM <=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLike(String value) {
            addCriterion("TASKNUM like", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotLike(String value) {
            addCriterion("TASKNUM not like", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumIn(List<String> values) {
            addCriterion("TASKNUM in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotIn(List<String> values) {
            addCriterion("TASKNUM not in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumBetween(String value1, String value2) {
            addCriterion("TASKNUM between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotBetween(String value1, String value2) {
            addCriterion("TASKNUM not between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("TASKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("TASKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("TASKNAME =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("TASKNAME <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("TASKNAME >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNAME >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("TASKNAME <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("TASKNAME <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("TASKNAME like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("TASKNAME not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("TASKNAME in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("TASKNAME not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("TASKNAME between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("TASKNAME not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNull() {
            addCriterion("REGDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("REGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Date value) {
            addCriterionForJDBCDate("REGDATE =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REGDATE <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Date value) {
            addCriterionForJDBCDate("REGDATE >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGDATE >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Date value) {
            addCriterionForJDBCDate("REGDATE <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGDATE <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<Date> values) {
            addCriterionForJDBCDate("REGDATE in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REGDATE not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGDATE between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGDATE not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Timestamp value) {
            addCriterion("REGDATE =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Timestamp value) {
            addCriterion("REGDATE <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Timestamp value) {
            addCriterion("REGDATE >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("REGDATE >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Timestamp value) {
            addCriterion("REGDATE <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("REGDATE <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REGDATE between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REGDATE not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegperidIsNull() {
            addCriterion("REGPERID is null");
            return (Criteria) this;
        }

        public Criteria andRegperidIsNotNull() {
            addCriterion("REGPERID is not null");
            return (Criteria) this;
        }

        public Criteria andRegperidEqualTo(String value) {
            addCriterion("REGPERID =", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidNotEqualTo(String value) {
            addCriterion("REGPERID <>", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidGreaterThan(String value) {
            addCriterion("REGPERID >", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidGreaterThanOrEqualTo(String value) {
            addCriterion("REGPERID >=", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidLessThan(String value) {
            addCriterion("REGPERID <", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidLessThanOrEqualTo(String value) {
            addCriterion("REGPERID <=", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidLike(String value) {
            addCriterion("REGPERID like", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidNotLike(String value) {
            addCriterion("REGPERID not like", value, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidIn(List<String> values) {
            addCriterion("REGPERID in", values, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidNotIn(List<String> values) {
            addCriterion("REGPERID not in", values, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidBetween(String value1, String value2) {
            addCriterion("REGPERID between", value1, value2, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegperidNotBetween(String value1, String value2) {
            addCriterion("REGPERID not between", value1, value2, "regperid");
            return (Criteria) this;
        }

        public Criteria andRegpernameIsNull() {
            addCriterion("REGPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andRegpernameIsNotNull() {
            addCriterion("REGPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegpernameEqualTo(String value) {
            addCriterion("REGPERNAME =", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameNotEqualTo(String value) {
            addCriterion("REGPERNAME <>", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameGreaterThan(String value) {
            addCriterion("REGPERNAME >", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameGreaterThanOrEqualTo(String value) {
            addCriterion("REGPERNAME >=", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameLessThan(String value) {
            addCriterion("REGPERNAME <", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameLessThanOrEqualTo(String value) {
            addCriterion("REGPERNAME <=", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameLike(String value) {
            addCriterion("REGPERNAME like", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameNotLike(String value) {
            addCriterion("REGPERNAME not like", value, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameIn(List<String> values) {
            addCriterion("REGPERNAME in", values, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameNotIn(List<String> values) {
            addCriterion("REGPERNAME not in", values, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameBetween(String value1, String value2) {
            addCriterion("REGPERNAME between", value1, value2, "regpername");
            return (Criteria) this;
        }

        public Criteria andRegpernameNotBetween(String value1, String value2) {
            addCriterion("REGPERNAME not between", value1, value2, "regpername");
            return (Criteria) this;
        }

        public Criteria andProproionIsNull() {
            addCriterion("PROPROION is null");
            return (Criteria) this;
        }

        public Criteria andProproionIsNotNull() {
            addCriterion("PROPROION is not null");
            return (Criteria) this;
        }

        public Criteria andProproionEqualTo(BigDecimal value) {
            addCriterion("PROPROION =", value, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionNotEqualTo(BigDecimal value) {
            addCriterion("PROPROION <>", value, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionGreaterThan(BigDecimal value) {
            addCriterion("PROPROION >", value, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPROION >=", value, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionLessThan(BigDecimal value) {
            addCriterion("PROPROION <", value, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPROION <=", value, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionIn(List<BigDecimal> values) {
            addCriterion("PROPROION in", values, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionNotIn(List<BigDecimal> values) {
            addCriterion("PROPROION not in", values, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPROION between", value1, value2, "proproion");
            return (Criteria) this;
        }

        public Criteria andProproionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPROION not between", value1, value2, "proproion");
            return (Criteria) this;
        }

        public Criteria andSubproportionIsNull() {
            addCriterion("SUBPROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andSubproportionIsNotNull() {
            addCriterion("SUBPROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andSubproportionEqualTo(BigDecimal value) {
            addCriterion("SUBPROPORTION =", value, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionNotEqualTo(BigDecimal value) {
            addCriterion("SUBPROPORTION <>", value, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionGreaterThan(BigDecimal value) {
            addCriterion("SUBPROPORTION >", value, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBPROPORTION >=", value, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionLessThan(BigDecimal value) {
            addCriterion("SUBPROPORTION <", value, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBPROPORTION <=", value, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionIn(List<BigDecimal> values) {
            addCriterion("SUBPROPORTION in", values, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionNotIn(List<BigDecimal> values) {
            addCriterion("SUBPROPORTION not in", values, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBPROPORTION between", value1, value2, "subproportion");
            return (Criteria) this;
        }

        public Criteria andSubproportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBPROPORTION not between", value1, value2, "subproportion");
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