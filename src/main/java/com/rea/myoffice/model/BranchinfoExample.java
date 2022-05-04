package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class BranchinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BranchinfoExample() {
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

        public Criteria andBranchidIsNull() {
            addCriterion("BranchId is null");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNotNull() {
            addCriterion("BranchId is not null");
            return (Criteria) this;
        }

        public Criteria andBranchidEqualTo(Integer value) {
            addCriterion("BranchId =", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotEqualTo(Integer value) {
            addCriterion("BranchId <>", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThan(Integer value) {
            addCriterion("BranchId >", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BranchId >=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThan(Integer value) {
            addCriterion("BranchId <", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThanOrEqualTo(Integer value) {
            addCriterion("BranchId <=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidIn(List<Integer> values) {
            addCriterion("BranchId in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotIn(List<Integer> values) {
            addCriterion("BranchId not in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidBetween(Integer value1, Integer value2) {
            addCriterion("BranchId between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("BranchId not between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchnameIsNull() {
            addCriterion("BranchName is null");
            return (Criteria) this;
        }

        public Criteria andBranchnameIsNotNull() {
            addCriterion("BranchName is not null");
            return (Criteria) this;
        }

        public Criteria andBranchnameEqualTo(String value) {
            addCriterion("BranchName =", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotEqualTo(String value) {
            addCriterion("BranchName <>", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameGreaterThan(String value) {
            addCriterion("BranchName >", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameGreaterThanOrEqualTo(String value) {
            addCriterion("BranchName >=", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameLessThan(String value) {
            addCriterion("BranchName <", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameLessThanOrEqualTo(String value) {
            addCriterion("BranchName <=", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameLike(String value) {
            addCriterion("BranchName like", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotLike(String value) {
            addCriterion("BranchName not like", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameIn(List<String> values) {
            addCriterion("BranchName in", values, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotIn(List<String> values) {
            addCriterion("BranchName not in", values, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameBetween(String value1, String value2) {
            addCriterion("BranchName between", value1, value2, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotBetween(String value1, String value2) {
            addCriterion("BranchName not between", value1, value2, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameIsNull() {
            addCriterion("BranchShortName is null");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameIsNotNull() {
            addCriterion("BranchShortName is not null");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameEqualTo(String value) {
            addCriterion("BranchShortName =", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameNotEqualTo(String value) {
            addCriterion("BranchShortName <>", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameGreaterThan(String value) {
            addCriterion("BranchShortName >", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("BranchShortName >=", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameLessThan(String value) {
            addCriterion("BranchShortName <", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameLessThanOrEqualTo(String value) {
            addCriterion("BranchShortName <=", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameLike(String value) {
            addCriterion("BranchShortName like", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameNotLike(String value) {
            addCriterion("BranchShortName not like", value, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameIn(List<String> values) {
            addCriterion("BranchShortName in", values, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameNotIn(List<String> values) {
            addCriterion("BranchShortName not in", values, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameBetween(String value1, String value2) {
            addCriterion("BranchShortName between", value1, value2, "branchshortname");
            return (Criteria) this;
        }

        public Criteria andBranchshortnameNotBetween(String value1, String value2) {
            addCriterion("BranchShortName not between", value1, value2, "branchshortname");
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