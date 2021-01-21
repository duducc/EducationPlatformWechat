package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_STUDENTS_INTERNSHIP_PROVE
*表说明实习证明
  */
public class JxStudentsInternshipProveSqlWhere extends JxStudentsInternshipProveEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxStudentsInternshipProveSqlWhere() {
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

        public Criteria andStudentsidIsNull() {
            addCriterion("STUDENTSID is null");
            return (Criteria) this;
        }

        public Criteria andStudentsidIsNotNull() {
            addCriterion("STUDENTSID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsidEqualTo(String value) {
            addCriterion("STUDENTSID =", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidNotEqualTo(String value) {
            addCriterion("STUDENTSID <>", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidGreaterThan(String value) {
            addCriterion("STUDENTSID >", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTSID >=", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidLessThan(String value) {
            addCriterion("STUDENTSID <", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidLessThanOrEqualTo(String value) {
            addCriterion("STUDENTSID <=", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidLike(String value) {
            addCriterion("STUDENTSID like", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidNotLike(String value) {
            addCriterion("STUDENTSID not like", value, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidIn(List<String> values) {
            addCriterion("STUDENTSID in", values, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidNotIn(List<String> values) {
            addCriterion("STUDENTSID not in", values, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidBetween(String value1, String value2) {
            addCriterion("STUDENTSID between", value1, value2, "studentsid");
            return (Criteria) this;
        }

        public Criteria andStudentsidNotBetween(String value1, String value2) {
            addCriterion("STUDENTSID not between", value1, value2, "studentsid");
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

        public Criteria andStudentsnameIsNull() {
            addCriterion("STUDENTSNAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentsnameIsNotNull() {
            addCriterion("STUDENTSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsnameEqualTo(String value) {
            addCriterion("STUDENTSNAME =", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameNotEqualTo(String value) {
            addCriterion("STUDENTSNAME <>", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameGreaterThan(String value) {
            addCriterion("STUDENTSNAME >", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTSNAME >=", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameLessThan(String value) {
            addCriterion("STUDENTSNAME <", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameLessThanOrEqualTo(String value) {
            addCriterion("STUDENTSNAME <=", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameLike(String value) {
            addCriterion("STUDENTSNAME like", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameNotLike(String value) {
            addCriterion("STUDENTSNAME not like", value, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameIn(List<String> values) {
            addCriterion("STUDENTSNAME in", values, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameNotIn(List<String> values) {
            addCriterion("STUDENTSNAME not in", values, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameBetween(String value1, String value2) {
            addCriterion("STUDENTSNAME between", value1, value2, "studentsname");
            return (Criteria) this;
        }

        public Criteria andStudentsnameNotBetween(String value1, String value2) {
            addCriterion("STUDENTSNAME not between", value1, value2, "studentsname");
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

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("STARTDATE like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("STARTDATE not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
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

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("ENDDATE like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("ENDDATE not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andZmrIsNull() {
            addCriterion("ZMR is null");
            return (Criteria) this;
        }

        public Criteria andZmrIsNotNull() {
            addCriterion("ZMR is not null");
            return (Criteria) this;
        }

        public Criteria andZmrEqualTo(String value) {
            addCriterion("ZMR =", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotEqualTo(String value) {
            addCriterion("ZMR <>", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrGreaterThan(String value) {
            addCriterion("ZMR >", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrGreaterThanOrEqualTo(String value) {
            addCriterion("ZMR >=", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrLessThan(String value) {
            addCriterion("ZMR <", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrLessThanOrEqualTo(String value) {
            addCriterion("ZMR <=", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrLike(String value) {
            addCriterion("ZMR like", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotLike(String value) {
            addCriterion("ZMR not like", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrIn(List<String> values) {
            addCriterion("ZMR in", values, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotIn(List<String> values) {
            addCriterion("ZMR not in", values, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrBetween(String value1, String value2) {
            addCriterion("ZMR between", value1, value2, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotBetween(String value1, String value2) {
            addCriterion("ZMR not between", value1, value2, "zmr");
            return (Criteria) this;
        }
        
//----------------
        public Criteria andZmridIsNull() {
            addCriterion("ZMRID is null");
            return (Criteria) this;
        }

        public Criteria andZmridIsNotNull() {
            addCriterion("ZMRID is not null");
            return (Criteria) this;
        }

        public Criteria andZmridEqualTo(String value) {
            addCriterion("ZMRID =", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridNotEqualTo(String value) {
            addCriterion("ZMRID <>", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridGreaterThan(String value) {
            addCriterion("ZMRID >", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridGreaterThanOrEqualTo(String value) {
            addCriterion("ZMRID >=", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridLessThan(String value) {
            addCriterion("ZMRID <", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridLessThanOrEqualTo(String value) {
            addCriterion("ZMRID <=", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridLike(String value) {
            addCriterion("ZMRID like", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridNotLike(String value) {
            addCriterion("ZMRID not like", value, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridIn(List<String> values) {
            addCriterion("ZMRID in", values, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridNotIn(List<String> values) {
            addCriterion("ZMRID not in", values, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridBetween(String value1, String value2) {
            addCriterion("ZMRID between", value1, value2, "zmrid");
            return (Criteria) this;
        }

        public Criteria andZmridNotBetween(String value1, String value2) {
            addCriterion("ZMRID not between", value1, value2, "zmrid");
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