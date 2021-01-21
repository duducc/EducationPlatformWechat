package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_EVALUATE_TEACHER
*表说明教师评价表
  */
public class JxEvaluateTeacherSqlWhere extends JxEvaluateTeacherEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxEvaluateTeacherSqlWhere() {
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

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
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

        public Criteria andDepnameIsNull() {
            addCriterion("DEPNAME is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("DEPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("DEPNAME =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("DEPNAME <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("DEPNAME >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPNAME >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("DEPNAME <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("DEPNAME <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("DEPNAME like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("DEPNAME not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("DEPNAME in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("DEPNAME not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("DEPNAME between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("DEPNAME not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("STUDENTID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("STUDENTID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("STUDENTID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("STUDENTID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("STUDENTID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("STUDENTID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("STUDENTID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("STUDENTID like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("STUDENTID not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("STUDENTID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("STUDENTID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("STUDENTID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("STUDENTID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("STUDENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("STUDENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("STUDENTNAME =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("STUDENTNAME <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("STUDENTNAME >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTNAME >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("STUDENTNAME <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("STUDENTNAME <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("STUDENTNAME like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("STUDENTNAME not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("STUDENTNAME in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("STUDENTNAME not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("STUDENTNAME between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("STUDENTNAME not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andRadio1IsNull() {
            addCriterion("RADIO1 is null");
            return (Criteria) this;
        }

        public Criteria andRadio1IsNotNull() {
            addCriterion("RADIO1 is not null");
            return (Criteria) this;
        }

        public Criteria andRadio1EqualTo(String value) {
            addCriterion("RADIO1 =", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1NotEqualTo(String value) {
            addCriterion("RADIO1 <>", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1GreaterThan(String value) {
            addCriterion("RADIO1 >", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1GreaterThanOrEqualTo(String value) {
            addCriterion("RADIO1 >=", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1LessThan(String value) {
            addCriterion("RADIO1 <", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1LessThanOrEqualTo(String value) {
            addCriterion("RADIO1 <=", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1Like(String value) {
            addCriterion("RADIO1 like", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1NotLike(String value) {
            addCriterion("RADIO1 not like", value, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1In(List<String> values) {
            addCriterion("RADIO1 in", values, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1NotIn(List<String> values) {
            addCriterion("RADIO1 not in", values, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1Between(String value1, String value2) {
            addCriterion("RADIO1 between", value1, value2, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio1NotBetween(String value1, String value2) {
            addCriterion("RADIO1 not between", value1, value2, "radio1");
            return (Criteria) this;
        }

        public Criteria andRadio2IsNull() {
            addCriterion("RADIO2 is null");
            return (Criteria) this;
        }

        public Criteria andRadio2IsNotNull() {
            addCriterion("RADIO2 is not null");
            return (Criteria) this;
        }

        public Criteria andRadio2EqualTo(String value) {
            addCriterion("RADIO2 =", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2NotEqualTo(String value) {
            addCriterion("RADIO2 <>", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2GreaterThan(String value) {
            addCriterion("RADIO2 >", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2GreaterThanOrEqualTo(String value) {
            addCriterion("RADIO2 >=", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2LessThan(String value) {
            addCriterion("RADIO2 <", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2LessThanOrEqualTo(String value) {
            addCriterion("RADIO2 <=", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2Like(String value) {
            addCriterion("RADIO2 like", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2NotLike(String value) {
            addCriterion("RADIO2 not like", value, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2In(List<String> values) {
            addCriterion("RADIO2 in", values, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2NotIn(List<String> values) {
            addCriterion("RADIO2 not in", values, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2Between(String value1, String value2) {
            addCriterion("RADIO2 between", value1, value2, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio2NotBetween(String value1, String value2) {
            addCriterion("RADIO2 not between", value1, value2, "radio2");
            return (Criteria) this;
        }

        public Criteria andRadio3IsNull() {
            addCriterion("RADIO3 is null");
            return (Criteria) this;
        }

        public Criteria andRadio3IsNotNull() {
            addCriterion("RADIO3 is not null");
            return (Criteria) this;
        }

        public Criteria andRadio3EqualTo(String value) {
            addCriterion("RADIO3 =", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3NotEqualTo(String value) {
            addCriterion("RADIO3 <>", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3GreaterThan(String value) {
            addCriterion("RADIO3 >", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3GreaterThanOrEqualTo(String value) {
            addCriterion("RADIO3 >=", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3LessThan(String value) {
            addCriterion("RADIO3 <", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3LessThanOrEqualTo(String value) {
            addCriterion("RADIO3 <=", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3Like(String value) {
            addCriterion("RADIO3 like", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3NotLike(String value) {
            addCriterion("RADIO3 not like", value, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3In(List<String> values) {
            addCriterion("RADIO3 in", values, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3NotIn(List<String> values) {
            addCriterion("RADIO3 not in", values, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3Between(String value1, String value2) {
            addCriterion("RADIO3 between", value1, value2, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio3NotBetween(String value1, String value2) {
            addCriterion("RADIO3 not between", value1, value2, "radio3");
            return (Criteria) this;
        }

        public Criteria andRadio4IsNull() {
            addCriterion("RADIO4 is null");
            return (Criteria) this;
        }

        public Criteria andRadio4IsNotNull() {
            addCriterion("RADIO4 is not null");
            return (Criteria) this;
        }

        public Criteria andRadio4EqualTo(String value) {
            addCriterion("RADIO4 =", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4NotEqualTo(String value) {
            addCriterion("RADIO4 <>", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4GreaterThan(String value) {
            addCriterion("RADIO4 >", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4GreaterThanOrEqualTo(String value) {
            addCriterion("RADIO4 >=", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4LessThan(String value) {
            addCriterion("RADIO4 <", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4LessThanOrEqualTo(String value) {
            addCriterion("RADIO4 <=", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4Like(String value) {
            addCriterion("RADIO4 like", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4NotLike(String value) {
            addCriterion("RADIO4 not like", value, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4In(List<String> values) {
            addCriterion("RADIO4 in", values, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4NotIn(List<String> values) {
            addCriterion("RADIO4 not in", values, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4Between(String value1, String value2) {
            addCriterion("RADIO4 between", value1, value2, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio4NotBetween(String value1, String value2) {
            addCriterion("RADIO4 not between", value1, value2, "radio4");
            return (Criteria) this;
        }

        public Criteria andRadio5IsNull() {
            addCriterion("RADIO5 is null");
            return (Criteria) this;
        }

        public Criteria andRadio5IsNotNull() {
            addCriterion("RADIO5 is not null");
            return (Criteria) this;
        }

        public Criteria andRadio5EqualTo(String value) {
            addCriterion("RADIO5 =", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5NotEqualTo(String value) {
            addCriterion("RADIO5 <>", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5GreaterThan(String value) {
            addCriterion("RADIO5 >", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5GreaterThanOrEqualTo(String value) {
            addCriterion("RADIO5 >=", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5LessThan(String value) {
            addCriterion("RADIO5 <", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5LessThanOrEqualTo(String value) {
            addCriterion("RADIO5 <=", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5Like(String value) {
            addCriterion("RADIO5 like", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5NotLike(String value) {
            addCriterion("RADIO5 not like", value, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5In(List<String> values) {
            addCriterion("RADIO5 in", values, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5NotIn(List<String> values) {
            addCriterion("RADIO5 not in", values, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5Between(String value1, String value2) {
            addCriterion("RADIO5 between", value1, value2, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio5NotBetween(String value1, String value2) {
            addCriterion("RADIO5 not between", value1, value2, "radio5");
            return (Criteria) this;
        }

        public Criteria andRadio6IsNull() {
            addCriterion("RADIO6 is null");
            return (Criteria) this;
        }

        public Criteria andRadio6IsNotNull() {
            addCriterion("RADIO6 is not null");
            return (Criteria) this;
        }

        public Criteria andRadio6EqualTo(String value) {
            addCriterion("RADIO6 =", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6NotEqualTo(String value) {
            addCriterion("RADIO6 <>", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6GreaterThan(String value) {
            addCriterion("RADIO6 >", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6GreaterThanOrEqualTo(String value) {
            addCriterion("RADIO6 >=", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6LessThan(String value) {
            addCriterion("RADIO6 <", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6LessThanOrEqualTo(String value) {
            addCriterion("RADIO6 <=", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6Like(String value) {
            addCriterion("RADIO6 like", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6NotLike(String value) {
            addCriterion("RADIO6 not like", value, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6In(List<String> values) {
            addCriterion("RADIO6 in", values, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6NotIn(List<String> values) {
            addCriterion("RADIO6 not in", values, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6Between(String value1, String value2) {
            addCriterion("RADIO6 between", value1, value2, "radio6");
            return (Criteria) this;
        }

        public Criteria andRadio6NotBetween(String value1, String value2) {
            addCriterion("RADIO6 not between", value1, value2, "radio6");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNull() {
            addCriterion("QUESTION1 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNotNull() {
            addCriterion("QUESTION1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion1EqualTo(String value) {
            addCriterion("QUESTION1 =", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotEqualTo(String value) {
            addCriterion("QUESTION1 <>", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThan(String value) {
            addCriterion("QUESTION1 >", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION1 >=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThan(String value) {
            addCriterion("QUESTION1 <", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThanOrEqualTo(String value) {
            addCriterion("QUESTION1 <=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Like(String value) {
            addCriterion("QUESTION1 like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotLike(String value) {
            addCriterion("QUESTION1 not like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1In(List<String> values) {
            addCriterion("QUESTION1 in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotIn(List<String> values) {
            addCriterion("QUESTION1 not in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Between(String value1, String value2) {
            addCriterion("QUESTION1 between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotBetween(String value1, String value2) {
            addCriterion("QUESTION1 not between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNull() {
            addCriterion("QUESTION2 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNotNull() {
            addCriterion("QUESTION2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion2EqualTo(String value) {
            addCriterion("QUESTION2 =", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotEqualTo(String value) {
            addCriterion("QUESTION2 <>", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThan(String value) {
            addCriterion("QUESTION2 >", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION2 >=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThan(String value) {
            addCriterion("QUESTION2 <", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThanOrEqualTo(String value) {
            addCriterion("QUESTION2 <=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Like(String value) {
            addCriterion("QUESTION2 like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotLike(String value) {
            addCriterion("QUESTION2 not like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2In(List<String> values) {
            addCriterion("QUESTION2 in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotIn(List<String> values) {
            addCriterion("QUESTION2 not in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Between(String value1, String value2) {
            addCriterion("QUESTION2 between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotBetween(String value1, String value2) {
            addCriterion("QUESTION2 not between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNull() {
            addCriterion("QUESTION3 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNotNull() {
            addCriterion("QUESTION3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion3EqualTo(String value) {
            addCriterion("QUESTION3 =", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotEqualTo(String value) {
            addCriterion("QUESTION3 <>", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThan(String value) {
            addCriterion("QUESTION3 >", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION3 >=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThan(String value) {
            addCriterion("QUESTION3 <", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThanOrEqualTo(String value) {
            addCriterion("QUESTION3 <=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Like(String value) {
            addCriterion("QUESTION3 like", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotLike(String value) {
            addCriterion("QUESTION3 not like", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3In(List<String> values) {
            addCriterion("QUESTION3 in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotIn(List<String> values) {
            addCriterion("QUESTION3 not in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Between(String value1, String value2) {
            addCriterion("QUESTION3 between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotBetween(String value1, String value2) {
            addCriterion("QUESTION3 not between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNull() {
            addCriterion("QUESTION4 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNotNull() {
            addCriterion("QUESTION4 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion4EqualTo(String value) {
            addCriterion("QUESTION4 =", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotEqualTo(String value) {
            addCriterion("QUESTION4 <>", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThan(String value) {
            addCriterion("QUESTION4 >", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION4 >=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThan(String value) {
            addCriterion("QUESTION4 <", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThanOrEqualTo(String value) {
            addCriterion("QUESTION4 <=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Like(String value) {
            addCriterion("QUESTION4 like", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotLike(String value) {
            addCriterion("QUESTION4 not like", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4In(List<String> values) {
            addCriterion("QUESTION4 in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotIn(List<String> values) {
            addCriterion("QUESTION4 not in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Between(String value1, String value2) {
            addCriterion("QUESTION4 between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotBetween(String value1, String value2) {
            addCriterion("QUESTION4 not between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNull() {
            addCriterion("QUESTION5 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNotNull() {
            addCriterion("QUESTION5 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion5EqualTo(String value) {
            addCriterion("QUESTION5 =", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotEqualTo(String value) {
            addCriterion("QUESTION5 <>", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThan(String value) {
            addCriterion("QUESTION5 >", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION5 >=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThan(String value) {
            addCriterion("QUESTION5 <", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThanOrEqualTo(String value) {
            addCriterion("QUESTION5 <=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Like(String value) {
            addCriterion("QUESTION5 like", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotLike(String value) {
            addCriterion("QUESTION5 not like", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5In(List<String> values) {
            addCriterion("QUESTION5 in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotIn(List<String> values) {
            addCriterion("QUESTION5 not in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Between(String value1, String value2) {
            addCriterion("QUESTION5 between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotBetween(String value1, String value2) {
            addCriterion("QUESTION5 not between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNull() {
            addCriterion("QUESTION6 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNotNull() {
            addCriterion("QUESTION6 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion6EqualTo(String value) {
            addCriterion("QUESTION6 =", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotEqualTo(String value) {
            addCriterion("QUESTION6 <>", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThan(String value) {
            addCriterion("QUESTION6 >", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION6 >=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThan(String value) {
            addCriterion("QUESTION6 <", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThanOrEqualTo(String value) {
            addCriterion("QUESTION6 <=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Like(String value) {
            addCriterion("QUESTION6 like", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotLike(String value) {
            addCriterion("QUESTION6 not like", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6In(List<String> values) {
            addCriterion("QUESTION6 in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotIn(List<String> values) {
            addCriterion("QUESTION6 not in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Between(String value1, String value2) {
            addCriterion("QUESTION6 between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotBetween(String value1, String value2) {
            addCriterion("QUESTION6 not between", value1, value2, "question6");
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