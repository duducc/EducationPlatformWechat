package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxCoursePlanEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_COURSEPLAN
*表说明伦理审查
  */
public class JxCoursePlanSqlWhere extends JxCoursePlanEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxCoursePlanSqlWhere() {
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
        
        //---------------------------------------------------------------
        public Criteria andJxshkdidIsNull() {
            addCriterion("JXSHKDID is null");
            return (Criteria) this;
        }

        public Criteria andJxshkdidIsNotNull() {
            addCriterion("JXSHKDID is not null");
            return (Criteria) this;
        }

        public Criteria andJxshkdidEqualTo(String value) {
            addCriterion("JXSHKDID =", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidNotEqualTo(String value) {
            addCriterion("JXSHKDID <>", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidGreaterThan(String value) {
            addCriterion("JXSHKDID >", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidGreaterThanOrEqualTo(String value) {
            addCriterion("JXSHKDID >=", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidLessThan(String value) {
            addCriterion("JXSHKDID <", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidLessThanOrEqualTo(String value) {
            addCriterion("JXSHKDID <=", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidLike(String value) {
            addCriterion("JXSHKDID like", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidNotLike(String value) {
            addCriterion("JXSHKDID not like", value, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidIn(List<String> values) {
            addCriterion("JXSHKDID in", values, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidNotIn(List<String> values) {
            addCriterion("JXSHKDID not in", values, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidBetween(String value1, String value2) {
            addCriterion("JXSHKDID between", value1, value2, "jxshkdid");
            return (Criteria) this;
        }

        public Criteria andJxshkdidNotBetween(String value1, String value2) {
            addCriterion("JXSHKDID not between", value1, value2, "jxshkdid");
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

        public Criteria andRkjyshidIsNull() {
            addCriterion("RKJYSHID is null");
            return (Criteria) this;
        }

        public Criteria andRkjyshidIsNotNull() {
            addCriterion("RKJYSHID is not null");
            return (Criteria) this;
        }

        public Criteria andRkjyshidEqualTo(String value) {
            addCriterion("RKJYSHID =", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidNotEqualTo(String value) {
            addCriterion("RKJYSHID <>", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidGreaterThan(String value) {
            addCriterion("RKJYSHID >", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidGreaterThanOrEqualTo(String value) {
            addCriterion("RKJYSHID >=", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidLessThan(String value) {
            addCriterion("RKJYSHID <", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidLessThanOrEqualTo(String value) {
            addCriterion("RKJYSHID <=", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidLike(String value) {
            addCriterion("RKJYSHID like", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidNotLike(String value) {
            addCriterion("RKJYSHID not like", value, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidIn(List<String> values) {
            addCriterion("RKJYSHID in", values, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidNotIn(List<String> values) {
            addCriterion("RKJYSHID not in", values, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidBetween(String value1, String value2) {
            addCriterion("RKJYSHID between", value1, value2, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshidNotBetween(String value1, String value2) {
            addCriterion("RKJYSHID not between", value1, value2, "rkjyshid");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcIsNull() {
            addCriterion("RKJYSHMC is null");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcIsNotNull() {
            addCriterion("RKJYSHMC is not null");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcEqualTo(String value) {
            addCriterion("RKJYSHMC =", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcNotEqualTo(String value) {
            addCriterion("RKJYSHMC <>", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcGreaterThan(String value) {
            addCriterion("RKJYSHMC >", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcGreaterThanOrEqualTo(String value) {
            addCriterion("RKJYSHMC >=", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcLessThan(String value) {
            addCriterion("RKJYSHMC <", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcLessThanOrEqualTo(String value) {
            addCriterion("RKJYSHMC <=", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcLike(String value) {
            addCriterion("RKJYSHMC like", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcNotLike(String value) {
            addCriterion("RKJYSHMC not like", value, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcIn(List<String> values) {
            addCriterion("RKJYSHMC in", values, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcNotIn(List<String> values) {
            addCriterion("RKJYSHMC not in", values, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcBetween(String value1, String value2) {
            addCriterion("RKJYSHMC between", value1, value2, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andRkjyshmcNotBetween(String value1, String value2) {
            addCriterion("RKJYSHMC not between", value1, value2, "rkjyshmc");
            return (Criteria) this;
        }

        public Criteria andZxshIsNull() {
            addCriterion("ZXSH is null");
            return (Criteria) this;
        }

        public Criteria andZxshIsNotNull() {
            addCriterion("ZXSH is not null");
            return (Criteria) this;
        }

        public Criteria andZxshEqualTo(String value) {
            addCriterion("ZXSH =", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshNotEqualTo(String value) {
            addCriterion("ZXSH <>", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshGreaterThan(String value) {
            addCriterion("ZXSH >", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshGreaterThanOrEqualTo(String value) {
            addCriterion("ZXSH >=", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshLessThan(String value) {
            addCriterion("ZXSH <", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshLessThanOrEqualTo(String value) {
            addCriterion("ZXSH <=", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshLike(String value) {
            addCriterion("ZXSH like", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshNotLike(String value) {
            addCriterion("ZXSH not like", value, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshIn(List<String> values) {
            addCriterion("ZXSH in", values, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshNotIn(List<String> values) {
            addCriterion("ZXSH not in", values, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshBetween(String value1, String value2) {
            addCriterion("ZXSH between", value1, value2, "zxsh");
            return (Criteria) this;
        }

        public Criteria andZxshNotBetween(String value1, String value2) {
            addCriterion("ZXSH not between", value1, value2, "zxsh");
            return (Criteria) this;
        }

        public Criteria andKchxzhIsNull() {
            addCriterion("KCHXZH is null");
            return (Criteria) this;
        }

        public Criteria andKchxzhIsNotNull() {
            addCriterion("KCHXZH is not null");
            return (Criteria) this;
        }

        public Criteria andKchxzhEqualTo(String value) {
            addCriterion("KCHXZH =", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhNotEqualTo(String value) {
            addCriterion("KCHXZH <>", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhGreaterThan(String value) {
            addCriterion("KCHXZH >", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhGreaterThanOrEqualTo(String value) {
            addCriterion("KCHXZH >=", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhLessThan(String value) {
            addCriterion("KCHXZH <", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhLessThanOrEqualTo(String value) {
            addCriterion("KCHXZH <=", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhLike(String value) {
            addCriterion("KCHXZH like", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhNotLike(String value) {
            addCriterion("KCHXZH not like", value, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhIn(List<String> values) {
            addCriterion("KCHXZH in", values, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhNotIn(List<String> values) {
            addCriterion("KCHXZH not in", values, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhBetween(String value1, String value2) {
            addCriterion("KCHXZH between", value1, value2, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andKchxzhNotBetween(String value1, String value2) {
            addCriterion("KCHXZH not between", value1, value2, "kchxzh");
            return (Criteria) this;
        }

        public Criteria andShkdidIsNull() {
            addCriterion("SHKDID is null");
            return (Criteria) this;
        }

        public Criteria andShkdidIsNotNull() {
            addCriterion("SHKDID is not null");
            return (Criteria) this;
        }

        public Criteria andShkdidEqualTo(String value) {
            addCriterion("SHKDID =", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidNotEqualTo(String value) {
            addCriterion("SHKDID <>", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidGreaterThan(String value) {
            addCriterion("SHKDID >", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidGreaterThanOrEqualTo(String value) {
            addCriterion("SHKDID >=", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidLessThan(String value) {
            addCriterion("SHKDID <", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidLessThanOrEqualTo(String value) {
            addCriterion("SHKDID <=", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidLike(String value) {
            addCriterion("SHKDID like", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidNotLike(String value) {
            addCriterion("SHKDID not like", value, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidIn(List<String> values) {
            addCriterion("SHKDID in", values, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidNotIn(List<String> values) {
            addCriterion("SHKDID not in", values, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidBetween(String value1, String value2) {
            addCriterion("SHKDID between", value1, value2, "shkdid");
            return (Criteria) this;
        }

        public Criteria andShkdidNotBetween(String value1, String value2) {
            addCriterion("SHKDID not between", value1, value2, "shkdid");
            return (Criteria) this;
        }

        public Criteria andEmonumIsNull() {
            addCriterion("EMONUM is null");
            return (Criteria) this;
        }

        public Criteria andEmonumIsNotNull() {
            addCriterion("EMONUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmonumEqualTo(String value) {
            addCriterion("EMONUM =", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumNotEqualTo(String value) {
            addCriterion("EMONUM <>", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumGreaterThan(String value) {
            addCriterion("EMONUM >", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumGreaterThanOrEqualTo(String value) {
            addCriterion("EMONUM >=", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumLessThan(String value) {
            addCriterion("EMONUM <", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumLessThanOrEqualTo(String value) {
            addCriterion("EMONUM <=", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumLike(String value) {
            addCriterion("EMONUM like", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumNotLike(String value) {
            addCriterion("EMONUM not like", value, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumIn(List<String> values) {
            addCriterion("EMONUM in", values, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumNotIn(List<String> values) {
            addCriterion("EMONUM not in", values, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumBetween(String value1, String value2) {
            addCriterion("EMONUM between", value1, value2, "emonum");
            return (Criteria) this;
        }

        public Criteria andEmonumNotBetween(String value1, String value2) {
            addCriterion("EMONUM not between", value1, value2, "emonum");
            return (Criteria) this;
        }

        public Criteria andXshszzhyIsNull() {
            addCriterion("XSHSZZHY is null");
            return (Criteria) this;
        }

        public Criteria andXshszzhyIsNotNull() {
            addCriterion("XSHSZZHY is not null");
            return (Criteria) this;
        }

        public Criteria andXshszzhyEqualTo(String value) {
            addCriterion("XSHSZZHY =", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyNotEqualTo(String value) {
            addCriterion("XSHSZZHY <>", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyGreaterThan(String value) {
            addCriterion("XSHSZZHY >", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyGreaterThanOrEqualTo(String value) {
            addCriterion("XSHSZZHY >=", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyLessThan(String value) {
            addCriterion("XSHSZZHY <", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyLessThanOrEqualTo(String value) {
            addCriterion("XSHSZZHY <=", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyLike(String value) {
            addCriterion("XSHSZZHY like", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyNotLike(String value) {
            addCriterion("XSHSZZHY not like", value, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyIn(List<String> values) {
            addCriterion("XSHSZZHY in", values, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyNotIn(List<String> values) {
            addCriterion("XSHSZZHY not in", values, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyBetween(String value1, String value2) {
            addCriterion("XSHSZZHY between", value1, value2, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andXshszzhyNotBetween(String value1, String value2) {
            addCriterion("XSHSZZHY not between", value1, value2, "xshszzhy");
            return (Criteria) this;
        }

        public Criteria andShkbanjIsNull() {
            addCriterion("SHKBANJ is null");
            return (Criteria) this;
        }

        public Criteria andShkbanjIsNotNull() {
            addCriterion("SHKBANJ is not null");
            return (Criteria) this;
        }

        public Criteria andShkbanjEqualTo(String value) {
            addCriterion("SHKBANJ =", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjNotEqualTo(String value) {
            addCriterion("SHKBANJ <>", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjGreaterThan(String value) {
            addCriterion("SHKBANJ >", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjGreaterThanOrEqualTo(String value) {
            addCriterion("SHKBANJ >=", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjLessThan(String value) {
            addCriterion("SHKBANJ <", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjLessThanOrEqualTo(String value) {
            addCriterion("SHKBANJ <=", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjLike(String value) {
            addCriterion("SHKBANJ like", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjNotLike(String value) {
            addCriterion("SHKBANJ not like", value, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjIn(List<String> values) {
            addCriterion("SHKBANJ in", values, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjNotIn(List<String> values) {
            addCriterion("SHKBANJ not in", values, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjBetween(String value1, String value2) {
            addCriterion("SHKBANJ between", value1, value2, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andShkbanjNotBetween(String value1, String value2) {
            addCriterion("SHKBANJ not between", value1, value2, "shkbanj");
            return (Criteria) this;
        }

        public Criteria andXyjcshmIsNull() {
            addCriterion("XYJCSHM is null");
            return (Criteria) this;
        }

        public Criteria andXyjcshmIsNotNull() {
            addCriterion("XYJCSHM is not null");
            return (Criteria) this;
        }

        public Criteria andXyjcshmEqualTo(String value) {
            addCriterion("XYJCSHM =", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmNotEqualTo(String value) {
            addCriterion("XYJCSHM <>", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmGreaterThan(String value) {
            addCriterion("XYJCSHM >", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmGreaterThanOrEqualTo(String value) {
            addCriterion("XYJCSHM >=", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmLessThan(String value) {
            addCriterion("XYJCSHM <", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmLessThanOrEqualTo(String value) {
            addCriterion("XYJCSHM <=", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmLike(String value) {
            addCriterion("XYJCSHM like", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmNotLike(String value) {
            addCriterion("XYJCSHM not like", value, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmIn(List<String> values) {
            addCriterion("XYJCSHM in", values, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmNotIn(List<String> values) {
            addCriterion("XYJCSHM not in", values, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmBetween(String value1, String value2) {
            addCriterion("XYJCSHM between", value1, value2, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcshmNotBetween(String value1, String value2) {
            addCriterion("XYJCSHM not between", value1, value2, "xyjcshm");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshIsNull() {
            addCriterion("XYJCCHBSH is null");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshIsNotNull() {
            addCriterion("XYJCCHBSH is not null");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshEqualTo(String value) {
            addCriterion("XYJCCHBSH =", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshNotEqualTo(String value) {
            addCriterion("XYJCCHBSH <>", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshGreaterThan(String value) {
            addCriterion("XYJCCHBSH >", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshGreaterThanOrEqualTo(String value) {
            addCriterion("XYJCCHBSH >=", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshLessThan(String value) {
            addCriterion("XYJCCHBSH <", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshLessThanOrEqualTo(String value) {
            addCriterion("XYJCCHBSH <=", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshLike(String value) {
            addCriterion("XYJCCHBSH like", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshNotLike(String value) {
            addCriterion("XYJCCHBSH not like", value, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshIn(List<String> values) {
            addCriterion("XYJCCHBSH in", values, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshNotIn(List<String> values) {
            addCriterion("XYJCCHBSH not in", values, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshBetween(String value1, String value2) {
            addCriterion("XYJCCHBSH between", value1, value2, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcchbshNotBetween(String value1, String value2) {
            addCriterion("XYJCCHBSH not between", value1, value2, "xyjcchbsh");
            return (Criteria) this;
        }

        public Criteria andXyjcbancIsNull() {
            addCriterion("XYJCBANC is null");
            return (Criteria) this;
        }

        public Criteria andXyjcbancIsNotNull() {
            addCriterion("XYJCBANC is not null");
            return (Criteria) this;
        }

        public Criteria andXyjcbancEqualTo(String value) {
            addCriterion("XYJCBANC =", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancNotEqualTo(String value) {
            addCriterion("XYJCBANC <>", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancGreaterThan(String value) {
            addCriterion("XYJCBANC >", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancGreaterThanOrEqualTo(String value) {
            addCriterion("XYJCBANC >=", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancLessThan(String value) {
            addCriterion("XYJCBANC <", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancLessThanOrEqualTo(String value) {
            addCriterion("XYJCBANC <=", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancLike(String value) {
            addCriterion("XYJCBANC like", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancNotLike(String value) {
            addCriterion("XYJCBANC not like", value, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancIn(List<String> values) {
            addCriterion("XYJCBANC in", values, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancNotIn(List<String> values) {
            addCriterion("XYJCBANC not in", values, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancBetween(String value1, String value2) {
            addCriterion("XYJCBANC between", value1, value2, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjcbancNotBetween(String value1, String value2) {
            addCriterion("XYJCBANC not between", value1, value2, "xyjcbanc");
            return (Criteria) this;
        }

        public Criteria andXyjczhbIsNull() {
            addCriterion("XYJCZHB is null");
            return (Criteria) this;
        }

        public Criteria andXyjczhbIsNotNull() {
            addCriterion("XYJCZHB is not null");
            return (Criteria) this;
        }

        public Criteria andXyjczhbEqualTo(String value) {
            addCriterion("XYJCZHB =", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbNotEqualTo(String value) {
            addCriterion("XYJCZHB <>", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbGreaterThan(String value) {
            addCriterion("XYJCZHB >", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbGreaterThanOrEqualTo(String value) {
            addCriterion("XYJCZHB >=", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbLessThan(String value) {
            addCriterion("XYJCZHB <", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbLessThanOrEqualTo(String value) {
            addCriterion("XYJCZHB <=", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbLike(String value) {
            addCriterion("XYJCZHB like", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbNotLike(String value) {
            addCriterion("XYJCZHB not like", value, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbIn(List<String> values) {
            addCriterion("XYJCZHB in", values, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbNotIn(List<String> values) {
            addCriterion("XYJCZHB not in", values, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbBetween(String value1, String value2) {
            addCriterion("XYJCZHB between", value1, value2, "xyjczhb");
            return (Criteria) this;
        }

        public Criteria andXyjczhbNotBetween(String value1, String value2) {
            addCriterion("XYJCZHB not between", value1, value2, "xyjczhb");
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

        public Criteria andShkxuexnameIsNull() {
            addCriterion("SHKXUEXNAME is null");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameIsNotNull() {
            addCriterion("SHKXUEXNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameEqualTo(String value) {
            addCriterion("SHKXUEXNAME =", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameNotEqualTo(String value) {
            addCriterion("SHKXUEXNAME <>", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameGreaterThan(String value) {
            addCriterion("SHKXUEXNAME >", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXUEXNAME >=", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameLessThan(String value) {
            addCriterion("SHKXUEXNAME <", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameLessThanOrEqualTo(String value) {
            addCriterion("SHKXUEXNAME <=", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameLike(String value) {
            addCriterion("SHKXUEXNAME like", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameNotLike(String value) {
            addCriterion("SHKXUEXNAME not like", value, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameIn(List<String> values) {
            addCriterion("SHKXUEXNAME in", values, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameNotIn(List<String> values) {
            addCriterion("SHKXUEXNAME not in", values, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameBetween(String value1, String value2) {
            addCriterion("SHKXUEXNAME between", value1, value2, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxuexnameNotBetween(String value1, String value2) {
            addCriterion("SHKXUEXNAME not between", value1, value2, "shkxuexname");
            return (Criteria) this;
        }

        public Criteria andShkxueyidIsNull() {
            addCriterion("SHKXUEYID is null");
            return (Criteria) this;
        }

        public Criteria andShkxueyidIsNotNull() {
            addCriterion("SHKXUEYID is not null");
            return (Criteria) this;
        }

        public Criteria andShkxueyidEqualTo(String value) {
            addCriterion("SHKXUEYID =", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidNotEqualTo(String value) {
            addCriterion("SHKXUEYID <>", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidGreaterThan(String value) {
            addCriterion("SHKXUEYID >", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXUEYID >=", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidLessThan(String value) {
            addCriterion("SHKXUEYID <", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidLessThanOrEqualTo(String value) {
            addCriterion("SHKXUEYID <=", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidLike(String value) {
            addCriterion("SHKXUEYID like", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidNotLike(String value) {
            addCriterion("SHKXUEYID not like", value, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidIn(List<String> values) {
            addCriterion("SHKXUEYID in", values, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidNotIn(List<String> values) {
            addCriterion("SHKXUEYID not in", values, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidBetween(String value1, String value2) {
            addCriterion("SHKXUEYID between", value1, value2, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueyidNotBetween(String value1, String value2) {
            addCriterion("SHKXUEYID not between", value1, value2, "shkxueyid");
            return (Criteria) this;
        }

        public Criteria andShkxueynameIsNull() {
            addCriterion("SHKXUEYNAME is null");
            return (Criteria) this;
        }

        public Criteria andShkxueynameIsNotNull() {
            addCriterion("SHKXUEYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShkxueynameEqualTo(String value) {
            addCriterion("SHKXUEYNAME =", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameNotEqualTo(String value) {
            addCriterion("SHKXUEYNAME <>", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameGreaterThan(String value) {
            addCriterion("SHKXUEYNAME >", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXUEYNAME >=", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameLessThan(String value) {
            addCriterion("SHKXUEYNAME <", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameLessThanOrEqualTo(String value) {
            addCriterion("SHKXUEYNAME <=", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameLike(String value) {
            addCriterion("SHKXUEYNAME like", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameNotLike(String value) {
            addCriterion("SHKXUEYNAME not like", value, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameIn(List<String> values) {
            addCriterion("SHKXUEYNAME in", values, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameNotIn(List<String> values) {
            addCriterion("SHKXUEYNAME not in", values, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameBetween(String value1, String value2) {
            addCriterion("SHKXUEYNAME between", value1, value2, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andShkxueynameNotBetween(String value1, String value2) {
            addCriterion("SHKXUEYNAME not between", value1, value2, "shkxueyname");
            return (Criteria) this;
        }

        public Criteria andNdshjdIsNull() {
            addCriterion("NDSHJD is null");
            return (Criteria) this;
        }

        public Criteria andNdshjdIsNotNull() {
            addCriterion("NDSHJD is not null");
            return (Criteria) this;
        }

        public Criteria andNdshjdEqualTo(String value) {
            addCriterion("NDSHJD =", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdNotEqualTo(String value) {
            addCriterion("NDSHJD <>", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdGreaterThan(String value) {
            addCriterion("NDSHJD >", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdGreaterThanOrEqualTo(String value) {
            addCriterion("NDSHJD >=", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdLessThan(String value) {
            addCriterion("NDSHJD <", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdLessThanOrEqualTo(String value) {
            addCriterion("NDSHJD <=", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdLike(String value) {
            addCriterion("NDSHJD like", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdNotLike(String value) {
            addCriterion("NDSHJD not like", value, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdIn(List<String> values) {
            addCriterion("NDSHJD in", values, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdNotIn(List<String> values) {
            addCriterion("NDSHJD not in", values, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdBetween(String value1, String value2) {
            addCriterion("NDSHJD between", value1, value2, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andNdshjdNotBetween(String value1, String value2) {
            addCriterion("NDSHJD not between", value1, value2, "ndshjd");
            return (Criteria) this;
        }

        public Criteria andShkxueqiIsNull() {
            addCriterion("SHKXUEQI is null");
            return (Criteria) this;
        }

        public Criteria andShkxueqiIsNotNull() {
            addCriterion("SHKXUEQI is not null");
            return (Criteria) this;
        }

        public Criteria andShkxueqiEqualTo(String value) {
            addCriterion("SHKXUEQI =", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiNotEqualTo(String value) {
            addCriterion("SHKXUEQI <>", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiGreaterThan(String value) {
            addCriterion("SHKXUEQI >", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiGreaterThanOrEqualTo(String value) {
            addCriterion("SHKXUEQI >=", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiLessThan(String value) {
            addCriterion("SHKXUEQI <", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiLessThanOrEqualTo(String value) {
            addCriterion("SHKXUEQI <=", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiLike(String value) {
            addCriterion("SHKXUEQI like", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiNotLike(String value) {
            addCriterion("SHKXUEQI not like", value, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiIn(List<String> values) {
            addCriterion("SHKXUEQI in", values, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiNotIn(List<String> values) {
            addCriterion("SHKXUEQI not in", values, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiBetween(String value1, String value2) {
            addCriterion("SHKXUEQI between", value1, value2, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andShkxueqiNotBetween(String value1, String value2) {
            addCriterion("SHKXUEQI not between", value1, value2, "shkxueqi");
            return (Criteria) this;
        }

        public Criteria andKchstateIsNull() {
            addCriterion("KCHSTATE is null");
            return (Criteria) this;
        }

        public Criteria andKchstateIsNotNull() {
            addCriterion("KCHSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andKchstateEqualTo(String value) {
            addCriterion("KCHSTATE =", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateNotEqualTo(String value) {
            addCriterion("KCHSTATE <>", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateGreaterThan(String value) {
            addCriterion("KCHSTATE >", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateGreaterThanOrEqualTo(String value) {
            addCriterion("KCHSTATE >=", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateLessThan(String value) {
            addCriterion("KCHSTATE <", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateLessThanOrEqualTo(String value) {
            addCriterion("KCHSTATE <=", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateLike(String value) {
            addCriterion("KCHSTATE like", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateNotLike(String value) {
            addCriterion("KCHSTATE not like", value, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateIn(List<String> values) {
            addCriterion("KCHSTATE in", values, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateNotIn(List<String> values) {
            addCriterion("KCHSTATE not in", values, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateBetween(String value1, String value2) {
            addCriterion("KCHSTATE between", value1, value2, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchstateNotBetween(String value1, String value2) {
            addCriterion("KCHSTATE not between", value1, value2, "kchstate");
            return (Criteria) this;
        }

        public Criteria andKchtypeIsNull() {
            addCriterion("KCHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andKchtypeIsNotNull() {
            addCriterion("KCHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andKchtypeEqualTo(String value) {
            addCriterion("KCHTYPE =", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeNotEqualTo(String value) {
            addCriterion("KCHTYPE <>", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeGreaterThan(String value) {
            addCriterion("KCHTYPE >", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeGreaterThanOrEqualTo(String value) {
            addCriterion("KCHTYPE >=", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeLessThan(String value) {
            addCriterion("KCHTYPE <", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeLessThanOrEqualTo(String value) {
            addCriterion("KCHTYPE <=", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeLike(String value) {
            addCriterion("KCHTYPE like", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeNotLike(String value) {
            addCriterion("KCHTYPE not like", value, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeIn(List<String> values) {
            addCriterion("KCHTYPE in", values, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeNotIn(List<String> values) {
            addCriterion("KCHTYPE not in", values, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeBetween(String value1, String value2) {
            addCriterion("KCHTYPE between", value1, value2, "kchtype");
            return (Criteria) this;
        }

        public Criteria andKchtypeNotBetween(String value1, String value2) {
            addCriterion("KCHTYPE not between", value1, value2, "kchtype");
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

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
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
        //============================
        public Criteria andNjIsNull() {
            addCriterion("NJ is null");
            return (Criteria) this;
        }

        public Criteria andNjIsNotNull() {
            addCriterion("NJ is not null");
            return (Criteria) this;
        }

        public Criteria andNjEqualTo(String value) {
            addCriterion("NJ =", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotEqualTo(String value) {
            addCriterion("NJ <>", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThan(String value) {
            addCriterion("NJ >", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThanOrEqualTo(String value) {
            addCriterion("NJ >=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThan(String value) {
            addCriterion("NJ <", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThanOrEqualTo(String value) {
            addCriterion("NJ <=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLike(String value) {
            addCriterion("NJ like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotLike(String value) {
            addCriterion("NJ not like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjIn(List<String> values) {
            addCriterion("NJ in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotIn(List<String> values) {
            addCriterion("NJ not in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjBetween(String value1, String value2) {
            addCriterion("NJ between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotBetween(String value1, String value2) {
            addCriterion("NJ not between", value1, value2, "nj");
            return (Criteria) this;
        }
        //-----------------------------
        public Criteria andFzlsidIsNull() {
            addCriterion("FZLSID is null");
            return (Criteria) this;
        }

        public Criteria andFzlsidIsNotNull() {
            addCriterion("FZLSID is not null");
            return (Criteria) this;
        }

        public Criteria andFzlsidEqualTo(String value) {
            addCriterion("FZLSID =", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidNotEqualTo(String value) {
            addCriterion("FZLSID <>", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidGreaterThan(String value) {
            addCriterion("FZLSID >", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidGreaterThanOrEqualTo(String value) {
            addCriterion("FZLSID >=", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidLessThan(String value) {
            addCriterion("FZLSID <", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidLessThanOrEqualTo(String value) {
            addCriterion("FZLSID <=", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidLike(String value) {
            addCriterion("FZLSID like", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidNotLike(String value) {
            addCriterion("FZLSID not like", value, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidIn(List<String> values) {
            addCriterion("FZLSID in", values, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidNotIn(List<String> values) {
            addCriterion("FZLSID not in", values, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidBetween(String value1, String value2) {
            addCriterion("FZLSID between", value1, value2, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsidNotBetween(String value1, String value2) {
            addCriterion("FZLSID not between", value1, value2, "fzlsid");
            return (Criteria) this;
        }

        public Criteria andFzlsnameIsNull() {
            addCriterion("FZLSNAME is null");
            return (Criteria) this;
        }

        public Criteria andFzlsnameIsNotNull() {
            addCriterion("FZLSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFzlsnameEqualTo(String value) {
            addCriterion("FZLSNAME =", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameNotEqualTo(String value) {
            addCriterion("FZLSNAME <>", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameGreaterThan(String value) {
            addCriterion("FZLSNAME >", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameGreaterThanOrEqualTo(String value) {
            addCriterion("FZLSNAME >=", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameLessThan(String value) {
            addCriterion("FZLSNAME <", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameLessThanOrEqualTo(String value) {
            addCriterion("FZLSNAME <=", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameLike(String value) {
            addCriterion("FZLSNAME like", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameNotLike(String value) {
            addCriterion("FZLSNAME not like", value, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameIn(List<String> values) {
            addCriterion("FZLSNAME in", values, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameNotIn(List<String> values) {
            addCriterion("FZLSNAME not in", values, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameBetween(String value1, String value2) {
            addCriterion("FZLSNAME between", value1, value2, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlsnameNotBetween(String value1, String value2) {
            addCriterion("FZLSNAME not between", value1, value2, "fzlsname");
            return (Criteria) this;
        }

        public Criteria andFzlszcIsNull() {
            addCriterion("FZLSZC is null");
            return (Criteria) this;
        }

        public Criteria andFzlszcIsNotNull() {
            addCriterion("FZLSZC is not null");
            return (Criteria) this;
        }

        public Criteria andFzlszcEqualTo(String value) {
            addCriterion("FZLSZC =", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcNotEqualTo(String value) {
            addCriterion("FZLSZC <>", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcGreaterThan(String value) {
            addCriterion("FZLSZC >", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcGreaterThanOrEqualTo(String value) {
            addCriterion("FZLSZC >=", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcLessThan(String value) {
            addCriterion("FZLSZC <", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcLessThanOrEqualTo(String value) {
            addCriterion("FZLSZC <=", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcLike(String value) {
            addCriterion("FZLSZC like", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcNotLike(String value) {
            addCriterion("FZLSZC not like", value, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcIn(List<String> values) {
            addCriterion("FZLSZC in", values, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcNotIn(List<String> values) {
            addCriterion("FZLSZC not in", values, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcBetween(String value1, String value2) {
            addCriterion("FZLSZC between", value1, value2, "fzlszc");
            return (Criteria) this;
        }

        public Criteria andFzlszcNotBetween(String value1, String value2) {
            addCriterion("FZLSZC not between", value1, value2, "fzlszc");
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

        public Criteria andSjzxsIsNull() {
            addCriterion("SJZXS is null");
            return (Criteria) this;
        }

        public Criteria andSjzxsIsNotNull() {
            addCriterion("SJZXS is not null");
            return (Criteria) this;
        }

        public Criteria andSjzxsEqualTo(String value) {
            addCriterion("SJZXS =", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsNotEqualTo(String value) {
            addCriterion("SJZXS <>", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsGreaterThan(String value) {
            addCriterion("SJZXS >", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsGreaterThanOrEqualTo(String value) {
            addCriterion("SJZXS >=", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsLessThan(String value) {
            addCriterion("SJZXS <", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsLessThanOrEqualTo(String value) {
            addCriterion("SJZXS <=", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsLike(String value) {
            addCriterion("SJZXS like", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsNotLike(String value) {
            addCriterion("SJZXS not like", value, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsIn(List<String> values) {
            addCriterion("SJZXS in", values, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsNotIn(List<String> values) {
            addCriterion("SJZXS not in", values, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsBetween(String value1, String value2) {
            addCriterion("SJZXS between", value1, value2, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSjzxsNotBetween(String value1, String value2) {
            addCriterion("SJZXS not between", value1, value2, "sjzxs");
            return (Criteria) this;
        }

        public Criteria andSfjsfyIsNull() {
            addCriterion("SFJSFY is null");
            return (Criteria) this;
        }

        public Criteria andSfjsfyIsNotNull() {
            addCriterion("SFJSFY is not null");
            return (Criteria) this;
        }

        public Criteria andSfjsfyEqualTo(String value) {
            addCriterion("SFJSFY =", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyNotEqualTo(String value) {
            addCriterion("SFJSFY <>", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyGreaterThan(String value) {
            addCriterion("SFJSFY >", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyGreaterThanOrEqualTo(String value) {
            addCriterion("SFJSFY >=", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyLessThan(String value) {
            addCriterion("SFJSFY <", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyLessThanOrEqualTo(String value) {
            addCriterion("SFJSFY <=", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyLike(String value) {
            addCriterion("SFJSFY like", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyNotLike(String value) {
            addCriterion("SFJSFY not like", value, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyIn(List<String> values) {
            addCriterion("SFJSFY in", values, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyNotIn(List<String> values) {
            addCriterion("SFJSFY not in", values, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyBetween(String value1, String value2) {
            addCriterion("SFJSFY between", value1, value2, "sfjsfy");
            return (Criteria) this;
        }

        public Criteria andSfjsfyNotBetween(String value1, String value2) {
            addCriterion("SFJSFY not between", value1, value2, "sfjsfy");
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