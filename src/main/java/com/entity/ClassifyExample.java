package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassifyExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassifynameIsNull() {
            addCriterion("classifyname is null");
            return (Criteria) this;
        }

        public Criteria andClassifynameIsNotNull() {
            addCriterion("classifyname is not null");
            return (Criteria) this;
        }

        public Criteria andClassifynameEqualTo(String value) {
            addCriterion("classifyname =", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameNotEqualTo(String value) {
            addCriterion("classifyname <>", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameGreaterThan(String value) {
            addCriterion("classifyname >", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameGreaterThanOrEqualTo(String value) {
            addCriterion("classifyname >=", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameLessThan(String value) {
            addCriterion("classifyname <", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameLessThanOrEqualTo(String value) {
            addCriterion("classifyname <=", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameLike(String value) {
            addCriterion("classifyname like", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameNotLike(String value) {
            addCriterion("classifyname not like", value, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameIn(List<String> values) {
            addCriterion("classifyname in", values, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameNotIn(List<String> values) {
            addCriterion("classifyname not in", values, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameBetween(String value1, String value2) {
            addCriterion("classifyname between", value1, value2, "classifyname");
            return (Criteria) this;
        }

        public Criteria andClassifynameNotBetween(String value1, String value2) {
            addCriterion("classifyname not between", value1, value2, "classifyname");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNull() {
            addCriterion("directionId is null");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNotNull() {
            addCriterion("directionId is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionidEqualTo(Integer value) {
            addCriterion("directionId =", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotEqualTo(Integer value) {
            addCriterion("directionId <>", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThan(Integer value) {
            addCriterion("directionId >", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("directionId >=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThan(Integer value) {
            addCriterion("directionId <", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThanOrEqualTo(Integer value) {
            addCriterion("directionId <=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidIn(List<Integer> values) {
            addCriterion("directionId in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotIn(List<Integer> values) {
            addCriterion("directionId not in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidBetween(Integer value1, Integer value2) {
            addCriterion("directionId between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("directionId not between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("studentnum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentnum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(Integer value) {
            addCriterion("studentnum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(Integer value) {
            addCriterion("studentnum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(Integer value) {
            addCriterion("studentnum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentnum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(Integer value) {
            addCriterion("studentnum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("studentnum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<Integer> values) {
            addCriterion("studentnum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<Integer> values) {
            addCriterion("studentnum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("studentnum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("studentnum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andFbtimeIsNull() {
            addCriterion("fbtime is null");
            return (Criteria) this;
        }

        public Criteria andFbtimeIsNotNull() {
            addCriterion("fbtime is not null");
            return (Criteria) this;
        }

        public Criteria andFbtimeEqualTo(String value) {
            addCriterion("fbtime =", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeNotEqualTo(String value) {
            addCriterion("fbtime <>", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeGreaterThan(String value) {
            addCriterion("fbtime >", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeGreaterThanOrEqualTo(String value) {
            addCriterion("fbtime >=", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeLessThan(String value) {
            addCriterion("fbtime <", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeLessThanOrEqualTo(String value) {
            addCriterion("fbtime <=", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeLike(String value) {
            addCriterion("fbtime like", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeNotLike(String value) {
            addCriterion("fbtime not like", value, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeIn(List<String> values) {
            addCriterion("fbtime in", values, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeNotIn(List<String> values) {
            addCriterion("fbtime not in", values, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeBetween(String value1, String value2) {
            addCriterion("fbtime between", value1, value2, "fbtime");
            return (Criteria) this;
        }

        public Criteria andFbtimeNotBetween(String value1, String value2) {
            addCriterion("fbtime not between", value1, value2, "fbtime");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andHrefIsNull() {
            addCriterion("href is null");
            return (Criteria) this;
        }

        public Criteria andHrefIsNotNull() {
            addCriterion("href is not null");
            return (Criteria) this;
        }

        public Criteria andHrefEqualTo(String value) {
            addCriterion("href =", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotEqualTo(String value) {
            addCriterion("href <>", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThan(String value) {
            addCriterion("href >", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThanOrEqualTo(String value) {
            addCriterion("href >=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThan(String value) {
            addCriterion("href <", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThanOrEqualTo(String value) {
            addCriterion("href <=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLike(String value) {
            addCriterion("href like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotLike(String value) {
            addCriterion("href not like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefIn(List<String> values) {
            addCriterion("href in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotIn(List<String> values) {
            addCriterion("href not in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefBetween(String value1, String value2) {
            addCriterion("href between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotBetween(String value1, String value2) {
            addCriterion("href not between", value1, value2, "href");
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