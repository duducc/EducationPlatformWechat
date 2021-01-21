package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名XF_COURSE_TICKLING
*表说明课程信息学员反馈
  */
public class XfCourseTicklingSqlWhere extends XfCourseTicklingEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfCourseTicklingSqlWhere() {
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

        public Criteria andProidIsNull() {
            addCriterion("PROID is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("PROID is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("PROID =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("PROID <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("PROID >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("PROID >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("PROID <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("PROID <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("PROID like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("PROID not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("PROID in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("PROID not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("PROID between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("PROID not between", value1, value2, "proid");
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

        public Criteria andHoldunitIsNull() {
            addCriterion("HOLDUNIT is null");
            return (Criteria) this;
        }

        public Criteria andHoldunitIsNotNull() {
            addCriterion("HOLDUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andHoldunitEqualTo(String value) {
            addCriterion("HOLDUNIT =", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitNotEqualTo(String value) {
            addCriterion("HOLDUNIT <>", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitGreaterThan(String value) {
            addCriterion("HOLDUNIT >", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDUNIT >=", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitLessThan(String value) {
            addCriterion("HOLDUNIT <", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitLessThanOrEqualTo(String value) {
            addCriterion("HOLDUNIT <=", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitLike(String value) {
            addCriterion("HOLDUNIT like", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitNotLike(String value) {
            addCriterion("HOLDUNIT not like", value, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitIn(List<String> values) {
            addCriterion("HOLDUNIT in", values, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitNotIn(List<String> values) {
            addCriterion("HOLDUNIT not in", values, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitBetween(String value1, String value2) {
            addCriterion("HOLDUNIT between", value1, value2, "holdunit");
            return (Criteria) this;
        }

        public Criteria andHoldunitNotBetween(String value1, String value2) {
            addCriterion("HOLDUNIT not between", value1, value2, "holdunit");
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

        public Criteria andSubjectoneIsNull() {
            addCriterion("SUBJECTONE is null");
            return (Criteria) this;
        }

        public Criteria andSubjectoneIsNotNull() {
            addCriterion("SUBJECTONE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectoneEqualTo(String value) {
            addCriterion("SUBJECTONE =", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneNotEqualTo(String value) {
            addCriterion("SUBJECTONE <>", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneGreaterThan(String value) {
            addCriterion("SUBJECTONE >", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTONE >=", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneLessThan(String value) {
            addCriterion("SUBJECTONE <", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTONE <=", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneLike(String value) {
            addCriterion("SUBJECTONE like", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneNotLike(String value) {
            addCriterion("SUBJECTONE not like", value, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneIn(List<String> values) {
            addCriterion("SUBJECTONE in", values, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneNotIn(List<String> values) {
            addCriterion("SUBJECTONE not in", values, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneBetween(String value1, String value2) {
            addCriterion("SUBJECTONE between", value1, value2, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjectoneNotBetween(String value1, String value2) {
            addCriterion("SUBJECTONE not between", value1, value2, "subjectone");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoIsNull() {
            addCriterion("SUBJECTTWO is null");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoIsNotNull() {
            addCriterion("SUBJECTTWO is not null");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoEqualTo(String value) {
            addCriterion("SUBJECTTWO =", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoNotEqualTo(String value) {
            addCriterion("SUBJECTTWO <>", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoGreaterThan(String value) {
            addCriterion("SUBJECTTWO >", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTTWO >=", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoLessThan(String value) {
            addCriterion("SUBJECTTWO <", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTTWO <=", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoLike(String value) {
            addCriterion("SUBJECTTWO like", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoNotLike(String value) {
            addCriterion("SUBJECTTWO not like", value, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoIn(List<String> values) {
            addCriterion("SUBJECTTWO in", values, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoNotIn(List<String> values) {
            addCriterion("SUBJECTTWO not in", values, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoBetween(String value1, String value2) {
            addCriterion("SUBJECTTWO between", value1, value2, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjecttwoNotBetween(String value1, String value2) {
            addCriterion("SUBJECTTWO not between", value1, value2, "subjecttwo");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeIsNull() {
            addCriterion("SUBJECTTHREE is null");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeIsNotNull() {
            addCriterion("SUBJECTTHREE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeEqualTo(String value) {
            addCriterion("SUBJECTTHREE =", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeNotEqualTo(String value) {
            addCriterion("SUBJECTTHREE <>", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeGreaterThan(String value) {
            addCriterion("SUBJECTTHREE >", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTTHREE >=", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeLessThan(String value) {
            addCriterion("SUBJECTTHREE <", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTTHREE <=", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeLike(String value) {
            addCriterion("SUBJECTTHREE like", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeNotLike(String value) {
            addCriterion("SUBJECTTHREE not like", value, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeIn(List<String> values) {
            addCriterion("SUBJECTTHREE in", values, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeNotIn(List<String> values) {
            addCriterion("SUBJECTTHREE not in", values, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeBetween(String value1, String value2) {
            addCriterion("SUBJECTTHREE between", value1, value2, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectthreeNotBetween(String value1, String value2) {
            addCriterion("SUBJECTTHREE not between", value1, value2, "subjectthree");
            return (Criteria) this;
        }

        public Criteria andSubjectfourIsNull() {
            addCriterion("SUBJECTFOUR is null");
            return (Criteria) this;
        }

        public Criteria andSubjectfourIsNotNull() {
            addCriterion("SUBJECTFOUR is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectfourEqualTo(String value) {
            addCriterion("SUBJECTFOUR =", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourNotEqualTo(String value) {
            addCriterion("SUBJECTFOUR <>", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourGreaterThan(String value) {
            addCriterion("SUBJECTFOUR >", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTFOUR >=", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourLessThan(String value) {
            addCriterion("SUBJECTFOUR <", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTFOUR <=", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourLike(String value) {
            addCriterion("SUBJECTFOUR like", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourNotLike(String value) {
            addCriterion("SUBJECTFOUR not like", value, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourIn(List<String> values) {
            addCriterion("SUBJECTFOUR in", values, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourNotIn(List<String> values) {
            addCriterion("SUBJECTFOUR not in", values, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourBetween(String value1, String value2) {
            addCriterion("SUBJECTFOUR between", value1, value2, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfourNotBetween(String value1, String value2) {
            addCriterion("SUBJECTFOUR not between", value1, value2, "subjectfour");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveIsNull() {
            addCriterion("SUBJECTFIVE is null");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveIsNotNull() {
            addCriterion("SUBJECTFIVE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveEqualTo(String value) {
            addCriterion("SUBJECTFIVE =", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveNotEqualTo(String value) {
            addCriterion("SUBJECTFIVE <>", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveGreaterThan(String value) {
            addCriterion("SUBJECTFIVE >", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTFIVE >=", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveLessThan(String value) {
            addCriterion("SUBJECTFIVE <", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTFIVE <=", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveLike(String value) {
            addCriterion("SUBJECTFIVE like", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveNotLike(String value) {
            addCriterion("SUBJECTFIVE not like", value, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveIn(List<String> values) {
            addCriterion("SUBJECTFIVE in", values, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveNotIn(List<String> values) {
            addCriterion("SUBJECTFIVE not in", values, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveBetween(String value1, String value2) {
            addCriterion("SUBJECTFIVE between", value1, value2, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectfiveNotBetween(String value1, String value2) {
            addCriterion("SUBJECTFIVE not between", value1, value2, "subjectfive");
            return (Criteria) this;
        }

        public Criteria andSubjectsixIsNull() {
            addCriterion("SUBJECTSIX is null");
            return (Criteria) this;
        }

        public Criteria andSubjectsixIsNotNull() {
            addCriterion("SUBJECTSIX is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectsixEqualTo(String value) {
            addCriterion("SUBJECTSIX =", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixNotEqualTo(String value) {
            addCriterion("SUBJECTSIX <>", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixGreaterThan(String value) {
            addCriterion("SUBJECTSIX >", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTSIX >=", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixLessThan(String value) {
            addCriterion("SUBJECTSIX <", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTSIX <=", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixLike(String value) {
            addCriterion("SUBJECTSIX like", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixNotLike(String value) {
            addCriterion("SUBJECTSIX not like", value, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixIn(List<String> values) {
            addCriterion("SUBJECTSIX in", values, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixNotIn(List<String> values) {
            addCriterion("SUBJECTSIX not in", values, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixBetween(String value1, String value2) {
            addCriterion("SUBJECTSIX between", value1, value2, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsixNotBetween(String value1, String value2) {
            addCriterion("SUBJECTSIX not between", value1, value2, "subjectsix");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenIsNull() {
            addCriterion("SUBJECTSEVEN is null");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenIsNotNull() {
            addCriterion("SUBJECTSEVEN is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenEqualTo(String value) {
            addCriterion("SUBJECTSEVEN =", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenNotEqualTo(String value) {
            addCriterion("SUBJECTSEVEN <>", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenGreaterThan(String value) {
            addCriterion("SUBJECTSEVEN >", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTSEVEN >=", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenLessThan(String value) {
            addCriterion("SUBJECTSEVEN <", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTSEVEN <=", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenLike(String value) {
            addCriterion("SUBJECTSEVEN like", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenNotLike(String value) {
            addCriterion("SUBJECTSEVEN not like", value, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenIn(List<String> values) {
            addCriterion("SUBJECTSEVEN in", values, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenNotIn(List<String> values) {
            addCriterion("SUBJECTSEVEN not in", values, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenBetween(String value1, String value2) {
            addCriterion("SUBJECTSEVEN between", value1, value2, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andSubjectsevenNotBetween(String value1, String value2) {
            addCriterion("SUBJECTSEVEN not between", value1, value2, "subjectseven");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ADDTIME =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ADDTIME <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ADDTIME >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADDTIME >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterionForJDBCDate("ADDTIME <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADDTIME <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ADDTIME in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ADDTIME not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADDTIME between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADDTIME not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Timestamp value) {
            addCriterion("ADDTIME =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Timestamp value) {
            addCriterion("ADDTIME <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Timestamp value) {
            addCriterion("ADDTIME >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ADDTIME >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Timestamp value) {
            addCriterion("ADDTIME <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ADDTIME <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ADDTIME between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ADDTIME not between", value1, value2, "addtime");
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