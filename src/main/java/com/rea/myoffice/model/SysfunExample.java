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

        public Criteria andNodeidIsNull() {
            addCriterion("NodeId is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NodeId is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(Integer value) {
            addCriterion("NodeId =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(Integer value) {
            addCriterion("NodeId <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(Integer value) {
            addCriterion("NodeId >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NodeId >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(Integer value) {
            addCriterion("NodeId <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(Integer value) {
            addCriterion("NodeId <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<Integer> values) {
            addCriterion("NodeId in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<Integer> values) {
            addCriterion("NodeId not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(Integer value1, Integer value2) {
            addCriterion("NodeId between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("NodeId not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("DisplayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("DisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("DisplayName =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("DisplayName <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("DisplayName >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayName >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("DisplayName <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("DisplayName <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("DisplayName like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("DisplayName not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("DisplayName in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("DisplayName not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("DisplayName between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("DisplayName not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andNodeurlIsNull() {
            addCriterion("NodeURL is null");
            return (Criteria) this;
        }

        public Criteria andNodeurlIsNotNull() {
            addCriterion("NodeURL is not null");
            return (Criteria) this;
        }

        public Criteria andNodeurlEqualTo(String value) {
            addCriterion("NodeURL =", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlNotEqualTo(String value) {
            addCriterion("NodeURL <>", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlGreaterThan(String value) {
            addCriterion("NodeURL >", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlGreaterThanOrEqualTo(String value) {
            addCriterion("NodeURL >=", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlLessThan(String value) {
            addCriterion("NodeURL <", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlLessThanOrEqualTo(String value) {
            addCriterion("NodeURL <=", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlLike(String value) {
            addCriterion("NodeURL like", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlNotLike(String value) {
            addCriterion("NodeURL not like", value, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlIn(List<String> values) {
            addCriterion("NodeURL in", values, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlNotIn(List<String> values) {
            addCriterion("NodeURL not in", values, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlBetween(String value1, String value2) {
            addCriterion("NodeURL between", value1, value2, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andNodeurlNotBetween(String value1, String value2) {
            addCriterion("NodeURL not between", value1, value2, "nodeurl");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNull() {
            addCriterion("DisplayOrder is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DisplayOrder is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(Integer value) {
            addCriterion("DisplayOrder =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(Integer value) {
            addCriterion("DisplayOrder <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(Integer value) {
            addCriterion("DisplayOrder >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisplayOrder >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(Integer value) {
            addCriterion("DisplayOrder <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(Integer value) {
            addCriterion("DisplayOrder <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<Integer> values) {
            addCriterion("DisplayOrder in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<Integer> values) {
            addCriterion("DisplayOrder not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(Integer value1, Integer value2) {
            addCriterion("DisplayOrder between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(Integer value1, Integer value2) {
            addCriterion("DisplayOrder not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andParentnodeidIsNull() {
            addCriterion("ParentNodeId is null");
            return (Criteria) this;
        }

        public Criteria andParentnodeidIsNotNull() {
            addCriterion("ParentNodeId is not null");
            return (Criteria) this;
        }

        public Criteria andParentnodeidEqualTo(Integer value) {
            addCriterion("ParentNodeId =", value, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidNotEqualTo(Integer value) {
            addCriterion("ParentNodeId <>", value, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidGreaterThan(Integer value) {
            addCriterion("ParentNodeId >", value, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentNodeId >=", value, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidLessThan(Integer value) {
            addCriterion("ParentNodeId <", value, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentNodeId <=", value, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidIn(List<Integer> values) {
            addCriterion("ParentNodeId in", values, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidNotIn(List<Integer> values) {
            addCriterion("ParentNodeId not in", values, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidBetween(Integer value1, Integer value2) {
            addCriterion("ParentNodeId between", value1, value2, "parentnodeid");
            return (Criteria) this;
        }

        public Criteria andParentnodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentNodeId not between", value1, value2, "parentnodeid");
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