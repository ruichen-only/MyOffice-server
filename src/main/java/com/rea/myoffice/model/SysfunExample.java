package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class SysfunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysfunExample() {
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

        public Criteria andNodeIdIsNull() {
            addCriterion("NodeId is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NodeId is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Integer value) {
            addCriterion("NodeId =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Integer value) {
            addCriterion("NodeId <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Integer value) {
            addCriterion("NodeId >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NodeId >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Integer value) {
            addCriterion("NodeId <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("NodeId <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Integer> values) {
            addCriterion("NodeId in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Integer> values) {
            addCriterion("NodeId not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Integer value1, Integer value2) {
            addCriterion("NodeId between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NodeId not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("DisplayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("DisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("DisplayName =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("DisplayName <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("DisplayName >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayName >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("DisplayName <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("DisplayName <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("DisplayName like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("DisplayName not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("DisplayName in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("DisplayName not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("DisplayName between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("DisplayName not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andNodeURLIsNull() {
            addCriterion("NodeURL is null");
            return (Criteria) this;
        }

        public Criteria andNodeURLIsNotNull() {
            addCriterion("NodeURL is not null");
            return (Criteria) this;
        }

        public Criteria andNodeURLEqualTo(String value) {
            addCriterion("NodeURL =", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLNotEqualTo(String value) {
            addCriterion("NodeURL <>", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLGreaterThan(String value) {
            addCriterion("NodeURL >", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLGreaterThanOrEqualTo(String value) {
            addCriterion("NodeURL >=", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLLessThan(String value) {
            addCriterion("NodeURL <", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLLessThanOrEqualTo(String value) {
            addCriterion("NodeURL <=", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLLike(String value) {
            addCriterion("NodeURL like", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLNotLike(String value) {
            addCriterion("NodeURL not like", value, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLIn(List<String> values) {
            addCriterion("NodeURL in", values, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLNotIn(List<String> values) {
            addCriterion("NodeURL not in", values, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLBetween(String value1, String value2) {
            addCriterion("NodeURL between", value1, value2, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andNodeURLNotBetween(String value1, String value2) {
            addCriterion("NodeURL not between", value1, value2, "nodeURL");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("DisplayOrder is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("DisplayOrder is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Integer value) {
            addCriterion("DisplayOrder =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Integer value) {
            addCriterion("DisplayOrder <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Integer value) {
            addCriterion("DisplayOrder >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisplayOrder >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Integer value) {
            addCriterion("DisplayOrder <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("DisplayOrder <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Integer> values) {
            addCriterion("DisplayOrder in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Integer> values) {
            addCriterion("DisplayOrder not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("DisplayOrder between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("DisplayOrder not between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdIsNull() {
            addCriterion("ParentNodeId is null");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdIsNotNull() {
            addCriterion("ParentNodeId is not null");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdEqualTo(Integer value) {
            addCriterion("ParentNodeId =", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotEqualTo(Integer value) {
            addCriterion("ParentNodeId <>", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdGreaterThan(Integer value) {
            addCriterion("ParentNodeId >", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentNodeId >=", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdLessThan(Integer value) {
            addCriterion("ParentNodeId <", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ParentNodeId <=", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdIn(List<Integer> values) {
            addCriterion("ParentNodeId in", values, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotIn(List<Integer> values) {
            addCriterion("ParentNodeId not in", values, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdBetween(Integer value1, Integer value2) {
            addCriterion("ParentNodeId between", value1, value2, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentNodeId not between", value1, value2, "parentNodeId");
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