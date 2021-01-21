package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import java.util.ArrayList;
import java.util.List;

/**
*类注释信息
*表名JX_COURSEZXTIME
*表说明理论课上课作息时间
  */
public class JxCoursezxTimeSqlWhere extends JxCoursezxTimeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxCoursezxTimeSqlWhere() {
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

        public Criteria andZxnameIsNull() {
            addCriterion("ZXNAME is null");
            return (Criteria) this;
        }

        public Criteria andZxnameIsNotNull() {
            addCriterion("ZXNAME is not null");
            return (Criteria) this;
        }

        public Criteria andZxnameEqualTo(String value) {
            addCriterion("ZXNAME =", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameNotEqualTo(String value) {
            addCriterion("ZXNAME <>", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameGreaterThan(String value) {
            addCriterion("ZXNAME >", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameGreaterThanOrEqualTo(String value) {
            addCriterion("ZXNAME >=", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameLessThan(String value) {
            addCriterion("ZXNAME <", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameLessThanOrEqualTo(String value) {
            addCriterion("ZXNAME <=", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameLike(String value) {
            addCriterion("ZXNAME like", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameNotLike(String value) {
            addCriterion("ZXNAME not like", value, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameIn(List<String> values) {
            addCriterion("ZXNAME in", values, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameNotIn(List<String> values) {
            addCriterion("ZXNAME not in", values, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameBetween(String value1, String value2) {
            addCriterion("ZXNAME between", value1, value2, "zxname");
            return (Criteria) this;
        }

        public Criteria andZxnameNotBetween(String value1, String value2) {
            addCriterion("ZXNAME not between", value1, value2, "zxname");
            return (Criteria) this;
        }
        
        //-------
        public Criteria andZxtypeIsNull() {
            addCriterion("ZXTYPE is null");
            return (Criteria) this;
        }

        public Criteria andZxtypeIsNotNull() {
            addCriterion("ZXTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andZxtypeEqualTo(String value) {
            addCriterion("ZXTYPE =", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeNotEqualTo(String value) {
            addCriterion("ZXTYPE <>", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeGreaterThan(String value) {
            addCriterion("ZXTYPE >", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ZXTYPE >=", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeLessThan(String value) {
            addCriterion("ZXTYPE <", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeLessThanOrEqualTo(String value) {
            addCriterion("ZXTYPE <=", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeLike(String value) {
            addCriterion("ZXTYPE like", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeNotLike(String value) {
            addCriterion("ZXTYPE not like", value, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeIn(List<String> values) {
            addCriterion("ZXTYPE in", values, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeNotIn(List<String> values) {
            addCriterion("ZXTYPE not in", values, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeBetween(String value1, String value2) {
            addCriterion("ZXTYPE between", value1, value2, "zxtype");
            return (Criteria) this;
        }

        public Criteria andZxtypeNotBetween(String value1, String value2) {
            addCriterion("ZXTYPE not between", value1, value2, "zxtype");
            return (Criteria) this;
        }
        //----

        public Criteria andZxdateIsNull() {
            addCriterion("ZXDATE is null");
            return (Criteria) this;
        }

        public Criteria andZxdateIsNotNull() {
            addCriterion("ZXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andZxdateEqualTo(String value) {
            addCriterion("ZXDATE =", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateNotEqualTo(String value) {
            addCriterion("ZXDATE <>", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateGreaterThan(String value) {
            addCriterion("ZXDATE >", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateGreaterThanOrEqualTo(String value) {
            addCriterion("ZXDATE >=", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateLessThan(String value) {
            addCriterion("ZXDATE <", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateLessThanOrEqualTo(String value) {
            addCriterion("ZXDATE <=", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateLike(String value) {
            addCriterion("ZXDATE like", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateNotLike(String value) {
            addCriterion("ZXDATE not like", value, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateIn(List<String> values) {
            addCriterion("ZXDATE in", values, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateNotIn(List<String> values) {
            addCriterion("ZXDATE not in", values, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateBetween(String value1, String value2) {
            addCriterion("ZXDATE between", value1, value2, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxdateNotBetween(String value1, String value2) {
            addCriterion("ZXDATE not between", value1, value2, "zxdate");
            return (Criteria) this;
        }

        public Criteria andZxkjIsNull() {
            addCriterion("ZXKJ is null");
            return (Criteria) this;
        }

        public Criteria andZxkjIsNotNull() {
            addCriterion("ZXKJ is not null");
            return (Criteria) this;
        }

        public Criteria andZxkjEqualTo(String value) {
            addCriterion("ZXKJ =", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjNotEqualTo(String value) {
            addCriterion("ZXKJ <>", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjGreaterThan(String value) {
            addCriterion("ZXKJ >", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjGreaterThanOrEqualTo(String value) {
            addCriterion("ZXKJ >=", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjLessThan(String value) {
            addCriterion("ZXKJ <", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjLessThanOrEqualTo(String value) {
            addCriterion("ZXKJ <=", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjLike(String value) {
            addCriterion("ZXKJ like", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjNotLike(String value) {
            addCriterion("ZXKJ not like", value, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjIn(List<String> values) {
            addCriterion("ZXKJ in", values, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjNotIn(List<String> values) {
            addCriterion("ZXKJ not in", values, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjBetween(String value1, String value2) {
            addCriterion("ZXKJ between", value1, value2, "zxkj");
            return (Criteria) this;
        }

        public Criteria andZxkjNotBetween(String value1, String value2) {
            addCriterion("ZXKJ not between", value1, value2, "zxkj");
            return (Criteria) this;
        }

        public Criteria andKjsjdIsNull() {
            addCriterion("KJSJD is null");
            return (Criteria) this;
        }

        public Criteria andKjsjdIsNotNull() {
            addCriterion("KJSJD is not null");
            return (Criteria) this;
        }

        public Criteria andKjsjdEqualTo(String value) {
            addCriterion("KJSJD =", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdNotEqualTo(String value) {
            addCriterion("KJSJD <>", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdGreaterThan(String value) {
            addCriterion("KJSJD >", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdGreaterThanOrEqualTo(String value) {
            addCriterion("KJSJD >=", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdLessThan(String value) {
            addCriterion("KJSJD <", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdLessThanOrEqualTo(String value) {
            addCriterion("KJSJD <=", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdLike(String value) {
            addCriterion("KJSJD like", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdNotLike(String value) {
            addCriterion("KJSJD not like", value, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdIn(List<String> values) {
            addCriterion("KJSJD in", values, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdNotIn(List<String> values) {
            addCriterion("KJSJD not in", values, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdBetween(String value1, String value2) {
            addCriterion("KJSJD between", value1, value2, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjsjdNotBetween(String value1, String value2) {
            addCriterion("KJSJD not between", value1, value2, "kjsjd");
            return (Criteria) this;
        }

        public Criteria andKjshcIsNull() {
            addCriterion("KJSHC is null");
            return (Criteria) this;
        }

        public Criteria andKjshcIsNotNull() {
            addCriterion("KJSHC is not null");
            return (Criteria) this;
        }

        public Criteria andKjshcEqualTo(String value) {
            addCriterion("KJSHC =", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcNotEqualTo(String value) {
            addCriterion("KJSHC <>", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcGreaterThan(String value) {
            addCriterion("KJSHC >", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcGreaterThanOrEqualTo(String value) {
            addCriterion("KJSHC >=", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcLessThan(String value) {
            addCriterion("KJSHC <", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcLessThanOrEqualTo(String value) {
            addCriterion("KJSHC <=", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcLike(String value) {
            addCriterion("KJSHC like", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcNotLike(String value) {
            addCriterion("KJSHC not like", value, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcIn(List<String> values) {
            addCriterion("KJSHC in", values, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcNotIn(List<String> values) {
            addCriterion("KJSHC not in", values, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcBetween(String value1, String value2) {
            addCriterion("KJSHC between", value1, value2, "kjshc");
            return (Criteria) this;
        }

        public Criteria andKjshcNotBetween(String value1, String value2) {
            addCriterion("KJSHC not between", value1, value2, "kjshc");
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