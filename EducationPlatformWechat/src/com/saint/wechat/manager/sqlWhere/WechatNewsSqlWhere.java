package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.WechatNewsEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WechatNewsSqlWhere extends WechatNewsEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatNewsSqlWhere() {
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

        public Criteria andYwxhIsNull() {
            addCriterion("YWXH is null");
            return (Criteria) this;
        }

        public Criteria andYwxhIsNotNull() {
            addCriterion("YWXH is not null");
            return (Criteria) this;
        }

        public Criteria andYwxhEqualTo(String value) {
            addCriterion("YWXH =", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhNotEqualTo(String value) {
            addCriterion("YWXH <>", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhGreaterThan(String value) {
            addCriterion("YWXH >", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhGreaterThanOrEqualTo(String value) {
            addCriterion("YWXH >=", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhLessThan(String value) {
            addCriterion("YWXH <", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhLessThanOrEqualTo(String value) {
            addCriterion("YWXH <=", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhLike(String value) {
            addCriterion("YWXH like", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhNotLike(String value) {
            addCriterion("YWXH not like", value, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhIn(List<String> values) {
            addCriterion("YWXH in", values, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhNotIn(List<String> values) {
            addCriterion("YWXH not in", values, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhBetween(String value1, String value2) {
            addCriterion("YWXH between", value1, value2, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwxhNotBetween(String value1, String value2) {
            addCriterion("YWXH not between", value1, value2, "ywxh");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNull() {
            addCriterion("YWLX is null");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNotNull() {
            addCriterion("YWLX is not null");
            return (Criteria) this;
        }

        public Criteria andYwlxEqualTo(String value) {
            addCriterion("YWLX =", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotEqualTo(String value) {
            addCriterion("YWLX <>", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThan(String value) {
            addCriterion("YWLX >", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThanOrEqualTo(String value) {
            addCriterion("YWLX >=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThan(String value) {
            addCriterion("YWLX <", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThanOrEqualTo(String value) {
            addCriterion("YWLX <=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLike(String value) {
            addCriterion("YWLX like", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotLike(String value) {
            addCriterion("YWLX not like", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxIn(List<String> values) {
            addCriterion("YWLX in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotIn(List<String> values) {
            addCriterion("YWLX not in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxBetween(String value1, String value2) {
            addCriterion("YWLX between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotBetween(String value1, String value2) {
            addCriterion("YWLX not between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andFbbtIsNull() {
            addCriterion("FBBT is null");
            return (Criteria) this;
        }

        public Criteria andFbbtIsNotNull() {
            addCriterion("FBBT is not null");
            return (Criteria) this;
        }

        public Criteria andFbbtEqualTo(String value) {
            addCriterion("FBBT =", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtNotEqualTo(String value) {
            addCriterion("FBBT <>", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtGreaterThan(String value) {
            addCriterion("FBBT >", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtGreaterThanOrEqualTo(String value) {
            addCriterion("FBBT >=", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtLessThan(String value) {
            addCriterion("FBBT <", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtLessThanOrEqualTo(String value) {
            addCriterion("FBBT <=", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtLike(String value) {
            addCriterion("FBBT like", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtNotLike(String value) {
            addCriterion("FBBT not like", value, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtIn(List<String> values) {
            addCriterion("FBBT in", values, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtNotIn(List<String> values) {
            addCriterion("FBBT not in", values, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtBetween(String value1, String value2) {
            addCriterion("FBBT between", value1, value2, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbbtNotBetween(String value1, String value2) {
            addCriterion("FBBT not between", value1, value2, "fbbt");
            return (Criteria) this;
        }

        public Criteria andFbnrIsNull() {
            addCriterion("FBNR is null");
            return (Criteria) this;
        }

        public Criteria andFbnrIsNotNull() {
            addCriterion("FBNR is not null");
            return (Criteria) this;
        }

        public Criteria andFbnrEqualTo(String value) {
            addCriterion("FBNR =", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrNotEqualTo(String value) {
            addCriterion("FBNR <>", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrGreaterThan(String value) {
            addCriterion("FBNR >", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrGreaterThanOrEqualTo(String value) {
            addCriterion("FBNR >=", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrLessThan(String value) {
            addCriterion("FBNR <", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrLessThanOrEqualTo(String value) {
            addCriterion("FBNR <=", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrLike(String value) {
            addCriterion("FBNR like", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrNotLike(String value) {
            addCriterion("FBNR not like", value, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrIn(List<String> values) {
            addCriterion("FBNR in", values, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrNotIn(List<String> values) {
            addCriterion("FBNR not in", values, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrBetween(String value1, String value2) {
            addCriterion("FBNR between", value1, value2, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbnrNotBetween(String value1, String value2) {
            addCriterion("FBNR not between", value1, value2, "fbnr");
            return (Criteria) this;
        }

        public Criteria andFbrIsNull() {
            addCriterion("FBR is null");
            return (Criteria) this;
        }

        public Criteria andFbrIsNotNull() {
            addCriterion("FBR is not null");
            return (Criteria) this;
        }

        public Criteria andFbrEqualTo(String value) {
            addCriterion("FBR =", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrNotEqualTo(String value) {
            addCriterion("FBR <>", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrGreaterThan(String value) {
            addCriterion("FBR >", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrGreaterThanOrEqualTo(String value) {
            addCriterion("FBR >=", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrLessThan(String value) {
            addCriterion("FBR <", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrLessThanOrEqualTo(String value) {
            addCriterion("FBR <=", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrLike(String value) {
            addCriterion("FBR like", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrNotLike(String value) {
            addCriterion("FBR not like", value, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrIn(List<String> values) {
            addCriterion("FBR in", values, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrNotIn(List<String> values) {
            addCriterion("FBR not in", values, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrBetween(String value1, String value2) {
            addCriterion("FBR between", value1, value2, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbrNotBetween(String value1, String value2) {
            addCriterion("FBR not between", value1, value2, "fbr");
            return (Criteria) this;
        }

        public Criteria andFbsjIsNull() {
            addCriterion("FBSJ is null");
            return (Criteria) this;
        }

        public Criteria andFbsjIsNotNull() {
            addCriterion("FBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFbsjEqualTo(Date value) {
            addCriterionForJDBCDate("FBSJ =", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("FBSJ <>", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThan(Date value) {
            addCriterionForJDBCDate("FBSJ >", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBSJ >=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThan(Date value) {
            addCriterionForJDBCDate("FBSJ <", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBSJ <=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjIn(List<Date> values) {
            addCriterionForJDBCDate("FBSJ in", values, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("FBSJ not in", values, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBSJ between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBSJ not between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjEqualTo(Timestamp value) {
            addCriterion("FBSJ =", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotEqualTo(Timestamp value) {
            addCriterion("FBSJ <>", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThan(Timestamp value) {
            addCriterion("FBSJ >", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("FBSJ >=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThan(Timestamp value) {
            addCriterion("FBSJ <", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("FBSJ <=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FBSJ between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FBSJ not between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbqxIsNull() {
            addCriterion("FBQX is null");
            return (Criteria) this;
        }

        public Criteria andFbqxIsNotNull() {
            addCriterion("FBQX is not null");
            return (Criteria) this;
        }

        public Criteria andFbqxEqualTo(String value) {
            addCriterion("FBQX =", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxNotEqualTo(String value) {
            addCriterion("FBQX <>", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxGreaterThan(String value) {
            addCriterion("FBQX >", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxGreaterThanOrEqualTo(String value) {
            addCriterion("FBQX >=", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxLessThan(String value) {
            addCriterion("FBQX <", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxLessThanOrEqualTo(String value) {
            addCriterion("FBQX <=", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxLike(String value) {
            addCriterion("FBQX like", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxNotLike(String value) {
            addCriterion("FBQX not like", value, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxIn(List<String> values) {
            addCriterion("FBQX in", values, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxNotIn(List<String> values) {
            addCriterion("FBQX not in", values, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxBetween(String value1, String value2) {
            addCriterion("FBQX between", value1, value2, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbqxNotBetween(String value1, String value2) {
            addCriterion("FBQX not between", value1, value2, "fbqx");
            return (Criteria) this;
        }

        public Criteria andFbshIsNull() {
            addCriterion("FBSH is null");
            return (Criteria) this;
        }

        public Criteria andFbshIsNotNull() {
            addCriterion("FBSH is not null");
            return (Criteria) this;
        }

        public Criteria andFbshEqualTo(String value) {
            addCriterion("FBSH =", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshNotEqualTo(String value) {
            addCriterion("FBSH <>", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshGreaterThan(String value) {
            addCriterion("FBSH >", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshGreaterThanOrEqualTo(String value) {
            addCriterion("FBSH >=", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshLessThan(String value) {
            addCriterion("FBSH <", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshLessThanOrEqualTo(String value) {
            addCriterion("FBSH <=", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshLike(String value) {
            addCriterion("FBSH like", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshNotLike(String value) {
            addCriterion("FBSH not like", value, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshIn(List<String> values) {
            addCriterion("FBSH in", values, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshNotIn(List<String> values) {
            addCriterion("FBSH not in", values, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshBetween(String value1, String value2) {
            addCriterion("FBSH between", value1, value2, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbshNotBetween(String value1, String value2) {
            addCriterion("FBSH not between", value1, value2, "fbsh");
            return (Criteria) this;
        }

        public Criteria andFbgzhIsNull() {
            addCriterion("FBGZH is null");
            return (Criteria) this;
        }

        public Criteria andFbgzhIsNotNull() {
            addCriterion("FBGZH is not null");
            return (Criteria) this;
        }

        public Criteria andFbgzhEqualTo(String value) {
            addCriterion("FBGZH =", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhNotEqualTo(String value) {
            addCriterion("FBGZH <>", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhGreaterThan(String value) {
            addCriterion("FBGZH >", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhGreaterThanOrEqualTo(String value) {
            addCriterion("FBGZH >=", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhLessThan(String value) {
            addCriterion("FBGZH <", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhLessThanOrEqualTo(String value) {
            addCriterion("FBGZH <=", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhLike(String value) {
            addCriterion("FBGZH like", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhNotLike(String value) {
            addCriterion("FBGZH not like", value, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhIn(List<String> values) {
            addCriterion("FBGZH in", values, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhNotIn(List<String> values) {
            addCriterion("FBGZH not in", values, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhBetween(String value1, String value2) {
            addCriterion("FBGZH between", value1, value2, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgzhNotBetween(String value1, String value2) {
            addCriterion("FBGZH not between", value1, value2, "fbgzh");
            return (Criteria) this;
        }

        public Criteria andFbgjzIsNull() {
            addCriterion("FBGJZ is null");
            return (Criteria) this;
        }

        public Criteria andFbgjzIsNotNull() {
            addCriterion("FBGJZ is not null");
            return (Criteria) this;
        }

        public Criteria andFbgjzEqualTo(String value) {
            addCriterion("FBGJZ =", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzNotEqualTo(String value) {
            addCriterion("FBGJZ <>", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzGreaterThan(String value) {
            addCriterion("FBGJZ >", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzGreaterThanOrEqualTo(String value) {
            addCriterion("FBGJZ >=", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzLessThan(String value) {
            addCriterion("FBGJZ <", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzLessThanOrEqualTo(String value) {
            addCriterion("FBGJZ <=", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzLike(String value) {
            addCriterion("FBGJZ like", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzNotLike(String value) {
            addCriterion("FBGJZ not like", value, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzIn(List<String> values) {
            addCriterion("FBGJZ in", values, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzNotIn(List<String> values) {
            addCriterion("FBGJZ not in", values, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzBetween(String value1, String value2) {
            addCriterion("FBGJZ between", value1, value2, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbgjzNotBetween(String value1, String value2) {
            addCriterion("FBGJZ not between", value1, value2, "fbgjz");
            return (Criteria) this;
        }

        public Criteria andFbtopIsNull() {
            addCriterion("FBTOP is null");
            return (Criteria) this;
        }

        public Criteria andFbtopIsNotNull() {
            addCriterion("FBTOP is not null");
            return (Criteria) this;
        }

        public Criteria andFbtopEqualTo(String value) {
            addCriterion("FBTOP =", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopNotEqualTo(String value) {
            addCriterion("FBTOP <>", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopGreaterThan(String value) {
            addCriterion("FBTOP >", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopGreaterThanOrEqualTo(String value) {
            addCriterion("FBTOP >=", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopLessThan(String value) {
            addCriterion("FBTOP <", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopLessThanOrEqualTo(String value) {
            addCriterion("FBTOP <=", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopLike(String value) {
            addCriterion("FBTOP like", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopNotLike(String value) {
            addCriterion("FBTOP not like", value, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopIn(List<String> values) {
            addCriterion("FBTOP in", values, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopNotIn(List<String> values) {
            addCriterion("FBTOP not in", values, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopBetween(String value1, String value2) {
            addCriterion("FBTOP between", value1, value2, "fbtop");
            return (Criteria) this;
        }

        public Criteria andFbtopNotBetween(String value1, String value2) {
            addCriterion("FBTOP not between", value1, value2, "fbtop");
            return (Criteria) this;
        }

        public Criteria andYwbmIsNull() {
            addCriterion("YWBM is null");
            return (Criteria) this;
        }

        public Criteria andYwbmIsNotNull() {
            addCriterion("YWBM is not null");
            return (Criteria) this;
        }

        public Criteria andYwbmEqualTo(String value) {
            addCriterion("YWBM =", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmNotEqualTo(String value) {
            addCriterion("YWBM <>", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmGreaterThan(String value) {
            addCriterion("YWBM >", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmGreaterThanOrEqualTo(String value) {
            addCriterion("YWBM >=", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmLessThan(String value) {
            addCriterion("YWBM <", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmLessThanOrEqualTo(String value) {
            addCriterion("YWBM <=", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmLike(String value) {
            addCriterion("YWBM like", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmNotLike(String value) {
            addCriterion("YWBM not like", value, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmIn(List<String> values) {
            addCriterion("YWBM in", values, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmNotIn(List<String> values) {
            addCriterion("YWBM not in", values, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmBetween(String value1, String value2) {
            addCriterion("YWBM between", value1, value2, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwbmNotBetween(String value1, String value2) {
            addCriterion("YWBM not between", value1, value2, "ywbm");
            return (Criteria) this;
        }

        public Criteria andYwlbIsNull() {
            addCriterion("YWLB is null");
            return (Criteria) this;
        }

        public Criteria andYwlbIsNotNull() {
            addCriterion("YWLB is not null");
            return (Criteria) this;
        }

        public Criteria andYwlbEqualTo(String value) {
            addCriterion("YWLB =", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbNotEqualTo(String value) {
            addCriterion("YWLB <>", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbGreaterThan(String value) {
            addCriterion("YWLB >", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbGreaterThanOrEqualTo(String value) {
            addCriterion("YWLB >=", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbLessThan(String value) {
            addCriterion("YWLB <", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbLessThanOrEqualTo(String value) {
            addCriterion("YWLB <=", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbLike(String value) {
            addCriterion("YWLB like", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbNotLike(String value) {
            addCriterion("YWLB not like", value, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbIn(List<String> values) {
            addCriterion("YWLB in", values, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbNotIn(List<String> values) {
            addCriterion("YWLB not in", values, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbBetween(String value1, String value2) {
            addCriterion("YWLB between", value1, value2, "ywlb");
            return (Criteria) this;
        }

        public Criteria andYwlbNotBetween(String value1, String value2) {
            addCriterion("YWLB not between", value1, value2, "ywlb");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("SJ is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("SJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(String value) {
            addCriterion("SJ =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(String value) {
            addCriterion("SJ <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(String value) {
            addCriterion("SJ >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(String value) {
            addCriterion("SJ >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(String value) {
            addCriterion("SJ <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(String value) {
            addCriterion("SJ <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLike(String value) {
            addCriterion("SJ like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotLike(String value) {
            addCriterion("SJ not like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<String> values) {
            addCriterion("SJ in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<String> values) {
            addCriterion("SJ not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(String value1, String value2) {
            addCriterion("SJ between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(String value1, String value2) {
            addCriterion("SJ not between", value1, value2, "sj");
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