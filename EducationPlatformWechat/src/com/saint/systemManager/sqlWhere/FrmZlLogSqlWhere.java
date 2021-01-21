package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmZlLogEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrmZlLogSqlWhere extends FrmZlLogEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String begindate;
    private String enddate;
    public FrmZlLogSqlWhere() {
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

        public Criteria andIdenIsNull() {
            addCriterion("IDEN is null");
            return (Criteria) this;
        }

        public Criteria andIdenIsNotNull() {
            addCriterion("IDEN is not null");
            return (Criteria) this;
        }

        public Criteria andIdenEqualTo(String value) {
            addCriterion("IDEN =", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenNotEqualTo(String value) {
            addCriterion("IDEN <>", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenGreaterThan(String value) {
            addCriterion("IDEN >", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenGreaterThanOrEqualTo(String value) {
            addCriterion("IDEN >=", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenLessThan(String value) {
            addCriterion("IDEN <", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenLessThanOrEqualTo(String value) {
            addCriterion("IDEN <=", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenLike(String value) {
            addCriterion("IDEN like", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenNotLike(String value) {
            addCriterion("IDEN not like", value, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenIn(List<String> values) {
            addCriterion("IDEN in", values, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenNotIn(List<String> values) {
            addCriterion("IDEN not in", values, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenBetween(String value1, String value2) {
            addCriterion("IDEN between", value1, value2, "iden");
            return (Criteria) this;
        }

        public Criteria andIdenNotBetween(String value1, String value2) {
            addCriterion("IDEN not between", value1, value2, "iden");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
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

        public Criteria andLogmessIsNull() {
            addCriterion("LOGMESS is null");
            return (Criteria) this;
        }

        public Criteria andLogmessIsNotNull() {
            addCriterion("LOGMESS is not null");
            return (Criteria) this;
        }

        public Criteria andLogmessEqualTo(String value) {
            addCriterion("LOGMESS =", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessNotEqualTo(String value) {
            addCriterion("LOGMESS <>", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessGreaterThan(String value) {
            addCriterion("LOGMESS >", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessGreaterThanOrEqualTo(String value) {
            addCriterion("LOGMESS >=", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessLessThan(String value) {
            addCriterion("LOGMESS <", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessLessThanOrEqualTo(String value) {
            addCriterion("LOGMESS <=", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessLike(String value) {
            addCriterion("LOGMESS like", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessNotLike(String value) {
            addCriterion("LOGMESS not like", value, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessIn(List<String> values) {
            addCriterion("LOGMESS in", values, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessNotIn(List<String> values) {
            addCriterion("LOGMESS not in", values, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessBetween(String value1, String value2) {
            addCriterion("LOGMESS between", value1, value2, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogmessNotBetween(String value1, String value2) {
            addCriterion("LOGMESS not between", value1, value2, "logmess");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNull() {
            addCriterion("LOGTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("LOGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(Date value) {
            addCriterionForJDBCDate("LOGTIME =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LOGTIME <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("LOGTIME >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOGTIME >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(Date value) {
            addCriterionForJDBCDate("LOGTIME <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOGTIME <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<Date> values) {
            addCriterionForJDBCDate("LOGTIME in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LOGTIME not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOGTIME between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOGTIME not between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
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

        public Criteria andCznrIsNull() {
            addCriterion("CZNR is null");
            return (Criteria) this;
        }

        public Criteria andCznrIsNotNull() {
            addCriterion("CZNR is not null");
            return (Criteria) this;
        }

        public Criteria andCznrEqualTo(String value) {
            addCriterion("CZNR =", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrNotEqualTo(String value) {
            addCriterion("CZNR <>", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrGreaterThan(String value) {
            addCriterion("CZNR >", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrGreaterThanOrEqualTo(String value) {
            addCriterion("CZNR >=", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrLessThan(String value) {
            addCriterion("CZNR <", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrLessThanOrEqualTo(String value) {
            addCriterion("CZNR <=", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrLike(String value) {
            addCriterion("CZNR like", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrNotLike(String value) {
            addCriterion("CZNR not like", value, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrIn(List<String> values) {
            addCriterion("CZNR in", values, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrNotIn(List<String> values) {
            addCriterion("CZNR not in", values, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrBetween(String value1, String value2) {
            addCriterion("CZNR between", value1, value2, "cznr");
            return (Criteria) this;
        }

        public Criteria andCznrNotBetween(String value1, String value2) {
            addCriterion("CZNR not between", value1, value2, "cznr");
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

	public String getBegindate() {
		return begindate;
	}

	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
}