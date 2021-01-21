package com.saint.wechat.manager.sqlWhere;

import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.pub.plugin.Page;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名XF_STUDY_REGISTRATION
*表说明打卡记录
  */
public class XfStudyRegistrationSqlWhere extends XfStudyRegistrationEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfStudyRegistrationSqlWhere() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String string) {
            addCriterion("COURSE_ID =", string, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(BigDecimal value) {
            addCriterion("COURSE_ID >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(BigDecimal value) {
            addCriterion("COURSE_ID <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<BigDecimal> values) {
            addCriterion("COURSE_ID in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<BigDecimal> values) {
            addCriterion("COURSE_ID not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_ID between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_ID not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNull() {
            addCriterion("EMP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNotNull() {
            addCriterion("EMP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberEqualTo(String value) {
            addCriterion("EMP_NUMBER =", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotEqualTo(String value) {
            addCriterion("EMP_NUMBER <>", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThan(String value) {
            addCriterion("EMP_NUMBER >", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NUMBER >=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThan(String value) {
            addCriterion("EMP_NUMBER <", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThanOrEqualTo(String value) {
            addCriterion("EMP_NUMBER <=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLike(String value) {
            addCriterion("EMP_NUMBER like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotLike(String value) {
            addCriterion("EMP_NUMBER not like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIn(List<String> values) {
            addCriterion("EMP_NUMBER in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotIn(List<String> values) {
            addCriterion("EMP_NUMBER not in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberBetween(String value1, String value2) {
            addCriterion("EMP_NUMBER between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotBetween(String value1, String value2) {
            addCriterion("EMP_NUMBER not between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(BigDecimal value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(BigDecimal value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<BigDecimal> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<BigDecimal> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("COURSE_NAME =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("COURSE_NAME <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("COURSE_NAME >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("COURSE_NAME <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("COURSE_NAME like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("COURSE_NAME not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("COURSE_NAME in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("COURSE_NAME not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("COURSE_NAME between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_NAME not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNull() {
            addCriterion("PLACE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("PLACE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("PLACE_NAME =", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("PLACE_NAME <>", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("PLACE_NAME >", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE_NAME >=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("PLACE_NAME <", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("PLACE_NAME <=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("PLACE_NAME like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("PLACE_NAME not like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("PLACE_NAME in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("PLACE_NAME not in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("PLACE_NAME between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("PLACE_NAME not between", value1, value2, "placeName");
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

        public Criteria andDakaTimeIsNull() {
            addCriterion("DAKA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDakaTimeIsNotNull() {
            addCriterion("DAKA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDakaTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DAKA_TIME =", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DAKA_TIME <>", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DAKA_TIME >", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DAKA_TIME >=", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeLessThan(Date value) {
            addCriterionForJDBCDate("DAKA_TIME <", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DAKA_TIME <=", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DAKA_TIME in", values, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DAKA_TIME not in", values, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DAKA_TIME between", value1, value2, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DAKA_TIME not between", value1, value2, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeEqualTo(Timestamp value) {
            addCriterion("DAKA_TIME =", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeNotEqualTo(Timestamp value) {
            addCriterion("DAKA_TIME <>", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeGreaterThan(Timestamp value) {
            addCriterion("DAKA_TIME >", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DAKA_TIME >=", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeLessThan(Timestamp value) {
            addCriterion("DAKA_TIME <", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("DAKA_TIME <=", value, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DAKA_TIME between", value1, value2, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andDakaTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DAKA_TIME not between", value1, value2, "dakaTime");
            return (Criteria) this;
        }

        public Criteria andAddYearIsNull() {
            addCriterion("ADD_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andAddYearIsNotNull() {
            addCriterion("ADD_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andAddYearEqualTo(String value) {
            addCriterion("ADD_YEAR =", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotEqualTo(String value) {
            addCriterion("ADD_YEAR <>", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearGreaterThan(String value) {
            addCriterion("ADD_YEAR >", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_YEAR >=", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearLessThan(String value) {
            addCriterion("ADD_YEAR <", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearLessThanOrEqualTo(String value) {
            addCriterion("ADD_YEAR <=", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearLike(String value) {
            addCriterion("ADD_YEAR like", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotLike(String value) {
            addCriterion("ADD_YEAR not like", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearIn(List<String> values) {
            addCriterion("ADD_YEAR in", values, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotIn(List<String> values) {
            addCriterion("ADD_YEAR not in", values, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearBetween(String value1, String value2) {
            addCriterion("ADD_YEAR between", value1, value2, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotBetween(String value1, String value2) {
            addCriterion("ADD_YEAR not between", value1, value2, "addYear");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("ISVALID is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("ISVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Long value) {
            addCriterion("ISVALID =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Long value) {
            addCriterion("ISVALID <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Long value) {
            addCriterion("ISVALID >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Long value) {
            addCriterion("ISVALID >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Long value) {
            addCriterion("ISVALID <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Long value) {
            addCriterion("ISVALID <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Long> values) {
            addCriterion("ISVALID in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Long> values) {
            addCriterion("ISVALID not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Long value1, Long value2) {
            addCriterion("ISVALID between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Long value1, Long value2) {
            addCriterion("ISVALID not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsgrantIsNull() {
            addCriterion("ISGRANT is null");
            return (Criteria) this;
        }

        public Criteria andIsgrantIsNotNull() {
            addCriterion("ISGRANT is not null");
            return (Criteria) this;
        }

        public Criteria andIsgrantEqualTo(String string) {
            addCriterion("ISGRANT =", string, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantNotEqualTo(Long value) {
            addCriterion("ISGRANT <>", value, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantGreaterThan(Long value) {
            addCriterion("ISGRANT >", value, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantGreaterThanOrEqualTo(Long value) {
            addCriterion("ISGRANT >=", value, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantLessThan(Long value) {
            addCriterion("ISGRANT <", value, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantLessThanOrEqualTo(Long value) {
            addCriterion("ISGRANT <=", value, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantIn(List<Long> values) {
            addCriterion("ISGRANT in", values, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantNotIn(List<Long> values) {
            addCriterion("ISGRANT not in", values, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantBetween(Long value1, Long value2) {
            addCriterion("ISGRANT between", value1, value2, "isgrant");
            return (Criteria) this;
        }

        public Criteria andIsgrantNotBetween(Long value1, Long value2) {
            addCriterion("ISGRANT not between", value1, value2, "isgrant");
            return (Criteria) this;
        }

        public Criteria andAwardstateIsNull() {
            addCriterion("AWARDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAwardstateIsNotNull() {
            addCriterion("AWARDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAwardstateEqualTo(String value) {
            addCriterion("AWARDSTATE =", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateNotEqualTo(String value) {
            addCriterion("AWARDSTATE <>", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateGreaterThan(String value) {
            addCriterion("AWARDSTATE >", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateGreaterThanOrEqualTo(String value) {
            addCriterion("AWARDSTATE >=", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateLessThan(String value) {
            addCriterion("AWARDSTATE <", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateLessThanOrEqualTo(String value) {
            addCriterion("AWARDSTATE <=", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateLike(String value) {
            addCriterion("AWARDSTATE like", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateNotLike(String value) {
            addCriterion("AWARDSTATE not like", value, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateIn(List<String> values) {
            addCriterion("AWARDSTATE in", values, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateNotIn(List<String> values) {
            addCriterion("AWARDSTATE not in", values, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateBetween(String value1, String value2) {
            addCriterion("AWARDSTATE between", value1, value2, "awardstate");
            return (Criteria) this;
        }

        public Criteria andAwardstateNotBetween(String value1, String value2) {
            addCriterion("AWARDSTATE not between", value1, value2, "awardstate");
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

        public Criteria andGxsjIsNull() {
            addCriterion("GXSJ is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("GXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterionForJDBCDate("GXSJ >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterionForJDBCDate("GXSJ <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterionForJDBCDate("GXSJ in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("GXSJ not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GXSJ between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GXSJ not between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Timestamp value) {
            addCriterion("GXSJ =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Timestamp value) {
            addCriterion("GXSJ <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Timestamp value) {
            addCriterion("GXSJ >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("GXSJ >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Timestamp value) {
            addCriterion("GXSJ <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("GXSJ <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GXSJ between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GXSJ not between", value1, value2, "gxsj");
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