package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XfApplyChangeSqlWhere extends XfApplyChangeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfApplyChangeSqlWhere() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andYitongcodeIsNull() {
            addCriterion("YITONGCODE is null");
            return (Criteria) this;
        }

        public Criteria andYitongcodeIsNotNull() {
            addCriterion("YITONGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andYitongcodeEqualTo(String value) {
            addCriterion("YITONGCODE =", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeNotEqualTo(String value) {
            addCriterion("YITONGCODE <>", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeGreaterThan(String value) {
            addCriterion("YITONGCODE >", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeGreaterThanOrEqualTo(String value) {
            addCriterion("YITONGCODE >=", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeLessThan(String value) {
            addCriterion("YITONGCODE <", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeLessThanOrEqualTo(String value) {
            addCriterion("YITONGCODE <=", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeLike(String value) {
            addCriterion("YITONGCODE like", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeNotLike(String value) {
            addCriterion("YITONGCODE not like", value, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeIn(List<String> values) {
            addCriterion("YITONGCODE in", values, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeNotIn(List<String> values) {
            addCriterion("YITONGCODE not in", values, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeBetween(String value1, String value2) {
            addCriterion("YITONGCODE between", value1, value2, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andYitongcodeNotBetween(String value1, String value2) {
            addCriterion("YITONGCODE not between", value1, value2, "yitongcode");
            return (Criteria) this;
        }

        public Criteria andUserxmIsNull() {
            addCriterion("USERXM is null");
            return (Criteria) this;
        }

        public Criteria andUserxmIsNotNull() {
            addCriterion("USERXM is not null");
            return (Criteria) this;
        }

        public Criteria andUserxmEqualTo(String value) {
            addCriterion("USERXM =", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmNotEqualTo(String value) {
            addCriterion("USERXM <>", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmGreaterThan(String value) {
            addCriterion("USERXM >", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmGreaterThanOrEqualTo(String value) {
            addCriterion("USERXM >=", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmLessThan(String value) {
            addCriterion("USERXM <", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmLessThanOrEqualTo(String value) {
            addCriterion("USERXM <=", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmLike(String value) {
            addCriterion("USERXM like", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmNotLike(String value) {
            addCriterion("USERXM not like", value, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmIn(List<String> values) {
            addCriterion("USERXM in", values, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmNotIn(List<String> values) {
            addCriterion("USERXM not in", values, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmBetween(String value1, String value2) {
            addCriterion("USERXM between", value1, value2, "userxm");
            return (Criteria) this;
        }

        public Criteria andUserxmNotBetween(String value1, String value2) {
            addCriterion("USERXM not between", value1, value2, "userxm");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNull() {
            addCriterion("SFZHM is null");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNotNull() {
            addCriterion("SFZHM is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhmEqualTo(String value) {
            addCriterion("SFZHM =", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotEqualTo(String value) {
            addCriterion("SFZHM <>", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThan(String value) {
            addCriterion("SFZHM >", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThanOrEqualTo(String value) {
            addCriterion("SFZHM >=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThan(String value) {
            addCriterion("SFZHM <", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThanOrEqualTo(String value) {
            addCriterion("SFZHM <=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLike(String value) {
            addCriterion("SFZHM like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotLike(String value) {
            addCriterion("SFZHM not like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmIn(List<String> values) {
            addCriterion("SFZHM in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotIn(List<String> values) {
            addCriterion("SFZHM not in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmBetween(String value1, String value2) {
            addCriterion("SFZHM between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotBetween(String value1, String value2) {
            addCriterion("SFZHM not between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("USERSEX is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("USERSEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("USERSEX =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("USERSEX <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("USERSEX >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("USERSEX >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("USERSEX <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("USERSEX <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("USERSEX like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("USERSEX not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("USERSEX in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("USERSEX not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("USERSEX between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("USERSEX not between", value1, value2, "usersex");
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

        public Criteria andYiyuanmcIsNull() {
            addCriterion("YIYUANMC is null");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcIsNotNull() {
            addCriterion("YIYUANMC is not null");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcEqualTo(String value) {
            addCriterion("YIYUANMC =", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcNotEqualTo(String value) {
            addCriterion("YIYUANMC <>", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcGreaterThan(String value) {
            addCriterion("YIYUANMC >", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcGreaterThanOrEqualTo(String value) {
            addCriterion("YIYUANMC >=", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcLessThan(String value) {
            addCriterion("YIYUANMC <", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcLessThanOrEqualTo(String value) {
            addCriterion("YIYUANMC <=", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcLike(String value) {
            addCriterion("YIYUANMC like", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcNotLike(String value) {
            addCriterion("YIYUANMC not like", value, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcIn(List<String> values) {
            addCriterion("YIYUANMC in", values, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcNotIn(List<String> values) {
            addCriterion("YIYUANMC not in", values, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcBetween(String value1, String value2) {
            addCriterion("YIYUANMC between", value1, value2, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andYiyuanmcNotBetween(String value1, String value2) {
            addCriterion("YIYUANMC not between", value1, value2, "yiyuanmc");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("DEPT =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("DEPT <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("DEPT >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("DEPT <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("DEPT <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("DEPT like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("DEPT not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("DEPT in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("DEPT not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("DEPT between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("DEPT not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptmcIsNull() {
            addCriterion("DEPTMC is null");
            return (Criteria) this;
        }

        public Criteria andDeptmcIsNotNull() {
            addCriterion("DEPTMC is not null");
            return (Criteria) this;
        }

        public Criteria andDeptmcEqualTo(String value) {
            addCriterion("DEPTMC =", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcNotEqualTo(String value) {
            addCriterion("DEPTMC <>", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcGreaterThan(String value) {
            addCriterion("DEPTMC >", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTMC >=", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcLessThan(String value) {
            addCriterion("DEPTMC <", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcLessThanOrEqualTo(String value) {
            addCriterion("DEPTMC <=", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcLike(String value) {
            addCriterion("DEPTMC like", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcNotLike(String value) {
            addCriterion("DEPTMC not like", value, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcIn(List<String> values) {
            addCriterion("DEPTMC in", values, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcNotIn(List<String> values) {
            addCriterion("DEPTMC not in", values, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcBetween(String value1, String value2) {
            addCriterion("DEPTMC between", value1, value2, "deptmc");
            return (Criteria) this;
        }

        public Criteria andDeptmcNotBetween(String value1, String value2) {
            addCriterion("DEPTMC not between", value1, value2, "deptmc");
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

        public Criteria andZhichengmcIsNull() {
            addCriterion("ZHICHENGMC is null");
            return (Criteria) this;
        }

        public Criteria andZhichengmcIsNotNull() {
            addCriterion("ZHICHENGMC is not null");
            return (Criteria) this;
        }

        public Criteria andZhichengmcEqualTo(String value) {
            addCriterion("ZHICHENGMC =", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcNotEqualTo(String value) {
            addCriterion("ZHICHENGMC <>", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcGreaterThan(String value) {
            addCriterion("ZHICHENGMC >", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHENGMC >=", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcLessThan(String value) {
            addCriterion("ZHICHENGMC <", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcLessThanOrEqualTo(String value) {
            addCriterion("ZHICHENGMC <=", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcLike(String value) {
            addCriterion("ZHICHENGMC like", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcNotLike(String value) {
            addCriterion("ZHICHENGMC not like", value, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcIn(List<String> values) {
            addCriterion("ZHICHENGMC in", values, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcNotIn(List<String> values) {
            addCriterion("ZHICHENGMC not in", values, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcBetween(String value1, String value2) {
            addCriterion("ZHICHENGMC between", value1, value2, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andZhichengmcNotBetween(String value1, String value2) {
            addCriterion("ZHICHENGMC not between", value1, value2, "zhichengmc");
            return (Criteria) this;
        }

        public Criteria andYhlbIsNull() {
            addCriterion("YHLB is null");
            return (Criteria) this;
        }

        public Criteria andYhlbIsNotNull() {
            addCriterion("YHLB is not null");
            return (Criteria) this;
        }

        public Criteria andYhlbEqualTo(String value) {
            addCriterion("YHLB =", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotEqualTo(String value) {
            addCriterion("YHLB <>", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbGreaterThan(String value) {
            addCriterion("YHLB >", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbGreaterThanOrEqualTo(String value) {
            addCriterion("YHLB >=", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLessThan(String value) {
            addCriterion("YHLB <", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLessThanOrEqualTo(String value) {
            addCriterion("YHLB <=", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLike(String value) {
            addCriterion("YHLB like", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotLike(String value) {
            addCriterion("YHLB not like", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbIn(List<String> values) {
            addCriterion("YHLB in", values, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotIn(List<String> values) {
            addCriterion("YHLB not in", values, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbBetween(String value1, String value2) {
            addCriterion("YHLB between", value1, value2, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotBetween(String value1, String value2) {
            addCriterion("YHLB not between", value1, value2, "yhlb");
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

        public Criteria andSqrdzIsNull() {
            addCriterion("SQRDZ is null");
            return (Criteria) this;
        }

        public Criteria andSqrdzIsNotNull() {
            addCriterion("SQRDZ is not null");
            return (Criteria) this;
        }

        public Criteria andSqrdzEqualTo(String value) {
            addCriterion("SQRDZ =", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzNotEqualTo(String value) {
            addCriterion("SQRDZ <>", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzGreaterThan(String value) {
            addCriterion("SQRDZ >", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzGreaterThanOrEqualTo(String value) {
            addCriterion("SQRDZ >=", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzLessThan(String value) {
            addCriterion("SQRDZ <", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzLessThanOrEqualTo(String value) {
            addCriterion("SQRDZ <=", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzLike(String value) {
            addCriterion("SQRDZ like", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzNotLike(String value) {
            addCriterion("SQRDZ not like", value, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzIn(List<String> values) {
            addCriterion("SQRDZ in", values, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzNotIn(List<String> values) {
            addCriterion("SQRDZ not in", values, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzBetween(String value1, String value2) {
            addCriterion("SQRDZ between", value1, value2, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrdzNotBetween(String value1, String value2) {
            addCriterion("SQRDZ not between", value1, value2, "sqrdz");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsIsNull() {
            addCriterion("SQRLXFS is null");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsIsNotNull() {
            addCriterion("SQRLXFS is not null");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsEqualTo(String value) {
            addCriterion("SQRLXFS =", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsNotEqualTo(String value) {
            addCriterion("SQRLXFS <>", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsGreaterThan(String value) {
            addCriterion("SQRLXFS >", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsGreaterThanOrEqualTo(String value) {
            addCriterion("SQRLXFS >=", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsLessThan(String value) {
            addCriterion("SQRLXFS <", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsLessThanOrEqualTo(String value) {
            addCriterion("SQRLXFS <=", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsLike(String value) {
            addCriterion("SQRLXFS like", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsNotLike(String value) {
            addCriterion("SQRLXFS not like", value, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsIn(List<String> values) {
            addCriterion("SQRLXFS in", values, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsNotIn(List<String> values) {
            addCriterion("SQRLXFS not in", values, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsBetween(String value1, String value2) {
            addCriterion("SQRLXFS between", value1, value2, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andSqrlxfsNotBetween(String value1, String value2) {
            addCriterion("SQRLXFS not between", value1, value2, "sqrlxfs");
            return (Criteria) this;
        }

        public Criteria andBltypeIsNull() {
            addCriterion("BLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBltypeIsNotNull() {
            addCriterion("BLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBltypeEqualTo(String value) {
            addCriterion("BLTYPE =", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotEqualTo(String value) {
            addCriterion("BLTYPE <>", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeGreaterThan(String value) {
            addCriterion("BLTYPE >", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLTYPE >=", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeLessThan(String value) {
            addCriterion("BLTYPE <", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeLessThanOrEqualTo(String value) {
            addCriterion("BLTYPE <=", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeLike(String value) {
            addCriterion("BLTYPE like", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotLike(String value) {
            addCriterion("BLTYPE not like", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeIn(List<String> values) {
            addCriterion("BLTYPE in", values, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotIn(List<String> values) {
            addCriterion("BLTYPE not in", values, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeBetween(String value1, String value2) {
            addCriterion("BLTYPE between", value1, value2, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotBetween(String value1, String value2) {
            addCriterion("BLTYPE not between", value1, value2, "bltype");
            return (Criteria) this;
        }

        public Criteria andSqsjIsNull() {
            addCriterion("SQSJ is null");
            return (Criteria) this;
        }

        public Criteria andSqsjIsNotNull() {
            addCriterion("SQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSqsjEqualTo(Date value) {
            addCriterionForJDBCDate("SQSJ =", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SQSJ <>", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SQSJ >", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQSJ >=", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLessThan(Date value) {
            addCriterionForJDBCDate("SQSJ <", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQSJ <=", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjIn(List<Date> values) {
            addCriterionForJDBCDate("SQSJ in", values, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SQSJ not in", values, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQSJ between", value1, value2, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQSJ not between", value1, value2, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjEqualTo(Timestamp value) {
            addCriterion("SQSJ =", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotEqualTo(Timestamp value) {
            addCriterion("SQSJ <>", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjGreaterThan(Timestamp value) {
            addCriterion("SQSJ >", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SQSJ >=", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLessThan(Timestamp value) {
            addCriterion("SQSJ <", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("SQSJ <=", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SQSJ between", value1, value2, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SQSJ not between", value1, value2, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSpbjIsNull() {
            addCriterion("SPBJ is null");
            return (Criteria) this;
        }

        public Criteria andSpbjIsNotNull() {
            addCriterion("SPBJ is not null");
            return (Criteria) this;
        }

        public Criteria andSpbjEqualTo(String value) {
            addCriterion("SPBJ =", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjNotEqualTo(String value) {
            addCriterion("SPBJ <>", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjGreaterThan(String value) {
            addCriterion("SPBJ >", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjGreaterThanOrEqualTo(String value) {
            addCriterion("SPBJ >=", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjLessThan(String value) {
            addCriterion("SPBJ <", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjLessThanOrEqualTo(String value) {
            addCriterion("SPBJ <=", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjLike(String value) {
            addCriterion("SPBJ like", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjNotLike(String value) {
            addCriterion("SPBJ not like", value, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjIn(List<String> values) {
            addCriterion("SPBJ in", values, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjNotIn(List<String> values) {
            addCriterion("SPBJ not in", values, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjBetween(String value1, String value2) {
            addCriterion("SPBJ between", value1, value2, "spbj");
            return (Criteria) this;
        }

        public Criteria andSpbjNotBetween(String value1, String value2) {
            addCriterion("SPBJ not between", value1, value2, "spbj");
            return (Criteria) this;
        }

        public Criteria andSprIsNull() {
            addCriterion("SPR is null");
            return (Criteria) this;
        }

        public Criteria andSprIsNotNull() {
            addCriterion("SPR is not null");
            return (Criteria) this;
        }

        public Criteria andSprEqualTo(String value) {
            addCriterion("SPR =", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotEqualTo(String value) {
            addCriterion("SPR <>", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprGreaterThan(String value) {
            addCriterion("SPR >", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprGreaterThanOrEqualTo(String value) {
            addCriterion("SPR >=", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprLessThan(String value) {
            addCriterion("SPR <", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprLessThanOrEqualTo(String value) {
            addCriterion("SPR <=", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprLike(String value) {
            addCriterion("SPR like", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotLike(String value) {
            addCriterion("SPR not like", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprIn(List<String> values) {
            addCriterion("SPR in", values, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotIn(List<String> values) {
            addCriterion("SPR not in", values, "spr");
            return (Criteria) this;
        }

        public Criteria andSprBetween(String value1, String value2) {
            addCriterion("SPR between", value1, value2, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotBetween(String value1, String value2) {
            addCriterion("SPR not between", value1, value2, "spr");
            return (Criteria) this;
        }

        public Criteria andSpsjIsNull() {
            addCriterion("SPSJ is null");
            return (Criteria) this;
        }

        public Criteria andSpsjIsNotNull() {
            addCriterion("SPSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSpsjEqualTo(Date value) {
            addCriterionForJDBCDate("SPSJ =", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SPSJ <>", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SPSJ >", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SPSJ >=", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLessThan(Date value) {
            addCriterionForJDBCDate("SPSJ <", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SPSJ <=", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjIn(List<Date> values) {
            addCriterionForJDBCDate("SPSJ in", values, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SPSJ not in", values, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SPSJ between", value1, value2, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SPSJ not between", value1, value2, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjEqualTo(Timestamp value) {
            addCriterion("SPSJ =", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotEqualTo(Timestamp value) {
            addCriterion("SPSJ <>", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjGreaterThan(Timestamp value) {
            addCriterion("SPSJ >", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SPSJ >=", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLessThan(Timestamp value) {
            addCriterion("SPSJ <", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("SPSJ <=", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SPSJ between", value1, value2, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SPSJ not between", value1, value2, "spsj");
            return (Criteria) this;
        }

        public Criteria andZkryxmIsNull() {
            addCriterion("ZKRYXM is null");
            return (Criteria) this;
        }

        public Criteria andZkryxmIsNotNull() {
            addCriterion("ZKRYXM is not null");
            return (Criteria) this;
        }

        public Criteria andZkryxmEqualTo(String value) {
            addCriterion("ZKRYXM =", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmNotEqualTo(String value) {
            addCriterion("ZKRYXM <>", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmGreaterThan(String value) {
            addCriterion("ZKRYXM >", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmGreaterThanOrEqualTo(String value) {
            addCriterion("ZKRYXM >=", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmLessThan(String value) {
            addCriterion("ZKRYXM <", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmLessThanOrEqualTo(String value) {
            addCriterion("ZKRYXM <=", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmLike(String value) {
            addCriterion("ZKRYXM like", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmNotLike(String value) {
            addCriterion("ZKRYXM not like", value, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmIn(List<String> values) {
            addCriterion("ZKRYXM in", values, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmNotIn(List<String> values) {
            addCriterion("ZKRYXM not in", values, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmBetween(String value1, String value2) {
            addCriterion("ZKRYXM between", value1, value2, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkryxmNotBetween(String value1, String value2) {
            addCriterion("ZKRYXM not between", value1, value2, "zkryxm");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsIsNull() {
            addCriterion("ZKRLXFS is null");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsIsNotNull() {
            addCriterion("ZKRLXFS is not null");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsEqualTo(String value) {
            addCriterion("ZKRLXFS =", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsNotEqualTo(String value) {
            addCriterion("ZKRLXFS <>", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsGreaterThan(String value) {
            addCriterion("ZKRLXFS >", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsGreaterThanOrEqualTo(String value) {
            addCriterion("ZKRLXFS >=", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsLessThan(String value) {
            addCriterion("ZKRLXFS <", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsLessThanOrEqualTo(String value) {
            addCriterion("ZKRLXFS <=", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsLike(String value) {
            addCriterion("ZKRLXFS like", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsNotLike(String value) {
            addCriterion("ZKRLXFS not like", value, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsIn(List<String> values) {
            addCriterion("ZKRLXFS in", values, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsNotIn(List<String> values) {
            addCriterion("ZKRLXFS not in", values, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsBetween(String value1, String value2) {
            addCriterion("ZKRLXFS between", value1, value2, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andZkrlxfsNotBetween(String value1, String value2) {
            addCriterion("ZKRLXFS not between", value1, value2, "zkrlxfs");
            return (Criteria) this;
        }

        public Criteria andKdgsmcIsNull() {
            addCriterion("KDGSMC is null");
            return (Criteria) this;
        }

        public Criteria andKdgsmcIsNotNull() {
            addCriterion("KDGSMC is not null");
            return (Criteria) this;
        }

        public Criteria andKdgsmcEqualTo(String value) {
            addCriterion("KDGSMC =", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcNotEqualTo(String value) {
            addCriterion("KDGSMC <>", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcGreaterThan(String value) {
            addCriterion("KDGSMC >", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcGreaterThanOrEqualTo(String value) {
            addCriterion("KDGSMC >=", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcLessThan(String value) {
            addCriterion("KDGSMC <", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcLessThanOrEqualTo(String value) {
            addCriterion("KDGSMC <=", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcLike(String value) {
            addCriterion("KDGSMC like", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcNotLike(String value) {
            addCriterion("KDGSMC not like", value, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcIn(List<String> values) {
            addCriterion("KDGSMC in", values, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcNotIn(List<String> values) {
            addCriterion("KDGSMC not in", values, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcBetween(String value1, String value2) {
            addCriterion("KDGSMC between", value1, value2, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKdgsmcNotBetween(String value1, String value2) {
            addCriterion("KDGSMC not between", value1, value2, "kdgsmc");
            return (Criteria) this;
        }

        public Criteria andKddhIsNull() {
            addCriterion("KDDH is null");
            return (Criteria) this;
        }

        public Criteria andKddhIsNotNull() {
            addCriterion("KDDH is not null");
            return (Criteria) this;
        }

        public Criteria andKddhEqualTo(String value) {
            addCriterion("KDDH =", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhNotEqualTo(String value) {
            addCriterion("KDDH <>", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhGreaterThan(String value) {
            addCriterion("KDDH >", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhGreaterThanOrEqualTo(String value) {
            addCriterion("KDDH >=", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhLessThan(String value) {
            addCriterion("KDDH <", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhLessThanOrEqualTo(String value) {
            addCriterion("KDDH <=", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhLike(String value) {
            addCriterion("KDDH like", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhNotLike(String value) {
            addCriterion("KDDH not like", value, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhIn(List<String> values) {
            addCriterion("KDDH in", values, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhNotIn(List<String> values) {
            addCriterion("KDDH not in", values, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhBetween(String value1, String value2) {
            addCriterion("KDDH between", value1, value2, "kddh");
            return (Criteria) this;
        }

        public Criteria andKddhNotBetween(String value1, String value2) {
            addCriterion("KDDH not between", value1, value2, "kddh");
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