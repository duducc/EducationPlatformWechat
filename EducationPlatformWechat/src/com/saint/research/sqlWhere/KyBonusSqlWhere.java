package com.saint.research.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.research.bean.KyBonusEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名KY_BONUS
*表说明科研奖金管理
  */
public class KyBonusSqlWhere extends KyBonusEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KyBonusSqlWhere() {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andBonustypeIsNull() {
            addCriterion("BONUSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBonustypeIsNotNull() {
            addCriterion("BONUSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBonustypeEqualTo(String value) {
            addCriterion("BONUSTYPE =", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeNotEqualTo(String value) {
            addCriterion("BONUSTYPE <>", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeGreaterThan(String value) {
            addCriterion("BONUSTYPE >", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeGreaterThanOrEqualTo(String value) {
            addCriterion("BONUSTYPE >=", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeLessThan(String value) {
            addCriterion("BONUSTYPE <", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeLessThanOrEqualTo(String value) {
            addCriterion("BONUSTYPE <=", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeLike(String value) {
            addCriterion("BONUSTYPE like", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeNotLike(String value) {
            addCriterion("BONUSTYPE not like", value, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeIn(List<String> values) {
            addCriterion("BONUSTYPE in", values, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeNotIn(List<String> values) {
            addCriterion("BONUSTYPE not in", values, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeBetween(String value1, String value2) {
            addCriterion("BONUSTYPE between", value1, value2, "bonustype");
            return (Criteria) this;
        }

        public Criteria andBonustypeNotBetween(String value1, String value2) {
            addCriterion("BONUSTYPE not between", value1, value2, "bonustype");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBonusdateIsNull() {
            addCriterion("BONUSDATE is null");
            return (Criteria) this;
        }

        public Criteria andBonusdateIsNotNull() {
            addCriterion("BONUSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBonusdateEqualTo(Date value) {
            addCriterionForJDBCDate("BONUSDATE =", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BONUSDATE <>", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BONUSDATE >", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BONUSDATE >=", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateLessThan(Date value) {
            addCriterionForJDBCDate("BONUSDATE <", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BONUSDATE <=", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateIn(List<Date> values) {
            addCriterionForJDBCDate("BONUSDATE in", values, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BONUSDATE not in", values, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BONUSDATE between", value1, value2, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BONUSDATE not between", value1, value2, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateEqualTo(Timestamp value) {
            addCriterion("BONUSDATE =", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateNotEqualTo(Timestamp value) {
            addCriterion("BONUSDATE <>", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateGreaterThan(Timestamp value) {
            addCriterion("BONUSDATE >", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BONUSDATE >=", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateLessThan(Timestamp value) {
            addCriterion("BONUSDATE <", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("BONUSDATE <=", value, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BONUSDATE between", value1, value2, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andBonusdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BONUSDATE not between", value1, value2, "bonusdate");
            return (Criteria) this;
        }

        public Criteria andResultidIsNull() {
            addCriterion("RESULTID is null");
            return (Criteria) this;
        }

        public Criteria andResultidIsNotNull() {
            addCriterion("RESULTID is not null");
            return (Criteria) this;
        }

        public Criteria andResultidEqualTo(String value) {
            addCriterion("RESULTID =", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotEqualTo(String value) {
            addCriterion("RESULTID <>", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThan(String value) {
            addCriterion("RESULTID >", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTID >=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThan(String value) {
            addCriterion("RESULTID <", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThanOrEqualTo(String value) {
            addCriterion("RESULTID <=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLike(String value) {
            addCriterion("RESULTID like", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotLike(String value) {
            addCriterion("RESULTID not like", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidIn(List<String> values) {
            addCriterion("RESULTID in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotIn(List<String> values) {
            addCriterion("RESULTID not in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidBetween(String value1, String value2) {
            addCriterion("RESULTID between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotBetween(String value1, String value2) {
            addCriterion("RESULTID not between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CREATEUSERID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CREATEUSERID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CREATEUSERID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CREATEUSERID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CREATEUSERID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CREATEUSERID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CREATEUSERID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CREATEUSERID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CREATEUSERID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("CREATEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("CREATEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("CREATEUSERNAME =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("CREATEUSERNAME <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("CREATEUSERNAME >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("CREATEUSERNAME <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("CREATEUSERNAME like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("CREATEUSERNAME not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("CREATEUSERNAME in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("CREATEUSERNAME not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME not between", value1, value2, "createusername");
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

        public Criteria andObtainidIsNull() {
            addCriterion("OBTAINID is null");
            return (Criteria) this;
        }

        public Criteria andObtainidIsNotNull() {
            addCriterion("OBTAINID is not null");
            return (Criteria) this;
        }

        public Criteria andObtainidEqualTo(String value) {
            addCriterion("OBTAINID =", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidNotEqualTo(String value) {
            addCriterion("OBTAINID <>", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidGreaterThan(String value) {
            addCriterion("OBTAINID >", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidGreaterThanOrEqualTo(String value) {
            addCriterion("OBTAINID >=", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidLessThan(String value) {
            addCriterion("OBTAINID <", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidLessThanOrEqualTo(String value) {
            addCriterion("OBTAINID <=", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidLike(String value) {
            addCriterion("OBTAINID like", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidNotLike(String value) {
            addCriterion("OBTAINID not like", value, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidIn(List<String> values) {
            addCriterion("OBTAINID in", values, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidNotIn(List<String> values) {
            addCriterion("OBTAINID not in", values, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidBetween(String value1, String value2) {
            addCriterion("OBTAINID between", value1, value2, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainidNotBetween(String value1, String value2) {
            addCriterion("OBTAINID not between", value1, value2, "obtainid");
            return (Criteria) this;
        }

        public Criteria andObtainnameIsNull() {
            addCriterion("OBTAINNAME is null");
            return (Criteria) this;
        }

        public Criteria andObtainnameIsNotNull() {
            addCriterion("OBTAINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andObtainnameEqualTo(String value) {
            addCriterion("OBTAINNAME =", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameNotEqualTo(String value) {
            addCriterion("OBTAINNAME <>", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameGreaterThan(String value) {
            addCriterion("OBTAINNAME >", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameGreaterThanOrEqualTo(String value) {
            addCriterion("OBTAINNAME >=", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameLessThan(String value) {
            addCriterion("OBTAINNAME <", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameLessThanOrEqualTo(String value) {
            addCriterion("OBTAINNAME <=", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameLike(String value) {
            addCriterion("OBTAINNAME like", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameNotLike(String value) {
            addCriterion("OBTAINNAME not like", value, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameIn(List<String> values) {
            addCriterion("OBTAINNAME in", values, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameNotIn(List<String> values) {
            addCriterion("OBTAINNAME not in", values, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameBetween(String value1, String value2) {
            addCriterion("OBTAINNAME between", value1, value2, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtainnameNotBetween(String value1, String value2) {
            addCriterion("OBTAINNAME not between", value1, value2, "obtainname");
            return (Criteria) this;
        }

        public Criteria andObtaintypeIsNull() {
            addCriterion("OBTAINTYPE is null");
            return (Criteria) this;
        }

        public Criteria andObtaintypeIsNotNull() {
            addCriterion("OBTAINTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObtaintypeEqualTo(String value) {
            addCriterion("OBTAINTYPE =", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeNotEqualTo(String value) {
            addCriterion("OBTAINTYPE <>", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeGreaterThan(String value) {
            addCriterion("OBTAINTYPE >", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBTAINTYPE >=", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeLessThan(String value) {
            addCriterion("OBTAINTYPE <", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeLessThanOrEqualTo(String value) {
            addCriterion("OBTAINTYPE <=", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeLike(String value) {
            addCriterion("OBTAINTYPE like", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeNotLike(String value) {
            addCriterion("OBTAINTYPE not like", value, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeIn(List<String> values) {
            addCriterion("OBTAINTYPE in", values, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeNotIn(List<String> values) {
            addCriterion("OBTAINTYPE not in", values, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeBetween(String value1, String value2) {
            addCriterion("OBTAINTYPE between", value1, value2, "obtaintype");
            return (Criteria) this;
        }

        public Criteria andObtaintypeNotBetween(String value1, String value2) {
            addCriterion("OBTAINTYPE not between", value1, value2, "obtaintype");
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