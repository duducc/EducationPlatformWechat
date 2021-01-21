package com.saint.teaching.sqlWhere;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxStudentsEntity;

/**
*类注释信息
*表名JX_STUDENTS
*表说明伦理审查
  */
public class JxStudentsSqlWhere extends JxStudentsEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxStudentsSqlWhere() {
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
        
        //---------------
        public Criteria andBanjiIsNull() {
            addCriterion("BANJI is null");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNotNull() {
            addCriterion("BANJI is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiEqualTo(String value) {
            addCriterion("BANJI =", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotEqualTo(String value) {
            addCriterion("BANJI <>", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThan(String value) {
            addCriterion("BANJI >", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThanOrEqualTo(String value) {
            addCriterion("BANJI >=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThan(String value) {
            addCriterion("BANJI <", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThanOrEqualTo(String value) {
            addCriterion("BANJI <=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLike(String value) {
            addCriterion("BANJI like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotLike(String value) {
            addCriterion("BANJI not like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiIn(List<String> values) {
            addCriterion("BANJI in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotIn(List<String> values) {
            addCriterion("BANJI not in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiBetween(String value1, String value2) {
            addCriterion("BANJI between", value1, value2, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotBetween(String value1, String value2) {
            addCriterion("BANJI not between", value1, value2, "banji");
            return (Criteria) this;
        }
        
        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andTelnumberIsNull() {
            addCriterion("TELNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("TELNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("TELNUMBER =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("TELNUMBER <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("TELNUMBER >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("TELNUMBER >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("TELNUMBER <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("TELNUMBER <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("TELNUMBER like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("TELNUMBER not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("TELNUMBER in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("TELNUMBER not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("TELNUMBER between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("TELNUMBER not between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("NATIONAL is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("NATIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("NATIONAL =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("NATIONAL <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("NATIONAL >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("NATIONAL <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("NATIONAL like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("NATIONAL not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("NATIONAL in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("NATIONAL not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("NATIONAL between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("NATIONAL not between", value1, value2, "national");
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

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMarriagestateIsNull() {
            addCriterion("MARRIAGESTATE is null");
            return (Criteria) this;
        }

        public Criteria andMarriagestateIsNotNull() {
            addCriterion("MARRIAGESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMarriagestateEqualTo(String value) {
            addCriterion("MARRIAGESTATE =", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateNotEqualTo(String value) {
            addCriterion("MARRIAGESTATE <>", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateGreaterThan(String value) {
            addCriterion("MARRIAGESTATE >", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateGreaterThanOrEqualTo(String value) {
            addCriterion("MARRIAGESTATE >=", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateLessThan(String value) {
            addCriterion("MARRIAGESTATE <", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateLessThanOrEqualTo(String value) {
            addCriterion("MARRIAGESTATE <=", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateLike(String value) {
            addCriterion("MARRIAGESTATE like", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateNotLike(String value) {
            addCriterion("MARRIAGESTATE not like", value, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateIn(List<String> values) {
            addCriterion("MARRIAGESTATE in", values, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateNotIn(List<String> values) {
            addCriterion("MARRIAGESTATE not in", values, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateBetween(String value1, String value2) {
            addCriterion("MARRIAGESTATE between", value1, value2, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andMarriagestateNotBetween(String value1, String value2) {
            addCriterion("MARRIAGESTATE not between", value1, value2, "marriagestate");
            return (Criteria) this;
        }

        public Criteria andGovernmentIsNull() {
            addCriterion("GOVERNMENT is null");
            return (Criteria) this;
        }

        public Criteria andGovernmentIsNotNull() {
            addCriterion("GOVERNMENT is not null");
            return (Criteria) this;
        }

        public Criteria andGovernmentEqualTo(String value) {
            addCriterion("GOVERNMENT =", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentNotEqualTo(String value) {
            addCriterion("GOVERNMENT <>", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentGreaterThan(String value) {
            addCriterion("GOVERNMENT >", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentGreaterThanOrEqualTo(String value) {
            addCriterion("GOVERNMENT >=", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentLessThan(String value) {
            addCriterion("GOVERNMENT <", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentLessThanOrEqualTo(String value) {
            addCriterion("GOVERNMENT <=", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentLike(String value) {
            addCriterion("GOVERNMENT like", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentNotLike(String value) {
            addCriterion("GOVERNMENT not like", value, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentIn(List<String> values) {
            addCriterion("GOVERNMENT in", values, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentNotIn(List<String> values) {
            addCriterion("GOVERNMENT not in", values, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentBetween(String value1, String value2) {
            addCriterion("GOVERNMENT between", value1, value2, "government");
            return (Criteria) this;
        }

        public Criteria andGovernmentNotBetween(String value1, String value2) {
            addCriterion("GOVERNMENT not between", value1, value2, "government");
            return (Criteria) this;
        }

        public Criteria andInpartytimeIsNull() {
            addCriterion("INPARTYTIME is null");
            return (Criteria) this;
        }

        public Criteria andInpartytimeIsNotNull() {
            addCriterion("INPARTYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInpartytimeEqualTo(Date value) {
            addCriterionForJDBCDate("INPARTYTIME =", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INPARTYTIME <>", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INPARTYTIME >", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPARTYTIME >=", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeLessThan(Date value) {
            addCriterionForJDBCDate("INPARTYTIME <", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPARTYTIME <=", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeIn(List<Date> values) {
            addCriterionForJDBCDate("INPARTYTIME in", values, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("INPARTYTIME not in", values, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPARTYTIME between", value1, value2, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPARTYTIME not between", value1, value2, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeEqualTo(Timestamp value) {
            addCriterion("INPARTYTIME =", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeNotEqualTo(Timestamp value) {
            addCriterion("INPARTYTIME <>", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeGreaterThan(Timestamp value) {
            addCriterion("INPARTYTIME >", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("INPARTYTIME >=", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeLessThan(Timestamp value) {
            addCriterion("INPARTYTIME <", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("INPARTYTIME <=", value, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("INPARTYTIME between", value1, value2, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andInpartytimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("INPARTYTIME not between", value1, value2, "inpartytime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeIsNull() {
            addCriterion("INGANGTIME is null");
            return (Criteria) this;
        }

        public Criteria andIngangtimeIsNotNull() {
            addCriterion("INGANGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andIngangtimeEqualTo(Date value) {
            addCriterionForJDBCDate("INGANGTIME =", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INGANGTIME <>", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INGANGTIME >", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INGANGTIME >=", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeLessThan(Date value) {
            addCriterionForJDBCDate("INGANGTIME <", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INGANGTIME <=", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeIn(List<Date> values) {
            addCriterionForJDBCDate("INGANGTIME in", values, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("INGANGTIME not in", values, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INGANGTIME between", value1, value2, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INGANGTIME not between", value1, value2, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeEqualTo(Timestamp value) {
            addCriterion("INGANGTIME =", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeNotEqualTo(Timestamp value) {
            addCriterion("INGANGTIME <>", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeGreaterThan(Timestamp value) {
            addCriterion("INGANGTIME >", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("INGANGTIME >=", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeLessThan(Timestamp value) {
            addCriterion("INGANGTIME <", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("INGANGTIME <=", value, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("INGANGTIME between", value1, value2, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andIngangtimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("INGANGTIME not between", value1, value2, "ingangtime");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNull() {
            addCriterion("FAMILYNAME is null");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNotNull() {
            addCriterion("FAMILYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynameEqualTo(String value) {
            addCriterion("FAMILYNAME =", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotEqualTo(String value) {
            addCriterion("FAMILYNAME <>", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThan(String value) {
            addCriterion("FAMILYNAME >", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYNAME >=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThan(String value) {
            addCriterion("FAMILYNAME <", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThanOrEqualTo(String value) {
            addCriterion("FAMILYNAME <=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLike(String value) {
            addCriterion("FAMILYNAME like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotLike(String value) {
            addCriterion("FAMILYNAME not like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameIn(List<String> values) {
            addCriterion("FAMILYNAME in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotIn(List<String> values) {
            addCriterion("FAMILYNAME not in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameBetween(String value1, String value2) {
            addCriterion("FAMILYNAME between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotBetween(String value1, String value2) {
            addCriterion("FAMILYNAME not between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilyreatIsNull() {
            addCriterion("FAMILYREAT is null");
            return (Criteria) this;
        }

        public Criteria andFamilyreatIsNotNull() {
            addCriterion("FAMILYREAT is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyreatEqualTo(String value) {
            addCriterion("FAMILYREAT =", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatNotEqualTo(String value) {
            addCriterion("FAMILYREAT <>", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatGreaterThan(String value) {
            addCriterion("FAMILYREAT >", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYREAT >=", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatLessThan(String value) {
            addCriterion("FAMILYREAT <", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatLessThanOrEqualTo(String value) {
            addCriterion("FAMILYREAT <=", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatLike(String value) {
            addCriterion("FAMILYREAT like", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatNotLike(String value) {
            addCriterion("FAMILYREAT not like", value, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatIn(List<String> values) {
            addCriterion("FAMILYREAT in", values, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatNotIn(List<String> values) {
            addCriterion("FAMILYREAT not in", values, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatBetween(String value1, String value2) {
            addCriterion("FAMILYREAT between", value1, value2, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilyreatNotBetween(String value1, String value2) {
            addCriterion("FAMILYREAT not between", value1, value2, "familyreat");
            return (Criteria) this;
        }

        public Criteria andFamilytelIsNull() {
            addCriterion("FAMILYTEL is null");
            return (Criteria) this;
        }

        public Criteria andFamilytelIsNotNull() {
            addCriterion("FAMILYTEL is not null");
            return (Criteria) this;
        }

        public Criteria andFamilytelEqualTo(String value) {
            addCriterion("FAMILYTEL =", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotEqualTo(String value) {
            addCriterion("FAMILYTEL <>", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelGreaterThan(String value) {
            addCriterion("FAMILYTEL >", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL >=", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelLessThan(String value) {
            addCriterion("FAMILYTEL <", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelLessThanOrEqualTo(String value) {
            addCriterion("FAMILYTEL <=", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelLike(String value) {
            addCriterion("FAMILYTEL like", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotLike(String value) {
            addCriterion("FAMILYTEL not like", value, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelIn(List<String> values) {
            addCriterion("FAMILYTEL in", values, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotIn(List<String> values) {
            addCriterion("FAMILYTEL not in", values, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelBetween(String value1, String value2) {
            addCriterion("FAMILYTEL between", value1, value2, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilytelNotBetween(String value1, String value2) {
            addCriterion("FAMILYTEL not between", value1, value2, "familytel");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIsNull() {
            addCriterion("FAMILYADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIsNotNull() {
            addCriterion("FAMILYADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressEqualTo(String value) {
            addCriterion("FAMILYADDRESS =", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotEqualTo(String value) {
            addCriterion("FAMILYADDRESS <>", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressGreaterThan(String value) {
            addCriterion("FAMILYADDRESS >", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYADDRESS >=", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLessThan(String value) {
            addCriterion("FAMILYADDRESS <", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLessThanOrEqualTo(String value) {
            addCriterion("FAMILYADDRESS <=", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLike(String value) {
            addCriterion("FAMILYADDRESS like", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotLike(String value) {
            addCriterion("FAMILYADDRESS not like", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIn(List<String> values) {
            addCriterion("FAMILYADDRESS in", values, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotIn(List<String> values) {
            addCriterion("FAMILYADDRESS not in", values, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressBetween(String value1, String value2) {
            addCriterion("FAMILYADDRESS between", value1, value2, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotBetween(String value1, String value2) {
            addCriterion("FAMILYADDRESS not between", value1, value2, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andStuyearIsNull() {
            addCriterion("STUYEAR is null");
            return (Criteria) this;
        }

        public Criteria andStuyearIsNotNull() {
            addCriterion("STUYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andStuyearEqualTo(String value) {
            addCriterion("STUYEAR =", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearNotEqualTo(String value) {
            addCriterion("STUYEAR <>", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearGreaterThan(String value) {
            addCriterion("STUYEAR >", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearGreaterThanOrEqualTo(String value) {
            addCriterion("STUYEAR >=", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearLessThan(String value) {
            addCriterion("STUYEAR <", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearLessThanOrEqualTo(String value) {
            addCriterion("STUYEAR <=", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearLike(String value) {
            addCriterion("STUYEAR like", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearNotLike(String value) {
            addCriterion("STUYEAR not like", value, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearIn(List<String> values) {
            addCriterion("STUYEAR in", values, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearNotIn(List<String> values) {
            addCriterion("STUYEAR not in", values, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearBetween(String value1, String value2) {
            addCriterion("STUYEAR between", value1, value2, "stuyear");
            return (Criteria) this;
        }

        public Criteria andStuyearNotBetween(String value1, String value2) {
            addCriterion("STUYEAR not between", value1, value2, "stuyear");
            return (Criteria) this;
        }

        public Criteria andComtypeIsNull() {
            addCriterion("COMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andComtypeIsNotNull() {
            addCriterion("COMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComtypeEqualTo(String value) {
            addCriterion("COMTYPE =", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeNotEqualTo(String value) {
            addCriterion("COMTYPE <>", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeGreaterThan(String value) {
            addCriterion("COMTYPE >", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMTYPE >=", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeLessThan(String value) {
            addCriterion("COMTYPE <", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeLessThanOrEqualTo(String value) {
            addCriterion("COMTYPE <=", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeLike(String value) {
            addCriterion("COMTYPE like", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeNotLike(String value) {
            addCriterion("COMTYPE not like", value, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeIn(List<String> values) {
            addCriterion("COMTYPE in", values, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeNotIn(List<String> values) {
            addCriterion("COMTYPE not in", values, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeBetween(String value1, String value2) {
            addCriterion("COMTYPE between", value1, value2, "comtype");
            return (Criteria) this;
        }

        public Criteria andComtypeNotBetween(String value1, String value2) {
            addCriterion("COMTYPE not between", value1, value2, "comtype");
            return (Criteria) this;
        }

        public Criteria andEmialIsNull() {
            addCriterion("EMIAL is null");
            return (Criteria) this;
        }

        public Criteria andEmialIsNotNull() {
            addCriterion("EMIAL is not null");
            return (Criteria) this;
        }

        public Criteria andEmialEqualTo(String value) {
            addCriterion("EMIAL =", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotEqualTo(String value) {
            addCriterion("EMIAL <>", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialGreaterThan(String value) {
            addCriterion("EMIAL >", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialGreaterThanOrEqualTo(String value) {
            addCriterion("EMIAL >=", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialLessThan(String value) {
            addCriterion("EMIAL <", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialLessThanOrEqualTo(String value) {
            addCriterion("EMIAL <=", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialLike(String value) {
            addCriterion("EMIAL like", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotLike(String value) {
            addCriterion("EMIAL not like", value, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialIn(List<String> values) {
            addCriterion("EMIAL in", values, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotIn(List<String> values) {
            addCriterion("EMIAL not in", values, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialBetween(String value1, String value2) {
            addCriterion("EMIAL between", value1, value2, "emial");
            return (Criteria) this;
        }

        public Criteria andEmialNotBetween(String value1, String value2) {
            addCriterion("EMIAL not between", value1, value2, "emial");
            return (Criteria) this;
        }

        public Criteria andSchoolnumIsNull() {
            addCriterion("SCHOOLNUM is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnumIsNotNull() {
            addCriterion("SCHOOLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnumEqualTo(String value) {
            addCriterion("SCHOOLNUM =", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumNotEqualTo(String value) {
            addCriterion("SCHOOLNUM <>", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumGreaterThan(String value) {
            addCriterion("SCHOOLNUM >", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLNUM >=", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumLessThan(String value) {
            addCriterion("SCHOOLNUM <", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLNUM <=", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumLike(String value) {
            addCriterion("SCHOOLNUM like", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumNotLike(String value) {
            addCriterion("SCHOOLNUM not like", value, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumIn(List<String> values) {
            addCriterion("SCHOOLNUM in", values, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumNotIn(List<String> values) {
            addCriterion("SCHOOLNUM not in", values, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumBetween(String value1, String value2) {
            addCriterion("SCHOOLNUM between", value1, value2, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andSchoolnumNotBetween(String value1, String value2) {
            addCriterion("SCHOOLNUM not between", value1, value2, "schoolnum");
            return (Criteria) this;
        }

        public Criteria andFyzjeIsNull() {
            addCriterion("FYZJE is null");
            return (Criteria) this;
        }

        public Criteria andFyzjeIsNotNull() {
            addCriterion("FYZJE is not null");
            return (Criteria) this;
        }

        public Criteria andFyzjeEqualTo(BigDecimal value) {
            addCriterion("FYZJE =", value, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeNotEqualTo(BigDecimal value) {
            addCriterion("FYZJE <>", value, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeGreaterThan(BigDecimal value) {
            addCriterion("FYZJE >", value, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FYZJE >=", value, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeLessThan(BigDecimal value) {
            addCriterion("FYZJE <", value, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FYZJE <=", value, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeIn(List<BigDecimal> values) {
            addCriterion("FYZJE in", values, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeNotIn(List<BigDecimal> values) {
            addCriterion("FYZJE not in", values, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FYZJE between", value1, value2, "fyzje");
            return (Criteria) this;
        }

        public Criteria andFyzjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FYZJE not between", value1, value2, "fyzje");
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

        public Criteria andPertypeIsNull() {
            addCriterion("PERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPertypeIsNotNull() {
            addCriterion("PERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPertypeEqualTo(String value) {
            addCriterion("PERTYPE =", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotEqualTo(String value) {
            addCriterion("PERTYPE <>", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeGreaterThan(String value) {
            addCriterion("PERTYPE >", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERTYPE >=", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeLessThan(String value) {
            addCriterion("PERTYPE <", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeLessThanOrEqualTo(String value) {
            addCriterion("PERTYPE <=", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeLike(String value) {
            addCriterion("PERTYPE like", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotLike(String value) {
            addCriterion("PERTYPE not like", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeIn(List<String> values) {
            addCriterion("PERTYPE in", values, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotIn(List<String> values) {
            addCriterion("PERTYPE not in", values, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeBetween(String value1, String value2) {
            addCriterion("PERTYPE between", value1, value2, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotBetween(String value1, String value2) {
            addCriterion("PERTYPE not between", value1, value2, "pertype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeIsNull() {
            addCriterion("ZHIWEITYPE is null");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeIsNotNull() {
            addCriterion("ZHIWEITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeEqualTo(String value) {
            addCriterion("ZHIWEITYPE =", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeNotEqualTo(String value) {
            addCriterion("ZHIWEITYPE <>", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeGreaterThan(String value) {
            addCriterion("ZHIWEITYPE >", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWEITYPE >=", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeLessThan(String value) {
            addCriterion("ZHIWEITYPE <", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeLessThanOrEqualTo(String value) {
            addCriterion("ZHIWEITYPE <=", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeLike(String value) {
            addCriterion("ZHIWEITYPE like", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeNotLike(String value) {
            addCriterion("ZHIWEITYPE not like", value, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeIn(List<String> values) {
            addCriterion("ZHIWEITYPE in", values, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeNotIn(List<String> values) {
            addCriterion("ZHIWEITYPE not in", values, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeBetween(String value1, String value2) {
            addCriterion("ZHIWEITYPE between", value1, value2, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andZhiweitypeNotBetween(String value1, String value2) {
            addCriterion("ZHIWEITYPE not between", value1, value2, "zhiweitype");
            return (Criteria) this;
        }

        public Criteria andFromunitIsNull() {
            addCriterion("FROMUNIT is null");
            return (Criteria) this;
        }

        public Criteria andFromunitIsNotNull() {
            addCriterion("FROMUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andFromunitEqualTo(String value) {
            addCriterion("FROMUNIT =", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotEqualTo(String value) {
            addCriterion("FROMUNIT <>", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitGreaterThan(String value) {
            addCriterion("FROMUNIT >", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitGreaterThanOrEqualTo(String value) {
            addCriterion("FROMUNIT >=", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitLessThan(String value) {
            addCriterion("FROMUNIT <", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitLessThanOrEqualTo(String value) {
            addCriterion("FROMUNIT <=", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitLike(String value) {
            addCriterion("FROMUNIT like", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotLike(String value) {
            addCriterion("FROMUNIT not like", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitIn(List<String> values) {
            addCriterion("FROMUNIT in", values, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotIn(List<String> values) {
            addCriterion("FROMUNIT not in", values, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitBetween(String value1, String value2) {
            addCriterion("FROMUNIT between", value1, value2, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotBetween(String value1, String value2) {
            addCriterion("FROMUNIT not between", value1, value2, "fromunit");
            return (Criteria) this;
        }

        public Criteria andIsgraduateIsNull() {
            addCriterion("ISGRADUATE is null");
            return (Criteria) this;
        }

        public Criteria andIsgraduateIsNotNull() {
            addCriterion("ISGRADUATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsgraduateEqualTo(String value) {
            addCriterion("ISGRADUATE =", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotEqualTo(String value) {
            addCriterion("ISGRADUATE <>", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateGreaterThan(String value) {
            addCriterion("ISGRADUATE >", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateGreaterThanOrEqualTo(String value) {
            addCriterion("ISGRADUATE >=", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateLessThan(String value) {
            addCriterion("ISGRADUATE <", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateLessThanOrEqualTo(String value) {
            addCriterion("ISGRADUATE <=", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateLike(String value) {
            addCriterion("ISGRADUATE like", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotLike(String value) {
            addCriterion("ISGRADUATE not like", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateIn(List<String> values) {
            addCriterion("ISGRADUATE in", values, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotIn(List<String> values) {
            addCriterion("ISGRADUATE not in", values, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateBetween(String value1, String value2) {
            addCriterion("ISGRADUATE between", value1, value2, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotBetween(String value1, String value2) {
            addCriterion("ISGRADUATE not between", value1, value2, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNull() {
            addCriterion("GRADUATESCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNotNull() {
            addCriterion("GRADUATESCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolEqualTo(String value) {
            addCriterion("GRADUATESCHOOL =", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotEqualTo(String value) {
            addCriterion("GRADUATESCHOOL <>", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThan(String value) {
            addCriterion("GRADUATESCHOOL >", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATESCHOOL >=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThan(String value) {
            addCriterion("GRADUATESCHOOL <", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATESCHOOL <=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLike(String value) {
            addCriterion("GRADUATESCHOOL like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotLike(String value) {
            addCriterion("GRADUATESCHOOL not like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIn(List<String> values) {
            addCriterion("GRADUATESCHOOL in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotIn(List<String> values) {
            addCriterion("GRADUATESCHOOL not in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolBetween(String value1, String value2) {
            addCriterion("GRADUATESCHOOL between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATESCHOOL not between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNull() {
            addCriterion("GRADUATETIME is null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNotNull() {
            addCriterion("GRADUATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME =", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME <>", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GRADUATETIME >", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME >=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThan(Date value) {
            addCriterionForJDBCDate("GRADUATETIME <", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME <=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("GRADUATETIME in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GRADUATETIME not in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GRADUATETIME between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GRADUATETIME not between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeEqualTo(Timestamp value) {
            addCriterion("GRADUATETIME =", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotEqualTo(Timestamp value) {
            addCriterion("GRADUATETIME <>", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThan(Timestamp value) {
            addCriterion("GRADUATETIME >", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("GRADUATETIME >=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThan(Timestamp value) {
            addCriterion("GRADUATETIME <", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("GRADUATETIME <=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GRADUATETIME between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GRADUATETIME not between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNull() {
            addCriterion("COLLEGEID is null");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNotNull() {
            addCriterion("COLLEGEID is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeidEqualTo(String value) {
            addCriterion("COLLEGEID =", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotEqualTo(String value) {
            addCriterion("COLLEGEID <>", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThan(String value) {
            addCriterion("COLLEGEID >", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThanOrEqualTo(String value) {
            addCriterion("COLLEGEID >=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThan(String value) {
            addCriterion("COLLEGEID <", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThanOrEqualTo(String value) {
            addCriterion("COLLEGEID <=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLike(String value) {
            addCriterion("COLLEGEID like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotLike(String value) {
            addCriterion("COLLEGEID not like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIn(List<String> values) {
            addCriterion("COLLEGEID in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotIn(List<String> values) {
            addCriterion("COLLEGEID not in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidBetween(String value1, String value2) {
            addCriterion("COLLEGEID between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotBetween(String value1, String value2) {
            addCriterion("COLLEGEID not between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNull() {
            addCriterion("COLLEGENAME is null");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNotNull() {
            addCriterion("COLLEGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCollegenameEqualTo(String value) {
            addCriterion("COLLEGENAME =", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotEqualTo(String value) {
            addCriterion("COLLEGENAME <>", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThan(String value) {
            addCriterion("COLLEGENAME >", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThanOrEqualTo(String value) {
            addCriterion("COLLEGENAME >=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThan(String value) {
            addCriterion("COLLEGENAME <", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThanOrEqualTo(String value) {
            addCriterion("COLLEGENAME <=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLike(String value) {
            addCriterion("COLLEGENAME like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotLike(String value) {
            addCriterion("COLLEGENAME not like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameIn(List<String> values) {
            addCriterion("COLLEGENAME in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotIn(List<String> values) {
            addCriterion("COLLEGENAME not in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameBetween(String value1, String value2) {
            addCriterion("COLLEGENAME between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotBetween(String value1, String value2) {
            addCriterion("COLLEGENAME not between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("CLASSID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("CLASSID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("CLASSID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("CLASSID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("CLASSID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("CLASSID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("CLASSID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("CLASSID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("CLASSID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("CLASSID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("CLASSID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("CLASSID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("CLASSID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassIsNull() {
            addCriterion("PROFESSIONALCLASS is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassIsNotNull() {
            addCriterion("PROFESSIONALCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassEqualTo(String value) {
            addCriterion("PROFESSIONALCLASS =", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassNotEqualTo(String value) {
            addCriterion("PROFESSIONALCLASS <>", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassGreaterThan(String value) {
            addCriterion("PROFESSIONALCLASS >", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONALCLASS >=", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassLessThan(String value) {
            addCriterion("PROFESSIONALCLASS <", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONALCLASS <=", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassLike(String value) {
            addCriterion("PROFESSIONALCLASS like", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassNotLike(String value) {
            addCriterion("PROFESSIONALCLASS not like", value, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassIn(List<String> values) {
            addCriterion("PROFESSIONALCLASS in", values, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassNotIn(List<String> values) {
            addCriterion("PROFESSIONALCLASS not in", values, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassBetween(String value1, String value2) {
            addCriterion("PROFESSIONALCLASS between", value1, value2, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andProfessionalclassNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONALCLASS not between", value1, value2, "professionalclass");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridIsNull() {
            addCriterion("SCHOOLTEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridIsNotNull() {
            addCriterion("SCHOOLTEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridEqualTo(String value) {
            addCriterion("SCHOOLTEACHERID =", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridNotEqualTo(String value) {
            addCriterion("SCHOOLTEACHERID <>", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridGreaterThan(String value) {
            addCriterion("SCHOOLTEACHERID >", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLTEACHERID >=", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridLessThan(String value) {
            addCriterion("SCHOOLTEACHERID <", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLTEACHERID <=", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridLike(String value) {
            addCriterion("SCHOOLTEACHERID like", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridNotLike(String value) {
            addCriterion("SCHOOLTEACHERID not like", value, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridIn(List<String> values) {
            addCriterion("SCHOOLTEACHERID in", values, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridNotIn(List<String> values) {
            addCriterion("SCHOOLTEACHERID not in", values, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridBetween(String value1, String value2) {
            addCriterion("SCHOOLTEACHERID between", value1, value2, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteacheridNotBetween(String value1, String value2) {
            addCriterion("SCHOOLTEACHERID not between", value1, value2, "schoolteacherid");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameIsNull() {
            addCriterion("SCHOOLTEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameIsNotNull() {
            addCriterion("SCHOOLTEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameEqualTo(String value) {
            addCriterion("SCHOOLTEACHERNAME =", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameNotEqualTo(String value) {
            addCriterion("SCHOOLTEACHERNAME <>", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameGreaterThan(String value) {
            addCriterion("SCHOOLTEACHERNAME >", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLTEACHERNAME >=", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameLessThan(String value) {
            addCriterion("SCHOOLTEACHERNAME <", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLTEACHERNAME <=", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameLike(String value) {
            addCriterion("SCHOOLTEACHERNAME like", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameNotLike(String value) {
            addCriterion("SCHOOLTEACHERNAME not like", value, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameIn(List<String> values) {
            addCriterion("SCHOOLTEACHERNAME in", values, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameNotIn(List<String> values) {
            addCriterion("SCHOOLTEACHERNAME not in", values, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameBetween(String value1, String value2) {
            addCriterion("SCHOOLTEACHERNAME between", value1, value2, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachernameNotBetween(String value1, String value2) {
            addCriterion("SCHOOLTEACHERNAME not between", value1, value2, "schoolteachername");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelIsNull() {
            addCriterion("SCHOOLTEACHERTEL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelIsNotNull() {
            addCriterion("SCHOOLTEACHERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelEqualTo(String value) {
            addCriterion("SCHOOLTEACHERTEL =", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelNotEqualTo(String value) {
            addCriterion("SCHOOLTEACHERTEL <>", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelGreaterThan(String value) {
            addCriterion("SCHOOLTEACHERTEL >", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLTEACHERTEL >=", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelLessThan(String value) {
            addCriterion("SCHOOLTEACHERTEL <", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLTEACHERTEL <=", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelLike(String value) {
            addCriterion("SCHOOLTEACHERTEL like", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelNotLike(String value) {
            addCriterion("SCHOOLTEACHERTEL not like", value, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelIn(List<String> values) {
            addCriterion("SCHOOLTEACHERTEL in", values, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelNotIn(List<String> values) {
            addCriterion("SCHOOLTEACHERTEL not in", values, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelBetween(String value1, String value2) {
            addCriterion("SCHOOLTEACHERTEL between", value1, value2, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSchoolteachertelNotBetween(String value1, String value2) {
            addCriterion("SCHOOLTEACHERTEL not between", value1, value2, "schoolteachertel");
            return (Criteria) this;
        }

        public Criteria andSfgpIsNull() {
            addCriterion("SFGP is null");
            return (Criteria) this;
        }

        public Criteria andSfgpIsNotNull() {
            addCriterion("SFGP is not null");
            return (Criteria) this;
        }

        public Criteria andSfgpEqualTo(String value) {
            addCriterion("SFGP =", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpNotEqualTo(String value) {
            addCriterion("SFGP <>", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpGreaterThan(String value) {
            addCriterion("SFGP >", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpGreaterThanOrEqualTo(String value) {
            addCriterion("SFGP >=", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpLessThan(String value) {
            addCriterion("SFGP <", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpLessThanOrEqualTo(String value) {
            addCriterion("SFGP <=", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpLike(String value) {
            addCriterion("SFGP like", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpNotLike(String value) {
            addCriterion("SFGP not like", value, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpIn(List<String> values) {
            addCriterion("SFGP in", values, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpNotIn(List<String> values) {
            addCriterion("SFGP not in", values, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpBetween(String value1, String value2) {
            addCriterion("SFGP between", value1, value2, "sfgp");
            return (Criteria) this;
        }

        public Criteria andSfgpNotBetween(String value1, String value2) {
            addCriterion("SFGP not between", value1, value2, "sfgp");
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

        public Criteria andTeacheridEqualTo(BigDecimal value) {
            addCriterion("TEACHERID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(BigDecimal value) {
            addCriterion("TEACHERID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(BigDecimal value) {
            addCriterion("TEACHERID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACHERID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(BigDecimal value) {
            addCriterion("TEACHERID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACHERID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<BigDecimal> values) {
            addCriterion("TEACHERID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<BigDecimal> values) {
            addCriterion("TEACHERID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACHERID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACHERID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachrenameIsNull() {
            addCriterion("TEACHRENAME is null");
            return (Criteria) this;
        }

        public Criteria andTeachrenameIsNotNull() {
            addCriterion("TEACHRENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeachrenameEqualTo(String value) {
            addCriterion("TEACHRENAME =", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameNotEqualTo(String value) {
            addCriterion("TEACHRENAME <>", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameGreaterThan(String value) {
            addCriterion("TEACHRENAME >", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHRENAME >=", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameLessThan(String value) {
            addCriterion("TEACHRENAME <", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameLessThanOrEqualTo(String value) {
            addCriterion("TEACHRENAME <=", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameLike(String value) {
            addCriterion("TEACHRENAME like", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameNotLike(String value) {
            addCriterion("TEACHRENAME not like", value, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameIn(List<String> values) {
            addCriterion("TEACHRENAME in", values, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameNotIn(List<String> values) {
            addCriterion("TEACHRENAME not in", values, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameBetween(String value1, String value2) {
            addCriterion("TEACHRENAME between", value1, value2, "teachrename");
            return (Criteria) this;
        }

        public Criteria andTeachrenameNotBetween(String value1, String value2) {
            addCriterion("TEACHRENAME not between", value1, value2, "teachrename");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeIsNull() {
            addCriterion("CULTIVATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeIsNotNull() {
            addCriterion("CULTIVATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeEqualTo(String value) {
            addCriterion("CULTIVATETYPE =", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeNotEqualTo(String value) {
            addCriterion("CULTIVATETYPE <>", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeGreaterThan(String value) {
            addCriterion("CULTIVATETYPE >", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CULTIVATETYPE >=", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeLessThan(String value) {
            addCriterion("CULTIVATETYPE <", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeLessThanOrEqualTo(String value) {
            addCriterion("CULTIVATETYPE <=", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeLike(String value) {
            addCriterion("CULTIVATETYPE like", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeNotLike(String value) {
            addCriterion("CULTIVATETYPE not like", value, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeIn(List<String> values) {
            addCriterion("CULTIVATETYPE in", values, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeNotIn(List<String> values) {
            addCriterion("CULTIVATETYPE not in", values, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeBetween(String value1, String value2) {
            addCriterion("CULTIVATETYPE between", value1, value2, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andCultivatetypeNotBetween(String value1, String value2) {
            addCriterion("CULTIVATETYPE not between", value1, value2, "cultivatetype");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("PROFESSIONAL is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("PROFESSIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("PROFESSIONAL =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("PROFESSIONAL <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("PROFESSIONAL >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("PROFESSIONAL <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("PROFESSIONAL like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("PROFESSIONAL not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("PROFESSIONAL in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("PROFESSIONAL not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidIsNull() {
            addCriterion("PROFESSIONALGUID is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidIsNotNull() {
            addCriterion("PROFESSIONALGUID is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidEqualTo(String value) {
            addCriterion("PROFESSIONALGUID =", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidNotEqualTo(String value) {
            addCriterion("PROFESSIONALGUID <>", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidGreaterThan(String value) {
            addCriterion("PROFESSIONALGUID >", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONALGUID >=", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidLessThan(String value) {
            addCriterion("PROFESSIONALGUID <", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONALGUID <=", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidLike(String value) {
            addCriterion("PROFESSIONALGUID like", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidNotLike(String value) {
            addCriterion("PROFESSIONALGUID not like", value, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidIn(List<String> values) {
            addCriterion("PROFESSIONALGUID in", values, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidNotIn(List<String> values) {
            addCriterion("PROFESSIONALGUID not in", values, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidBetween(String value1, String value2) {
            addCriterion("PROFESSIONALGUID between", value1, value2, "professionalguid");
            return (Criteria) this;
        }

        public Criteria andProfessionalguidNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONALGUID not between", value1, value2, "professionalguid");
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

        public Criteria andStudystarttimeIsNull() {
            addCriterion("STUDYSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeIsNotNull() {
            addCriterion("STUDYSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYSTARTTIME =", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYSTARTTIME <>", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STUDYSTARTTIME >", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYSTARTTIME >=", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeLessThan(Date value) {
            addCriterionForJDBCDate("STUDYSTARTTIME <", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYSTARTTIME <=", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("STUDYSTARTTIME in", values, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STUDYSTARTTIME not in", values, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDYSTARTTIME between", value1, value2, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDYSTARTTIME not between", value1, value2, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeEqualTo(Timestamp value) {
            addCriterion("STUDYSTARTTIME =", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeNotEqualTo(Timestamp value) {
            addCriterion("STUDYSTARTTIME <>", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeGreaterThan(Timestamp value) {
            addCriterion("STUDYSTARTTIME >", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("STUDYSTARTTIME >=", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeLessThan(Timestamp value) {
            addCriterion("STUDYSTARTTIME <", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("STUDYSTARTTIME <=", value, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STUDYSTARTTIME between", value1, value2, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudystarttimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STUDYSTARTTIME not between", value1, value2, "studystarttime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeIsNull() {
            addCriterion("STUDYENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeIsNotNull() {
            addCriterion("STUDYENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYENDTIME =", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYENDTIME <>", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STUDYENDTIME >", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYENDTIME >=", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeLessThan(Date value) {
            addCriterionForJDBCDate("STUDYENDTIME <", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDYENDTIME <=", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("STUDYENDTIME in", values, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STUDYENDTIME not in", values, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDYENDTIME between", value1, value2, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDYENDTIME not between", value1, value2, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeEqualTo(Timestamp value) {
            addCriterion("STUDYENDTIME =", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeNotEqualTo(Timestamp value) {
            addCriterion("STUDYENDTIME <>", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeGreaterThan(Timestamp value) {
            addCriterion("STUDYENDTIME >", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("STUDYENDTIME >=", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeLessThan(Timestamp value) {
            addCriterion("STUDYENDTIME <", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("STUDYENDTIME <=", value, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STUDYENDTIME between", value1, value2, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andStudyendtimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STUDYENDTIME not between", value1, value2, "studyendtime");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("MONTH like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("MONTH not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("MONTH not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNull() {
            addCriterion("IMAGEPATH is null");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNotNull() {
            addCriterion("IMAGEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andImagepathEqualTo(String value) {
            addCriterion("IMAGEPATH =", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotEqualTo(String value) {
            addCriterion("IMAGEPATH <>", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThan(String value) {
            addCriterion("IMAGEPATH >", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGEPATH >=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThan(String value) {
            addCriterion("IMAGEPATH <", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThanOrEqualTo(String value) {
            addCriterion("IMAGEPATH <=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLike(String value) {
            addCriterion("IMAGEPATH like", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotLike(String value) {
            addCriterion("IMAGEPATH not like", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathIn(List<String> values) {
            addCriterion("IMAGEPATH in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotIn(List<String> values) {
            addCriterion("IMAGEPATH not in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathBetween(String value1, String value2) {
            addCriterion("IMAGEPATH between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotBetween(String value1, String value2) {
            addCriterion("IMAGEPATH not between", value1, value2, "imagepath");
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

        public Criteria andCheckcontentIsNull() {
            addCriterion("CHECKCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIsNotNull() {
            addCriterion("CHECKCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcontentEqualTo(String value) {
            addCriterion("CHECKCONTENT =", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotEqualTo(String value) {
            addCriterion("CHECKCONTENT <>", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentGreaterThan(String value) {
            addCriterion("CHECKCONTENT >", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKCONTENT >=", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLessThan(String value) {
            addCriterion("CHECKCONTENT <", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLessThanOrEqualTo(String value) {
            addCriterion("CHECKCONTENT <=", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLike(String value) {
            addCriterion("CHECKCONTENT like", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotLike(String value) {
            addCriterion("CHECKCONTENT not like", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIn(List<String> values) {
            addCriterion("CHECKCONTENT in", values, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotIn(List<String> values) {
            addCriterion("CHECKCONTENT not in", values, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentBetween(String value1, String value2) {
            addCriterion("CHECKCONTENT between", value1, value2, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotBetween(String value1, String value2) {
            addCriterion("CHECKCONTENT not between", value1, value2, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andShztIsNull() {
            addCriterion("SHZT is null");
            return (Criteria) this;
        }

        public Criteria andShztIsNotNull() {
            addCriterion("SHZT is not null");
            return (Criteria) this;
        }

        public Criteria andShztEqualTo(String value) {
            addCriterion("SHZT =", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotEqualTo(String value) {
            addCriterion("SHZT <>", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztGreaterThan(String value) {
            addCriterion("SHZT >", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztGreaterThanOrEqualTo(String value) {
            addCriterion("SHZT >=", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztLessThan(String value) {
            addCriterion("SHZT <", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztLessThanOrEqualTo(String value) {
            addCriterion("SHZT <=", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztLike(String value) {
            addCriterion("SHZT like", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotLike(String value) {
            addCriterion("SHZT not like", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztIn(List<String> values) {
            addCriterion("SHZT in", values, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotIn(List<String> values) {
            addCriterion("SHZT not in", values, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztBetween(String value1, String value2) {
            addCriterion("SHZT between", value1, value2, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotBetween(String value1, String value2) {
            addCriterion("SHZT not between", value1, value2, "shzt");
            return (Criteria) this;
        }

        public Criteria andShridIsNull() {
            addCriterion("SHRID is null");
            return (Criteria) this;
        }

        public Criteria andShridIsNotNull() {
            addCriterion("SHRID is not null");
            return (Criteria) this;
        }

        public Criteria andShridEqualTo(String value) {
            addCriterion("SHRID =", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridNotEqualTo(String value) {
            addCriterion("SHRID <>", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridGreaterThan(String value) {
            addCriterion("SHRID >", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridGreaterThanOrEqualTo(String value) {
            addCriterion("SHRID >=", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridLessThan(String value) {
            addCriterion("SHRID <", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridLessThanOrEqualTo(String value) {
            addCriterion("SHRID <=", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridLike(String value) {
            addCriterion("SHRID like", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridNotLike(String value) {
            addCriterion("SHRID not like", value, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridIn(List<String> values) {
            addCriterion("SHRID in", values, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridNotIn(List<String> values) {
            addCriterion("SHRID not in", values, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridBetween(String value1, String value2) {
            addCriterion("SHRID between", value1, value2, "shrid");
            return (Criteria) this;
        }

        public Criteria andShridNotBetween(String value1, String value2) {
            addCriterion("SHRID not between", value1, value2, "shrid");
            return (Criteria) this;
        }

        public Criteria andShsjIsNull() {
            addCriterion("SHSJ is null");
            return (Criteria) this;
        }

        public Criteria andShsjIsNotNull() {
            addCriterion("SHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andShsjEqualTo(Date value) {
            addCriterionForJDBCDate("SHSJ =", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SHSJ <>", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SHSJ >", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHSJ >=", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjLessThan(Date value) {
            addCriterionForJDBCDate("SHSJ <", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHSJ <=", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjIn(List<Date> values) {
            addCriterionForJDBCDate("SHSJ in", values, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SHSJ not in", values, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHSJ between", value1, value2, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHSJ not between", value1, value2, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjEqualTo(Timestamp value) {
            addCriterion("SHSJ =", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotEqualTo(Timestamp value) {
            addCriterion("SHSJ <>", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjGreaterThan(Timestamp value) {
            addCriterion("SHSJ >", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SHSJ >=", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjLessThan(Timestamp value) {
            addCriterion("SHSJ <", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("SHSJ <=", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SHSJ between", value1, value2, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SHSJ not between", value1, value2, "shsj");
            return (Criteria) this;
        }

        public Criteria andJfbjIsNull() {
            addCriterion("JFBJ is null");
            return (Criteria) this;
        }

        public Criteria andJfbjIsNotNull() {
            addCriterion("JFBJ is not null");
            return (Criteria) this;
        }

        public Criteria andJfbjEqualTo(String value) {
            addCriterion("JFBJ =", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjNotEqualTo(String value) {
            addCriterion("JFBJ <>", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjGreaterThan(String value) {
            addCriterion("JFBJ >", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjGreaterThanOrEqualTo(String value) {
            addCriterion("JFBJ >=", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjLessThan(String value) {
            addCriterion("JFBJ <", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjLessThanOrEqualTo(String value) {
            addCriterion("JFBJ <=", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjLike(String value) {
            addCriterion("JFBJ like", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjNotLike(String value) {
            addCriterion("JFBJ not like", value, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjIn(List<String> values) {
            addCriterion("JFBJ in", values, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjNotIn(List<String> values) {
            addCriterion("JFBJ not in", values, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjBetween(String value1, String value2) {
            addCriterion("JFBJ between", value1, value2, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfbjNotBetween(String value1, String value2) {
            addCriterion("JFBJ not between", value1, value2, "jfbj");
            return (Criteria) this;
        }

        public Criteria andJfsjIsNull() {
            addCriterion("JFSJ is null");
            return (Criteria) this;
        }

        public Criteria andJfsjIsNotNull() {
            addCriterion("JFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJfsjEqualTo(Date value) {
            addCriterionForJDBCDate("JFSJ =", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("JFSJ <>", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjGreaterThan(Date value) {
            addCriterionForJDBCDate("JFSJ >", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JFSJ >=", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjLessThan(Date value) {
            addCriterionForJDBCDate("JFSJ <", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JFSJ <=", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjIn(List<Date> values) {
            addCriterionForJDBCDate("JFSJ in", values, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("JFSJ not in", values, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JFSJ between", value1, value2, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JFSJ not between", value1, value2, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjEqualTo(Timestamp value) {
            addCriterion("JFSJ =", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotEqualTo(Timestamp value) {
            addCriterion("JFSJ <>", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjGreaterThan(Timestamp value) {
            addCriterion("JFSJ >", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("JFSJ >=", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjLessThan(Timestamp value) {
            addCriterion("JFSJ <", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("JFSJ <=", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JFSJ between", value1, value2, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JFSJ not between", value1, value2, "jfsj");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Timestamp value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Timestamp value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Timestamp value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Timestamp value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andSignmarkingIsNull() {
            addCriterion("SIGNMARKING is null");
            return (Criteria) this;
        }

        public Criteria andSignmarkingIsNotNull() {
            addCriterion("SIGNMARKING is not null");
            return (Criteria) this;
        }

        public Criteria andSignmarkingEqualTo(String value) {
            addCriterion("SIGNMARKING =", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingNotEqualTo(String value) {
            addCriterion("SIGNMARKING <>", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingGreaterThan(String value) {
            addCriterion("SIGNMARKING >", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNMARKING >=", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingLessThan(String value) {
            addCriterion("SIGNMARKING <", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingLessThanOrEqualTo(String value) {
            addCriterion("SIGNMARKING <=", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingLike(String value) {
            addCriterion("SIGNMARKING like", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingNotLike(String value) {
            addCriterion("SIGNMARKING not like", value, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingIn(List<String> values) {
            addCriterion("SIGNMARKING in", values, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingNotIn(List<String> values) {
            addCriterion("SIGNMARKING not in", values, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingBetween(String value1, String value2) {
            addCriterion("SIGNMARKING between", value1, value2, "signmarking");
            return (Criteria) this;
        }

        public Criteria andSignmarkingNotBetween(String value1, String value2) {
            addCriterion("SIGNMARKING not between", value1, value2, "signmarking");
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

        public Criteria andXpbjIsNull() {
            addCriterion("XPBJ is null");
            return (Criteria) this;
        }

        public Criteria andXpbjIsNotNull() {
            addCriterion("XPBJ is not null");
            return (Criteria) this;
        }

        public Criteria andXpbjEqualTo(String value) {
            addCriterion("XPBJ =", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjNotEqualTo(String value) {
            addCriterion("XPBJ <>", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjGreaterThan(String value) {
            addCriterion("XPBJ >", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjGreaterThanOrEqualTo(String value) {
            addCriterion("XPBJ >=", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjLessThan(String value) {
            addCriterion("XPBJ <", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjLessThanOrEqualTo(String value) {
            addCriterion("XPBJ <=", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjLike(String value) {
            addCriterion("XPBJ like", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjNotLike(String value) {
            addCriterion("XPBJ not like", value, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjIn(List<String> values) {
            addCriterion("XPBJ in", values, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjNotIn(List<String> values) {
            addCriterion("XPBJ not in", values, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjBetween(String value1, String value2) {
            addCriterion("XPBJ between", value1, value2, "xpbj");
            return (Criteria) this;
        }

        public Criteria andXpbjNotBetween(String value1, String value2) {
            addCriterion("XPBJ not between", value1, value2, "xpbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjIsNull() {
            addCriterion("SXZMBJ is null");
            return (Criteria) this;
        }

        public Criteria andSxzmbjIsNotNull() {
            addCriterion("SXZMBJ is not null");
            return (Criteria) this;
        }

        public Criteria andSxzmbjEqualTo(String value) {
            addCriterion("SXZMBJ =", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjNotEqualTo(String value) {
            addCriterion("SXZMBJ <>", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjGreaterThan(String value) {
            addCriterion("SXZMBJ >", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjGreaterThanOrEqualTo(String value) {
            addCriterion("SXZMBJ >=", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjLessThan(String value) {
            addCriterion("SXZMBJ <", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjLessThanOrEqualTo(String value) {
            addCriterion("SXZMBJ <=", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjLike(String value) {
            addCriterion("SXZMBJ like", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjNotLike(String value) {
            addCriterion("SXZMBJ not like", value, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjIn(List<String> values) {
            addCriterion("SXZMBJ in", values, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjNotIn(List<String> values) {
            addCriterion("SXZMBJ not in", values, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjBetween(String value1, String value2) {
            addCriterion("SXZMBJ between", value1, value2, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmbjNotBetween(String value1, String value2) {
            addCriterion("SXZMBJ not between", value1, value2, "sxzmbj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjIsNull() {
            addCriterion("SXZMDYSJ is null");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjIsNotNull() {
            addCriterion("SXZMDYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjEqualTo(Date value) {
            addCriterionForJDBCDate("SXZMDYSJ =", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SXZMDYSJ <>", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjGreaterThan(Date value) {
            addCriterionForJDBCDate("SXZMDYSJ >", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SXZMDYSJ >=", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjLessThan(Date value) {
            addCriterionForJDBCDate("SXZMDYSJ <", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SXZMDYSJ <=", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjIn(List<Date> values) {
            addCriterionForJDBCDate("SXZMDYSJ in", values, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SXZMDYSJ not in", values, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SXZMDYSJ between", value1, value2, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SXZMDYSJ not between", value1, value2, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjEqualTo(Timestamp value) {
            addCriterion("SXZMDYSJ =", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjNotEqualTo(Timestamp value) {
            addCriterion("SXZMDYSJ <>", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjGreaterThan(Timestamp value) {
            addCriterion("SXZMDYSJ >", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SXZMDYSJ >=", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjLessThan(Timestamp value) {
            addCriterion("SXZMDYSJ <", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjLessThanOrEqualTo(Timestamp value) {
            addCriterion("SXZMDYSJ <=", value, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SXZMDYSJ between", value1, value2, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdysjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SXZMDYSJ not between", value1, value2, "sxzmdysj");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrIsNull() {
            addCriterion("SXZMDYR is null");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrIsNotNull() {
            addCriterion("SXZMDYR is not null");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrEqualTo(String value) {
            addCriterion("SXZMDYR =", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrNotEqualTo(String value) {
            addCriterion("SXZMDYR <>", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrGreaterThan(String value) {
            addCriterion("SXZMDYR >", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrGreaterThanOrEqualTo(String value) {
            addCriterion("SXZMDYR >=", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrLessThan(String value) {
            addCriterion("SXZMDYR <", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrLessThanOrEqualTo(String value) {
            addCriterion("SXZMDYR <=", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrLike(String value) {
            addCriterion("SXZMDYR like", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrNotLike(String value) {
            addCriterion("SXZMDYR not like", value, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrIn(List<String> values) {
            addCriterion("SXZMDYR in", values, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrNotIn(List<String> values) {
            addCriterion("SXZMDYR not in", values, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrBetween(String value1, String value2) {
            addCriterion("SXZMDYR between", value1, value2, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andSxzmdyrNotBetween(String value1, String value2) {
            addCriterion("SXZMDYR not between", value1, value2, "sxzmdyr");
            return (Criteria) this;
        }

        public Criteria andJdbjIsNull() {
            addCriterion("JDBJ is null");
            return (Criteria) this;
        }

        public Criteria andJdbjIsNotNull() {
            addCriterion("JDBJ is not null");
            return (Criteria) this;
        }

        public Criteria andJdbjEqualTo(String value) {
            addCriterion("JDBJ =", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotEqualTo(String value) {
            addCriterion("JDBJ <>", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjGreaterThan(String value) {
            addCriterion("JDBJ >", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjGreaterThanOrEqualTo(String value) {
            addCriterion("JDBJ >=", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjLessThan(String value) {
            addCriterion("JDBJ <", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjLessThanOrEqualTo(String value) {
            addCriterion("JDBJ <=", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjLike(String value) {
            addCriterion("JDBJ like", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotLike(String value) {
            addCriterion("JDBJ not like", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjIn(List<String> values) {
            addCriterion("JDBJ in", values, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotIn(List<String> values) {
            addCriterion("JDBJ not in", values, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjBetween(String value1, String value2) {
            addCriterion("JDBJ between", value1, value2, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotBetween(String value1, String value2) {
            addCriterion("JDBJ not between", value1, value2, "jdbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjIsNull() {
            addCriterion("XXWSBJ is null");
            return (Criteria) this;
        }

        public Criteria andXxwsbjIsNotNull() {
            addCriterion("XXWSBJ is not null");
            return (Criteria) this;
        }

        public Criteria andXxwsbjEqualTo(String value) {
            addCriterion("XXWSBJ =", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjNotEqualTo(String value) {
            addCriterion("XXWSBJ <>", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjGreaterThan(String value) {
            addCriterion("XXWSBJ >", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjGreaterThanOrEqualTo(String value) {
            addCriterion("XXWSBJ >=", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjLessThan(String value) {
            addCriterion("XXWSBJ <", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjLessThanOrEqualTo(String value) {
            addCriterion("XXWSBJ <=", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjLike(String value) {
            addCriterion("XXWSBJ like", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjNotLike(String value) {
            addCriterion("XXWSBJ not like", value, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjIn(List<String> values) {
            addCriterion("XXWSBJ in", values, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjNotIn(List<String> values) {
            addCriterion("XXWSBJ not in", values, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjBetween(String value1, String value2) {
            addCriterion("XXWSBJ between", value1, value2, "xxwsbj");
            return (Criteria) this;
        }

        public Criteria andXxwsbjNotBetween(String value1, String value2) {
            addCriterion("XXWSBJ not between", value1, value2, "xxwsbj");
            return (Criteria) this;
        }

        //----------------------------------
        public Criteria andAssureempIsNull() {
            addCriterion("ASSUREEMP is null");
            return (Criteria) this;
        }

        public Criteria andAssureempIsNotNull() {
            addCriterion("ASSUREEMP is not null");
            return (Criteria) this;
        }

        public Criteria andAssureempEqualTo(String value) {
            addCriterion("ASSUREEMP =", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempNotEqualTo(String value) {
            addCriterion("ASSUREEMP <>", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempGreaterThan(String value) {
            addCriterion("ASSUREEMP >", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempGreaterThanOrEqualTo(String value) {
            addCriterion("ASSUREEMP >=", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempLessThan(String value) {
            addCriterion("ASSUREEMP <", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempLessThanOrEqualTo(String value) {
            addCriterion("ASSUREEMP <=", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempLike(String value) {
            addCriterion("ASSUREEMP like", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempNotLike(String value) {
            addCriterion("ASSUREEMP not like", value, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempIn(List<String> values) {
            addCriterion("ASSUREEMP in", values, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempNotIn(List<String> values) {
            addCriterion("ASSUREEMP not in", values, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempBetween(String value1, String value2) {
            addCriterion("ASSUREEMP between", value1, value2, "assureemp");
            return (Criteria) this;
        }

        public Criteria andAssureempNotBetween(String value1, String value2) {
            addCriterion("ASSUREEMP not between", value1, value2, "assureemp");
            return (Criteria) this;
        }
        
        //===================================
        public Criteria andAssureempnameIsNull() {
            addCriterion("ASSUREEMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andAssureempnameIsNotNull() {
            addCriterion("ASSUREEMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAssureempnameEqualTo(String value) {
            addCriterion("ASSUREEMPNAME =", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameNotEqualTo(String value) {
            addCriterion("ASSUREEMPNAME <>", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameGreaterThan(String value) {
            addCriterion("ASSUREEMPNAME >", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameGreaterThanOrEqualTo(String value) {
            addCriterion("ASSUREEMPNAME >=", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameLessThan(String value) {
            addCriterion("ASSUREEMPNAME <", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameLessThanOrEqualTo(String value) {
            addCriterion("ASSUREEMPNAME <=", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameLike(String value) {
            addCriterion("ASSUREEMPNAME like", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameNotLike(String value) {
            addCriterion("ASSUREEMPNAME not like", value, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameIn(List<String> values) {
            addCriterion("ASSUREEMPNAME in", values, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameNotIn(List<String> values) {
            addCriterion("ASSUREEMPNAME not in", values, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameBetween(String value1, String value2) {
            addCriterion("ASSUREEMPNAME between", value1, value2, "assureempname");
            return (Criteria) this;
        }

        public Criteria andAssureempnameNotBetween(String value1, String value2) {
            addCriterion("ASSUREEMPNAME not between", value1, value2, "assureempname");
            return (Criteria) this;
        }
        
      //===================================
        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }
        
        public Criteria andFzfjfbjIsNull() {
            addCriterion("FZFJFBJ is null");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjIsNotNull() {
            addCriterion("FZFJFBJ is not null");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjEqualTo(String value) {
            addCriterion("FZFJFBJ =", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjNotEqualTo(String value) {
            addCriterion("FZFJFBJ <>", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjGreaterThan(String value) {
            addCriterion("FZFJFBJ >", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjGreaterThanOrEqualTo(String value) {
            addCriterion("FZFJFBJ >=", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjLessThan(String value) {
            addCriterion("FZFJFBJ <", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjLessThanOrEqualTo(String value) {
            addCriterion("FZFJFBJ <=", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjLike(String value) {
            addCriterion("FZFJFBJ like", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjNotLike(String value) {
            addCriterion("FZFJFBJ not like", value, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjIn(List<String> values) {
            addCriterion("FZFJFBJ in", values, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjBetween(String value1, String value2) {
            addCriterion("FZFJFBJ between", value1, value2, "fzfjfbj");
            return (Criteria) this;
        }

        public Criteria andFzfjfbjNotBetween(String value1, String value2) {
            addCriterion("FZFJFBJ not between", value1, value2, "fzfjfbj");
            return (Criteria) this;
        }
        
        public Criteria andFzfjfsjIsNull() {
            addCriterion("FZFJFSJ is null");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjIsNotNull() {
            addCriterion("FZFJFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjEqualTo(Date value) {
            addCriterionForJDBCDate("FZFJFSJ =", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("FZFJFSJ <>", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjGreaterThan(Date value) {
            addCriterionForJDBCDate("FZFJFSJ >", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FZFJFSJ >=", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjLessThan(Date value) {
            addCriterionForJDBCDate("FZFJFSJ <", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FZFJFSJ <=", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjIn(List<Date> values) {
            addCriterionForJDBCDate("FZFJFSJ in", values, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("FZFJFSJ not in", values, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FZFJFSJ between", value1, value2, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FZFJFSJ not between", value1, value2, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjEqualTo(Timestamp value) {
            addCriterion("FZFJFSJ =", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjNotEqualTo(Timestamp value) {
            addCriterion("FZFJFSJ <>", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjGreaterThan(Timestamp value) {
            addCriterion("FZFJFSJ >", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("FZFJFSJ >=", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjLessThan(Timestamp value) {
            addCriterion("FZFJFSJ <", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("FZFJFSJ <=", value, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FZFJFSJ between", value1, value2, "fzfjfsj");
            return (Criteria) this;
        }

        public Criteria andFzfjfsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FZFJFSJ not between", value1, value2, "fzfjfsj");
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