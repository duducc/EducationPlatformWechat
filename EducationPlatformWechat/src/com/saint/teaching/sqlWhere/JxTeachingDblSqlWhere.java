package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxTeachingDblEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_TEACHING_DBL
*表说明大病历
  */
public class JxTeachingDblSqlWhere extends JxTeachingDblEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxTeachingDblSqlWhere() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("STU_ID =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("STU_ID <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("STU_ID >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("STU_ID >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("STU_ID <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("STU_ID <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("STU_ID like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("STU_ID not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("STU_ID in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("STU_ID not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("STU_ID between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("STU_ID not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("STU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("STU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("STU_NAME =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("STU_NAME <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("STU_NAME >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("STU_NAME >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("STU_NAME <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("STU_NAME <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("STU_NAME like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("STU_NAME not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("STU_NAME in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("STU_NAME not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("STU_NAME between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("STU_NAME not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("TEACHER_ID like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("TEACHER_ID not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("TEACHER_NAME =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("TEACHER_NAME <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("TEACHER_NAME >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("TEACHER_NAME <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("TEACHER_NAME like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("TEACHER_NAME not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("TEACHER_NAME in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("TEACHER_NAME not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME not between", value1, value2, "teacherName");
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

        public Criteria andZttimeIsNull() {
            addCriterion("ZTTIME is null");
            return (Criteria) this;
        }

        public Criteria andZttimeIsNotNull() {
            addCriterion("ZTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andZttimeEqualTo(Date value) {
            addCriterionForJDBCDate("ZTTIME =", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZTTIME <>", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ZTTIME >", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZTTIME >=", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeLessThan(Date value) {
            addCriterionForJDBCDate("ZTTIME <", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZTTIME <=", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeIn(List<Date> values) {
            addCriterionForJDBCDate("ZTTIME in", values, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZTTIME not in", values, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZTTIME between", value1, value2, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZTTIME not between", value1, value2, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeEqualTo(Timestamp value) {
            addCriterion("ZTTIME =", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeNotEqualTo(Timestamp value) {
            addCriterion("ZTTIME <>", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeGreaterThan(Timestamp value) {
            addCriterion("ZTTIME >", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ZTTIME >=", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeLessThan(Timestamp value) {
            addCriterion("ZTTIME <", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ZTTIME <=", value, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ZTTIME between", value1, value2, "zttime");
            return (Criteria) this;
        }

        public Criteria andZttimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ZTTIME not between", value1, value2, "zttime");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNull() {
            addCriterion("IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNotNull() {
            addCriterion("IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andImgpathEqualTo(String value) {
            addCriterion("IMGPATH =", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotEqualTo(String value) {
            addCriterion("IMGPATH <>", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThan(String value) {
            addCriterion("IMGPATH >", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("IMGPATH >=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThan(String value) {
            addCriterion("IMGPATH <", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThanOrEqualTo(String value) {
            addCriterion("IMGPATH <=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLike(String value) {
            addCriterion("IMGPATH like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotLike(String value) {
            addCriterion("IMGPATH not like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathIn(List<String> values) {
            addCriterion("IMGPATH in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotIn(List<String> values) {
            addCriterion("IMGPATH not in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathBetween(String value1, String value2) {
            addCriterion("IMGPATH between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotBetween(String value1, String value2) {
            addCriterion("IMGPATH not between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("FILEPATH =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("FILEPATH >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("FILEPATH <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("FILEPATH like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("FILEPATH not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("FILEPATH in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andBrnameIsNull() {
            addCriterion("BRNAME is null");
            return (Criteria) this;
        }

        public Criteria andBrnameIsNotNull() {
            addCriterion("BRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrnameEqualTo(String value) {
            addCriterion("BRNAME =", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameNotEqualTo(String value) {
            addCriterion("BRNAME <>", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameGreaterThan(String value) {
            addCriterion("BRNAME >", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameGreaterThanOrEqualTo(String value) {
            addCriterion("BRNAME >=", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameLessThan(String value) {
            addCriterion("BRNAME <", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameLessThanOrEqualTo(String value) {
            addCriterion("BRNAME <=", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameLike(String value) {
            addCriterion("BRNAME like", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameNotLike(String value) {
            addCriterion("BRNAME not like", value, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameIn(List<String> values) {
            addCriterion("BRNAME in", values, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameNotIn(List<String> values) {
            addCriterion("BRNAME not in", values, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameBetween(String value1, String value2) {
            addCriterion("BRNAME between", value1, value2, "brname");
            return (Criteria) this;
        }

        public Criteria andBrnameNotBetween(String value1, String value2) {
            addCriterion("BRNAME not between", value1, value2, "brname");
            return (Criteria) this;
        }

        public Criteria andBrzyIsNull() {
            addCriterion("BRZY is null");
            return (Criteria) this;
        }

        public Criteria andBrzyIsNotNull() {
            addCriterion("BRZY is not null");
            return (Criteria) this;
        }

        public Criteria andBrzyEqualTo(String value) {
            addCriterion("BRZY =", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyNotEqualTo(String value) {
            addCriterion("BRZY <>", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyGreaterThan(String value) {
            addCriterion("BRZY >", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyGreaterThanOrEqualTo(String value) {
            addCriterion("BRZY >=", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyLessThan(String value) {
            addCriterion("BRZY <", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyLessThanOrEqualTo(String value) {
            addCriterion("BRZY <=", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyLike(String value) {
            addCriterion("BRZY like", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyNotLike(String value) {
            addCriterion("BRZY not like", value, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyIn(List<String> values) {
            addCriterion("BRZY in", values, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyNotIn(List<String> values) {
            addCriterion("BRZY not in", values, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyBetween(String value1, String value2) {
            addCriterion("BRZY between", value1, value2, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrzyNotBetween(String value1, String value2) {
            addCriterion("BRZY not between", value1, value2, "brzy");
            return (Criteria) this;
        }

        public Criteria andBrsexIsNull() {
            addCriterion("BRSEX is null");
            return (Criteria) this;
        }

        public Criteria andBrsexIsNotNull() {
            addCriterion("BRSEX is not null");
            return (Criteria) this;
        }

        public Criteria andBrsexEqualTo(String value) {
            addCriterion("BRSEX =", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexNotEqualTo(String value) {
            addCriterion("BRSEX <>", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexGreaterThan(String value) {
            addCriterion("BRSEX >", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexGreaterThanOrEqualTo(String value) {
            addCriterion("BRSEX >=", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexLessThan(String value) {
            addCriterion("BRSEX <", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexLessThanOrEqualTo(String value) {
            addCriterion("BRSEX <=", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexLike(String value) {
            addCriterion("BRSEX like", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexNotLike(String value) {
            addCriterion("BRSEX not like", value, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexIn(List<String> values) {
            addCriterion("BRSEX in", values, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexNotIn(List<String> values) {
            addCriterion("BRSEX not in", values, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexBetween(String value1, String value2) {
            addCriterion("BRSEX between", value1, value2, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrsexNotBetween(String value1, String value2) {
            addCriterion("BRSEX not between", value1, value2, "brsex");
            return (Criteria) this;
        }

        public Criteria andBrdressIsNull() {
            addCriterion("BRDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBrdressIsNotNull() {
            addCriterion("BRDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBrdressEqualTo(String value) {
            addCriterion("BRDRESS =", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressNotEqualTo(String value) {
            addCriterion("BRDRESS <>", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressGreaterThan(String value) {
            addCriterion("BRDRESS >", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressGreaterThanOrEqualTo(String value) {
            addCriterion("BRDRESS >=", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressLessThan(String value) {
            addCriterion("BRDRESS <", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressLessThanOrEqualTo(String value) {
            addCriterion("BRDRESS <=", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressLike(String value) {
            addCriterion("BRDRESS like", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressNotLike(String value) {
            addCriterion("BRDRESS not like", value, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressIn(List<String> values) {
            addCriterion("BRDRESS in", values, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressNotIn(List<String> values) {
            addCriterion("BRDRESS not in", values, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressBetween(String value1, String value2) {
            addCriterion("BRDRESS between", value1, value2, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrdressNotBetween(String value1, String value2) {
            addCriterion("BRDRESS not between", value1, value2, "brdress");
            return (Criteria) this;
        }

        public Criteria andBrageIsNull() {
            addCriterion("BRAGE is null");
            return (Criteria) this;
        }

        public Criteria andBrageIsNotNull() {
            addCriterion("BRAGE is not null");
            return (Criteria) this;
        }

        public Criteria andBrageEqualTo(BigDecimal value) {
            addCriterion("BRAGE =", value, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageNotEqualTo(BigDecimal value) {
            addCriterion("BRAGE <>", value, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageGreaterThan(BigDecimal value) {
            addCriterion("BRAGE >", value, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BRAGE >=", value, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageLessThan(BigDecimal value) {
            addCriterion("BRAGE <", value, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BRAGE <=", value, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageIn(List<BigDecimal> values) {
            addCriterion("BRAGE in", values, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageNotIn(List<BigDecimal> values) {
            addCriterion("BRAGE not in", values, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BRAGE between", value1, value2, "brage");
            return (Criteria) this;
        }

        public Criteria andBrageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BRAGE not between", value1, value2, "brage");
            return (Criteria) this;
        }

        public Criteria andBrrydateIsNull() {
            addCriterion("BRRYDATE is null");
            return (Criteria) this;
        }

        public Criteria andBrrydateIsNotNull() {
            addCriterion("BRRYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBrrydateEqualTo(Date value) {
            addCriterionForJDBCDate("BRRYDATE =", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BRRYDATE <>", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateGreaterThan(Date value) {
            addCriterionForJDBCDate("BRRYDATE >", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BRRYDATE >=", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateLessThan(Date value) {
            addCriterionForJDBCDate("BRRYDATE <", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BRRYDATE <=", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateIn(List<Date> values) {
            addCriterionForJDBCDate("BRRYDATE in", values, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BRRYDATE not in", values, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BRRYDATE between", value1, value2, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BRRYDATE not between", value1, value2, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateEqualTo(Timestamp value) {
            addCriterion("BRRYDATE =", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateNotEqualTo(Timestamp value) {
            addCriterion("BRRYDATE <>", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateGreaterThan(Timestamp value) {
            addCriterion("BRRYDATE >", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BRRYDATE >=", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateLessThan(Timestamp value) {
            addCriterion("BRRYDATE <", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateLessThanOrEqualTo(Timestamp value) {
            addCriterion("BRRYDATE <=", value, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BRRYDATE between", value1, value2, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrrydateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BRRYDATE not between", value1, value2, "brrydate");
            return (Criteria) this;
        }

        public Criteria andBrmzIsNull() {
            addCriterion("BRMZ is null");
            return (Criteria) this;
        }

        public Criteria andBrmzIsNotNull() {
            addCriterion("BRMZ is not null");
            return (Criteria) this;
        }

        public Criteria andBrmzEqualTo(String value) {
            addCriterion("BRMZ =", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzNotEqualTo(String value) {
            addCriterion("BRMZ <>", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzGreaterThan(String value) {
            addCriterion("BRMZ >", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzGreaterThanOrEqualTo(String value) {
            addCriterion("BRMZ >=", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzLessThan(String value) {
            addCriterion("BRMZ <", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzLessThanOrEqualTo(String value) {
            addCriterion("BRMZ <=", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzLike(String value) {
            addCriterion("BRMZ like", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzNotLike(String value) {
            addCriterion("BRMZ not like", value, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzIn(List<String> values) {
            addCriterion("BRMZ in", values, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzNotIn(List<String> values) {
            addCriterion("BRMZ not in", values, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzBetween(String value1, String value2) {
            addCriterion("BRMZ between", value1, value2, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrmzNotBetween(String value1, String value2) {
            addCriterion("BRMZ not between", value1, value2, "brmz");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateIsNull() {
            addCriterion("BRBSHCJDATE is null");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateIsNotNull() {
            addCriterion("BRBSHCJDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateEqualTo(Date value) {
            addCriterionForJDBCDate("BRBSHCJDATE =", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BRBSHCJDATE <>", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BRBSHCJDATE >", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BRBSHCJDATE >=", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateLessThan(Date value) {
            addCriterionForJDBCDate("BRBSHCJDATE <", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BRBSHCJDATE <=", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateIn(List<Date> values) {
            addCriterionForJDBCDate("BRBSHCJDATE in", values, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BRBSHCJDATE not in", values, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BRBSHCJDATE between", value1, value2, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BRBSHCJDATE not between", value1, value2, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateEqualTo(Timestamp value) {
            addCriterion("BRBSHCJDATE =", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateNotEqualTo(Timestamp value) {
            addCriterion("BRBSHCJDATE <>", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateGreaterThan(Timestamp value) {
            addCriterion("BRBSHCJDATE >", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BRBSHCJDATE >=", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateLessThan(Timestamp value) {
            addCriterion("BRBSHCJDATE <", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("BRBSHCJDATE <=", value, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BRBSHCJDATE between", value1, value2, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrbshcjdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BRBSHCJDATE not between", value1, value2, "brbshcjdate");
            return (Criteria) this;
        }

        public Criteria andBrjgIsNull() {
            addCriterion("BRJG is null");
            return (Criteria) this;
        }

        public Criteria andBrjgIsNotNull() {
            addCriterion("BRJG is not null");
            return (Criteria) this;
        }

        public Criteria andBrjgEqualTo(String value) {
            addCriterion("BRJG =", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgNotEqualTo(String value) {
            addCriterion("BRJG <>", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgGreaterThan(String value) {
            addCriterion("BRJG >", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgGreaterThanOrEqualTo(String value) {
            addCriterion("BRJG >=", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgLessThan(String value) {
            addCriterion("BRJG <", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgLessThanOrEqualTo(String value) {
            addCriterion("BRJG <=", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgLike(String value) {
            addCriterion("BRJG like", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgNotLike(String value) {
            addCriterion("BRJG not like", value, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgIn(List<String> values) {
            addCriterion("BRJG in", values, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgNotIn(List<String> values) {
            addCriterion("BRJG not in", values, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgBetween(String value1, String value2) {
            addCriterion("BRJG between", value1, value2, "brjg");
            return (Criteria) this;
        }

        public Criteria andBrjgNotBetween(String value1, String value2) {
            addCriterion("BRJG not between", value1, value2, "brjg");
            return (Criteria) this;
        }

        public Criteria andBsxhsridIsNull() {
            addCriterion("BSXHSRID is null");
            return (Criteria) this;
        }

        public Criteria andBsxhsridIsNotNull() {
            addCriterion("BSXHSRID is not null");
            return (Criteria) this;
        }

        public Criteria andBsxhsridEqualTo(String value) {
            addCriterion("BSXHSRID =", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridNotEqualTo(String value) {
            addCriterion("BSXHSRID <>", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridGreaterThan(String value) {
            addCriterion("BSXHSRID >", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridGreaterThanOrEqualTo(String value) {
            addCriterion("BSXHSRID >=", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridLessThan(String value) {
            addCriterion("BSXHSRID <", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridLessThanOrEqualTo(String value) {
            addCriterion("BSXHSRID <=", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridLike(String value) {
            addCriterion("BSXHSRID like", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridNotLike(String value) {
            addCriterion("BSXHSRID not like", value, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridIn(List<String> values) {
            addCriterion("BSXHSRID in", values, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridNotIn(List<String> values) {
            addCriterion("BSXHSRID not in", values, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridBetween(String value1, String value2) {
            addCriterion("BSXHSRID between", value1, value2, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsridNotBetween(String value1, String value2) {
            addCriterion("BSXHSRID not between", value1, value2, "bsxhsrid");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameIsNull() {
            addCriterion("BSXHSRNAME is null");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameIsNotNull() {
            addCriterion("BSXHSRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameEqualTo(String value) {
            addCriterion("BSXHSRNAME =", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameNotEqualTo(String value) {
            addCriterion("BSXHSRNAME <>", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameGreaterThan(String value) {
            addCriterion("BSXHSRNAME >", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("BSXHSRNAME >=", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameLessThan(String value) {
            addCriterion("BSXHSRNAME <", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameLessThanOrEqualTo(String value) {
            addCriterion("BSXHSRNAME <=", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameLike(String value) {
            addCriterion("BSXHSRNAME like", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameNotLike(String value) {
            addCriterion("BSXHSRNAME not like", value, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameIn(List<String> values) {
            addCriterion("BSXHSRNAME in", values, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameNotIn(List<String> values) {
            addCriterion("BSXHSRNAME not in", values, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameBetween(String value1, String value2) {
            addCriterion("BSXHSRNAME between", value1, value2, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBsxhsrnameNotBetween(String value1, String value2) {
            addCriterion("BSXHSRNAME not between", value1, value2, "bsxhsrname");
            return (Criteria) this;
        }

        public Criteria andBrmarrIsNull() {
            addCriterion("BRMARR is null");
            return (Criteria) this;
        }

        public Criteria andBrmarrIsNotNull() {
            addCriterion("BRMARR is not null");
            return (Criteria) this;
        }

        public Criteria andBrmarrEqualTo(String value) {
            addCriterion("BRMARR =", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrNotEqualTo(String value) {
            addCriterion("BRMARR <>", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrGreaterThan(String value) {
            addCriterion("BRMARR >", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrGreaterThanOrEqualTo(String value) {
            addCriterion("BRMARR >=", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrLessThan(String value) {
            addCriterion("BRMARR <", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrLessThanOrEqualTo(String value) {
            addCriterion("BRMARR <=", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrLike(String value) {
            addCriterion("BRMARR like", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrNotLike(String value) {
            addCriterion("BRMARR not like", value, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrIn(List<String> values) {
            addCriterion("BRMARR in", values, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrNotIn(List<String> values) {
            addCriterion("BRMARR not in", values, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrBetween(String value1, String value2) {
            addCriterion("BRMARR between", value1, value2, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrmarrNotBetween(String value1, String value2) {
            addCriterion("BRMARR not between", value1, value2, "brmarr");
            return (Criteria) this;
        }

        public Criteria andBrkkchdIsNull() {
            addCriterion("BRKKCHD is null");
            return (Criteria) this;
        }

        public Criteria andBrkkchdIsNotNull() {
            addCriterion("BRKKCHD is not null");
            return (Criteria) this;
        }

        public Criteria andBrkkchdEqualTo(String value) {
            addCriterion("BRKKCHD =", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdNotEqualTo(String value) {
            addCriterion("BRKKCHD <>", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdGreaterThan(String value) {
            addCriterion("BRKKCHD >", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdGreaterThanOrEqualTo(String value) {
            addCriterion("BRKKCHD >=", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdLessThan(String value) {
            addCriterion("BRKKCHD <", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdLessThanOrEqualTo(String value) {
            addCriterion("BRKKCHD <=", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdLike(String value) {
            addCriterion("BRKKCHD like", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdNotLike(String value) {
            addCriterion("BRKKCHD not like", value, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdIn(List<String> values) {
            addCriterion("BRKKCHD in", values, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdNotIn(List<String> values) {
            addCriterion("BRKKCHD not in", values, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdBetween(String value1, String value2) {
            addCriterion("BRKKCHD between", value1, value2, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBrkkchdNotBetween(String value1, String value2) {
            addCriterion("BRKKCHD not between", value1, value2, "brkkchd");
            return (Criteria) this;
        }

        public Criteria andBhusuIsNull() {
            addCriterion("BHUSU is null");
            return (Criteria) this;
        }

        public Criteria andBhusuIsNotNull() {
            addCriterion("BHUSU is not null");
            return (Criteria) this;
        }

        public Criteria andBhusuEqualTo(String value) {
            addCriterion("BHUSU =", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuNotEqualTo(String value) {
            addCriterion("BHUSU <>", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuGreaterThan(String value) {
            addCriterion("BHUSU >", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuGreaterThanOrEqualTo(String value) {
            addCriterion("BHUSU >=", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuLessThan(String value) {
            addCriterion("BHUSU <", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuLessThanOrEqualTo(String value) {
            addCriterion("BHUSU <=", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuLike(String value) {
            addCriterion("BHUSU like", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuNotLike(String value) {
            addCriterion("BHUSU not like", value, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuIn(List<String> values) {
            addCriterion("BHUSU in", values, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuNotIn(List<String> values) {
            addCriterion("BHUSU not in", values, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuBetween(String value1, String value2) {
            addCriterion("BHUSU between", value1, value2, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBhusuNotBetween(String value1, String value2) {
            addCriterion("BHUSU not between", value1, value2, "bhusu");
            return (Criteria) this;
        }

        public Criteria andBrxbshIsNull() {
            addCriterion("BRXBSH is null");
            return (Criteria) this;
        }

        public Criteria andBrxbshIsNotNull() {
            addCriterion("BRXBSH is not null");
            return (Criteria) this;
        }

        public Criteria andBrxbshEqualTo(String value) {
            addCriterion("BRXBSH =", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshNotEqualTo(String value) {
            addCriterion("BRXBSH <>", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshGreaterThan(String value) {
            addCriterion("BRXBSH >", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshGreaterThanOrEqualTo(String value) {
            addCriterion("BRXBSH >=", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshLessThan(String value) {
            addCriterion("BRXBSH <", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshLessThanOrEqualTo(String value) {
            addCriterion("BRXBSH <=", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshLike(String value) {
            addCriterion("BRXBSH like", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshNotLike(String value) {
            addCriterion("BRXBSH not like", value, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshIn(List<String> values) {
            addCriterion("BRXBSH in", values, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshNotIn(List<String> values) {
            addCriterion("BRXBSH not in", values, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshBetween(String value1, String value2) {
            addCriterion("BRXBSH between", value1, value2, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrxbshNotBetween(String value1, String value2) {
            addCriterion("BRXBSH not between", value1, value2, "brxbsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshIsNull() {
            addCriterion("BRJWSH is null");
            return (Criteria) this;
        }

        public Criteria andBrjwshIsNotNull() {
            addCriterion("BRJWSH is not null");
            return (Criteria) this;
        }

        public Criteria andBrjwshEqualTo(String value) {
            addCriterion("BRJWSH =", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshNotEqualTo(String value) {
            addCriterion("BRJWSH <>", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshGreaterThan(String value) {
            addCriterion("BRJWSH >", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshGreaterThanOrEqualTo(String value) {
            addCriterion("BRJWSH >=", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshLessThan(String value) {
            addCriterion("BRJWSH <", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshLessThanOrEqualTo(String value) {
            addCriterion("BRJWSH <=", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshLike(String value) {
            addCriterion("BRJWSH like", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshNotLike(String value) {
            addCriterion("BRJWSH not like", value, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshIn(List<String> values) {
            addCriterion("BRJWSH in", values, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshNotIn(List<String> values) {
            addCriterion("BRJWSH not in", values, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshBetween(String value1, String value2) {
            addCriterion("BRJWSH between", value1, value2, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrjwshNotBetween(String value1, String value2) {
            addCriterion("BRJWSH not between", value1, value2, "brjwsh");
            return (Criteria) this;
        }

        public Criteria andBrxthgIsNull() {
            addCriterion("BRXTHG is null");
            return (Criteria) this;
        }

        public Criteria andBrxthgIsNotNull() {
            addCriterion("BRXTHG is not null");
            return (Criteria) this;
        }

        public Criteria andBrxthgEqualTo(String value) {
            addCriterion("BRXTHG =", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgNotEqualTo(String value) {
            addCriterion("BRXTHG <>", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgGreaterThan(String value) {
            addCriterion("BRXTHG >", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgGreaterThanOrEqualTo(String value) {
            addCriterion("BRXTHG >=", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgLessThan(String value) {
            addCriterion("BRXTHG <", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgLessThanOrEqualTo(String value) {
            addCriterion("BRXTHG <=", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgLike(String value) {
            addCriterion("BRXTHG like", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgNotLike(String value) {
            addCriterion("BRXTHG not like", value, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgIn(List<String> values) {
            addCriterion("BRXTHG in", values, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgNotIn(List<String> values) {
            addCriterion("BRXTHG not in", values, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgBetween(String value1, String value2) {
            addCriterion("BRXTHG between", value1, value2, "brxthg");
            return (Criteria) this;
        }

        public Criteria andBrxthgNotBetween(String value1, String value2) {
            addCriterion("BRXTHG not between", value1, value2, "brxthg");
            return (Criteria) this;
        }

        public Criteria andHxxtIsNull() {
            addCriterion("HXXT is null");
            return (Criteria) this;
        }

        public Criteria andHxxtIsNotNull() {
            addCriterion("HXXT is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtEqualTo(String value) {
            addCriterion("HXXT =", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtNotEqualTo(String value) {
            addCriterion("HXXT <>", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtGreaterThan(String value) {
            addCriterion("HXXT >", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtGreaterThanOrEqualTo(String value) {
            addCriterion("HXXT >=", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtLessThan(String value) {
            addCriterion("HXXT <", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtLessThanOrEqualTo(String value) {
            addCriterion("HXXT <=", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtLike(String value) {
            addCriterion("HXXT like", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtNotLike(String value) {
            addCriterion("HXXT not like", value, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtIn(List<String> values) {
            addCriterion("HXXT in", values, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtNotIn(List<String> values) {
            addCriterion("HXXT not in", values, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtBetween(String value1, String value2) {
            addCriterion("HXXT between", value1, value2, "hxxt");
            return (Criteria) this;
        }

        public Criteria andHxxtNotBetween(String value1, String value2) {
            addCriterion("HXXT not between", value1, value2, "hxxt");
            return (Criteria) this;
        }

        public Criteria andXhxtIsNull() {
            addCriterion("XHXT is null");
            return (Criteria) this;
        }

        public Criteria andXhxtIsNotNull() {
            addCriterion("XHXT is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtEqualTo(String value) {
            addCriterion("XHXT =", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtNotEqualTo(String value) {
            addCriterion("XHXT <>", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtGreaterThan(String value) {
            addCriterion("XHXT >", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtGreaterThanOrEqualTo(String value) {
            addCriterion("XHXT >=", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtLessThan(String value) {
            addCriterion("XHXT <", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtLessThanOrEqualTo(String value) {
            addCriterion("XHXT <=", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtLike(String value) {
            addCriterion("XHXT like", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtNotLike(String value) {
            addCriterion("XHXT not like", value, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtIn(List<String> values) {
            addCriterion("XHXT in", values, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtNotIn(List<String> values) {
            addCriterion("XHXT not in", values, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtBetween(String value1, String value2) {
            addCriterion("XHXT between", value1, value2, "xhxt");
            return (Criteria) this;
        }

        public Criteria andXhxtNotBetween(String value1, String value2) {
            addCriterion("XHXT not between", value1, value2, "xhxt");
            return (Criteria) this;
        }

        public Criteria andMnxtIsNull() {
            addCriterion("MNXT is null");
            return (Criteria) this;
        }

        public Criteria andMnxtIsNotNull() {
            addCriterion("MNXT is not null");
            return (Criteria) this;
        }

        public Criteria andMnxtEqualTo(String value) {
            addCriterion("MNXT =", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtNotEqualTo(String value) {
            addCriterion("MNXT <>", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtGreaterThan(String value) {
            addCriterion("MNXT >", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtGreaterThanOrEqualTo(String value) {
            addCriterion("MNXT >=", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtLessThan(String value) {
            addCriterion("MNXT <", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtLessThanOrEqualTo(String value) {
            addCriterion("MNXT <=", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtLike(String value) {
            addCriterion("MNXT like", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtNotLike(String value) {
            addCriterion("MNXT not like", value, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtIn(List<String> values) {
            addCriterion("MNXT in", values, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtNotIn(List<String> values) {
            addCriterion("MNXT not in", values, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtBetween(String value1, String value2) {
            addCriterion("MNXT between", value1, value2, "mnxt");
            return (Criteria) this;
        }

        public Criteria andMnxtNotBetween(String value1, String value2) {
            addCriterion("MNXT not between", value1, value2, "mnxt");
            return (Criteria) this;
        }

        public Criteria andZxxtIsNull() {
            addCriterion("ZXXT is null");
            return (Criteria) this;
        }

        public Criteria andZxxtIsNotNull() {
            addCriterion("ZXXT is not null");
            return (Criteria) this;
        }

        public Criteria andZxxtEqualTo(String value) {
            addCriterion("ZXXT =", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtNotEqualTo(String value) {
            addCriterion("ZXXT <>", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtGreaterThan(String value) {
            addCriterion("ZXXT >", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtGreaterThanOrEqualTo(String value) {
            addCriterion("ZXXT >=", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtLessThan(String value) {
            addCriterion("ZXXT <", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtLessThanOrEqualTo(String value) {
            addCriterion("ZXXT <=", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtLike(String value) {
            addCriterion("ZXXT like", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtNotLike(String value) {
            addCriterion("ZXXT not like", value, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtIn(List<String> values) {
            addCriterion("ZXXT in", values, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtNotIn(List<String> values) {
            addCriterion("ZXXT not in", values, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtBetween(String value1, String value2) {
            addCriterion("ZXXT between", value1, value2, "zxxt");
            return (Criteria) this;
        }

        public Criteria andZxxtNotBetween(String value1, String value2) {
            addCriterion("ZXXT not between", value1, value2, "zxxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtIsNull() {
            addCriterion("JRGGXT is null");
            return (Criteria) this;
        }

        public Criteria andJrggxtIsNotNull() {
            addCriterion("JRGGXT is not null");
            return (Criteria) this;
        }

        public Criteria andJrggxtEqualTo(String value) {
            addCriterion("JRGGXT =", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtNotEqualTo(String value) {
            addCriterion("JRGGXT <>", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtGreaterThan(String value) {
            addCriterion("JRGGXT >", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtGreaterThanOrEqualTo(String value) {
            addCriterion("JRGGXT >=", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtLessThan(String value) {
            addCriterion("JRGGXT <", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtLessThanOrEqualTo(String value) {
            addCriterion("JRGGXT <=", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtLike(String value) {
            addCriterion("JRGGXT like", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtNotLike(String value) {
            addCriterion("JRGGXT not like", value, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtIn(List<String> values) {
            addCriterion("JRGGXT in", values, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtNotIn(List<String> values) {
            addCriterion("JRGGXT not in", values, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtBetween(String value1, String value2) {
            addCriterion("JRGGXT between", value1, value2, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andJrggxtNotBetween(String value1, String value2) {
            addCriterion("JRGGXT not between", value1, value2, "jrggxt");
            return (Criteria) this;
        }

        public Criteria andShjxtIsNull() {
            addCriterion("SHJXT is null");
            return (Criteria) this;
        }

        public Criteria andShjxtIsNotNull() {
            addCriterion("SHJXT is not null");
            return (Criteria) this;
        }

        public Criteria andShjxtEqualTo(String value) {
            addCriterion("SHJXT =", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtNotEqualTo(String value) {
            addCriterion("SHJXT <>", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtGreaterThan(String value) {
            addCriterion("SHJXT >", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtGreaterThanOrEqualTo(String value) {
            addCriterion("SHJXT >=", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtLessThan(String value) {
            addCriterion("SHJXT <", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtLessThanOrEqualTo(String value) {
            addCriterion("SHJXT <=", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtLike(String value) {
            addCriterion("SHJXT like", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtNotLike(String value) {
            addCriterion("SHJXT not like", value, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtIn(List<String> values) {
            addCriterion("SHJXT in", values, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtNotIn(List<String> values) {
            addCriterion("SHJXT not in", values, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtBetween(String value1, String value2) {
            addCriterion("SHJXT between", value1, value2, "shjxt");
            return (Criteria) this;
        }

        public Criteria andShjxtNotBetween(String value1, String value2) {
            addCriterion("SHJXT not between", value1, value2, "shjxt");
            return (Criteria) this;
        }

        public Criteria andBrgrshIsNull() {
            addCriterion("BRGRSH is null");
            return (Criteria) this;
        }

        public Criteria andBrgrshIsNotNull() {
            addCriterion("BRGRSH is not null");
            return (Criteria) this;
        }

        public Criteria andBrgrshEqualTo(String value) {
            addCriterion("BRGRSH =", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshNotEqualTo(String value) {
            addCriterion("BRGRSH <>", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshGreaterThan(String value) {
            addCriterion("BRGRSH >", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshGreaterThanOrEqualTo(String value) {
            addCriterion("BRGRSH >=", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshLessThan(String value) {
            addCriterion("BRGRSH <", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshLessThanOrEqualTo(String value) {
            addCriterion("BRGRSH <=", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshLike(String value) {
            addCriterion("BRGRSH like", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshNotLike(String value) {
            addCriterion("BRGRSH not like", value, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshIn(List<String> values) {
            addCriterion("BRGRSH in", values, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshNotIn(List<String> values) {
            addCriterion("BRGRSH not in", values, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshBetween(String value1, String value2) {
            addCriterion("BRGRSH between", value1, value2, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andBrgrshNotBetween(String value1, String value2) {
            addCriterion("BRGRSH not between", value1, value2, "brgrsh");
            return (Criteria) this;
        }

        public Criteria andHyshIsNull() {
            addCriterion("HYSH is null");
            return (Criteria) this;
        }

        public Criteria andHyshIsNotNull() {
            addCriterion("HYSH is not null");
            return (Criteria) this;
        }

        public Criteria andHyshEqualTo(String value) {
            addCriterion("HYSH =", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshNotEqualTo(String value) {
            addCriterion("HYSH <>", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshGreaterThan(String value) {
            addCriterion("HYSH >", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshGreaterThanOrEqualTo(String value) {
            addCriterion("HYSH >=", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshLessThan(String value) {
            addCriterion("HYSH <", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshLessThanOrEqualTo(String value) {
            addCriterion("HYSH <=", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshLike(String value) {
            addCriterion("HYSH like", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshNotLike(String value) {
            addCriterion("HYSH not like", value, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshIn(List<String> values) {
            addCriterion("HYSH in", values, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshNotIn(List<String> values) {
            addCriterion("HYSH not in", values, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshBetween(String value1, String value2) {
            addCriterion("HYSH between", value1, value2, "hysh");
            return (Criteria) this;
        }

        public Criteria andHyshNotBetween(String value1, String value2) {
            addCriterion("HYSH not between", value1, value2, "hysh");
            return (Criteria) this;
        }

        public Criteria andYjshysIsNull() {
            addCriterion("YJSHYS is null");
            return (Criteria) this;
        }

        public Criteria andYjshysIsNotNull() {
            addCriterion("YJSHYS is not null");
            return (Criteria) this;
        }

        public Criteria andYjshysEqualTo(String value) {
            addCriterion("YJSHYS =", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysNotEqualTo(String value) {
            addCriterion("YJSHYS <>", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysGreaterThan(String value) {
            addCriterion("YJSHYS >", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysGreaterThanOrEqualTo(String value) {
            addCriterion("YJSHYS >=", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysLessThan(String value) {
            addCriterion("YJSHYS <", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysLessThanOrEqualTo(String value) {
            addCriterion("YJSHYS <=", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysLike(String value) {
            addCriterion("YJSHYS like", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysNotLike(String value) {
            addCriterion("YJSHYS not like", value, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysIn(List<String> values) {
            addCriterion("YJSHYS in", values, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysNotIn(List<String> values) {
            addCriterion("YJSHYS not in", values, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysBetween(String value1, String value2) {
            addCriterion("YJSHYS between", value1, value2, "yjshys");
            return (Criteria) this;
        }

        public Criteria andYjshysNotBetween(String value1, String value2) {
            addCriterion("YJSHYS not between", value1, value2, "yjshys");
            return (Criteria) this;
        }

        public Criteria andJzushIsNull() {
            addCriterion("JZUSH is null");
            return (Criteria) this;
        }

        public Criteria andJzushIsNotNull() {
            addCriterion("JZUSH is not null");
            return (Criteria) this;
        }

        public Criteria andJzushEqualTo(String value) {
            addCriterion("JZUSH =", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushNotEqualTo(String value) {
            addCriterion("JZUSH <>", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushGreaterThan(String value) {
            addCriterion("JZUSH >", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushGreaterThanOrEqualTo(String value) {
            addCriterion("JZUSH >=", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushLessThan(String value) {
            addCriterion("JZUSH <", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushLessThanOrEqualTo(String value) {
            addCriterion("JZUSH <=", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushLike(String value) {
            addCriterion("JZUSH like", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushNotLike(String value) {
            addCriterion("JZUSH not like", value, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushIn(List<String> values) {
            addCriterion("JZUSH in", values, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushNotIn(List<String> values) {
            addCriterion("JZUSH not in", values, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushBetween(String value1, String value2) {
            addCriterion("JZUSH between", value1, value2, "jzush");
            return (Criteria) this;
        }

        public Criteria andJzushNotBetween(String value1, String value2) {
            addCriterion("JZUSH not between", value1, value2, "jzush");
            return (Criteria) this;
        }

        public Criteria andGmshIsNull() {
            addCriterion("GMSH is null");
            return (Criteria) this;
        }

        public Criteria andGmshIsNotNull() {
            addCriterion("GMSH is not null");
            return (Criteria) this;
        }

        public Criteria andGmshEqualTo(String value) {
            addCriterion("GMSH =", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshNotEqualTo(String value) {
            addCriterion("GMSH <>", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshGreaterThan(String value) {
            addCriterion("GMSH >", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshGreaterThanOrEqualTo(String value) {
            addCriterion("GMSH >=", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshLessThan(String value) {
            addCriterion("GMSH <", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshLessThanOrEqualTo(String value) {
            addCriterion("GMSH <=", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshLike(String value) {
            addCriterion("GMSH like", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshNotLike(String value) {
            addCriterion("GMSH not like", value, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshIn(List<String> values) {
            addCriterion("GMSH in", values, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshNotIn(List<String> values) {
            addCriterion("GMSH not in", values, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshBetween(String value1, String value2) {
            addCriterion("GMSH between", value1, value2, "gmsh");
            return (Criteria) this;
        }

        public Criteria andGmshNotBetween(String value1, String value2) {
            addCriterion("GMSH not between", value1, value2, "gmsh");
            return (Criteria) this;
        }

        public Criteria andShxshIsNull() {
            addCriterion("SHXSH is null");
            return (Criteria) this;
        }

        public Criteria andShxshIsNotNull() {
            addCriterion("SHXSH is not null");
            return (Criteria) this;
        }

        public Criteria andShxshEqualTo(String value) {
            addCriterion("SHXSH =", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshNotEqualTo(String value) {
            addCriterion("SHXSH <>", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshGreaterThan(String value) {
            addCriterion("SHXSH >", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshGreaterThanOrEqualTo(String value) {
            addCriterion("SHXSH >=", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshLessThan(String value) {
            addCriterion("SHXSH <", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshLessThanOrEqualTo(String value) {
            addCriterion("SHXSH <=", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshLike(String value) {
            addCriterion("SHXSH like", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshNotLike(String value) {
            addCriterion("SHXSH not like", value, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshIn(List<String> values) {
            addCriterion("SHXSH in", values, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshNotIn(List<String> values) {
            addCriterion("SHXSH not in", values, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshBetween(String value1, String value2) {
            addCriterion("SHXSH between", value1, value2, "shxsh");
            return (Criteria) this;
        }

        public Criteria andShxshNotBetween(String value1, String value2) {
            addCriterion("SHXSH not between", value1, value2, "shxsh");
            return (Criteria) this;
        }

        public Criteria andTgjctIsNull() {
            addCriterion("TGJCT is null");
            return (Criteria) this;
        }

        public Criteria andTgjctIsNotNull() {
            addCriterion("TGJCT is not null");
            return (Criteria) this;
        }

        public Criteria andTgjctEqualTo(String value) {
            addCriterion("TGJCT =", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctNotEqualTo(String value) {
            addCriterion("TGJCT <>", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctGreaterThan(String value) {
            addCriterion("TGJCT >", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctGreaterThanOrEqualTo(String value) {
            addCriterion("TGJCT >=", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctLessThan(String value) {
            addCriterion("TGJCT <", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctLessThanOrEqualTo(String value) {
            addCriterion("TGJCT <=", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctLike(String value) {
            addCriterion("TGJCT like", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctNotLike(String value) {
            addCriterion("TGJCT not like", value, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctIn(List<String> values) {
            addCriterion("TGJCT in", values, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctNotIn(List<String> values) {
            addCriterion("TGJCT not in", values, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctBetween(String value1, String value2) {
            addCriterion("TGJCT between", value1, value2, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjctNotBetween(String value1, String value2) {
            addCriterion("TGJCT not between", value1, value2, "tgjct");
            return (Criteria) this;
        }

        public Criteria andTgjcpIsNull() {
            addCriterion("TGJCP is null");
            return (Criteria) this;
        }

        public Criteria andTgjcpIsNotNull() {
            addCriterion("TGJCP is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcpEqualTo(String value) {
            addCriterion("TGJCP =", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpNotEqualTo(String value) {
            addCriterion("TGJCP <>", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpGreaterThan(String value) {
            addCriterion("TGJCP >", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpGreaterThanOrEqualTo(String value) {
            addCriterion("TGJCP >=", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpLessThan(String value) {
            addCriterion("TGJCP <", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpLessThanOrEqualTo(String value) {
            addCriterion("TGJCP <=", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpLike(String value) {
            addCriterion("TGJCP like", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpNotLike(String value) {
            addCriterion("TGJCP not like", value, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpIn(List<String> values) {
            addCriterion("TGJCP in", values, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpNotIn(List<String> values) {
            addCriterion("TGJCP not in", values, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpBetween(String value1, String value2) {
            addCriterion("TGJCP between", value1, value2, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcpNotBetween(String value1, String value2) {
            addCriterion("TGJCP not between", value1, value2, "tgjcp");
            return (Criteria) this;
        }

        public Criteria andTgjcrIsNull() {
            addCriterion("TGJCR is null");
            return (Criteria) this;
        }

        public Criteria andTgjcrIsNotNull() {
            addCriterion("TGJCR is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcrEqualTo(String value) {
            addCriterion("TGJCR =", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrNotEqualTo(String value) {
            addCriterion("TGJCR <>", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrGreaterThan(String value) {
            addCriterion("TGJCR >", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrGreaterThanOrEqualTo(String value) {
            addCriterion("TGJCR >=", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrLessThan(String value) {
            addCriterion("TGJCR <", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrLessThanOrEqualTo(String value) {
            addCriterion("TGJCR <=", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrLike(String value) {
            addCriterion("TGJCR like", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrNotLike(String value) {
            addCriterion("TGJCR not like", value, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrIn(List<String> values) {
            addCriterion("TGJCR in", values, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrNotIn(List<String> values) {
            addCriterion("TGJCR not in", values, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrBetween(String value1, String value2) {
            addCriterion("TGJCR between", value1, value2, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcrNotBetween(String value1, String value2) {
            addCriterion("TGJCR not between", value1, value2, "tgjcr");
            return (Criteria) this;
        }

        public Criteria andTgjcbmIsNull() {
            addCriterion("TGJCBM is null");
            return (Criteria) this;
        }

        public Criteria andTgjcbmIsNotNull() {
            addCriterion("TGJCBM is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcbmEqualTo(String value) {
            addCriterion("TGJCBM =", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmNotEqualTo(String value) {
            addCriterion("TGJCBM <>", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmGreaterThan(String value) {
            addCriterion("TGJCBM >", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmGreaterThanOrEqualTo(String value) {
            addCriterion("TGJCBM >=", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmLessThan(String value) {
            addCriterion("TGJCBM <", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmLessThanOrEqualTo(String value) {
            addCriterion("TGJCBM <=", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmLike(String value) {
            addCriterion("TGJCBM like", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmNotLike(String value) {
            addCriterion("TGJCBM not like", value, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmIn(List<String> values) {
            addCriterion("TGJCBM in", values, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmNotIn(List<String> values) {
            addCriterion("TGJCBM not in", values, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmBetween(String value1, String value2) {
            addCriterion("TGJCBM between", value1, value2, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTgjcbmNotBetween(String value1, String value2) {
            addCriterion("TGJCBM not between", value1, value2, "tgjcbm");
            return (Criteria) this;
        }

        public Criteria andTybzhkIsNull() {
            addCriterion("TYBZHK is null");
            return (Criteria) this;
        }

        public Criteria andTybzhkIsNotNull() {
            addCriterion("TYBZHK is not null");
            return (Criteria) this;
        }

        public Criteria andTybzhkEqualTo(String value) {
            addCriterion("TYBZHK =", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkNotEqualTo(String value) {
            addCriterion("TYBZHK <>", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkGreaterThan(String value) {
            addCriterion("TYBZHK >", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkGreaterThanOrEqualTo(String value) {
            addCriterion("TYBZHK >=", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkLessThan(String value) {
            addCriterion("TYBZHK <", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkLessThanOrEqualTo(String value) {
            addCriterion("TYBZHK <=", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkLike(String value) {
            addCriterion("TYBZHK like", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkNotLike(String value) {
            addCriterion("TYBZHK not like", value, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkIn(List<String> values) {
            addCriterion("TYBZHK in", values, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkNotIn(List<String> values) {
            addCriterion("TYBZHK not in", values, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkBetween(String value1, String value2) {
            addCriterion("TYBZHK between", value1, value2, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTybzhkNotBetween(String value1, String value2) {
            addCriterion("TYBZHK not between", value1, value2, "tybzhk");
            return (Criteria) this;
        }

        public Criteria andTpfnmIsNull() {
            addCriterion("TPFNM is null");
            return (Criteria) this;
        }

        public Criteria andTpfnmIsNotNull() {
            addCriterion("TPFNM is not null");
            return (Criteria) this;
        }

        public Criteria andTpfnmEqualTo(String value) {
            addCriterion("TPFNM =", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmNotEqualTo(String value) {
            addCriterion("TPFNM <>", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmGreaterThan(String value) {
            addCriterion("TPFNM >", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmGreaterThanOrEqualTo(String value) {
            addCriterion("TPFNM >=", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmLessThan(String value) {
            addCriterion("TPFNM <", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmLessThanOrEqualTo(String value) {
            addCriterion("TPFNM <=", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmLike(String value) {
            addCriterion("TPFNM like", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmNotLike(String value) {
            addCriterion("TPFNM not like", value, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmIn(List<String> values) {
            addCriterion("TPFNM in", values, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmNotIn(List<String> values) {
            addCriterion("TPFNM not in", values, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmBetween(String value1, String value2) {
            addCriterion("TPFNM between", value1, value2, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTpfnmNotBetween(String value1, String value2) {
            addCriterion("TPFNM not between", value1, value2, "tpfnm");
            return (Criteria) this;
        }

        public Criteria andTlbjIsNull() {
            addCriterion("TLBJ is null");
            return (Criteria) this;
        }

        public Criteria andTlbjIsNotNull() {
            addCriterion("TLBJ is not null");
            return (Criteria) this;
        }

        public Criteria andTlbjEqualTo(String value) {
            addCriterion("TLBJ =", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjNotEqualTo(String value) {
            addCriterion("TLBJ <>", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjGreaterThan(String value) {
            addCriterion("TLBJ >", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjGreaterThanOrEqualTo(String value) {
            addCriterion("TLBJ >=", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjLessThan(String value) {
            addCriterion("TLBJ <", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjLessThanOrEqualTo(String value) {
            addCriterion("TLBJ <=", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjLike(String value) {
            addCriterion("TLBJ like", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjNotLike(String value) {
            addCriterion("TLBJ not like", value, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjIn(List<String> values) {
            addCriterion("TLBJ in", values, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjNotIn(List<String> values) {
            addCriterion("TLBJ not in", values, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjBetween(String value1, String value2) {
            addCriterion("TLBJ between", value1, value2, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTlbjNotBetween(String value1, String value2) {
            addCriterion("TLBJ not between", value1, value2, "tlbj");
            return (Criteria) this;
        }

        public Criteria andTyanIsNull() {
            addCriterion("TYAN is null");
            return (Criteria) this;
        }

        public Criteria andTyanIsNotNull() {
            addCriterion("TYAN is not null");
            return (Criteria) this;
        }

        public Criteria andTyanEqualTo(String value) {
            addCriterion("TYAN =", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanNotEqualTo(String value) {
            addCriterion("TYAN <>", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanGreaterThan(String value) {
            addCriterion("TYAN >", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanGreaterThanOrEqualTo(String value) {
            addCriterion("TYAN >=", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanLessThan(String value) {
            addCriterion("TYAN <", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanLessThanOrEqualTo(String value) {
            addCriterion("TYAN <=", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanLike(String value) {
            addCriterion("TYAN like", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanNotLike(String value) {
            addCriterion("TYAN not like", value, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanIn(List<String> values) {
            addCriterion("TYAN in", values, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanNotIn(List<String> values) {
            addCriterion("TYAN not in", values, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanBetween(String value1, String value2) {
            addCriterion("TYAN between", value1, value2, "tyan");
            return (Criteria) this;
        }

        public Criteria andTyanNotBetween(String value1, String value2) {
            addCriterion("TYAN not between", value1, value2, "tyan");
            return (Criteria) this;
        }

        public Criteria andTerIsNull() {
            addCriterion("TER is null");
            return (Criteria) this;
        }

        public Criteria andTerIsNotNull() {
            addCriterion("TER is not null");
            return (Criteria) this;
        }

        public Criteria andTerEqualTo(String value) {
            addCriterion("TER =", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerNotEqualTo(String value) {
            addCriterion("TER <>", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerGreaterThan(String value) {
            addCriterion("TER >", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerGreaterThanOrEqualTo(String value) {
            addCriterion("TER >=", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerLessThan(String value) {
            addCriterion("TER <", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerLessThanOrEqualTo(String value) {
            addCriterion("TER <=", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerLike(String value) {
            addCriterion("TER like", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerNotLike(String value) {
            addCriterion("TER not like", value, "ter");
            return (Criteria) this;
        }

        public Criteria andTerIn(List<String> values) {
            addCriterion("TER in", values, "ter");
            return (Criteria) this;
        }

        public Criteria andTerNotIn(List<String> values) {
            addCriterion("TER not in", values, "ter");
            return (Criteria) this;
        }

        public Criteria andTerBetween(String value1, String value2) {
            addCriterion("TER between", value1, value2, "ter");
            return (Criteria) this;
        }

        public Criteria andTerNotBetween(String value1, String value2) {
            addCriterion("TER not between", value1, value2, "ter");
            return (Criteria) this;
        }

        public Criteria andTbiIsNull() {
            addCriterion("TBI is null");
            return (Criteria) this;
        }

        public Criteria andTbiIsNotNull() {
            addCriterion("TBI is not null");
            return (Criteria) this;
        }

        public Criteria andTbiEqualTo(String value) {
            addCriterion("TBI =", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiNotEqualTo(String value) {
            addCriterion("TBI <>", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiGreaterThan(String value) {
            addCriterion("TBI >", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiGreaterThanOrEqualTo(String value) {
            addCriterion("TBI >=", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiLessThan(String value) {
            addCriterion("TBI <", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiLessThanOrEqualTo(String value) {
            addCriterion("TBI <=", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiLike(String value) {
            addCriterion("TBI like", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiNotLike(String value) {
            addCriterion("TBI not like", value, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiIn(List<String> values) {
            addCriterion("TBI in", values, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiNotIn(List<String> values) {
            addCriterion("TBI not in", values, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiBetween(String value1, String value2) {
            addCriterion("TBI between", value1, value2, "tbi");
            return (Criteria) this;
        }

        public Criteria andTbiNotBetween(String value1, String value2) {
            addCriterion("TBI not between", value1, value2, "tbi");
            return (Criteria) this;
        }

        public Criteria andTkouIsNull() {
            addCriterion("TKOU is null");
            return (Criteria) this;
        }

        public Criteria andTkouIsNotNull() {
            addCriterion("TKOU is not null");
            return (Criteria) this;
        }

        public Criteria andTkouEqualTo(String value) {
            addCriterion("TKOU =", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouNotEqualTo(String value) {
            addCriterion("TKOU <>", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouGreaterThan(String value) {
            addCriterion("TKOU >", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouGreaterThanOrEqualTo(String value) {
            addCriterion("TKOU >=", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouLessThan(String value) {
            addCriterion("TKOU <", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouLessThanOrEqualTo(String value) {
            addCriterion("TKOU <=", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouLike(String value) {
            addCriterion("TKOU like", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouNotLike(String value) {
            addCriterion("TKOU not like", value, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouIn(List<String> values) {
            addCriterion("TKOU in", values, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouNotIn(List<String> values) {
            addCriterion("TKOU not in", values, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouBetween(String value1, String value2) {
            addCriterion("TKOU between", value1, value2, "tkou");
            return (Criteria) this;
        }

        public Criteria andTkouNotBetween(String value1, String value2) {
            addCriterion("TKOU not between", value1, value2, "tkou");
            return (Criteria) this;
        }

        public Criteria andTjinbIsNull() {
            addCriterion("TJINB is null");
            return (Criteria) this;
        }

        public Criteria andTjinbIsNotNull() {
            addCriterion("TJINB is not null");
            return (Criteria) this;
        }

        public Criteria andTjinbEqualTo(String value) {
            addCriterion("TJINB =", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbNotEqualTo(String value) {
            addCriterion("TJINB <>", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbGreaterThan(String value) {
            addCriterion("TJINB >", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbGreaterThanOrEqualTo(String value) {
            addCriterion("TJINB >=", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbLessThan(String value) {
            addCriterion("TJINB <", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbLessThanOrEqualTo(String value) {
            addCriterion("TJINB <=", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbLike(String value) {
            addCriterion("TJINB like", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbNotLike(String value) {
            addCriterion("TJINB not like", value, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbIn(List<String> values) {
            addCriterion("TJINB in", values, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbNotIn(List<String> values) {
            addCriterion("TJINB not in", values, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbBetween(String value1, String value2) {
            addCriterion("TJINB between", value1, value2, "tjinb");
            return (Criteria) this;
        }

        public Criteria andTjinbNotBetween(String value1, String value2) {
            addCriterion("TJINB not between", value1, value2, "tjinb");
            return (Criteria) this;
        }

        public Criteria andXfshtIsNull() {
            addCriterion("XFSHT is null");
            return (Criteria) this;
        }

        public Criteria andXfshtIsNotNull() {
            addCriterion("XFSHT is not null");
            return (Criteria) this;
        }

        public Criteria andXfshtEqualTo(String value) {
            addCriterion("XFSHT =", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtNotEqualTo(String value) {
            addCriterion("XFSHT <>", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtGreaterThan(String value) {
            addCriterion("XFSHT >", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtGreaterThanOrEqualTo(String value) {
            addCriterion("XFSHT >=", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtLessThan(String value) {
            addCriterion("XFSHT <", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtLessThanOrEqualTo(String value) {
            addCriterion("XFSHT <=", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtLike(String value) {
            addCriterion("XFSHT like", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtNotLike(String value) {
            addCriterion("XFSHT not like", value, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtIn(List<String> values) {
            addCriterion("XFSHT in", values, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtNotIn(List<String> values) {
            addCriterion("XFSHT not in", values, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtBetween(String value1, String value2) {
            addCriterion("XFSHT between", value1, value2, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfshtNotBetween(String value1, String value2) {
            addCriterion("XFSHT not between", value1, value2, "xfsht");
            return (Criteria) this;
        }

        public Criteria andXfchuIsNull() {
            addCriterion("XFCHU is null");
            return (Criteria) this;
        }

        public Criteria andXfchuIsNotNull() {
            addCriterion("XFCHU is not null");
            return (Criteria) this;
        }

        public Criteria andXfchuEqualTo(String value) {
            addCriterion("XFCHU =", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuNotEqualTo(String value) {
            addCriterion("XFCHU <>", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuGreaterThan(String value) {
            addCriterion("XFCHU >", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuGreaterThanOrEqualTo(String value) {
            addCriterion("XFCHU >=", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuLessThan(String value) {
            addCriterion("XFCHU <", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuLessThanOrEqualTo(String value) {
            addCriterion("XFCHU <=", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuLike(String value) {
            addCriterion("XFCHU like", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuNotLike(String value) {
            addCriterion("XFCHU not like", value, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuIn(List<String> values) {
            addCriterion("XFCHU in", values, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuNotIn(List<String> values) {
            addCriterion("XFCHU not in", values, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuBetween(String value1, String value2) {
            addCriterion("XFCHU between", value1, value2, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfchuNotBetween(String value1, String value2) {
            addCriterion("XFCHU not between", value1, value2, "xfchu");
            return (Criteria) this;
        }

        public Criteria andXfkouIsNull() {
            addCriterion("XFKOU is null");
            return (Criteria) this;
        }

        public Criteria andXfkouIsNotNull() {
            addCriterion("XFKOU is not null");
            return (Criteria) this;
        }

        public Criteria andXfkouEqualTo(String value) {
            addCriterion("XFKOU =", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouNotEqualTo(String value) {
            addCriterion("XFKOU <>", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouGreaterThan(String value) {
            addCriterion("XFKOU >", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouGreaterThanOrEqualTo(String value) {
            addCriterion("XFKOU >=", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouLessThan(String value) {
            addCriterion("XFKOU <", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouLessThanOrEqualTo(String value) {
            addCriterion("XFKOU <=", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouLike(String value) {
            addCriterion("XFKOU like", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouNotLike(String value) {
            addCriterion("XFKOU not like", value, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouIn(List<String> values) {
            addCriterion("XFKOU in", values, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouNotIn(List<String> values) {
            addCriterion("XFKOU not in", values, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouBetween(String value1, String value2) {
            addCriterion("XFKOU between", value1, value2, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXfkouNotBetween(String value1, String value2) {
            addCriterion("XFKOU not between", value1, value2, "xfkou");
            return (Criteria) this;
        }

        public Criteria andXftingIsNull() {
            addCriterion("XFTING is null");
            return (Criteria) this;
        }

        public Criteria andXftingIsNotNull() {
            addCriterion("XFTING is not null");
            return (Criteria) this;
        }

        public Criteria andXftingEqualTo(String value) {
            addCriterion("XFTING =", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingNotEqualTo(String value) {
            addCriterion("XFTING <>", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingGreaterThan(String value) {
            addCriterion("XFTING >", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingGreaterThanOrEqualTo(String value) {
            addCriterion("XFTING >=", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingLessThan(String value) {
            addCriterion("XFTING <", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingLessThanOrEqualTo(String value) {
            addCriterion("XFTING <=", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingLike(String value) {
            addCriterion("XFTING like", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingNotLike(String value) {
            addCriterion("XFTING not like", value, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingIn(List<String> values) {
            addCriterion("XFTING in", values, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingNotIn(List<String> values) {
            addCriterion("XFTING not in", values, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingBetween(String value1, String value2) {
            addCriterion("XFTING between", value1, value2, "xfting");
            return (Criteria) this;
        }

        public Criteria andXftingNotBetween(String value1, String value2) {
            addCriterion("XFTING not between", value1, value2, "xfting");
            return (Criteria) this;
        }

        public Criteria andXinshtIsNull() {
            addCriterion("XINSHT is null");
            return (Criteria) this;
        }

        public Criteria andXinshtIsNotNull() {
            addCriterion("XINSHT is not null");
            return (Criteria) this;
        }

        public Criteria andXinshtEqualTo(String value) {
            addCriterion("XINSHT =", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtNotEqualTo(String value) {
            addCriterion("XINSHT <>", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtGreaterThan(String value) {
            addCriterion("XINSHT >", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtGreaterThanOrEqualTo(String value) {
            addCriterion("XINSHT >=", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtLessThan(String value) {
            addCriterion("XINSHT <", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtLessThanOrEqualTo(String value) {
            addCriterion("XINSHT <=", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtLike(String value) {
            addCriterion("XINSHT like", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtNotLike(String value) {
            addCriterion("XINSHT not like", value, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtIn(List<String> values) {
            addCriterion("XINSHT in", values, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtNotIn(List<String> values) {
            addCriterion("XINSHT not in", values, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtBetween(String value1, String value2) {
            addCriterion("XINSHT between", value1, value2, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinshtNotBetween(String value1, String value2) {
            addCriterion("XINSHT not between", value1, value2, "xinsht");
            return (Criteria) this;
        }

        public Criteria andXinfchuIsNull() {
            addCriterion("XINFCHU is null");
            return (Criteria) this;
        }

        public Criteria andXinfchuIsNotNull() {
            addCriterion("XINFCHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinfchuEqualTo(String value) {
            addCriterion("XINFCHU =", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuNotEqualTo(String value) {
            addCriterion("XINFCHU <>", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuGreaterThan(String value) {
            addCriterion("XINFCHU >", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuGreaterThanOrEqualTo(String value) {
            addCriterion("XINFCHU >=", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuLessThan(String value) {
            addCriterion("XINFCHU <", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuLessThanOrEqualTo(String value) {
            addCriterion("XINFCHU <=", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuLike(String value) {
            addCriterion("XINFCHU like", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuNotLike(String value) {
            addCriterion("XINFCHU not like", value, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuIn(List<String> values) {
            addCriterion("XINFCHU in", values, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuNotIn(List<String> values) {
            addCriterion("XINFCHU not in", values, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuBetween(String value1, String value2) {
            addCriterion("XINFCHU between", value1, value2, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfchuNotBetween(String value1, String value2) {
            addCriterion("XINFCHU not between", value1, value2, "xinfchu");
            return (Criteria) this;
        }

        public Criteria andXinfkouIsNull() {
            addCriterion("XINFKOU is null");
            return (Criteria) this;
        }

        public Criteria andXinfkouIsNotNull() {
            addCriterion("XINFKOU is not null");
            return (Criteria) this;
        }

        public Criteria andXinfkouEqualTo(String value) {
            addCriterion("XINFKOU =", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouNotEqualTo(String value) {
            addCriterion("XINFKOU <>", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouGreaterThan(String value) {
            addCriterion("XINFKOU >", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouGreaterThanOrEqualTo(String value) {
            addCriterion("XINFKOU >=", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouLessThan(String value) {
            addCriterion("XINFKOU <", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouLessThanOrEqualTo(String value) {
            addCriterion("XINFKOU <=", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouLike(String value) {
            addCriterion("XINFKOU like", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouNotLike(String value) {
            addCriterion("XINFKOU not like", value, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouIn(List<String> values) {
            addCriterion("XINFKOU in", values, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouNotIn(List<String> values) {
            addCriterion("XINFKOU not in", values, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouBetween(String value1, String value2) {
            addCriterion("XINFKOU between", value1, value2, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinfkouNotBetween(String value1, String value2) {
            addCriterion("XINFKOU not between", value1, value2, "xinfkou");
            return (Criteria) this;
        }

        public Criteria andXinftingIsNull() {
            addCriterion("XINFTING is null");
            return (Criteria) this;
        }

        public Criteria andXinftingIsNotNull() {
            addCriterion("XINFTING is not null");
            return (Criteria) this;
        }

        public Criteria andXinftingEqualTo(String value) {
            addCriterion("XINFTING =", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingNotEqualTo(String value) {
            addCriterion("XINFTING <>", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingGreaterThan(String value) {
            addCriterion("XINFTING >", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingGreaterThanOrEqualTo(String value) {
            addCriterion("XINFTING >=", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingLessThan(String value) {
            addCriterion("XINFTING <", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingLessThanOrEqualTo(String value) {
            addCriterion("XINFTING <=", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingLike(String value) {
            addCriterion("XINFTING like", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingNotLike(String value) {
            addCriterion("XINFTING not like", value, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingIn(List<String> values) {
            addCriterion("XINFTING in", values, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingNotIn(List<String> values) {
            addCriterion("XINFTING not in", values, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingBetween(String value1, String value2) {
            addCriterion("XINFTING between", value1, value2, "xinfting");
            return (Criteria) this;
        }

        public Criteria andXinftingNotBetween(String value1, String value2) {
            addCriterion("XINFTING not between", value1, value2, "xinfting");
            return (Criteria) this;
        }

        public Criteria andTzwxgIsNull() {
            addCriterion("TZWXG is null");
            return (Criteria) this;
        }

        public Criteria andTzwxgIsNotNull() {
            addCriterion("TZWXG is not null");
            return (Criteria) this;
        }

        public Criteria andTzwxgEqualTo(String value) {
            addCriterion("TZWXG =", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgNotEqualTo(String value) {
            addCriterion("TZWXG <>", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgGreaterThan(String value) {
            addCriterion("TZWXG >", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgGreaterThanOrEqualTo(String value) {
            addCriterion("TZWXG >=", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgLessThan(String value) {
            addCriterion("TZWXG <", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgLessThanOrEqualTo(String value) {
            addCriterion("TZWXG <=", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgLike(String value) {
            addCriterion("TZWXG like", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgNotLike(String value) {
            addCriterion("TZWXG not like", value, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgIn(List<String> values) {
            addCriterion("TZWXG in", values, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgNotIn(List<String> values) {
            addCriterion("TZWXG not in", values, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgBetween(String value1, String value2) {
            addCriterion("TZWXG between", value1, value2, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andTzwxgNotBetween(String value1, String value2) {
            addCriterion("TZWXG not between", value1, value2, "tzwxg");
            return (Criteria) this;
        }

        public Criteria andFbshtIsNull() {
            addCriterion("FBSHT is null");
            return (Criteria) this;
        }

        public Criteria andFbshtIsNotNull() {
            addCriterion("FBSHT is not null");
            return (Criteria) this;
        }

        public Criteria andFbshtEqualTo(String value) {
            addCriterion("FBSHT =", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtNotEqualTo(String value) {
            addCriterion("FBSHT <>", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtGreaterThan(String value) {
            addCriterion("FBSHT >", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtGreaterThanOrEqualTo(String value) {
            addCriterion("FBSHT >=", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtLessThan(String value) {
            addCriterion("FBSHT <", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtLessThanOrEqualTo(String value) {
            addCriterion("FBSHT <=", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtLike(String value) {
            addCriterion("FBSHT like", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtNotLike(String value) {
            addCriterion("FBSHT not like", value, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtIn(List<String> values) {
            addCriterion("FBSHT in", values, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtNotIn(List<String> values) {
            addCriterion("FBSHT not in", values, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtBetween(String value1, String value2) {
            addCriterion("FBSHT between", value1, value2, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbshtNotBetween(String value1, String value2) {
            addCriterion("FBSHT not between", value1, value2, "fbsht");
            return (Criteria) this;
        }

        public Criteria andFbfchuIsNull() {
            addCriterion("FBFCHU is null");
            return (Criteria) this;
        }

        public Criteria andFbfchuIsNotNull() {
            addCriterion("FBFCHU is not null");
            return (Criteria) this;
        }

        public Criteria andFbfchuEqualTo(String value) {
            addCriterion("FBFCHU =", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuNotEqualTo(String value) {
            addCriterion("FBFCHU <>", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuGreaterThan(String value) {
            addCriterion("FBFCHU >", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuGreaterThanOrEqualTo(String value) {
            addCriterion("FBFCHU >=", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuLessThan(String value) {
            addCriterion("FBFCHU <", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuLessThanOrEqualTo(String value) {
            addCriterion("FBFCHU <=", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuLike(String value) {
            addCriterion("FBFCHU like", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuNotLike(String value) {
            addCriterion("FBFCHU not like", value, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuIn(List<String> values) {
            addCriterion("FBFCHU in", values, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuNotIn(List<String> values) {
            addCriterion("FBFCHU not in", values, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuBetween(String value1, String value2) {
            addCriterion("FBFCHU between", value1, value2, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfchuNotBetween(String value1, String value2) {
            addCriterion("FBFCHU not between", value1, value2, "fbfchu");
            return (Criteria) this;
        }

        public Criteria andFbfkouIsNull() {
            addCriterion("FBFKOU is null");
            return (Criteria) this;
        }

        public Criteria andFbfkouIsNotNull() {
            addCriterion("FBFKOU is not null");
            return (Criteria) this;
        }

        public Criteria andFbfkouEqualTo(String value) {
            addCriterion("FBFKOU =", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouNotEqualTo(String value) {
            addCriterion("FBFKOU <>", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouGreaterThan(String value) {
            addCriterion("FBFKOU >", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouGreaterThanOrEqualTo(String value) {
            addCriterion("FBFKOU >=", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouLessThan(String value) {
            addCriterion("FBFKOU <", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouLessThanOrEqualTo(String value) {
            addCriterion("FBFKOU <=", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouLike(String value) {
            addCriterion("FBFKOU like", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouNotLike(String value) {
            addCriterion("FBFKOU not like", value, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouIn(List<String> values) {
            addCriterion("FBFKOU in", values, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouNotIn(List<String> values) {
            addCriterion("FBFKOU not in", values, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouBetween(String value1, String value2) {
            addCriterion("FBFKOU between", value1, value2, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbfkouNotBetween(String value1, String value2) {
            addCriterion("FBFKOU not between", value1, value2, "fbfkou");
            return (Criteria) this;
        }

        public Criteria andFbftingIsNull() {
            addCriterion("FBFTING is null");
            return (Criteria) this;
        }

        public Criteria andFbftingIsNotNull() {
            addCriterion("FBFTING is not null");
            return (Criteria) this;
        }

        public Criteria andFbftingEqualTo(String value) {
            addCriterion("FBFTING =", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingNotEqualTo(String value) {
            addCriterion("FBFTING <>", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingGreaterThan(String value) {
            addCriterion("FBFTING >", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingGreaterThanOrEqualTo(String value) {
            addCriterion("FBFTING >=", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingLessThan(String value) {
            addCriterion("FBFTING <", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingLessThanOrEqualTo(String value) {
            addCriterion("FBFTING <=", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingLike(String value) {
            addCriterion("FBFTING like", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingNotLike(String value) {
            addCriterion("FBFTING not like", value, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingIn(List<String> values) {
            addCriterion("FBFTING in", values, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingNotIn(List<String> values) {
            addCriterion("FBFTING not in", values, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingBetween(String value1, String value2) {
            addCriterion("FBFTING between", value1, value2, "fbfting");
            return (Criteria) this;
        }

        public Criteria andFbftingNotBetween(String value1, String value2) {
            addCriterion("FBFTING not between", value1, value2, "fbfting");
            return (Criteria) this;
        }

        public Criteria andTgmszqIsNull() {
            addCriterion("TGMSZQ is null");
            return (Criteria) this;
        }

        public Criteria andTgmszqIsNotNull() {
            addCriterion("TGMSZQ is not null");
            return (Criteria) this;
        }

        public Criteria andTgmszqEqualTo(String value) {
            addCriterion("TGMSZQ =", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqNotEqualTo(String value) {
            addCriterion("TGMSZQ <>", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqGreaterThan(String value) {
            addCriterion("TGMSZQ >", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqGreaterThanOrEqualTo(String value) {
            addCriterion("TGMSZQ >=", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqLessThan(String value) {
            addCriterion("TGMSZQ <", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqLessThanOrEqualTo(String value) {
            addCriterion("TGMSZQ <=", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqLike(String value) {
            addCriterion("TGMSZQ like", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqNotLike(String value) {
            addCriterion("TGMSZQ not like", value, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqIn(List<String> values) {
            addCriterion("TGMSZQ in", values, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqNotIn(List<String> values) {
            addCriterion("TGMSZQ not in", values, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqBetween(String value1, String value2) {
            addCriterion("TGMSZQ between", value1, value2, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTgmszqNotBetween(String value1, String value2) {
            addCriterion("TGMSZQ not between", value1, value2, "tgmszq");
            return (Criteria) this;
        }

        public Criteria andTjzszhIsNull() {
            addCriterion("TJZSZH is null");
            return (Criteria) this;
        }

        public Criteria andTjzszhIsNotNull() {
            addCriterion("TJZSZH is not null");
            return (Criteria) this;
        }

        public Criteria andTjzszhEqualTo(String value) {
            addCriterion("TJZSZH =", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhNotEqualTo(String value) {
            addCriterion("TJZSZH <>", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhGreaterThan(String value) {
            addCriterion("TJZSZH >", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhGreaterThanOrEqualTo(String value) {
            addCriterion("TJZSZH >=", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhLessThan(String value) {
            addCriterion("TJZSZH <", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhLessThanOrEqualTo(String value) {
            addCriterion("TJZSZH <=", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhLike(String value) {
            addCriterion("TJZSZH like", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhNotLike(String value) {
            addCriterion("TJZSZH not like", value, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhIn(List<String> values) {
            addCriterion("TJZSZH in", values, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhNotIn(List<String> values) {
            addCriterion("TJZSZH not in", values, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhBetween(String value1, String value2) {
            addCriterion("TJZSZH between", value1, value2, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTjzszhNotBetween(String value1, String value2) {
            addCriterion("TJZSZH not between", value1, value2, "tjzszh");
            return (Criteria) this;
        }

        public Criteria andTshjxtIsNull() {
            addCriterion("TSHJXT is null");
            return (Criteria) this;
        }

        public Criteria andTshjxtIsNotNull() {
            addCriterion("TSHJXT is not null");
            return (Criteria) this;
        }

        public Criteria andTshjxtEqualTo(String value) {
            addCriterion("TSHJXT =", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtNotEqualTo(String value) {
            addCriterion("TSHJXT <>", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtGreaterThan(String value) {
            addCriterion("TSHJXT >", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtGreaterThanOrEqualTo(String value) {
            addCriterion("TSHJXT >=", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtLessThan(String value) {
            addCriterion("TSHJXT <", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtLessThanOrEqualTo(String value) {
            addCriterion("TSHJXT <=", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtLike(String value) {
            addCriterion("TSHJXT like", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtNotLike(String value) {
            addCriterion("TSHJXT not like", value, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtIn(List<String> values) {
            addCriterion("TSHJXT in", values, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtNotIn(List<String> values) {
            addCriterion("TSHJXT not in", values, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtBetween(String value1, String value2) {
            addCriterion("TSHJXT between", value1, value2, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTshjxtNotBetween(String value1, String value2) {
            addCriterion("TSHJXT not between", value1, value2, "tshjxt");
            return (Criteria) this;
        }

        public Criteria andTzkqkIsNull() {
            addCriterion("TZKQK is null");
            return (Criteria) this;
        }

        public Criteria andTzkqkIsNotNull() {
            addCriterion("TZKQK is not null");
            return (Criteria) this;
        }

        public Criteria andTzkqkEqualTo(String value) {
            addCriterion("TZKQK =", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkNotEqualTo(String value) {
            addCriterion("TZKQK <>", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkGreaterThan(String value) {
            addCriterion("TZKQK >", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkGreaterThanOrEqualTo(String value) {
            addCriterion("TZKQK >=", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkLessThan(String value) {
            addCriterion("TZKQK <", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkLessThanOrEqualTo(String value) {
            addCriterion("TZKQK <=", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkLike(String value) {
            addCriterion("TZKQK like", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkNotLike(String value) {
            addCriterion("TZKQK not like", value, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkIn(List<String> values) {
            addCriterion("TZKQK in", values, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkNotIn(List<String> values) {
            addCriterion("TZKQK not in", values, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkBetween(String value1, String value2) {
            addCriterion("TZKQK between", value1, value2, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andTzkqkNotBetween(String value1, String value2) {
            addCriterion("TZKQK not between", value1, value2, "tzkqk");
            return (Criteria) this;
        }

        public Criteria andBlzhyIsNull() {
            addCriterion("BLZHY is null");
            return (Criteria) this;
        }

        public Criteria andBlzhyIsNotNull() {
            addCriterion("BLZHY is not null");
            return (Criteria) this;
        }

        public Criteria andBlzhyEqualTo(String value) {
            addCriterion("BLZHY =", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyNotEqualTo(String value) {
            addCriterion("BLZHY <>", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyGreaterThan(String value) {
            addCriterion("BLZHY >", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyGreaterThanOrEqualTo(String value) {
            addCriterion("BLZHY >=", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyLessThan(String value) {
            addCriterion("BLZHY <", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyLessThanOrEqualTo(String value) {
            addCriterion("BLZHY <=", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyLike(String value) {
            addCriterion("BLZHY like", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyNotLike(String value) {
            addCriterion("BLZHY not like", value, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyIn(List<String> values) {
            addCriterion("BLZHY in", values, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyNotIn(List<String> values) {
            addCriterion("BLZHY not in", values, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyBetween(String value1, String value2) {
            addCriterion("BLZHY between", value1, value2, "blzhy");
            return (Criteria) this;
        }

        public Criteria andBlzhyNotBetween(String value1, String value2) {
            addCriterion("BLZHY not between", value1, value2, "blzhy");
            return (Criteria) this;
        }

        public Criteria andRyzhdIsNull() {
            addCriterion("RYZHD is null");
            return (Criteria) this;
        }

        public Criteria andRyzhdIsNotNull() {
            addCriterion("RYZHD is not null");
            return (Criteria) this;
        }

        public Criteria andRyzhdEqualTo(String value) {
            addCriterion("RYZHD =", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdNotEqualTo(String value) {
            addCriterion("RYZHD <>", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdGreaterThan(String value) {
            addCriterion("RYZHD >", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdGreaterThanOrEqualTo(String value) {
            addCriterion("RYZHD >=", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdLessThan(String value) {
            addCriterion("RYZHD <", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdLessThanOrEqualTo(String value) {
            addCriterion("RYZHD <=", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdLike(String value) {
            addCriterion("RYZHD like", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdNotLike(String value) {
            addCriterion("RYZHD not like", value, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdIn(List<String> values) {
            addCriterion("RYZHD in", values, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdNotIn(List<String> values) {
            addCriterion("RYZHD not in", values, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdBetween(String value1, String value2) {
            addCriterion("RYZHD between", value1, value2, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andRyzhdNotBetween(String value1, String value2) {
            addCriterion("RYZHD not between", value1, value2, "ryzhd");
            return (Criteria) this;
        }

        public Criteria andQianmIsNull() {
            addCriterion("QIANM is null");
            return (Criteria) this;
        }

        public Criteria andQianmIsNotNull() {
            addCriterion("QIANM is not null");
            return (Criteria) this;
        }

        public Criteria andQianmEqualTo(String value) {
            addCriterion("QIANM =", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmNotEqualTo(String value) {
            addCriterion("QIANM <>", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmGreaterThan(String value) {
            addCriterion("QIANM >", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmGreaterThanOrEqualTo(String value) {
            addCriterion("QIANM >=", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmLessThan(String value) {
            addCriterion("QIANM <", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmLessThanOrEqualTo(String value) {
            addCriterion("QIANM <=", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmLike(String value) {
            addCriterion("QIANM like", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmNotLike(String value) {
            addCriterion("QIANM not like", value, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmIn(List<String> values) {
            addCriterion("QIANM in", values, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmNotIn(List<String> values) {
            addCriterion("QIANM not in", values, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmBetween(String value1, String value2) {
            addCriterion("QIANM between", value1, value2, "qianm");
            return (Criteria) this;
        }

        public Criteria andQianmNotBetween(String value1, String value2) {
            addCriterion("QIANM not between", value1, value2, "qianm");
            return (Criteria) this;
        }

        public Criteria andLjiirIsNull() {
            addCriterion("LJIIR is null");
            return (Criteria) this;
        }

        public Criteria andLjiirIsNotNull() {
            addCriterion("LJIIR is not null");
            return (Criteria) this;
        }

        public Criteria andLjiirEqualTo(String value) {
            addCriterion("LJIIR =", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirNotEqualTo(String value) {
            addCriterion("LJIIR <>", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirGreaterThan(String value) {
            addCriterion("LJIIR >", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirGreaterThanOrEqualTo(String value) {
            addCriterion("LJIIR >=", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirLessThan(String value) {
            addCriterion("LJIIR <", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirLessThanOrEqualTo(String value) {
            addCriterion("LJIIR <=", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirLike(String value) {
            addCriterion("LJIIR like", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirNotLike(String value) {
            addCriterion("LJIIR not like", value, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirIn(List<String> values) {
            addCriterion("LJIIR in", values, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirNotIn(List<String> values) {
            addCriterion("LJIIR not in", values, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirBetween(String value1, String value2) {
            addCriterion("LJIIR between", value1, value2, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiirNotBetween(String value1, String value2) {
            addCriterion("LJIIR not between", value1, value2, "ljiir");
            return (Criteria) this;
        }

        public Criteria andLjiilIsNull() {
            addCriterion("LJIIL is null");
            return (Criteria) this;
        }

        public Criteria andLjiilIsNotNull() {
            addCriterion("LJIIL is not null");
            return (Criteria) this;
        }

        public Criteria andLjiilEqualTo(String value) {
            addCriterion("LJIIL =", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilNotEqualTo(String value) {
            addCriterion("LJIIL <>", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilGreaterThan(String value) {
            addCriterion("LJIIL >", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilGreaterThanOrEqualTo(String value) {
            addCriterion("LJIIL >=", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilLessThan(String value) {
            addCriterion("LJIIL <", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilLessThanOrEqualTo(String value) {
            addCriterion("LJIIL <=", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilLike(String value) {
            addCriterion("LJIIL like", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilNotLike(String value) {
            addCriterion("LJIIL not like", value, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilIn(List<String> values) {
            addCriterion("LJIIL in", values, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilNotIn(List<String> values) {
            addCriterion("LJIIL not in", values, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilBetween(String value1, String value2) {
            addCriterion("LJIIL between", value1, value2, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiilNotBetween(String value1, String value2) {
            addCriterion("LJIIL not between", value1, value2, "ljiil");
            return (Criteria) this;
        }

        public Criteria andLjiiirIsNull() {
            addCriterion("LJIIIR is null");
            return (Criteria) this;
        }

        public Criteria andLjiiirIsNotNull() {
            addCriterion("LJIIIR is not null");
            return (Criteria) this;
        }

        public Criteria andLjiiirEqualTo(String value) {
            addCriterion("LJIIIR =", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirNotEqualTo(String value) {
            addCriterion("LJIIIR <>", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirGreaterThan(String value) {
            addCriterion("LJIIIR >", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirGreaterThanOrEqualTo(String value) {
            addCriterion("LJIIIR >=", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirLessThan(String value) {
            addCriterion("LJIIIR <", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirLessThanOrEqualTo(String value) {
            addCriterion("LJIIIR <=", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirLike(String value) {
            addCriterion("LJIIIR like", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirNotLike(String value) {
            addCriterion("LJIIIR not like", value, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirIn(List<String> values) {
            addCriterion("LJIIIR in", values, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirNotIn(List<String> values) {
            addCriterion("LJIIIR not in", values, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirBetween(String value1, String value2) {
            addCriterion("LJIIIR between", value1, value2, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiirNotBetween(String value1, String value2) {
            addCriterion("LJIIIR not between", value1, value2, "ljiiir");
            return (Criteria) this;
        }

        public Criteria andLjiiilIsNull() {
            addCriterion("LJIIIL is null");
            return (Criteria) this;
        }

        public Criteria andLjiiilIsNotNull() {
            addCriterion("LJIIIL is not null");
            return (Criteria) this;
        }

        public Criteria andLjiiilEqualTo(String value) {
            addCriterion("LJIIIL =", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilNotEqualTo(String value) {
            addCriterion("LJIIIL <>", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilGreaterThan(String value) {
            addCriterion("LJIIIL >", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilGreaterThanOrEqualTo(String value) {
            addCriterion("LJIIIL >=", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilLessThan(String value) {
            addCriterion("LJIIIL <", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilLessThanOrEqualTo(String value) {
            addCriterion("LJIIIL <=", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilLike(String value) {
            addCriterion("LJIIIL like", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilNotLike(String value) {
            addCriterion("LJIIIL not like", value, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilIn(List<String> values) {
            addCriterion("LJIIIL in", values, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilNotIn(List<String> values) {
            addCriterion("LJIIIL not in", values, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilBetween(String value1, String value2) {
            addCriterion("LJIIIL between", value1, value2, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjiiilNotBetween(String value1, String value2) {
            addCriterion("LJIIIL not between", value1, value2, "ljiiil");
            return (Criteria) this;
        }

        public Criteria andLjivrIsNull() {
            addCriterion("LJIVR is null");
            return (Criteria) this;
        }

        public Criteria andLjivrIsNotNull() {
            addCriterion("LJIVR is not null");
            return (Criteria) this;
        }

        public Criteria andLjivrEqualTo(String value) {
            addCriterion("LJIVR =", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrNotEqualTo(String value) {
            addCriterion("LJIVR <>", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrGreaterThan(String value) {
            addCriterion("LJIVR >", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrGreaterThanOrEqualTo(String value) {
            addCriterion("LJIVR >=", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrLessThan(String value) {
            addCriterion("LJIVR <", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrLessThanOrEqualTo(String value) {
            addCriterion("LJIVR <=", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrLike(String value) {
            addCriterion("LJIVR like", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrNotLike(String value) {
            addCriterion("LJIVR not like", value, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrIn(List<String> values) {
            addCriterion("LJIVR in", values, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrNotIn(List<String> values) {
            addCriterion("LJIVR not in", values, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrBetween(String value1, String value2) {
            addCriterion("LJIVR between", value1, value2, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivrNotBetween(String value1, String value2) {
            addCriterion("LJIVR not between", value1, value2, "ljivr");
            return (Criteria) this;
        }

        public Criteria andLjivlIsNull() {
            addCriterion("LJIVL is null");
            return (Criteria) this;
        }

        public Criteria andLjivlIsNotNull() {
            addCriterion("LJIVL is not null");
            return (Criteria) this;
        }

        public Criteria andLjivlEqualTo(String value) {
            addCriterion("LJIVL =", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlNotEqualTo(String value) {
            addCriterion("LJIVL <>", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlGreaterThan(String value) {
            addCriterion("LJIVL >", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlGreaterThanOrEqualTo(String value) {
            addCriterion("LJIVL >=", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlLessThan(String value) {
            addCriterion("LJIVL <", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlLessThanOrEqualTo(String value) {
            addCriterion("LJIVL <=", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlLike(String value) {
            addCriterion("LJIVL like", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlNotLike(String value) {
            addCriterion("LJIVL not like", value, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlIn(List<String> values) {
            addCriterion("LJIVL in", values, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlNotIn(List<String> values) {
            addCriterion("LJIVL not in", values, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlBetween(String value1, String value2) {
            addCriterion("LJIVL between", value1, value2, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjivlNotBetween(String value1, String value2) {
            addCriterion("LJIVL not between", value1, value2, "ljivl");
            return (Criteria) this;
        }

        public Criteria andLjvrIsNull() {
            addCriterion("LJVR is null");
            return (Criteria) this;
        }

        public Criteria andLjvrIsNotNull() {
            addCriterion("LJVR is not null");
            return (Criteria) this;
        }

        public Criteria andLjvrEqualTo(String value) {
            addCriterion("LJVR =", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrNotEqualTo(String value) {
            addCriterion("LJVR <>", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrGreaterThan(String value) {
            addCriterion("LJVR >", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrGreaterThanOrEqualTo(String value) {
            addCriterion("LJVR >=", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrLessThan(String value) {
            addCriterion("LJVR <", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrLessThanOrEqualTo(String value) {
            addCriterion("LJVR <=", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrLike(String value) {
            addCriterion("LJVR like", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrNotLike(String value) {
            addCriterion("LJVR not like", value, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrIn(List<String> values) {
            addCriterion("LJVR in", values, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrNotIn(List<String> values) {
            addCriterion("LJVR not in", values, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrBetween(String value1, String value2) {
            addCriterion("LJVR between", value1, value2, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvrNotBetween(String value1, String value2) {
            addCriterion("LJVR not between", value1, value2, "ljvr");
            return (Criteria) this;
        }

        public Criteria andLjvlIsNull() {
            addCriterion("LJVL is null");
            return (Criteria) this;
        }

        public Criteria andLjvlIsNotNull() {
            addCriterion("LJVL is not null");
            return (Criteria) this;
        }

        public Criteria andLjvlEqualTo(String value) {
            addCriterion("LJVL =", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlNotEqualTo(String value) {
            addCriterion("LJVL <>", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlGreaterThan(String value) {
            addCriterion("LJVL >", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlGreaterThanOrEqualTo(String value) {
            addCriterion("LJVL >=", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlLessThan(String value) {
            addCriterion("LJVL <", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlLessThanOrEqualTo(String value) {
            addCriterion("LJVL <=", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlLike(String value) {
            addCriterion("LJVL like", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlNotLike(String value) {
            addCriterion("LJVL not like", value, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlIn(List<String> values) {
            addCriterion("LJVL in", values, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlNotIn(List<String> values) {
            addCriterion("LJVL not in", values, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlBetween(String value1, String value2) {
            addCriterion("LJVL between", value1, value2, "ljvl");
            return (Criteria) this;
        }

        public Criteria andLjvlNotBetween(String value1, String value2) {
            addCriterion("LJVL not between", value1, value2, "ljvl");
            return (Criteria) this;
        }

        public Criteria andEeizhuIsNull() {
            addCriterion("EEIZHU is null");
            return (Criteria) this;
        }

        public Criteria andEeizhuIsNotNull() {
            addCriterion("EEIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andEeizhuEqualTo(String value) {
            addCriterion("EEIZHU =", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuNotEqualTo(String value) {
            addCriterion("EEIZHU <>", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuGreaterThan(String value) {
            addCriterion("EEIZHU >", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("EEIZHU >=", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuLessThan(String value) {
            addCriterion("EEIZHU <", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuLessThanOrEqualTo(String value) {
            addCriterion("EEIZHU <=", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuLike(String value) {
            addCriterion("EEIZHU like", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuNotLike(String value) {
            addCriterion("EEIZHU not like", value, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuIn(List<String> values) {
            addCriterion("EEIZHU in", values, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuNotIn(List<String> values) {
            addCriterion("EEIZHU not in", values, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuBetween(String value1, String value2) {
            addCriterion("EEIZHU between", value1, value2, "eeizhu");
            return (Criteria) this;
        }

        public Criteria andEeizhuNotBetween(String value1, String value2) {
            addCriterion("EEIZHU not between", value1, value2, "eeizhu");
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

        public Criteria andCreditdateIsNull() {
            addCriterion("CREDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreditdateIsNotNull() {
            addCriterion("CREDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditdateEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE =", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE <>", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREDITDATE >", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE >=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThan(Date value) {
            addCriterionForJDBCDate("CREDITDATE <", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE <=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateIn(List<Date> values) {
            addCriterionForJDBCDate("CREDITDATE in", values, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREDITDATE not in", values, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREDITDATE between", value1, value2, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREDITDATE not between", value1, value2, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateEqualTo(Timestamp value) {
            addCriterion("CREDITDATE =", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotEqualTo(Timestamp value) {
            addCriterion("CREDITDATE <>", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThan(Timestamp value) {
            addCriterion("CREDITDATE >", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREDITDATE >=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThan(Timestamp value) {
            addCriterion("CREDITDATE <", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREDITDATE <=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREDITDATE between", value1, value2, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREDITDATE not between", value1, value2, "creditdate");
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