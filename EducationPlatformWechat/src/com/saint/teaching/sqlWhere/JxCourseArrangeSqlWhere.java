package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxCourseArrangeEntity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_COURSEARRANGE
*表说明伦理审查
  */
public class JxCourseArrangeSqlWhere extends JxCourseArrangeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxCourseArrangeSqlWhere() {
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

        public Criteria andCoursenumIsNull() {
            addCriterion("COURSENUM is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNotNull() {
            addCriterion("COURSENUM is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumEqualTo(String value) {
            addCriterion("COURSENUM =", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotEqualTo(String value) {
            addCriterion("COURSENUM <>", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThan(String value) {
            addCriterion("COURSENUM >", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThanOrEqualTo(String value) {
            addCriterion("COURSENUM >=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThan(String value) {
            addCriterion("COURSENUM <", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThanOrEqualTo(String value) {
            addCriterion("COURSENUM <=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLike(String value) {
            addCriterion("COURSENUM like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotLike(String value) {
            addCriterion("COURSENUM not like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIn(List<String> values) {
            addCriterion("COURSENUM in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotIn(List<String> values) {
            addCriterion("COURSENUM not in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumBetween(String value1, String value2) {
            addCriterion("COURSENUM between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotBetween(String value1, String value2) {
            addCriterion("COURSENUM not between", value1, value2, "coursenum");
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

        public Criteria andZxtimenumIsNull() {
            addCriterion("ZXTIMENUM is null");
            return (Criteria) this;
        }

        public Criteria andZxtimenumIsNotNull() {
            addCriterion("ZXTIMENUM is not null");
            return (Criteria) this;
        }

        public Criteria andZxtimenumEqualTo(String value) {
            addCriterion("ZXTIMENUM =", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumNotEqualTo(String value) {
            addCriterion("ZXTIMENUM <>", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumGreaterThan(String value) {
            addCriterion("ZXTIMENUM >", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumGreaterThanOrEqualTo(String value) {
            addCriterion("ZXTIMENUM >=", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumLessThan(String value) {
            addCriterion("ZXTIMENUM <", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumLessThanOrEqualTo(String value) {
            addCriterion("ZXTIMENUM <=", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumLike(String value) {
            addCriterion("ZXTIMENUM like", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumNotLike(String value) {
            addCriterion("ZXTIMENUM not like", value, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumIn(List<String> values) {
            addCriterion("ZXTIMENUM in", values, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumNotIn(List<String> values) {
            addCriterion("ZXTIMENUM not in", values, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumBetween(String value1, String value2) {
            addCriterion("ZXTIMENUM between", value1, value2, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenumNotBetween(String value1, String value2) {
            addCriterion("ZXTIMENUM not between", value1, value2, "zxtimenum");
            return (Criteria) this;
        }

        public Criteria andZxtimenameIsNull() {
            addCriterion("ZXTIMENAME is null");
            return (Criteria) this;
        }

        public Criteria andZxtimenameIsNotNull() {
            addCriterion("ZXTIMENAME is not null");
            return (Criteria) this;
        }

        public Criteria andZxtimenameEqualTo(String value) {
            addCriterion("ZXTIMENAME =", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameNotEqualTo(String value) {
            addCriterion("ZXTIMENAME <>", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameGreaterThan(String value) {
            addCriterion("ZXTIMENAME >", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameGreaterThanOrEqualTo(String value) {
            addCriterion("ZXTIMENAME >=", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameLessThan(String value) {
            addCriterion("ZXTIMENAME <", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameLessThanOrEqualTo(String value) {
            addCriterion("ZXTIMENAME <=", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameLike(String value) {
            addCriterion("ZXTIMENAME like", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameNotLike(String value) {
            addCriterion("ZXTIMENAME not like", value, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameIn(List<String> values) {
            addCriterion("ZXTIMENAME in", values, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameNotIn(List<String> values) {
            addCriterion("ZXTIMENAME not in", values, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameBetween(String value1, String value2) {
            addCriterion("ZXTIMENAME between", value1, value2, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andZxtimenameNotBetween(String value1, String value2) {
            addCriterion("ZXTIMENAME not between", value1, value2, "zxtimename");
            return (Criteria) this;
        }

        public Criteria andRkjshidIsNull() {
            addCriterion("RKJSHID is null");
            return (Criteria) this;
        }

        public Criteria andRkjshidIsNotNull() {
            addCriterion("RKJSHID is not null");
            return (Criteria) this;
        }

        public Criteria andRkjshidEqualTo(String value) {
            addCriterion("RKJSHID =", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidNotEqualTo(String value) {
            addCriterion("RKJSHID <>", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidGreaterThan(String value) {
            addCriterion("RKJSHID >", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidGreaterThanOrEqualTo(String value) {
            addCriterion("RKJSHID >=", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidLessThan(String value) {
            addCriterion("RKJSHID <", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidLessThanOrEqualTo(String value) {
            addCriterion("RKJSHID <=", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidLike(String value) {
            addCriterion("RKJSHID like", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidNotLike(String value) {
            addCriterion("RKJSHID not like", value, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidIn(List<String> values) {
            addCriterion("RKJSHID in", values, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidNotIn(List<String> values) {
            addCriterion("RKJSHID not in", values, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidBetween(String value1, String value2) {
            addCriterion("RKJSHID between", value1, value2, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshidNotBetween(String value1, String value2) {
            addCriterion("RKJSHID not between", value1, value2, "rkjshid");
            return (Criteria) this;
        }

        public Criteria andRkjshnameIsNull() {
            addCriterion("RKJSHNAME is null");
            return (Criteria) this;
        }

        public Criteria andRkjshnameIsNotNull() {
            addCriterion("RKJSHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRkjshnameEqualTo(String value) {
            addCriterion("RKJSHNAME =", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameNotEqualTo(String value) {
            addCriterion("RKJSHNAME <>", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameGreaterThan(String value) {
            addCriterion("RKJSHNAME >", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameGreaterThanOrEqualTo(String value) {
            addCriterion("RKJSHNAME >=", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameLessThan(String value) {
            addCriterion("RKJSHNAME <", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameLessThanOrEqualTo(String value) {
            addCriterion("RKJSHNAME <=", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameLike(String value) {
            addCriterion("RKJSHNAME like", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameNotLike(String value) {
            addCriterion("RKJSHNAME not like", value, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameIn(List<String> values) {
            addCriterion("RKJSHNAME in", values, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameNotIn(List<String> values) {
            addCriterion("RKJSHNAME not in", values, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameBetween(String value1, String value2) {
            addCriterion("RKJSHNAME between", value1, value2, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshnameNotBetween(String value1, String value2) {
            addCriterion("RKJSHNAME not between", value1, value2, "rkjshname");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchIsNull() {
            addCriterion("RKJSHZHCH is null");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchIsNotNull() {
            addCriterion("RKJSHZHCH is not null");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchEqualTo(String value) {
            addCriterion("RKJSHZHCH =", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchNotEqualTo(String value) {
            addCriterion("RKJSHZHCH <>", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchGreaterThan(String value) {
            addCriterion("RKJSHZHCH >", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchGreaterThanOrEqualTo(String value) {
            addCriterion("RKJSHZHCH >=", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchLessThan(String value) {
            addCriterion("RKJSHZHCH <", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchLessThanOrEqualTo(String value) {
            addCriterion("RKJSHZHCH <=", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchLike(String value) {
            addCriterion("RKJSHZHCH like", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchNotLike(String value) {
            addCriterion("RKJSHZHCH not like", value, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchIn(List<String> values) {
            addCriterion("RKJSHZHCH in", values, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchNotIn(List<String> values) {
            addCriterion("RKJSHZHCH not in", values, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchBetween(String value1, String value2) {
            addCriterion("RKJSHZHCH between", value1, value2, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andRkjshzhchNotBetween(String value1, String value2) {
            addCriterion("RKJSHZHCH not between", value1, value2, "rkjshzhch");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andKclbIsNull() {
            addCriterion("KCLB is null");
            return (Criteria) this;
        }

        public Criteria andKclbIsNotNull() {
            addCriterion("KCLB is not null");
            return (Criteria) this;
        }

        public Criteria andKclbEqualTo(String value) {
            addCriterion("KCLB =", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotEqualTo(String value) {
            addCriterion("KCLB <>", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbGreaterThan(String value) {
            addCriterion("KCLB >", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbGreaterThanOrEqualTo(String value) {
            addCriterion("KCLB >=", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLessThan(String value) {
            addCriterion("KCLB <", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLessThanOrEqualTo(String value) {
            addCriterion("KCLB <=", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLike(String value) {
            addCriterion("KCLB like", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotLike(String value) {
            addCriterion("KCLB not like", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbIn(List<String> values) {
            addCriterion("KCLB in", values, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotIn(List<String> values) {
            addCriterion("KCLB not in", values, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbBetween(String value1, String value2) {
            addCriterion("KCLB between", value1, value2, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotBetween(String value1, String value2) {
            addCriterion("KCLB not between", value1, value2, "kclb");
            return (Criteria) this;
        }

        public Criteria andShkzhciIsNull() {
            addCriterion("SHKZHCI is null");
            return (Criteria) this;
        }

        public Criteria andShkzhciIsNotNull() {
            addCriterion("SHKZHCI is not null");
            return (Criteria) this;
        }

        public Criteria andShkzhciEqualTo(String value) {
            addCriterion("SHKZHCI =", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciNotEqualTo(String value) {
            addCriterion("SHKZHCI <>", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciGreaterThan(String value) {
            addCriterion("SHKZHCI >", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciGreaterThanOrEqualTo(String value) {
            addCriterion("SHKZHCI >=", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciLessThan(String value) {
            addCriterion("SHKZHCI <", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciLessThanOrEqualTo(String value) {
            addCriterion("SHKZHCI <=", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciLike(String value) {
            addCriterion("SHKZHCI like", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciNotLike(String value) {
            addCriterion("SHKZHCI not like", value, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciIn(List<String> values) {
            addCriterion("SHKZHCI in", values, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciNotIn(List<String> values) {
            addCriterion("SHKZHCI not in", values, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciBetween(String value1, String value2) {
            addCriterion("SHKZHCI between", value1, value2, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkzhciNotBetween(String value1, String value2) {
            addCriterion("SHKZHCI not between", value1, value2, "shkzhci");
            return (Criteria) this;
        }

        public Criteria andShkxqiIsNull() {
            addCriterion("SHKXQI is null");
            return (Criteria) this;
        }

        public Criteria andShkxqiIsNotNull() {
            addCriterion("SHKXQI is not null");
            return (Criteria) this;
        }

        public Criteria andShkxqiEqualTo(String value) {
            addCriterion("SHKXQI =", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiNotEqualTo(String value) {
            addCriterion("SHKXQI <>", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiGreaterThan(String value) {
            addCriterion("SHKXQI >", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXQI >=", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiLessThan(String value) {
            addCriterion("SHKXQI <", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiLessThanOrEqualTo(String value) {
            addCriterion("SHKXQI <=", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiLike(String value) {
            addCriterion("SHKXQI like", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiNotLike(String value) {
            addCriterion("SHKXQI not like", value, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiIn(List<String> values) {
            addCriterion("SHKXQI in", values, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiNotIn(List<String> values) {
            addCriterion("SHKXQI not in", values, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiBetween(String value1, String value2) {
            addCriterion("SHKXQI between", value1, value2, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andShkxqiNotBetween(String value1, String value2) {
            addCriterion("SHKXQI not between", value1, value2, "shkxqi");
            return (Criteria) this;
        }

        public Criteria andSkdateIsNull() {
            addCriterion("SKDATE is null");
            return (Criteria) this;
        }

        public Criteria andSkdateIsNotNull() {
            addCriterion("SKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSkdateEqualTo(Date value) {
            addCriterionForJDBCDate("SKDATE =", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SKDATE <>", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateGreaterThan(Date value) {
            addCriterionForJDBCDate("SKDATE >", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SKDATE >=", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateLessThan(Date value) {
            addCriterionForJDBCDate("SKDATE <", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SKDATE <=", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateIn(List<Date> values) {
            addCriterionForJDBCDate("SKDATE in", values, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SKDATE not in", values, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SKDATE between", value1, value2, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SKDATE not between", value1, value2, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateEqualTo(Timestamp value) {
            addCriterion("SKDATE =", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateNotEqualTo(Timestamp value) {
            addCriterion("SKDATE <>", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateGreaterThan(Timestamp value) {
            addCriterion("SKDATE >", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SKDATE >=", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateLessThan(Timestamp value) {
            addCriterion("SKDATE <", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("SKDATE <=", value, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SKDATE between", value1, value2, "skdate");
            return (Criteria) this;
        }

        public Criteria andSkdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SKDATE not between", value1, value2, "skdate");
            return (Criteria) this;
        }

        public Criteria andShtimeIsNull() {
            addCriterion("SHTIME is null");
            return (Criteria) this;
        }

        public Criteria andShtimeIsNotNull() {
            addCriterion("SHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andShtimeEqualTo(String value) {
            addCriterion("SHTIME =", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotEqualTo(String value) {
            addCriterion("SHTIME <>", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeGreaterThan(String value) {
            addCriterion("SHTIME >", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeGreaterThanOrEqualTo(String value) {
            addCriterion("SHTIME >=", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLessThan(String value) {
            addCriterion("SHTIME <", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLessThanOrEqualTo(String value) {
            addCriterion("SHTIME <=", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLike(String value) {
            addCriterion("SHTIME like", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotLike(String value) {
            addCriterion("SHTIME not like", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeIn(List<String> values) {
            addCriterion("SHTIME in", values, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotIn(List<String> values) {
            addCriterion("SHTIME not in", values, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeBetween(String value1, String value2) {
            addCriterion("SHTIME between", value1, value2, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotBetween(String value1, String value2) {
            addCriterion("SHTIME not between", value1, value2, "shtime");
            return (Criteria) this;
        }

        public Criteria andSkjshuIsNull() {
            addCriterion("SKJSHU is null");
            return (Criteria) this;
        }

        public Criteria andSkjshuIsNotNull() {
            addCriterion("SKJSHU is not null");
            return (Criteria) this;
        }

        public Criteria andSkjshuEqualTo(String value) {
            addCriterion("SKJSHU =", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuNotEqualTo(String value) {
            addCriterion("SKJSHU <>", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuGreaterThan(String value) {
            addCriterion("SKJSHU >", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuGreaterThanOrEqualTo(String value) {
            addCriterion("SKJSHU >=", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuLessThan(String value) {
            addCriterion("SKJSHU <", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuLessThanOrEqualTo(String value) {
            addCriterion("SKJSHU <=", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuLike(String value) {
            addCriterion("SKJSHU like", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuNotLike(String value) {
            addCriterion("SKJSHU not like", value, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuIn(List<String> values) {
            addCriterion("SKJSHU in", values, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuNotIn(List<String> values) {
            addCriterion("SKJSHU not in", values, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuBetween(String value1, String value2) {
            addCriterion("SKJSHU between", value1, value2, "skjshu");
            return (Criteria) this;
        }

        public Criteria andSkjshuNotBetween(String value1, String value2) {
            addCriterion("SKJSHU not between", value1, value2, "skjshu");
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

        public Criteria andShkxshIsNull() {
            addCriterion("SHKXSH is null");
            return (Criteria) this;
        }

        public Criteria andShkxshIsNotNull() {
            addCriterion("SHKXSH is not null");
            return (Criteria) this;
        }

        public Criteria andShkxshEqualTo(String value) {
            addCriterion("SHKXSH =", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshNotEqualTo(String value) {
            addCriterion("SHKXSH <>", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshGreaterThan(String value) {
            addCriterion("SHKXSH >", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXSH >=", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshLessThan(String value) {
            addCriterion("SHKXSH <", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshLessThanOrEqualTo(String value) {
            addCriterion("SHKXSH <=", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshLike(String value) {
            addCriterion("SHKXSH like", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshNotLike(String value) {
            addCriterion("SHKXSH not like", value, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshIn(List<String> values) {
            addCriterion("SHKXSH in", values, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshNotIn(List<String> values) {
            addCriterion("SHKXSH not in", values, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshBetween(String value1, String value2) {
            addCriterion("SHKXSH between", value1, value2, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andShkxshNotBetween(String value1, String value2) {
            addCriterion("SHKXSH not between", value1, value2, "shkxsh");
            return (Criteria) this;
        }

        public Criteria andBjIsNull() {
            addCriterion("BJ is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("BJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("BJ =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("BJ <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("BJ >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("BJ >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("BJ <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("BJ <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("BJ like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("BJ not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("BJ in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("BJ not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("BJ between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("BJ not between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andSjxsIsNull() {
            addCriterion("SJXS is null");
            return (Criteria) this;
        }

        public Criteria andSjxsIsNotNull() {
            addCriterion("SJXS is not null");
            return (Criteria) this;
        }

        public Criteria andSjxsEqualTo(String value) {
            addCriterion("SJXS =", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsNotEqualTo(String value) {
            addCriterion("SJXS <>", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsGreaterThan(String value) {
            addCriterion("SJXS >", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsGreaterThanOrEqualTo(String value) {
            addCriterion("SJXS >=", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsLessThan(String value) {
            addCriterion("SJXS <", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsLessThanOrEqualTo(String value) {
            addCriterion("SJXS <=", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsLike(String value) {
            addCriterion("SJXS like", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsNotLike(String value) {
            addCriterion("SJXS not like", value, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsIn(List<String> values) {
            addCriterion("SJXS in", values, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsNotIn(List<String> values) {
            addCriterion("SJXS not in", values, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsBetween(String value1, String value2) {
            addCriterion("SJXS between", value1, value2, "sjxs");
            return (Criteria) this;
        }

        public Criteria andSjxsNotBetween(String value1, String value2) {
            addCriterion("SJXS not between", value1, value2, "sjxs");
            return (Criteria) this;
        }

        public Criteria andOpemidIsNull() {
            addCriterion("OPEMID is null");
            return (Criteria) this;
        }

        public Criteria andOpemidIsNotNull() {
            addCriterion("OPEMID is not null");
            return (Criteria) this;
        }

        public Criteria andOpemidEqualTo(String value) {
            addCriterion("OPEMID =", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotEqualTo(String value) {
            addCriterion("OPEMID <>", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidGreaterThan(String value) {
            addCriterion("OPEMID >", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidGreaterThanOrEqualTo(String value) {
            addCriterion("OPEMID >=", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidLessThan(String value) {
            addCriterion("OPEMID <", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidLessThanOrEqualTo(String value) {
            addCriterion("OPEMID <=", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidLike(String value) {
            addCriterion("OPEMID like", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotLike(String value) {
            addCriterion("OPEMID not like", value, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidIn(List<String> values) {
            addCriterion("OPEMID in", values, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotIn(List<String> values) {
            addCriterion("OPEMID not in", values, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidBetween(String value1, String value2) {
            addCriterion("OPEMID between", value1, value2, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemidNotBetween(String value1, String value2) {
            addCriterion("OPEMID not between", value1, value2, "opemid");
            return (Criteria) this;
        }

        public Criteria andOpemnameIsNull() {
            addCriterion("OPEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpemnameIsNotNull() {
            addCriterion("OPEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpemnameEqualTo(String value) {
            addCriterion("OPEMNAME =", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotEqualTo(String value) {
            addCriterion("OPEMNAME <>", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameGreaterThan(String value) {
            addCriterion("OPEMNAME >", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPEMNAME >=", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameLessThan(String value) {
            addCriterion("OPEMNAME <", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameLessThanOrEqualTo(String value) {
            addCriterion("OPEMNAME <=", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameLike(String value) {
            addCriterion("OPEMNAME like", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotLike(String value) {
            addCriterion("OPEMNAME not like", value, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameIn(List<String> values) {
            addCriterion("OPEMNAME in", values, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotIn(List<String> values) {
            addCriterion("OPEMNAME not in", values, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameBetween(String value1, String value2) {
            addCriterion("OPEMNAME between", value1, value2, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpemnameNotBetween(String value1, String value2) {
            addCriterion("OPEMNAME not between", value1, value2, "opemname");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Timestamp value) {
            addCriterion("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Timestamp value) {
            addCriterion("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Timestamp value) {
            addCriterion("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Timestamp value) {
            addCriterion("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPDATE not between", value1, value2, "opdate");
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

        public Criteria andDaystatedxIsNull() {
            addCriterion("DAYSTATEDX is null");
            return (Criteria) this;
        }

        public Criteria andDaystatedxIsNotNull() {
            addCriterion("DAYSTATEDX is not null");
            return (Criteria) this;
        }

        public Criteria andDaystatedxEqualTo(String value) {
            addCriterion("DAYSTATEDX =", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxNotEqualTo(String value) {
            addCriterion("DAYSTATEDX <>", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxGreaterThan(String value) {
            addCriterion("DAYSTATEDX >", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxGreaterThanOrEqualTo(String value) {
            addCriterion("DAYSTATEDX >=", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxLessThan(String value) {
            addCriterion("DAYSTATEDX <", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxLessThanOrEqualTo(String value) {
            addCriterion("DAYSTATEDX <=", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxLike(String value) {
            addCriterion("DAYSTATEDX like", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxNotLike(String value) {
            addCriterion("DAYSTATEDX not like", value, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxIn(List<String> values) {
            addCriterion("DAYSTATEDX in", values, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxNotIn(List<String> values) {
            addCriterion("DAYSTATEDX not in", values, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxBetween(String value1, String value2) {
            addCriterion("DAYSTATEDX between", value1, value2, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andDaystatedxNotBetween(String value1, String value2) {
            addCriterion("DAYSTATEDX not between", value1, value2, "daystatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxIsNull() {
            addCriterion("WEEKSTATEDX is null");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxIsNotNull() {
            addCriterion("WEEKSTATEDX is not null");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxEqualTo(String value) {
            addCriterion("WEEKSTATEDX =", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxNotEqualTo(String value) {
            addCriterion("WEEKSTATEDX <>", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxGreaterThan(String value) {
            addCriterion("WEEKSTATEDX >", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxGreaterThanOrEqualTo(String value) {
            addCriterion("WEEKSTATEDX >=", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxLessThan(String value) {
            addCriterion("WEEKSTATEDX <", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxLessThanOrEqualTo(String value) {
            addCriterion("WEEKSTATEDX <=", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxLike(String value) {
            addCriterion("WEEKSTATEDX like", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxNotLike(String value) {
            addCriterion("WEEKSTATEDX not like", value, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxIn(List<String> values) {
            addCriterion("WEEKSTATEDX in", values, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxNotIn(List<String> values) {
            addCriterion("WEEKSTATEDX not in", values, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxBetween(String value1, String value2) {
            addCriterion("WEEKSTATEDX between", value1, value2, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andWeekstatedxNotBetween(String value1, String value2) {
            addCriterion("WEEKSTATEDX not between", value1, value2, "weekstatedx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxIsNull() {
            addCriterion("DAYREPLYDX is null");
            return (Criteria) this;
        }

        public Criteria andDayreplydxIsNotNull() {
            addCriterion("DAYREPLYDX is not null");
            return (Criteria) this;
        }

        public Criteria andDayreplydxEqualTo(String value) {
            addCriterion("DAYREPLYDX =", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxNotEqualTo(String value) {
            addCriterion("DAYREPLYDX <>", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxGreaterThan(String value) {
            addCriterion("DAYREPLYDX >", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxGreaterThanOrEqualTo(String value) {
            addCriterion("DAYREPLYDX >=", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxLessThan(String value) {
            addCriterion("DAYREPLYDX <", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxLessThanOrEqualTo(String value) {
            addCriterion("DAYREPLYDX <=", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxLike(String value) {
            addCriterion("DAYREPLYDX like", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxNotLike(String value) {
            addCriterion("DAYREPLYDX not like", value, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxIn(List<String> values) {
            addCriterion("DAYREPLYDX in", values, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxNotIn(List<String> values) {
            addCriterion("DAYREPLYDX not in", values, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxBetween(String value1, String value2) {
            addCriterion("DAYREPLYDX between", value1, value2, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andDayreplydxNotBetween(String value1, String value2) {
            addCriterion("DAYREPLYDX not between", value1, value2, "dayreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxIsNull() {
            addCriterion("WEEKREPLYDX is null");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxIsNotNull() {
            addCriterion("WEEKREPLYDX is not null");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxEqualTo(String value) {
            addCriterion("WEEKREPLYDX =", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxNotEqualTo(String value) {
            addCriterion("WEEKREPLYDX <>", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxGreaterThan(String value) {
            addCriterion("WEEKREPLYDX >", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxGreaterThanOrEqualTo(String value) {
            addCriterion("WEEKREPLYDX >=", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxLessThan(String value) {
            addCriterion("WEEKREPLYDX <", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxLessThanOrEqualTo(String value) {
            addCriterion("WEEKREPLYDX <=", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxLike(String value) {
            addCriterion("WEEKREPLYDX like", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxNotLike(String value) {
            addCriterion("WEEKREPLYDX not like", value, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxIn(List<String> values) {
            addCriterion("WEEKREPLYDX in", values, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxNotIn(List<String> values) {
            addCriterion("WEEKREPLYDX not in", values, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxBetween(String value1, String value2) {
            addCriterion("WEEKREPLYDX between", value1, value2, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andWeekreplydxNotBetween(String value1, String value2) {
            addCriterion("WEEKREPLYDX not between", value1, value2, "weekreplydx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxIsNull() {
            addCriterion("DAYSTATEWX is null");
            return (Criteria) this;
        }

        public Criteria andDaystatewxIsNotNull() {
            addCriterion("DAYSTATEWX is not null");
            return (Criteria) this;
        }

        public Criteria andDaystatewxEqualTo(String value) {
            addCriterion("DAYSTATEWX =", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxNotEqualTo(String value) {
            addCriterion("DAYSTATEWX <>", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxGreaterThan(String value) {
            addCriterion("DAYSTATEWX >", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxGreaterThanOrEqualTo(String value) {
            addCriterion("DAYSTATEWX >=", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxLessThan(String value) {
            addCriterion("DAYSTATEWX <", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxLessThanOrEqualTo(String value) {
            addCriterion("DAYSTATEWX <=", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxLike(String value) {
            addCriterion("DAYSTATEWX like", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxNotLike(String value) {
            addCriterion("DAYSTATEWX not like", value, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxIn(List<String> values) {
            addCriterion("DAYSTATEWX in", values, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxNotIn(List<String> values) {
            addCriterion("DAYSTATEWX not in", values, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxBetween(String value1, String value2) {
            addCriterion("DAYSTATEWX between", value1, value2, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andDaystatewxNotBetween(String value1, String value2) {
            addCriterion("DAYSTATEWX not between", value1, value2, "daystatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxIsNull() {
            addCriterion("WEEKSTATEWX is null");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxIsNotNull() {
            addCriterion("WEEKSTATEWX is not null");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxEqualTo(String value) {
            addCriterion("WEEKSTATEWX =", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxNotEqualTo(String value) {
            addCriterion("WEEKSTATEWX <>", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxGreaterThan(String value) {
            addCriterion("WEEKSTATEWX >", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxGreaterThanOrEqualTo(String value) {
            addCriterion("WEEKSTATEWX >=", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxLessThan(String value) {
            addCriterion("WEEKSTATEWX <", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxLessThanOrEqualTo(String value) {
            addCriterion("WEEKSTATEWX <=", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxLike(String value) {
            addCriterion("WEEKSTATEWX like", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxNotLike(String value) {
            addCriterion("WEEKSTATEWX not like", value, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxIn(List<String> values) {
            addCriterion("WEEKSTATEWX in", values, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxNotIn(List<String> values) {
            addCriterion("WEEKSTATEWX not in", values, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxBetween(String value1, String value2) {
            addCriterion("WEEKSTATEWX between", value1, value2, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andWeekstatewxNotBetween(String value1, String value2) {
            addCriterion("WEEKSTATEWX not between", value1, value2, "weekstatewx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxIsNull() {
            addCriterion("DAYREPLYWX is null");
            return (Criteria) this;
        }

        public Criteria andDayreplywxIsNotNull() {
            addCriterion("DAYREPLYWX is not null");
            return (Criteria) this;
        }

        public Criteria andDayreplywxEqualTo(String value) {
            addCriterion("DAYREPLYWX =", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxNotEqualTo(String value) {
            addCriterion("DAYREPLYWX <>", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxGreaterThan(String value) {
            addCriterion("DAYREPLYWX >", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxGreaterThanOrEqualTo(String value) {
            addCriterion("DAYREPLYWX >=", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxLessThan(String value) {
            addCriterion("DAYREPLYWX <", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxLessThanOrEqualTo(String value) {
            addCriterion("DAYREPLYWX <=", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxLike(String value) {
            addCriterion("DAYREPLYWX like", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxNotLike(String value) {
            addCriterion("DAYREPLYWX not like", value, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxIn(List<String> values) {
            addCriterion("DAYREPLYWX in", values, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxNotIn(List<String> values) {
            addCriterion("DAYREPLYWX not in", values, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxBetween(String value1, String value2) {
            addCriterion("DAYREPLYWX between", value1, value2, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andDayreplywxNotBetween(String value1, String value2) {
            addCriterion("DAYREPLYWX not between", value1, value2, "dayreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxIsNull() {
            addCriterion("WEEKREPLYWX is null");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxIsNotNull() {
            addCriterion("WEEKREPLYWX is not null");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxEqualTo(String value) {
            addCriterion("WEEKREPLYWX =", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxNotEqualTo(String value) {
            addCriterion("WEEKREPLYWX <>", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxGreaterThan(String value) {
            addCriterion("WEEKREPLYWX >", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxGreaterThanOrEqualTo(String value) {
            addCriterion("WEEKREPLYWX >=", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxLessThan(String value) {
            addCriterion("WEEKREPLYWX <", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxLessThanOrEqualTo(String value) {
            addCriterion("WEEKREPLYWX <=", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxLike(String value) {
            addCriterion("WEEKREPLYWX like", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxNotLike(String value) {
            addCriterion("WEEKREPLYWX not like", value, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxIn(List<String> values) {
            addCriterion("WEEKREPLYWX in", values, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxNotIn(List<String> values) {
            addCriterion("WEEKREPLYWX not in", values, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxBetween(String value1, String value2) {
            addCriterion("WEEKREPLYWX between", value1, value2, "weekreplywx");
            return (Criteria) this;
        }

        public Criteria andWeekreplywxNotBetween(String value1, String value2) {
            addCriterion("WEEKREPLYWX not between", value1, value2, "weekreplywx");
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
        
        public Criteria andSFDFIsNull() {
            addCriterion("SFDF is null");
            return (Criteria) this;
        }

        public Criteria andSFDFIsNotNull() {
            addCriterion("SFDF is not null");
            return (Criteria) this;
        }

        public Criteria andSFDFEqualTo(String value) {
            addCriterion("SFDF =", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFNotEqualTo(String value) {
            addCriterion("SFDF <>", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFGreaterThan(String value) {
            addCriterion("SFDF >", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFGreaterThanOrEqualTo(String value) {
            addCriterion("SFDF >=", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFLessThan(String value) {
            addCriterion("SFDF <", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFLessThanOrEqualTo(String value) {
            addCriterion("SFDF <=", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFLike(String value) {
            addCriterion("SFDF like", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFNotLike(String value) {
            addCriterion("SFDF not like", value, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFIn(List<String> values) {
            addCriterion("SFDF in", values, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFNotIn(List<String> values) {
            addCriterion("SFDF not in", values, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFBetween(String value1, String value2) {
            addCriterion("SFDF between", value1, value2, "sfdf");
            return (Criteria) this;
        }

        public Criteria andSFDFNotBetween(String value1, String value2) {
            addCriterion("SFDF not between", value1, value2, "sfdf");
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
        
        public Criteria andShkxuexidIsNull() {
            addCriterion("SHKXUEXID is null");
            return (Criteria) this;
        }

        public Criteria andShkxuexidIsNotNull() {
            addCriterion("SHKXUEXID is not null");
            return (Criteria) this;
        }

        public Criteria andShkxuexidEqualTo(String value) {
            addCriterion("SHKXUEXID =", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidNotEqualTo(String value) {
            addCriterion("SHKXUEXID <>", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidGreaterThan(String value) {
            addCriterion("SHKXUEXID >", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXUEXID >=", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidLessThan(String value) {
            addCriterion("SHKXUEXID <", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidLessThanOrEqualTo(String value) {
            addCriterion("SHKXUEXID <=", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidLike(String value) {
            addCriterion("SHKXUEXID like", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidNotLike(String value) {
            addCriterion("SHKXUEXID not like", value, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidIn(List<String> values) {
            addCriterion("SHKXUEXID in", values, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidNotIn(List<String> values) {
            addCriterion("SHKXUEXID not in", values, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidBetween(String value1, String value2) {
            addCriterion("SHKXUEXID between", value1, value2, "shkxuexid");
            return (Criteria) this;
        }

        public Criteria andShkxuexidNotBetween(String value1, String value2) {
            addCriterion("SHKXUEXID not between", value1, value2, "shkxuexid");
            return (Criteria) this;
        }
        
        //-------------------------------------------------------------------------
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
        
        //-----------------------------------------------------------------
        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
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