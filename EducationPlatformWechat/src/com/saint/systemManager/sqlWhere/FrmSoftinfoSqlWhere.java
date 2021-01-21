package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmSoftinfoEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrmSoftinfoSqlWhere extends FrmSoftinfoEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSoftinfoSqlWhere() {
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

        public Criteria andSoftdmIsNull() {
            addCriterion("SOFTDM is null");
            return (Criteria) this;
        }

        public Criteria andSoftdmIsNotNull() {
            addCriterion("SOFTDM is not null");
            return (Criteria) this;
        }

        public Criteria andSoftdmEqualTo(String value) {
            addCriterion("SOFTDM =", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmNotEqualTo(String value) {
            addCriterion("SOFTDM <>", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmGreaterThan(String value) {
            addCriterion("SOFTDM >", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTDM >=", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmLessThan(String value) {
            addCriterion("SOFTDM <", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmLessThanOrEqualTo(String value) {
            addCriterion("SOFTDM <=", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmLike(String value) {
            addCriterion("SOFTDM like", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmNotLike(String value) {
            addCriterion("SOFTDM not like", value, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmIn(List<String> values) {
            addCriterion("SOFTDM in", values, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmNotIn(List<String> values) {
            addCriterion("SOFTDM not in", values, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmBetween(String value1, String value2) {
            addCriterion("SOFTDM between", value1, value2, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftdmNotBetween(String value1, String value2) {
            addCriterion("SOFTDM not between", value1, value2, "softdm");
            return (Criteria) this;
        }

        public Criteria andSoftnameIsNull() {
            addCriterion("SOFTNAME is null");
            return (Criteria) this;
        }

        public Criteria andSoftnameIsNotNull() {
            addCriterion("SOFTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSoftnameEqualTo(String value) {
            addCriterion("SOFTNAME =", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotEqualTo(String value) {
            addCriterion("SOFTNAME <>", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameGreaterThan(String value) {
            addCriterion("SOFTNAME >", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTNAME >=", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLessThan(String value) {
            addCriterion("SOFTNAME <", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLessThanOrEqualTo(String value) {
            addCriterion("SOFTNAME <=", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLike(String value) {
            addCriterion("SOFTNAME like", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotLike(String value) {
            addCriterion("SOFTNAME not like", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameIn(List<String> values) {
            addCriterion("SOFTNAME in", values, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotIn(List<String> values) {
            addCriterion("SOFTNAME not in", values, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameBetween(String value1, String value2) {
            addCriterion("SOFTNAME between", value1, value2, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotBetween(String value1, String value2) {
            addCriterion("SOFTNAME not between", value1, value2, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftverIsNull() {
            addCriterion("SOFTVER is null");
            return (Criteria) this;
        }

        public Criteria andSoftverIsNotNull() {
            addCriterion("SOFTVER is not null");
            return (Criteria) this;
        }

        public Criteria andSoftverEqualTo(String value) {
            addCriterion("SOFTVER =", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverNotEqualTo(String value) {
            addCriterion("SOFTVER <>", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverGreaterThan(String value) {
            addCriterion("SOFTVER >", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTVER >=", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverLessThan(String value) {
            addCriterion("SOFTVER <", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverLessThanOrEqualTo(String value) {
            addCriterion("SOFTVER <=", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverLike(String value) {
            addCriterion("SOFTVER like", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverNotLike(String value) {
            addCriterion("SOFTVER not like", value, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverIn(List<String> values) {
            addCriterion("SOFTVER in", values, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverNotIn(List<String> values) {
            addCriterion("SOFTVER not in", values, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverBetween(String value1, String value2) {
            addCriterion("SOFTVER between", value1, value2, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftverNotBetween(String value1, String value2) {
            addCriterion("SOFTVER not between", value1, value2, "softver");
            return (Criteria) this;
        }

        public Criteria andSoftcontextIsNull() {
            addCriterion("SOFTCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andSoftcontextIsNotNull() {
            addCriterion("SOFTCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andSoftcontextEqualTo(String value) {
            addCriterion("SOFTCONTEXT =", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextNotEqualTo(String value) {
            addCriterion("SOFTCONTEXT <>", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextGreaterThan(String value) {
            addCriterion("SOFTCONTEXT >", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTCONTEXT >=", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextLessThan(String value) {
            addCriterion("SOFTCONTEXT <", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextLessThanOrEqualTo(String value) {
            addCriterion("SOFTCONTEXT <=", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextLike(String value) {
            addCriterion("SOFTCONTEXT like", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextNotLike(String value) {
            addCriterion("SOFTCONTEXT not like", value, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextIn(List<String> values) {
            addCriterion("SOFTCONTEXT in", values, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextNotIn(List<String> values) {
            addCriterion("SOFTCONTEXT not in", values, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextBetween(String value1, String value2) {
            addCriterion("SOFTCONTEXT between", value1, value2, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftcontextNotBetween(String value1, String value2) {
            addCriterion("SOFTCONTEXT not between", value1, value2, "softcontext");
            return (Criteria) this;
        }

        public Criteria andSoftgroupIsNull() {
            addCriterion("SOFTGROUP is null");
            return (Criteria) this;
        }

        public Criteria andSoftgroupIsNotNull() {
            addCriterion("SOFTGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andSoftgroupEqualTo(String value) {
            addCriterion("SOFTGROUP =", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupNotEqualTo(String value) {
            addCriterion("SOFTGROUP <>", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupGreaterThan(String value) {
            addCriterion("SOFTGROUP >", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTGROUP >=", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupLessThan(String value) {
            addCriterion("SOFTGROUP <", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupLessThanOrEqualTo(String value) {
            addCriterion("SOFTGROUP <=", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupLike(String value) {
            addCriterion("SOFTGROUP like", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupNotLike(String value) {
            addCriterion("SOFTGROUP not like", value, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupIn(List<String> values) {
            addCriterion("SOFTGROUP in", values, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupNotIn(List<String> values) {
            addCriterion("SOFTGROUP not in", values, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupBetween(String value1, String value2) {
            addCriterion("SOFTGROUP between", value1, value2, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftgroupNotBetween(String value1, String value2) {
            addCriterion("SOFTGROUP not between", value1, value2, "softgroup");
            return (Criteria) this;
        }

        public Criteria andSoftxdrIsNull() {
            addCriterion("SOFTXDR is null");
            return (Criteria) this;
        }

        public Criteria andSoftxdrIsNotNull() {
            addCriterion("SOFTXDR is not null");
            return (Criteria) this;
        }

        public Criteria andSoftxdrEqualTo(String value) {
            addCriterion("SOFTXDR =", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrNotEqualTo(String value) {
            addCriterion("SOFTXDR <>", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrGreaterThan(String value) {
            addCriterion("SOFTXDR >", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTXDR >=", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrLessThan(String value) {
            addCriterion("SOFTXDR <", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrLessThanOrEqualTo(String value) {
            addCriterion("SOFTXDR <=", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrLike(String value) {
            addCriterion("SOFTXDR like", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrNotLike(String value) {
            addCriterion("SOFTXDR not like", value, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrIn(List<String> values) {
            addCriterion("SOFTXDR in", values, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrNotIn(List<String> values) {
            addCriterion("SOFTXDR not in", values, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrBetween(String value1, String value2) {
            addCriterion("SOFTXDR between", value1, value2, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrNotBetween(String value1, String value2) {
            addCriterion("SOFTXDR not between", value1, value2, "softxdr");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqIsNull() {
            addCriterion("SOFTXDRQ is null");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqIsNotNull() {
            addCriterion("SOFTXDRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTXDRQ =", value, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTXDRQ <>", value, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqGreaterThan(Date value) {
            addCriterionForJDBCDate("SOFTXDRQ >", value, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTXDRQ >=", value, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqLessThan(Date value) {
            addCriterionForJDBCDate("SOFTXDRQ <", value, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTXDRQ <=", value, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqIn(List<Date> values) {
            addCriterionForJDBCDate("SOFTXDRQ in", values, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("SOFTXDRQ not in", values, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SOFTXDRQ between", value1, value2, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftxdrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SOFTXDRQ not between", value1, value2, "softxdrq");
            return (Criteria) this;
        }

        public Criteria andSoftazsjIsNull() {
            addCriterion("SOFTAZSJ is null");
            return (Criteria) this;
        }

        public Criteria andSoftazsjIsNotNull() {
            addCriterion("SOFTAZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSoftazsjEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTAZSJ =", value, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTAZSJ <>", value, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SOFTAZSJ >", value, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTAZSJ >=", value, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjLessThan(Date value) {
            addCriterionForJDBCDate("SOFTAZSJ <", value, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SOFTAZSJ <=", value, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjIn(List<Date> values) {
            addCriterionForJDBCDate("SOFTAZSJ in", values, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SOFTAZSJ not in", values, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SOFTAZSJ between", value1, value2, "softazsj");
            return (Criteria) this;
        }

        public Criteria andSoftazsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SOFTAZSJ not between", value1, value2, "softazsj");
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