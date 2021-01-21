package com.saint.wechat.manager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WechatMenugroupSqlWhere extends WechatMenugroupEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatMenugroupSqlWhere() {
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

        public Criteria andMenusxhIsNull() {
            addCriterion("MENUSXH is null");
            return (Criteria) this;
        }

        public Criteria andMenusxhIsNotNull() {
            addCriterion("MENUSXH is not null");
            return (Criteria) this;
        }

        public Criteria andMenusxhEqualTo(String value) {
            addCriterion("MENUSXH =", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhNotEqualTo(String value) {
            addCriterion("MENUSXH <>", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhGreaterThan(String value) {
            addCriterion("MENUSXH >", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSXH >=", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhLessThan(String value) {
            addCriterion("MENUSXH <", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhLessThanOrEqualTo(String value) {
            addCriterion("MENUSXH <=", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhLike(String value) {
            addCriterion("MENUSXH like", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhNotLike(String value) {
            addCriterion("MENUSXH not like", value, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhIn(List<String> values) {
            addCriterion("MENUSXH in", values, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhNotIn(List<String> values) {
            addCriterion("MENUSXH not in", values, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhBetween(String value1, String value2) {
            addCriterion("MENUSXH between", value1, value2, "menusxh");
            return (Criteria) this;
        }

        public Criteria andMenusxhNotBetween(String value1, String value2) {
            addCriterion("MENUSXH not between", value1, value2, "menusxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhIsNull() {
            addCriterion("CLIENTSXH is null");
            return (Criteria) this;
        }

        public Criteria andClientsxhIsNotNull() {
            addCriterion("CLIENTSXH is not null");
            return (Criteria) this;
        }

        public Criteria andClientsxhEqualTo(String value) {
            addCriterion("CLIENTSXH =", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotEqualTo(String value) {
            addCriterion("CLIENTSXH <>", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhGreaterThan(String value) {
            addCriterion("CLIENTSXH >", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTSXH >=", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhLessThan(String value) {
            addCriterion("CLIENTSXH <", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhLessThanOrEqualTo(String value) {
            addCriterion("CLIENTSXH <=", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhLike(String value) {
            addCriterion("CLIENTSXH like", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotLike(String value) {
            addCriterion("CLIENTSXH not like", value, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhIn(List<String> values) {
            addCriterion("CLIENTSXH in", values, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotIn(List<String> values) {
            addCriterion("CLIENTSXH not in", values, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhBetween(String value1, String value2) {
            addCriterion("CLIENTSXH between", value1, value2, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andClientsxhNotBetween(String value1, String value2) {
            addCriterion("CLIENTSXH not between", value1, value2, "clientsxh");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MENUNAME like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MENUNAME not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuvalueIsNull() {
            addCriterion("MENUVALUE is null");
            return (Criteria) this;
        }

        public Criteria andMenuvalueIsNotNull() {
            addCriterion("MENUVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuvalueEqualTo(String value) {
            addCriterion("MENUVALUE =", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueNotEqualTo(String value) {
            addCriterion("MENUVALUE <>", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueGreaterThan(String value) {
            addCriterion("MENUVALUE >", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueGreaterThanOrEqualTo(String value) {
            addCriterion("MENUVALUE >=", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueLessThan(String value) {
            addCriterion("MENUVALUE <", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueLessThanOrEqualTo(String value) {
            addCriterion("MENUVALUE <=", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueLike(String value) {
            addCriterion("MENUVALUE like", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueNotLike(String value) {
            addCriterion("MENUVALUE not like", value, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueIn(List<String> values) {
            addCriterion("MENUVALUE in", values, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueNotIn(List<String> values) {
            addCriterion("MENUVALUE not in", values, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueBetween(String value1, String value2) {
            addCriterion("MENUVALUE between", value1, value2, "menuvalue");
            return (Criteria) this;
        }

        public Criteria andMenuvalueNotBetween(String value1, String value2) {
            addCriterion("MENUVALUE not between", value1, value2, "menuvalue");
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