package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmSysuserEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrmSysuserSqlWhere extends FrmSysuserEntity {
    private Page listPage;

    private String bhxj;   //°üº¬ÏÂ¼¶
    
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSysuserSqlWhere() {
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

        public Criteria andYhdhIsNull() {
            addCriterion("YHDH is null");
            return (Criteria) this;
        }

        public Criteria andYhdhIsNotNull() {
            addCriterion("YHDH is not null");
            return (Criteria) this;
        }

        public Criteria andYhdhEqualTo(String value) {
            addCriterion("YHDH =", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotEqualTo(String value) {
            addCriterion("YHDH <>", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhGreaterThan(String value) {
            addCriterion("YHDH >", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhGreaterThanOrEqualTo(String value) {
            addCriterion("YHDH >=", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLessThan(String value) {
            addCriterion("YHDH <", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLessThanOrEqualTo(String value) {
            addCriterion("YHDH <=", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLike(String value) {
            addCriterion("YHDH like", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotLike(String value) {
            addCriterion("YHDH not like", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhIn(List<String> values) {
            addCriterion("YHDH in", values, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotIn(List<String> values) {
            addCriterion("YHDH not in", values, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhBetween(String value1, String value2) {
            addCriterion("YHDH between", value1, value2, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotBetween(String value1, String value2) {
            addCriterion("YHDH not between", value1, value2, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhghIsNull() {
            addCriterion("YHGH is null");
            return (Criteria) this;
        }

        public Criteria andYhghIsNotNull() {
            addCriterion("YHGH is not null");
            return (Criteria) this;
        }

        public Criteria andYhghEqualTo(String value) {
            addCriterion("YHGH =", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghNotEqualTo(String value) {
            addCriterion("YHGH <>", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghGreaterThan(String value) {
            addCriterion("YHGH >", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghGreaterThanOrEqualTo(String value) {
            addCriterion("YHGH >=", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghLessThan(String value) {
            addCriterion("YHGH <", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghLessThanOrEqualTo(String value) {
            addCriterion("YHGH <=", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghLike(String value) {
            addCriterion("YHGH like", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghNotLike(String value) {
            addCriterion("YHGH not like", value, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghIn(List<String> values) {
            addCriterion("YHGH in", values, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghNotIn(List<String> values) {
            addCriterion("YHGH not in", values, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghBetween(String value1, String value2) {
            addCriterion("YHGH between", value1, value2, "yhgh");
            return (Criteria) this;
        }

        public Criteria andYhghNotBetween(String value1, String value2) {
            addCriterion("YHGH not between", value1, value2, "yhgh");
            return (Criteria) this;
        }

        public Criteria andSfzmhmIsNull() {
            addCriterion("SFZMHM is null");
            return (Criteria) this;
        }

        public Criteria andSfzmhmIsNotNull() {
            addCriterion("SFZMHM is not null");
            return (Criteria) this;
        }

        public Criteria andSfzmhmEqualTo(String value) {
            addCriterion("SFZMHM =", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotEqualTo(String value) {
            addCriterion("SFZMHM <>", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmGreaterThan(String value) {
            addCriterion("SFZMHM >", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmGreaterThanOrEqualTo(String value) {
            addCriterion("SFZMHM >=", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmLessThan(String value) {
            addCriterion("SFZMHM <", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmLessThanOrEqualTo(String value) {
            addCriterion("SFZMHM <=", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmLike(String value) {
            addCriterion("SFZMHM like", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotLike(String value) {
            addCriterion("SFZMHM not like", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmIn(List<String> values) {
            addCriterion("SFZMHM in", values, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotIn(List<String> values) {
            addCriterion("SFZMHM not in", values, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmBetween(String value1, String value2) {
            addCriterion("SFZMHM between", value1, value2, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotBetween(String value1, String value2) {
            addCriterion("SFZMHM not between", value1, value2, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andMmIsNull() {
            addCriterion("MM is null");
            return (Criteria) this;
        }

        public Criteria andMmIsNotNull() {
            addCriterion("MM is not null");
            return (Criteria) this;
        }

        public Criteria andMmEqualTo(String value) {
            addCriterion("MM =", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotEqualTo(String value) {
            addCriterion("MM <>", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThan(String value) {
            addCriterion("MM >", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThanOrEqualTo(String value) {
            addCriterion("MM >=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThan(String value) {
            addCriterion("MM <", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThanOrEqualTo(String value) {
            addCriterion("MM <=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLike(String value) {
            addCriterion("MM like", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotLike(String value) {
            addCriterion("MM not like", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmIn(List<String> values) {
            addCriterion("MM in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotIn(List<String> values) {
            addCriterion("MM not in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmBetween(String value1, String value2) {
            addCriterion("MM between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotBetween(String value1, String value2) {
            addCriterion("MM not between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andMmyxqIsNull() {
            addCriterion("MMYXQ is null");
            return (Criteria) this;
        }

        public Criteria andMmyxqIsNotNull() {
            addCriterion("MMYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andMmyxqEqualTo(Date value) {
            addCriterionForJDBCDate("MMYXQ =", value, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("MMYXQ <>", value, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("MMYXQ >", value, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MMYXQ >=", value, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqLessThan(Date value) {
            addCriterionForJDBCDate("MMYXQ <", value, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MMYXQ <=", value, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqIn(List<Date> values) {
            addCriterionForJDBCDate("MMYXQ in", values, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("MMYXQ not in", values, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MMYXQ between", value1, value2, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andMmyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MMYXQ not between", value1, value2, "mmyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqIsNull() {
            addCriterion("YHYXQ is null");
            return (Criteria) this;
        }

        public Criteria andYhyxqIsNotNull() {
            addCriterion("YHYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andYhyxqEqualTo(Date value) {
            addCriterionForJDBCDate("YHYXQ =", value, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("YHYXQ <>", value, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("YHYXQ >", value, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YHYXQ >=", value, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqLessThan(Date value) {
            addCriterionForJDBCDate("YHYXQ <", value, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YHYXQ <=", value, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqIn(List<Date> values) {
            addCriterionForJDBCDate("YHYXQ in", values, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("YHYXQ not in", values, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YHYXQ between", value1, value2, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andYhyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YHYXQ not between", value1, value2, "yhyxq");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNull() {
            addCriterion("GLBM is null");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNotNull() {
            addCriterion("GLBM is not null");
            return (Criteria) this;
        }

        public Criteria andGlbmEqualTo(String value) {
            addCriterion("GLBM =", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotEqualTo(String value) {
            addCriterion("GLBM <>", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThan(String value) {
            addCriterion("GLBM >", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThanOrEqualTo(String value) {
            addCriterion("GLBM >=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThan(String value) {
            addCriterion("GLBM <", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThanOrEqualTo(String value) {
            addCriterion("GLBM <=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLike(String value) {
            addCriterion("GLBM like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotLike(String value) {
            addCriterion("GLBM not like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmIn(List<String> values) {
            addCriterion("GLBM in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotIn(List<String> values) {
            addCriterion("GLBM not in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmBetween(String value1, String value2) {
            addCriterion("GLBM between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotBetween(String value1, String value2) {
            addCriterion("GLBM not between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andYhjbIsNull() {
            addCriterion("YHJB is null");
            return (Criteria) this;
        }

        public Criteria andYhjbIsNotNull() {
            addCriterion("YHJB is not null");
            return (Criteria) this;
        }

        public Criteria andYhjbEqualTo(String value) {
            addCriterion("YHJB =", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotEqualTo(String value) {
            addCriterion("YHJB <>", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbGreaterThan(String value) {
            addCriterion("YHJB >", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbGreaterThanOrEqualTo(String value) {
            addCriterion("YHJB >=", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbLessThan(String value) {
            addCriterion("YHJB <", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbLessThanOrEqualTo(String value) {
            addCriterion("YHJB <=", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbLike(String value) {
            addCriterion("YHJB like", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotLike(String value) {
            addCriterion("YHJB not like", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbIn(List<String> values) {
            addCriterion("YHJB in", values, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotIn(List<String> values) {
            addCriterion("YHJB not in", values, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbBetween(String value1, String value2) {
            addCriterion("YHJB between", value1, value2, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotBetween(String value1, String value2) {
            addCriterion("YHJB not between", value1, value2, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhlbIsNull() {
            addCriterion("YHLB is null");
            return (Criteria) this;
        }

        public Criteria andYhlbIsNotNull() {
            addCriterion("YHLB is not null");
            return (Criteria) this;
        }

        public Criteria andYhlbEqualTo(String value) {
            addCriterion("YHLB =", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotEqualTo(String value) {
            addCriterion("YHLB <>", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbGreaterThan(String value) {
            addCriterion("YHLB >", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbGreaterThanOrEqualTo(String value) {
            addCriterion("YHLB >=", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLessThan(String value) {
            addCriterion("YHLB <", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLessThanOrEqualTo(String value) {
            addCriterion("YHLB <=", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLike(String value) {
            addCriterion("YHLB like", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotLike(String value) {
            addCriterion("YHLB not like", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbIn(List<String> values) {
            addCriterion("YHLB in", values, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotIn(List<String> values) {
            addCriterion("YHLB not in", values, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbBetween(String value1, String value2) {
            addCriterion("YHLB between", value1, value2, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotBetween(String value1, String value2) {
            addCriterion("YHLB not between", value1, value2, "yhlb");
            return (Criteria) this;
        }

        public Criteria andQxmsIsNull() {
            addCriterion("QXMS is null");
            return (Criteria) this;
        }

        public Criteria andQxmsIsNotNull() {
            addCriterion("QXMS is not null");
            return (Criteria) this;
        }

        public Criteria andQxmsEqualTo(String value) {
            addCriterion("QXMS =", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsNotEqualTo(String value) {
            addCriterion("QXMS <>", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsGreaterThan(String value) {
            addCriterion("QXMS >", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsGreaterThanOrEqualTo(String value) {
            addCriterion("QXMS >=", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsLessThan(String value) {
            addCriterion("QXMS <", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsLessThanOrEqualTo(String value) {
            addCriterion("QXMS <=", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsLike(String value) {
            addCriterion("QXMS like", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsNotLike(String value) {
            addCriterion("QXMS not like", value, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsIn(List<String> values) {
            addCriterion("QXMS in", values, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsNotIn(List<String> values) {
            addCriterion("QXMS not in", values, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsBetween(String value1, String value2) {
            addCriterion("QXMS between", value1, value2, "qxms");
            return (Criteria) this;
        }

        public Criteria andQxmsNotBetween(String value1, String value2) {
            addCriterion("QXMS not between", value1, value2, "qxms");
            return (Criteria) this;
        }

        public Criteria andIpstartIsNull() {
            addCriterion("IPSTART is null");
            return (Criteria) this;
        }

        public Criteria andIpstartIsNotNull() {
            addCriterion("IPSTART is not null");
            return (Criteria) this;
        }

        public Criteria andIpstartEqualTo(String value) {
            addCriterion("IPSTART =", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartNotEqualTo(String value) {
            addCriterion("IPSTART <>", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartGreaterThan(String value) {
            addCriterion("IPSTART >", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartGreaterThanOrEqualTo(String value) {
            addCriterion("IPSTART >=", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartLessThan(String value) {
            addCriterion("IPSTART <", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartLessThanOrEqualTo(String value) {
            addCriterion("IPSTART <=", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartLike(String value) {
            addCriterion("IPSTART like", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartNotLike(String value) {
            addCriterion("IPSTART not like", value, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartIn(List<String> values) {
            addCriterion("IPSTART in", values, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartNotIn(List<String> values) {
            addCriterion("IPSTART not in", values, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartBetween(String value1, String value2) {
            addCriterion("IPSTART between", value1, value2, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpstartNotBetween(String value1, String value2) {
            addCriterion("IPSTART not between", value1, value2, "ipstart");
            return (Criteria) this;
        }

        public Criteria andIpendIsNull() {
            addCriterion("IPEND is null");
            return (Criteria) this;
        }

        public Criteria andIpendIsNotNull() {
            addCriterion("IPEND is not null");
            return (Criteria) this;
        }

        public Criteria andIpendEqualTo(String value) {
            addCriterion("IPEND =", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendNotEqualTo(String value) {
            addCriterion("IPEND <>", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendGreaterThan(String value) {
            addCriterion("IPEND >", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendGreaterThanOrEqualTo(String value) {
            addCriterion("IPEND >=", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendLessThan(String value) {
            addCriterion("IPEND <", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendLessThanOrEqualTo(String value) {
            addCriterion("IPEND <=", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendLike(String value) {
            addCriterion("IPEND like", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendNotLike(String value) {
            addCriterion("IPEND not like", value, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendIn(List<String> values) {
            addCriterion("IPEND in", values, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendNotIn(List<String> values) {
            addCriterion("IPEND not in", values, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendBetween(String value1, String value2) {
            addCriterion("IPEND between", value1, value2, "ipend");
            return (Criteria) this;
        }

        public Criteria andIpendNotBetween(String value1, String value2) {
            addCriterion("IPEND not between", value1, value2, "ipend");
            return (Criteria) this;
        }

        public Criteria andIp1IsNull() {
            addCriterion("IP1 is null");
            return (Criteria) this;
        }

        public Criteria andIp1IsNotNull() {
            addCriterion("IP1 is not null");
            return (Criteria) this;
        }

        public Criteria andIp1EqualTo(String value) {
            addCriterion("IP1 =", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotEqualTo(String value) {
            addCriterion("IP1 <>", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1GreaterThan(String value) {
            addCriterion("IP1 >", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1GreaterThanOrEqualTo(String value) {
            addCriterion("IP1 >=", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1LessThan(String value) {
            addCriterion("IP1 <", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1LessThanOrEqualTo(String value) {
            addCriterion("IP1 <=", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1Like(String value) {
            addCriterion("IP1 like", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotLike(String value) {
            addCriterion("IP1 not like", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1In(List<String> values) {
            addCriterion("IP1 in", values, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotIn(List<String> values) {
            addCriterion("IP1 not in", values, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1Between(String value1, String value2) {
            addCriterion("IP1 between", value1, value2, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotBetween(String value1, String value2) {
            addCriterion("IP1 not between", value1, value2, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp2IsNull() {
            addCriterion("IP2 is null");
            return (Criteria) this;
        }

        public Criteria andIp2IsNotNull() {
            addCriterion("IP2 is not null");
            return (Criteria) this;
        }

        public Criteria andIp2EqualTo(String value) {
            addCriterion("IP2 =", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotEqualTo(String value) {
            addCriterion("IP2 <>", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2GreaterThan(String value) {
            addCriterion("IP2 >", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2GreaterThanOrEqualTo(String value) {
            addCriterion("IP2 >=", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2LessThan(String value) {
            addCriterion("IP2 <", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2LessThanOrEqualTo(String value) {
            addCriterion("IP2 <=", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2Like(String value) {
            addCriterion("IP2 like", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotLike(String value) {
            addCriterion("IP2 not like", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2In(List<String> values) {
            addCriterion("IP2 in", values, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotIn(List<String> values) {
            addCriterion("IP2 not in", values, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2Between(String value1, String value2) {
            addCriterion("IP2 between", value1, value2, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotBetween(String value1, String value2) {
            addCriterion("IP2 not between", value1, value2, "ip2");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("MAC like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("MAC not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIsNull() {
            addCriterion("ZHDLSJ is null");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIsNotNull() {
            addCriterion("ZHDLSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZhdlsjEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ =", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ <>", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjGreaterThan(Date value) {
            addCriterionForJDBCDate("ZHDLSJ >", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ >=", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjLessThan(Date value) {
            addCriterionForJDBCDate("ZHDLSJ <", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ <=", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIn(List<Date> values) {
            addCriterionForJDBCDate("ZHDLSJ in", values, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHDLSJ not in", values, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHDLSJ between", value1, value2, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHDLSJ not between", value1, value2, "zhdlsj");
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

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andSfglyIsNull() {
            addCriterion("SFGLY is null");
            return (Criteria) this;
        }

        public Criteria andSfglyIsNotNull() {
            addCriterion("SFGLY is not null");
            return (Criteria) this;
        }

        public Criteria andSfglyEqualTo(String value) {
            addCriterion("SFGLY =", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyNotEqualTo(String value) {
            addCriterion("SFGLY <>", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyGreaterThan(String value) {
            addCriterion("SFGLY >", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyGreaterThanOrEqualTo(String value) {
            addCriterion("SFGLY >=", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyLessThan(String value) {
            addCriterion("SFGLY <", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyLessThanOrEqualTo(String value) {
            addCriterion("SFGLY <=", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyLike(String value) {
            addCriterion("SFGLY like", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyNotLike(String value) {
            addCriterion("SFGLY not like", value, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyIn(List<String> values) {
            addCriterion("SFGLY in", values, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyNotIn(List<String> values) {
            addCriterion("SFGLY not in", values, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyBetween(String value1, String value2) {
            addCriterion("SFGLY between", value1, value2, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfglyNotBetween(String value1, String value2) {
            addCriterion("SFGLY not between", value1, value2, "sfgly");
            return (Criteria) this;
        }

        public Criteria andSfxzIsNull() {
            addCriterion("SFXZ is null");
            return (Criteria) this;
        }

        public Criteria andSfxzIsNotNull() {
            addCriterion("SFXZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfxzEqualTo(String value) {
            addCriterion("SFXZ =", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzNotEqualTo(String value) {
            addCriterion("SFXZ <>", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzGreaterThan(String value) {
            addCriterion("SFXZ >", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzGreaterThanOrEqualTo(String value) {
            addCriterion("SFXZ >=", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzLessThan(String value) {
            addCriterion("SFXZ <", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzLessThanOrEqualTo(String value) {
            addCriterion("SFXZ <=", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzLike(String value) {
            addCriterion("SFXZ like", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzNotLike(String value) {
            addCriterion("SFXZ not like", value, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzIn(List<String> values) {
            addCriterion("SFXZ in", values, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzNotIn(List<String> values) {
            addCriterion("SFXZ not in", values, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzBetween(String value1, String value2) {
            addCriterion("SFXZ between", value1, value2, "sfxz");
            return (Criteria) this;
        }

        public Criteria andSfxzNotBetween(String value1, String value2) {
            addCriterion("SFXZ not between", value1, value2, "sfxz");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
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

	public String getBhxj() {
		return bhxj;
	}

	public void setBhxj(String bhxj) {
		this.bhxj = bhxj;
	}
}