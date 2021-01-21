package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_QUESTIONNAIRE_TEST
*表说明学员分数明细
  */
public class JxQuestionnaireTestSqlWhere extends JxQuestionnaireTestEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxQuestionnaireTestSqlWhere() {
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

        public Criteria andQuestionidIsNull() {
            addCriterion("QUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("QUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(String value) {
            addCriterion("QUESTIONID =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(String value) {
            addCriterion("QUESTIONID <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(String value) {
            addCriterion("QUESTIONID >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONID >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(String value) {
            addCriterion("QUESTIONID <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(String value) {
            addCriterion("QUESTIONID <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLike(String value) {
            addCriterion("QUESTIONID like", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotLike(String value) {
            addCriterion("QUESTIONID not like", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<String> values) {
            addCriterion("QUESTIONID in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<String> values) {
            addCriterion("QUESTIONID not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(String value1, String value2) {
            addCriterion("QUESTIONID between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(String value1, String value2) {
            addCriterion("QUESTIONID not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andSxhIsNull() {
            addCriterion("SXH is null");
            return (Criteria) this;
        }

        public Criteria andSxhIsNotNull() {
            addCriterion("SXH is not null");
            return (Criteria) this;
        }

        public Criteria andSxhEqualTo(BigDecimal value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(BigDecimal value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(BigDecimal value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(BigDecimal value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<BigDecimal> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<BigDecimal> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andTxIsNull() {
            addCriterion("TX is null");
            return (Criteria) this;
        }

        public Criteria andTxIsNotNull() {
            addCriterion("TX is not null");
            return (Criteria) this;
        }

        public Criteria andTxEqualTo(String value) {
            addCriterion("TX =", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxNotEqualTo(String value) {
            addCriterion("TX <>", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxGreaterThan(String value) {
            addCriterion("TX >", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxGreaterThanOrEqualTo(String value) {
            addCriterion("TX >=", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxLessThan(String value) {
            addCriterion("TX <", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxLessThanOrEqualTo(String value) {
            addCriterion("TX <=", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxLike(String value) {
            addCriterion("TX like", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxNotLike(String value) {
            addCriterion("TX not like", value, "tx");
            return (Criteria) this;
        }

        public Criteria andTxIn(List<String> values) {
            addCriterion("TX in", values, "tx");
            return (Criteria) this;
        }

        public Criteria andTxNotIn(List<String> values) {
            addCriterion("TX not in", values, "tx");
            return (Criteria) this;
        }

        public Criteria andTxBetween(String value1, String value2) {
            addCriterion("TX between", value1, value2, "tx");
            return (Criteria) this;
        }

        public Criteria andTxNotBetween(String value1, String value2) {
            addCriterion("TX not between", value1, value2, "tx");
            return (Criteria) this;
        }

        public Criteria andWjlbIsNull() {
            addCriterion("WJLB is null");
            return (Criteria) this;
        }

        public Criteria andWjlbIsNotNull() {
            addCriterion("WJLB is not null");
            return (Criteria) this;
        }

        public Criteria andWjlbEqualTo(String value) {
            addCriterion("WJLB =", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotEqualTo(String value) {
            addCriterion("WJLB <>", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbGreaterThan(String value) {
            addCriterion("WJLB >", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbGreaterThanOrEqualTo(String value) {
            addCriterion("WJLB >=", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbLessThan(String value) {
            addCriterion("WJLB <", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbLessThanOrEqualTo(String value) {
            addCriterion("WJLB <=", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbLike(String value) {
            addCriterion("WJLB like", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotLike(String value) {
            addCriterion("WJLB not like", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbIn(List<String> values) {
            addCriterion("WJLB in", values, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotIn(List<String> values) {
            addCriterion("WJLB not in", values, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbBetween(String value1, String value2) {
            addCriterion("WJLB between", value1, value2, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotBetween(String value1, String value2) {
            addCriterion("WJLB not between", value1, value2, "wjlb");
            return (Criteria) this;
        }

        public Criteria andNdIsNull() {
            addCriterion("ND is null");
            return (Criteria) this;
        }

        public Criteria andNdIsNotNull() {
            addCriterion("ND is not null");
            return (Criteria) this;
        }

        public Criteria andNdEqualTo(String value) {
            addCriterion("ND =", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotEqualTo(String value) {
            addCriterion("ND <>", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThan(String value) {
            addCriterion("ND >", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThanOrEqualTo(String value) {
            addCriterion("ND >=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThan(String value) {
            addCriterion("ND <", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThanOrEqualTo(String value) {
            addCriterion("ND <=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLike(String value) {
            addCriterion("ND like", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotLike(String value) {
            addCriterion("ND not like", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdIn(List<String> values) {
            addCriterion("ND in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotIn(List<String> values) {
            addCriterion("ND not in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdBetween(String value1, String value2) {
            addCriterion("ND between", value1, value2, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotBetween(String value1, String value2) {
            addCriterion("ND not between", value1, value2, "nd");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNull() {
            addCriterion("SFYX is null");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNotNull() {
            addCriterion("SFYX is not null");
            return (Criteria) this;
        }

        public Criteria andSfyxEqualTo(String value) {
            addCriterion("SFYX =", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotEqualTo(String value) {
            addCriterion("SFYX <>", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThan(String value) {
            addCriterion("SFYX >", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThanOrEqualTo(String value) {
            addCriterion("SFYX >=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThan(String value) {
            addCriterion("SFYX <", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThanOrEqualTo(String value) {
            addCriterion("SFYX <=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLike(String value) {
            addCriterion("SFYX like", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotLike(String value) {
            addCriterion("SFYX not like", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxIn(List<String> values) {
            addCriterion("SFYX in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotIn(List<String> values) {
            addCriterion("SFYX not in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxBetween(String value1, String value2) {
            addCriterion("SFYX between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotBetween(String value1, String value2) {
            addCriterion("SFYX not between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andWtIsNull() {
            addCriterion("WT is null");
            return (Criteria) this;
        }

        public Criteria andWtIsNotNull() {
            addCriterion("WT is not null");
            return (Criteria) this;
        }

        public Criteria andWtEqualTo(String value) {
            addCriterion("WT =", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotEqualTo(String value) {
            addCriterion("WT <>", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThan(String value) {
            addCriterion("WT >", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThanOrEqualTo(String value) {
            addCriterion("WT >=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThan(String value) {
            addCriterion("WT <", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThanOrEqualTo(String value) {
            addCriterion("WT <=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLike(String value) {
            addCriterion("WT like", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotLike(String value) {
            addCriterion("WT not like", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtIn(List<String> values) {
            addCriterion("WT in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotIn(List<String> values) {
            addCriterion("WT not in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtBetween(String value1, String value2) {
            addCriterion("WT between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotBetween(String value1, String value2) {
            addCriterion("WT not between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andWtdasxIsNull() {
            addCriterion("WTDASX is null");
            return (Criteria) this;
        }

        public Criteria andWtdasxIsNotNull() {
            addCriterion("WTDASX is not null");
            return (Criteria) this;
        }

        public Criteria andWtdasxEqualTo(String value) {
            addCriterion("WTDASX =", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxNotEqualTo(String value) {
            addCriterion("WTDASX <>", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxGreaterThan(String value) {
            addCriterion("WTDASX >", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxGreaterThanOrEqualTo(String value) {
            addCriterion("WTDASX >=", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxLessThan(String value) {
            addCriterion("WTDASX <", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxLessThanOrEqualTo(String value) {
            addCriterion("WTDASX <=", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxLike(String value) {
            addCriterion("WTDASX like", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxNotLike(String value) {
            addCriterion("WTDASX not like", value, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxIn(List<String> values) {
            addCriterion("WTDASX in", values, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxNotIn(List<String> values) {
            addCriterion("WTDASX not in", values, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxBetween(String value1, String value2) {
            addCriterion("WTDASX between", value1, value2, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdasxNotBetween(String value1, String value2) {
            addCriterion("WTDASX not between", value1, value2, "wtdasx");
            return (Criteria) this;
        }

        public Criteria andWtdaIsNull() {
            addCriterion("WTDA is null");
            return (Criteria) this;
        }

        public Criteria andWtdaIsNotNull() {
            addCriterion("WTDA is not null");
            return (Criteria) this;
        }

        public Criteria andWtdaEqualTo(String value) {
            addCriterion("WTDA =", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotEqualTo(String value) {
            addCriterion("WTDA <>", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaGreaterThan(String value) {
            addCriterion("WTDA >", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaGreaterThanOrEqualTo(String value) {
            addCriterion("WTDA >=", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaLessThan(String value) {
            addCriterion("WTDA <", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaLessThanOrEqualTo(String value) {
            addCriterion("WTDA <=", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaLike(String value) {
            addCriterion("WTDA like", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotLike(String value) {
            addCriterion("WTDA not like", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaIn(List<String> values) {
            addCriterion("WTDA in", values, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotIn(List<String> values) {
            addCriterion("WTDA not in", values, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaBetween(String value1, String value2) {
            addCriterion("WTDA between", value1, value2, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotBetween(String value1, String value2) {
            addCriterion("WTDA not between", value1, value2, "wtda");
            return (Criteria) this;
        }

        public Criteria andBzdaIsNull() {
            addCriterion("BZDA is null");
            return (Criteria) this;
        }

        public Criteria andBzdaIsNotNull() {
            addCriterion("BZDA is not null");
            return (Criteria) this;
        }

        public Criteria andBzdaEqualTo(String value) {
            addCriterion("BZDA =", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaNotEqualTo(String value) {
            addCriterion("BZDA <>", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaGreaterThan(String value) {
            addCriterion("BZDA >", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaGreaterThanOrEqualTo(String value) {
            addCriterion("BZDA >=", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaLessThan(String value) {
            addCriterion("BZDA <", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaLessThanOrEqualTo(String value) {
            addCriterion("BZDA <=", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaLike(String value) {
            addCriterion("BZDA like", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaNotLike(String value) {
            addCriterion("BZDA not like", value, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaIn(List<String> values) {
            addCriterion("BZDA in", values, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaNotIn(List<String> values) {
            addCriterion("BZDA not in", values, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaBetween(String value1, String value2) {
            addCriterion("BZDA between", value1, value2, "bzda");
            return (Criteria) this;
        }

        public Criteria andBzdaNotBetween(String value1, String value2) {
            addCriterion("BZDA not between", value1, value2, "bzda");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("DEPID is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("DEPID is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(String value) {
            addCriterion("DEPID =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(String value) {
            addCriterion("DEPID <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(String value) {
            addCriterion("DEPID >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPID >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(String value) {
            addCriterion("DEPID <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(String value) {
            addCriterion("DEPID <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLike(String value) {
            addCriterion("DEPID like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotLike(String value) {
            addCriterion("DEPID not like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<String> values) {
            addCriterion("DEPID in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<String> values) {
            addCriterion("DEPID not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(String value1, String value2) {
            addCriterion("DEPID between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(String value1, String value2) {
            addCriterion("DEPID not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNull() {
            addCriterion("DEPNAME is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("DEPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("DEPNAME =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("DEPNAME <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("DEPNAME >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPNAME >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("DEPNAME <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("DEPNAME <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("DEPNAME like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("DEPNAME not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("DEPNAME in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("DEPNAME not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("DEPNAME between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("DEPNAME not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andCtridIsNull() {
            addCriterion("CTRID is null");
            return (Criteria) this;
        }

        public Criteria andCtridIsNotNull() {
            addCriterion("CTRID is not null");
            return (Criteria) this;
        }

        public Criteria andCtridEqualTo(String value) {
            addCriterion("CTRID =", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridNotEqualTo(String value) {
            addCriterion("CTRID <>", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridGreaterThan(String value) {
            addCriterion("CTRID >", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridGreaterThanOrEqualTo(String value) {
            addCriterion("CTRID >=", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridLessThan(String value) {
            addCriterion("CTRID <", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridLessThanOrEqualTo(String value) {
            addCriterion("CTRID <=", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridLike(String value) {
            addCriterion("CTRID like", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridNotLike(String value) {
            addCriterion("CTRID not like", value, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridIn(List<String> values) {
            addCriterion("CTRID in", values, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridNotIn(List<String> values) {
            addCriterion("CTRID not in", values, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridBetween(String value1, String value2) {
            addCriterion("CTRID between", value1, value2, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtridNotBetween(String value1, String value2) {
            addCriterion("CTRID not between", value1, value2, "ctrid");
            return (Criteria) this;
        }

        public Criteria andCtrnameIsNull() {
            addCriterion("CTRNAME is null");
            return (Criteria) this;
        }

        public Criteria andCtrnameIsNotNull() {
            addCriterion("CTRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCtrnameEqualTo(String value) {
            addCriterion("CTRNAME =", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameNotEqualTo(String value) {
            addCriterion("CTRNAME <>", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameGreaterThan(String value) {
            addCriterion("CTRNAME >", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameGreaterThanOrEqualTo(String value) {
            addCriterion("CTRNAME >=", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameLessThan(String value) {
            addCriterion("CTRNAME <", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameLessThanOrEqualTo(String value) {
            addCriterion("CTRNAME <=", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameLike(String value) {
            addCriterion("CTRNAME like", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameNotLike(String value) {
            addCriterion("CTRNAME not like", value, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameIn(List<String> values) {
            addCriterion("CTRNAME in", values, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameNotIn(List<String> values) {
            addCriterion("CTRNAME not in", values, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameBetween(String value1, String value2) {
            addCriterion("CTRNAME between", value1, value2, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCtrnameNotBetween(String value1, String value2) {
            addCriterion("CTRNAME not between", value1, value2, "ctrname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Timestamp value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Timestamp value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Timestamp value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Timestamp value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Timestamp value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Timestamp value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Timestamp value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
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