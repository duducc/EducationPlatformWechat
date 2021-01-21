package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_GRADUATE_DBEMP
*表说明研究生答辩参加人员
  */
public class JxGraduateDbempSqlWhere extends JxGraduateDbempEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxGraduateDbempSqlWhere() {
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

        public Criteria andDbxhIsNull() {
            addCriterion("DBXH is null");
            return (Criteria) this;
        }

        public Criteria andDbxhIsNotNull() {
            addCriterion("DBXH is not null");
            return (Criteria) this;
        }

        public Criteria andDbxhEqualTo(String value) {
            addCriterion("DBXH =", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhNotEqualTo(String value) {
            addCriterion("DBXH <>", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhGreaterThan(String value) {
            addCriterion("DBXH >", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhGreaterThanOrEqualTo(String value) {
            addCriterion("DBXH >=", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhLessThan(String value) {
            addCriterion("DBXH <", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhLessThanOrEqualTo(String value) {
            addCriterion("DBXH <=", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhLike(String value) {
            addCriterion("DBXH like", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhNotLike(String value) {
            addCriterion("DBXH not like", value, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhIn(List<String> values) {
            addCriterion("DBXH in", values, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhNotIn(List<String> values) {
            addCriterion("DBXH not in", values, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhBetween(String value1, String value2) {
            addCriterion("DBXH between", value1, value2, "dbxh");
            return (Criteria) this;
        }

        public Criteria andDbxhNotBetween(String value1, String value2) {
            addCriterion("DBXH not between", value1, value2, "dbxh");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNull() {
            addCriterion("SCHOOLID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("SCHOOLID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(String value) {
            addCriterion("SCHOOLID =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(String value) {
            addCriterion("SCHOOLID <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(String value) {
            addCriterion("SCHOOLID >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLID >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(String value) {
            addCriterion("SCHOOLID <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLID <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLike(String value) {
            addCriterion("SCHOOLID like", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotLike(String value) {
            addCriterion("SCHOOLID not like", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<String> values) {
            addCriterion("SCHOOLID in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<String> values) {
            addCriterion("SCHOOLID not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(String value1, String value2) {
            addCriterion("SCHOOLID between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(String value1, String value2) {
            addCriterion("SCHOOLID not between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("SCHOOLNAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("SCHOOLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("SCHOOLNAME =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("SCHOOLNAME <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("SCHOOLNAME >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLNAME >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("SCHOOLNAME <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLNAME <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("SCHOOLNAME like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("SCHOOLNAME not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("SCHOOLNAME in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("SCHOOLNAME not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("SCHOOLNAME between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("SCHOOLNAME not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EMPID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EMPID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EMPNAME =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EMPNAME <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EMPNAME >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPNAME >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EMPNAME <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EMPNAME <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EMPNAME like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EMPNAME not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EMPNAME in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EMPNAME not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EMPNAME between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EMPNAME not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidIsNull() {
            addCriterion("JXZHICHENGID is null");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidIsNotNull() {
            addCriterion("JXZHICHENGID is not null");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidEqualTo(String value) {
            addCriterion("JXZHICHENGID =", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidNotEqualTo(String value) {
            addCriterion("JXZHICHENGID <>", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidGreaterThan(String value) {
            addCriterion("JXZHICHENGID >", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidGreaterThanOrEqualTo(String value) {
            addCriterion("JXZHICHENGID >=", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidLessThan(String value) {
            addCriterion("JXZHICHENGID <", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidLessThanOrEqualTo(String value) {
            addCriterion("JXZHICHENGID <=", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidLike(String value) {
            addCriterion("JXZHICHENGID like", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidNotLike(String value) {
            addCriterion("JXZHICHENGID not like", value, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidIn(List<String> values) {
            addCriterion("JXZHICHENGID in", values, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidNotIn(List<String> values) {
            addCriterion("JXZHICHENGID not in", values, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidBetween(String value1, String value2) {
            addCriterion("JXZHICHENGID between", value1, value2, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengidNotBetween(String value1, String value2) {
            addCriterion("JXZHICHENGID not between", value1, value2, "jxzhichengid");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameIsNull() {
            addCriterion("JXZHICHENGNAME is null");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameIsNotNull() {
            addCriterion("JXZHICHENGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameEqualTo(String value) {
            addCriterion("JXZHICHENGNAME =", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameNotEqualTo(String value) {
            addCriterion("JXZHICHENGNAME <>", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameGreaterThan(String value) {
            addCriterion("JXZHICHENGNAME >", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameGreaterThanOrEqualTo(String value) {
            addCriterion("JXZHICHENGNAME >=", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameLessThan(String value) {
            addCriterion("JXZHICHENGNAME <", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameLessThanOrEqualTo(String value) {
            addCriterion("JXZHICHENGNAME <=", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameLike(String value) {
            addCriterion("JXZHICHENGNAME like", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameNotLike(String value) {
            addCriterion("JXZHICHENGNAME not like", value, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameIn(List<String> values) {
            addCriterion("JXZHICHENGNAME in", values, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameNotIn(List<String> values) {
            addCriterion("JXZHICHENGNAME not in", values, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameBetween(String value1, String value2) {
            addCriterion("JXZHICHENGNAME between", value1, value2, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andJxzhichengnameNotBetween(String value1, String value2) {
            addCriterion("JXZHICHENGNAME not between", value1, value2, "jxzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidIsNull() {
            addCriterion("LLZHICHENGID is null");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidIsNotNull() {
            addCriterion("LLZHICHENGID is not null");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidEqualTo(String value) {
            addCriterion("LLZHICHENGID =", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidNotEqualTo(String value) {
            addCriterion("LLZHICHENGID <>", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidGreaterThan(String value) {
            addCriterion("LLZHICHENGID >", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidGreaterThanOrEqualTo(String value) {
            addCriterion("LLZHICHENGID >=", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidLessThan(String value) {
            addCriterion("LLZHICHENGID <", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidLessThanOrEqualTo(String value) {
            addCriterion("LLZHICHENGID <=", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidLike(String value) {
            addCriterion("LLZHICHENGID like", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidNotLike(String value) {
            addCriterion("LLZHICHENGID not like", value, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidIn(List<String> values) {
            addCriterion("LLZHICHENGID in", values, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidNotIn(List<String> values) {
            addCriterion("LLZHICHENGID not in", values, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidBetween(String value1, String value2) {
            addCriterion("LLZHICHENGID between", value1, value2, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengidNotBetween(String value1, String value2) {
            addCriterion("LLZHICHENGID not between", value1, value2, "llzhichengid");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameIsNull() {
            addCriterion("LLZHICHENGNAME is null");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameIsNotNull() {
            addCriterion("LLZHICHENGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameEqualTo(String value) {
            addCriterion("LLZHICHENGNAME =", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameNotEqualTo(String value) {
            addCriterion("LLZHICHENGNAME <>", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameGreaterThan(String value) {
            addCriterion("LLZHICHENGNAME >", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameGreaterThanOrEqualTo(String value) {
            addCriterion("LLZHICHENGNAME >=", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameLessThan(String value) {
            addCriterion("LLZHICHENGNAME <", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameLessThanOrEqualTo(String value) {
            addCriterion("LLZHICHENGNAME <=", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameLike(String value) {
            addCriterion("LLZHICHENGNAME like", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameNotLike(String value) {
            addCriterion("LLZHICHENGNAME not like", value, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameIn(List<String> values) {
            addCriterion("LLZHICHENGNAME in", values, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameNotIn(List<String> values) {
            addCriterion("LLZHICHENGNAME not in", values, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameBetween(String value1, String value2) {
            addCriterion("LLZHICHENGNAME between", value1, value2, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andLlzhichengnameNotBetween(String value1, String value2) {
            addCriterion("LLZHICHENGNAME not between", value1, value2, "llzhichengname");
            return (Criteria) this;
        }

        public Criteria andDyxueliIsNull() {
            addCriterion("DYXUELI is null");
            return (Criteria) this;
        }

        public Criteria andDyxueliIsNotNull() {
            addCriterion("DYXUELI is not null");
            return (Criteria) this;
        }

        public Criteria andDyxueliEqualTo(String value) {
            addCriterion("DYXUELI =", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliNotEqualTo(String value) {
            addCriterion("DYXUELI <>", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliGreaterThan(String value) {
            addCriterion("DYXUELI >", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliGreaterThanOrEqualTo(String value) {
            addCriterion("DYXUELI >=", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliLessThan(String value) {
            addCriterion("DYXUELI <", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliLessThanOrEqualTo(String value) {
            addCriterion("DYXUELI <=", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliLike(String value) {
            addCriterion("DYXUELI like", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliNotLike(String value) {
            addCriterion("DYXUELI not like", value, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliIn(List<String> values) {
            addCriterion("DYXUELI in", values, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliNotIn(List<String> values) {
            addCriterion("DYXUELI not in", values, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliBetween(String value1, String value2) {
            addCriterion("DYXUELI between", value1, value2, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andDyxueliNotBetween(String value1, String value2) {
            addCriterion("DYXUELI not between", value1, value2, "dyxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliIsNull() {
            addCriterion("ZGXUELI is null");
            return (Criteria) this;
        }

        public Criteria andZgxueliIsNotNull() {
            addCriterion("ZGXUELI is not null");
            return (Criteria) this;
        }

        public Criteria andZgxueliEqualTo(String value) {
            addCriterion("ZGXUELI =", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliNotEqualTo(String value) {
            addCriterion("ZGXUELI <>", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliGreaterThan(String value) {
            addCriterion("ZGXUELI >", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliGreaterThanOrEqualTo(String value) {
            addCriterion("ZGXUELI >=", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliLessThan(String value) {
            addCriterion("ZGXUELI <", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliLessThanOrEqualTo(String value) {
            addCriterion("ZGXUELI <=", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliLike(String value) {
            addCriterion("ZGXUELI like", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliNotLike(String value) {
            addCriterion("ZGXUELI not like", value, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliIn(List<String> values) {
            addCriterion("ZGXUELI in", values, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliNotIn(List<String> values) {
            addCriterion("ZGXUELI not in", values, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliBetween(String value1, String value2) {
            addCriterion("ZGXUELI between", value1, value2, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andZgxueliNotBetween(String value1, String value2) {
            addCriterion("ZGXUELI not between", value1, value2, "zgxueli");
            return (Criteria) this;
        }

        public Criteria andSfshdIsNull() {
            addCriterion("SFSHD is null");
            return (Criteria) this;
        }

        public Criteria andSfshdIsNotNull() {
            addCriterion("SFSHD is not null");
            return (Criteria) this;
        }

        public Criteria andSfshdEqualTo(String value) {
            addCriterion("SFSHD =", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdNotEqualTo(String value) {
            addCriterion("SFSHD <>", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdGreaterThan(String value) {
            addCriterion("SFSHD >", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdGreaterThanOrEqualTo(String value) {
            addCriterion("SFSHD >=", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdLessThan(String value) {
            addCriterion("SFSHD <", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdLessThanOrEqualTo(String value) {
            addCriterion("SFSHD <=", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdLike(String value) {
            addCriterion("SFSHD like", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdNotLike(String value) {
            addCriterion("SFSHD not like", value, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdIn(List<String> values) {
            addCriterion("SFSHD in", values, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdNotIn(List<String> values) {
            addCriterion("SFSHD not in", values, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdBetween(String value1, String value2) {
            addCriterion("SFSHD between", value1, value2, "sfshd");
            return (Criteria) this;
        }

        public Criteria andSfshdNotBetween(String value1, String value2) {
            addCriterion("SFSHD not between", value1, value2, "sfshd");
            return (Criteria) this;
        }

        public Criteria andBaizhuIsNull() {
            addCriterion("BAIZHU is null");
            return (Criteria) this;
        }

        public Criteria andBaizhuIsNotNull() {
            addCriterion("BAIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andBaizhuEqualTo(String value) {
            addCriterion("BAIZHU =", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuNotEqualTo(String value) {
            addCriterion("BAIZHU <>", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuGreaterThan(String value) {
            addCriterion("BAIZHU >", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BAIZHU >=", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuLessThan(String value) {
            addCriterion("BAIZHU <", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuLessThanOrEqualTo(String value) {
            addCriterion("BAIZHU <=", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuLike(String value) {
            addCriterion("BAIZHU like", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuNotLike(String value) {
            addCriterion("BAIZHU not like", value, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuIn(List<String> values) {
            addCriterion("BAIZHU in", values, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuNotIn(List<String> values) {
            addCriterion("BAIZHU not in", values, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuBetween(String value1, String value2) {
            addCriterion("BAIZHU between", value1, value2, "baizhu");
            return (Criteria) this;
        }

        public Criteria andBaizhuNotBetween(String value1, String value2) {
            addCriterion("BAIZHU not between", value1, value2, "baizhu");
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

        public Criteria andCreditdateIsNull() {
            addCriterion("CREDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreditdateIsNotNull() {
            addCriterion("CREDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditdateEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE =", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE <>", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREDITDATE >", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE >=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThan(Date value) {
            addCriterionForJDBCDate("CREDITDATE <", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITDATE <=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateIn(List<Date> values) {
            addCriterionForJDBCDate("CREDITDATE in", values, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREDITDATE not in", values, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREDITDATE between", value1, value2, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREDITDATE not between", value1, value2, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateEqualTo(Timestamp value) {
            addCriterion("CREDITDATE =", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotEqualTo(Timestamp value) {
            addCriterion("CREDITDATE <>", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThan(Timestamp value) {
            addCriterion("CREDITDATE >", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREDITDATE >=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThan(Timestamp value) {
            addCriterion("CREDITDATE <", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREDITDATE <=", value, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREDITDATE between", value1, value2, "creditdate");
            return (Criteria) this;
        }

        public Criteria andCreditdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREDITDATE not between", value1, value2, "creditdate");
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