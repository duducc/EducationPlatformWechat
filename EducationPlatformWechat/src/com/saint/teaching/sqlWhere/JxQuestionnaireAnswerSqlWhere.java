package com.saint.teaching.sqlWhere;

import com.saint.pub.plugin.Page;
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
*类注释信息
*表名JX_QUESTIONNAIRE_ANSWER
*表说明理论课签到
  */
public class JxQuestionnaireAnswerSqlWhere extends JxQuestionnaireAnswerEntity {
    private Page listPage;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JxQuestionnaireAnswerSqlWhere() {
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

        public Criteria andArrangexhIsNull() {
            addCriterion("ARRANGEXH is null");
            return (Criteria) this;
        }

        public Criteria andArrangexhIsNotNull() {
            addCriterion("ARRANGEXH is not null");
            return (Criteria) this;
        }

        public Criteria andArrangexhEqualTo(String value) {
            addCriterion("ARRANGEXH =", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotEqualTo(String value) {
            addCriterion("ARRANGEXH <>", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhGreaterThan(String value) {
            addCriterion("ARRANGEXH >", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGEXH >=", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhLessThan(String value) {
            addCriterion("ARRANGEXH <", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhLessThanOrEqualTo(String value) {
            addCriterion("ARRANGEXH <=", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhLike(String value) {
            addCriterion("ARRANGEXH like", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotLike(String value) {
            addCriterion("ARRANGEXH not like", value, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhIn(List<String> values) {
            addCriterion("ARRANGEXH in", values, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotIn(List<String> values) {
            addCriterion("ARRANGEXH not in", values, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhBetween(String value1, String value2) {
            addCriterion("ARRANGEXH between", value1, value2, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andArrangexhNotBetween(String value1, String value2) {
            addCriterion("ARRANGEXH not between", value1, value2, "arrangexh");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNull() {
            addCriterion("QUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("QUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(String value) {
            addCriterion("QUESTIONID =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(String value) {
            addCriterion("QUESTIONID <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(String value) {
            addCriterion("QUESTIONID >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONID >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(String value) {
            addCriterion("QUESTIONID <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(String value) {
            addCriterion("QUESTIONID <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLike(String value) {
            addCriterion("QUESTIONID like", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotLike(String value) {
            addCriterion("QUESTIONID not like", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<String> values) {
            addCriterion("QUESTIONID in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<String> values) {
            addCriterion("QUESTIONID not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(String value1, String value2) {
            addCriterion("QUESTIONID between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(String value1, String value2) {
            addCriterion("QUESTIONID not between", value1, value2, "questionid");
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

        public Criteria andSfdtIsNull() {
            addCriterion("SFDT is null");
            return (Criteria) this;
        }

        public Criteria andSfdtIsNotNull() {
            addCriterion("SFDT is not null");
            return (Criteria) this;
        }

        public Criteria andSfdtEqualTo(String value) {
            addCriterion("SFDT =", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtNotEqualTo(String value) {
            addCriterion("SFDT <>", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtGreaterThan(String value) {
            addCriterion("SFDT >", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtGreaterThanOrEqualTo(String value) {
            addCriterion("SFDT >=", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtLessThan(String value) {
            addCriterion("SFDT <", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtLessThanOrEqualTo(String value) {
            addCriterion("SFDT <=", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtLike(String value) {
            addCriterion("SFDT like", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtNotLike(String value) {
            addCriterion("SFDT not like", value, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtIn(List<String> values) {
            addCriterion("SFDT in", values, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtNotIn(List<String> values) {
            addCriterion("SFDT not in", values, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtBetween(String value1, String value2) {
            addCriterion("SFDT between", value1, value2, "sfdt");
            return (Criteria) this;
        }

        public Criteria andSfdtNotBetween(String value1, String value2) {
            addCriterion("SFDT not between", value1, value2, "sfdt");
            return (Criteria) this;
        }

        public Criteria andWjlbIsNull() {
            addCriterion("WJLB is null");
            return (Criteria) this;
        }

        public Criteria andWjlbIsNotNull() {
            addCriterion("WJLB is not null");
            return (Criteria) this;
        }

        public Criteria andWjlbEqualTo(String value) {
            addCriterion("WJLB =", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotEqualTo(String value) {
            addCriterion("WJLB <>", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbGreaterThan(String value) {
            addCriterion("WJLB >", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbGreaterThanOrEqualTo(String value) {
            addCriterion("WJLB >=", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbLessThan(String value) {
            addCriterion("WJLB <", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbLessThanOrEqualTo(String value) {
            addCriterion("WJLB <=", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbLike(String value) {
            addCriterion("WJLB like", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotLike(String value) {
            addCriterion("WJLB not like", value, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbIn(List<String> values) {
            addCriterion("WJLB in", values, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotIn(List<String> values) {
            addCriterion("WJLB not in", values, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbBetween(String value1, String value2) {
            addCriterion("WJLB between", value1, value2, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWjlbNotBetween(String value1, String value2) {
            addCriterion("WJLB not between", value1, value2, "wjlb");
            return (Criteria) this;
        }

        public Criteria andWtdaIsNull() {
            addCriterion("WTDA is null");
            return (Criteria) this;
        }

        public Criteria andWtdaIsNotNull() {
            addCriterion("WTDA is not null");
            return (Criteria) this;
        }

        public Criteria andWtdaEqualTo(String value) {
            addCriterion("WTDA =", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotEqualTo(String value) {
            addCriterion("WTDA <>", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaGreaterThan(String value) {
            addCriterion("WTDA >", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaGreaterThanOrEqualTo(String value) {
            addCriterion("WTDA >=", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaLessThan(String value) {
            addCriterion("WTDA <", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaLessThanOrEqualTo(String value) {
            addCriterion("WTDA <=", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaLike(String value) {
            addCriterion("WTDA like", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotLike(String value) {
            addCriterion("WTDA not like", value, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaIn(List<String> values) {
            addCriterion("WTDA in", values, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotIn(List<String> values) {
            addCriterion("WTDA not in", values, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaBetween(String value1, String value2) {
            addCriterion("WTDA between", value1, value2, "wtda");
            return (Criteria) this;
        }

        public Criteria andWtdaNotBetween(String value1, String value2) {
            addCriterion("WTDA not between", value1, value2, "wtda");
            return (Criteria) this;
        }

        public Criteria andDyfshIsNull() {
            addCriterion("DYFSH is null");
            return (Criteria) this;
        }

        public Criteria andDyfshIsNotNull() {
            addCriterion("DYFSH is not null");
            return (Criteria) this;
        }

        public Criteria andDyfshEqualTo(String value) {
            addCriterion("DYFSH =", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshNotEqualTo(String value) {
            addCriterion("DYFSH <>", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshGreaterThan(String value) {
            addCriterion("DYFSH >", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshGreaterThanOrEqualTo(String value) {
            addCriterion("DYFSH >=", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshLessThan(String value) {
            addCriterion("DYFSH <", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshLessThanOrEqualTo(String value) {
            addCriterion("DYFSH <=", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshLike(String value) {
            addCriterion("DYFSH like", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshNotLike(String value) {
            addCriterion("DYFSH not like", value, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshIn(List<String> values) {
            addCriterion("DYFSH in", values, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshNotIn(List<String> values) {
            addCriterion("DYFSH not in", values, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshBetween(String value1, String value2) {
            addCriterion("DYFSH between", value1, value2, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andDyfshNotBetween(String value1, String value2) {
            addCriterion("DYFSH not between", value1, value2, "dyfsh");
            return (Criteria) this;
        }

        public Criteria andSfzqIsNull() {
            addCriterion("SFZQ is null");
            return (Criteria) this;
        }

        public Criteria andSfzqIsNotNull() {
            addCriterion("SFZQ is not null");
            return (Criteria) this;
        }

        public Criteria andSfzqEqualTo(String value) {
            addCriterion("SFZQ =", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqNotEqualTo(String value) {
            addCriterion("SFZQ <>", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqGreaterThan(String value) {
            addCriterion("SFZQ >", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqGreaterThanOrEqualTo(String value) {
            addCriterion("SFZQ >=", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqLessThan(String value) {
            addCriterion("SFZQ <", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqLessThanOrEqualTo(String value) {
            addCriterion("SFZQ <=", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqLike(String value) {
            addCriterion("SFZQ like", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqNotLike(String value) {
            addCriterion("SFZQ not like", value, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqIn(List<String> values) {
            addCriterion("SFZQ in", values, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqNotIn(List<String> values) {
            addCriterion("SFZQ not in", values, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqBetween(String value1, String value2) {
            addCriterion("SFZQ between", value1, value2, "sfzq");
            return (Criteria) this;
        }

        public Criteria andSfzqNotBetween(String value1, String value2) {
            addCriterion("SFZQ not between", value1, value2, "sfzq");
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