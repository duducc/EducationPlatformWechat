package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxTeachingManusEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_TEACHING_MANUS
*表说明带教手册类别
  */
public class JxTeachingManusSqlWhere extends JxTeachingManusEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxTeachingManusSqlWhere() {
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

        public Criteria andManuIdIsNull() {
            addCriterion("MANU_ID is null");
            return (Criteria) this;
        }

        public Criteria andManuIdIsNotNull() {
            addCriterion("MANU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManuIdEqualTo(String value) {
            addCriterion("MANU_ID =", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotEqualTo(String value) {
            addCriterion("MANU_ID <>", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdGreaterThan(String value) {
            addCriterion("MANU_ID >", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_ID >=", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdLessThan(String value) {
            addCriterion("MANU_ID <", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdLessThanOrEqualTo(String value) {
            addCriterion("MANU_ID <=", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdLike(String value) {
            addCriterion("MANU_ID like", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotLike(String value) {
            addCriterion("MANU_ID not like", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdIn(List<String> values) {
            addCriterion("MANU_ID in", values, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotIn(List<String> values) {
            addCriterion("MANU_ID not in", values, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdBetween(String value1, String value2) {
            addCriterion("MANU_ID between", value1, value2, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotBetween(String value1, String value2) {
            addCriterion("MANU_ID not between", value1, value2, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuJcIsNull() {
            addCriterion("MANU_JC is null");
            return (Criteria) this;
        }

        public Criteria andManuJcIsNotNull() {
            addCriterion("MANU_JC is not null");
            return (Criteria) this;
        }

        public Criteria andManuJcEqualTo(String value) {
            addCriterion("MANU_JC =", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcNotEqualTo(String value) {
            addCriterion("MANU_JC <>", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcGreaterThan(String value) {
            addCriterion("MANU_JC >", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_JC >=", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcLessThan(String value) {
            addCriterion("MANU_JC <", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcLessThanOrEqualTo(String value) {
            addCriterion("MANU_JC <=", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcLike(String value) {
            addCriterion("MANU_JC like", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcNotLike(String value) {
            addCriterion("MANU_JC not like", value, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcIn(List<String> values) {
            addCriterion("MANU_JC in", values, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcNotIn(List<String> values) {
            addCriterion("MANU_JC not in", values, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcBetween(String value1, String value2) {
            addCriterion("MANU_JC between", value1, value2, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuJcNotBetween(String value1, String value2) {
            addCriterion("MANU_JC not between", value1, value2, "manuJc");
            return (Criteria) this;
        }

        public Criteria andManuNameIsNull() {
            addCriterion("MANU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andManuNameIsNotNull() {
            addCriterion("MANU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andManuNameEqualTo(String value) {
            addCriterion("MANU_NAME =", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotEqualTo(String value) {
            addCriterion("MANU_NAME <>", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameGreaterThan(String value) {
            addCriterion("MANU_NAME >", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_NAME >=", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameLessThan(String value) {
            addCriterion("MANU_NAME <", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameLessThanOrEqualTo(String value) {
            addCriterion("MANU_NAME <=", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameLike(String value) {
            addCriterion("MANU_NAME like", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotLike(String value) {
            addCriterion("MANU_NAME not like", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameIn(List<String> values) {
            addCriterion("MANU_NAME in", values, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotIn(List<String> values) {
            addCriterion("MANU_NAME not in", values, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameBetween(String value1, String value2) {
            addCriterion("MANU_NAME between", value1, value2, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotBetween(String value1, String value2) {
            addCriterion("MANU_NAME not between", value1, value2, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuDmIsNull() {
            addCriterion("MANU_DM is null");
            return (Criteria) this;
        }

        public Criteria andManuDmIsNotNull() {
            addCriterion("MANU_DM is not null");
            return (Criteria) this;
        }

        public Criteria andManuDmEqualTo(String value) {
            addCriterion("MANU_DM =", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmNotEqualTo(String value) {
            addCriterion("MANU_DM <>", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmGreaterThan(String value) {
            addCriterion("MANU_DM >", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_DM >=", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmLessThan(String value) {
            addCriterion("MANU_DM <", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmLessThanOrEqualTo(String value) {
            addCriterion("MANU_DM <=", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmLike(String value) {
            addCriterion("MANU_DM like", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmNotLike(String value) {
            addCriterion("MANU_DM not like", value, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmIn(List<String> values) {
            addCriterion("MANU_DM in", values, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmNotIn(List<String> values) {
            addCriterion("MANU_DM not in", values, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmBetween(String value1, String value2) {
            addCriterion("MANU_DM between", value1, value2, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuDmNotBetween(String value1, String value2) {
            addCriterion("MANU_DM not between", value1, value2, "manuDm");
            return (Criteria) this;
        }

        public Criteria andManuShlIsNull() {
            addCriterion("MANU_SHL is null");
            return (Criteria) this;
        }

        public Criteria andManuShlIsNotNull() {
            addCriterion("MANU_SHL is not null");
            return (Criteria) this;
        }

        public Criteria andManuShlEqualTo(BigDecimal value) {
            addCriterion("MANU_SHL =", value, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlNotEqualTo(BigDecimal value) {
            addCriterion("MANU_SHL <>", value, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlGreaterThan(BigDecimal value) {
            addCriterion("MANU_SHL >", value, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MANU_SHL >=", value, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlLessThan(BigDecimal value) {
            addCriterion("MANU_SHL <", value, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MANU_SHL <=", value, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlIn(List<BigDecimal> values) {
            addCriterion("MANU_SHL in", values, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlNotIn(List<BigDecimal> values) {
            addCriterion("MANU_SHL not in", values, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANU_SHL between", value1, value2, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuShlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANU_SHL not between", value1, value2, "manuShl");
            return (Criteria) this;
        }

        public Criteria andManuImgIsNull() {
            addCriterion("MANU_IMG is null");
            return (Criteria) this;
        }

        public Criteria andManuImgIsNotNull() {
            addCriterion("MANU_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andManuImgEqualTo(String value) {
            addCriterion("MANU_IMG =", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgNotEqualTo(String value) {
            addCriterion("MANU_IMG <>", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgGreaterThan(String value) {
            addCriterion("MANU_IMG >", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_IMG >=", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgLessThan(String value) {
            addCriterion("MANU_IMG <", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgLessThanOrEqualTo(String value) {
            addCriterion("MANU_IMG <=", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgLike(String value) {
            addCriterion("MANU_IMG like", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgNotLike(String value) {
            addCriterion("MANU_IMG not like", value, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgIn(List<String> values) {
            addCriterion("MANU_IMG in", values, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgNotIn(List<String> values) {
            addCriterion("MANU_IMG not in", values, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgBetween(String value1, String value2) {
            addCriterion("MANU_IMG between", value1, value2, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuImgNotBetween(String value1, String value2) {
            addCriterion("MANU_IMG not between", value1, value2, "manuImg");
            return (Criteria) this;
        }

        public Criteria andManuShmIsNull() {
            addCriterion("MANU_SHM is null");
            return (Criteria) this;
        }

        public Criteria andManuShmIsNotNull() {
            addCriterion("MANU_SHM is not null");
            return (Criteria) this;
        }

        public Criteria andManuShmEqualTo(String value) {
            addCriterion("MANU_SHM =", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmNotEqualTo(String value) {
            addCriterion("MANU_SHM <>", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmGreaterThan(String value) {
            addCriterion("MANU_SHM >", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_SHM >=", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmLessThan(String value) {
            addCriterion("MANU_SHM <", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmLessThanOrEqualTo(String value) {
            addCriterion("MANU_SHM <=", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmLike(String value) {
            addCriterion("MANU_SHM like", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmNotLike(String value) {
            addCriterion("MANU_SHM not like", value, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmIn(List<String> values) {
            addCriterion("MANU_SHM in", values, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmNotIn(List<String> values) {
            addCriterion("MANU_SHM not in", values, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmBetween(String value1, String value2) {
            addCriterion("MANU_SHM between", value1, value2, "manuShm");
            return (Criteria) this;
        }

        public Criteria andManuShmNotBetween(String value1, String value2) {
            addCriterion("MANU_SHM not between", value1, value2, "manuShm");
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

        public Criteria andManuTypeIsNull() {
            addCriterion("MANU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andManuTypeIsNotNull() {
            addCriterion("MANU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andManuTypeEqualTo(String value) {
            addCriterion("MANU_TYPE =", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeNotEqualTo(String value) {
            addCriterion("MANU_TYPE <>", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeGreaterThan(String value) {
            addCriterion("MANU_TYPE >", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_TYPE >=", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeLessThan(String value) {
            addCriterion("MANU_TYPE <", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeLessThanOrEqualTo(String value) {
            addCriterion("MANU_TYPE <=", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeLike(String value) {
            addCriterion("MANU_TYPE like", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeNotLike(String value) {
            addCriterion("MANU_TYPE not like", value, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeIn(List<String> values) {
            addCriterion("MANU_TYPE in", values, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeNotIn(List<String> values) {
            addCriterion("MANU_TYPE not in", values, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeBetween(String value1, String value2) {
            addCriterion("MANU_TYPE between", value1, value2, "manuType");
            return (Criteria) this;
        }

        public Criteria andManuTypeNotBetween(String value1, String value2) {
            addCriterion("MANU_TYPE not between", value1, value2, "manuType");
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

        public Criteria andManuDateIsNull() {
            addCriterion("MANU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andManuDateIsNotNull() {
            addCriterion("MANU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andManuDateEqualTo(Date value) {
            addCriterionForJDBCDate("MANU_DATE =", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MANU_DATE <>", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MANU_DATE >", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MANU_DATE >=", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateLessThan(Date value) {
            addCriterionForJDBCDate("MANU_DATE <", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MANU_DATE <=", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateIn(List<Date> values) {
            addCriterionForJDBCDate("MANU_DATE in", values, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MANU_DATE not in", values, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MANU_DATE between", value1, value2, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MANU_DATE not between", value1, value2, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateEqualTo(Timestamp value) {
            addCriterion("MANU_DATE =", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateNotEqualTo(Timestamp value) {
            addCriterion("MANU_DATE <>", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateGreaterThan(Timestamp value) {
            addCriterion("MANU_DATE >", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("MANU_DATE >=", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateLessThan(Timestamp value) {
            addCriterion("MANU_DATE <", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("MANU_DATE <=", value, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("MANU_DATE between", value1, value2, "manuDate");
            return (Criteria) this;
        }

        public Criteria andManuDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("MANU_DATE not between", value1, value2, "manuDate");
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