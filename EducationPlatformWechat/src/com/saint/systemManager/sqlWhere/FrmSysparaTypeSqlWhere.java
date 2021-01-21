package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import java.util.ArrayList;
import java.util.List;

public class FrmSysparaTypeSqlWhere extends FrmSysparaTypeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSysparaTypeSqlWhere() {
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

        public Criteria andCslxIsNull() {
            addCriterion("CSLX is null");
            return (Criteria) this;
        }

        public Criteria andCslxIsNotNull() {
            addCriterion("CSLX is not null");
            return (Criteria) this;
        }

        public Criteria andCslxEqualTo(String value) {
            addCriterion("CSLX =", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxNotEqualTo(String value) {
            addCriterion("CSLX <>", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxGreaterThan(String value) {
            addCriterion("CSLX >", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxGreaterThanOrEqualTo(String value) {
            addCriterion("CSLX >=", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxLessThan(String value) {
            addCriterion("CSLX <", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxLessThanOrEqualTo(String value) {
            addCriterion("CSLX <=", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxLike(String value) {
            addCriterion("CSLX like", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxNotLike(String value) {
            addCriterion("CSLX not like", value, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxIn(List<String> values) {
            addCriterion("CSLX in", values, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxNotIn(List<String> values) {
            addCriterion("CSLX not in", values, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxBetween(String value1, String value2) {
            addCriterion("CSLX between", value1, value2, "cslx");
            return (Criteria) this;
        }

        public Criteria andCslxNotBetween(String value1, String value2) {
            addCriterion("CSLX not between", value1, value2, "cslx");
            return (Criteria) this;
        }

        public Criteria andCsmcIsNull() {
            addCriterion("CSMC is null");
            return (Criteria) this;
        }

        public Criteria andCsmcIsNotNull() {
            addCriterion("CSMC is not null");
            return (Criteria) this;
        }

        public Criteria andCsmcEqualTo(String value) {
            addCriterion("CSMC =", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotEqualTo(String value) {
            addCriterion("CSMC <>", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcGreaterThan(String value) {
            addCriterion("CSMC >", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcGreaterThanOrEqualTo(String value) {
            addCriterion("CSMC >=", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcLessThan(String value) {
            addCriterion("CSMC <", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcLessThanOrEqualTo(String value) {
            addCriterion("CSMC <=", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcLike(String value) {
            addCriterion("CSMC like", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotLike(String value) {
            addCriterion("CSMC not like", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcIn(List<String> values) {
            addCriterion("CSMC in", values, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotIn(List<String> values) {
            addCriterion("CSMC not in", values, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcBetween(String value1, String value2) {
            addCriterion("CSMC between", value1, value2, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotBetween(String value1, String value2) {
            addCriterion("CSMC not between", value1, value2, "csmc");
            return (Criteria) this;
        }

        public Criteria andCssmIsNull() {
            addCriterion("CSSM is null");
            return (Criteria) this;
        }

        public Criteria andCssmIsNotNull() {
            addCriterion("CSSM is not null");
            return (Criteria) this;
        }

        public Criteria andCssmEqualTo(String value) {
            addCriterion("CSSM =", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmNotEqualTo(String value) {
            addCriterion("CSSM <>", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmGreaterThan(String value) {
            addCriterion("CSSM >", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmGreaterThanOrEqualTo(String value) {
            addCriterion("CSSM >=", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmLessThan(String value) {
            addCriterion("CSSM <", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmLessThanOrEqualTo(String value) {
            addCriterion("CSSM <=", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmLike(String value) {
            addCriterion("CSSM like", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmNotLike(String value) {
            addCriterion("CSSM not like", value, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmIn(List<String> values) {
            addCriterion("CSSM in", values, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmNotIn(List<String> values) {
            addCriterion("CSSM not in", values, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmBetween(String value1, String value2) {
            addCriterion("CSSM between", value1, value2, "cssm");
            return (Criteria) this;
        }

        public Criteria andCssmNotBetween(String value1, String value2) {
            addCriterion("CSSM not between", value1, value2, "cssm");
            return (Criteria) this;
        }

        public Criteria andMrzIsNull() {
            addCriterion("MRZ is null");
            return (Criteria) this;
        }

        public Criteria andMrzIsNotNull() {
            addCriterion("MRZ is not null");
            return (Criteria) this;
        }

        public Criteria andMrzEqualTo(String value) {
            addCriterion("MRZ =", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotEqualTo(String value) {
            addCriterion("MRZ <>", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzGreaterThan(String value) {
            addCriterion("MRZ >", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzGreaterThanOrEqualTo(String value) {
            addCriterion("MRZ >=", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLessThan(String value) {
            addCriterion("MRZ <", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLessThanOrEqualTo(String value) {
            addCriterion("MRZ <=", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLike(String value) {
            addCriterion("MRZ like", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotLike(String value) {
            addCriterion("MRZ not like", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzIn(List<String> values) {
            addCriterion("MRZ in", values, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotIn(List<String> values) {
            addCriterion("MRZ not in", values, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzBetween(String value1, String value2) {
            addCriterion("MRZ between", value1, value2, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotBetween(String value1, String value2) {
            addCriterion("MRZ not between", value1, value2, "mrz");
            return (Criteria) this;
        }

        public Criteria andXgjbIsNull() {
            addCriterion("XGJB is null");
            return (Criteria) this;
        }

        public Criteria andXgjbIsNotNull() {
            addCriterion("XGJB is not null");
            return (Criteria) this;
        }

        public Criteria andXgjbEqualTo(String value) {
            addCriterion("XGJB =", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbNotEqualTo(String value) {
            addCriterion("XGJB <>", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbGreaterThan(String value) {
            addCriterion("XGJB >", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbGreaterThanOrEqualTo(String value) {
            addCriterion("XGJB >=", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbLessThan(String value) {
            addCriterion("XGJB <", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbLessThanOrEqualTo(String value) {
            addCriterion("XGJB <=", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbLike(String value) {
            addCriterion("XGJB like", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbNotLike(String value) {
            addCriterion("XGJB not like", value, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbIn(List<String> values) {
            addCriterion("XGJB in", values, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbNotIn(List<String> values) {
            addCriterion("XGJB not in", values, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbBetween(String value1, String value2) {
            addCriterion("XGJB between", value1, value2, "xgjb");
            return (Criteria) this;
        }

        public Criteria andXgjbNotBetween(String value1, String value2) {
            addCriterion("XGJB not between", value1, value2, "xgjb");
            return (Criteria) this;
        }

        public Criteria andSfxsIsNull() {
            addCriterion("SFXS is null");
            return (Criteria) this;
        }

        public Criteria andSfxsIsNotNull() {
            addCriterion("SFXS is not null");
            return (Criteria) this;
        }

        public Criteria andSfxsEqualTo(String value) {
            addCriterion("SFXS =", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsNotEqualTo(String value) {
            addCriterion("SFXS <>", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsGreaterThan(String value) {
            addCriterion("SFXS >", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsGreaterThanOrEqualTo(String value) {
            addCriterion("SFXS >=", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsLessThan(String value) {
            addCriterion("SFXS <", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsLessThanOrEqualTo(String value) {
            addCriterion("SFXS <=", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsLike(String value) {
            addCriterion("SFXS like", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsNotLike(String value) {
            addCriterion("SFXS not like", value, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsIn(List<String> values) {
            addCriterion("SFXS in", values, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsNotIn(List<String> values) {
            addCriterion("SFXS not in", values, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsBetween(String value1, String value2) {
            addCriterion("SFXS between", value1, value2, "sfxs");
            return (Criteria) this;
        }

        public Criteria andSfxsNotBetween(String value1, String value2) {
            addCriterion("SFXS not between", value1, value2, "sfxs");
            return (Criteria) this;
        }

        public Criteria andXssxIsNull() {
            addCriterion("XSSX is null");
            return (Criteria) this;
        }

        public Criteria andXssxIsNotNull() {
            addCriterion("XSSX is not null");
            return (Criteria) this;
        }

        public Criteria andXssxEqualTo(Short value) {
            addCriterion("XSSX =", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxNotEqualTo(Short value) {
            addCriterion("XSSX <>", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxGreaterThan(Short value) {
            addCriterion("XSSX >", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxGreaterThanOrEqualTo(Short value) {
            addCriterion("XSSX >=", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxLessThan(Short value) {
            addCriterion("XSSX <", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxLessThanOrEqualTo(Short value) {
            addCriterion("XSSX <=", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxIn(List<Short> values) {
            addCriterion("XSSX in", values, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxNotIn(List<Short> values) {
            addCriterion("XSSX not in", values, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxBetween(Short value1, Short value2) {
            addCriterion("XSSX between", value1, value2, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxNotBetween(Short value1, Short value2) {
            addCriterion("XSSX not between", value1, value2, "xssx");
            return (Criteria) this;
        }

        public Criteria andCssxIsNull() {
            addCriterion("CSSX is null");
            return (Criteria) this;
        }

        public Criteria andCssxIsNotNull() {
            addCriterion("CSSX is not null");
            return (Criteria) this;
        }

        public Criteria andCssxEqualTo(String value) {
            addCriterion("CSSX =", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxNotEqualTo(String value) {
            addCriterion("CSSX <>", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxGreaterThan(String value) {
            addCriterion("CSSX >", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxGreaterThanOrEqualTo(String value) {
            addCriterion("CSSX >=", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxLessThan(String value) {
            addCriterion("CSSX <", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxLessThanOrEqualTo(String value) {
            addCriterion("CSSX <=", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxLike(String value) {
            addCriterion("CSSX like", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxNotLike(String value) {
            addCriterion("CSSX not like", value, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxIn(List<String> values) {
            addCriterion("CSSX in", values, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxNotIn(List<String> values) {
            addCriterion("CSSX not in", values, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxBetween(String value1, String value2) {
            addCriterion("CSSX between", value1, value2, "cssx");
            return (Criteria) this;
        }

        public Criteria andCssxNotBetween(String value1, String value2) {
            addCriterion("CSSX not between", value1, value2, "cssx");
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

        public Criteria andXsxsIsNull() {
            addCriterion("XSXS is null");
            return (Criteria) this;
        }

        public Criteria andXsxsIsNotNull() {
            addCriterion("XSXS is not null");
            return (Criteria) this;
        }

        public Criteria andXsxsEqualTo(String value) {
            addCriterion("XSXS =", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsNotEqualTo(String value) {
            addCriterion("XSXS <>", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsGreaterThan(String value) {
            addCriterion("XSXS >", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsGreaterThanOrEqualTo(String value) {
            addCriterion("XSXS >=", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsLessThan(String value) {
            addCriterion("XSXS <", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsLessThanOrEqualTo(String value) {
            addCriterion("XSXS <=", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsLike(String value) {
            addCriterion("XSXS like", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsNotLike(String value) {
            addCriterion("XSXS not like", value, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsIn(List<String> values) {
            addCriterion("XSXS in", values, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsNotIn(List<String> values) {
            addCriterion("XSXS not in", values, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsBetween(String value1, String value2) {
            addCriterion("XSXS between", value1, value2, "xsxs");
            return (Criteria) this;
        }

        public Criteria andXsxsNotBetween(String value1, String value2) {
            addCriterion("XSXS not between", value1, value2, "xsxs");
            return (Criteria) this;
        }

        public Criteria andCssyjbIsNull() {
            addCriterion("CSSYJB is null");
            return (Criteria) this;
        }

        public Criteria andCssyjbIsNotNull() {
            addCriterion("CSSYJB is not null");
            return (Criteria) this;
        }

        public Criteria andCssyjbEqualTo(String value) {
            addCriterion("CSSYJB =", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbNotEqualTo(String value) {
            addCriterion("CSSYJB <>", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbGreaterThan(String value) {
            addCriterion("CSSYJB >", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbGreaterThanOrEqualTo(String value) {
            addCriterion("CSSYJB >=", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbLessThan(String value) {
            addCriterion("CSSYJB <", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbLessThanOrEqualTo(String value) {
            addCriterion("CSSYJB <=", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbLike(String value) {
            addCriterion("CSSYJB like", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbNotLike(String value) {
            addCriterion("CSSYJB not like", value, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbIn(List<String> values) {
            addCriterion("CSSYJB in", values, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbNotIn(List<String> values) {
            addCriterion("CSSYJB not in", values, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbBetween(String value1, String value2) {
            addCriterion("CSSYJB between", value1, value2, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andCssyjbNotBetween(String value1, String value2) {
            addCriterion("CSSYJB not between", value1, value2, "cssyjb");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNull() {
            addCriterion("BYZD1 is null");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNotNull() {
            addCriterion("BYZD1 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd1EqualTo(String value) {
            addCriterion("BYZD1 =", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotEqualTo(String value) {
            addCriterion("BYZD1 <>", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThan(String value) {
            addCriterion("BYZD1 >", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD1 >=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThan(String value) {
            addCriterion("BYZD1 <", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThanOrEqualTo(String value) {
            addCriterion("BYZD1 <=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Like(String value) {
            addCriterion("BYZD1 like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotLike(String value) {
            addCriterion("BYZD1 not like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1In(List<String> values) {
            addCriterion("BYZD1 in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotIn(List<String> values) {
            addCriterion("BYZD1 not in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Between(String value1, String value2) {
            addCriterion("BYZD1 between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotBetween(String value1, String value2) {
            addCriterion("BYZD1 not between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNull() {
            addCriterion("BYZD2 is null");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNotNull() {
            addCriterion("BYZD2 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd2EqualTo(String value) {
            addCriterion("BYZD2 =", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotEqualTo(String value) {
            addCriterion("BYZD2 <>", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThan(String value) {
            addCriterion("BYZD2 >", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD2 >=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThan(String value) {
            addCriterion("BYZD2 <", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThanOrEqualTo(String value) {
            addCriterion("BYZD2 <=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Like(String value) {
            addCriterion("BYZD2 like", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotLike(String value) {
            addCriterion("BYZD2 not like", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2In(List<String> values) {
            addCriterion("BYZD2 in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotIn(List<String> values) {
            addCriterion("BYZD2 not in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Between(String value1, String value2) {
            addCriterion("BYZD2 between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotBetween(String value1, String value2) {
            addCriterion("BYZD2 not between", value1, value2, "byzd2");
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