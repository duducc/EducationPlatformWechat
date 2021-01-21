package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_STUDENTS_LEAVE
*表说明学生请假
  */
public class JxStudentsLeaveSqlWhere extends JxStudentsLeaveEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxStudentsLeaveSqlWhere() {
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

        public Criteria andStuidIsNull() {
            addCriterion("STUID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("STUID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("STUID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("STUID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("STUID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("STUID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("STUID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("STUID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("STUID like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("STUID not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("STUID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("STUID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("STUID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("STUID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("STUNAME is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("STUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("STUNAME =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("STUNAME <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("STUNAME >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("STUNAME >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("STUNAME <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("STUNAME <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("STUNAME like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("STUNAME not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("STUNAME in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("STUNAME not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("STUNAME between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("STUNAME not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andEmplxIsNull() {
            addCriterion("EMPLX is null");
            return (Criteria) this;
        }

        public Criteria andEmplxIsNotNull() {
            addCriterion("EMPLX is not null");
            return (Criteria) this;
        }

        public Criteria andEmplxEqualTo(String value) {
            addCriterion("EMPLX =", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxNotEqualTo(String value) {
            addCriterion("EMPLX <>", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxGreaterThan(String value) {
            addCriterion("EMPLX >", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLX >=", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxLessThan(String value) {
            addCriterion("EMPLX <", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxLessThanOrEqualTo(String value) {
            addCriterion("EMPLX <=", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxLike(String value) {
            addCriterion("EMPLX like", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxNotLike(String value) {
            addCriterion("EMPLX not like", value, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxIn(List<String> values) {
            addCriterion("EMPLX in", values, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxNotIn(List<String> values) {
            addCriterion("EMPLX not in", values, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxBetween(String value1, String value2) {
            addCriterion("EMPLX between", value1, value2, "emplx");
            return (Criteria) this;
        }

        public Criteria andEmplxNotBetween(String value1, String value2) {
            addCriterion("EMPLX not between", value1, value2, "emplx");
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

        public Criteria andCauseIsNull() {
            addCriterion("CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("CAUSE =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("CAUSE <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("CAUSE >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("CAUSE >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("CAUSE <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("CAUSE <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("CAUSE like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("CAUSE not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("CAUSE in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("CAUSE not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("CAUSE between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("CAUSE not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartIsNull() {
            addCriterion("LEAVEDATESTART is null");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartIsNotNull() {
            addCriterion("LEAVEDATESTART is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATESTART =", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartNotEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATESTART <>", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartGreaterThan(Date value) {
            addCriterionForJDBCDate("LEAVEDATESTART >", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATESTART >=", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartLessThan(Date value) {
            addCriterionForJDBCDate("LEAVEDATESTART <", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATESTART <=", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartIn(List<Date> values) {
            addCriterionForJDBCDate("LEAVEDATESTART in", values, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartNotIn(List<Date> values) {
            addCriterionForJDBCDate("LEAVEDATESTART not in", values, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LEAVEDATESTART between", value1, value2, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LEAVEDATESTART not between", value1, value2, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartEqualTo(Timestamp value) {
            addCriterion("LEAVEDATESTART =", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartNotEqualTo(Timestamp value) {
            addCriterion("LEAVEDATESTART <>", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartGreaterThan(Timestamp value) {
            addCriterion("LEAVEDATESTART >", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("LEAVEDATESTART >=", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartLessThan(Timestamp value) {
            addCriterion("LEAVEDATESTART <", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartLessThanOrEqualTo(Timestamp value) {
            addCriterion("LEAVEDATESTART <=", value, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LEAVEDATESTART between", value1, value2, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedatestartNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LEAVEDATESTART not between", value1, value2, "leavedatestart");
            return (Criteria) this;
        }

        public Criteria andLeavedateendIsNull() {
            addCriterion("LEAVEDATEEND is null");
            return (Criteria) this;
        }

        public Criteria andLeavedateendIsNotNull() {
            addCriterion("LEAVEDATEEND is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedateendEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATEEND =", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendNotEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATEEND <>", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendGreaterThan(Date value) {
            addCriterionForJDBCDate("LEAVEDATEEND >", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATEEND >=", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendLessThan(Date value) {
            addCriterionForJDBCDate("LEAVEDATEEND <", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LEAVEDATEEND <=", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendIn(List<Date> values) {
            addCriterionForJDBCDate("LEAVEDATEEND in", values, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendNotIn(List<Date> values) {
            addCriterionForJDBCDate("LEAVEDATEEND not in", values, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LEAVEDATEEND between", value1, value2, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LEAVEDATEEND not between", value1, value2, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendEqualTo(Timestamp value) {
            addCriterion("LEAVEDATEEND =", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendNotEqualTo(Timestamp value) {
            addCriterion("LEAVEDATEEND <>", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendGreaterThan(Timestamp value) {
            addCriterion("LEAVEDATEEND >", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("LEAVEDATEEND >=", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendLessThan(Timestamp value) {
            addCriterion("LEAVEDATEEND <", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendLessThanOrEqualTo(Timestamp value) {
            addCriterion("LEAVEDATEEND <=", value, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LEAVEDATEEND between", value1, value2, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andLeavedateendNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LEAVEDATEEND not between", value1, value2, "leavedateend");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPicpathoIsNull() {
            addCriterion("PICPATHO is null");
            return (Criteria) this;
        }

        public Criteria andPicpathoIsNotNull() {
            addCriterion("PICPATHO is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathoEqualTo(String value) {
            addCriterion("PICPATHO =", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoNotEqualTo(String value) {
            addCriterion("PICPATHO <>", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoGreaterThan(String value) {
            addCriterion("PICPATHO >", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoGreaterThanOrEqualTo(String value) {
            addCriterion("PICPATHO >=", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoLessThan(String value) {
            addCriterion("PICPATHO <", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoLessThanOrEqualTo(String value) {
            addCriterion("PICPATHO <=", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoLike(String value) {
            addCriterion("PICPATHO like", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoNotLike(String value) {
            addCriterion("PICPATHO not like", value, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoIn(List<String> values) {
            addCriterion("PICPATHO in", values, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoNotIn(List<String> values) {
            addCriterion("PICPATHO not in", values, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoBetween(String value1, String value2) {
            addCriterion("PICPATHO between", value1, value2, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathoNotBetween(String value1, String value2) {
            addCriterion("PICPATHO not between", value1, value2, "picpatho");
            return (Criteria) this;
        }

        public Criteria andPicpathtIsNull() {
            addCriterion("PICPATHT is null");
            return (Criteria) this;
        }

        public Criteria andPicpathtIsNotNull() {
            addCriterion("PICPATHT is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathtEqualTo(String value) {
            addCriterion("PICPATHT =", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtNotEqualTo(String value) {
            addCriterion("PICPATHT <>", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtGreaterThan(String value) {
            addCriterion("PICPATHT >", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtGreaterThanOrEqualTo(String value) {
            addCriterion("PICPATHT >=", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtLessThan(String value) {
            addCriterion("PICPATHT <", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtLessThanOrEqualTo(String value) {
            addCriterion("PICPATHT <=", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtLike(String value) {
            addCriterion("PICPATHT like", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtNotLike(String value) {
            addCriterion("PICPATHT not like", value, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtIn(List<String> values) {
            addCriterion("PICPATHT in", values, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtNotIn(List<String> values) {
            addCriterion("PICPATHT not in", values, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtBetween(String value1, String value2) {
            addCriterion("PICPATHT between", value1, value2, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathtNotBetween(String value1, String value2) {
            addCriterion("PICPATHT not between", value1, value2, "picpatht");
            return (Criteria) this;
        }

        public Criteria andPicpathsIsNull() {
            addCriterion("PICPATHS is null");
            return (Criteria) this;
        }

        public Criteria andPicpathsIsNotNull() {
            addCriterion("PICPATHS is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathsEqualTo(String value) {
            addCriterion("PICPATHS =", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsNotEqualTo(String value) {
            addCriterion("PICPATHS <>", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsGreaterThan(String value) {
            addCriterion("PICPATHS >", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsGreaterThanOrEqualTo(String value) {
            addCriterion("PICPATHS >=", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsLessThan(String value) {
            addCriterion("PICPATHS <", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsLessThanOrEqualTo(String value) {
            addCriterion("PICPATHS <=", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsLike(String value) {
            addCriterion("PICPATHS like", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsNotLike(String value) {
            addCriterion("PICPATHS not like", value, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsIn(List<String> values) {
            addCriterion("PICPATHS in", values, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsNotIn(List<String> values) {
            addCriterion("PICPATHS not in", values, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsBetween(String value1, String value2) {
            addCriterion("PICPATHS between", value1, value2, "picpaths");
            return (Criteria) this;
        }

        public Criteria andPicpathsNotBetween(String value1, String value2) {
            addCriterion("PICPATHS not between", value1, value2, "picpaths");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("COURSEID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("COURSEID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("COURSEID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("COURSEID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("COURSEID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("COURSEID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("COURSEID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("COURSEID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("COURSEID like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("COURSEID not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("COURSEID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("COURSEID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("COURSEID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("COURSEID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("COURSENAME is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("COURSENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("COURSENAME =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("COURSENAME <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("COURSENAME >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSENAME >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("COURSENAME <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("COURSENAME <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("COURSENAME like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("COURSENAME not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("COURSENAME in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("COURSENAME not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("COURSENAME between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("COURSENAME not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andArrangexhIsNull() {
            addCriterion("ARRANGEXH is null");
            return (Criteria) this;
        }

        public Criteria andArrangexhIsNotNull() {
            addCriterion("ARRANGEXH is not null");
            return (Criteria) this;
        }

        public Criteria andArrangexhEqualTo(String value) {
            addCriterion("ARRANGEXH =", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotEqualTo(String value) {
            addCriterion("ARRANGEXH <>", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhGreaterThan(String value) {
            addCriterion("ARRANGEXH >", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGEXH >=", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhLessThan(String value) {
            addCriterion("ARRANGEXH <", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhLessThanOrEqualTo(String value) {
            addCriterion("ARRANGEXH <=", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhLike(String value) {
            addCriterion("ARRANGEXH like", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotLike(String value) {
            addCriterion("ARRANGEXH not like", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhIn(List<String> values) {
            addCriterion("ARRANGEXH in", values, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotIn(List<String> values) {
            addCriterion("ARRANGEXH not in", values, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhBetween(String value1, String value2) {
            addCriterion("ARRANGEXH between", value1, value2, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotBetween(String value1, String value2) {
            addCriterion("ARRANGEXH not between", value1, value2, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andJshnrIsNull() {
            addCriterion("JSHNR is null");
            return (Criteria) this;
        }

        public Criteria andJshnrIsNotNull() {
            addCriterion("JSHNR is not null");
            return (Criteria) this;
        }

        public Criteria andJshnrEqualTo(String value) {
            addCriterion("JSHNR =", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrNotEqualTo(String value) {
            addCriterion("JSHNR <>", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrGreaterThan(String value) {
            addCriterion("JSHNR >", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrGreaterThanOrEqualTo(String value) {
            addCriterion("JSHNR >=", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrLessThan(String value) {
            addCriterion("JSHNR <", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrLessThanOrEqualTo(String value) {
            addCriterion("JSHNR <=", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrLike(String value) {
            addCriterion("JSHNR like", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrNotLike(String value) {
            addCriterion("JSHNR not like", value, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrIn(List<String> values) {
            addCriterion("JSHNR in", values, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrNotIn(List<String> values) {
            addCriterion("JSHNR not in", values, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrBetween(String value1, String value2) {
            addCriterion("JSHNR between", value1, value2, "jshnr");
            return (Criteria) this;
        }

        public Criteria andJshnrNotBetween(String value1, String value2) {
            addCriterion("JSHNR not between", value1, value2, "jshnr");
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

        public Criteria andTeacheridIsNull() {
            addCriterion("TEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("TEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("TEACHERID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("TEACHERID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("TEACHERID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("TEACHERID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("TEACHERID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("TEACHERID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("TEACHERID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("TEACHERID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("TEACHERID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("TEACHERID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("TEACHERID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("TEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TEACHERNAME =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TEACHERNAME <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TEACHERNAME >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERNAME >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TEACHERNAME <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TEACHERNAME <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TEACHERNAME like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TEACHERNAME not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TEACHERNAME in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TEACHERNAME not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TEACHERNAME between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TEACHERNAME not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andLunxundeptIsNull() {
            addCriterion("LUNXUNDEPT is null");
            return (Criteria) this;
        }

        public Criteria andLunxundeptIsNotNull() {
            addCriterion("LUNXUNDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andLunxundeptEqualTo(String value) {
            addCriterion("LUNXUNDEPT =", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptNotEqualTo(String value) {
            addCriterion("LUNXUNDEPT <>", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptGreaterThan(String value) {
            addCriterion("LUNXUNDEPT >", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptGreaterThanOrEqualTo(String value) {
            addCriterion("LUNXUNDEPT >=", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptLessThan(String value) {
            addCriterion("LUNXUNDEPT <", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptLessThanOrEqualTo(String value) {
            addCriterion("LUNXUNDEPT <=", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptLike(String value) {
            addCriterion("LUNXUNDEPT like", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptNotLike(String value) {
            addCriterion("LUNXUNDEPT not like", value, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptIn(List<String> values) {
            addCriterion("LUNXUNDEPT in", values, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptNotIn(List<String> values) {
            addCriterion("LUNXUNDEPT not in", values, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptBetween(String value1, String value2) {
            addCriterion("LUNXUNDEPT between", value1, value2, "lunxundept");
            return (Criteria) this;
        }

        public Criteria andLunxundeptNotBetween(String value1, String value2) {
            addCriterion("LUNXUNDEPT not between", value1, value2, "lunxundept");
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