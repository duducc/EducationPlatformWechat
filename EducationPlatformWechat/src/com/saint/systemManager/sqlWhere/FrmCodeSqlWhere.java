package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmCodeEntity;
import java.util.ArrayList;
import java.util.List;

/**
*类注释信息
*表名FRM_CODE
*表说明代码信息
  */
public class FrmCodeSqlWhere extends FrmCodeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmCodeSqlWhere() {
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

        public Criteria andDmzIsNull() {
            addCriterion("DMZ is null");
            return (Criteria) this;
        }

        public Criteria andDmzIsNotNull() {
            addCriterion("DMZ is not null");
            return (Criteria) this;
        }

        public Criteria andDmzEqualTo(String value) {
            addCriterion("DMZ =", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotEqualTo(String value) {
            addCriterion("DMZ <>", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzGreaterThan(String value) {
            addCriterion("DMZ >", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzGreaterThanOrEqualTo(String value) {
            addCriterion("DMZ >=", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzLessThan(String value) {
            addCriterion("DMZ <", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzLessThanOrEqualTo(String value) {
            addCriterion("DMZ <=", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzLike(String value) {
            addCriterion("DMZ like", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotLike(String value) {
            addCriterion("DMZ not like", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzIn(List<String> values) {
            addCriterion("DMZ in", values, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotIn(List<String> values) {
            addCriterion("DMZ not in", values, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzBetween(String value1, String value2) {
            addCriterion("DMZ between", value1, value2, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotBetween(String value1, String value2) {
            addCriterion("DMZ not between", value1, value2, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmjcIsNull() {
            addCriterion("DMJC is null");
            return (Criteria) this;
        }

        public Criteria andDmjcIsNotNull() {
            addCriterion("DMJC is not null");
            return (Criteria) this;
        }

        public Criteria andDmjcEqualTo(String value) {
            addCriterion("DMJC =", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcNotEqualTo(String value) {
            addCriterion("DMJC <>", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcGreaterThan(String value) {
            addCriterion("DMJC >", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcGreaterThanOrEqualTo(String value) {
            addCriterion("DMJC >=", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcLessThan(String value) {
            addCriterion("DMJC <", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcLessThanOrEqualTo(String value) {
            addCriterion("DMJC <=", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcLike(String value) {
            addCriterion("DMJC like", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcNotLike(String value) {
            addCriterion("DMJC not like", value, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcIn(List<String> values) {
            addCriterion("DMJC in", values, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcNotIn(List<String> values) {
            addCriterion("DMJC not in", values, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcBetween(String value1, String value2) {
            addCriterion("DMJC between", value1, value2, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmjcNotBetween(String value1, String value2) {
            addCriterion("DMJC not between", value1, value2, "dmjc");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNull() {
            addCriterion("DMMC is null");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNotNull() {
            addCriterion("DMMC is not null");
            return (Criteria) this;
        }

        public Criteria andDmmcEqualTo(String value) {
            addCriterion("DMMC =", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotEqualTo(String value) {
            addCriterion("DMMC <>", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThan(String value) {
            addCriterion("DMMC >", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThanOrEqualTo(String value) {
            addCriterion("DMMC >=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThan(String value) {
            addCriterion("DMMC <", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThanOrEqualTo(String value) {
            addCriterion("DMMC <=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLike(String value) {
            addCriterion("DMMC like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotLike(String value) {
            addCriterion("DMMC not like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcIn(List<String> values) {
            addCriterion("DMMC in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotIn(List<String> values) {
            addCriterion("DMMC not in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcBetween(String value1, String value2) {
            addCriterion("DMMC between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotBetween(String value1, String value2) {
            addCriterion("DMMC not between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmsm1IsNull() {
            addCriterion("DMSM1 is null");
            return (Criteria) this;
        }

        public Criteria andDmsm1IsNotNull() {
            addCriterion("DMSM1 is not null");
            return (Criteria) this;
        }

        public Criteria andDmsm1EqualTo(String value) {
            addCriterion("DMSM1 =", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1NotEqualTo(String value) {
            addCriterion("DMSM1 <>", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1GreaterThan(String value) {
            addCriterion("DMSM1 >", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1GreaterThanOrEqualTo(String value) {
            addCriterion("DMSM1 >=", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1LessThan(String value) {
            addCriterion("DMSM1 <", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1LessThanOrEqualTo(String value) {
            addCriterion("DMSM1 <=", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1Like(String value) {
            addCriterion("DMSM1 like", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1NotLike(String value) {
            addCriterion("DMSM1 not like", value, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1In(List<String> values) {
            addCriterion("DMSM1 in", values, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1NotIn(List<String> values) {
            addCriterion("DMSM1 not in", values, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1Between(String value1, String value2) {
            addCriterion("DMSM1 between", value1, value2, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm1NotBetween(String value1, String value2) {
            addCriterion("DMSM1 not between", value1, value2, "dmsm1");
            return (Criteria) this;
        }

        public Criteria andDmsm2IsNull() {
            addCriterion("DMSM2 is null");
            return (Criteria) this;
        }

        public Criteria andDmsm2IsNotNull() {
            addCriterion("DMSM2 is not null");
            return (Criteria) this;
        }

        public Criteria andDmsm2EqualTo(String value) {
            addCriterion("DMSM2 =", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2NotEqualTo(String value) {
            addCriterion("DMSM2 <>", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2GreaterThan(String value) {
            addCriterion("DMSM2 >", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2GreaterThanOrEqualTo(String value) {
            addCriterion("DMSM2 >=", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2LessThan(String value) {
            addCriterion("DMSM2 <", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2LessThanOrEqualTo(String value) {
            addCriterion("DMSM2 <=", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2Like(String value) {
            addCriterion("DMSM2 like", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2NotLike(String value) {
            addCriterion("DMSM2 not like", value, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2In(List<String> values) {
            addCriterion("DMSM2 in", values, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2NotIn(List<String> values) {
            addCriterion("DMSM2 not in", values, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2Between(String value1, String value2) {
            addCriterion("DMSM2 between", value1, value2, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm2NotBetween(String value1, String value2) {
            addCriterion("DMSM2 not between", value1, value2, "dmsm2");
            return (Criteria) this;
        }

        public Criteria andDmsm3IsNull() {
            addCriterion("DMSM3 is null");
            return (Criteria) this;
        }

        public Criteria andDmsm3IsNotNull() {
            addCriterion("DMSM3 is not null");
            return (Criteria) this;
        }

        public Criteria andDmsm3EqualTo(String value) {
            addCriterion("DMSM3 =", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3NotEqualTo(String value) {
            addCriterion("DMSM3 <>", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3GreaterThan(String value) {
            addCriterion("DMSM3 >", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3GreaterThanOrEqualTo(String value) {
            addCriterion("DMSM3 >=", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3LessThan(String value) {
            addCriterion("DMSM3 <", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3LessThanOrEqualTo(String value) {
            addCriterion("DMSM3 <=", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3Like(String value) {
            addCriterion("DMSM3 like", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3NotLike(String value) {
            addCriterion("DMSM3 not like", value, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3In(List<String> values) {
            addCriterion("DMSM3 in", values, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3NotIn(List<String> values) {
            addCriterion("DMSM3 not in", values, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3Between(String value1, String value2) {
            addCriterion("DMSM3 between", value1, value2, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm3NotBetween(String value1, String value2) {
            addCriterion("DMSM3 not between", value1, value2, "dmsm3");
            return (Criteria) this;
        }

        public Criteria andDmsm4IsNull() {
            addCriterion("DMSM4 is null");
            return (Criteria) this;
        }

        public Criteria andDmsm4IsNotNull() {
            addCriterion("DMSM4 is not null");
            return (Criteria) this;
        }

        public Criteria andDmsm4EqualTo(String value) {
            addCriterion("DMSM4 =", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4NotEqualTo(String value) {
            addCriterion("DMSM4 <>", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4GreaterThan(String value) {
            addCriterion("DMSM4 >", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4GreaterThanOrEqualTo(String value) {
            addCriterion("DMSM4 >=", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4LessThan(String value) {
            addCriterion("DMSM4 <", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4LessThanOrEqualTo(String value) {
            addCriterion("DMSM4 <=", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4Like(String value) {
            addCriterion("DMSM4 like", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4NotLike(String value) {
            addCriterion("DMSM4 not like", value, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4In(List<String> values) {
            addCriterion("DMSM4 in", values, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4NotIn(List<String> values) {
            addCriterion("DMSM4 not in", values, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4Between(String value1, String value2) {
            addCriterion("DMSM4 between", value1, value2, "dmsm4");
            return (Criteria) this;
        }

        public Criteria andDmsm4NotBetween(String value1, String value2) {
            addCriterion("DMSM4 not between", value1, value2, "dmsm4");
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

        public Criteria andDmsxEqualTo(String value) {
            addCriterion("DMSX =", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotEqualTo(String value) {
            addCriterion("DMSX <>", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThan(String value) {
            addCriterion("DMSX >", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThanOrEqualTo(String value) {
            addCriterion("DMSX >=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThan(String value) {
            addCriterion("DMSX <", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThanOrEqualTo(String value) {
            addCriterion("DMSX <=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLike(String value) {
            addCriterion("DMSX like", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotLike(String value) {
            addCriterion("DMSX not like", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxIn(List<String> values) {
            addCriterion("DMSX in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotIn(List<String> values) {
            addCriterion("DMSX not in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxBetween(String value1, String value2) {
            addCriterion("DMSX between", value1, value2, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotBetween(String value1, String value2) {
            addCriterion("DMSX not between", value1, value2, "dmsx");
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

        public Criteria andYwdxIsNull() {
            addCriterion("YWDX is null");
            return (Criteria) this;
        }

        public Criteria andYwdxIsNotNull() {
            addCriterion("YWDX is not null");
            return (Criteria) this;
        }

        public Criteria andYwdxEqualTo(String value) {
            addCriterion("YWDX =", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotEqualTo(String value) {
            addCriterion("YWDX <>", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxGreaterThan(String value) {
            addCriterion("YWDX >", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxGreaterThanOrEqualTo(String value) {
            addCriterion("YWDX >=", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxLessThan(String value) {
            addCriterion("YWDX <", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxLessThanOrEqualTo(String value) {
            addCriterion("YWDX <=", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxLike(String value) {
            addCriterion("YWDX like", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotLike(String value) {
            addCriterion("YWDX not like", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxIn(List<String> values) {
            addCriterion("YWDX in", values, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotIn(List<String> values) {
            addCriterion("YWDX not in", values, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxBetween(String value1, String value2) {
            addCriterion("YWDX between", value1, value2, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotBetween(String value1, String value2) {
            addCriterion("YWDX not between", value1, value2, "ywdx");
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

        public Criteria andSxhEqualTo(Long value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(Long value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(Long value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(Long value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(Long value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(Long value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<Long> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<Long> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(Long value1, Long value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(Long value1, Long value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
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