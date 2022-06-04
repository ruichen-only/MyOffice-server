package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class UserstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserstateExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUserStateIdIsNull() {
            addCriterion("UserStateId is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIsNotNull() {
            addCriterion("UserStateId is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateIdEqualTo(Integer value) {
            addCriterion("UserStateId =", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotEqualTo(Integer value) {
            addCriterion("UserStateId <>", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdGreaterThan(Integer value) {
            addCriterion("UserStateId >", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserStateId >=", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdLessThan(Integer value) {
            addCriterion("UserStateId <", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("UserStateId <=", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIn(List<Integer> values) {
            addCriterion("UserStateId in", values, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotIn(List<Integer> values) {
            addCriterion("UserStateId not in", values, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdBetween(Integer value1, Integer value2) {
            addCriterion("UserStateId between", value1, value2, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UserStateId not between", value1, value2, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateNameIsNull() {
            addCriterion("UserStateName is null");
            return (Criteria) this;
        }

        public Criteria andUserStateNameIsNotNull() {
            addCriterion("UserStateName is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateNameEqualTo(String value) {
            addCriterion("UserStateName =", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameNotEqualTo(String value) {
            addCriterion("UserStateName <>", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameGreaterThan(String value) {
            addCriterion("UserStateName >", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserStateName >=", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameLessThan(String value) {
            addCriterion("UserStateName <", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameLessThanOrEqualTo(String value) {
            addCriterion("UserStateName <=", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameLike(String value) {
            addCriterion("UserStateName like", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameNotLike(String value) {
            addCriterion("UserStateName not like", value, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameIn(List<String> values) {
            addCriterion("UserStateName in", values, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameNotIn(List<String> values) {
            addCriterion("UserStateName not in", values, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameBetween(String value1, String value2) {
            addCriterion("UserStateName between", value1, value2, "userStateName");
            return (Criteria) this;
        }

        public Criteria andUserStateNameNotBetween(String value1, String value2) {
            addCriterion("UserStateName not between", value1, value2, "userStateName");
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