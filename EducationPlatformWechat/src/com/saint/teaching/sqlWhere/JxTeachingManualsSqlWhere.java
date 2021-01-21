package com.saint.teaching.sqlWhere;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxTeachingManualsEntity;

/**
*类注释信息
*表名JX_TEACHING_MANUALS
*表说明伦理审查
  */
public class JxTeachingManualsSqlWhere extends JxTeachingManualsEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxTeachingManualsSqlWhere() {
        oredCriteria = new ArrayList<Criteria>();
    }

    @Override
	public void setListPage(Page listPage) {
        this.listPage = listPage;
    }

    @Override
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

        public Criteria andPatientBsIsNull() {
            addCriterion("PATIENT_BS is null");
            return (Criteria) this;
        }

        public Criteria andPatientBsIsNotNull() {
            addCriterion("PATIENT_BS is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBsEqualTo(String value) {
            addCriterion("PATIENT_BS =", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsNotEqualTo(String value) {
            addCriterion("PATIENT_BS <>", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsGreaterThan(String value) {
            addCriterion("PATIENT_BS >", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_BS >=", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsLessThan(String value) {
            addCriterion("PATIENT_BS <", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_BS <=", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsLike(String value) {
            addCriterion("PATIENT_BS like", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsNotLike(String value) {
            addCriterion("PATIENT_BS not like", value, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsIn(List<String> values) {
            addCriterion("PATIENT_BS in", values, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsNotIn(List<String> values) {
            addCriterion("PATIENT_BS not in", values, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsBetween(String value1, String value2) {
            addCriterion("PATIENT_BS between", value1, value2, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientBsNotBetween(String value1, String value2) {
            addCriterion("PATIENT_BS not between", value1, value2, "patientBs");
            return (Criteria) this;
        }

        public Criteria andPatientIsNull() {
            addCriterion("PATIENT is null");
            return (Criteria) this;
        }

        public Criteria andPatientIsNotNull() {
            addCriterion("PATIENT is not null");
            return (Criteria) this;
        }

        public Criteria andPatientEqualTo(String value) {
            addCriterion("PATIENT =", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotEqualTo(String value) {
            addCriterion("PATIENT <>", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientGreaterThan(String value) {
            addCriterion("PATIENT >", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT >=", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLessThan(String value) {
            addCriterion("PATIENT <", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLessThanOrEqualTo(String value) {
            addCriterion("PATIENT <=", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLike(String value) {
            addCriterion("PATIENT like", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotLike(String value) {
            addCriterion("PATIENT not like", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientIn(List<String> values) {
            addCriterion("PATIENT in", values, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotIn(List<String> values) {
            addCriterion("PATIENT not in", values, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientBetween(String value1, String value2) {
            addCriterion("PATIENT between", value1, value2, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotBetween(String value1, String value2) {
            addCriterion("PATIENT not between", value1, value2, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("PATIENT_SEX is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("PATIENT_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(String value) {
            addCriterion("PATIENT_SEX =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(String value) {
            addCriterion("PATIENT_SEX <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(String value) {
            addCriterion("PATIENT_SEX >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_SEX >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(String value) {
            addCriterion("PATIENT_SEX <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_SEX <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLike(String value) {
            addCriterion("PATIENT_SEX like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotLike(String value) {
            addCriterion("PATIENT_SEX not like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<String> values) {
            addCriterion("PATIENT_SEX in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<String> values) {
            addCriterion("PATIENT_SEX not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(String value1, String value2) {
            addCriterion("PATIENT_SEX between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(String value1, String value2) {
            addCriterion("PATIENT_SEX not between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("PATIENT_AGE is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("PATIENT_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(String value) {
            addCriterion("PATIENT_AGE =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(String value) {
            addCriterion("PATIENT_AGE <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(String value) {
            addCriterion("PATIENT_AGE >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_AGE >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(String value) {
            addCriterion("PATIENT_AGE <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_AGE <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLike(String value) {
            addCriterion("PATIENT_AGE like", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotLike(String value) {
            addCriterion("PATIENT_AGE not like", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<String> values) {
            addCriterion("PATIENT_AGE in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<String> values) {
            addCriterion("PATIENT_AGE not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(String value1, String value2) {
            addCriterion("PATIENT_AGE between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(String value1, String value2) {
            addCriterion("PATIENT_AGE not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientBednumIsNull() {
            addCriterion("PATIENT_BEDNUM is null");
            return (Criteria) this;
        }

        public Criteria andPatientBednumIsNotNull() {
            addCriterion("PATIENT_BEDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBednumEqualTo(String value) {
            addCriterion("PATIENT_BEDNUM =", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumNotEqualTo(String value) {
            addCriterion("PATIENT_BEDNUM <>", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumGreaterThan(String value) {
            addCriterion("PATIENT_BEDNUM >", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_BEDNUM >=", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumLessThan(String value) {
            addCriterion("PATIENT_BEDNUM <", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_BEDNUM <=", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumLike(String value) {
            addCriterion("PATIENT_BEDNUM like", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumNotLike(String value) {
            addCriterion("PATIENT_BEDNUM not like", value, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumIn(List<String> values) {
            addCriterion("PATIENT_BEDNUM in", values, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumNotIn(List<String> values) {
            addCriterion("PATIENT_BEDNUM not in", values, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumBetween(String value1, String value2) {
            addCriterion("PATIENT_BEDNUM between", value1, value2, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBednumNotBetween(String value1, String value2) {
            addCriterion("PATIENT_BEDNUM not between", value1, value2, "patientBednum");
            return (Criteria) this;
        }

        public Criteria andPatientBlhIsNull() {
            addCriterion("PATIENT_BLH is null");
            return (Criteria) this;
        }

        public Criteria andPatientBlhIsNotNull() {
            addCriterion("PATIENT_BLH is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBlhEqualTo(String value) {
            addCriterion("PATIENT_BLH =", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhNotEqualTo(String value) {
            addCriterion("PATIENT_BLH <>", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhGreaterThan(String value) {
            addCriterion("PATIENT_BLH >", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_BLH >=", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhLessThan(String value) {
            addCriterion("PATIENT_BLH <", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_BLH <=", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhLike(String value) {
            addCriterion("PATIENT_BLH like", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhNotLike(String value) {
            addCriterion("PATIENT_BLH not like", value, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhIn(List<String> values) {
            addCriterion("PATIENT_BLH in", values, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhNotIn(List<String> values) {
            addCriterion("PATIENT_BLH not in", values, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhBetween(String value1, String value2) {
            addCriterion("PATIENT_BLH between", value1, value2, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientBlhNotBetween(String value1, String value2) {
            addCriterion("PATIENT_BLH not between", value1, value2, "patientBlh");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsIsNull() {
            addCriterion("PATIENT_MZFS is null");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsIsNotNull() {
            addCriterion("PATIENT_MZFS is not null");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsEqualTo(String value) {
            addCriterion("PATIENT_MZFS =", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsNotEqualTo(String value) {
            addCriterion("PATIENT_MZFS <>", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsGreaterThan(String value) {
            addCriterion("PATIENT_MZFS >", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_MZFS >=", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsLessThan(String value) {
            addCriterion("PATIENT_MZFS <", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_MZFS <=", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsLike(String value) {
            addCriterion("PATIENT_MZFS like", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsNotLike(String value) {
            addCriterion("PATIENT_MZFS not like", value, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsIn(List<String> values) {
            addCriterion("PATIENT_MZFS in", values, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsNotIn(List<String> values) {
            addCriterion("PATIENT_MZFS not in", values, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsBetween(String value1, String value2) {
            addCriterion("PATIENT_MZFS between", value1, value2, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andPatientMzfsNotBetween(String value1, String value2) {
            addCriterion("PATIENT_MZFS not between", value1, value2, "patientMzfs");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseIsNull() {
            addCriterion("CF_DIAGNOSE is null");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseIsNotNull() {
            addCriterion("CF_DIAGNOSE is not null");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseEqualTo(String value) {
            addCriterion("CF_DIAGNOSE =", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseNotEqualTo(String value) {
            addCriterion("CF_DIAGNOSE <>", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseGreaterThan(String value) {
            addCriterion("CF_DIAGNOSE >", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseGreaterThanOrEqualTo(String value) {
            addCriterion("CF_DIAGNOSE >=", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseLessThan(String value) {
            addCriterion("CF_DIAGNOSE <", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseLessThanOrEqualTo(String value) {
            addCriterion("CF_DIAGNOSE <=", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseLike(String value) {
            addCriterion("CF_DIAGNOSE like", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseNotLike(String value) {
            addCriterion("CF_DIAGNOSE not like", value, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseIn(List<String> values) {
            addCriterion("CF_DIAGNOSE in", values, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseNotIn(List<String> values) {
            addCriterion("CF_DIAGNOSE not in", values, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseBetween(String value1, String value2) {
            addCriterion("CF_DIAGNOSE between", value1, value2, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andCfDiagnoseNotBetween(String value1, String value2) {
            addCriterion("CF_DIAGNOSE not between", value1, value2, "cfDiagnose");
            return (Criteria) this;
        }

        public Criteria andContentoIsNull() {
            addCriterion("CONTENTO is null");
            return (Criteria) this;
        }

        public Criteria andContentoIsNotNull() {
            addCriterion("CONTENTO is not null");
            return (Criteria) this;
        }

        public Criteria andContentoEqualTo(String value) {
            addCriterion("CONTENTO =", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoNotEqualTo(String value) {
            addCriterion("CONTENTO <>", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoGreaterThan(String value) {
            addCriterion("CONTENTO >", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTO >=", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoLessThan(String value) {
            addCriterion("CONTENTO <", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoLessThanOrEqualTo(String value) {
            addCriterion("CONTENTO <=", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoLike(String value) {
            addCriterion("CONTENTO like", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoNotLike(String value) {
            addCriterion("CONTENTO not like", value, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoIn(List<String> values) {
            addCriterion("CONTENTO in", values, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoNotIn(List<String> values) {
            addCriterion("CONTENTO not in", values, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoBetween(String value1, String value2) {
            addCriterion("CONTENTO between", value1, value2, "contento");
            return (Criteria) this;
        }

        public Criteria andContentoNotBetween(String value1, String value2) {
            addCriterion("CONTENTO not between", value1, value2, "contento");
            return (Criteria) this;
        }

        public Criteria andContenttIsNull() {
            addCriterion("CONTENTT is null");
            return (Criteria) this;
        }

        public Criteria andContenttIsNotNull() {
            addCriterion("CONTENTT is not null");
            return (Criteria) this;
        }

        public Criteria andContenttEqualTo(String value) {
            addCriterion("CONTENTT =", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttNotEqualTo(String value) {
            addCriterion("CONTENTT <>", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttGreaterThan(String value) {
            addCriterion("CONTENTT >", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTT >=", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttLessThan(String value) {
            addCriterion("CONTENTT <", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttLessThanOrEqualTo(String value) {
            addCriterion("CONTENTT <=", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttLike(String value) {
            addCriterion("CONTENTT like", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttNotLike(String value) {
            addCriterion("CONTENTT not like", value, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttIn(List<String> values) {
            addCriterion("CONTENTT in", values, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttNotIn(List<String> values) {
            addCriterion("CONTENTT not in", values, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttBetween(String value1, String value2) {
            addCriterion("CONTENTT between", value1, value2, "contentt");
            return (Criteria) this;
        }

        public Criteria andContenttNotBetween(String value1, String value2) {
            addCriterion("CONTENTT not between", value1, value2, "contentt");
            return (Criteria) this;
        }

        public Criteria andContentthIsNull() {
            addCriterion("CONTENTTH is null");
            return (Criteria) this;
        }

        public Criteria andContentthIsNotNull() {
            addCriterion("CONTENTTH is not null");
            return (Criteria) this;
        }

        public Criteria andContentthEqualTo(String value) {
            addCriterion("CONTENTTH =", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthNotEqualTo(String value) {
            addCriterion("CONTENTTH <>", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthGreaterThan(String value) {
            addCriterion("CONTENTTH >", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTTH >=", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthLessThan(String value) {
            addCriterion("CONTENTTH <", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthLessThanOrEqualTo(String value) {
            addCriterion("CONTENTTH <=", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthLike(String value) {
            addCriterion("CONTENTTH like", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthNotLike(String value) {
            addCriterion("CONTENTTH not like", value, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthIn(List<String> values) {
            addCriterion("CONTENTTH in", values, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthNotIn(List<String> values) {
            addCriterion("CONTENTTH not in", values, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthBetween(String value1, String value2) {
            addCriterion("CONTENTTH between", value1, value2, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentthNotBetween(String value1, String value2) {
            addCriterion("CONTENTTH not between", value1, value2, "contentth");
            return (Criteria) this;
        }

        public Criteria andContentfIsNull() {
            addCriterion("CONTENTF is null");
            return (Criteria) this;
        }

        public Criteria andContentfIsNotNull() {
            addCriterion("CONTENTF is not null");
            return (Criteria) this;
        }

        public Criteria andContentfEqualTo(String value) {
            addCriterion("CONTENTF =", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotEqualTo(String value) {
            addCriterion("CONTENTF <>", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfGreaterThan(String value) {
            addCriterion("CONTENTF >", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTF >=", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfLessThan(String value) {
            addCriterion("CONTENTF <", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfLessThanOrEqualTo(String value) {
            addCriterion("CONTENTF <=", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfLike(String value) {
            addCriterion("CONTENTF like", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotLike(String value) {
            addCriterion("CONTENTF not like", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfIn(List<String> values) {
            addCriterion("CONTENTF in", values, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotIn(List<String> values) {
            addCriterion("CONTENTF not in", values, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfBetween(String value1, String value2) {
            addCriterion("CONTENTF between", value1, value2, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotBetween(String value1, String value2) {
            addCriterion("CONTENTF not between", value1, value2, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentwIsNull() {
            addCriterion("CONTENTW is null");
            return (Criteria) this;
        }

        public Criteria andContentwIsNotNull() {
            addCriterion("CONTENTW is not null");
            return (Criteria) this;
        }

        public Criteria andContentwEqualTo(String value) {
            addCriterion("CONTENTW =", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwNotEqualTo(String value) {
            addCriterion("CONTENTW <>", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwGreaterThan(String value) {
            addCriterion("CONTENTW >", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTW >=", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwLessThan(String value) {
            addCriterion("CONTENTW <", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwLessThanOrEqualTo(String value) {
            addCriterion("CONTENTW <=", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwLike(String value) {
            addCriterion("CONTENTW like", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwNotLike(String value) {
            addCriterion("CONTENTW not like", value, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwIn(List<String> values) {
            addCriterion("CONTENTW in", values, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwNotIn(List<String> values) {
            addCriterion("CONTENTW not in", values, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwBetween(String value1, String value2) {
            addCriterion("CONTENTW between", value1, value2, "contentw");
            return (Criteria) this;
        }

        public Criteria andContentwNotBetween(String value1, String value2) {
            addCriterion("CONTENTW not between", value1, value2, "contentw");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidIsNull() {
            addCriterion("CZ_GMASSISTANTID is null");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidIsNotNull() {
            addCriterion("CZ_GMASSISTANTID is not null");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTID =", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidNotEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTID <>", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidGreaterThan(String value) {
            addCriterion("CZ_GMASSISTANTID >", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTID >=", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidLessThan(String value) {
            addCriterion("CZ_GMASSISTANTID <", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidLessThanOrEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTID <=", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidLike(String value) {
            addCriterion("CZ_GMASSISTANTID like", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidNotLike(String value) {
            addCriterion("CZ_GMASSISTANTID not like", value, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidIn(List<String> values) {
            addCriterion("CZ_GMASSISTANTID in", values, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidNotIn(List<String> values) {
            addCriterion("CZ_GMASSISTANTID not in", values, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidBetween(String value1, String value2) {
            addCriterion("CZ_GMASSISTANTID between", value1, value2, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantidNotBetween(String value1, String value2) {
            addCriterion("CZ_GMASSISTANTID not between", value1, value2, "czGmassistantid");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameIsNull() {
            addCriterion("CZ_GMASSISTANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameIsNotNull() {
            addCriterion("CZ_GMASSISTANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTNAME =", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameNotEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTNAME <>", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameGreaterThan(String value) {
            addCriterion("CZ_GMASSISTANTNAME >", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTNAME >=", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameLessThan(String value) {
            addCriterion("CZ_GMASSISTANTNAME <", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameLessThanOrEqualTo(String value) {
            addCriterion("CZ_GMASSISTANTNAME <=", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameLike(String value) {
            addCriterion("CZ_GMASSISTANTNAME like", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameNotLike(String value) {
            addCriterion("CZ_GMASSISTANTNAME not like", value, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameIn(List<String> values) {
            addCriterion("CZ_GMASSISTANTNAME in", values, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameNotIn(List<String> values) {
            addCriterion("CZ_GMASSISTANTNAME not in", values, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameBetween(String value1, String value2) {
            addCriterion("CZ_GMASSISTANTNAME between", value1, value2, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzGmassistantnameNotBetween(String value1, String value2) {
            addCriterion("CZ_GMASSISTANTNAME not between", value1, value2, "czGmassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidIsNull() {
            addCriterion("CZ_SZASSISTANTID is null");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidIsNotNull() {
            addCriterion("CZ_SZASSISTANTID is not null");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTID =", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidNotEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTID <>", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidGreaterThan(String value) {
            addCriterion("CZ_SZASSISTANTID >", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTID >=", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidLessThan(String value) {
            addCriterion("CZ_SZASSISTANTID <", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidLessThanOrEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTID <=", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidLike(String value) {
            addCriterion("CZ_SZASSISTANTID like", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidNotLike(String value) {
            addCriterion("CZ_SZASSISTANTID not like", value, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidIn(List<String> values) {
            addCriterion("CZ_SZASSISTANTID in", values, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidNotIn(List<String> values) {
            addCriterion("CZ_SZASSISTANTID not in", values, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidBetween(String value1, String value2) {
            addCriterion("CZ_SZASSISTANTID between", value1, value2, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantidNotBetween(String value1, String value2) {
            addCriterion("CZ_SZASSISTANTID not between", value1, value2, "czSzassistantid");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameIsNull() {
            addCriterion("CZ_SZASSISTANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameIsNotNull() {
            addCriterion("CZ_SZASSISTANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTNAME =", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameNotEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTNAME <>", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameGreaterThan(String value) {
            addCriterion("CZ_SZASSISTANTNAME >", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTNAME >=", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameLessThan(String value) {
            addCriterion("CZ_SZASSISTANTNAME <", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameLessThanOrEqualTo(String value) {
            addCriterion("CZ_SZASSISTANTNAME <=", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameLike(String value) {
            addCriterion("CZ_SZASSISTANTNAME like", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameNotLike(String value) {
            addCriterion("CZ_SZASSISTANTNAME not like", value, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameIn(List<String> values) {
            addCriterion("CZ_SZASSISTANTNAME in", values, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameNotIn(List<String> values) {
            addCriterion("CZ_SZASSISTANTNAME not in", values, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameBetween(String value1, String value2) {
            addCriterion("CZ_SZASSISTANTNAME between", value1, value2, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzSzassistantnameNotBetween(String value1, String value2) {
            addCriterion("CZ_SZASSISTANTNAME not between", value1, value2, "czSzassistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1IsNull() {
            addCriterion("CZ_ASSISTANTID1 is null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1IsNotNull() {
            addCriterion("CZ_ASSISTANTID1 is not null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1EqualTo(String value) {
            addCriterion("CZ_ASSISTANTID1 =", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1NotEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID1 <>", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1GreaterThan(String value) {
            addCriterion("CZ_ASSISTANTID1 >", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1GreaterThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID1 >=", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1LessThan(String value) {
            addCriterion("CZ_ASSISTANTID1 <", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1LessThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID1 <=", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1Like(String value) {
            addCriterion("CZ_ASSISTANTID1 like", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1NotLike(String value) {
            addCriterion("CZ_ASSISTANTID1 not like", value, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1In(List<String> values) {
            addCriterion("CZ_ASSISTANTID1 in", values, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1NotIn(List<String> values) {
            addCriterion("CZ_ASSISTANTID1 not in", values, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1Between(String value1, String value2) {
            addCriterion("CZ_ASSISTANTID1 between", value1, value2, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid1NotBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTID1 not between", value1, value2, "czAssistantid1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1IsNull() {
            addCriterion("CZ_ASSISTANTNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1IsNotNull() {
            addCriterion("CZ_ASSISTANTNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1EqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME1 =", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1NotEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME1 <>", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1GreaterThan(String value) {
            addCriterion("CZ_ASSISTANTNAME1 >", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1GreaterThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME1 >=", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1LessThan(String value) {
            addCriterion("CZ_ASSISTANTNAME1 <", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1LessThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME1 <=", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1Like(String value) {
            addCriterion("CZ_ASSISTANTNAME1 like", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1NotLike(String value) {
            addCriterion("CZ_ASSISTANTNAME1 not like", value, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1In(List<String> values) {
            addCriterion("CZ_ASSISTANTNAME1 in", values, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1NotIn(List<String> values) {
            addCriterion("CZ_ASSISTANTNAME1 not in", values, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1Between(String value1, String value2) {
            addCriterion("CZ_ASSISTANTNAME1 between", value1, value2, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname1NotBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTNAME1 not between", value1, value2, "czAssistantname1");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2IsNull() {
            addCriterion("CZ_ASSISTANTID2 is null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2IsNotNull() {
            addCriterion("CZ_ASSISTANTID2 is not null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2EqualTo(String value) {
            addCriterion("CZ_ASSISTANTID2 =", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2NotEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID2 <>", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2GreaterThan(String value) {
            addCriterion("CZ_ASSISTANTID2 >", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2GreaterThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID2 >=", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2LessThan(String value) {
            addCriterion("CZ_ASSISTANTID2 <", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2LessThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID2 <=", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2Like(String value) {
            addCriterion("CZ_ASSISTANTID2 like", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2NotLike(String value) {
            addCriterion("CZ_ASSISTANTID2 not like", value, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2In(List<String> values) {
            addCriterion("CZ_ASSISTANTID2 in", values, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2NotIn(List<String> values) {
            addCriterion("CZ_ASSISTANTID2 not in", values, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2Between(String value1, String value2) {
            addCriterion("CZ_ASSISTANTID2 between", value1, value2, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantid2NotBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTID2 not between", value1, value2, "czAssistantid2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2IsNull() {
            addCriterion("CZ_ASSISTANTNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2IsNotNull() {
            addCriterion("CZ_ASSISTANTNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2EqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME2 =", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2NotEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME2 <>", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2GreaterThan(String value) {
            addCriterion("CZ_ASSISTANTNAME2 >", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2GreaterThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME2 >=", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2LessThan(String value) {
            addCriterion("CZ_ASSISTANTNAME2 <", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2LessThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME2 <=", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2Like(String value) {
            addCriterion("CZ_ASSISTANTNAME2 like", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2NotLike(String value) {
            addCriterion("CZ_ASSISTANTNAME2 not like", value, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2In(List<String> values) {
            addCriterion("CZ_ASSISTANTNAME2 in", values, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2NotIn(List<String> values) {
            addCriterion("CZ_ASSISTANTNAME2 not in", values, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2Between(String value1, String value2) {
            addCriterion("CZ_ASSISTANTNAME2 between", value1, value2, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantname2NotBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTNAME2 not between", value1, value2, "czAssistantname2");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidIsNull() {
            addCriterion("CZ_ASSISTANTID is null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidIsNotNull() {
            addCriterion("CZ_ASSISTANTID is not null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID =", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidNotEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID <>", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidGreaterThan(String value) {
            addCriterion("CZ_ASSISTANTID >", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID >=", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidLessThan(String value) {
            addCriterion("CZ_ASSISTANTID <", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidLessThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTID <=", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidLike(String value) {
            addCriterion("CZ_ASSISTANTID like", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidNotLike(String value) {
            addCriterion("CZ_ASSISTANTID not like", value, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidIn(List<String> values) {
            addCriterion("CZ_ASSISTANTID in", values, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidNotIn(List<String> values) {
            addCriterion("CZ_ASSISTANTID not in", values, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTID between", value1, value2, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantidNotBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTID not between", value1, value2, "czAssistantid");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameIsNull() {
            addCriterion("CZ_ASSISTANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameIsNotNull() {
            addCriterion("CZ_ASSISTANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME =", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameNotEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME <>", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameGreaterThan(String value) {
            addCriterion("CZ_ASSISTANTNAME >", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME >=", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameLessThan(String value) {
            addCriterion("CZ_ASSISTANTNAME <", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameLessThanOrEqualTo(String value) {
            addCriterion("CZ_ASSISTANTNAME <=", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameLike(String value) {
            addCriterion("CZ_ASSISTANTNAME like", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameNotLike(String value) {
            addCriterion("CZ_ASSISTANTNAME not like", value, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameIn(List<String> values) {
            addCriterion("CZ_ASSISTANTNAME in", values, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameNotIn(List<String> values) {
            addCriterion("CZ_ASSISTANTNAME not in", values, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTNAME between", value1, value2, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andCzAssistantnameNotBetween(String value1, String value2) {
            addCriterion("CZ_ASSISTANTNAME not between", value1, value2, "czAssistantname");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdIsNull() {
            addCriterion("TL_AMSNMD is null");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdIsNotNull() {
            addCriterion("TL_AMSNMD is not null");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdEqualTo(String value) {
            addCriterion("TL_AMSNMD =", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdNotEqualTo(String value) {
            addCriterion("TL_AMSNMD <>", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdGreaterThan(String value) {
            addCriterion("TL_AMSNMD >", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdGreaterThanOrEqualTo(String value) {
            addCriterion("TL_AMSNMD >=", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdLessThan(String value) {
            addCriterion("TL_AMSNMD <", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdLessThanOrEqualTo(String value) {
            addCriterion("TL_AMSNMD <=", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdLike(String value) {
            addCriterion("TL_AMSNMD like", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdNotLike(String value) {
            addCriterion("TL_AMSNMD not like", value, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdIn(List<String> values) {
            addCriterion("TL_AMSNMD in", values, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdNotIn(List<String> values) {
            addCriterion("TL_AMSNMD not in", values, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdBetween(String value1, String value2) {
            addCriterion("TL_AMSNMD between", value1, value2, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andTlAmsnmdNotBetween(String value1, String value2) {
            addCriterion("TL_AMSNMD not between", value1, value2, "tlAmsnmd");
            return (Criteria) this;
        }

        public Criteria andJzCourseIsNull() {
            addCriterion("JZ_COURSE is null");
            return (Criteria) this;
        }

        public Criteria andJzCourseIsNotNull() {
            addCriterion("JZ_COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andJzCourseEqualTo(String value) {
            addCriterion("JZ_COURSE =", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseNotEqualTo(String value) {
            addCriterion("JZ_COURSE <>", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseGreaterThan(String value) {
            addCriterion("JZ_COURSE >", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseGreaterThanOrEqualTo(String value) {
            addCriterion("JZ_COURSE >=", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseLessThan(String value) {
            addCriterion("JZ_COURSE <", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseLessThanOrEqualTo(String value) {
            addCriterion("JZ_COURSE <=", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseLike(String value) {
            addCriterion("JZ_COURSE like", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseNotLike(String value) {
            addCriterion("JZ_COURSE not like", value, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseIn(List<String> values) {
            addCriterion("JZ_COURSE in", values, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseNotIn(List<String> values) {
            addCriterion("JZ_COURSE not in", values, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseBetween(String value1, String value2) {
            addCriterion("JZ_COURSE between", value1, value2, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzCourseNotBetween(String value1, String value2) {
            addCriterion("JZ_COURSE not between", value1, value2, "jzCourse");
            return (Criteria) this;
        }

        public Criteria andJzPersonidIsNull() {
            addCriterion("JZ_PERSONID is null");
            return (Criteria) this;
        }

        public Criteria andJzPersonidIsNotNull() {
            addCriterion("JZ_PERSONID is not null");
            return (Criteria) this;
        }

        public Criteria andJzPersonidEqualTo(String value) {
            addCriterion("JZ_PERSONID =", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidNotEqualTo(String value) {
            addCriterion("JZ_PERSONID <>", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidGreaterThan(String value) {
            addCriterion("JZ_PERSONID >", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("JZ_PERSONID >=", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidLessThan(String value) {
            addCriterion("JZ_PERSONID <", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidLessThanOrEqualTo(String value) {
            addCriterion("JZ_PERSONID <=", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidLike(String value) {
            addCriterion("JZ_PERSONID like", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidNotLike(String value) {
            addCriterion("JZ_PERSONID not like", value, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidIn(List<String> values) {
            addCriterion("JZ_PERSONID in", values, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidNotIn(List<String> values) {
            addCriterion("JZ_PERSONID not in", values, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidBetween(String value1, String value2) {
            addCriterion("JZ_PERSONID between", value1, value2, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonidNotBetween(String value1, String value2) {
            addCriterion("JZ_PERSONID not between", value1, value2, "jzPersonid");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameIsNull() {
            addCriterion("JZ_PERSONNAME is null");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameIsNotNull() {
            addCriterion("JZ_PERSONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameEqualTo(String value) {
            addCriterion("JZ_PERSONNAME =", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameNotEqualTo(String value) {
            addCriterion("JZ_PERSONNAME <>", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameGreaterThan(String value) {
            addCriterion("JZ_PERSONNAME >", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("JZ_PERSONNAME >=", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameLessThan(String value) {
            addCriterion("JZ_PERSONNAME <", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameLessThanOrEqualTo(String value) {
            addCriterion("JZ_PERSONNAME <=", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameLike(String value) {
            addCriterion("JZ_PERSONNAME like", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameNotLike(String value) {
            addCriterion("JZ_PERSONNAME not like", value, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameIn(List<String> values) {
            addCriterion("JZ_PERSONNAME in", values, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameNotIn(List<String> values) {
            addCriterion("JZ_PERSONNAME not in", values, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameBetween(String value1, String value2) {
            addCriterion("JZ_PERSONNAME between", value1, value2, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andJzPersonnameNotBetween(String value1, String value2) {
            addCriterion("JZ_PERSONNAME not between", value1, value2, "jzPersonname");
            return (Criteria) this;
        }

        public Criteria andTeachobjidIsNull() {
            addCriterion("TEACHOBJID is null");
            return (Criteria) this;
        }

        public Criteria andTeachobjidIsNotNull() {
            addCriterion("TEACHOBJID is not null");
            return (Criteria) this;
        }

        public Criteria andTeachobjidEqualTo(String value) {
            addCriterion("TEACHOBJID =", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidNotEqualTo(String value) {
            addCriterion("TEACHOBJID <>", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidGreaterThan(String value) {
            addCriterion("TEACHOBJID >", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHOBJID >=", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidLessThan(String value) {
            addCriterion("TEACHOBJID <", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidLessThanOrEqualTo(String value) {
            addCriterion("TEACHOBJID <=", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidLike(String value) {
            addCriterion("TEACHOBJID like", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidNotLike(String value) {
            addCriterion("TEACHOBJID not like", value, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidIn(List<String> values) {
            addCriterion("TEACHOBJID in", values, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidNotIn(List<String> values) {
            addCriterion("TEACHOBJID not in", values, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidBetween(String value1, String value2) {
            addCriterion("TEACHOBJID between", value1, value2, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjidNotBetween(String value1, String value2) {
            addCriterion("TEACHOBJID not between", value1, value2, "teachobjid");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameIsNull() {
            addCriterion("TEACHOBJNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameIsNotNull() {
            addCriterion("TEACHOBJNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameEqualTo(String value) {
            addCriterion("TEACHOBJNAME =", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameNotEqualTo(String value) {
            addCriterion("TEACHOBJNAME <>", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameGreaterThan(String value) {
            addCriterion("TEACHOBJNAME >", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHOBJNAME >=", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameLessThan(String value) {
            addCriterion("TEACHOBJNAME <", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameLessThanOrEqualTo(String value) {
            addCriterion("TEACHOBJNAME <=", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameLike(String value) {
            addCriterion("TEACHOBJNAME like", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameNotLike(String value) {
            addCriterion("TEACHOBJNAME not like", value, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameIn(List<String> values) {
            addCriterion("TEACHOBJNAME in", values, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameNotIn(List<String> values) {
            addCriterion("TEACHOBJNAME not in", values, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameBetween(String value1, String value2) {
            addCriterion("TEACHOBJNAME between", value1, value2, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andTeachobjnameNotBetween(String value1, String value2) {
            addCriterion("TEACHOBJNAME not between", value1, value2, "teachobjname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidIsNull() {
            addCriterion("OTHERSTUDENTID is null");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidIsNotNull() {
            addCriterion("OTHERSTUDENTID is not null");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidEqualTo(String value) {
            addCriterion("OTHERSTUDENTID =", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidNotEqualTo(String value) {
            addCriterion("OTHERSTUDENTID <>", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidGreaterThan(String value) {
            addCriterion("OTHERSTUDENTID >", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERSTUDENTID >=", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidLessThan(String value) {
            addCriterion("OTHERSTUDENTID <", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidLessThanOrEqualTo(String value) {
            addCriterion("OTHERSTUDENTID <=", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidLike(String value) {
            addCriterion("OTHERSTUDENTID like", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidNotLike(String value) {
            addCriterion("OTHERSTUDENTID not like", value, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidIn(List<String> values) {
            addCriterion("OTHERSTUDENTID in", values, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidNotIn(List<String> values) {
            addCriterion("OTHERSTUDENTID not in", values, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidBetween(String value1, String value2) {
            addCriterion("OTHERSTUDENTID between", value1, value2, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentidNotBetween(String value1, String value2) {
            addCriterion("OTHERSTUDENTID not between", value1, value2, "otherstudentid");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameIsNull() {
            addCriterion("OTHERSTUDENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameIsNotNull() {
            addCriterion("OTHERSTUDENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameEqualTo(String value) {
            addCriterion("OTHERSTUDENTNAME =", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameNotEqualTo(String value) {
            addCriterion("OTHERSTUDENTNAME <>", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameGreaterThan(String value) {
            addCriterion("OTHERSTUDENTNAME >", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERSTUDENTNAME >=", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameLessThan(String value) {
            addCriterion("OTHERSTUDENTNAME <", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameLessThanOrEqualTo(String value) {
            addCriterion("OTHERSTUDENTNAME <=", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameLike(String value) {
            addCriterion("OTHERSTUDENTNAME like", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameNotLike(String value) {
            addCriterion("OTHERSTUDENTNAME not like", value, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameIn(List<String> values) {
            addCriterion("OTHERSTUDENTNAME in", values, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameNotIn(List<String> values) {
            addCriterion("OTHERSTUDENTNAME not in", values, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameBetween(String value1, String value2) {
            addCriterion("OTHERSTUDENTNAME between", value1, value2, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andOtherstudentnameNotBetween(String value1, String value2) {
            addCriterion("OTHERSTUDENTNAME not between", value1, value2, "otherstudentname");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridIsNull() {
            addCriterion("MAINGUANTEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridIsNotNull() {
            addCriterion("MAINGUANTEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridEqualTo(String value) {
            addCriterion("MAINGUANTEACHERID =", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridNotEqualTo(String value) {
            addCriterion("MAINGUANTEACHERID <>", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridGreaterThan(String value) {
            addCriterion("MAINGUANTEACHERID >", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridGreaterThanOrEqualTo(String value) {
            addCriterion("MAINGUANTEACHERID >=", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridLessThan(String value) {
            addCriterion("MAINGUANTEACHERID <", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridLessThanOrEqualTo(String value) {
            addCriterion("MAINGUANTEACHERID <=", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridLike(String value) {
            addCriterion("MAINGUANTEACHERID like", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridNotLike(String value) {
            addCriterion("MAINGUANTEACHERID not like", value, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridIn(List<String> values) {
            addCriterion("MAINGUANTEACHERID in", values, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridNotIn(List<String> values) {
            addCriterion("MAINGUANTEACHERID not in", values, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridBetween(String value1, String value2) {
            addCriterion("MAINGUANTEACHERID between", value1, value2, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteacheridNotBetween(String value1, String value2) {
            addCriterion("MAINGUANTEACHERID not between", value1, value2, "mainguanteacherid");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameIsNull() {
            addCriterion("MAINGUANTEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameIsNotNull() {
            addCriterion("MAINGUANTEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameEqualTo(String value) {
            addCriterion("MAINGUANTEACHERNAME =", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameNotEqualTo(String value) {
            addCriterion("MAINGUANTEACHERNAME <>", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameGreaterThan(String value) {
            addCriterion("MAINGUANTEACHERNAME >", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("MAINGUANTEACHERNAME >=", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameLessThan(String value) {
            addCriterion("MAINGUANTEACHERNAME <", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameLessThanOrEqualTo(String value) {
            addCriterion("MAINGUANTEACHERNAME <=", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameLike(String value) {
            addCriterion("MAINGUANTEACHERNAME like", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameNotLike(String value) {
            addCriterion("MAINGUANTEACHERNAME not like", value, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameIn(List<String> values) {
            addCriterion("MAINGUANTEACHERNAME in", values, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameNotIn(List<String> values) {
            addCriterion("MAINGUANTEACHERNAME not in", values, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameBetween(String value1, String value2) {
            addCriterion("MAINGUANTEACHERNAME between", value1, value2, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainguanteachernameNotBetween(String value1, String value2) {
            addCriterion("MAINGUANTEACHERNAME not between", value1, value2, "mainguanteachername");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridIsNull() {
            addCriterion("MAINCHATEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridIsNotNull() {
            addCriterion("MAINCHATEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridEqualTo(String value) {
            addCriterion("MAINCHATEACHERID =", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridNotEqualTo(String value) {
            addCriterion("MAINCHATEACHERID <>", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridGreaterThan(String value) {
            addCriterion("MAINCHATEACHERID >", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridGreaterThanOrEqualTo(String value) {
            addCriterion("MAINCHATEACHERID >=", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridLessThan(String value) {
            addCriterion("MAINCHATEACHERID <", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridLessThanOrEqualTo(String value) {
            addCriterion("MAINCHATEACHERID <=", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridLike(String value) {
            addCriterion("MAINCHATEACHERID like", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridNotLike(String value) {
            addCriterion("MAINCHATEACHERID not like", value, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridIn(List<String> values) {
            addCriterion("MAINCHATEACHERID in", values, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridNotIn(List<String> values) {
            addCriterion("MAINCHATEACHERID not in", values, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridBetween(String value1, String value2) {
            addCriterion("MAINCHATEACHERID between", value1, value2, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateacheridNotBetween(String value1, String value2) {
            addCriterion("MAINCHATEACHERID not between", value1, value2, "mainchateacherid");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameIsNull() {
            addCriterion("MAINCHATEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameIsNotNull() {
            addCriterion("MAINCHATEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameEqualTo(String value) {
            addCriterion("MAINCHATEACHERNAME =", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameNotEqualTo(String value) {
            addCriterion("MAINCHATEACHERNAME <>", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameGreaterThan(String value) {
            addCriterion("MAINCHATEACHERNAME >", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameGreaterThanOrEqualTo(String value) {
            addCriterion("MAINCHATEACHERNAME >=", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameLessThan(String value) {
            addCriterion("MAINCHATEACHERNAME <", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameLessThanOrEqualTo(String value) {
            addCriterion("MAINCHATEACHERNAME <=", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameLike(String value) {
            addCriterion("MAINCHATEACHERNAME like", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameNotLike(String value) {
            addCriterion("MAINCHATEACHERNAME not like", value, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameIn(List<String> values) {
            addCriterion("MAINCHATEACHERNAME in", values, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameNotIn(List<String> values) {
            addCriterion("MAINCHATEACHERNAME not in", values, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameBetween(String value1, String value2) {
            addCriterion("MAINCHATEACHERNAME between", value1, value2, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andMainchateachernameNotBetween(String value1, String value2) {
            addCriterion("MAINCHATEACHERNAME not between", value1, value2, "mainchateachername");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridIsNull() {
            addCriterion("OTHERTEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridIsNotNull() {
            addCriterion("OTHERTEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridEqualTo(String value) {
            addCriterion("OTHERTEACHERID =", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridNotEqualTo(String value) {
            addCriterion("OTHERTEACHERID <>", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridGreaterThan(String value) {
            addCriterion("OTHERTEACHERID >", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERTEACHERID >=", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridLessThan(String value) {
            addCriterion("OTHERTEACHERID <", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridLessThanOrEqualTo(String value) {
            addCriterion("OTHERTEACHERID <=", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridLike(String value) {
            addCriterion("OTHERTEACHERID like", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridNotLike(String value) {
            addCriterion("OTHERTEACHERID not like", value, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridIn(List<String> values) {
            addCriterion("OTHERTEACHERID in", values, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridNotIn(List<String> values) {
            addCriterion("OTHERTEACHERID not in", values, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridBetween(String value1, String value2) {
            addCriterion("OTHERTEACHERID between", value1, value2, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteacheridNotBetween(String value1, String value2) {
            addCriterion("OTHERTEACHERID not between", value1, value2, "otherteacherid");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameIsNull() {
            addCriterion("OTHERTEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameIsNotNull() {
            addCriterion("OTHERTEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameEqualTo(String value) {
            addCriterion("OTHERTEACHERNAME =", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameNotEqualTo(String value) {
            addCriterion("OTHERTEACHERNAME <>", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameGreaterThan(String value) {
            addCriterion("OTHERTEACHERNAME >", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERTEACHERNAME >=", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameLessThan(String value) {
            addCriterion("OTHERTEACHERNAME <", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameLessThanOrEqualTo(String value) {
            addCriterion("OTHERTEACHERNAME <=", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameLike(String value) {
            addCriterion("OTHERTEACHERNAME like", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameNotLike(String value) {
            addCriterion("OTHERTEACHERNAME not like", value, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameIn(List<String> values) {
            addCriterion("OTHERTEACHERNAME in", values, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameNotIn(List<String> values) {
            addCriterion("OTHERTEACHERNAME not in", values, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameBetween(String value1, String value2) {
            addCriterion("OTHERTEACHERNAME between", value1, value2, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andOtherteachernameNotBetween(String value1, String value2) {
            addCriterion("OTHERTEACHERNAME not between", value1, value2, "otherteachername");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridIsNull() {
            addCriterion("HUIBAOUSERID is null");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridIsNotNull() {
            addCriterion("HUIBAOUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridEqualTo(String value) {
            addCriterion("HUIBAOUSERID =", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridNotEqualTo(String value) {
            addCriterion("HUIBAOUSERID <>", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridGreaterThan(String value) {
            addCriterion("HUIBAOUSERID >", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridGreaterThanOrEqualTo(String value) {
            addCriterion("HUIBAOUSERID >=", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridLessThan(String value) {
            addCriterion("HUIBAOUSERID <", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridLessThanOrEqualTo(String value) {
            addCriterion("HUIBAOUSERID <=", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridLike(String value) {
            addCriterion("HUIBAOUSERID like", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridNotLike(String value) {
            addCriterion("HUIBAOUSERID not like", value, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridIn(List<String> values) {
            addCriterion("HUIBAOUSERID in", values, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridNotIn(List<String> values) {
            addCriterion("HUIBAOUSERID not in", values, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridBetween(String value1, String value2) {
            addCriterion("HUIBAOUSERID between", value1, value2, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaouseridNotBetween(String value1, String value2) {
            addCriterion("HUIBAOUSERID not between", value1, value2, "huibaouserid");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameIsNull() {
            addCriterion("HUIBAOUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameIsNotNull() {
            addCriterion("HUIBAOUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameEqualTo(String value) {
            addCriterion("HUIBAOUSERNAME =", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameNotEqualTo(String value) {
            addCriterion("HUIBAOUSERNAME <>", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameGreaterThan(String value) {
            addCriterion("HUIBAOUSERNAME >", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameGreaterThanOrEqualTo(String value) {
            addCriterion("HUIBAOUSERNAME >=", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameLessThan(String value) {
            addCriterion("HUIBAOUSERNAME <", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameLessThanOrEqualTo(String value) {
            addCriterion("HUIBAOUSERNAME <=", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameLike(String value) {
            addCriterion("HUIBAOUSERNAME like", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameNotLike(String value) {
            addCriterion("HUIBAOUSERNAME not like", value, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameIn(List<String> values) {
            addCriterion("HUIBAOUSERNAME in", values, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameNotIn(List<String> values) {
            addCriterion("HUIBAOUSERNAME not in", values, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameBetween(String value1, String value2) {
            addCriterion("HUIBAOUSERNAME between", value1, value2, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andHuibaousernameNotBetween(String value1, String value2) {
            addCriterion("HUIBAOUSERNAME not between", value1, value2, "huibaousername");
            return (Criteria) this;
        }

        public Criteria andMainuseridIsNull() {
            addCriterion("MAINUSERID is null");
            return (Criteria) this;
        }

        public Criteria andMainuseridIsNotNull() {
            addCriterion("MAINUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andMainuseridEqualTo(String value) {
            addCriterion("MAINUSERID =", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotEqualTo(String value) {
            addCriterion("MAINUSERID <>", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridGreaterThan(String value) {
            addCriterion("MAINUSERID >", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridGreaterThanOrEqualTo(String value) {
            addCriterion("MAINUSERID >=", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridLessThan(String value) {
            addCriterion("MAINUSERID <", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridLessThanOrEqualTo(String value) {
            addCriterion("MAINUSERID <=", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridLike(String value) {
            addCriterion("MAINUSERID like", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotLike(String value) {
            addCriterion("MAINUSERID not like", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridIn(List<String> values) {
            addCriterion("MAINUSERID in", values, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotIn(List<String> values) {
            addCriterion("MAINUSERID not in", values, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridBetween(String value1, String value2) {
            addCriterion("MAINUSERID between", value1, value2, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotBetween(String value1, String value2) {
            addCriterion("MAINUSERID not between", value1, value2, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainusernameIsNull() {
            addCriterion("MAINUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMainusernameIsNotNull() {
            addCriterion("MAINUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMainusernameEqualTo(String value) {
            addCriterion("MAINUSERNAME =", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameNotEqualTo(String value) {
            addCriterion("MAINUSERNAME <>", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameGreaterThan(String value) {
            addCriterion("MAINUSERNAME >", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameGreaterThanOrEqualTo(String value) {
            addCriterion("MAINUSERNAME >=", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameLessThan(String value) {
            addCriterion("MAINUSERNAME <", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameLessThanOrEqualTo(String value) {
            addCriterion("MAINUSERNAME <=", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameLike(String value) {
            addCriterion("MAINUSERNAME like", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameNotLike(String value) {
            addCriterion("MAINUSERNAME not like", value, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameIn(List<String> values) {
            addCriterion("MAINUSERNAME in", values, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameNotIn(List<String> values) {
            addCriterion("MAINUSERNAME not in", values, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameBetween(String value1, String value2) {
            addCriterion("MAINUSERNAME between", value1, value2, "mainusername");
            return (Criteria) this;
        }

        public Criteria andMainusernameNotBetween(String value1, String value2) {
            addCriterion("MAINUSERNAME not between", value1, value2, "mainusername");
            return (Criteria) this;
        }

        public Criteria andWjljIsNull() {
            addCriterion("WJLJ is null");
            return (Criteria) this;
        }

        public Criteria andWjljIsNotNull() {
            addCriterion("WJLJ is not null");
            return (Criteria) this;
        }

        public Criteria andWjljEqualTo(String value) {
            addCriterion("WJLJ =", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotEqualTo(String value) {
            addCriterion("WJLJ <>", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljGreaterThan(String value) {
            addCriterion("WJLJ >", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljGreaterThanOrEqualTo(String value) {
            addCriterion("WJLJ >=", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljLessThan(String value) {
            addCriterion("WJLJ <", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljLessThanOrEqualTo(String value) {
            addCriterion("WJLJ <=", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljLike(String value) {
            addCriterion("WJLJ like", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotLike(String value) {
            addCriterion("WJLJ not like", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljIn(List<String> values) {
            addCriterion("WJLJ in", values, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotIn(List<String> values) {
            addCriterion("WJLJ not in", values, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljBetween(String value1, String value2) {
            addCriterion("WJLJ between", value1, value2, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotBetween(String value1, String value2) {
            addCriterion("WJLJ not between", value1, value2, "wjlj");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andOpemidIsNull() {
            addCriterion("OPEMID is null");
            return (Criteria) this;
        }

        public Criteria andOpemidIsNotNull() {
            addCriterion("OPEMID is not null");
            return (Criteria) this;
        }

        public Criteria andOpemidEqualTo(String value) {
            addCriterion("OPEMID =", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotEqualTo(String value) {
            addCriterion("OPEMID <>", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidGreaterThan(String value) {
            addCriterion("OPEMID >", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidGreaterThanOrEqualTo(String value) {
            addCriterion("OPEMID >=", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidLessThan(String value) {
            addCriterion("OPEMID <", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidLessThanOrEqualTo(String value) {
            addCriterion("OPEMID <=", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidLike(String value) {
            addCriterion("OPEMID like", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotLike(String value) {
            addCriterion("OPEMID not like", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidIn(List<String> values) {
            addCriterion("OPEMID in", values, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotIn(List<String> values) {
            addCriterion("OPEMID not in", values, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidBetween(String value1, String value2) {
            addCriterion("OPEMID between", value1, value2, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotBetween(String value1, String value2) {
            addCriterion("OPEMID not between", value1, value2, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemnameIsNull() {
            addCriterion("OPEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpemnameIsNotNull() {
            addCriterion("OPEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpemnameEqualTo(String value) {
            addCriterion("OPEMNAME =", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotEqualTo(String value) {
            addCriterion("OPEMNAME <>", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameGreaterThan(String value) {
            addCriterion("OPEMNAME >", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPEMNAME >=", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameLessThan(String value) {
            addCriterion("OPEMNAME <", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameLessThanOrEqualTo(String value) {
            addCriterion("OPEMNAME <=", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameLike(String value) {
            addCriterion("OPEMNAME like", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotLike(String value) {
            addCriterion("OPEMNAME not like", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameIn(List<String> values) {
            addCriterion("OPEMNAME in", values, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotIn(List<String> values) {
            addCriterion("OPEMNAME not in", values, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameBetween(String value1, String value2) {
            addCriterion("OPEMNAME between", value1, value2, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotBetween(String value1, String value2) {
            addCriterion("OPEMNAME not between", value1, value2, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemdateIsNull() {
            addCriterion("OPEMDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpemdateIsNotNull() {
            addCriterion("OPEMDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpemdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPEMDATE =", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPEMDATE <>", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPEMDATE >", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPEMDATE >=", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateLessThan(Date value) {
            addCriterionForJDBCDate("OPEMDATE <", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPEMDATE <=", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPEMDATE in", values, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPEMDATE not in", values, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPEMDATE between", value1, value2, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPEMDATE not between", value1, value2, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateEqualTo(Timestamp value) {
            addCriterion("OPEMDATE =", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateNotEqualTo(Timestamp value) {
            addCriterion("OPEMDATE <>", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateGreaterThan(Timestamp value) {
            addCriterion("OPEMDATE >", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("OPEMDATE >=", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateLessThan(Timestamp value) {
            addCriterion("OPEMDATE <", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("OPEMDATE <=", value, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPEMDATE between", value1, value2, "opemdate");
            return (Criteria) this;
        }

        public Criteria andOpemdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPEMDATE not between", value1, value2, "opemdate");
            return (Criteria) this;
        }

        public Criteria andSpemidIsNull() {
            addCriterion("SPEMID is null");
            return (Criteria) this;
        }

        public Criteria andSpemidIsNotNull() {
            addCriterion("SPEMID is not null");
            return (Criteria) this;
        }

        public Criteria andSpemidEqualTo(String value) {
            addCriterion("SPEMID =", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotEqualTo(String value) {
            addCriterion("SPEMID <>", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidGreaterThan(String value) {
            addCriterion("SPEMID >", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidGreaterThanOrEqualTo(String value) {
            addCriterion("SPEMID >=", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidLessThan(String value) {
            addCriterion("SPEMID <", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidLessThanOrEqualTo(String value) {
            addCriterion("SPEMID <=", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidLike(String value) {
            addCriterion("SPEMID like", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotLike(String value) {
            addCriterion("SPEMID not like", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidIn(List<String> values) {
            addCriterion("SPEMID in", values, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotIn(List<String> values) {
            addCriterion("SPEMID not in", values, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidBetween(String value1, String value2) {
            addCriterion("SPEMID between", value1, value2, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotBetween(String value1, String value2) {
            addCriterion("SPEMID not between", value1, value2, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemnameIsNull() {
            addCriterion("SPEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andSpemnameIsNotNull() {
            addCriterion("SPEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpemnameEqualTo(String value) {
            addCriterion("SPEMNAME =", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameNotEqualTo(String value) {
            addCriterion("SPEMNAME <>", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameGreaterThan(String value) {
            addCriterion("SPEMNAME >", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameGreaterThanOrEqualTo(String value) {
            addCriterion("SPEMNAME >=", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameLessThan(String value) {
            addCriterion("SPEMNAME <", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameLessThanOrEqualTo(String value) {
            addCriterion("SPEMNAME <=", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameLike(String value) {
            addCriterion("SPEMNAME like", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameNotLike(String value) {
            addCriterion("SPEMNAME not like", value, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameIn(List<String> values) {
            addCriterion("SPEMNAME in", values, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameNotIn(List<String> values) {
            addCriterion("SPEMNAME not in", values, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameBetween(String value1, String value2) {
            addCriterion("SPEMNAME between", value1, value2, "spemname");
            return (Criteria) this;
        }

        public Criteria andSpemnameNotBetween(String value1, String value2) {
            addCriterion("SPEMNAME not between", value1, value2, "spemname");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("UPTIME is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("UPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterionForJDBCDate("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPTIME in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPTIME not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPTIME not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Timestamp value) {
            addCriterion("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Timestamp value) {
            addCriterion("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Timestamp value) {
            addCriterion("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Timestamp value) {
            addCriterion("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPTIME not between", value1, value2, "uptime");
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

        public Criteria andRemark7IsNull() {
            addCriterion("REMARK7 is null");
            return (Criteria) this;
        }

        public Criteria andRemark7IsNotNull() {
            addCriterion("REMARK7 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark7EqualTo(String value) {
            addCriterion("REMARK7 =", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotEqualTo(String value) {
            addCriterion("REMARK7 <>", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7GreaterThan(String value) {
            addCriterion("REMARK7 >", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK7 >=", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7LessThan(String value) {
            addCriterion("REMARK7 <", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7LessThanOrEqualTo(String value) {
            addCriterion("REMARK7 <=", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7Like(String value) {
            addCriterion("REMARK7 like", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotLike(String value) {
            addCriterion("REMARK7 not like", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7In(List<String> values) {
            addCriterion("REMARK7 in", values, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotIn(List<String> values) {
            addCriterion("REMARK7 not in", values, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7Between(String value1, String value2) {
            addCriterion("REMARK7 between", value1, value2, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotBetween(String value1, String value2) {
            addCriterion("REMARK7 not between", value1, value2, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark8IsNull() {
            addCriterion("REMARK8 is null");
            return (Criteria) this;
        }

        public Criteria andRemark8IsNotNull() {
            addCriterion("REMARK8 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark8EqualTo(String value) {
            addCriterion("REMARK8 =", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotEqualTo(String value) {
            addCriterion("REMARK8 <>", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8GreaterThan(String value) {
            addCriterion("REMARK8 >", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK8 >=", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8LessThan(String value) {
            addCriterion("REMARK8 <", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8LessThanOrEqualTo(String value) {
            addCriterion("REMARK8 <=", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8Like(String value) {
            addCriterion("REMARK8 like", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotLike(String value) {
            addCriterion("REMARK8 not like", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8In(List<String> values) {
            addCriterion("REMARK8 in", values, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotIn(List<String> values) {
            addCriterion("REMARK8 not in", values, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8Between(String value1, String value2) {
            addCriterion("REMARK8 between", value1, value2, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotBetween(String value1, String value2) {
            addCriterion("REMARK8 not between", value1, value2, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark9IsNull() {
            addCriterion("REMARK9 is null");
            return (Criteria) this;
        }

        public Criteria andRemark9IsNotNull() {
            addCriterion("REMARK9 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark9EqualTo(String value) {
            addCriterion("REMARK9 =", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotEqualTo(String value) {
            addCriterion("REMARK9 <>", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9GreaterThan(String value) {
            addCriterion("REMARK9 >", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK9 >=", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9LessThan(String value) {
            addCriterion("REMARK9 <", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9LessThanOrEqualTo(String value) {
            addCriterion("REMARK9 <=", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9Like(String value) {
            addCriterion("REMARK9 like", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotLike(String value) {
            addCriterion("REMARK9 not like", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9In(List<String> values) {
            addCriterion("REMARK9 in", values, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotIn(List<String> values) {
            addCriterion("REMARK9 not in", values, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9Between(String value1, String value2) {
            addCriterion("REMARK9 between", value1, value2, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotBetween(String value1, String value2) {
            addCriterion("REMARK9 not between", value1, value2, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark10IsNull() {
            addCriterion("REMARK10 is null");
            return (Criteria) this;
        }

        public Criteria andRemark10IsNotNull() {
            addCriterion("REMARK10 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark10EqualTo(String value) {
            addCriterion("REMARK10 =", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotEqualTo(String value) {
            addCriterion("REMARK10 <>", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10GreaterThan(String value) {
            addCriterion("REMARK10 >", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK10 >=", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10LessThan(String value) {
            addCriterion("REMARK10 <", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10LessThanOrEqualTo(String value) {
            addCriterion("REMARK10 <=", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10Like(String value) {
            addCriterion("REMARK10 like", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotLike(String value) {
            addCriterion("REMARK10 not like", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10In(List<String> values) {
            addCriterion("REMARK10 in", values, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotIn(List<String> values) {
            addCriterion("REMARK10 not in", values, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10Between(String value1, String value2) {
            addCriterion("REMARK10 between", value1, value2, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotBetween(String value1, String value2) {
            addCriterion("REMARK10 not between", value1, value2, "remark10");
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