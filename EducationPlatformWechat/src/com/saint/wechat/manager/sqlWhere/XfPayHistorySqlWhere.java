package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfPayHistoryEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XfPayHistorySqlWhere extends XfPayHistoryEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfPayHistorySqlWhere() {
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andSqxhIsNull() {
            addCriterion("SQXH is null");
            return (Criteria) this;
        }

        public Criteria andSqxhIsNotNull() {
            addCriterion("SQXH is not null");
            return (Criteria) this;
        }

        public Criteria andSqxhEqualTo(String value) {
            addCriterion("SQXH =", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhNotEqualTo(String value) {
            addCriterion("SQXH <>", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhGreaterThan(String value) {
            addCriterion("SQXH >", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhGreaterThanOrEqualTo(String value) {
            addCriterion("SQXH >=", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhLessThan(String value) {
            addCriterion("SQXH <", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhLessThanOrEqualTo(String value) {
            addCriterion("SQXH <=", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhLike(String value) {
            addCriterion("SQXH like", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhNotLike(String value) {
            addCriterion("SQXH not like", value, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhIn(List<String> values) {
            addCriterion("SQXH in", values, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhNotIn(List<String> values) {
            addCriterion("SQXH not in", values, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhBetween(String value1, String value2) {
            addCriterion("SQXH between", value1, value2, "sqxh");
            return (Criteria) this;
        }

        public Criteria andSqxhNotBetween(String value1, String value2) {
            addCriterion("SQXH not between", value1, value2, "sqxh");
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

        public Criteria andYitongcardIsNull() {
            addCriterion("YITONGCARD is null");
            return (Criteria) this;
        }

        public Criteria andYitongcardIsNotNull() {
            addCriterion("YITONGCARD is not null");
            return (Criteria) this;
        }

        public Criteria andYitongcardEqualTo(String value) {
            addCriterion("YITONGCARD =", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardNotEqualTo(String value) {
            addCriterion("YITONGCARD <>", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardGreaterThan(String value) {
            addCriterion("YITONGCARD >", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardGreaterThanOrEqualTo(String value) {
            addCriterion("YITONGCARD >=", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardLessThan(String value) {
            addCriterion("YITONGCARD <", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardLessThanOrEqualTo(String value) {
            addCriterion("YITONGCARD <=", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardLike(String value) {
            addCriterion("YITONGCARD like", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardNotLike(String value) {
            addCriterion("YITONGCARD not like", value, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardIn(List<String> values) {
            addCriterion("YITONGCARD in", values, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardNotIn(List<String> values) {
            addCriterion("YITONGCARD not in", values, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardBetween(String value1, String value2) {
            addCriterion("YITONGCARD between", value1, value2, "yitongcard");
            return (Criteria) this;
        }

        public Criteria andYitongcardNotBetween(String value1, String value2) {
            addCriterion("YITONGCARD not between", value1, value2, "yitongcard");
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

        public Criteria andPaymethodIsNull() {
            addCriterion("PAYMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNotNull() {
            addCriterion("PAYMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodEqualTo(String value) {
            addCriterion("PAYMETHOD =", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotEqualTo(String value) {
            addCriterion("PAYMETHOD <>", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThan(String value) {
            addCriterion("PAYMETHOD >", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD >=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThan(String value) {
            addCriterion("PAYMETHOD <", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD <=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLike(String value) {
            addCriterion("PAYMETHOD like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotLike(String value) {
            addCriterion("PAYMETHOD not like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodIn(List<String> values) {
            addCriterion("PAYMETHOD in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotIn(List<String> values) {
            addCriterion("PAYMETHOD not in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodBetween(String value1, String value2) {
            addCriterion("PAYMETHOD between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotBetween(String value1, String value2) {
            addCriterion("PAYMETHOD not between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIsNull() {
            addCriterion("PAYMONEY is null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIsNotNull() {
            addCriterion("PAYMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyEqualTo(String value) {
            addCriterion("PAYMONEY =", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotEqualTo(String value) {
            addCriterion("PAYMONEY <>", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThan(String value) {
            addCriterion("PAYMONEY >", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMONEY >=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThan(String value) {
            addCriterion("PAYMONEY <", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThanOrEqualTo(String value) {
            addCriterion("PAYMONEY <=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLike(String value) {
            addCriterion("PAYMONEY like", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotLike(String value) {
            addCriterion("PAYMONEY not like", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIn(List<String> values) {
            addCriterion("PAYMONEY in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotIn(List<String> values) {
            addCriterion("PAYMONEY not in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyBetween(String value1, String value2) {
            addCriterion("PAYMONEY between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotBetween(String value1, String value2) {
            addCriterion("PAYMONEY not between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhIsNull() {
            addCriterion("YHRECEIPEKH is null");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhIsNotNull() {
            addCriterion("YHRECEIPEKH is not null");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhEqualTo(String value) {
            addCriterion("YHRECEIPEKH =", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhNotEqualTo(String value) {
            addCriterion("YHRECEIPEKH <>", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhGreaterThan(String value) {
            addCriterion("YHRECEIPEKH >", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhGreaterThanOrEqualTo(String value) {
            addCriterion("YHRECEIPEKH >=", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhLessThan(String value) {
            addCriterion("YHRECEIPEKH <", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhLessThanOrEqualTo(String value) {
            addCriterion("YHRECEIPEKH <=", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhLike(String value) {
            addCriterion("YHRECEIPEKH like", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhNotLike(String value) {
            addCriterion("YHRECEIPEKH not like", value, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhIn(List<String> values) {
            addCriterion("YHRECEIPEKH in", values, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhNotIn(List<String> values) {
            addCriterion("YHRECEIPEKH not in", values, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhBetween(String value1, String value2) {
            addCriterion("YHRECEIPEKH between", value1, value2, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhreceipekhNotBetween(String value1, String value2) {
            addCriterion("YHRECEIPEKH not between", value1, value2, "yhreceipekh");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmIsNull() {
            addCriterion("YHRECRIPEXM is null");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmIsNotNull() {
            addCriterion("YHRECRIPEXM is not null");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmEqualTo(String value) {
            addCriterion("YHRECRIPEXM =", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmNotEqualTo(String value) {
            addCriterion("YHRECRIPEXM <>", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmGreaterThan(String value) {
            addCriterion("YHRECRIPEXM >", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmGreaterThanOrEqualTo(String value) {
            addCriterion("YHRECRIPEXM >=", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmLessThan(String value) {
            addCriterion("YHRECRIPEXM <", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmLessThanOrEqualTo(String value) {
            addCriterion("YHRECRIPEXM <=", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmLike(String value) {
            addCriterion("YHRECRIPEXM like", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmNotLike(String value) {
            addCriterion("YHRECRIPEXM not like", value, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmIn(List<String> values) {
            addCriterion("YHRECRIPEXM in", values, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmNotIn(List<String> values) {
            addCriterion("YHRECRIPEXM not in", values, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmBetween(String value1, String value2) {
            addCriterion("YHRECRIPEXM between", value1, value2, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andYhrecripexmNotBetween(String value1, String value2) {
            addCriterion("YHRECRIPEXM not between", value1, value2, "yhrecripexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmIsNull() {
            addCriterion("RGRECEIPEXM is null");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmIsNotNull() {
            addCriterion("RGRECEIPEXM is not null");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmEqualTo(String value) {
            addCriterion("RGRECEIPEXM =", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmNotEqualTo(String value) {
            addCriterion("RGRECEIPEXM <>", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmGreaterThan(String value) {
            addCriterion("RGRECEIPEXM >", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmGreaterThanOrEqualTo(String value) {
            addCriterion("RGRECEIPEXM >=", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmLessThan(String value) {
            addCriterion("RGRECEIPEXM <", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmLessThanOrEqualTo(String value) {
            addCriterion("RGRECEIPEXM <=", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmLike(String value) {
            addCriterion("RGRECEIPEXM like", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmNotLike(String value) {
            addCriterion("RGRECEIPEXM not like", value, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmIn(List<String> values) {
            addCriterion("RGRECEIPEXM in", values, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmNotIn(List<String> values) {
            addCriterion("RGRECEIPEXM not in", values, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmBetween(String value1, String value2) {
            addCriterion("RGRECEIPEXM between", value1, value2, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipexmNotBetween(String value1, String value2) {
            addCriterion("RGRECEIPEXM not between", value1, value2, "rgreceipexm");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelIsNull() {
            addCriterion("RGRECEIPETEL is null");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelIsNotNull() {
            addCriterion("RGRECEIPETEL is not null");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelEqualTo(String value) {
            addCriterion("RGRECEIPETEL =", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelNotEqualTo(String value) {
            addCriterion("RGRECEIPETEL <>", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelGreaterThan(String value) {
            addCriterion("RGRECEIPETEL >", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelGreaterThanOrEqualTo(String value) {
            addCriterion("RGRECEIPETEL >=", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelLessThan(String value) {
            addCriterion("RGRECEIPETEL <", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelLessThanOrEqualTo(String value) {
            addCriterion("RGRECEIPETEL <=", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelLike(String value) {
            addCriterion("RGRECEIPETEL like", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelNotLike(String value) {
            addCriterion("RGRECEIPETEL not like", value, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelIn(List<String> values) {
            addCriterion("RGRECEIPETEL in", values, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelNotIn(List<String> values) {
            addCriterion("RGRECEIPETEL not in", values, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelBetween(String value1, String value2) {
            addCriterion("RGRECEIPETEL between", value1, value2, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgreceipetelNotBetween(String value1, String value2) {
            addCriterion("RGRECEIPETEL not between", value1, value2, "rgreceipetel");
            return (Criteria) this;
        }

        public Criteria andRgbzIsNull() {
            addCriterion("RGBZ is null");
            return (Criteria) this;
        }

        public Criteria andRgbzIsNotNull() {
            addCriterion("RGBZ is not null");
            return (Criteria) this;
        }

        public Criteria andRgbzEqualTo(String value) {
            addCriterion("RGBZ =", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzNotEqualTo(String value) {
            addCriterion("RGBZ <>", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzGreaterThan(String value) {
            addCriterion("RGBZ >", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzGreaterThanOrEqualTo(String value) {
            addCriterion("RGBZ >=", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzLessThan(String value) {
            addCriterion("RGBZ <", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzLessThanOrEqualTo(String value) {
            addCriterion("RGBZ <=", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzLike(String value) {
            addCriterion("RGBZ like", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzNotLike(String value) {
            addCriterion("RGBZ not like", value, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzIn(List<String> values) {
            addCriterion("RGBZ in", values, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzNotIn(List<String> values) {
            addCriterion("RGBZ not in", values, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzBetween(String value1, String value2) {
            addCriterion("RGBZ between", value1, value2, "rgbz");
            return (Criteria) this;
        }

        public Criteria andRgbzNotBetween(String value1, String value2) {
            addCriterion("RGBZ not between", value1, value2, "rgbz");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("PAYTIME is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("PAYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterionForJDBCDate("PAYTIME =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PAYTIME <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PAYTIME >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAYTIME >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterionForJDBCDate("PAYTIME <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAYTIME <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterionForJDBCDate("PAYTIME in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PAYTIME not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAYTIME between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAYTIME not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Timestamp value) {
            addCriterion("PAYTIME =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Timestamp value) {
            addCriterion("PAYTIME <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Timestamp value) {
            addCriterion("PAYTIME >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PAYTIME >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Timestamp value) {
            addCriterion("PAYTIME <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PAYTIME <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PAYTIME between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PAYTIME not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("REMARK2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("REMARK2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("REMARK2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("REMARK2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("REMARK2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("REMARK2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("REMARK2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("REMARK2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("REMARK2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("REMARK2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("REMARK2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("REMARK3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("REMARK3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("REMARK3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("REMARK3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("REMARK3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("REMARK3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("REMARK3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("REMARK3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("REMARK3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("REMARK3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("REMARK3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("REMARK4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("REMARK4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("REMARK4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("REMARK4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("REMARK4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("REMARK4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("REMARK4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("REMARK4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("REMARK4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("REMARK4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("REMARK4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("REMARK4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("REMARK4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("REMARK5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("REMARK5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("REMARK5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("REMARK5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("REMARK5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("REMARK5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("REMARK5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("REMARK5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("REMARK5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("REMARK5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("REMARK5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("REMARK5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("REMARK5 not between", value1, value2, "remark5");
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