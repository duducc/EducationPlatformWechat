package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WechatClientinfoSqlWhere extends WechatClientinfoEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatClientinfoSqlWhere() {
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

        public Criteria andClientnameIsNull() {
            addCriterion("CLIENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("CLIENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("CLIENTNAME =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("CLIENTNAME <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("CLIENTNAME >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTNAME >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("CLIENTNAME <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("CLIENTNAME <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("CLIENTNAME like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("CLIENTNAME not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("CLIENTNAME in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("CLIENTNAME not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("CLIENTNAME between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("CLIENTNAME not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("CLIENTID is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("CLIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("CLIENTID =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("CLIENTID <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("CLIENTID >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTID >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("CLIENTID <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("CLIENTID <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("CLIENTID like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("CLIENTID not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("CLIENTID in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("CLIENTID not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("CLIENTID between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("CLIENTID not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("APPSECRET is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("APPSECRET is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("APPSECRET =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("APPSECRET <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("APPSECRET >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("APPSECRET >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("APPSECRET <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("APPSECRET <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("APPSECRET like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("APPSECRET not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("APPSECRET in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("APPSECRET not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("APPSECRET between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("APPSECRET not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIsNull() {
            addCriterion("ENCODINGAESKEY is null");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIsNotNull() {
            addCriterion("ENCODINGAESKEY is not null");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyEqualTo(String value) {
            addCriterion("ENCODINGAESKEY =", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotEqualTo(String value) {
            addCriterion("ENCODINGAESKEY <>", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyGreaterThan(String value) {
            addCriterion("ENCODINGAESKEY >", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("ENCODINGAESKEY >=", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLessThan(String value) {
            addCriterion("ENCODINGAESKEY <", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLessThanOrEqualTo(String value) {
            addCriterion("ENCODINGAESKEY <=", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLike(String value) {
            addCriterion("ENCODINGAESKEY like", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotLike(String value) {
            addCriterion("ENCODINGAESKEY not like", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIn(List<String> values) {
            addCriterion("ENCODINGAESKEY in", values, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotIn(List<String> values) {
            addCriterion("ENCODINGAESKEY not in", values, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyBetween(String value1, String value2) {
            addCriterion("ENCODINGAESKEY between", value1, value2, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotBetween(String value1, String value2) {
            addCriterion("ENCODINGAESKEY not between", value1, value2, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyIsNull() {
            addCriterion("ISAESKEY is null");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyIsNotNull() {
            addCriterion("ISAESKEY is not null");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyEqualTo(String value) {
            addCriterion("ISAESKEY =", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyNotEqualTo(String value) {
            addCriterion("ISAESKEY <>", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyGreaterThan(String value) {
            addCriterion("ISAESKEY >", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("ISAESKEY >=", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyLessThan(String value) {
            addCriterion("ISAESKEY <", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyLessThanOrEqualTo(String value) {
            addCriterion("ISAESKEY <=", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyLike(String value) {
            addCriterion("ISAESKEY like", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyNotLike(String value) {
            addCriterion("ISAESKEY not like", value, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyIn(List<String> values) {
            addCriterion("ISAESKEY in", values, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyNotIn(List<String> values) {
            addCriterion("ISAESKEY not in", values, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyBetween(String value1, String value2) {
            addCriterion("ISAESKEY between", value1, value2, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andIsaeskeyNotBetween(String value1, String value2) {
            addCriterion("ISAESKEY not between", value1, value2, "isaeskey");
            return (Criteria) this;
        }

        public Criteria andWxtypeIsNull() {
            addCriterion("WXTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWxtypeIsNotNull() {
            addCriterion("WXTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWxtypeEqualTo(String value) {
            addCriterion("WXTYPE =", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotEqualTo(String value) {
            addCriterion("WXTYPE <>", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeGreaterThan(String value) {
            addCriterion("WXTYPE >", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeGreaterThanOrEqualTo(String value) {
            addCriterion("WXTYPE >=", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeLessThan(String value) {
            addCriterion("WXTYPE <", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeLessThanOrEqualTo(String value) {
            addCriterion("WXTYPE <=", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeLike(String value) {
            addCriterion("WXTYPE like", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotLike(String value) {
            addCriterion("WXTYPE not like", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeIn(List<String> values) {
            addCriterion("WXTYPE in", values, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotIn(List<String> values) {
            addCriterion("WXTYPE not in", values, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeBetween(String value1, String value2) {
            addCriterion("WXTYPE between", value1, value2, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotBetween(String value1, String value2) {
            addCriterion("WXTYPE not between", value1, value2, "wxtype");
            return (Criteria) this;
        }

        public Criteria andRzinfoIsNull() {
            addCriterion("RZINFO is null");
            return (Criteria) this;
        }

        public Criteria andRzinfoIsNotNull() {
            addCriterion("RZINFO is not null");
            return (Criteria) this;
        }

        public Criteria andRzinfoEqualTo(String value) {
            addCriterion("RZINFO =", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoNotEqualTo(String value) {
            addCriterion("RZINFO <>", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoGreaterThan(String value) {
            addCriterion("RZINFO >", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoGreaterThanOrEqualTo(String value) {
            addCriterion("RZINFO >=", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoLessThan(String value) {
            addCriterion("RZINFO <", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoLessThanOrEqualTo(String value) {
            addCriterion("RZINFO <=", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoLike(String value) {
            addCriterion("RZINFO like", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoNotLike(String value) {
            addCriterion("RZINFO not like", value, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoIn(List<String> values) {
            addCriterion("RZINFO in", values, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoNotIn(List<String> values) {
            addCriterion("RZINFO not in", values, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoBetween(String value1, String value2) {
            addCriterion("RZINFO between", value1, value2, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andRzinfoNotBetween(String value1, String value2) {
            addCriterion("RZINFO not between", value1, value2, "rzinfo");
            return (Criteria) this;
        }

        public Criteria andXzqhIsNull() {
            addCriterion("XZQH is null");
            return (Criteria) this;
        }

        public Criteria andXzqhIsNotNull() {
            addCriterion("XZQH is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhEqualTo(String value) {
            addCriterion("XZQH =", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotEqualTo(String value) {
            addCriterion("XZQH <>", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhGreaterThan(String value) {
            addCriterion("XZQH >", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhGreaterThanOrEqualTo(String value) {
            addCriterion("XZQH >=", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhLessThan(String value) {
            addCriterion("XZQH <", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhLessThanOrEqualTo(String value) {
            addCriterion("XZQH <=", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhLike(String value) {
            addCriterion("XZQH like", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotLike(String value) {
            addCriterion("XZQH not like", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhIn(List<String> values) {
            addCriterion("XZQH in", values, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotIn(List<String> values) {
            addCriterion("XZQH not in", values, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhBetween(String value1, String value2) {
            addCriterion("XZQH between", value1, value2, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotBetween(String value1, String value2) {
            addCriterion("XZQH not between", value1, value2, "xzqh");
            return (Criteria) this;
        }

        public Criteria andSyjbIsNull() {
            addCriterion("SYJB is null");
            return (Criteria) this;
        }

        public Criteria andSyjbIsNotNull() {
            addCriterion("SYJB is not null");
            return (Criteria) this;
        }

        public Criteria andSyjbEqualTo(String value) {
            addCriterion("SYJB =", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbNotEqualTo(String value) {
            addCriterion("SYJB <>", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbGreaterThan(String value) {
            addCriterion("SYJB >", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbGreaterThanOrEqualTo(String value) {
            addCriterion("SYJB >=", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbLessThan(String value) {
            addCriterion("SYJB <", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbLessThanOrEqualTo(String value) {
            addCriterion("SYJB <=", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbLike(String value) {
            addCriterion("SYJB like", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbNotLike(String value) {
            addCriterion("SYJB not like", value, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbIn(List<String> values) {
            addCriterion("SYJB in", values, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbNotIn(List<String> values) {
            addCriterion("SYJB not in", values, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbBetween(String value1, String value2) {
            addCriterion("SYJB between", value1, value2, "syjb");
            return (Criteria) this;
        }

        public Criteria andSyjbNotBetween(String value1, String value2) {
            addCriterion("SYJB not between", value1, value2, "syjb");
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