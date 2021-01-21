package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WechatSysparamSqlWhere extends WechatSysparamEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatSysparamSqlWhere() {
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

        public Criteria andClientsxhIsNull() {
            addCriterion("CLIENTSXH is null");
            return (Criteria) this;
        }

        public Criteria andClientsxhIsNotNull() {
            addCriterion("CLIENTSXH is not null");
            return (Criteria) this;
        }

        public Criteria andClientsxhEqualTo(String value) {
            addCriterion("CLIENTSXH =", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotEqualTo(String value) {
            addCriterion("CLIENTSXH <>", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhGreaterThan(String value) {
            addCriterion("CLIENTSXH >", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTSXH >=", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhLessThan(String value) {
            addCriterion("CLIENTSXH <", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhLessThanOrEqualTo(String value) {
            addCriterion("CLIENTSXH <=", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhLike(String value) {
            addCriterion("CLIENTSXH like", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotLike(String value) {
            addCriterion("CLIENTSXH not like", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhIn(List<String> values) {
            addCriterion("CLIENTSXH in", values, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotIn(List<String> values) {
            addCriterion("CLIENTSXH not in", values, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhBetween(String value1, String value2) {
            addCriterion("CLIENTSXH between", value1, value2, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotBetween(String value1, String value2) {
            addCriterion("CLIENTSXH not between", value1, value2, "clientsxh");
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

        public Criteria andDmsmIsNull() {
            addCriterion("DMSM is null");
            return (Criteria) this;
        }

        public Criteria andDmsmIsNotNull() {
            addCriterion("DMSM is not null");
            return (Criteria) this;
        }

        public Criteria andDmsmEqualTo(String value) {
            addCriterion("DMSM =", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmNotEqualTo(String value) {
            addCriterion("DMSM <>", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmGreaterThan(String value) {
            addCriterion("DMSM >", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmGreaterThanOrEqualTo(String value) {
            addCriterion("DMSM >=", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmLessThan(String value) {
            addCriterion("DMSM <", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmLessThanOrEqualTo(String value) {
            addCriterion("DMSM <=", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmLike(String value) {
            addCriterion("DMSM like", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmNotLike(String value) {
            addCriterion("DMSM not like", value, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmIn(List<String> values) {
            addCriterion("DMSM in", values, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmNotIn(List<String> values) {
            addCriterion("DMSM not in", values, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmBetween(String value1, String value2) {
            addCriterion("DMSM between", value1, value2, "dmsm");
            return (Criteria) this;
        }

        public Criteria andDmsmNotBetween(String value1, String value2) {
            addCriterion("DMSM not between", value1, value2, "dmsm");
            return (Criteria) this;
        }

        public Criteria andSfxgIsNull() {
            addCriterion("SFXG is null");
            return (Criteria) this;
        }

        public Criteria andSfxgIsNotNull() {
            addCriterion("SFXG is not null");
            return (Criteria) this;
        }

        public Criteria andSfxgEqualTo(String value) {
            addCriterion("SFXG =", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgNotEqualTo(String value) {
            addCriterion("SFXG <>", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgGreaterThan(String value) {
            addCriterion("SFXG >", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgGreaterThanOrEqualTo(String value) {
            addCriterion("SFXG >=", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgLessThan(String value) {
            addCriterion("SFXG <", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgLessThanOrEqualTo(String value) {
            addCriterion("SFXG <=", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgLike(String value) {
            addCriterion("SFXG like", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgNotLike(String value) {
            addCriterion("SFXG not like", value, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgIn(List<String> values) {
            addCriterion("SFXG in", values, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgNotIn(List<String> values) {
            addCriterion("SFXG not in", values, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgBetween(String value1, String value2) {
            addCriterion("SFXG between", value1, value2, "sfxg");
            return (Criteria) this;
        }

        public Criteria andSfxgNotBetween(String value1, String value2) {
            addCriterion("SFXG not between", value1, value2, "sfxg");
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