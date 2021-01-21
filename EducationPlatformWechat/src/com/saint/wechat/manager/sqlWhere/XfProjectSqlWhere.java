package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfProjectEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XfProjectSqlWhere extends XfProjectEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfProjectSqlWhere() {
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

        public Criteria andProCodeIsNull() {
            addCriterion("PRO_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNotNull() {
            addCriterion("PRO_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProCodeEqualTo(String value) {
            addCriterion("PRO_CODE =", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotEqualTo(String value) {
            addCriterion("PRO_CODE <>", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThan(String value) {
            addCriterion("PRO_CODE >", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_CODE >=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThan(String value) {
            addCriterion("PRO_CODE <", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThanOrEqualTo(String value) {
            addCriterion("PRO_CODE <=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLike(String value) {
            addCriterion("PRO_CODE like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotLike(String value) {
            addCriterion("PRO_CODE not like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeIn(List<String> values) {
            addCriterion("PRO_CODE in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotIn(List<String> values) {
            addCriterion("PRO_CODE not in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeBetween(String value1, String value2) {
            addCriterion("PRO_CODE between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotBetween(String value1, String value2) {
            addCriterion("PRO_CODE not between", value1, value2, "proCode");
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

        public Criteria andHoldUnitIsNull() {
            addCriterion("HOLD_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andHoldUnitIsNotNull() {
            addCriterion("HOLD_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andHoldUnitEqualTo(String value) {
            addCriterion("HOLD_UNIT =", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitNotEqualTo(String value) {
            addCriterion("HOLD_UNIT <>", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitGreaterThan(String value) {
            addCriterion("HOLD_UNIT >", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_UNIT >=", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitLessThan(String value) {
            addCriterion("HOLD_UNIT <", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitLessThanOrEqualTo(String value) {
            addCriterion("HOLD_UNIT <=", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitLike(String value) {
            addCriterion("HOLD_UNIT like", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitNotLike(String value) {
            addCriterion("HOLD_UNIT not like", value, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitIn(List<String> values) {
            addCriterion("HOLD_UNIT in", values, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitNotIn(List<String> values) {
            addCriterion("HOLD_UNIT not in", values, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitBetween(String value1, String value2) {
            addCriterion("HOLD_UNIT between", value1, value2, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andHoldUnitNotBetween(String value1, String value2) {
            addCriterion("HOLD_UNIT not between", value1, value2, "holdUnit");
            return (Criteria) this;
        }

        public Criteria andManeIsNull() {
            addCriterion("MANE is null");
            return (Criteria) this;
        }

        public Criteria andManeIsNotNull() {
            addCriterion("MANE is not null");
            return (Criteria) this;
        }

        public Criteria andManeEqualTo(String value) {
            addCriterion("MANE =", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeNotEqualTo(String value) {
            addCriterion("MANE <>", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeGreaterThan(String value) {
            addCriterion("MANE >", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeGreaterThanOrEqualTo(String value) {
            addCriterion("MANE >=", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeLessThan(String value) {
            addCriterion("MANE <", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeLessThanOrEqualTo(String value) {
            addCriterion("MANE <=", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeLike(String value) {
            addCriterion("MANE like", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeNotLike(String value) {
            addCriterion("MANE not like", value, "mane");
            return (Criteria) this;
        }

        public Criteria andManeIn(List<String> values) {
            addCriterion("MANE in", values, "mane");
            return (Criteria) this;
        }

        public Criteria andManeNotIn(List<String> values) {
            addCriterion("MANE not in", values, "mane");
            return (Criteria) this;
        }

        public Criteria andManeBetween(String value1, String value2) {
            addCriterion("MANE between", value1, value2, "mane");
            return (Criteria) this;
        }

        public Criteria andManeNotBetween(String value1, String value2) {
            addCriterion("MANE not between", value1, value2, "mane");
            return (Criteria) this;
        }

        public Criteria andManTelIsNull() {
            addCriterion("MAN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andManTelIsNotNull() {
            addCriterion("MAN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andManTelEqualTo(String value) {
            addCriterion("MAN_TEL =", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelNotEqualTo(String value) {
            addCriterion("MAN_TEL <>", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelGreaterThan(String value) {
            addCriterion("MAN_TEL >", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_TEL >=", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelLessThan(String value) {
            addCriterion("MAN_TEL <", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelLessThanOrEqualTo(String value) {
            addCriterion("MAN_TEL <=", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelLike(String value) {
            addCriterion("MAN_TEL like", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelNotLike(String value) {
            addCriterion("MAN_TEL not like", value, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelIn(List<String> values) {
            addCriterion("MAN_TEL in", values, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelNotIn(List<String> values) {
            addCriterion("MAN_TEL not in", values, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelBetween(String value1, String value2) {
            addCriterion("MAN_TEL between", value1, value2, "manTel");
            return (Criteria) this;
        }

        public Criteria andManTelNotBetween(String value1, String value2) {
            addCriterion("MAN_TEL not between", value1, value2, "manTel");
            return (Criteria) this;
        }

        public Criteria andHoldDaysIsNull() {
            addCriterion("HOLD_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andHoldDaysIsNotNull() {
            addCriterion("HOLD_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andHoldDaysEqualTo(BigDecimal value) {
            addCriterion("HOLD_DAYS =", value, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysNotEqualTo(BigDecimal value) {
            addCriterion("HOLD_DAYS <>", value, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysGreaterThan(BigDecimal value) {
            addCriterion("HOLD_DAYS >", value, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOLD_DAYS >=", value, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysLessThan(BigDecimal value) {
            addCriterion("HOLD_DAYS <", value, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOLD_DAYS <=", value, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysIn(List<BigDecimal> values) {
            addCriterion("HOLD_DAYS in", values, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysNotIn(List<BigDecimal> values) {
            addCriterion("HOLD_DAYS not in", values, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOLD_DAYS between", value1, value2, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOLD_DAYS not between", value1, value2, "holdDays");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateIsNull() {
            addCriterion("HOLD_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateIsNotNull() {
            addCriterion("HOLD_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_START_DATE =", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_START_DATE <>", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("HOLD_START_DATE >", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_START_DATE >=", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateLessThan(Date value) {
            addCriterionForJDBCDate("HOLD_START_DATE <", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_START_DATE <=", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("HOLD_START_DATE in", values, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("HOLD_START_DATE not in", values, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HOLD_START_DATE between", value1, value2, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HOLD_START_DATE not between", value1, value2, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateEqualTo(Timestamp value) {
            addCriterion("HOLD_START_DATE =", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateNotEqualTo(Timestamp value) {
            addCriterion("HOLD_START_DATE <>", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateGreaterThan(Timestamp value) {
            addCriterion("HOLD_START_DATE >", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("HOLD_START_DATE >=", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateLessThan(Timestamp value) {
            addCriterion("HOLD_START_DATE <", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("HOLD_START_DATE <=", value, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("HOLD_START_DATE between", value1, value2, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldStartDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("HOLD_START_DATE not between", value1, value2, "holdStartDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateIsNull() {
            addCriterion("HOLD_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateIsNotNull() {
            addCriterion("HOLD_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_END_DATE =", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_END_DATE <>", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("HOLD_END_DATE >", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_END_DATE >=", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateLessThan(Date value) {
            addCriterionForJDBCDate("HOLD_END_DATE <", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HOLD_END_DATE <=", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("HOLD_END_DATE in", values, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("HOLD_END_DATE not in", values, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HOLD_END_DATE between", value1, value2, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HOLD_END_DATE not between", value1, value2, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateEqualTo(Timestamp value) {
            addCriterion("HOLD_END_DATE =", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateNotEqualTo(Timestamp value) {
            addCriterion("HOLD_END_DATE <>", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateGreaterThan(Timestamp value) {
            addCriterion("HOLD_END_DATE >", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("HOLD_END_DATE >=", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateLessThan(Timestamp value) {
            addCriterion("HOLD_END_DATE <", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("HOLD_END_DATE <=", value, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("HOLD_END_DATE between", value1, value2, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldEndDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("HOLD_END_DATE not between", value1, value2, "holdEndDate");
            return (Criteria) this;
        }

        public Criteria andHoldLocationIsNull() {
            addCriterion("HOLD_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andHoldLocationIsNotNull() {
            addCriterion("HOLD_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andHoldLocationEqualTo(String value) {
            addCriterion("HOLD_LOCATION =", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationNotEqualTo(String value) {
            addCriterion("HOLD_LOCATION <>", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationGreaterThan(String value) {
            addCriterion("HOLD_LOCATION >", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_LOCATION >=", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationLessThan(String value) {
            addCriterion("HOLD_LOCATION <", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationLessThanOrEqualTo(String value) {
            addCriterion("HOLD_LOCATION <=", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationLike(String value) {
            addCriterion("HOLD_LOCATION like", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationNotLike(String value) {
            addCriterion("HOLD_LOCATION not like", value, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationIn(List<String> values) {
            addCriterion("HOLD_LOCATION in", values, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationNotIn(List<String> values) {
            addCriterion("HOLD_LOCATION not in", values, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationBetween(String value1, String value2) {
            addCriterion("HOLD_LOCATION between", value1, value2, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andHoldLocationNotBetween(String value1, String value2) {
            addCriterion("HOLD_LOCATION not between", value1, value2, "holdLocation");
            return (Criteria) this;
        }

        public Criteria andEduCreditIsNull() {
            addCriterion("EDU_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andEduCreditIsNotNull() {
            addCriterion("EDU_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andEduCreditEqualTo(BigDecimal value) {
            addCriterion("EDU_CREDIT =", value, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditNotEqualTo(BigDecimal value) {
            addCriterion("EDU_CREDIT <>", value, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditGreaterThan(BigDecimal value) {
            addCriterion("EDU_CREDIT >", value, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_CREDIT >=", value, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditLessThan(BigDecimal value) {
            addCriterion("EDU_CREDIT <", value, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_CREDIT <=", value, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditIn(List<BigDecimal> values) {
            addCriterion("EDU_CREDIT in", values, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditNotIn(List<BigDecimal> values) {
            addCriterion("EDU_CREDIT not in", values, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_CREDIT between", value1, value2, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_CREDIT not between", value1, value2, "eduCredit");
            return (Criteria) this;
        }

        public Criteria andEduObjectIsNull() {
            addCriterion("EDU_OBJECT is null");
            return (Criteria) this;
        }

        public Criteria andEduObjectIsNotNull() {
            addCriterion("EDU_OBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andEduObjectEqualTo(String value) {
            addCriterion("EDU_OBJECT =", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectNotEqualTo(String value) {
            addCriterion("EDU_OBJECT <>", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectGreaterThan(String value) {
            addCriterion("EDU_OBJECT >", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_OBJECT >=", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectLessThan(String value) {
            addCriterion("EDU_OBJECT <", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectLessThanOrEqualTo(String value) {
            addCriterion("EDU_OBJECT <=", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectLike(String value) {
            addCriterion("EDU_OBJECT like", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectNotLike(String value) {
            addCriterion("EDU_OBJECT not like", value, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectIn(List<String> values) {
            addCriterion("EDU_OBJECT in", values, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectNotIn(List<String> values) {
            addCriterion("EDU_OBJECT not in", values, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectBetween(String value1, String value2) {
            addCriterion("EDU_OBJECT between", value1, value2, "eduObject");
            return (Criteria) this;
        }

        public Criteria andEduObjectNotBetween(String value1, String value2) {
            addCriterion("EDU_OBJECT not between", value1, value2, "eduObject");
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

        public Criteria andAddUnitIsNull() {
            addCriterion("ADD_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAddUnitIsNotNull() {
            addCriterion("ADD_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAddUnitEqualTo(BigDecimal value) {
            addCriterion("ADD_UNIT =", value, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitNotEqualTo(BigDecimal value) {
            addCriterion("ADD_UNIT <>", value, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitGreaterThan(BigDecimal value) {
            addCriterion("ADD_UNIT >", value, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_UNIT >=", value, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitLessThan(BigDecimal value) {
            addCriterion("ADD_UNIT <", value, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_UNIT <=", value, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitIn(List<BigDecimal> values) {
            addCriterion("ADD_UNIT in", values, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitNotIn(List<BigDecimal> values) {
            addCriterion("ADD_UNIT not in", values, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_UNIT between", value1, value2, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_UNIT not between", value1, value2, "addUnit");
            return (Criteria) this;
        }

        public Criteria andAddUnitManIsNull() {
            addCriterion("ADD_UNIT_MAN is null");
            return (Criteria) this;
        }

        public Criteria andAddUnitManIsNotNull() {
            addCriterion("ADD_UNIT_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andAddUnitManEqualTo(String value) {
            addCriterion("ADD_UNIT_MAN =", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManNotEqualTo(String value) {
            addCriterion("ADD_UNIT_MAN <>", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManGreaterThan(String value) {
            addCriterion("ADD_UNIT_MAN >", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_UNIT_MAN >=", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManLessThan(String value) {
            addCriterion("ADD_UNIT_MAN <", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManLessThanOrEqualTo(String value) {
            addCriterion("ADD_UNIT_MAN <=", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManLike(String value) {
            addCriterion("ADD_UNIT_MAN like", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManNotLike(String value) {
            addCriterion("ADD_UNIT_MAN not like", value, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManIn(List<String> values) {
            addCriterion("ADD_UNIT_MAN in", values, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManNotIn(List<String> values) {
            addCriterion("ADD_UNIT_MAN not in", values, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManBetween(String value1, String value2) {
            addCriterion("ADD_UNIT_MAN between", value1, value2, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitManNotBetween(String value1, String value2) {
            addCriterion("ADD_UNIT_MAN not between", value1, value2, "addUnitMan");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneIsNull() {
            addCriterion("ADD_UNIT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneIsNotNull() {
            addCriterion("ADD_UNIT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneEqualTo(String value) {
            addCriterion("ADD_UNIT_PHONE =", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneNotEqualTo(String value) {
            addCriterion("ADD_UNIT_PHONE <>", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneGreaterThan(String value) {
            addCriterion("ADD_UNIT_PHONE >", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_UNIT_PHONE >=", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneLessThan(String value) {
            addCriterion("ADD_UNIT_PHONE <", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneLessThanOrEqualTo(String value) {
            addCriterion("ADD_UNIT_PHONE <=", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneLike(String value) {
            addCriterion("ADD_UNIT_PHONE like", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneNotLike(String value) {
            addCriterion("ADD_UNIT_PHONE not like", value, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneIn(List<String> values) {
            addCriterion("ADD_UNIT_PHONE in", values, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneNotIn(List<String> values) {
            addCriterion("ADD_UNIT_PHONE not in", values, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneBetween(String value1, String value2) {
            addCriterion("ADD_UNIT_PHONE between", value1, value2, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andAddUnitPhoneNotBetween(String value1, String value2) {
            addCriterion("ADD_UNIT_PHONE not between", value1, value2, "addUnitPhone");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeIsNull() {
            addCriterion("SUBJECT_THREE is null");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeIsNotNull() {
            addCriterion("SUBJECT_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeEqualTo(String value) {
            addCriterion("SUBJECT_THREE =", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeNotEqualTo(String value) {
            addCriterion("SUBJECT_THREE <>", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeGreaterThan(String value) {
            addCriterion("SUBJECT_THREE >", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_THREE >=", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeLessThan(String value) {
            addCriterion("SUBJECT_THREE <", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_THREE <=", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeLike(String value) {
            addCriterion("SUBJECT_THREE like", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeNotLike(String value) {
            addCriterion("SUBJECT_THREE not like", value, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeIn(List<String> values) {
            addCriterion("SUBJECT_THREE in", values, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeNotIn(List<String> values) {
            addCriterion("SUBJECT_THREE not in", values, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeBetween(String value1, String value2) {
            addCriterion("SUBJECT_THREE between", value1, value2, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andSubjectThreeNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_THREE not between", value1, value2, "subjectThree");
            return (Criteria) this;
        }

        public Criteria andHoldModeIsNull() {
            addCriterion("HOLD_MODE is null");
            return (Criteria) this;
        }

        public Criteria andHoldModeIsNotNull() {
            addCriterion("HOLD_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andHoldModeEqualTo(String value) {
            addCriterion("HOLD_MODE =", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeNotEqualTo(String value) {
            addCriterion("HOLD_MODE <>", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeGreaterThan(String value) {
            addCriterion("HOLD_MODE >", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_MODE >=", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeLessThan(String value) {
            addCriterion("HOLD_MODE <", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeLessThanOrEqualTo(String value) {
            addCriterion("HOLD_MODE <=", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeLike(String value) {
            addCriterion("HOLD_MODE like", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeNotLike(String value) {
            addCriterion("HOLD_MODE not like", value, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeIn(List<String> values) {
            addCriterion("HOLD_MODE in", values, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeNotIn(List<String> values) {
            addCriterion("HOLD_MODE not in", values, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeBetween(String value1, String value2) {
            addCriterion("HOLD_MODE between", value1, value2, "holdMode");
            return (Criteria) this;
        }

        public Criteria andHoldModeNotBetween(String value1, String value2) {
            addCriterion("HOLD_MODE not between", value1, value2, "holdMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeIsNull() {
            addCriterion("EDU_EXAM_MODE is null");
            return (Criteria) this;
        }

        public Criteria andEduExamModeIsNotNull() {
            addCriterion("EDU_EXAM_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andEduExamModeEqualTo(String value) {
            addCriterion("EDU_EXAM_MODE =", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeNotEqualTo(String value) {
            addCriterion("EDU_EXAM_MODE <>", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeGreaterThan(String value) {
            addCriterion("EDU_EXAM_MODE >", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_EXAM_MODE >=", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeLessThan(String value) {
            addCriterion("EDU_EXAM_MODE <", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeLessThanOrEqualTo(String value) {
            addCriterion("EDU_EXAM_MODE <=", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeLike(String value) {
            addCriterion("EDU_EXAM_MODE like", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeNotLike(String value) {
            addCriterion("EDU_EXAM_MODE not like", value, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeIn(List<String> values) {
            addCriterion("EDU_EXAM_MODE in", values, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeNotIn(List<String> values) {
            addCriterion("EDU_EXAM_MODE not in", values, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeBetween(String value1, String value2) {
            addCriterion("EDU_EXAM_MODE between", value1, value2, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduExamModeNotBetween(String value1, String value2) {
            addCriterion("EDU_EXAM_MODE not between", value1, value2, "eduExamMode");
            return (Criteria) this;
        }

        public Criteria andEduHoursIsNull() {
            addCriterion("EDU_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andEduHoursIsNotNull() {
            addCriterion("EDU_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andEduHoursEqualTo(BigDecimal value) {
            addCriterion("EDU_HOURS =", value, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursNotEqualTo(BigDecimal value) {
            addCriterion("EDU_HOURS <>", value, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursGreaterThan(BigDecimal value) {
            addCriterion("EDU_HOURS >", value, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_HOURS >=", value, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursLessThan(BigDecimal value) {
            addCriterion("EDU_HOURS <", value, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_HOURS <=", value, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursIn(List<BigDecimal> values) {
            addCriterion("EDU_HOURS in", values, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursNotIn(List<BigDecimal> values) {
            addCriterion("EDU_HOURS not in", values, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_HOURS between", value1, value2, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduHoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_HOURS not between", value1, value2, "eduHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursIsNull() {
            addCriterion("EDU_THEORY_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursIsNotNull() {
            addCriterion("EDU_THEORY_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursEqualTo(BigDecimal value) {
            addCriterion("EDU_THEORY_HOURS =", value, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursNotEqualTo(BigDecimal value) {
            addCriterion("EDU_THEORY_HOURS <>", value, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursGreaterThan(BigDecimal value) {
            addCriterion("EDU_THEORY_HOURS >", value, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_THEORY_HOURS >=", value, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursLessThan(BigDecimal value) {
            addCriterion("EDU_THEORY_HOURS <", value, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_THEORY_HOURS <=", value, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursIn(List<BigDecimal> values) {
            addCriterion("EDU_THEORY_HOURS in", values, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursNotIn(List<BigDecimal> values) {
            addCriterion("EDU_THEORY_HOURS not in", values, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_THEORY_HOURS between", value1, value2, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduTheoryHoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_THEORY_HOURS not between", value1, value2, "eduTheoryHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursIsNull() {
            addCriterion("EDU_EXPERIMENT_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursIsNotNull() {
            addCriterion("EDU_EXPERIMENT_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursEqualTo(BigDecimal value) {
            addCriterion("EDU_EXPERIMENT_HOURS =", value, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursNotEqualTo(BigDecimal value) {
            addCriterion("EDU_EXPERIMENT_HOURS <>", value, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursGreaterThan(BigDecimal value) {
            addCriterion("EDU_EXPERIMENT_HOURS >", value, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_EXPERIMENT_HOURS >=", value, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursLessThan(BigDecimal value) {
            addCriterion("EDU_EXPERIMENT_HOURS <", value, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EDU_EXPERIMENT_HOURS <=", value, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursIn(List<BigDecimal> values) {
            addCriterion("EDU_EXPERIMENT_HOURS in", values, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursNotIn(List<BigDecimal> values) {
            addCriterion("EDU_EXPERIMENT_HOURS not in", values, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_EXPERIMENT_HOURS between", value1, value2, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andEduExperimentHoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDU_EXPERIMENT_HOURS not between", value1, value2, "eduExperimentHours");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManIsNull() {
            addCriterion("HOLD_UNIT_MAN is null");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManIsNotNull() {
            addCriterion("HOLD_UNIT_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManEqualTo(String value) {
            addCriterion("HOLD_UNIT_MAN =", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManNotEqualTo(String value) {
            addCriterion("HOLD_UNIT_MAN <>", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManGreaterThan(String value) {
            addCriterion("HOLD_UNIT_MAN >", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_UNIT_MAN >=", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManLessThan(String value) {
            addCriterion("HOLD_UNIT_MAN <", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManLessThanOrEqualTo(String value) {
            addCriterion("HOLD_UNIT_MAN <=", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManLike(String value) {
            addCriterion("HOLD_UNIT_MAN like", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManNotLike(String value) {
            addCriterion("HOLD_UNIT_MAN not like", value, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManIn(List<String> values) {
            addCriterion("HOLD_UNIT_MAN in", values, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManNotIn(List<String> values) {
            addCriterion("HOLD_UNIT_MAN not in", values, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManBetween(String value1, String value2) {
            addCriterion("HOLD_UNIT_MAN between", value1, value2, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitManNotBetween(String value1, String value2) {
            addCriterion("HOLD_UNIT_MAN not between", value1, value2, "holdUnitMan");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneIsNull() {
            addCriterion("HOLD_UNIT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneIsNotNull() {
            addCriterion("HOLD_UNIT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneEqualTo(String value) {
            addCriterion("HOLD_UNIT_PHONE =", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneNotEqualTo(String value) {
            addCriterion("HOLD_UNIT_PHONE <>", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneGreaterThan(String value) {
            addCriterion("HOLD_UNIT_PHONE >", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOLD_UNIT_PHONE >=", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneLessThan(String value) {
            addCriterion("HOLD_UNIT_PHONE <", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneLessThanOrEqualTo(String value) {
            addCriterion("HOLD_UNIT_PHONE <=", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneLike(String value) {
            addCriterion("HOLD_UNIT_PHONE like", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneNotLike(String value) {
            addCriterion("HOLD_UNIT_PHONE not like", value, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneIn(List<String> values) {
            addCriterion("HOLD_UNIT_PHONE in", values, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneNotIn(List<String> values) {
            addCriterion("HOLD_UNIT_PHONE not in", values, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneBetween(String value1, String value2) {
            addCriterion("HOLD_UNIT_PHONE between", value1, value2, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andHoldUnitPhoneNotBetween(String value1, String value2) {
            addCriterion("HOLD_UNIT_PHONE not between", value1, value2, "holdUnitPhone");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("PRO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("PRO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("PRO_TYPE =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("PRO_TYPE <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("PRO_TYPE >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("PRO_TYPE <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("PRO_TYPE like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("PRO_TYPE not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("PRO_TYPE in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("PRO_TYPE not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("PRO_TYPE between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("PRO_TYPE not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProSourceIsNull() {
            addCriterion("PRO_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andProSourceIsNotNull() {
            addCriterion("PRO_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andProSourceEqualTo(String value) {
            addCriterion("PRO_SOURCE =", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotEqualTo(String value) {
            addCriterion("PRO_SOURCE <>", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceGreaterThan(String value) {
            addCriterion("PRO_SOURCE >", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_SOURCE >=", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceLessThan(String value) {
            addCriterion("PRO_SOURCE <", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceLessThanOrEqualTo(String value) {
            addCriterion("PRO_SOURCE <=", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceLike(String value) {
            addCriterion("PRO_SOURCE like", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotLike(String value) {
            addCriterion("PRO_SOURCE not like", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceIn(List<String> values) {
            addCriterion("PRO_SOURCE in", values, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotIn(List<String> values) {
            addCriterion("PRO_SOURCE not in", values, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceBetween(String value1, String value2) {
            addCriterion("PRO_SOURCE between", value1, value2, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotBetween(String value1, String value2) {
            addCriterion("PRO_SOURCE not between", value1, value2, "proSource");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNull() {
            addCriterion("EVALUATE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNotNull() {
            addCriterion("EVALUATE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEqualTo(String value) {
            addCriterion("EVALUATE =", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(String value) {
            addCriterion("EVALUATE <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(String value) {
            addCriterion("EVALUATE >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATE >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(String value) {
            addCriterion("EVALUATE <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(String value) {
            addCriterion("EVALUATE <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLike(String value) {
            addCriterion("EVALUATE like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotLike(String value) {
            addCriterion("EVALUATE not like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateIn(List<String> values) {
            addCriterion("EVALUATE in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotIn(List<String> values) {
            addCriterion("EVALUATE not in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateBetween(String value1, String value2) {
            addCriterion("EVALUATE between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotBetween(String value1, String value2) {
            addCriterion("EVALUATE not between", value1, value2, "evaluate");
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