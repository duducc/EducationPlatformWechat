package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名XF_EMPLOYEE
*表说明人员信息
  */
public class XfEmployeeSqlWhere extends XfEmployeeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfEmployeeSqlWhere() {
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

        public Criteria andUsernumberIsNull() {
            addCriterion("USERNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNotNull() {
            addCriterion("USERNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumberEqualTo(String value) {
            addCriterion("USERNUMBER =", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotEqualTo(String value) {
            addCriterion("USERNUMBER <>", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThan(String value) {
            addCriterion("USERNUMBER >", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThanOrEqualTo(String value) {
            addCriterion("USERNUMBER >=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThan(String value) {
            addCriterion("USERNUMBER <", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThanOrEqualTo(String value) {
            addCriterion("USERNUMBER <=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLike(String value) {
            addCriterion("USERNUMBER like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotLike(String value) {
            addCriterion("USERNUMBER not like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberIn(List<String> values) {
            addCriterion("USERNUMBER in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotIn(List<String> values) {
            addCriterion("USERNUMBER not in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberBetween(String value1, String value2) {
            addCriterion("USERNUMBER between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotBetween(String value1, String value2) {
            addCriterion("USERNUMBER not between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUserOidIdIsNull() {
            addCriterion("USER_OID_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserOidIdIsNotNull() {
            addCriterion("USER_OID_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserOidIdEqualTo(String value) {
            addCriterion("USER_OID_ID =", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdNotEqualTo(String value) {
            addCriterion("USER_OID_ID <>", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdGreaterThan(String value) {
            addCriterion("USER_OID_ID >", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_OID_ID >=", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdLessThan(String value) {
            addCriterion("USER_OID_ID <", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdLessThanOrEqualTo(String value) {
            addCriterion("USER_OID_ID <=", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdLike(String value) {
            addCriterion("USER_OID_ID like", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdNotLike(String value) {
            addCriterion("USER_OID_ID not like", value, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdIn(List<String> values) {
            addCriterion("USER_OID_ID in", values, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdNotIn(List<String> values) {
            addCriterion("USER_OID_ID not in", values, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdBetween(String value1, String value2) {
            addCriterion("USER_OID_ID between", value1, value2, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUserOidIdNotBetween(String value1, String value2) {
            addCriterion("USER_OID_ID not between", value1, value2, "userOidId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("CARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("CARDTYPE =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("CARDTYPE <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("CARDTYPE >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARDTYPE >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("CARDTYPE <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("CARDTYPE <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("CARDTYPE like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("CARDTYPE not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("CARDTYPE in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("CARDTYPE not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("CARDTYPE between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("CARDTYPE not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andDepartIsNull() {
            addCriterion("DEPART is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsNotNull() {
            addCriterion("DEPART is not null");
            return (Criteria) this;
        }

        public Criteria andDepartEqualTo(String value) {
            addCriterion("DEPART =", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotEqualTo(String value) {
            addCriterion("DEPART <>", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThan(String value) {
            addCriterion("DEPART >", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART >=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThan(String value) {
            addCriterion("DEPART <", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThanOrEqualTo(String value) {
            addCriterion("DEPART <=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLike(String value) {
            addCriterion("DEPART like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotLike(String value) {
            addCriterion("DEPART not like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartIn(List<String> values) {
            addCriterion("DEPART in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotIn(List<String> values) {
            addCriterion("DEPART not in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartBetween(String value1, String value2) {
            addCriterion("DEPART between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotBetween(String value1, String value2) {
            addCriterion("DEPART not between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andYiyuanIsNull() {
            addCriterion("YIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andYiyuanIsNotNull() {
            addCriterion("YIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andYiyuanEqualTo(String value) {
            addCriterion("YIYUAN =", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotEqualTo(String value) {
            addCriterion("YIYUAN <>", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanGreaterThan(String value) {
            addCriterion("YIYUAN >", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("YIYUAN >=", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanLessThan(String value) {
            addCriterion("YIYUAN <", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanLessThanOrEqualTo(String value) {
            addCriterion("YIYUAN <=", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanLike(String value) {
            addCriterion("YIYUAN like", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotLike(String value) {
            addCriterion("YIYUAN not like", value, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanIn(List<String> values) {
            addCriterion("YIYUAN in", values, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotIn(List<String> values) {
            addCriterion("YIYUAN not in", values, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanBetween(String value1, String value2) {
            addCriterion("YIYUAN between", value1, value2, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andYiyuanNotBetween(String value1, String value2) {
            addCriterion("YIYUAN not between", value1, value2, "yiyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("ZHUANYE is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("ZHUANYE is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("ZHUANYE =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("ZHUANYE <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("ZHUANYE >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANYE >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("ZHUANYE <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("ZHUANYE <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("ZHUANYE like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("ZHUANYE not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("ZHUANYE in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("ZHUANYE not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("ZHUANYE between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("ZHUANYE not between", value1, value2, "zhuanye");
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

        public Criteria andXueliIsNull() {
            addCriterion("XUELI is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XUELI is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("XUELI =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("XUELI <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("XUELI >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("XUELI >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("XUELI <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("XUELI <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("XUELI like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("XUELI not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("XUELI in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("XUELI not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("XUELI between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("XUELI not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andShengriIsNull() {
            addCriterion("SHENGRI is null");
            return (Criteria) this;
        }

        public Criteria andShengriIsNotNull() {
            addCriterion("SHENGRI is not null");
            return (Criteria) this;
        }

        public Criteria andShengriEqualTo(String value) {
            addCriterion("SHENGRI =", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotEqualTo(String value) {
            addCriterion("SHENGRI <>", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThan(String value) {
            addCriterion("SHENGRI >", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThanOrEqualTo(String value) {
            addCriterion("SHENGRI >=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThan(String value) {
            addCriterion("SHENGRI <", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThanOrEqualTo(String value) {
            addCriterion("SHENGRI <=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLike(String value) {
            addCriterion("SHENGRI like", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotLike(String value) {
            addCriterion("SHENGRI not like", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriIn(List<String> values) {
            addCriterion("SHENGRI in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotIn(List<String> values) {
            addCriterion("SHENGRI not in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriBetween(String value1, String value2) {
            addCriterion("SHENGRI between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotBetween(String value1, String value2) {
            addCriterion("SHENGRI not between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andZhichengIsNull() {
            addCriterion("ZHICHENG is null");
            return (Criteria) this;
        }

        public Criteria andZhichengIsNotNull() {
            addCriterion("ZHICHENG is not null");
            return (Criteria) this;
        }

        public Criteria andZhichengEqualTo(String value) {
            addCriterion("ZHICHENG =", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotEqualTo(String value) {
            addCriterion("ZHICHENG <>", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengGreaterThan(String value) {
            addCriterion("ZHICHENG >", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengGreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHENG >=", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLessThan(String value) {
            addCriterion("ZHICHENG <", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLessThanOrEqualTo(String value) {
            addCriterion("ZHICHENG <=", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLike(String value) {
            addCriterion("ZHICHENG like", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotLike(String value) {
            addCriterion("ZHICHENG not like", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengIn(List<String> values) {
            addCriterion("ZHICHENG in", values, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotIn(List<String> values) {
            addCriterion("ZHICHENG not in", values, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengBetween(String value1, String value2) {
            addCriterion("ZHICHENG between", value1, value2, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotBetween(String value1, String value2) {
            addCriterion("ZHICHENG not between", value1, value2, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichenglvIsNull() {
            addCriterion("ZHICHENGLV is null");
            return (Criteria) this;
        }

        public Criteria andZhichenglvIsNotNull() {
            addCriterion("ZHICHENGLV is not null");
            return (Criteria) this;
        }

        public Criteria andZhichenglvEqualTo(String value) {
            addCriterion("ZHICHENGLV =", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotEqualTo(String value) {
            addCriterion("ZHICHENGLV <>", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvGreaterThan(String value) {
            addCriterion("ZHICHENGLV >", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvGreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHENGLV >=", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvLessThan(String value) {
            addCriterion("ZHICHENGLV <", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvLessThanOrEqualTo(String value) {
            addCriterion("ZHICHENGLV <=", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvLike(String value) {
            addCriterion("ZHICHENGLV like", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotLike(String value) {
            addCriterion("ZHICHENGLV not like", value, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvIn(List<String> values) {
            addCriterion("ZHICHENGLV in", values, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotIn(List<String> values) {
            addCriterion("ZHICHENGLV not in", values, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvBetween(String value1, String value2) {
            addCriterion("ZHICHENGLV between", value1, value2, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andZhichenglvNotBetween(String value1, String value2) {
            addCriterion("ZHICHENGLV not between", value1, value2, "zhichenglv");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("MINZU is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("MINZU is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("MINZU =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("MINZU <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("MINZU >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("MINZU >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("MINZU <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("MINZU <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("MINZU like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("MINZU not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("MINZU in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("MINZU not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("MINZU between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("MINZU not between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andZhengziIsNull() {
            addCriterion("ZHENGZI is null");
            return (Criteria) this;
        }

        public Criteria andZhengziIsNotNull() {
            addCriterion("ZHENGZI is not null");
            return (Criteria) this;
        }

        public Criteria andZhengziEqualTo(String value) {
            addCriterion("ZHENGZI =", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotEqualTo(String value) {
            addCriterion("ZHENGZI <>", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziGreaterThan(String value) {
            addCriterion("ZHENGZI >", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGZI >=", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziLessThan(String value) {
            addCriterion("ZHENGZI <", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziLessThanOrEqualTo(String value) {
            addCriterion("ZHENGZI <=", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziLike(String value) {
            addCriterion("ZHENGZI like", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotLike(String value) {
            addCriterion("ZHENGZI not like", value, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziIn(List<String> values) {
            addCriterion("ZHENGZI in", values, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotIn(List<String> values) {
            addCriterion("ZHENGZI not in", values, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziBetween(String value1, String value2) {
            addCriterion("ZHENGZI between", value1, value2, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhengziNotBetween(String value1, String value2) {
            addCriterion("ZHENGZI not between", value1, value2, "zhengzi");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNull() {
            addCriterion("ZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("ZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("ZHIWU =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("ZHIWU <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("ZHIWU >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWU >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("ZHIWU <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("ZHIWU <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("ZHIWU like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("ZHIWU not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("ZHIWU in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("ZHIWU not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("ZHIWU between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("ZHIWU not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNull() {
            addCriterion("XUEWEI is null");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNotNull() {
            addCriterion("XUEWEI is not null");
            return (Criteria) this;
        }

        public Criteria andXueweiEqualTo(String value) {
            addCriterion("XUEWEI =", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotEqualTo(String value) {
            addCriterion("XUEWEI <>", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThan(String value) {
            addCriterion("XUEWEI >", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThanOrEqualTo(String value) {
            addCriterion("XUEWEI >=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThan(String value) {
            addCriterion("XUEWEI <", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThanOrEqualTo(String value) {
            addCriterion("XUEWEI <=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLike(String value) {
            addCriterion("XUEWEI like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotLike(String value) {
            addCriterion("XUEWEI not like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiIn(List<String> values) {
            addCriterion("XUEWEI in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotIn(List<String> values) {
            addCriterion("XUEWEI not in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiBetween(String value1, String value2) {
            addCriterion("XUEWEI between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotBetween(String value1, String value2) {
            addCriterion("XUEWEI not between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiIsNull() {
            addCriterion("DIAODONGZHUANGTAI is null");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiIsNotNull() {
            addCriterion("DIAODONGZHUANGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiEqualTo(String value) {
            addCriterion("DIAODONGZHUANGTAI =", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiNotEqualTo(String value) {
            addCriterion("DIAODONGZHUANGTAI <>", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiGreaterThan(String value) {
            addCriterion("DIAODONGZHUANGTAI >", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("DIAODONGZHUANGTAI >=", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiLessThan(String value) {
            addCriterion("DIAODONGZHUANGTAI <", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("DIAODONGZHUANGTAI <=", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiLike(String value) {
            addCriterion("DIAODONGZHUANGTAI like", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiNotLike(String value) {
            addCriterion("DIAODONGZHUANGTAI not like", value, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiIn(List<String> values) {
            addCriterion("DIAODONGZHUANGTAI in", values, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiNotIn(List<String> values) {
            addCriterion("DIAODONGZHUANGTAI not in", values, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiBetween(String value1, String value2) {
            addCriterion("DIAODONGZHUANGTAI between", value1, value2, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDiaodongzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("DIAODONGZHUANGTAI not between", value1, value2, "diaodongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoIsNull() {
            addCriterion("BYYUABXIAO is null");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoIsNotNull() {
            addCriterion("BYYUABXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoEqualTo(String value) {
            addCriterion("BYYUABXIAO =", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoNotEqualTo(String value) {
            addCriterion("BYYUABXIAO <>", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoGreaterThan(String value) {
            addCriterion("BYYUABXIAO >", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoGreaterThanOrEqualTo(String value) {
            addCriterion("BYYUABXIAO >=", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoLessThan(String value) {
            addCriterion("BYYUABXIAO <", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoLessThanOrEqualTo(String value) {
            addCriterion("BYYUABXIAO <=", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoLike(String value) {
            addCriterion("BYYUABXIAO like", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoNotLike(String value) {
            addCriterion("BYYUABXIAO not like", value, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoIn(List<String> values) {
            addCriterion("BYYUABXIAO in", values, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoNotIn(List<String> values) {
            addCriterion("BYYUABXIAO not in", values, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoBetween(String value1, String value2) {
            addCriterion("BYYUABXIAO between", value1, value2, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andByyuabxiaoNotBetween(String value1, String value2) {
            addCriterion("BYYUABXIAO not between", value1, value2, "byyuabxiao");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("USERTEL is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("USERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("USERTEL =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("USERTEL <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("USERTEL >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("USERTEL >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("USERTEL <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("USERTEL <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("USERTEL like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("USERTEL not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("USERTEL in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("USERTEL not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("USERTEL between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("USERTEL not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("USERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("USERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("USERPHONE =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("USERPHONE <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("USERPHONE >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("USERPHONE >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("USERPHONE <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("USERPHONE <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("USERPHONE like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("USERPHONE not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("USERPHONE in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("USERPHONE not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("USERPHONE between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("USERPHONE not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("USEREMAIL =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("USEREMAIL <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("USEREMAIL >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("USEREMAIL >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("USEREMAIL <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("USEREMAIL <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("USEREMAIL like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("USEREMAIL not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("USEREMAIL in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("USEREMAIL not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("USEREMAIL between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("USEREMAIL not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersIsNull() {
            addCriterion("PFTTC_NUMBERS is null");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersIsNotNull() {
            addCriterion("PFTTC_NUMBERS is not null");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersEqualTo(String value) {
            addCriterion("PFTTC_NUMBERS =", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersNotEqualTo(String value) {
            addCriterion("PFTTC_NUMBERS <>", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersGreaterThan(String value) {
            addCriterion("PFTTC_NUMBERS >", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("PFTTC_NUMBERS >=", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersLessThan(String value) {
            addCriterion("PFTTC_NUMBERS <", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersLessThanOrEqualTo(String value) {
            addCriterion("PFTTC_NUMBERS <=", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersLike(String value) {
            addCriterion("PFTTC_NUMBERS like", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersNotLike(String value) {
            addCriterion("PFTTC_NUMBERS not like", value, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersIn(List<String> values) {
            addCriterion("PFTTC_NUMBERS in", values, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersNotIn(List<String> values) {
            addCriterion("PFTTC_NUMBERS not in", values, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersBetween(String value1, String value2) {
            addCriterion("PFTTC_NUMBERS between", value1, value2, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andPfttcNumbersNotBetween(String value1, String value2) {
            addCriterion("PFTTC_NUMBERS not between", value1, value2, "pfttcNumbers");
            return (Criteria) this;
        }

        public Criteria andUserZyidIsNull() {
            addCriterion("USER_ZYID is null");
            return (Criteria) this;
        }

        public Criteria andUserZyidIsNotNull() {
            addCriterion("USER_ZYID is not null");
            return (Criteria) this;
        }

        public Criteria andUserZyidEqualTo(String value) {
            addCriterion("USER_ZYID =", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidNotEqualTo(String value) {
            addCriterion("USER_ZYID <>", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidGreaterThan(String value) {
            addCriterion("USER_ZYID >", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ZYID >=", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidLessThan(String value) {
            addCriterion("USER_ZYID <", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidLessThanOrEqualTo(String value) {
            addCriterion("USER_ZYID <=", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidLike(String value) {
            addCriterion("USER_ZYID like", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidNotLike(String value) {
            addCriterion("USER_ZYID not like", value, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidIn(List<String> values) {
            addCriterion("USER_ZYID in", values, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidNotIn(List<String> values) {
            addCriterion("USER_ZYID not in", values, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidBetween(String value1, String value2) {
            addCriterion("USER_ZYID between", value1, value2, "userZyid");
            return (Criteria) this;
        }

        public Criteria andUserZyidNotBetween(String value1, String value2) {
            addCriterion("USER_ZYID not between", value1, value2, "userZyid");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterionForJDBCDate("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Timestamp value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Timestamp value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Timestamp value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Timestamp value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andBankaResIsNull() {
            addCriterion("BANKA_RES is null");
            return (Criteria) this;
        }

        public Criteria andBankaResIsNotNull() {
            addCriterion("BANKA_RES is not null");
            return (Criteria) this;
        }

        public Criteria andBankaResEqualTo(String value) {
            addCriterion("BANKA_RES =", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResNotEqualTo(String value) {
            addCriterion("BANKA_RES <>", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResGreaterThan(String value) {
            addCriterion("BANKA_RES >", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResGreaterThanOrEqualTo(String value) {
            addCriterion("BANKA_RES >=", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResLessThan(String value) {
            addCriterion("BANKA_RES <", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResLessThanOrEqualTo(String value) {
            addCriterion("BANKA_RES <=", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResLike(String value) {
            addCriterion("BANKA_RES like", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResNotLike(String value) {
            addCriterion("BANKA_RES not like", value, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResIn(List<String> values) {
            addCriterion("BANKA_RES in", values, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResNotIn(List<String> values) {
            addCriterion("BANKA_RES not in", values, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResBetween(String value1, String value2) {
            addCriterion("BANKA_RES between", value1, value2, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andBankaResNotBetween(String value1, String value2) {
            addCriterion("BANKA_RES not between", value1, value2, "bankaRes");
            return (Criteria) this;
        }

        public Criteria andXkbsIsNull() {
            addCriterion("XKBS is null");
            return (Criteria) this;
        }

        public Criteria andXkbsIsNotNull() {
            addCriterion("XKBS is not null");
            return (Criteria) this;
        }

        public Criteria andXkbsEqualTo(Long value) {
            addCriterion("XKBS =", value, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsNotEqualTo(Long value) {
            addCriterion("XKBS <>", value, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsGreaterThan(Long value) {
            addCriterion("XKBS >", value, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsGreaterThanOrEqualTo(Long value) {
            addCriterion("XKBS >=", value, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsLessThan(Long value) {
            addCriterion("XKBS <", value, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsLessThanOrEqualTo(Long value) {
            addCriterion("XKBS <=", value, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsIn(List<Long> values) {
            addCriterion("XKBS in", values, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsNotIn(List<Long> values) {
            addCriterion("XKBS not in", values, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsBetween(Long value1, Long value2) {
            addCriterion("XKBS between", value1, value2, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkbsNotBetween(Long value1, Long value2) {
            addCriterion("XKBS not between", value1, value2, "xkbs");
            return (Criteria) this;
        }

        public Criteria andXkrqIsNull() {
            addCriterion("XKRQ is null");
            return (Criteria) this;
        }

        public Criteria andXkrqIsNotNull() {
            addCriterion("XKRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXkrqEqualTo(String value) {
            addCriterion("XKRQ =", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqNotEqualTo(String value) {
            addCriterion("XKRQ <>", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqGreaterThan(String value) {
            addCriterion("XKRQ >", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqGreaterThanOrEqualTo(String value) {
            addCriterion("XKRQ >=", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqLessThan(String value) {
            addCriterion("XKRQ <", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqLessThanOrEqualTo(String value) {
            addCriterion("XKRQ <=", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqLike(String value) {
            addCriterion("XKRQ like", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqNotLike(String value) {
            addCriterion("XKRQ not like", value, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqIn(List<String> values) {
            addCriterion("XKRQ in", values, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqNotIn(List<String> values) {
            addCriterion("XKRQ not in", values, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqBetween(String value1, String value2) {
            addCriterion("XKRQ between", value1, value2, "xkrq");
            return (Criteria) this;
        }

        public Criteria andXkrqNotBetween(String value1, String value2) {
            addCriterion("XKRQ not between", value1, value2, "xkrq");
            return (Criteria) this;
        }

        public Criteria andDqsjIsNull() {
            addCriterion("DQSJ is null");
            return (Criteria) this;
        }

        public Criteria andDqsjIsNotNull() {
            addCriterion("DQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDqsjEqualTo(String value) {
            addCriterion("DQSJ =", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjNotEqualTo(String value) {
            addCriterion("DQSJ <>", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjGreaterThan(String value) {
            addCriterion("DQSJ >", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjGreaterThanOrEqualTo(String value) {
            addCriterion("DQSJ >=", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjLessThan(String value) {
            addCriterion("DQSJ <", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjLessThanOrEqualTo(String value) {
            addCriterion("DQSJ <=", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjLike(String value) {
            addCriterion("DQSJ like", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjNotLike(String value) {
            addCriterion("DQSJ not like", value, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjIn(List<String> values) {
            addCriterion("DQSJ in", values, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjNotIn(List<String> values) {
            addCriterion("DQSJ not in", values, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjBetween(String value1, String value2) {
            addCriterion("DQSJ between", value1, value2, "dqsj");
            return (Criteria) this;
        }

        public Criteria andDqsjNotBetween(String value1, String value2) {
            addCriterion("DQSJ not between", value1, value2, "dqsj");
            return (Criteria) this;
        }

        public Criteria andUresourceIsNull() {
            addCriterion("URESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUresourceIsNotNull() {
            addCriterion("URESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUresourceEqualTo(Long value) {
            addCriterion("URESOURCE =", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotEqualTo(Long value) {
            addCriterion("URESOURCE <>", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceGreaterThan(Long value) {
            addCriterion("URESOURCE >", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceGreaterThanOrEqualTo(Long value) {
            addCriterion("URESOURCE >=", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceLessThan(Long value) {
            addCriterion("URESOURCE <", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceLessThanOrEqualTo(Long value) {
            addCriterion("URESOURCE <=", value, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceIn(List<Long> values) {
            addCriterion("URESOURCE in", values, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotIn(List<Long> values) {
            addCriterion("URESOURCE not in", values, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceBetween(Long value1, Long value2) {
            addCriterion("URESOURCE between", value1, value2, "uresource");
            return (Criteria) this;
        }

        public Criteria andUresourceNotBetween(Long value1, Long value2) {
            addCriterion("URESOURCE not between", value1, value2, "uresource");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("BEIZHU is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("BEIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("BEIZHU =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("BEIZHU <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("BEIZHU >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHU >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("BEIZHU <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("BEIZHU <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("BEIZHU like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("BEIZHU not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("BEIZHU in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("BEIZHU not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("BEIZHU between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("BEIZHU not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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