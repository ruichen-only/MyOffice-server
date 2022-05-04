package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class MessagetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessagetypeExample() {
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

        public Criteria andMessagetypeidIsNull() {
            addCriterion("MessageTypeId is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidIsNotNull() {
            addCriterion("MessageTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidEqualTo(Integer value) {
            addCriterion("MessageTypeId =", value, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidNotEqualTo(Integer value) {
            addCriterion("MessageTypeId <>", value, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidGreaterThan(Integer value) {
            addCriterion("MessageTypeId >", value, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MessageTypeId >=", value, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidLessThan(Integer value) {
            addCriterion("MessageTypeId <", value, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("MessageTypeId <=", value, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidIn(List<Integer> values) {
            addCriterion("MessageTypeId in", values, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidNotIn(List<Integer> values) {
            addCriterion("MessageTypeId not in", values, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidBetween(Integer value1, Integer value2) {
            addCriterion("MessageTypeId between", value1, value2, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("MessageTypeId not between", value1, value2, "messagetypeid");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameIsNull() {
            addCriterion("MessageTypeName is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameIsNotNull() {
            addCriterion("MessageTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameEqualTo(String value) {
            addCriterion("MessageTypeName =", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameNotEqualTo(String value) {
            addCriterion("MessageTypeName <>", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameGreaterThan(String value) {
            addCriterion("MessageTypeName >", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("MessageTypeName >=", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameLessThan(String value) {
            addCriterion("MessageTypeName <", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameLessThanOrEqualTo(String value) {
            addCriterion("MessageTypeName <=", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameLike(String value) {
            addCriterion("MessageTypeName like", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameNotLike(String value) {
            addCriterion("MessageTypeName not like", value, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameIn(List<String> values) {
            addCriterion("MessageTypeName in", values, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameNotIn(List<String> values) {
            addCriterion("MessageTypeName not in", values, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameBetween(String value1, String value2) {
            addCriterion("MessageTypeName between", value1, value2, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagetypenameNotBetween(String value1, String value2) {
            addCriterion("MessageTypeName not between", value1, value2, "messagetypename");
            return (Criteria) this;
        }

        public Criteria andMessagedescIsNull() {
            addCriterion("MessageDesc is null");
            return (Criteria) this;
        }

        public Criteria andMessagedescIsNotNull() {
            addCriterion("MessageDesc is not null");
            return (Criteria) this;
        }

        public Criteria andMessagedescEqualTo(String value) {
            addCriterion("MessageDesc =", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotEqualTo(String value) {
            addCriterion("MessageDesc <>", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescGreaterThan(String value) {
            addCriterion("MessageDesc >", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescGreaterThanOrEqualTo(String value) {
            addCriterion("MessageDesc >=", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescLessThan(String value) {
            addCriterion("MessageDesc <", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescLessThanOrEqualTo(String value) {
            addCriterion("MessageDesc <=", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescLike(String value) {
            addCriterion("MessageDesc like", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotLike(String value) {
            addCriterion("MessageDesc not like", value, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescIn(List<String> values) {
            addCriterion("MessageDesc in", values, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotIn(List<String> values) {
            addCriterion("MessageDesc not in", values, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescBetween(String value1, String value2) {
            addCriterion("MessageDesc between", value1, value2, "messagedesc");
            return (Criteria) this;
        }

        public Criteria andMessagedescNotBetween(String value1, String value2) {
            addCriterion("MessageDesc not between", value1, value2, "messagedesc");
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