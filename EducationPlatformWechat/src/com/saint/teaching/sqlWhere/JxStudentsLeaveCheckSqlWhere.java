package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_STUDENTS_LEAVE_CHECK
*表说明请假审批
  */
public class JxStudentsLeaveCheckSqlWhere extends JxStudentsLeaveCheckEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxStudentsLeaveCheckSqlWhere() {
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

        public Criteria andStulevidIsNull() {
            addCriterion("STULEVID is null");
            return (Criteria) this;
        }

        public Criteria andStulevidIsNotNull() {
            addCriterion("STULEVID is not null");
            return (Criteria) this;
        }

        public Criteria andStulevidEqualTo(String value) {
            addCriterion("STULEVID =", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidNotEqualTo(String value) {
            addCriterion("STULEVID <>", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidGreaterThan(String value) {
            addCriterion("STULEVID >", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidGreaterThanOrEqualTo(String value) {
            addCriterion("STULEVID >=", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidLessThan(String value) {
            addCriterion("STULEVID <", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidLessThanOrEqualTo(String value) {
            addCriterion("STULEVID <=", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidLike(String value) {
            addCriterion("STULEVID like", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidNotLike(String value) {
            addCriterion("STULEVID not like", value, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidIn(List<String> values) {
            addCriterion("STULEVID in", values, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidNotIn(List<String> values) {
            addCriterion("STULEVID not in", values, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidBetween(String value1, String value2) {
            addCriterion("STULEVID between", value1, value2, "stulevid");
            return (Criteria) this;
        }

        public Criteria andStulevidNotBetween(String value1, String value2) {
            addCriterion("STULEVID not between", value1, value2, "stulevid");
            return (Criteria) this;
        }

        public Criteria andCheckorderIsNull() {
            addCriterion("CHECKORDER is null");
            return (Criteria) this;
        }

        public Criteria andCheckorderIsNotNull() {
            addCriterion("CHECKORDER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckorderEqualTo(String value) {
            addCriterion("CHECKORDER =", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotEqualTo(String value) {
            addCriterion("CHECKORDER <>", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderGreaterThan(String value) {
            addCriterion("CHECKORDER >", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKORDER >=", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderLessThan(String value) {
            addCriterion("CHECKORDER <", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderLessThanOrEqualTo(String value) {
            addCriterion("CHECKORDER <=", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderLike(String value) {
            addCriterion("CHECKORDER like", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotLike(String value) {
            addCriterion("CHECKORDER not like", value, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderIn(List<String> values) {
            addCriterion("CHECKORDER in", values, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotIn(List<String> values) {
            addCriterion("CHECKORDER not in", values, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderBetween(String value1, String value2) {
            addCriterion("CHECKORDER between", value1, value2, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckorderNotBetween(String value1, String value2) {
            addCriterion("CHECKORDER not between", value1, value2, "checkorder");
            return (Criteria) this;
        }

        public Criteria andCheckperidIsNull() {
            addCriterion("CHECKPERID is null");
            return (Criteria) this;
        }

        public Criteria andCheckperidIsNotNull() {
            addCriterion("CHECKPERID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckperidEqualTo(String value) {
            addCriterion("CHECKPERID =", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidNotEqualTo(String value) {
            addCriterion("CHECKPERID <>", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidGreaterThan(String value) {
            addCriterion("CHECKPERID >", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKPERID >=", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidLessThan(String value) {
            addCriterion("CHECKPERID <", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidLessThanOrEqualTo(String value) {
            addCriterion("CHECKPERID <=", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidLike(String value) {
            addCriterion("CHECKPERID like", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidNotLike(String value) {
            addCriterion("CHECKPERID not like", value, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidIn(List<String> values) {
            addCriterion("CHECKPERID in", values, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidNotIn(List<String> values) {
            addCriterion("CHECKPERID not in", values, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidBetween(String value1, String value2) {
            addCriterion("CHECKPERID between", value1, value2, "checkperid");
            return (Criteria) this;
        }

        public Criteria andCheckperidNotBetween(String value1, String value2) {
            addCriterion("CHECKPERID not between", value1, value2, "checkperid");
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

        public Criteria andExplanationIsNull() {
            addCriterion("EXPLANATION is null");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNotNull() {
            addCriterion("EXPLANATION is not null");
            return (Criteria) this;
        }

        public Criteria andExplanationEqualTo(String value) {
            addCriterion("EXPLANATION =", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotEqualTo(String value) {
            addCriterion("EXPLANATION <>", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThan(String value) {
            addCriterion("EXPLANATION >", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLANATION >=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThan(String value) {
            addCriterion("EXPLANATION <", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThanOrEqualTo(String value) {
            addCriterion("EXPLANATION <=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLike(String value) {
            addCriterion("EXPLANATION like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotLike(String value) {
            addCriterion("EXPLANATION not like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationIn(List<String> values) {
            addCriterion("EXPLANATION in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotIn(List<String> values) {
            addCriterion("EXPLANATION not in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationBetween(String value1, String value2) {
            addCriterion("EXPLANATION between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotBetween(String value1, String value2) {
            addCriterion("EXPLANATION not between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Timestamp value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Timestamp value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Timestamp value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Timestamp value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("UPTIME is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("UPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterionForJDBCDate("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPTIME in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPTIME not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPTIME not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Timestamp value) {
            addCriterion("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Timestamp value) {
            addCriterion("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Timestamp value) {
            addCriterion("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Timestamp value) {
            addCriterion("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPTIME not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartIsNull() {
            addCriterion("CHECKPERDEPART is null");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartIsNotNull() {
            addCriterion("CHECKPERDEPART is not null");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartEqualTo(String value) {
            addCriterion("CHECKPERDEPART =", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartNotEqualTo(String value) {
            addCriterion("CHECKPERDEPART <>", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartGreaterThan(String value) {
            addCriterion("CHECKPERDEPART >", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKPERDEPART >=", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartLessThan(String value) {
            addCriterion("CHECKPERDEPART <", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartLessThanOrEqualTo(String value) {
            addCriterion("CHECKPERDEPART <=", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartLike(String value) {
            addCriterion("CHECKPERDEPART like", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartNotLike(String value) {
            addCriterion("CHECKPERDEPART not like", value, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartIn(List<String> values) {
            addCriterion("CHECKPERDEPART in", values, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartNotIn(List<String> values) {
            addCriterion("CHECKPERDEPART not in", values, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartBetween(String value1, String value2) {
            addCriterion("CHECKPERDEPART between", value1, value2, "checkperdepart");
            return (Criteria) this;
        }

        public Criteria andCheckperdepartNotBetween(String value1, String value2) {
            addCriterion("CHECKPERDEPART not between", value1, value2, "checkperdepart");
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