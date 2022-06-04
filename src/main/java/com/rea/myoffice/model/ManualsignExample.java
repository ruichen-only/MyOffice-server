package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManualsignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManualsignExample() {
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

        public Criteria andSignIdIsNull() {
            addCriterion("SignId is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("SignId is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(Integer value) {
            addCriterion("SignId =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(Integer value) {
            addCriterion("SignId <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(Integer value) {
            addCriterion("SignId >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignId >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(Integer value) {
            addCriterion("SignId <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(Integer value) {
            addCriterion("SignId <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<Integer> values) {
            addCriterion("SignId in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<Integer> values) {
            addCriterion("SignId not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(Integer value1, Integer value2) {
            addCriterion("SignId between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SignId not between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("UserId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("UserId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("UserId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("UserId like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("UserId not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("UserId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("SignTime is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("SignTime is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("SignTime =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("SignTime <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("SignTime >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SignTime >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("SignTime <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("SignTime <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("SignTime in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("SignTime not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("SignTime between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("SignTime not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignDescIsNull() {
            addCriterion("SignDesc is null");
            return (Criteria) this;
        }

        public Criteria andSignDescIsNotNull() {
            addCriterion("SignDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSignDescEqualTo(String value) {
            addCriterion("SignDesc =", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescNotEqualTo(String value) {
            addCriterion("SignDesc <>", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescGreaterThan(String value) {
            addCriterion("SignDesc >", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescGreaterThanOrEqualTo(String value) {
            addCriterion("SignDesc >=", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescLessThan(String value) {
            addCriterion("SignDesc <", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescLessThanOrEqualTo(String value) {
            addCriterion("SignDesc <=", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescLike(String value) {
            addCriterion("SignDesc like", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescNotLike(String value) {
            addCriterion("SignDesc not like", value, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescIn(List<String> values) {
            addCriterion("SignDesc in", values, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescNotIn(List<String> values) {
            addCriterion("SignDesc not in", values, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescBetween(String value1, String value2) {
            addCriterion("SignDesc between", value1, value2, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignDescNotBetween(String value1, String value2) {
            addCriterion("SignDesc not between", value1, value2, "signDesc");
            return (Criteria) this;
        }

        public Criteria andSignTagIsNull() {
            addCriterion("SignTag is null");
            return (Criteria) this;
        }

        public Criteria andSignTagIsNotNull() {
            addCriterion("SignTag is not null");
            return (Criteria) this;
        }

        public Criteria andSignTagEqualTo(Integer value) {
            addCriterion("SignTag =", value, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagNotEqualTo(Integer value) {
            addCriterion("SignTag <>", value, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagGreaterThan(Integer value) {
            addCriterion("SignTag >", value, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignTag >=", value, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagLessThan(Integer value) {
            addCriterion("SignTag <", value, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagLessThanOrEqualTo(Integer value) {
            addCriterion("SignTag <=", value, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagIn(List<Integer> values) {
            addCriterion("SignTag in", values, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagNotIn(List<Integer> values) {
            addCriterion("SignTag not in", values, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagBetween(Integer value1, Integer value2) {
            addCriterion("SignTag between", value1, value2, "signTag");
            return (Criteria) this;
        }

        public Criteria andSignTagNotBetween(Integer value1, Integer value2) {
            addCriterion("SignTag not between", value1, value2, "signTag");
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