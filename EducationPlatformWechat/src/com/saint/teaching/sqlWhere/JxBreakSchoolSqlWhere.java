package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_BREAKSCHOOL
*表说明学生违纪登记
  */
public class JxBreakSchoolSqlWhere extends JxBreakSchoolEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxBreakSchoolSqlWhere() {
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

        public Criteria andStuidIsNull() {
            addCriterion("STUID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("STUID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("STUID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("STUID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("STUID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("STUID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("STUID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("STUID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("STUID like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("STUID not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("STUID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("STUID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("STUID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("STUID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("STUNAME is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("STUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("STUNAME =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("STUNAME <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("STUNAME >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("STUNAME >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("STUNAME <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("STUNAME <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("STUNAME like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("STUNAME not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("STUNAME in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("STUNAME not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("STUNAME between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("STUNAME not between", value1, value2, "stuname");
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

        public Criteria andBreaktypeIsNull() {
            addCriterion("BREAKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBreaktypeIsNotNull() {
            addCriterion("BREAKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBreaktypeEqualTo(String value) {
            addCriterion("BREAKTYPE =", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeNotEqualTo(String value) {
            addCriterion("BREAKTYPE <>", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeGreaterThan(String value) {
            addCriterion("BREAKTYPE >", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeGreaterThanOrEqualTo(String value) {
            addCriterion("BREAKTYPE >=", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeLessThan(String value) {
            addCriterion("BREAKTYPE <", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeLessThanOrEqualTo(String value) {
            addCriterion("BREAKTYPE <=", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeLike(String value) {
            addCriterion("BREAKTYPE like", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeNotLike(String value) {
            addCriterion("BREAKTYPE not like", value, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeIn(List<String> values) {
            addCriterion("BREAKTYPE in", values, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeNotIn(List<String> values) {
            addCriterion("BREAKTYPE not in", values, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeBetween(String value1, String value2) {
            addCriterion("BREAKTYPE between", value1, value2, "breaktype");
            return (Criteria) this;
        }

        public Criteria andBreaktypeNotBetween(String value1, String value2) {
            addCriterion("BREAKTYPE not between", value1, value2, "breaktype");
            return (Criteria) this;
        }

        public Criteria andStuschoolidIsNull() {
            addCriterion("STUSCHOOLID is null");
            return (Criteria) this;
        }

        public Criteria andStuschoolidIsNotNull() {
            addCriterion("STUSCHOOLID is not null");
            return (Criteria) this;
        }

        public Criteria andStuschoolidEqualTo(String value) {
            addCriterion("STUSCHOOLID =", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotEqualTo(String value) {
            addCriterion("STUSCHOOLID <>", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidGreaterThan(String value) {
            addCriterion("STUSCHOOLID >", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidGreaterThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLID >=", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidLessThan(String value) {
            addCriterion("STUSCHOOLID <", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidLessThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLID <=", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidLike(String value) {
            addCriterion("STUSCHOOLID like", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotLike(String value) {
            addCriterion("STUSCHOOLID not like", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidIn(List<String> values) {
            addCriterion("STUSCHOOLID in", values, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotIn(List<String> values) {
            addCriterion("STUSCHOOLID not in", values, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidBetween(String value1, String value2) {
            addCriterion("STUSCHOOLID between", value1, value2, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotBetween(String value1, String value2) {
            addCriterion("STUSCHOOLID not between", value1, value2, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameIsNull() {
            addCriterion("STUSCHOOLNAME is null");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameIsNotNull() {
            addCriterion("STUSCHOOLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameEqualTo(String value) {
            addCriterion("STUSCHOOLNAME =", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotEqualTo(String value) {
            addCriterion("STUSCHOOLNAME <>", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameGreaterThan(String value) {
            addCriterion("STUSCHOOLNAME >", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLNAME >=", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameLessThan(String value) {
            addCriterion("STUSCHOOLNAME <", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameLessThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLNAME <=", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameLike(String value) {
            addCriterion("STUSCHOOLNAME like", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotLike(String value) {
            addCriterion("STUSCHOOLNAME not like", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameIn(List<String> values) {
            addCriterion("STUSCHOOLNAME in", values, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotIn(List<String> values) {
            addCriterion("STUSCHOOLNAME not in", values, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameBetween(String value1, String value2) {
            addCriterion("STUSCHOOLNAME between", value1, value2, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotBetween(String value1, String value2) {
            addCriterion("STUSCHOOLNAME not between", value1, value2, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
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

        public Criteria andDepdisposemodIsNull() {
            addCriterion("DEPDISPOSEMOD is null");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodIsNotNull() {
            addCriterion("DEPDISPOSEMOD is not null");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodEqualTo(String value) {
            addCriterion("DEPDISPOSEMOD =", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodNotEqualTo(String value) {
            addCriterion("DEPDISPOSEMOD <>", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodGreaterThan(String value) {
            addCriterion("DEPDISPOSEMOD >", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodGreaterThanOrEqualTo(String value) {
            addCriterion("DEPDISPOSEMOD >=", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodLessThan(String value) {
            addCriterion("DEPDISPOSEMOD <", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodLessThanOrEqualTo(String value) {
            addCriterion("DEPDISPOSEMOD <=", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodLike(String value) {
            addCriterion("DEPDISPOSEMOD like", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodNotLike(String value) {
            addCriterion("DEPDISPOSEMOD not like", value, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodIn(List<String> values) {
            addCriterion("DEPDISPOSEMOD in", values, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodNotIn(List<String> values) {
            addCriterion("DEPDISPOSEMOD not in", values, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodBetween(String value1, String value2) {
            addCriterion("DEPDISPOSEMOD between", value1, value2, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposemodNotBetween(String value1, String value2) {
            addCriterion("DEPDISPOSEMOD not between", value1, value2, "depdisposemod");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultIsNull() {
            addCriterion("DEPDISPOSERESULT is null");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultIsNotNull() {
            addCriterion("DEPDISPOSERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultEqualTo(String value) {
            addCriterion("DEPDISPOSERESULT =", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultNotEqualTo(String value) {
            addCriterion("DEPDISPOSERESULT <>", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultGreaterThan(String value) {
            addCriterion("DEPDISPOSERESULT >", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultGreaterThanOrEqualTo(String value) {
            addCriterion("DEPDISPOSERESULT >=", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultLessThan(String value) {
            addCriterion("DEPDISPOSERESULT <", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultLessThanOrEqualTo(String value) {
            addCriterion("DEPDISPOSERESULT <=", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultLike(String value) {
            addCriterion("DEPDISPOSERESULT like", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultNotLike(String value) {
            addCriterion("DEPDISPOSERESULT not like", value, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultIn(List<String> values) {
            addCriterion("DEPDISPOSERESULT in", values, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultNotIn(List<String> values) {
            addCriterion("DEPDISPOSERESULT not in", values, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultBetween(String value1, String value2) {
            addCriterion("DEPDISPOSERESULT between", value1, value2, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeresultNotBetween(String value1, String value2) {
            addCriterion("DEPDISPOSERESULT not between", value1, value2, "depdisposeresult");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjIsNull() {
            addCriterion("DEPDISPOSEYJ is null");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjIsNotNull() {
            addCriterion("DEPDISPOSEYJ is not null");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjEqualTo(String value) {
            addCriterion("DEPDISPOSEYJ =", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjNotEqualTo(String value) {
            addCriterion("DEPDISPOSEYJ <>", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjGreaterThan(String value) {
            addCriterion("DEPDISPOSEYJ >", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjGreaterThanOrEqualTo(String value) {
            addCriterion("DEPDISPOSEYJ >=", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjLessThan(String value) {
            addCriterion("DEPDISPOSEYJ <", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjLessThanOrEqualTo(String value) {
            addCriterion("DEPDISPOSEYJ <=", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjLike(String value) {
            addCriterion("DEPDISPOSEYJ like", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjNotLike(String value) {
            addCriterion("DEPDISPOSEYJ not like", value, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjIn(List<String> values) {
            addCriterion("DEPDISPOSEYJ in", values, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjNotIn(List<String> values) {
            addCriterion("DEPDISPOSEYJ not in", values, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjBetween(String value1, String value2) {
            addCriterion("DEPDISPOSEYJ between", value1, value2, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposeyjNotBetween(String value1, String value2) {
            addCriterion("DEPDISPOSEYJ not between", value1, value2, "depdisposeyj");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateIsNull() {
            addCriterion("DEPDISPOSEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateIsNotNull() {
            addCriterion("DEPDISPOSEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateEqualTo(Date value) {
            addCriterionForJDBCDate("DEPDISPOSEDATE =", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEPDISPOSEDATE <>", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateGreaterThan(Date value) {
            addCriterionForJDBCDate("DEPDISPOSEDATE >", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEPDISPOSEDATE >=", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateLessThan(Date value) {
            addCriterionForJDBCDate("DEPDISPOSEDATE <", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEPDISPOSEDATE <=", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateIn(List<Date> values) {
            addCriterionForJDBCDate("DEPDISPOSEDATE in", values, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEPDISPOSEDATE not in", values, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEPDISPOSEDATE between", value1, value2, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEPDISPOSEDATE not between", value1, value2, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateEqualTo(Timestamp value) {
            addCriterion("DEPDISPOSEDATE =", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateNotEqualTo(Timestamp value) {
            addCriterion("DEPDISPOSEDATE <>", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateGreaterThan(Timestamp value) {
            addCriterion("DEPDISPOSEDATE >", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DEPDISPOSEDATE >=", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateLessThan(Timestamp value) {
            addCriterion("DEPDISPOSEDATE <", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("DEPDISPOSEDATE <=", value, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DEPDISPOSEDATE between", value1, value2, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andDepdisposedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DEPDISPOSEDATE not between", value1, value2, "depdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodIsNull() {
            addCriterion("JXBDISPOSEMOD is null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodIsNotNull() {
            addCriterion("JXBDISPOSEMOD is not null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodEqualTo(String value) {
            addCriterion("JXBDISPOSEMOD =", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodNotEqualTo(String value) {
            addCriterion("JXBDISPOSEMOD <>", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodGreaterThan(String value) {
            addCriterion("JXBDISPOSEMOD >", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodGreaterThanOrEqualTo(String value) {
            addCriterion("JXBDISPOSEMOD >=", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodLessThan(String value) {
            addCriterion("JXBDISPOSEMOD <", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodLessThanOrEqualTo(String value) {
            addCriterion("JXBDISPOSEMOD <=", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodLike(String value) {
            addCriterion("JXBDISPOSEMOD like", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodNotLike(String value) {
            addCriterion("JXBDISPOSEMOD not like", value, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodIn(List<String> values) {
            addCriterion("JXBDISPOSEMOD in", values, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodNotIn(List<String> values) {
            addCriterion("JXBDISPOSEMOD not in", values, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodBetween(String value1, String value2) {
            addCriterion("JXBDISPOSEMOD between", value1, value2, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposemodNotBetween(String value1, String value2) {
            addCriterion("JXBDISPOSEMOD not between", value1, value2, "jxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultIsNull() {
            addCriterion("JXBDISPOSERESULT is null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultIsNotNull() {
            addCriterion("JXBDISPOSERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultEqualTo(String value) {
            addCriterion("JXBDISPOSERESULT =", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultNotEqualTo(String value) {
            addCriterion("JXBDISPOSERESULT <>", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultGreaterThan(String value) {
            addCriterion("JXBDISPOSERESULT >", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultGreaterThanOrEqualTo(String value) {
            addCriterion("JXBDISPOSERESULT >=", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultLessThan(String value) {
            addCriterion("JXBDISPOSERESULT <", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultLessThanOrEqualTo(String value) {
            addCriterion("JXBDISPOSERESULT <=", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultLike(String value) {
            addCriterion("JXBDISPOSERESULT like", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultNotLike(String value) {
            addCriterion("JXBDISPOSERESULT not like", value, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultIn(List<String> values) {
            addCriterion("JXBDISPOSERESULT in", values, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultNotIn(List<String> values) {
            addCriterion("JXBDISPOSERESULT not in", values, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultBetween(String value1, String value2) {
            addCriterion("JXBDISPOSERESULT between", value1, value2, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeresultNotBetween(String value1, String value2) {
            addCriterion("JXBDISPOSERESULT not between", value1, value2, "jxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjIsNull() {
            addCriterion("JXBDISPOSEYJ is null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjIsNotNull() {
            addCriterion("JXBDISPOSEYJ is not null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjEqualTo(String value) {
            addCriterion("JXBDISPOSEYJ =", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjNotEqualTo(String value) {
            addCriterion("JXBDISPOSEYJ <>", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjGreaterThan(String value) {
            addCriterion("JXBDISPOSEYJ >", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjGreaterThanOrEqualTo(String value) {
            addCriterion("JXBDISPOSEYJ >=", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjLessThan(String value) {
            addCriterion("JXBDISPOSEYJ <", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjLessThanOrEqualTo(String value) {
            addCriterion("JXBDISPOSEYJ <=", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjLike(String value) {
            addCriterion("JXBDISPOSEYJ like", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjNotLike(String value) {
            addCriterion("JXBDISPOSEYJ not like", value, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjIn(List<String> values) {
            addCriterion("JXBDISPOSEYJ in", values, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjNotIn(List<String> values) {
            addCriterion("JXBDISPOSEYJ not in", values, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjBetween(String value1, String value2) {
            addCriterion("JXBDISPOSEYJ between", value1, value2, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposeyjNotBetween(String value1, String value2) {
            addCriterion("JXBDISPOSEYJ not between", value1, value2, "jxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateIsNull() {
            addCriterion("JXBDISPOSEDATE is null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateIsNotNull() {
            addCriterion("JXBDISPOSEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateEqualTo(Date value) {
            addCriterionForJDBCDate("JXBDISPOSEDATE =", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("JXBDISPOSEDATE <>", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateGreaterThan(Date value) {
            addCriterionForJDBCDate("JXBDISPOSEDATE >", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JXBDISPOSEDATE >=", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateLessThan(Date value) {
            addCriterionForJDBCDate("JXBDISPOSEDATE <", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JXBDISPOSEDATE <=", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateIn(List<Date> values) {
            addCriterionForJDBCDate("JXBDISPOSEDATE in", values, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("JXBDISPOSEDATE not in", values, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JXBDISPOSEDATE between", value1, value2, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JXBDISPOSEDATE not between", value1, value2, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateEqualTo(Timestamp value) {
            addCriterion("JXBDISPOSEDATE =", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateNotEqualTo(Timestamp value) {
            addCriterion("JXBDISPOSEDATE <>", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateGreaterThan(Timestamp value) {
            addCriterion("JXBDISPOSEDATE >", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("JXBDISPOSEDATE >=", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateLessThan(Timestamp value) {
            addCriterion("JXBDISPOSEDATE <", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("JXBDISPOSEDATE <=", value, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JXBDISPOSEDATE between", value1, value2, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andJxbdisposedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JXBDISPOSEDATE not between", value1, value2, "jxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodIsNull() {
            addCriterion("XXBDISPOSEMOD is null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodIsNotNull() {
            addCriterion("XXBDISPOSEMOD is not null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodEqualTo(String value) {
            addCriterion("XXBDISPOSEMOD =", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodNotEqualTo(String value) {
            addCriterion("XXBDISPOSEMOD <>", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodGreaterThan(String value) {
            addCriterion("XXBDISPOSEMOD >", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodGreaterThanOrEqualTo(String value) {
            addCriterion("XXBDISPOSEMOD >=", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodLessThan(String value) {
            addCriterion("XXBDISPOSEMOD <", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodLessThanOrEqualTo(String value) {
            addCriterion("XXBDISPOSEMOD <=", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodLike(String value) {
            addCriterion("XXBDISPOSEMOD like", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodNotLike(String value) {
            addCriterion("XXBDISPOSEMOD not like", value, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodIn(List<String> values) {
            addCriterion("XXBDISPOSEMOD in", values, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodNotIn(List<String> values) {
            addCriterion("XXBDISPOSEMOD not in", values, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodBetween(String value1, String value2) {
            addCriterion("XXBDISPOSEMOD between", value1, value2, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposemodNotBetween(String value1, String value2) {
            addCriterion("XXBDISPOSEMOD not between", value1, value2, "xxbdisposemod");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultIsNull() {
            addCriterion("XXBDISPOSERESULT is null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultIsNotNull() {
            addCriterion("XXBDISPOSERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultEqualTo(String value) {
            addCriterion("XXBDISPOSERESULT =", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultNotEqualTo(String value) {
            addCriterion("XXBDISPOSERESULT <>", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultGreaterThan(String value) {
            addCriterion("XXBDISPOSERESULT >", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultGreaterThanOrEqualTo(String value) {
            addCriterion("XXBDISPOSERESULT >=", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultLessThan(String value) {
            addCriterion("XXBDISPOSERESULT <", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultLessThanOrEqualTo(String value) {
            addCriterion("XXBDISPOSERESULT <=", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultLike(String value) {
            addCriterion("XXBDISPOSERESULT like", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultNotLike(String value) {
            addCriterion("XXBDISPOSERESULT not like", value, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultIn(List<String> values) {
            addCriterion("XXBDISPOSERESULT in", values, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultNotIn(List<String> values) {
            addCriterion("XXBDISPOSERESULT not in", values, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultBetween(String value1, String value2) {
            addCriterion("XXBDISPOSERESULT between", value1, value2, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeresultNotBetween(String value1, String value2) {
            addCriterion("XXBDISPOSERESULT not between", value1, value2, "xxbdisposeresult");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjIsNull() {
            addCriterion("XXBDISPOSEYJ is null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjIsNotNull() {
            addCriterion("XXBDISPOSEYJ is not null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjEqualTo(String value) {
            addCriterion("XXBDISPOSEYJ =", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjNotEqualTo(String value) {
            addCriterion("XXBDISPOSEYJ <>", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjGreaterThan(String value) {
            addCriterion("XXBDISPOSEYJ >", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjGreaterThanOrEqualTo(String value) {
            addCriterion("XXBDISPOSEYJ >=", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjLessThan(String value) {
            addCriterion("XXBDISPOSEYJ <", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjLessThanOrEqualTo(String value) {
            addCriterion("XXBDISPOSEYJ <=", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjLike(String value) {
            addCriterion("XXBDISPOSEYJ like", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjNotLike(String value) {
            addCriterion("XXBDISPOSEYJ not like", value, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjIn(List<String> values) {
            addCriterion("XXBDISPOSEYJ in", values, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjNotIn(List<String> values) {
            addCriterion("XXBDISPOSEYJ not in", values, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjBetween(String value1, String value2) {
            addCriterion("XXBDISPOSEYJ between", value1, value2, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposeyjNotBetween(String value1, String value2) {
            addCriterion("XXBDISPOSEYJ not between", value1, value2, "xxbdisposeyj");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateIsNull() {
            addCriterion("XXBDISPOSEDATE is null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateIsNotNull() {
            addCriterion("XXBDISPOSEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateEqualTo(Date value) {
            addCriterionForJDBCDate("XXBDISPOSEDATE =", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("XXBDISPOSEDATE <>", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateGreaterThan(Date value) {
            addCriterionForJDBCDate("XXBDISPOSEDATE >", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XXBDISPOSEDATE >=", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateLessThan(Date value) {
            addCriterionForJDBCDate("XXBDISPOSEDATE <", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XXBDISPOSEDATE <=", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateIn(List<Date> values) {
            addCriterionForJDBCDate("XXBDISPOSEDATE in", values, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("XXBDISPOSEDATE not in", values, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XXBDISPOSEDATE between", value1, value2, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XXBDISPOSEDATE not between", value1, value2, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateEqualTo(Timestamp value) {
            addCriterion("XXBDISPOSEDATE =", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateNotEqualTo(Timestamp value) {
            addCriterion("XXBDISPOSEDATE <>", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateGreaterThan(Timestamp value) {
            addCriterion("XXBDISPOSEDATE >", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("XXBDISPOSEDATE >=", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateLessThan(Timestamp value) {
            addCriterion("XXBDISPOSEDATE <", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("XXBDISPOSEDATE <=", value, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("XXBDISPOSEDATE between", value1, value2, "xxbdisposedate");
            return (Criteria) this;
        }

        public Criteria andXxbdisposedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("XXBDISPOSEDATE not between", value1, value2, "xxbdisposedate");
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

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Timestamp value) {
            addCriterion("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Timestamp value) {
            addCriterion("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Timestamp value) {
            addCriterion("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Timestamp value) {
            addCriterion("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPDATE not between", value1, value2, "opdate");
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