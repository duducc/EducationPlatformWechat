package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_STUDENTS_GRADE
*表说明学员分数明细
  */
public class JxStudentsGradeSqlWhere extends JxStudentsGradeEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxStudentsGradeSqlWhere() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("STUDENTID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("STUDENTID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("STUDENTID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("STUDENTID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("STUDENTID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("STUDENTID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("STUDENTID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("STUDENTID like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("STUDENTID not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("STUDENTID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("STUDENTID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("STUDENTID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("STUDENTID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("STUDENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("STUDENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("STUDENTNAME =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("STUDENTNAME <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("STUDENTNAME >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTNAME >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("STUDENTNAME <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("STUDENTNAME <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("STUDENTNAME like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("STUDENTNAME not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("STUDENTNAME in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("STUDENTNAME not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("STUDENTNAME between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("STUDENTNAME not between", value1, value2, "studentname");
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

        public Criteria andJjfyyIsNull() {
            addCriterion("JJFYY is null");
            return (Criteria) this;
        }

        public Criteria andJjfyyIsNotNull() {
            addCriterion("JJFYY is not null");
            return (Criteria) this;
        }

        public Criteria andJjfyyEqualTo(String value) {
            addCriterion("JJFYY =", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyNotEqualTo(String value) {
            addCriterion("JJFYY <>", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyGreaterThan(String value) {
            addCriterion("JJFYY >", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyGreaterThanOrEqualTo(String value) {
            addCriterion("JJFYY >=", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyLessThan(String value) {
            addCriterion("JJFYY <", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyLessThanOrEqualTo(String value) {
            addCriterion("JJFYY <=", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyLike(String value) {
            addCriterion("JJFYY like", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyNotLike(String value) {
            addCriterion("JJFYY not like", value, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyIn(List<String> values) {
            addCriterion("JJFYY in", values, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyNotIn(List<String> values) {
            addCriterion("JJFYY not in", values, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyBetween(String value1, String value2) {
            addCriterion("JJFYY between", value1, value2, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andJjfyyNotBetween(String value1, String value2) {
            addCriterion("JJFYY not between", value1, value2, "jjfyy");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(BigDecimal value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(BigDecimal value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(BigDecimal value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(BigDecimal value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<BigDecimal> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<BigDecimal> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andJjfsjIsNull() {
            addCriterion("JJFSJ is null");
            return (Criteria) this;
        }

        public Criteria andJjfsjIsNotNull() {
            addCriterion("JJFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJjfsjEqualTo(Date value) {
            addCriterionForJDBCDate("JJFSJ =", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("JJFSJ <>", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjGreaterThan(Date value) {
            addCriterionForJDBCDate("JJFSJ >", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JJFSJ >=", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjLessThan(Date value) {
            addCriterionForJDBCDate("JJFSJ <", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JJFSJ <=", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjIn(List<Date> values) {
            addCriterionForJDBCDate("JJFSJ in", values, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("JJFSJ not in", values, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JJFSJ between", value1, value2, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JJFSJ not between", value1, value2, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjEqualTo(Timestamp value) {
            addCriterion("JJFSJ =", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjNotEqualTo(Timestamp value) {
            addCriterion("JJFSJ <>", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjGreaterThan(Timestamp value) {
            addCriterion("JJFSJ >", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("JJFSJ >=", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjLessThan(Timestamp value) {
            addCriterion("JJFSJ <", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("JJFSJ <=", value, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JJFSJ between", value1, value2, "jjfsj");
            return (Criteria) this;
        }

        public Criteria andJjfsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JJFSJ not between", value1, value2, "jjfsj");
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

        public Criteria andCrateidIsNull() {
            addCriterion("CRATEID is null");
            return (Criteria) this;
        }

        public Criteria andCrateidIsNotNull() {
            addCriterion("CRATEID is not null");
            return (Criteria) this;
        }

        public Criteria andCrateidEqualTo(String value) {
            addCriterion("CRATEID =", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidNotEqualTo(String value) {
            addCriterion("CRATEID <>", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidGreaterThan(String value) {
            addCriterion("CRATEID >", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidGreaterThanOrEqualTo(String value) {
            addCriterion("CRATEID >=", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidLessThan(String value) {
            addCriterion("CRATEID <", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidLessThanOrEqualTo(String value) {
            addCriterion("CRATEID <=", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidLike(String value) {
            addCriterion("CRATEID like", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidNotLike(String value) {
            addCriterion("CRATEID not like", value, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidIn(List<String> values) {
            addCriterion("CRATEID in", values, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidNotIn(List<String> values) {
            addCriterion("CRATEID not in", values, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidBetween(String value1, String value2) {
            addCriterion("CRATEID between", value1, value2, "crateid");
            return (Criteria) this;
        }

        public Criteria andCrateidNotBetween(String value1, String value2) {
            addCriterion("CRATEID not between", value1, value2, "crateid");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("CREATENAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("CREATENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("CREATENAME =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("CREATENAME <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("CREATENAME >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATENAME >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("CREATENAME <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("CREATENAME <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("CREATENAME like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("CREATENAME not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("CREATENAME in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("CREATENAME not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("CREATENAME between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("CREATENAME not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Timestamp value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Timestamp value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Timestamp value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Timestamp value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
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

        public Criteria andSybjIsNull() {
            addCriterion("SYBJ is null");
            return (Criteria) this;
        }

        public Criteria andSybjIsNotNull() {
            addCriterion("SYBJ is not null");
            return (Criteria) this;
        }

        public Criteria andSybjEqualTo(String value) {
            addCriterion("SYBJ =", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjNotEqualTo(String value) {
            addCriterion("SYBJ <>", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjGreaterThan(String value) {
            addCriterion("SYBJ >", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjGreaterThanOrEqualTo(String value) {
            addCriterion("SYBJ >=", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjLessThan(String value) {
            addCriterion("SYBJ <", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjLessThanOrEqualTo(String value) {
            addCriterion("SYBJ <=", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjLike(String value) {
            addCriterion("SYBJ like", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjNotLike(String value) {
            addCriterion("SYBJ not like", value, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjIn(List<String> values) {
            addCriterion("SYBJ in", values, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjNotIn(List<String> values) {
            addCriterion("SYBJ not in", values, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjBetween(String value1, String value2) {
            addCriterion("SYBJ between", value1, value2, "sybj");
            return (Criteria) this;
        }

        public Criteria andSybjNotBetween(String value1, String value2) {
            addCriterion("SYBJ not between", value1, value2, "sybj");
            return (Criteria) this;
        }

        public Criteria andZfyyIsNull() {
            addCriterion("ZFYY is null");
            return (Criteria) this;
        }

        public Criteria andZfyyIsNotNull() {
            addCriterion("ZFYY is not null");
            return (Criteria) this;
        }

        public Criteria andZfyyEqualTo(String value) {
            addCriterion("ZFYY =", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyNotEqualTo(String value) {
            addCriterion("ZFYY <>", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyGreaterThan(String value) {
            addCriterion("ZFYY >", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyGreaterThanOrEqualTo(String value) {
            addCriterion("ZFYY >=", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyLessThan(String value) {
            addCriterion("ZFYY <", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyLessThanOrEqualTo(String value) {
            addCriterion("ZFYY <=", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyLike(String value) {
            addCriterion("ZFYY like", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyNotLike(String value) {
            addCriterion("ZFYY not like", value, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyIn(List<String> values) {
            addCriterion("ZFYY in", values, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyNotIn(List<String> values) {
            addCriterion("ZFYY not in", values, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyBetween(String value1, String value2) {
            addCriterion("ZFYY between", value1, value2, "zfyy");
            return (Criteria) this;
        }

        public Criteria andZfyyNotBetween(String value1, String value2) {
            addCriterion("ZFYY not between", value1, value2, "zfyy");
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