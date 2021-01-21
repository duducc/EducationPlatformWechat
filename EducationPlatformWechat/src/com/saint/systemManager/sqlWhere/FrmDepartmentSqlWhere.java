package com.saint.systemManager.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名FRM_DEPARTMENT
*表说明部门信息
  */
public class FrmDepartmentSqlWhere extends FrmDepartmentEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmDepartmentSqlWhere() {
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

        public Criteria andBmmcIsNull() {
            addCriterion("BMMC is null");
            return (Criteria) this;
        }

        public Criteria andBmmcIsNotNull() {
            addCriterion("BMMC is not null");
            return (Criteria) this;
        }

        public Criteria andBmmcEqualTo(String value) {
            addCriterion("BMMC =", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotEqualTo(String value) {
            addCriterion("BMMC <>", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcGreaterThan(String value) {
            addCriterion("BMMC >", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcGreaterThanOrEqualTo(String value) {
            addCriterion("BMMC >=", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcLessThan(String value) {
            addCriterion("BMMC <", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcLessThanOrEqualTo(String value) {
            addCriterion("BMMC <=", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcLike(String value) {
            addCriterion("BMMC like", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotLike(String value) {
            addCriterion("BMMC not like", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcIn(List<String> values) {
            addCriterion("BMMC in", values, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotIn(List<String> values) {
            addCriterion("BMMC not in", values, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcBetween(String value1, String value2) {
            addCriterion("BMMC between", value1, value2, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotBetween(String value1, String value2) {
            addCriterion("BMMC not between", value1, value2, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmjcIsNull() {
            addCriterion("BMJC is null");
            return (Criteria) this;
        }

        public Criteria andBmjcIsNotNull() {
            addCriterion("BMJC is not null");
            return (Criteria) this;
        }

        public Criteria andBmjcEqualTo(String value) {
            addCriterion("BMJC =", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcNotEqualTo(String value) {
            addCriterion("BMJC <>", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcGreaterThan(String value) {
            addCriterion("BMJC >", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcGreaterThanOrEqualTo(String value) {
            addCriterion("BMJC >=", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcLessThan(String value) {
            addCriterion("BMJC <", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcLessThanOrEqualTo(String value) {
            addCriterion("BMJC <=", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcLike(String value) {
            addCriterion("BMJC like", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcNotLike(String value) {
            addCriterion("BMJC not like", value, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcIn(List<String> values) {
            addCriterion("BMJC in", values, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcNotIn(List<String> values) {
            addCriterion("BMJC not in", values, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcBetween(String value1, String value2) {
            addCriterion("BMJC between", value1, value2, "bmjc");
            return (Criteria) this;
        }

        public Criteria andBmjcNotBetween(String value1, String value2) {
            addCriterion("BMJC not between", value1, value2, "bmjc");
            return (Criteria) this;
        }

        public Criteria andYzmcIsNull() {
            addCriterion("YZMC is null");
            return (Criteria) this;
        }

        public Criteria andYzmcIsNotNull() {
            addCriterion("YZMC is not null");
            return (Criteria) this;
        }

        public Criteria andYzmcEqualTo(String value) {
            addCriterion("YZMC =", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcNotEqualTo(String value) {
            addCriterion("YZMC <>", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcGreaterThan(String value) {
            addCriterion("YZMC >", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcGreaterThanOrEqualTo(String value) {
            addCriterion("YZMC >=", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcLessThan(String value) {
            addCriterion("YZMC <", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcLessThanOrEqualTo(String value) {
            addCriterion("YZMC <=", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcLike(String value) {
            addCriterion("YZMC like", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcNotLike(String value) {
            addCriterion("YZMC not like", value, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcIn(List<String> values) {
            addCriterion("YZMC in", values, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcNotIn(List<String> values) {
            addCriterion("YZMC not in", values, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcBetween(String value1, String value2) {
            addCriterion("YZMC between", value1, value2, "yzmc");
            return (Criteria) this;
        }

        public Criteria andYzmcNotBetween(String value1, String value2) {
            addCriterion("YZMC not between", value1, value2, "yzmc");
            return (Criteria) this;
        }

        public Criteria andBmjbIsNull() {
            addCriterion("BMJB is null");
            return (Criteria) this;
        }

        public Criteria andBmjbIsNotNull() {
            addCriterion("BMJB is not null");
            return (Criteria) this;
        }

        public Criteria andBmjbEqualTo(String value) {
            addCriterion("BMJB =", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbNotEqualTo(String value) {
            addCriterion("BMJB <>", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbGreaterThan(String value) {
            addCriterion("BMJB >", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbGreaterThanOrEqualTo(String value) {
            addCriterion("BMJB >=", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbLessThan(String value) {
            addCriterion("BMJB <", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbLessThanOrEqualTo(String value) {
            addCriterion("BMJB <=", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbLike(String value) {
            addCriterion("BMJB like", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbNotLike(String value) {
            addCriterion("BMJB not like", value, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbIn(List<String> values) {
            addCriterion("BMJB in", values, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbNotIn(List<String> values) {
            addCriterion("BMJB not in", values, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbBetween(String value1, String value2) {
            addCriterion("BMJB between", value1, value2, "bmjb");
            return (Criteria) this;
        }

        public Criteria andBmjbNotBetween(String value1, String value2) {
            addCriterion("BMJB not between", value1, value2, "bmjb");
            return (Criteria) this;
        }

        public Criteria andKclywIsNull() {
            addCriterion("KCLYW is null");
            return (Criteria) this;
        }

        public Criteria andKclywIsNotNull() {
            addCriterion("KCLYW is not null");
            return (Criteria) this;
        }

        public Criteria andKclywEqualTo(String value) {
            addCriterion("KCLYW =", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywNotEqualTo(String value) {
            addCriterion("KCLYW <>", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywGreaterThan(String value) {
            addCriterion("KCLYW >", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywGreaterThanOrEqualTo(String value) {
            addCriterion("KCLYW >=", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywLessThan(String value) {
            addCriterion("KCLYW <", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywLessThanOrEqualTo(String value) {
            addCriterion("KCLYW <=", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywLike(String value) {
            addCriterion("KCLYW like", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywNotLike(String value) {
            addCriterion("KCLYW not like", value, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywIn(List<String> values) {
            addCriterion("KCLYW in", values, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywNotIn(List<String> values) {
            addCriterion("KCLYW not in", values, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywBetween(String value1, String value2) {
            addCriterion("KCLYW between", value1, value2, "kclyw");
            return (Criteria) this;
        }

        public Criteria andKclywNotBetween(String value1, String value2) {
            addCriterion("KCLYW not between", value1, value2, "kclyw");
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

        public Criteria andFzrIsNull() {
            addCriterion("FZR is null");
            return (Criteria) this;
        }

        public Criteria andFzrIsNotNull() {
            addCriterion("FZR is not null");
            return (Criteria) this;
        }

        public Criteria andFzrEqualTo(String value) {
            addCriterion("FZR =", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotEqualTo(String value) {
            addCriterion("FZR <>", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThan(String value) {
            addCriterion("FZR >", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThanOrEqualTo(String value) {
            addCriterion("FZR >=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThan(String value) {
            addCriterion("FZR <", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThanOrEqualTo(String value) {
            addCriterion("FZR <=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLike(String value) {
            addCriterion("FZR like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotLike(String value) {
            addCriterion("FZR not like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrIn(List<String> values) {
            addCriterion("FZR in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotIn(List<String> values) {
            addCriterion("FZR not in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrBetween(String value1, String value2) {
            addCriterion("FZR between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotBetween(String value1, String value2) {
            addCriterion("FZR not between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andLxrIsNull() {
            addCriterion("LXR is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("LXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("LXR =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("LXR <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("LXR >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXR >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("LXR <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("LXR <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("LXR like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("LXR not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("LXR in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("LXR not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("LXR between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("LXR not between", value1, value2, "lxr");
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

        public Criteria andCzhmIsNull() {
            addCriterion("CZHM is null");
            return (Criteria) this;
        }

        public Criteria andCzhmIsNotNull() {
            addCriterion("CZHM is not null");
            return (Criteria) this;
        }

        public Criteria andCzhmEqualTo(String value) {
            addCriterion("CZHM =", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmNotEqualTo(String value) {
            addCriterion("CZHM <>", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmGreaterThan(String value) {
            addCriterion("CZHM >", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmGreaterThanOrEqualTo(String value) {
            addCriterion("CZHM >=", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmLessThan(String value) {
            addCriterion("CZHM <", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmLessThanOrEqualTo(String value) {
            addCriterion("CZHM <=", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmLike(String value) {
            addCriterion("CZHM like", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmNotLike(String value) {
            addCriterion("CZHM not like", value, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmIn(List<String> values) {
            addCriterion("CZHM in", values, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmNotIn(List<String> values) {
            addCriterion("CZHM not in", values, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmBetween(String value1, String value2) {
            addCriterion("CZHM between", value1, value2, "czhm");
            return (Criteria) this;
        }

        public Criteria andCzhmNotBetween(String value1, String value2) {
            addCriterion("CZHM not between", value1, value2, "czhm");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNull() {
            addCriterion("LXDZ is null");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNotNull() {
            addCriterion("LXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andLxdzEqualTo(String value) {
            addCriterion("LXDZ =", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotEqualTo(String value) {
            addCriterion("LXDZ <>", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThan(String value) {
            addCriterion("LXDZ >", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThanOrEqualTo(String value) {
            addCriterion("LXDZ >=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThan(String value) {
            addCriterion("LXDZ <", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThanOrEqualTo(String value) {
            addCriterion("LXDZ <=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLike(String value) {
            addCriterion("LXDZ like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotLike(String value) {
            addCriterion("LXDZ not like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIn(List<String> values) {
            addCriterion("LXDZ in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotIn(List<String> values) {
            addCriterion("LXDZ not in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzBetween(String value1, String value2) {
            addCriterion("LXDZ between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotBetween(String value1, String value2) {
            addCriterion("LXDZ not between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andSjbmIsNull() {
            addCriterion("SJBM is null");
            return (Criteria) this;
        }

        public Criteria andSjbmIsNotNull() {
            addCriterion("SJBM is not null");
            return (Criteria) this;
        }

        public Criteria andSjbmEqualTo(String value) {
            addCriterion("SJBM =", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmNotEqualTo(String value) {
            addCriterion("SJBM <>", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmGreaterThan(String value) {
            addCriterion("SJBM >", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmGreaterThanOrEqualTo(String value) {
            addCriterion("SJBM >=", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmLessThan(String value) {
            addCriterion("SJBM <", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmLessThanOrEqualTo(String value) {
            addCriterion("SJBM <=", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmLike(String value) {
            addCriterion("SJBM like", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmNotLike(String value) {
            addCriterion("SJBM not like", value, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmIn(List<String> values) {
            addCriterion("SJBM in", values, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmNotIn(List<String> values) {
            addCriterion("SJBM not in", values, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmBetween(String value1, String value2) {
            addCriterion("SJBM between", value1, value2, "sjbm");
            return (Criteria) this;
        }

        public Criteria andSjbmNotBetween(String value1, String value2) {
            addCriterion("SJBM not between", value1, value2, "sjbm");
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

        public Criteria andJlztIsNull() {
            addCriterion("JLZT is null");
            return (Criteria) this;
        }

        public Criteria andJlztIsNotNull() {
            addCriterion("JLZT is not null");
            return (Criteria) this;
        }

        public Criteria andJlztEqualTo(String value) {
            addCriterion("JLZT =", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztNotEqualTo(String value) {
            addCriterion("JLZT <>", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztGreaterThan(String value) {
            addCriterion("JLZT >", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztGreaterThanOrEqualTo(String value) {
            addCriterion("JLZT >=", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztLessThan(String value) {
            addCriterion("JLZT <", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztLessThanOrEqualTo(String value) {
            addCriterion("JLZT <=", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztLike(String value) {
            addCriterion("JLZT like", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztNotLike(String value) {
            addCriterion("JLZT not like", value, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztIn(List<String> values) {
            addCriterion("JLZT in", values, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztNotIn(List<String> values) {
            addCriterion("JLZT not in", values, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztBetween(String value1, String value2) {
            addCriterion("JLZT between", value1, value2, "jlzt");
            return (Criteria) this;
        }

        public Criteria andJlztNotBetween(String value1, String value2) {
            addCriterion("JLZT not between", value1, value2, "jlzt");
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