package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XfCreditRecordSqlWhere extends XfCreditRecordEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfCreditRecordSqlWhere() {
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

        public Criteria andManIdIsNull() {
            addCriterion("MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(String string) {
            addCriterion("MAN_ID =", string, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(BigDecimal value) {
            addCriterion("MAN_ID <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(BigDecimal value) {
            addCriterion("MAN_ID >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAN_ID >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(BigDecimal value) {
            addCriterion("MAN_ID <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAN_ID <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<BigDecimal> values) {
            addCriterion("MAN_ID in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<BigDecimal> values) {
            addCriterion("MAN_ID not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAN_ID between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAN_ID not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManNameIsNull() {
            addCriterion("MAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andManNameIsNotNull() {
            addCriterion("MAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andManNameEqualTo(String value) {
            addCriterion("MAN_NAME =", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotEqualTo(String value) {
            addCriterion("MAN_NAME <>", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThan(String value) {
            addCriterion("MAN_NAME >", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_NAME >=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThan(String value) {
            addCriterion("MAN_NAME <", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThanOrEqualTo(String value) {
            addCriterion("MAN_NAME <=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLike(String value) {
            addCriterion("MAN_NAME like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotLike(String value) {
            addCriterion("MAN_NAME not like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameIn(List<String> values) {
            addCriterion("MAN_NAME in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotIn(List<String> values) {
            addCriterion("MAN_NAME not in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameBetween(String value1, String value2) {
            addCriterion("MAN_NAME between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotBetween(String value1, String value2) {
            addCriterion("MAN_NAME not between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManTypeIsNull() {
            addCriterion("MAN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andManTypeIsNotNull() {
            addCriterion("MAN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andManTypeEqualTo(Long value) {
            addCriterion("MAN_TYPE =", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotEqualTo(Long value) {
            addCriterion("MAN_TYPE <>", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeGreaterThan(Long value) {
            addCriterion("MAN_TYPE >", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("MAN_TYPE >=", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeLessThan(Long value) {
            addCriterion("MAN_TYPE <", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeLessThanOrEqualTo(Long value) {
            addCriterion("MAN_TYPE <=", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeIn(List<Long> values) {
            addCriterion("MAN_TYPE in", values, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotIn(List<Long> values) {
            addCriterion("MAN_TYPE not in", values, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeBetween(Long value1, Long value2) {
            addCriterion("MAN_TYPE between", value1, value2, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotBetween(Long value1, Long value2) {
            addCriterion("MAN_TYPE not between", value1, value2, "manType");
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

        public Criteria andHoursEqualTo(BigDecimal value) {
            addCriterion("HOURS =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(BigDecimal value) {
            addCriterion("HOURS <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(BigDecimal value) {
            addCriterion("HOURS >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOURS >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(BigDecimal value) {
            addCriterion("HOURS <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOURS <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<BigDecimal> values) {
            addCriterion("HOURS in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<BigDecimal> values) {
            addCriterion("HOURS not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOURS between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOURS not between", value1, value2, "hours");
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

        public Criteria andTypeEqualTo(Long value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Long value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Long value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Long value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Long value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Long> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Long> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Long value1, Long value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Long value1, Long value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andProIdEqualTo(BigDecimal value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(BigDecimal value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(BigDecimal value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(BigDecimal value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<BigDecimal> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<BigDecimal> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andActIdIsNull() {
            addCriterion("ACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("ACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(String value) {
            addCriterion("ACT_ID =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(String value) {
            addCriterion("ACT_ID <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(String value) {
            addCriterion("ACT_ID >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_ID >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(String value) {
            addCriterion("ACT_ID <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(String value) {
            addCriterion("ACT_ID <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLike(String value) {
            addCriterion("ACT_ID like", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotLike(String value) {
            addCriterion("ACT_ID not like", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<String> values) {
            addCriterion("ACT_ID in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<String> values) {
            addCriterion("ACT_ID not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(String value1, String value2) {
            addCriterion("ACT_ID between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(String value1, String value2) {
            addCriterion("ACT_ID not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("ACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("ACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("ACT_NAME =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("ACT_NAME <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("ACT_NAME >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NAME >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("ACT_NAME <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("ACT_NAME <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("ACT_NAME like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("ACT_NAME not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("ACT_NAME in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("ACT_NAME not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("ACT_NAME between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("ACT_NAME not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Long value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Long value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Long value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Long value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Long value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Long> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Long> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Long value1, Long value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Long value1, Long value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andCheckSayIsNull() {
            addCriterion("CHECK_SAY is null");
            return (Criteria) this;
        }

        public Criteria andCheckSayIsNotNull() {
            addCriterion("CHECK_SAY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSayEqualTo(String value) {
            addCriterion("CHECK_SAY =", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayNotEqualTo(String value) {
            addCriterion("CHECK_SAY <>", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayGreaterThan(String value) {
            addCriterion("CHECK_SAY >", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_SAY >=", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayLessThan(String value) {
            addCriterion("CHECK_SAY <", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayLessThanOrEqualTo(String value) {
            addCriterion("CHECK_SAY <=", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayLike(String value) {
            addCriterion("CHECK_SAY like", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayNotLike(String value) {
            addCriterion("CHECK_SAY not like", value, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayIn(List<String> values) {
            addCriterion("CHECK_SAY in", values, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayNotIn(List<String> values) {
            addCriterion("CHECK_SAY not in", values, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayBetween(String value1, String value2) {
            addCriterion("CHECK_SAY between", value1, value2, "checkSay");
            return (Criteria) this;
        }

        public Criteria andCheckSayNotBetween(String value1, String value2) {
            addCriterion("CHECK_SAY not between", value1, value2, "checkSay");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitIsNull() {
            addCriterion("VERIFY_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitIsNotNull() {
            addCriterion("VERIFY_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitEqualTo(String value) {
            addCriterion("VERIFY_UNIT =", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNotEqualTo(String value) {
            addCriterion("VERIFY_UNIT <>", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitGreaterThan(String value) {
            addCriterion("VERIFY_UNIT >", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_UNIT >=", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitLessThan(String value) {
            addCriterion("VERIFY_UNIT <", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_UNIT <=", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitLike(String value) {
            addCriterion("VERIFY_UNIT like", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNotLike(String value) {
            addCriterion("VERIFY_UNIT not like", value, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitIn(List<String> values) {
            addCriterion("VERIFY_UNIT in", values, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNotIn(List<String> values) {
            addCriterion("VERIFY_UNIT not in", values, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitBetween(String value1, String value2) {
            addCriterion("VERIFY_UNIT between", value1, value2, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNotBetween(String value1, String value2) {
            addCriterion("VERIFY_UNIT not between", value1, value2, "verifyUnit");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameIsNull() {
            addCriterion("VERIFY_UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameIsNotNull() {
            addCriterion("VERIFY_UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameEqualTo(String value) {
            addCriterion("VERIFY_UNIT_NAME =", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameNotEqualTo(String value) {
            addCriterion("VERIFY_UNIT_NAME <>", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameGreaterThan(String value) {
            addCriterion("VERIFY_UNIT_NAME >", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_UNIT_NAME >=", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameLessThan(String value) {
            addCriterion("VERIFY_UNIT_NAME <", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_UNIT_NAME <=", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameLike(String value) {
            addCriterion("VERIFY_UNIT_NAME like", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameNotLike(String value) {
            addCriterion("VERIFY_UNIT_NAME not like", value, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameIn(List<String> values) {
            addCriterion("VERIFY_UNIT_NAME in", values, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameNotIn(List<String> values) {
            addCriterion("VERIFY_UNIT_NAME not in", values, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameBetween(String value1, String value2) {
            addCriterion("VERIFY_UNIT_NAME between", value1, value2, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyUnitNameNotBetween(String value1, String value2) {
            addCriterion("VERIFY_UNIT_NAME not between", value1, value2, "verifyUnitName");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("VERIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("VERIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("VERIFY_TIME =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("VERIFY_TIME <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("VERIFY_TIME >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VERIFY_TIME >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("VERIFY_TIME <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VERIFY_TIME <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("VERIFY_TIME in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("VERIFY_TIME not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VERIFY_TIME between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VERIFY_TIME not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Timestamp value) {
            addCriterion("VERIFY_TIME =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Timestamp value) {
            addCriterion("VERIFY_TIME <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Timestamp value) {
            addCriterion("VERIFY_TIME >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("VERIFY_TIME >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Timestamp value) {
            addCriterion("VERIFY_TIME <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("VERIFY_TIME <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("VERIFY_TIME between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("VERIFY_TIME not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyStateIsNull() {
            addCriterion("VERIFY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStateIsNotNull() {
            addCriterion("VERIFY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStateEqualTo(Long value) {
            addCriterion("VERIFY_STATE =", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateNotEqualTo(Long value) {
            addCriterion("VERIFY_STATE <>", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateGreaterThan(Long value) {
            addCriterion("VERIFY_STATE >", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateGreaterThanOrEqualTo(Long value) {
            addCriterion("VERIFY_STATE >=", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateLessThan(Long value) {
            addCriterion("VERIFY_STATE <", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateLessThanOrEqualTo(Long value) {
            addCriterion("VERIFY_STATE <=", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateIn(List<Long> values) {
            addCriterion("VERIFY_STATE in", values, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateNotIn(List<Long> values) {
            addCriterion("VERIFY_STATE not in", values, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateBetween(Long value1, Long value2) {
            addCriterion("VERIFY_STATE between", value1, value2, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateNotBetween(Long value1, Long value2) {
            addCriterion("VERIFY_STATE not between", value1, value2, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifySayIsNull() {
            addCriterion("VERIFY_SAY is null");
            return (Criteria) this;
        }

        public Criteria andVerifySayIsNotNull() {
            addCriterion("VERIFY_SAY is not null");
            return (Criteria) this;
        }

        public Criteria andVerifySayEqualTo(String value) {
            addCriterion("VERIFY_SAY =", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayNotEqualTo(String value) {
            addCriterion("VERIFY_SAY <>", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayGreaterThan(String value) {
            addCriterion("VERIFY_SAY >", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_SAY >=", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayLessThan(String value) {
            addCriterion("VERIFY_SAY <", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_SAY <=", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayLike(String value) {
            addCriterion("VERIFY_SAY like", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayNotLike(String value) {
            addCriterion("VERIFY_SAY not like", value, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayIn(List<String> values) {
            addCriterion("VERIFY_SAY in", values, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayNotIn(List<String> values) {
            addCriterion("VERIFY_SAY not in", values, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayBetween(String value1, String value2) {
            addCriterion("VERIFY_SAY between", value1, value2, "verifySay");
            return (Criteria) this;
        }

        public Criteria andVerifySayNotBetween(String value1, String value2) {
            addCriterion("VERIFY_SAY not between", value1, value2, "verifySay");
            return (Criteria) this;
        }

        public Criteria andDeclareStateIsNull() {
            addCriterion("DECLARE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDeclareStateIsNotNull() {
            addCriterion("DECLARE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareStateEqualTo(Long value) {
            addCriterion("DECLARE_STATE =", value, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateNotEqualTo(Long value) {
            addCriterion("DECLARE_STATE <>", value, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateGreaterThan(Long value) {
            addCriterion("DECLARE_STATE >", value, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateGreaterThanOrEqualTo(Long value) {
            addCriterion("DECLARE_STATE >=", value, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateLessThan(Long value) {
            addCriterion("DECLARE_STATE <", value, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateLessThanOrEqualTo(Long value) {
            addCriterion("DECLARE_STATE <=", value, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateIn(List<Long> values) {
            addCriterion("DECLARE_STATE in", values, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateNotIn(List<Long> values) {
            addCriterion("DECLARE_STATE not in", values, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateBetween(Long value1, Long value2) {
            addCriterion("DECLARE_STATE between", value1, value2, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareStateNotBetween(Long value1, Long value2) {
            addCriterion("DECLARE_STATE not between", value1, value2, "declareState");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIsNull() {
            addCriterion("DECLARE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIsNotNull() {
            addCriterion("DECLARE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_TIME =", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_TIME <>", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DECLARE_TIME >", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_TIME >=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThan(Date value) {
            addCriterionForJDBCDate("DECLARE_TIME <", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_TIME <=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DECLARE_TIME in", values, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DECLARE_TIME not in", values, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DECLARE_TIME between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DECLARE_TIME not between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeEqualTo(Timestamp value) {
            addCriterion("DECLARE_TIME =", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotEqualTo(Timestamp value) {
            addCriterion("DECLARE_TIME <>", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThan(Timestamp value) {
            addCriterion("DECLARE_TIME >", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DECLARE_TIME >=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThan(Timestamp value) {
            addCriterion("DECLARE_TIME <", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("DECLARE_TIME <=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DECLARE_TIME between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DECLARE_TIME not between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andModuleSourceIsNull() {
            addCriterion("MODULE_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andModuleSourceIsNotNull() {
            addCriterion("MODULE_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleSourceEqualTo(Long value) {
            addCriterion("MODULE_SOURCE =", value, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceNotEqualTo(Long value) {
            addCriterion("MODULE_SOURCE <>", value, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceGreaterThan(Long value) {
            addCriterion("MODULE_SOURCE >", value, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceGreaterThanOrEqualTo(Long value) {
            addCriterion("MODULE_SOURCE >=", value, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceLessThan(Long value) {
            addCriterion("MODULE_SOURCE <", value, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceLessThanOrEqualTo(Long value) {
            addCriterion("MODULE_SOURCE <=", value, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceIn(List<Long> values) {
            addCriterion("MODULE_SOURCE in", values, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceNotIn(List<Long> values) {
            addCriterion("MODULE_SOURCE not in", values, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceBetween(Long value1, Long value2) {
            addCriterion("MODULE_SOURCE between", value1, value2, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andModuleSourceNotBetween(Long value1, Long value2) {
            addCriterion("MODULE_SOURCE not between", value1, value2, "moduleSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceIsNull() {
            addCriterion("FUNCTION_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceIsNotNull() {
            addCriterion("FUNCTION_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceEqualTo(Long value) {
            addCriterion("FUNCTION_SOURCE =", value, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceNotEqualTo(Long value) {
            addCriterion("FUNCTION_SOURCE <>", value, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceGreaterThan(Long value) {
            addCriterion("FUNCTION_SOURCE >", value, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceGreaterThanOrEqualTo(Long value) {
            addCriterion("FUNCTION_SOURCE >=", value, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceLessThan(Long value) {
            addCriterion("FUNCTION_SOURCE <", value, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceLessThanOrEqualTo(Long value) {
            addCriterion("FUNCTION_SOURCE <=", value, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceIn(List<Long> values) {
            addCriterion("FUNCTION_SOURCE in", values, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceNotIn(List<Long> values) {
            addCriterion("FUNCTION_SOURCE not in", values, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceBetween(Long value1, Long value2) {
            addCriterion("FUNCTION_SOURCE between", value1, value2, "functionSource");
            return (Criteria) this;
        }

        public Criteria andFunctionSourceNotBetween(Long value1, Long value2) {
            addCriterion("FUNCTION_SOURCE not between", value1, value2, "functionSource");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIsNull() {
            addCriterion("PRINTTIME is null");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIsNotNull() {
            addCriterion("PRINTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttimeEqualTo(Date value) {
            addCriterionForJDBCDate("PRINTTIME =", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRINTTIME <>", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PRINTTIME >", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRINTTIME >=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThan(Date value) {
            addCriterionForJDBCDate("PRINTTIME <", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRINTTIME <=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIn(List<Date> values) {
            addCriterionForJDBCDate("PRINTTIME in", values, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRINTTIME not in", values, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRINTTIME between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRINTTIME not between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeEqualTo(Timestamp value) {
            addCriterion("PRINTTIME =", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotEqualTo(Timestamp value) {
            addCriterion("PRINTTIME <>", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThan(Timestamp value) {
            addCriterion("PRINTTIME >", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PRINTTIME >=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThan(Timestamp value) {
            addCriterion("PRINTTIME <", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PRINTTIME <=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PRINTTIME between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PRINTTIME not between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintIsNull() {
            addCriterion("IS_CERTIFICATE_PRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintIsNotNull() {
            addCriterion("IS_CERTIFICATE_PRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintEqualTo(Long value) {
            addCriterion("IS_CERTIFICATE_PRINT =", value, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintNotEqualTo(Long value) {
            addCriterion("IS_CERTIFICATE_PRINT <>", value, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintGreaterThan(Long value) {
            addCriterion("IS_CERTIFICATE_PRINT >", value, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_CERTIFICATE_PRINT >=", value, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintLessThan(Long value) {
            addCriterion("IS_CERTIFICATE_PRINT <", value, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintLessThanOrEqualTo(Long value) {
            addCriterion("IS_CERTIFICATE_PRINT <=", value, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintIn(List<Long> values) {
            addCriterion("IS_CERTIFICATE_PRINT in", values, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintNotIn(List<Long> values) {
            addCriterion("IS_CERTIFICATE_PRINT not in", values, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintBetween(Long value1, Long value2) {
            addCriterion("IS_CERTIFICATE_PRINT between", value1, value2, "isCertificatePrint");
            return (Criteria) this;
        }

        public Criteria andIsCertificatePrintNotBetween(Long value1, Long value2) {
            addCriterion("IS_CERTIFICATE_PRINT not between", value1, value2, "isCertificatePrint");
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

        public Criteria andStateEqualTo(Long value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Long value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Long value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Long value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Long value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Long value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Long> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Long> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Long value1, Long value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Long value1, Long value2) {
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