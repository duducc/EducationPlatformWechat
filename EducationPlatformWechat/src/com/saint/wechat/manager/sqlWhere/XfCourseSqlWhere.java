package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfCourseEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XfCourseSqlWhere extends XfCourseEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfCourseSqlWhere() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("COURSE_ID =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("COURSE_ID <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("COURSE_ID >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_ID >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("COURSE_ID <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("COURSE_ID <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("COURSE_ID like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("COURSE_ID not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("COURSE_ID in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("COURSE_ID not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("COURSE_ID between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("COURSE_ID not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("PRO_ID like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("PRO_ID not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("ACTIVITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("ACTIVITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("ACTIVITY_ID =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("ACTIVITY_ID <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("ACTIVITY_ID >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("ACTIVITY_ID <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("ACTIVITY_ID like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("ACTIVITY_ID not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("ACTIVITY_ID in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("ACTIVITY_ID not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID not between", value1, value2, "activityId");
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

        public Criteria andTeacherTitleIsNull() {
            addCriterion("TEACHER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNotNull() {
            addCriterion("TEACHER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleEqualTo(String value) {
            addCriterion("TEACHER_TITLE =", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotEqualTo(String value) {
            addCriterion("TEACHER_TITLE <>", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThan(String value) {
            addCriterion("TEACHER_TITLE >", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_TITLE >=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThan(String value) {
            addCriterion("TEACHER_TITLE <", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_TITLE <=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLike(String value) {
            addCriterion("TEACHER_TITLE like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotLike(String value) {
            addCriterion("TEACHER_TITLE not like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIn(List<String> values) {
            addCriterion("TEACHER_TITLE in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotIn(List<String> values) {
            addCriterion("TEACHER_TITLE not in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleBetween(String value1, String value2) {
            addCriterion("TEACHER_TITLE between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotBetween(String value1, String value2) {
            addCriterion("TEACHER_TITLE not between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionIsNull() {
            addCriterion("TEACHER_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionIsNotNull() {
            addCriterion("TEACHER_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionEqualTo(String value) {
            addCriterion("TEACHER_DIRECTION =", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionNotEqualTo(String value) {
            addCriterion("TEACHER_DIRECTION <>", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionGreaterThan(String value) {
            addCriterion("TEACHER_DIRECTION >", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_DIRECTION >=", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionLessThan(String value) {
            addCriterion("TEACHER_DIRECTION <", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_DIRECTION <=", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionLike(String value) {
            addCriterion("TEACHER_DIRECTION like", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionNotLike(String value) {
            addCriterion("TEACHER_DIRECTION not like", value, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionIn(List<String> values) {
            addCriterion("TEACHER_DIRECTION in", values, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionNotIn(List<String> values) {
            addCriterion("TEACHER_DIRECTION not in", values, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionBetween(String value1, String value2) {
            addCriterion("TEACHER_DIRECTION between", value1, value2, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherDirectionNotBetween(String value1, String value2) {
            addCriterion("TEACHER_DIRECTION not between", value1, value2, "teacherDirection");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitIsNull() {
            addCriterion("TEACHER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitIsNotNull() {
            addCriterion("TEACHER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitEqualTo(String value) {
            addCriterion("TEACHER_UNIT =", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitNotEqualTo(String value) {
            addCriterion("TEACHER_UNIT <>", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitGreaterThan(String value) {
            addCriterion("TEACHER_UNIT >", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_UNIT >=", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitLessThan(String value) {
            addCriterion("TEACHER_UNIT <", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_UNIT <=", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitLike(String value) {
            addCriterion("TEACHER_UNIT like", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitNotLike(String value) {
            addCriterion("TEACHER_UNIT not like", value, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitIn(List<String> values) {
            addCriterion("TEACHER_UNIT in", values, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitNotIn(List<String> values) {
            addCriterion("TEACHER_UNIT not in", values, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitBetween(String value1, String value2) {
            addCriterion("TEACHER_UNIT between", value1, value2, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andTeacherUnitNotBetween(String value1, String value2) {
            addCriterion("TEACHER_UNIT not between", value1, value2, "teacherUnit");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskIsNull() {
            addCriterion("COURSES_TASK is null");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskIsNotNull() {
            addCriterion("COURSES_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskEqualTo(String value) {
            addCriterion("COURSES_TASK =", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskNotEqualTo(String value) {
            addCriterion("COURSES_TASK <>", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskGreaterThan(String value) {
            addCriterion("COURSES_TASK >", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskGreaterThanOrEqualTo(String value) {
            addCriterion("COURSES_TASK >=", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskLessThan(String value) {
            addCriterion("COURSES_TASK <", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskLessThanOrEqualTo(String value) {
            addCriterion("COURSES_TASK <=", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskLike(String value) {
            addCriterion("COURSES_TASK like", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskNotLike(String value) {
            addCriterion("COURSES_TASK not like", value, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskIn(List<String> values) {
            addCriterion("COURSES_TASK in", values, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskNotIn(List<String> values) {
            addCriterion("COURSES_TASK not in", values, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskBetween(String value1, String value2) {
            addCriterion("COURSES_TASK between", value1, value2, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesTaskNotBetween(String value1, String value2) {
            addCriterion("COURSES_TASK not between", value1, value2, "coursesTask");
            return (Criteria) this;
        }

        public Criteria andCoursesContentIsNull() {
            addCriterion("COURSES_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCoursesContentIsNotNull() {
            addCriterion("COURSES_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesContentEqualTo(String value) {
            addCriterion("COURSES_CONTENT =", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentNotEqualTo(String value) {
            addCriterion("COURSES_CONTENT <>", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentGreaterThan(String value) {
            addCriterion("COURSES_CONTENT >", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentGreaterThanOrEqualTo(String value) {
            addCriterion("COURSES_CONTENT >=", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentLessThan(String value) {
            addCriterion("COURSES_CONTENT <", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentLessThanOrEqualTo(String value) {
            addCriterion("COURSES_CONTENT <=", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentLike(String value) {
            addCriterion("COURSES_CONTENT like", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentNotLike(String value) {
            addCriterion("COURSES_CONTENT not like", value, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentIn(List<String> values) {
            addCriterion("COURSES_CONTENT in", values, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentNotIn(List<String> values) {
            addCriterion("COURSES_CONTENT not in", values, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentBetween(String value1, String value2) {
            addCriterion("COURSES_CONTENT between", value1, value2, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCoursesContentNotBetween(String value1, String value2) {
            addCriterion("COURSES_CONTENT not between", value1, value2, "coursesContent");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(BigDecimal value) {
            addCriterion("CREDIT =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(BigDecimal value) {
            addCriterion("CREDIT <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(BigDecimal value) {
            addCriterion("CREDIT >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(BigDecimal value) {
            addCriterion("CREDIT <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<BigDecimal> values) {
            addCriterion("CREDIT in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<BigDecimal> values) {
            addCriterion("CREDIT not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("HOURS is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Long value) {
            addCriterion("HOURS =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Long value) {
            addCriterion("HOURS <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Long value) {
            addCriterion("HOURS >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Long value) {
            addCriterion("HOURS >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Long value) {
            addCriterion("HOURS <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Long value) {
            addCriterion("HOURS <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Long> values) {
            addCriterion("HOURS in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Long> values) {
            addCriterion("HOURS not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Long value1, Long value2) {
            addCriterion("HOURS between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Long value1, Long value2) {
            addCriterion("HOURS not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeIsNull() {
            addCriterion("COURSES_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeIsNotNull() {
            addCriterion("COURSES_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeEqualTo(String value) {
            addCriterion("COURSES_TYPE =", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeNotEqualTo(String value) {
            addCriterion("COURSES_TYPE <>", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeGreaterThan(String value) {
            addCriterion("COURSES_TYPE >", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSES_TYPE >=", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeLessThan(String value) {
            addCriterion("COURSES_TYPE <", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeLessThanOrEqualTo(String value) {
            addCriterion("COURSES_TYPE <=", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeLike(String value) {
            addCriterion("COURSES_TYPE like", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeNotLike(String value) {
            addCriterion("COURSES_TYPE not like", value, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeIn(List<String> values) {
            addCriterion("COURSES_TYPE in", values, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeNotIn(List<String> values) {
            addCriterion("COURSES_TYPE not in", values, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeBetween(String value1, String value2) {
            addCriterion("COURSES_TYPE between", value1, value2, "coursesType");
            return (Criteria) this;
        }

        public Criteria andCoursesTypeNotBetween(String value1, String value2) {
            addCriterion("COURSES_TYPE not between", value1, value2, "coursesType");
            return (Criteria) this;
        }

        public Criteria andIsdownloadIsNull() {
            addCriterion("ISDOWNLOAD is null");
            return (Criteria) this;
        }

        public Criteria andIsdownloadIsNotNull() {
            addCriterion("ISDOWNLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andIsdownloadEqualTo(String value) {
            addCriterion("ISDOWNLOAD =", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadNotEqualTo(String value) {
            addCriterion("ISDOWNLOAD <>", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadGreaterThan(String value) {
            addCriterion("ISDOWNLOAD >", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadGreaterThanOrEqualTo(String value) {
            addCriterion("ISDOWNLOAD >=", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadLessThan(String value) {
            addCriterion("ISDOWNLOAD <", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadLessThanOrEqualTo(String value) {
            addCriterion("ISDOWNLOAD <=", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadLike(String value) {
            addCriterion("ISDOWNLOAD like", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadNotLike(String value) {
            addCriterion("ISDOWNLOAD not like", value, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadIn(List<String> values) {
            addCriterion("ISDOWNLOAD in", values, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadNotIn(List<String> values) {
            addCriterion("ISDOWNLOAD not in", values, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadBetween(String value1, String value2) {
            addCriterion("ISDOWNLOAD between", value1, value2, "isdownload");
            return (Criteria) this;
        }

        public Criteria andIsdownloadNotBetween(String value1, String value2) {
            addCriterion("ISDOWNLOAD not between", value1, value2, "isdownload");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("METHOD is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("METHOD =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("METHOD <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("METHOD >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("METHOD <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("METHOD <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("METHOD like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("METHOD not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("METHOD in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("METHOD not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("METHOD between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("METHOD not between", value1, value2, "method");
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

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
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

        public Criteria andIsbeginIsNull() {
            addCriterion("ISBEGIN is null");
            return (Criteria) this;
        }

        public Criteria andIsbeginIsNotNull() {
            addCriterion("ISBEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbeginEqualTo(String value) {
            addCriterion("ISBEGIN =", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginNotEqualTo(String value) {
            addCriterion("ISBEGIN <>", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginGreaterThan(String value) {
            addCriterion("ISBEGIN >", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginGreaterThanOrEqualTo(String value) {
            addCriterion("ISBEGIN >=", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginLessThan(String value) {
            addCriterion("ISBEGIN <", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginLessThanOrEqualTo(String value) {
            addCriterion("ISBEGIN <=", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginLike(String value) {
            addCriterion("ISBEGIN like", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginNotLike(String value) {
            addCriterion("ISBEGIN not like", value, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginIn(List<String> values) {
            addCriterion("ISBEGIN in", values, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginNotIn(List<String> values) {
            addCriterion("ISBEGIN not in", values, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginBetween(String value1, String value2) {
            addCriterion("ISBEGIN between", value1, value2, "isbegin");
            return (Criteria) this;
        }

        public Criteria andIsbeginNotBetween(String value1, String value2) {
            addCriterion("ISBEGIN not between", value1, value2, "isbegin");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Timestamp value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Timestamp value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Timestamp value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Timestamp value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Timestamp value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Timestamp value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Timestamp value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Timestamp value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("VALID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("VALID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(String value) {
            addCriterion("VALID_TIME =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(String value) {
            addCriterion("VALID_TIME <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(String value) {
            addCriterion("VALID_TIME >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_TIME >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(String value) {
            addCriterion("VALID_TIME <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(String value) {
            addCriterion("VALID_TIME <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLike(String value) {
            addCriterion("VALID_TIME like", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotLike(String value) {
            addCriterion("VALID_TIME not like", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<String> values) {
            addCriterion("VALID_TIME in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<String> values) {
            addCriterion("VALID_TIME not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(String value1, String value2) {
            addCriterion("VALID_TIME between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(String value1, String value2) {
            addCriterion("VALID_TIME not between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andCheckNumberIsNull() {
            addCriterion("CHECK_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCheckNumberIsNotNull() {
            addCriterion("CHECK_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNumberEqualTo(BigDecimal value) {
            addCriterion("CHECK_NUMBER =", value, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberNotEqualTo(BigDecimal value) {
            addCriterion("CHECK_NUMBER <>", value, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberGreaterThan(BigDecimal value) {
            addCriterion("CHECK_NUMBER >", value, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECK_NUMBER >=", value, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberLessThan(BigDecimal value) {
            addCriterion("CHECK_NUMBER <", value, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECK_NUMBER <=", value, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberIn(List<BigDecimal> values) {
            addCriterion("CHECK_NUMBER in", values, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberNotIn(List<BigDecimal> values) {
            addCriterion("CHECK_NUMBER not in", values, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECK_NUMBER between", value1, value2, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andCheckNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECK_NUMBER not between", value1, value2, "checkNumber");
            return (Criteria) this;
        }

        public Criteria andAutoCheckIsNull() {
            addCriterion("AUTO_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andAutoCheckIsNotNull() {
            addCriterion("AUTO_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCheckEqualTo(String value) {
            addCriterion("AUTO_CHECK =", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotEqualTo(String value) {
            addCriterion("AUTO_CHECK <>", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckGreaterThan(String value) {
            addCriterion("AUTO_CHECK >", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_CHECK >=", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckLessThan(String value) {
            addCriterion("AUTO_CHECK <", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckLessThanOrEqualTo(String value) {
            addCriterion("AUTO_CHECK <=", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckLike(String value) {
            addCriterion("AUTO_CHECK like", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotLike(String value) {
            addCriterion("AUTO_CHECK not like", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckIn(List<String> values) {
            addCriterion("AUTO_CHECK in", values, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotIn(List<String> values) {
            addCriterion("AUTO_CHECK not in", values, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckBetween(String value1, String value2) {
            addCriterion("AUTO_CHECK between", value1, value2, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotBetween(String value1, String value2) {
            addCriterion("AUTO_CHECK not between", value1, value2, "autoCheck");
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

        public Criteria andEduObjCountIsNull() {
            addCriterion("EDU_OBJ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andEduObjCountIsNotNull() {
            addCriterion("EDU_OBJ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEduObjCountEqualTo(Long value) {
            addCriterion("EDU_OBJ_COUNT =", value, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountNotEqualTo(Long value) {
            addCriterion("EDU_OBJ_COUNT <>", value, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountGreaterThan(Long value) {
            addCriterion("EDU_OBJ_COUNT >", value, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountGreaterThanOrEqualTo(Long value) {
            addCriterion("EDU_OBJ_COUNT >=", value, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountLessThan(Long value) {
            addCriterion("EDU_OBJ_COUNT <", value, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountLessThanOrEqualTo(Long value) {
            addCriterion("EDU_OBJ_COUNT <=", value, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountIn(List<Long> values) {
            addCriterion("EDU_OBJ_COUNT in", values, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountNotIn(List<Long> values) {
            addCriterion("EDU_OBJ_COUNT not in", values, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountBetween(Long value1, Long value2) {
            addCriterion("EDU_OBJ_COUNT between", value1, value2, "eduObjCount");
            return (Criteria) this;
        }

        public Criteria andEduObjCountNotBetween(Long value1, Long value2) {
            addCriterion("EDU_OBJ_COUNT not between", value1, value2, "eduObjCount");
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