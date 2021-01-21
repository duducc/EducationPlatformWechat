package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxGraduateDabianEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_GRADUATE_DABIAN
*表说明研究生答辩申报
  */
public class JxGraduateDabianSqlWhere extends JxGraduateDabianEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxGraduateDabianSqlWhere() {
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

        public Criteria andStutelIsNull() {
            addCriterion("STUTEL is null");
            return (Criteria) this;
        }

        public Criteria andStutelIsNotNull() {
            addCriterion("STUTEL is not null");
            return (Criteria) this;
        }

        public Criteria andStutelEqualTo(String value) {
            addCriterion("STUTEL =", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotEqualTo(String value) {
            addCriterion("STUTEL <>", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelGreaterThan(String value) {
            addCriterion("STUTEL >", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelGreaterThanOrEqualTo(String value) {
            addCriterion("STUTEL >=", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLessThan(String value) {
            addCriterion("STUTEL <", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLessThanOrEqualTo(String value) {
            addCriterion("STUTEL <=", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLike(String value) {
            addCriterion("STUTEL like", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotLike(String value) {
            addCriterion("STUTEL not like", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelIn(List<String> values) {
            addCriterion("STUTEL in", values, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotIn(List<String> values) {
            addCriterion("STUTEL not in", values, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelBetween(String value1, String value2) {
            addCriterion("STUTEL between", value1, value2, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotBetween(String value1, String value2) {
            addCriterion("STUTEL not between", value1, value2, "stutel");
            return (Criteria) this;
        }

        public Criteria andStuschoolidIsNull() {
            addCriterion("STUSCHOOLID is null");
            return (Criteria) this;
        }

        public Criteria andStuschoolidIsNotNull() {
            addCriterion("STUSCHOOLID is not null");
            return (Criteria) this;
        }

        public Criteria andStuschoolidEqualTo(String value) {
            addCriterion("STUSCHOOLID =", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotEqualTo(String value) {
            addCriterion("STUSCHOOLID <>", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidGreaterThan(String value) {
            addCriterion("STUSCHOOLID >", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidGreaterThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLID >=", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidLessThan(String value) {
            addCriterion("STUSCHOOLID <", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidLessThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLID <=", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidLike(String value) {
            addCriterion("STUSCHOOLID like", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotLike(String value) {
            addCriterion("STUSCHOOLID not like", value, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidIn(List<String> values) {
            addCriterion("STUSCHOOLID in", values, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotIn(List<String> values) {
            addCriterion("STUSCHOOLID not in", values, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidBetween(String value1, String value2) {
            addCriterion("STUSCHOOLID between", value1, value2, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolidNotBetween(String value1, String value2) {
            addCriterion("STUSCHOOLID not between", value1, value2, "stuschoolid");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameIsNull() {
            addCriterion("STUSCHOOLNAME is null");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameIsNotNull() {
            addCriterion("STUSCHOOLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameEqualTo(String value) {
            addCriterion("STUSCHOOLNAME =", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotEqualTo(String value) {
            addCriterion("STUSCHOOLNAME <>", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameGreaterThan(String value) {
            addCriterion("STUSCHOOLNAME >", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLNAME >=", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameLessThan(String value) {
            addCriterion("STUSCHOOLNAME <", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameLessThanOrEqualTo(String value) {
            addCriterion("STUSCHOOLNAME <=", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameLike(String value) {
            addCriterion("STUSCHOOLNAME like", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotLike(String value) {
            addCriterion("STUSCHOOLNAME not like", value, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameIn(List<String> values) {
            addCriterion("STUSCHOOLNAME in", values, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotIn(List<String> values) {
            addCriterion("STUSCHOOLNAME not in", values, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameBetween(String value1, String value2) {
            addCriterion("STUSCHOOLNAME between", value1, value2, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andStuschoolnameNotBetween(String value1, String value2) {
            addCriterion("STUSCHOOLNAME not between", value1, value2, "stuschoolname");
            return (Criteria) this;
        }

        public Criteria andCollageidIsNull() {
            addCriterion("COLLAGEID is null");
            return (Criteria) this;
        }

        public Criteria andCollageidIsNotNull() {
            addCriterion("COLLAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andCollageidEqualTo(String value) {
            addCriterion("COLLAGEID =", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidNotEqualTo(String value) {
            addCriterion("COLLAGEID <>", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidGreaterThan(String value) {
            addCriterion("COLLAGEID >", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidGreaterThanOrEqualTo(String value) {
            addCriterion("COLLAGEID >=", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidLessThan(String value) {
            addCriterion("COLLAGEID <", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidLessThanOrEqualTo(String value) {
            addCriterion("COLLAGEID <=", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidLike(String value) {
            addCriterion("COLLAGEID like", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidNotLike(String value) {
            addCriterion("COLLAGEID not like", value, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidIn(List<String> values) {
            addCriterion("COLLAGEID in", values, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidNotIn(List<String> values) {
            addCriterion("COLLAGEID not in", values, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidBetween(String value1, String value2) {
            addCriterion("COLLAGEID between", value1, value2, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollageidNotBetween(String value1, String value2) {
            addCriterion("COLLAGEID not between", value1, value2, "collageid");
            return (Criteria) this;
        }

        public Criteria andCollagenameIsNull() {
            addCriterion("COLLAGENAME is null");
            return (Criteria) this;
        }

        public Criteria andCollagenameIsNotNull() {
            addCriterion("COLLAGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCollagenameEqualTo(String value) {
            addCriterion("COLLAGENAME =", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameNotEqualTo(String value) {
            addCriterion("COLLAGENAME <>", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameGreaterThan(String value) {
            addCriterion("COLLAGENAME >", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameGreaterThanOrEqualTo(String value) {
            addCriterion("COLLAGENAME >=", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameLessThan(String value) {
            addCriterion("COLLAGENAME <", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameLessThanOrEqualTo(String value) {
            addCriterion("COLLAGENAME <=", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameLike(String value) {
            addCriterion("COLLAGENAME like", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameNotLike(String value) {
            addCriterion("COLLAGENAME not like", value, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameIn(List<String> values) {
            addCriterion("COLLAGENAME in", values, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameNotIn(List<String> values) {
            addCriterion("COLLAGENAME not in", values, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameBetween(String value1, String value2) {
            addCriterion("COLLAGENAME between", value1, value2, "collagename");
            return (Criteria) this;
        }

        public Criteria andCollagenameNotBetween(String value1, String value2) {
            addCriterion("COLLAGENAME not between", value1, value2, "collagename");
            return (Criteria) this;
        }

        public Criteria andStugradeIsNull() {
            addCriterion("STUGRADE is null");
            return (Criteria) this;
        }

        public Criteria andStugradeIsNotNull() {
            addCriterion("STUGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andStugradeEqualTo(String value) {
            addCriterion("STUGRADE =", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotEqualTo(String value) {
            addCriterion("STUGRADE <>", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeGreaterThan(String value) {
            addCriterion("STUGRADE >", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeGreaterThanOrEqualTo(String value) {
            addCriterion("STUGRADE >=", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLessThan(String value) {
            addCriterion("STUGRADE <", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLessThanOrEqualTo(String value) {
            addCriterion("STUGRADE <=", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLike(String value) {
            addCriterion("STUGRADE like", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotLike(String value) {
            addCriterion("STUGRADE not like", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeIn(List<String> values) {
            addCriterion("STUGRADE in", values, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotIn(List<String> values) {
            addCriterion("STUGRADE not in", values, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeBetween(String value1, String value2) {
            addCriterion("STUGRADE between", value1, value2, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotBetween(String value1, String value2) {
            addCriterion("STUGRADE not between", value1, value2, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStuprofessidIsNull() {
            addCriterion("STUPROFESSID is null");
            return (Criteria) this;
        }

        public Criteria andStuprofessidIsNotNull() {
            addCriterion("STUPROFESSID is not null");
            return (Criteria) this;
        }

        public Criteria andStuprofessidEqualTo(String value) {
            addCriterion("STUPROFESSID =", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidNotEqualTo(String value) {
            addCriterion("STUPROFESSID <>", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidGreaterThan(String value) {
            addCriterion("STUPROFESSID >", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidGreaterThanOrEqualTo(String value) {
            addCriterion("STUPROFESSID >=", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidLessThan(String value) {
            addCriterion("STUPROFESSID <", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidLessThanOrEqualTo(String value) {
            addCriterion("STUPROFESSID <=", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidLike(String value) {
            addCriterion("STUPROFESSID like", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidNotLike(String value) {
            addCriterion("STUPROFESSID not like", value, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidIn(List<String> values) {
            addCriterion("STUPROFESSID in", values, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidNotIn(List<String> values) {
            addCriterion("STUPROFESSID not in", values, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidBetween(String value1, String value2) {
            addCriterion("STUPROFESSID between", value1, value2, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessidNotBetween(String value1, String value2) {
            addCriterion("STUPROFESSID not between", value1, value2, "stuprofessid");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameIsNull() {
            addCriterion("STUPROFESSNAME is null");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameIsNotNull() {
            addCriterion("STUPROFESSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameEqualTo(String value) {
            addCriterion("STUPROFESSNAME =", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameNotEqualTo(String value) {
            addCriterion("STUPROFESSNAME <>", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameGreaterThan(String value) {
            addCriterion("STUPROFESSNAME >", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameGreaterThanOrEqualTo(String value) {
            addCriterion("STUPROFESSNAME >=", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameLessThan(String value) {
            addCriterion("STUPROFESSNAME <", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameLessThanOrEqualTo(String value) {
            addCriterion("STUPROFESSNAME <=", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameLike(String value) {
            addCriterion("STUPROFESSNAME like", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameNotLike(String value) {
            addCriterion("STUPROFESSNAME not like", value, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameIn(List<String> values) {
            addCriterion("STUPROFESSNAME in", values, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameNotIn(List<String> values) {
            addCriterion("STUPROFESSNAME not in", values, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameBetween(String value1, String value2) {
            addCriterion("STUPROFESSNAME between", value1, value2, "stuprofessname");
            return (Criteria) this;
        }

        public Criteria andStuprofessnameNotBetween(String value1, String value2) {
            addCriterion("STUPROFESSNAME not between", value1, value2, "stuprofessname");
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

        public Criteria andTeacherdeptidIsNull() {
            addCriterion("TEACHERDEPTID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidIsNotNull() {
            addCriterion("TEACHERDEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidEqualTo(String value) {
            addCriterion("TEACHERDEPTID =", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidNotEqualTo(String value) {
            addCriterion("TEACHERDEPTID <>", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidGreaterThan(String value) {
            addCriterion("TEACHERDEPTID >", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERDEPTID >=", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidLessThan(String value) {
            addCriterion("TEACHERDEPTID <", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidLessThanOrEqualTo(String value) {
            addCriterion("TEACHERDEPTID <=", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidLike(String value) {
            addCriterion("TEACHERDEPTID like", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidNotLike(String value) {
            addCriterion("TEACHERDEPTID not like", value, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidIn(List<String> values) {
            addCriterion("TEACHERDEPTID in", values, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidNotIn(List<String> values) {
            addCriterion("TEACHERDEPTID not in", values, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidBetween(String value1, String value2) {
            addCriterion("TEACHERDEPTID between", value1, value2, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptidNotBetween(String value1, String value2) {
            addCriterion("TEACHERDEPTID not between", value1, value2, "teacherdeptid");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameIsNull() {
            addCriterion("TEACHERDEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameIsNotNull() {
            addCriterion("TEACHERDEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameEqualTo(String value) {
            addCriterion("TEACHERDEPTNAME =", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameNotEqualTo(String value) {
            addCriterion("TEACHERDEPTNAME <>", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameGreaterThan(String value) {
            addCriterion("TEACHERDEPTNAME >", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERDEPTNAME >=", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameLessThan(String value) {
            addCriterion("TEACHERDEPTNAME <", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameLessThanOrEqualTo(String value) {
            addCriterion("TEACHERDEPTNAME <=", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameLike(String value) {
            addCriterion("TEACHERDEPTNAME like", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameNotLike(String value) {
            addCriterion("TEACHERDEPTNAME not like", value, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameIn(List<String> values) {
            addCriterion("TEACHERDEPTNAME in", values, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameNotIn(List<String> values) {
            addCriterion("TEACHERDEPTNAME not in", values, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameBetween(String value1, String value2) {
            addCriterion("TEACHERDEPTNAME between", value1, value2, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andTeacherdeptnameNotBetween(String value1, String value2) {
            addCriterion("TEACHERDEPTNAME not between", value1, value2, "teacherdeptname");
            return (Criteria) this;
        }

        public Criteria andDbdateIsNull() {
            addCriterion("DBDATE is null");
            return (Criteria) this;
        }

        public Criteria andDbdateIsNotNull() {
            addCriterion("DBDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDbdateEqualTo(Date value) {
            addCriterionForJDBCDate("DBDATE =", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DBDATE <>", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("DBDATE >", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DBDATE >=", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateLessThan(Date value) {
            addCriterionForJDBCDate("DBDATE <", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DBDATE <=", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateIn(List<Date> values) {
            addCriterionForJDBCDate("DBDATE in", values, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DBDATE not in", values, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DBDATE between", value1, value2, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DBDATE not between", value1, value2, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateEqualTo(Timestamp value) {
            addCriterion("DBDATE =", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotEqualTo(Timestamp value) {
            addCriterion("DBDATE <>", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateGreaterThan(Timestamp value) {
            addCriterion("DBDATE >", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DBDATE >=", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateLessThan(Timestamp value) {
            addCriterion("DBDATE <", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateLessThanOrEqualTo(Timestamp value) {
            addCriterion("DBDATE <=", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DBDATE between", value1, value2, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DBDATE not between", value1, value2, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbpositionIsNull() {
            addCriterion("DBPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andDbpositionIsNotNull() {
            addCriterion("DBPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andDbpositionEqualTo(String value) {
            addCriterion("DBPOSITION =", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionNotEqualTo(String value) {
            addCriterion("DBPOSITION <>", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionGreaterThan(String value) {
            addCriterion("DBPOSITION >", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionGreaterThanOrEqualTo(String value) {
            addCriterion("DBPOSITION >=", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionLessThan(String value) {
            addCriterion("DBPOSITION <", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionLessThanOrEqualTo(String value) {
            addCriterion("DBPOSITION <=", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionLike(String value) {
            addCriterion("DBPOSITION like", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionNotLike(String value) {
            addCriterion("DBPOSITION not like", value, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionIn(List<String> values) {
            addCriterion("DBPOSITION in", values, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionNotIn(List<String> values) {
            addCriterion("DBPOSITION not in", values, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionBetween(String value1, String value2) {
            addCriterion("DBPOSITION between", value1, value2, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbpositionNotBetween(String value1, String value2) {
            addCriterion("DBPOSITION not between", value1, value2, "dbposition");
            return (Criteria) this;
        }

        public Criteria andDbtopicIsNull() {
            addCriterion("DBTOPIC is null");
            return (Criteria) this;
        }

        public Criteria andDbtopicIsNotNull() {
            addCriterion("DBTOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andDbtopicEqualTo(String value) {
            addCriterion("DBTOPIC =", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicNotEqualTo(String value) {
            addCriterion("DBTOPIC <>", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicGreaterThan(String value) {
            addCriterion("DBTOPIC >", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicGreaterThanOrEqualTo(String value) {
            addCriterion("DBTOPIC >=", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicLessThan(String value) {
            addCriterion("DBTOPIC <", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicLessThanOrEqualTo(String value) {
            addCriterion("DBTOPIC <=", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicLike(String value) {
            addCriterion("DBTOPIC like", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicNotLike(String value) {
            addCriterion("DBTOPIC not like", value, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicIn(List<String> values) {
            addCriterion("DBTOPIC in", values, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicNotIn(List<String> values) {
            addCriterion("DBTOPIC not in", values, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicBetween(String value1, String value2) {
            addCriterion("DBTOPIC between", value1, value2, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andDbtopicNotBetween(String value1, String value2) {
            addCriterion("DBTOPIC not between", value1, value2, "dbtopic");
            return (Criteria) this;
        }

        public Criteria andFjljIsNull() {
            addCriterion("FJLJ is null");
            return (Criteria) this;
        }

        public Criteria andFjljIsNotNull() {
            addCriterion("FJLJ is not null");
            return (Criteria) this;
        }

        public Criteria andFjljEqualTo(String value) {
            addCriterion("FJLJ =", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotEqualTo(String value) {
            addCriterion("FJLJ <>", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljGreaterThan(String value) {
            addCriterion("FJLJ >", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljGreaterThanOrEqualTo(String value) {
            addCriterion("FJLJ >=", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljLessThan(String value) {
            addCriterion("FJLJ <", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljLessThanOrEqualTo(String value) {
            addCriterion("FJLJ <=", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljLike(String value) {
            addCriterion("FJLJ like", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotLike(String value) {
            addCriterion("FJLJ not like", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljIn(List<String> values) {
            addCriterion("FJLJ in", values, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotIn(List<String> values) {
            addCriterion("FJLJ not in", values, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljBetween(String value1, String value2) {
            addCriterion("FJLJ between", value1, value2, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotBetween(String value1, String value2) {
            addCriterion("FJLJ not between", value1, value2, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNull() {
            addCriterion("FJNAME is null");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNotNull() {
            addCriterion("FJNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFjnameEqualTo(String value) {
            addCriterion("FJNAME =", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotEqualTo(String value) {
            addCriterion("FJNAME <>", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThan(String value) {
            addCriterion("FJNAME >", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThanOrEqualTo(String value) {
            addCriterion("FJNAME >=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThan(String value) {
            addCriterion("FJNAME <", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThanOrEqualTo(String value) {
            addCriterion("FJNAME <=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLike(String value) {
            addCriterion("FJNAME like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotLike(String value) {
            addCriterion("FJNAME not like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameIn(List<String> values) {
            addCriterion("FJNAME in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotIn(List<String> values) {
            addCriterion("FJNAME not in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameBetween(String value1, String value2) {
            addCriterion("FJNAME between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotBetween(String value1, String value2) {
            addCriterion("FJNAME not between", value1, value2, "fjname");
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

        public Criteria andDbstIsNull() {
            addCriterion("DBST is null");
            return (Criteria) this;
        }

        public Criteria andDbstIsNotNull() {
            addCriterion("DBST is not null");
            return (Criteria) this;
        }

        public Criteria andDbstEqualTo(String value) {
            addCriterion("DBST =", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstNotEqualTo(String value) {
            addCriterion("DBST <>", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstGreaterThan(String value) {
            addCriterion("DBST >", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstGreaterThanOrEqualTo(String value) {
            addCriterion("DBST >=", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstLessThan(String value) {
            addCriterion("DBST <", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstLessThanOrEqualTo(String value) {
            addCriterion("DBST <=", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstLike(String value) {
            addCriterion("DBST like", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstNotLike(String value) {
            addCriterion("DBST not like", value, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstIn(List<String> values) {
            addCriterion("DBST in", values, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstNotIn(List<String> values) {
            addCriterion("DBST not in", values, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstBetween(String value1, String value2) {
            addCriterion("DBST between", value1, value2, "dbst");
            return (Criteria) this;
        }

        public Criteria andDbstNotBetween(String value1, String value2) {
            addCriterion("DBST not between", value1, value2, "dbst");
            return (Criteria) this;
        }

        public Criteria andShstateIsNull() {
            addCriterion("SHSTATE is null");
            return (Criteria) this;
        }

        public Criteria andShstateIsNotNull() {
            addCriterion("SHSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andShstateEqualTo(String value) {
            addCriterion("SHSTATE =", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotEqualTo(String value) {
            addCriterion("SHSTATE <>", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateGreaterThan(String value) {
            addCriterion("SHSTATE >", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateGreaterThanOrEqualTo(String value) {
            addCriterion("SHSTATE >=", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLessThan(String value) {
            addCriterion("SHSTATE <", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLessThanOrEqualTo(String value) {
            addCriterion("SHSTATE <=", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLike(String value) {
            addCriterion("SHSTATE like", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotLike(String value) {
            addCriterion("SHSTATE not like", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateIn(List<String> values) {
            addCriterion("SHSTATE in", values, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotIn(List<String> values) {
            addCriterion("SHSTATE not in", values, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateBetween(String value1, String value2) {
            addCriterion("SHSTATE between", value1, value2, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotBetween(String value1, String value2) {
            addCriterion("SHSTATE not between", value1, value2, "shstate");
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

        public Criteria andShrnameIsNull() {
            addCriterion("SHRNAME is null");
            return (Criteria) this;
        }

        public Criteria andShrnameIsNotNull() {
            addCriterion("SHRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShrnameEqualTo(String value) {
            addCriterion("SHRNAME =", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameNotEqualTo(String value) {
            addCriterion("SHRNAME <>", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameGreaterThan(String value) {
            addCriterion("SHRNAME >", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHRNAME >=", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameLessThan(String value) {
            addCriterion("SHRNAME <", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameLessThanOrEqualTo(String value) {
            addCriterion("SHRNAME <=", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameLike(String value) {
            addCriterion("SHRNAME like", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameNotLike(String value) {
            addCriterion("SHRNAME not like", value, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameIn(List<String> values) {
            addCriterion("SHRNAME in", values, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameNotIn(List<String> values) {
            addCriterion("SHRNAME not in", values, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameBetween(String value1, String value2) {
            addCriterion("SHRNAME between", value1, value2, "shrname");
            return (Criteria) this;
        }

        public Criteria andShrnameNotBetween(String value1, String value2) {
            addCriterion("SHRNAME not between", value1, value2, "shrname");
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

        public Criteria andShtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SHTIME =", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SHTIME <>", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SHTIME >", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHTIME >=", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLessThan(Date value) {
            addCriterionForJDBCDate("SHTIME <", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHTIME <=", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SHTIME in", values, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SHTIME not in", values, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHTIME between", value1, value2, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHTIME not between", value1, value2, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeEqualTo(Timestamp value) {
            addCriterion("SHTIME =", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotEqualTo(Timestamp value) {
            addCriterion("SHTIME <>", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeGreaterThan(Timestamp value) {
            addCriterion("SHTIME >", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SHTIME >=", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLessThan(Timestamp value) {
            addCriterion("SHTIME <", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("SHTIME <=", value, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SHTIME between", value1, value2, "shtime");
            return (Criteria) this;
        }

        public Criteria andShtimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SHTIME not between", value1, value2, "shtime");
            return (Criteria) this;
        }

        public Criteria andShyjIsNull() {
            addCriterion("SHYJ is null");
            return (Criteria) this;
        }

        public Criteria andShyjIsNotNull() {
            addCriterion("SHYJ is not null");
            return (Criteria) this;
        }

        public Criteria andShyjEqualTo(String value) {
            addCriterion("SHYJ =", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotEqualTo(String value) {
            addCriterion("SHYJ <>", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThan(String value) {
            addCriterion("SHYJ >", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThanOrEqualTo(String value) {
            addCriterion("SHYJ >=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThan(String value) {
            addCriterion("SHYJ <", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThanOrEqualTo(String value) {
            addCriterion("SHYJ <=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLike(String value) {
            addCriterion("SHYJ like", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotLike(String value) {
            addCriterion("SHYJ not like", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjIn(List<String> values) {
            addCriterion("SHYJ in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotIn(List<String> values) {
            addCriterion("SHYJ not in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjBetween(String value1, String value2) {
            addCriterion("SHYJ between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotBetween(String value1, String value2) {
            addCriterion("SHYJ not between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andRemindstIsNull() {
            addCriterion("REMINDST is null");
            return (Criteria) this;
        }

        public Criteria andRemindstIsNotNull() {
            addCriterion("REMINDST is not null");
            return (Criteria) this;
        }

        public Criteria andRemindstEqualTo(String value) {
            addCriterion("REMINDST =", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstNotEqualTo(String value) {
            addCriterion("REMINDST <>", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstGreaterThan(String value) {
            addCriterion("REMINDST >", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstGreaterThanOrEqualTo(String value) {
            addCriterion("REMINDST >=", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstLessThan(String value) {
            addCriterion("REMINDST <", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstLessThanOrEqualTo(String value) {
            addCriterion("REMINDST <=", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstLike(String value) {
            addCriterion("REMINDST like", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstNotLike(String value) {
            addCriterion("REMINDST not like", value, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstIn(List<String> values) {
            addCriterion("REMINDST in", values, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstNotIn(List<String> values) {
            addCriterion("REMINDST not in", values, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstBetween(String value1, String value2) {
            addCriterion("REMINDST between", value1, value2, "remindst");
            return (Criteria) this;
        }

        public Criteria andRemindstNotBetween(String value1, String value2) {
            addCriterion("REMINDST not between", value1, value2, "remindst");
            return (Criteria) this;
        }

        public Criteria andReminddateIsNull() {
            addCriterion("REMINDDATE is null");
            return (Criteria) this;
        }

        public Criteria andReminddateIsNotNull() {
            addCriterion("REMINDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReminddateEqualTo(Date value) {
            addCriterionForJDBCDate("REMINDDATE =", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REMINDDATE <>", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateGreaterThan(Date value) {
            addCriterionForJDBCDate("REMINDDATE >", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REMINDDATE >=", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateLessThan(Date value) {
            addCriterionForJDBCDate("REMINDDATE <", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REMINDDATE <=", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateIn(List<Date> values) {
            addCriterionForJDBCDate("REMINDDATE in", values, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REMINDDATE not in", values, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REMINDDATE between", value1, value2, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REMINDDATE not between", value1, value2, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateEqualTo(Timestamp value) {
            addCriterion("REMINDDATE =", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateNotEqualTo(Timestamp value) {
            addCriterion("REMINDDATE <>", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateGreaterThan(Timestamp value) {
            addCriterion("REMINDDATE >", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("REMINDDATE >=", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateLessThan(Timestamp value) {
            addCriterion("REMINDDATE <", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateLessThanOrEqualTo(Timestamp value) {
            addCriterion("REMINDDATE <=", value, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REMINDDATE between", value1, value2, "reminddate");
            return (Criteria) this;
        }

        public Criteria andReminddateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REMINDDATE not between", value1, value2, "reminddate");
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