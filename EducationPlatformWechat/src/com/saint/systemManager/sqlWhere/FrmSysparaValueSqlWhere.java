package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmSysparaValueEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrmSysparaValueSqlWhere extends FrmSysparaValueEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSysparaValueSqlWhere() {
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

        public Criteria andXtlbIsNull() {
            addCriterion("XTLB is null");
            return (Criteria) this;
        }

        public Criteria andXtlbIsNotNull() {
            addCriterion("XTLB is not null");
            return (Criteria) this;
        }

        public Criteria andXtlbEqualTo(String value) {
            addCriterion("XTLB =", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotEqualTo(String value) {
            addCriterion("XTLB <>", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbGreaterThan(String value) {
            addCriterion("XTLB >", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbGreaterThanOrEqualTo(String value) {
            addCriterion("XTLB >=", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbLessThan(String value) {
            addCriterion("XTLB <", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbLessThanOrEqualTo(String value) {
            addCriterion("XTLB <=", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbLike(String value) {
            addCriterion("XTLB like", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotLike(String value) {
            addCriterion("XTLB not like", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbIn(List<String> values) {
            addCriterion("XTLB in", values, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotIn(List<String> values) {
            addCriterion("XTLB not in", values, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbBetween(String value1, String value2) {
            addCriterion("XTLB between", value1, value2, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotBetween(String value1, String value2) {
            addCriterion("XTLB not between", value1, value2, "xtlb");
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

        public Criteria andGjzIsNull() {
            addCriterion("GJZ is null");
            return (Criteria) this;
        }

        public Criteria andGjzIsNotNull() {
            addCriterion("GJZ is not null");
            return (Criteria) this;
        }

        public Criteria andGjzEqualTo(String value) {
            addCriterion("GJZ =", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzNotEqualTo(String value) {
            addCriterion("GJZ <>", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzGreaterThan(String value) {
            addCriterion("GJZ >", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzGreaterThanOrEqualTo(String value) {
            addCriterion("GJZ >=", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzLessThan(String value) {
            addCriterion("GJZ <", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzLessThanOrEqualTo(String value) {
            addCriterion("GJZ <=", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzLike(String value) {
            addCriterion("GJZ like", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzNotLike(String value) {
            addCriterion("GJZ not like", value, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzIn(List<String> values) {
            addCriterion("GJZ in", values, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzNotIn(List<String> values) {
            addCriterion("GJZ not in", values, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzBetween(String value1, String value2) {
            addCriterion("GJZ between", value1, value2, "gjz");
            return (Criteria) this;
        }

        public Criteria andGjzNotBetween(String value1, String value2) {
            addCriterion("GJZ not between", value1, value2, "gjz");
            return (Criteria) this;
        }

        public Criteria andCszIsNull() {
            addCriterion("CSZ is null");
            return (Criteria) this;
        }

        public Criteria andCszIsNotNull() {
            addCriterion("CSZ is not null");
            return (Criteria) this;
        }

        public Criteria andCszEqualTo(String value) {
            addCriterion("CSZ =", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotEqualTo(String value) {
            addCriterion("CSZ <>", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszGreaterThan(String value) {
            addCriterion("CSZ >", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszGreaterThanOrEqualTo(String value) {
            addCriterion("CSZ >=", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszLessThan(String value) {
            addCriterion("CSZ <", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszLessThanOrEqualTo(String value) {
            addCriterion("CSZ <=", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszLike(String value) {
            addCriterion("CSZ like", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotLike(String value) {
            addCriterion("CSZ not like", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszIn(List<String> values) {
            addCriterion("CSZ in", values, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotIn(List<String> values) {
            addCriterion("CSZ not in", values, "csz");
            return (Criteria) this;
        }

        public Criteria andCszBetween(String value1, String value2) {
            addCriterion("CSZ between", value1, value2, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotBetween(String value1, String value2) {
            addCriterion("CSZ not between", value1, value2, "csz");
            return (Criteria) this;
        }

        public Criteria andJywIsNull() {
            addCriterion("JYW is null");
            return (Criteria) this;
        }

        public Criteria andJywIsNotNull() {
            addCriterion("JYW is not null");
            return (Criteria) this;
        }

        public Criteria andJywEqualTo(String value) {
            addCriterion("JYW =", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotEqualTo(String value) {
            addCriterion("JYW <>", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywGreaterThan(String value) {
            addCriterion("JYW >", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywGreaterThanOrEqualTo(String value) {
            addCriterion("JYW >=", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLessThan(String value) {
            addCriterion("JYW <", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLessThanOrEqualTo(String value) {
            addCriterion("JYW <=", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLike(String value) {
            addCriterion("JYW like", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotLike(String value) {
            addCriterion("JYW not like", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywIn(List<String> values) {
            addCriterion("JYW in", values, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotIn(List<String> values) {
            addCriterion("JYW not in", values, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywBetween(String value1, String value2) {
            addCriterion("JYW between", value1, value2, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotBetween(String value1, String value2) {
            addCriterion("JYW not between", value1, value2, "jyw");
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