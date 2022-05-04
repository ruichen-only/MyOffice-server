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

        public Criteria andSignidIsNull() {
            addCriterion("SignId is null");
            return (Criteria) this;
        }

        public Criteria andSignidIsNotNull() {
            addCriterion("SignId is not null");
            return (Criteria) this;
        }

        public Criteria andSignidEqualTo(Integer value) {
            addCriterion("SignId =", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotEqualTo(Integer value) {
            addCriterion("SignId <>", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThan(Integer value) {
            addCriterion("SignId >", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignId >=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThan(Integer value) {
            addCriterion("SignId <", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThanOrEqualTo(Integer value) {
            addCriterion("SignId <=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidIn(List<Integer> values) {
            addCriterion("SignId in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotIn(List<Integer> values) {
            addCriterion("SignId not in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidBetween(Integer value1, Integer value2) {
            addCriterion("SignId between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotBetween(Integer value1, Integer value2) {
            addCriterion("SignId not between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("SignTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("SignTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("SignTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("SignTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("SignTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SignTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("SignTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("SignTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("SignTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("SignTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("SignTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("SignTime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigndescIsNull() {
            addCriterion("SignDesc is null");
            return (Criteria) this;
        }

        public Criteria andSigndescIsNotNull() {
            addCriterion("SignDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSigndescEqualTo(String value) {
            addCriterion("SignDesc =", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescNotEqualTo(String value) {
            addCriterion("SignDesc <>", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescGreaterThan(String value) {
            addCriterion("SignDesc >", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescGreaterThanOrEqualTo(String value) {
            addCriterion("SignDesc >=", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescLessThan(String value) {
            addCriterion("SignDesc <", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescLessThanOrEqualTo(String value) {
            addCriterion("SignDesc <=", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescLike(String value) {
            addCriterion("SignDesc like", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescNotLike(String value) {
            addCriterion("SignDesc not like", value, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescIn(List<String> values) {
            addCriterion("SignDesc in", values, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescNotIn(List<String> values) {
            addCriterion("SignDesc not in", values, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescBetween(String value1, String value2) {
            addCriterion("SignDesc between", value1, value2, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigndescNotBetween(String value1, String value2) {
            addCriterion("SignDesc not between", value1, value2, "signdesc");
            return (Criteria) this;
        }

        public Criteria andSigntagIsNull() {
            addCriterion("SignTag is null");
            return (Criteria) this;
        }

        public Criteria andSigntagIsNotNull() {
            addCriterion("SignTag is not null");
            return (Criteria) this;
        }

        public Criteria andSigntagEqualTo(Integer value) {
            addCriterion("SignTag =", value, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagNotEqualTo(Integer value) {
            addCriterion("SignTag <>", value, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagGreaterThan(Integer value) {
            addCriterion("SignTag >", value, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignTag >=", value, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagLessThan(Integer value) {
            addCriterion("SignTag <", value, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagLessThanOrEqualTo(Integer value) {
            addCriterion("SignTag <=", value, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagIn(List<Integer> values) {
            addCriterion("SignTag in", values, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagNotIn(List<Integer> values) {
            addCriterion("SignTag not in", values, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagBetween(Integer value1, Integer value2) {
            addCriterion("SignTag between", value1, value2, "signtag");
            return (Criteria) this;
        }

        public Criteria andSigntagNotBetween(Integer value1, Integer value2) {
            addCriterion("SignTag not between", value1, value2, "signtag");
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