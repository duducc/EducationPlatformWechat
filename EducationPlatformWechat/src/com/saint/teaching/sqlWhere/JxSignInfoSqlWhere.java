package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxSignInfoEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
*类注释信息
*表名JX_SIGN_INFO
*表说明实习学员签到信息
  */
public class JxSignInfoSqlWhere extends JxSignInfoEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxSignInfoSqlWhere() {
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
        
        //----------------------------------------------------------------------------------
        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }
        
        //----------------------------------------------------------------------------------
        public Criteria andMarkingIsNull() {
            addCriterion("MARKING is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("MARKING is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(String value) {
            addCriterion("MARKING =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(String value) {
            addCriterion("MARKING <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(String value) {
            addCriterion("MARKING >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(String value) {
            addCriterion("MARKING >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(String value) {
            addCriterion("MARKING <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(String value) {
            addCriterion("MARKING <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLike(String value) {
            addCriterion("MARKING like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotLike(String value) {
            addCriterion("MARKING not like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(List<String> values) {
            addCriterion("MARKING in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(List<String> values) {
            addCriterion("MARKING not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(String value1, String value2) {
            addCriterion("MARKING between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(String value1, String value2) {
            addCriterion("MARKING not between", value1, value2, "marking");
            return (Criteria) this;
        }
        //----------------------------------------------------------------------------------
        
        public Criteria andSigncsIsNull() {
            addCriterion("SIGNCS is null");
            return (Criteria) this;
        }

        public Criteria andSigncsIsNotNull() {
            addCriterion("SIGNCS is not null");
            return (Criteria) this;
        }

        public Criteria andSigncsEqualTo(BigDecimal value) {
            addCriterion("SIGNCS =", value, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsNotEqualTo(BigDecimal value) {
            addCriterion("SIGNCS <>", value, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsGreaterThan(BigDecimal value) {
            addCriterion("SIGNCS >", value, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNCS >=", value, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsLessThan(BigDecimal value) {
            addCriterion("SIGNCS <", value, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNCS <=", value, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsIn(List<BigDecimal> values) {
            addCriterion("SIGNCS in", values, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsNotIn(List<BigDecimal> values) {
            addCriterion("SIGNCS not in", values, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNCS between", value1, value2, "signcs");
            return (Criteria) this;
        }

        public Criteria andSigncsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNCS not between", value1, value2, "signcs");
            return (Criteria) this;
        }

        public Criteria andStatetimeIsNull() {
            addCriterion("STATETIME is null");
            return (Criteria) this;
        }

        public Criteria andStatetimeIsNotNull() {
            addCriterion("STATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andStatetimeEqualTo(String value) {
            addCriterion("STATETIME =", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeNotEqualTo(String value) {
            addCriterion("STATETIME <>", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeGreaterThan(String value) {
            addCriterion("STATETIME >", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("STATETIME >=", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeLessThan(String value) {
            addCriterion("STATETIME <", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeLessThanOrEqualTo(String value) {
            addCriterion("STATETIME <=", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeLike(String value) {
            addCriterion("STATETIME like", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeNotLike(String value) {
            addCriterion("STATETIME not like", value, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeIn(List<String> values) {
            addCriterion("STATETIME in", values, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeNotIn(List<String> values) {
            addCriterion("STATETIME not in", values, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeBetween(String value1, String value2) {
            addCriterion("STATETIME between", value1, value2, "statetime");
            return (Criteria) this;
        }

        public Criteria andStatetimeNotBetween(String value1, String value2) {
            addCriterion("STATETIME not between", value1, value2, "statetime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTimetypeIsNull() {
            addCriterion("TIMETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTimetypeIsNotNull() {
            addCriterion("TIMETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTimetypeEqualTo(String value) {
            addCriterion("TIMETYPE =", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotEqualTo(String value) {
            addCriterion("TIMETYPE <>", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeGreaterThan(String value) {
            addCriterion("TIMETYPE >", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeGreaterThanOrEqualTo(String value) {
            addCriterion("TIMETYPE >=", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLessThan(String value) {
            addCriterion("TIMETYPE <", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLessThanOrEqualTo(String value) {
            addCriterion("TIMETYPE <=", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLike(String value) {
            addCriterion("TIMETYPE like", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotLike(String value) {
            addCriterion("TIMETYPE not like", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeIn(List<String> values) {
            addCriterion("TIMETYPE in", values, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotIn(List<String> values) {
            addCriterion("TIMETYPE not in", values, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeBetween(String value1, String value2) {
            addCriterion("TIMETYPE between", value1, value2, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotBetween(String value1, String value2) {
            addCriterion("TIMETYPE not between", value1, value2, "timetype");
            return (Criteria) this;
        }

        public Criteria andPolitionnameIsNull() {
            addCriterion("POLITIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andPolitionnameIsNotNull() {
            addCriterion("POLITIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPolitionnameEqualTo(String value) {
            addCriterion("POLITIONNAME =", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameNotEqualTo(String value) {
            addCriterion("POLITIONNAME <>", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameGreaterThan(String value) {
            addCriterion("POLITIONNAME >", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameGreaterThanOrEqualTo(String value) {
            addCriterion("POLITIONNAME >=", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameLessThan(String value) {
            addCriterion("POLITIONNAME <", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameLessThanOrEqualTo(String value) {
            addCriterion("POLITIONNAME <=", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameLike(String value) {
            addCriterion("POLITIONNAME like", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameNotLike(String value) {
            addCriterion("POLITIONNAME not like", value, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameIn(List<String> values) {
            addCriterion("POLITIONNAME in", values, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameNotIn(List<String> values) {
            addCriterion("POLITIONNAME not in", values, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameBetween(String value1, String value2) {
            addCriterion("POLITIONNAME between", value1, value2, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionnameNotBetween(String value1, String value2) {
            addCriterion("POLITIONNAME not between", value1, value2, "politionname");
            return (Criteria) this;
        }

        public Criteria andPolitionjdIsNull() {
            addCriterion("POLITIONJD is null");
            return (Criteria) this;
        }

        public Criteria andPolitionjdIsNotNull() {
            addCriterion("POLITIONJD is not null");
            return (Criteria) this;
        }

        public Criteria andPolitionjdEqualTo(String value) {
            addCriterion("POLITIONJD =", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdNotEqualTo(String value) {
            addCriterion("POLITIONJD <>", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdGreaterThan(String value) {
            addCriterion("POLITIONJD >", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdGreaterThanOrEqualTo(String value) {
            addCriterion("POLITIONJD >=", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdLessThan(String value) {
            addCriterion("POLITIONJD <", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdLessThanOrEqualTo(String value) {
            addCriterion("POLITIONJD <=", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdLike(String value) {
            addCriterion("POLITIONJD like", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdNotLike(String value) {
            addCriterion("POLITIONJD not like", value, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdIn(List<String> values) {
            addCriterion("POLITIONJD in", values, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdNotIn(List<String> values) {
            addCriterion("POLITIONJD not in", values, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdBetween(String value1, String value2) {
            addCriterion("POLITIONJD between", value1, value2, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionjdNotBetween(String value1, String value2) {
            addCriterion("POLITIONJD not between", value1, value2, "politionjd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdIsNull() {
            addCriterion("POLITIONWD is null");
            return (Criteria) this;
        }

        public Criteria andPolitionwdIsNotNull() {
            addCriterion("POLITIONWD is not null");
            return (Criteria) this;
        }

        public Criteria andPolitionwdEqualTo(String value) {
            addCriterion("POLITIONWD =", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdNotEqualTo(String value) {
            addCriterion("POLITIONWD <>", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdGreaterThan(String value) {
            addCriterion("POLITIONWD >", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdGreaterThanOrEqualTo(String value) {
            addCriterion("POLITIONWD >=", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdLessThan(String value) {
            addCriterion("POLITIONWD <", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdLessThanOrEqualTo(String value) {
            addCriterion("POLITIONWD <=", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdLike(String value) {
            addCriterion("POLITIONWD like", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdNotLike(String value) {
            addCriterion("POLITIONWD not like", value, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdIn(List<String> values) {
            addCriterion("POLITIONWD in", values, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdNotIn(List<String> values) {
            addCriterion("POLITIONWD not in", values, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdBetween(String value1, String value2) {
            addCriterion("POLITIONWD between", value1, value2, "politionwd");
            return (Criteria) this;
        }

        public Criteria andPolitionwdNotBetween(String value1, String value2) {
            addCriterion("POLITIONWD not between", value1, value2, "politionwd");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(BigDecimal value) {
            addCriterion("SCOPE =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(BigDecimal value) {
            addCriterion("SCOPE <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(BigDecimal value) {
            addCriterion("SCOPE >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCOPE >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(BigDecimal value) {
            addCriterion("SCOPE <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCOPE <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<BigDecimal> values) {
            addCriterion("SCOPE in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<BigDecimal> values) {
            addCriterion("SCOPE not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCOPE between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCOPE not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andWifiipIsNull() {
            addCriterion("WIFIIP is null");
            return (Criteria) this;
        }

        public Criteria andWifiipIsNotNull() {
            addCriterion("WIFIIP is not null");
            return (Criteria) this;
        }

        public Criteria andWifiipEqualTo(String value) {
            addCriterion("WIFIIP =", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotEqualTo(String value) {
            addCriterion("WIFIIP <>", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipGreaterThan(String value) {
            addCriterion("WIFIIP >", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipGreaterThanOrEqualTo(String value) {
            addCriterion("WIFIIP >=", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipLessThan(String value) {
            addCriterion("WIFIIP <", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipLessThanOrEqualTo(String value) {
            addCriterion("WIFIIP <=", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipLike(String value) {
            addCriterion("WIFIIP like", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotLike(String value) {
            addCriterion("WIFIIP not like", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipIn(List<String> values) {
            addCriterion("WIFIIP in", values, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotIn(List<String> values) {
            addCriterion("WIFIIP not in", values, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipBetween(String value1, String value2) {
            addCriterion("WIFIIP between", value1, value2, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotBetween(String value1, String value2) {
            addCriterion("WIFIIP not between", value1, value2, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifinameIsNull() {
            addCriterion("WIFINAME is null");
            return (Criteria) this;
        }

        public Criteria andWifinameIsNotNull() {
            addCriterion("WIFINAME is not null");
            return (Criteria) this;
        }

        public Criteria andWifinameEqualTo(String value) {
            addCriterion("WIFINAME =", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameNotEqualTo(String value) {
            addCriterion("WIFINAME <>", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameGreaterThan(String value) {
            addCriterion("WIFINAME >", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameGreaterThanOrEqualTo(String value) {
            addCriterion("WIFINAME >=", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameLessThan(String value) {
            addCriterion("WIFINAME <", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameLessThanOrEqualTo(String value) {
            addCriterion("WIFINAME <=", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameLike(String value) {
            addCriterion("WIFINAME like", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameNotLike(String value) {
            addCriterion("WIFINAME not like", value, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameIn(List<String> values) {
            addCriterion("WIFINAME in", values, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameNotIn(List<String> values) {
            addCriterion("WIFINAME not in", values, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameBetween(String value1, String value2) {
            addCriterion("WIFINAME between", value1, value2, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifinameNotBetween(String value1, String value2) {
            addCriterion("WIFINAME not between", value1, value2, "wifiname");
            return (Criteria) this;
        }

        public Criteria andWifiremark1IsNull() {
            addCriterion("WIFIREMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andWifiremark1IsNotNull() {
            addCriterion("WIFIREMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andWifiremark1EqualTo(String value) {
            addCriterion("WIFIREMARK1 =", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1NotEqualTo(String value) {
            addCriterion("WIFIREMARK1 <>", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1GreaterThan(String value) {
            addCriterion("WIFIREMARK1 >", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1GreaterThanOrEqualTo(String value) {
            addCriterion("WIFIREMARK1 >=", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1LessThan(String value) {
            addCriterion("WIFIREMARK1 <", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1LessThanOrEqualTo(String value) {
            addCriterion("WIFIREMARK1 <=", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1Like(String value) {
            addCriterion("WIFIREMARK1 like", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1NotLike(String value) {
            addCriterion("WIFIREMARK1 not like", value, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1In(List<String> values) {
            addCriterion("WIFIREMARK1 in", values, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1NotIn(List<String> values) {
            addCriterion("WIFIREMARK1 not in", values, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1Between(String value1, String value2) {
            addCriterion("WIFIREMARK1 between", value1, value2, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark1NotBetween(String value1, String value2) {
            addCriterion("WIFIREMARK1 not between", value1, value2, "wifiremark1");
            return (Criteria) this;
        }

        public Criteria andWifiremark2IsNull() {
            addCriterion("WIFIREMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andWifiremark2IsNotNull() {
            addCriterion("WIFIREMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andWifiremark2EqualTo(String value) {
            addCriterion("WIFIREMARK2 =", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2NotEqualTo(String value) {
            addCriterion("WIFIREMARK2 <>", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2GreaterThan(String value) {
            addCriterion("WIFIREMARK2 >", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2GreaterThanOrEqualTo(String value) {
            addCriterion("WIFIREMARK2 >=", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2LessThan(String value) {
            addCriterion("WIFIREMARK2 <", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2LessThanOrEqualTo(String value) {
            addCriterion("WIFIREMARK2 <=", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2Like(String value) {
            addCriterion("WIFIREMARK2 like", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2NotLike(String value) {
            addCriterion("WIFIREMARK2 not like", value, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2In(List<String> values) {
            addCriterion("WIFIREMARK2 in", values, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2NotIn(List<String> values) {
            addCriterion("WIFIREMARK2 not in", values, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2Between(String value1, String value2) {
            addCriterion("WIFIREMARK2 between", value1, value2, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark2NotBetween(String value1, String value2) {
            addCriterion("WIFIREMARK2 not between", value1, value2, "wifiremark2");
            return (Criteria) this;
        }

        public Criteria andWifiremark3IsNull() {
            addCriterion("WIFIREMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andWifiremark3IsNotNull() {
            addCriterion("WIFIREMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andWifiremark3EqualTo(String value) {
            addCriterion("WIFIREMARK3 =", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3NotEqualTo(String value) {
            addCriterion("WIFIREMARK3 <>", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3GreaterThan(String value) {
            addCriterion("WIFIREMARK3 >", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3GreaterThanOrEqualTo(String value) {
            addCriterion("WIFIREMARK3 >=", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3LessThan(String value) {
            addCriterion("WIFIREMARK3 <", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3LessThanOrEqualTo(String value) {
            addCriterion("WIFIREMARK3 <=", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3Like(String value) {
            addCriterion("WIFIREMARK3 like", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3NotLike(String value) {
            addCriterion("WIFIREMARK3 not like", value, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3In(List<String> values) {
            addCriterion("WIFIREMARK3 in", values, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3NotIn(List<String> values) {
            addCriterion("WIFIREMARK3 not in", values, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3Between(String value1, String value2) {
            addCriterion("WIFIREMARK3 between", value1, value2, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andWifiremark3NotBetween(String value1, String value2) {
            addCriterion("WIFIREMARK3 not between", value1, value2, "wifiremark3");
            return (Criteria) this;
        }

        public Criteria andOpidIsNull() {
            addCriterion("OPID is null");
            return (Criteria) this;
        }

        public Criteria andOpidIsNotNull() {
            addCriterion("OPID is not null");
            return (Criteria) this;
        }

        public Criteria andOpidEqualTo(String value) {
            addCriterion("OPID =", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotEqualTo(String value) {
            addCriterion("OPID <>", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidGreaterThan(String value) {
            addCriterion("OPID >", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidGreaterThanOrEqualTo(String value) {
            addCriterion("OPID >=", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLessThan(String value) {
            addCriterion("OPID <", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLessThanOrEqualTo(String value) {
            addCriterion("OPID <=", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLike(String value) {
            addCriterion("OPID like", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotLike(String value) {
            addCriterion("OPID not like", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidIn(List<String> values) {
            addCriterion("OPID in", values, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotIn(List<String> values) {
            addCriterion("OPID not in", values, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidBetween(String value1, String value2) {
            addCriterion("OPID between", value1, value2, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotBetween(String value1, String value2) {
            addCriterion("OPID not between", value1, value2, "opid");
            return (Criteria) this;
        }

        public Criteria andOpnameIsNull() {
            addCriterion("OPNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpnameIsNotNull() {
            addCriterion("OPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpnameEqualTo(String value) {
            addCriterion("OPNAME =", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotEqualTo(String value) {
            addCriterion("OPNAME <>", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThan(String value) {
            addCriterion("OPNAME >", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPNAME >=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThan(String value) {
            addCriterion("OPNAME <", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThanOrEqualTo(String value) {
            addCriterion("OPNAME <=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLike(String value) {
            addCriterion("OPNAME like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotLike(String value) {
            addCriterion("OPNAME not like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameIn(List<String> values) {
            addCriterion("OPNAME in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotIn(List<String> values) {
            addCriterion("OPNAME not in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameBetween(String value1, String value2) {
            addCriterion("OPNAME between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotBetween(String value1, String value2) {
            addCriterion("OPNAME not between", value1, value2, "opname");
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

        public Criteria andOpdateEqualTo(String value) {
            addCriterion("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(String value) {
            addCriterion("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(String value) {
            addCriterion("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(String value) {
            addCriterion("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(String value) {
            addCriterion("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(String value) {
            addCriterion("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLike(String value) {
            addCriterion("OPDATE like", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotLike(String value) {
            addCriterion("OPDATE not like", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<String> values) {
            addCriterion("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<String> values) {
            addCriterion("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(String value1, String value2) {
            addCriterion("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(String value1, String value2) {
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