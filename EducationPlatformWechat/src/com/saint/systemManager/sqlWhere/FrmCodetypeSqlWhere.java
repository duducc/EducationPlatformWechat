package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmCodetypeEntity;
import java.util.ArrayList;
import java.util.List;

public class FrmCodetypeSqlWhere extends FrmCodetypeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmCodetypeSqlWhere() {
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

        public Criteria andDmlbIsNull() {
            addCriterion("DMLB is null");
            return (Criteria) this;
        }

        public Criteria andDmlbIsNotNull() {
            addCriterion("DMLB is not null");
            return (Criteria) this;
        }

        public Criteria andDmlbEqualTo(String value) {
            addCriterion("DMLB =", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotEqualTo(String value) {
            addCriterion("DMLB <>", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbGreaterThan(String value) {
            addCriterion("DMLB >", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbGreaterThanOrEqualTo(String value) {
            addCriterion("DMLB >=", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbLessThan(String value) {
            addCriterion("DMLB <", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbLessThanOrEqualTo(String value) {
            addCriterion("DMLB <=", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbLike(String value) {
            addCriterion("DMLB like", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotLike(String value) {
            addCriterion("DMLB not like", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbIn(List<String> values) {
            addCriterion("DMLB in", values, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotIn(List<String> values) {
            addCriterion("DMLB not in", values, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbBetween(String value1, String value2) {
            addCriterion("DMLB between", value1, value2, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotBetween(String value1, String value2) {
            addCriterion("DMLB not between", value1, value2, "dmlb");
            return (Criteria) this;
        }

        public Criteria andLbsmIsNull() {
            addCriterion("LBSM is null");
            return (Criteria) this;
        }

        public Criteria andLbsmIsNotNull() {
            addCriterion("LBSM is not null");
            return (Criteria) this;
        }

        public Criteria andLbsmEqualTo(String value) {
            addCriterion("LBSM =", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmNotEqualTo(String value) {
            addCriterion("LBSM <>", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmGreaterThan(String value) {
            addCriterion("LBSM >", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmGreaterThanOrEqualTo(String value) {
            addCriterion("LBSM >=", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmLessThan(String value) {
            addCriterion("LBSM <", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmLessThanOrEqualTo(String value) {
            addCriterion("LBSM <=", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmLike(String value) {
            addCriterion("LBSM like", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmNotLike(String value) {
            addCriterion("LBSM not like", value, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmIn(List<String> values) {
            addCriterion("LBSM in", values, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmNotIn(List<String> values) {
            addCriterion("LBSM not in", values, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmBetween(String value1, String value2) {
            addCriterion("LBSM between", value1, value2, "lbsm");
            return (Criteria) this;
        }

        public Criteria andLbsmNotBetween(String value1, String value2) {
            addCriterion("LBSM not between", value1, value2, "lbsm");
            return (Criteria) this;
        }

        public Criteria andDmcdIsNull() {
            addCriterion("DMCD is null");
            return (Criteria) this;
        }

        public Criteria andDmcdIsNotNull() {
            addCriterion("DMCD is not null");
            return (Criteria) this;
        }

        public Criteria andDmcdEqualTo(Short value) {
            addCriterion("DMCD =", value, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdNotEqualTo(Short value) {
            addCriterion("DMCD <>", value, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdGreaterThan(Short value) {
            addCriterion("DMCD >", value, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdGreaterThanOrEqualTo(Short value) {
            addCriterion("DMCD >=", value, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdLessThan(Short value) {
            addCriterion("DMCD <", value, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdLessThanOrEqualTo(Short value) {
            addCriterion("DMCD <=", value, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdIn(List<Short> values) {
            addCriterion("DMCD in", values, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdNotIn(List<Short> values) {
            addCriterion("DMCD not in", values, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdBetween(Short value1, Short value2) {
            addCriterion("DMCD between", value1, value2, "dmcd");
            return (Criteria) this;
        }

        public Criteria andDmcdNotBetween(Short value1, Short value2) {
            addCriterion("DMCD not between", value1, value2, "dmcd");
            return (Criteria) this;
        }

        public Criteria andLbsxIsNull() {
            addCriterion("LBSX is null");
            return (Criteria) this;
        }

        public Criteria andLbsxIsNotNull() {
            addCriterion("LBSX is not null");
            return (Criteria) this;
        }

        public Criteria andLbsxEqualTo(String value) {
            addCriterion("LBSX =", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxNotEqualTo(String value) {
            addCriterion("LBSX <>", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxGreaterThan(String value) {
            addCriterion("LBSX >", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxGreaterThanOrEqualTo(String value) {
            addCriterion("LBSX >=", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxLessThan(String value) {
            addCriterion("LBSX <", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxLessThanOrEqualTo(String value) {
            addCriterion("LBSX <=", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxLike(String value) {
            addCriterion("LBSX like", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxNotLike(String value) {
            addCriterion("LBSX not like", value, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxIn(List<String> values) {
            addCriterion("LBSX in", values, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxNotIn(List<String> values) {
            addCriterion("LBSX not in", values, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxBetween(String value1, String value2) {
            addCriterion("LBSX between", value1, value2, "lbsx");
            return (Criteria) this;
        }

        public Criteria andLbsxNotBetween(String value1, String value2) {
            addCriterion("LBSX not between", value1, value2, "lbsx");
            return (Criteria) this;
        }

        public Criteria andDmsxIsNull() {
            addCriterion("DMSX is null");
            return (Criteria) this;
        }

        public Criteria andDmsxIsNotNull() {
            addCriterion("DMSX is not null");
            return (Criteria) this;
        }

        public Criteria andDmsxEqualTo(Short value) {
            addCriterion("DMSX =", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotEqualTo(Short value) {
            addCriterion("DMSX <>", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThan(Short value) {
            addCriterion("DMSX >", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThanOrEqualTo(Short value) {
            addCriterion("DMSX >=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThan(Short value) {
            addCriterion("DMSX <", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThanOrEqualTo(Short value) {
            addCriterion("DMSX <=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxIn(List<Short> values) {
            addCriterion("DMSX in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotIn(List<Short> values) {
            addCriterion("DMSX not in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxBetween(Short value1, Short value2) {
            addCriterion("DMSX between", value1, value2, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotBetween(Short value1, Short value2) {
            addCriterion("DMSX not between", value1, value2, "dmsx");
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

        public Criteria andJzncIsNull() {
            addCriterion("JZNC is null");
            return (Criteria) this;
        }

        public Criteria andJzncIsNotNull() {
            addCriterion("JZNC is not null");
            return (Criteria) this;
        }

        public Criteria andJzncEqualTo(String value) {
            addCriterion("JZNC =", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncNotEqualTo(String value) {
            addCriterion("JZNC <>", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncGreaterThan(String value) {
            addCriterion("JZNC >", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncGreaterThanOrEqualTo(String value) {
            addCriterion("JZNC >=", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncLessThan(String value) {
            addCriterion("JZNC <", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncLessThanOrEqualTo(String value) {
            addCriterion("JZNC <=", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncLike(String value) {
            addCriterion("JZNC like", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncNotLike(String value) {
            addCriterion("JZNC not like", value, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncIn(List<String> values) {
            addCriterion("JZNC in", values, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncNotIn(List<String> values) {
            addCriterion("JZNC not in", values, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncBetween(String value1, String value2) {
            addCriterion("JZNC between", value1, value2, "jznc");
            return (Criteria) this;
        }

        public Criteria andJzncNotBetween(String value1, String value2) {
            addCriterion("JZNC not between", value1, value2, "jznc");
            return (Criteria) this;
        }

        public Criteria andDmlxIsNull() {
            addCriterion("DMLX is null");
            return (Criteria) this;
        }

        public Criteria andDmlxIsNotNull() {
            addCriterion("DMLX is not null");
            return (Criteria) this;
        }

        public Criteria andDmlxEqualTo(String value) {
            addCriterion("DMLX =", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxNotEqualTo(String value) {
            addCriterion("DMLX <>", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxGreaterThan(String value) {
            addCriterion("DMLX >", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxGreaterThanOrEqualTo(String value) {
            addCriterion("DMLX >=", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxLessThan(String value) {
            addCriterion("DMLX <", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxLessThanOrEqualTo(String value) {
            addCriterion("DMLX <=", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxLike(String value) {
            addCriterion("DMLX like", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxNotLike(String value) {
            addCriterion("DMLX not like", value, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxIn(List<String> values) {
            addCriterion("DMLX in", values, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxNotIn(List<String> values) {
            addCriterion("DMLX not in", values, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxBetween(String value1, String value2) {
            addCriterion("DMLX between", value1, value2, "dmlx");
            return (Criteria) this;
        }

        public Criteria andDmlxNotBetween(String value1, String value2) {
            addCriterion("DMLX not between", value1, value2, "dmlx");
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