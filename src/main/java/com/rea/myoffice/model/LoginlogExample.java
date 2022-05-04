package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginlogExample() {
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

        public Criteria andLoginidIsNull() {
            addCriterion("LoginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("LoginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(Integer value) {
            addCriterion("LoginId =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(Integer value) {
            addCriterion("LoginId <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(Integer value) {
            addCriterion("LoginId >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginId >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(Integer value) {
            addCriterion("LoginId <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(Integer value) {
            addCriterion("LoginId <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<Integer> values) {
            addCriterion("LoginId in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<Integer> values) {
            addCriterion("LoginId not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(Integer value1, Integer value2) {
            addCriterion("LoginId between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginId not between", value1, value2, "loginid");
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

        public Criteria andLogintimeIsNull() {
            addCriterion("LoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("LoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("LoginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("LoginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("LoginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("LoginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LoginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("LoginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("LoginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("LoginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LoginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andIfsuccessIsNull() {
            addCriterion("IfSuccess is null");
            return (Criteria) this;
        }

        public Criteria andIfsuccessIsNotNull() {
            addCriterion("IfSuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIfsuccessEqualTo(Integer value) {
            addCriterion("IfSuccess =", value, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessNotEqualTo(Integer value) {
            addCriterion("IfSuccess <>", value, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessGreaterThan(Integer value) {
            addCriterion("IfSuccess >", value, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("IfSuccess >=", value, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessLessThan(Integer value) {
            addCriterion("IfSuccess <", value, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessLessThanOrEqualTo(Integer value) {
            addCriterion("IfSuccess <=", value, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessIn(List<Integer> values) {
            addCriterion("IfSuccess in", values, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessNotIn(List<Integer> values) {
            addCriterion("IfSuccess not in", values, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessBetween(Integer value1, Integer value2) {
            addCriterion("IfSuccess between", value1, value2, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andIfsuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("IfSuccess not between", value1, value2, "ifsuccess");
            return (Criteria) this;
        }

        public Criteria andLoginuseripIsNull() {
            addCriterion("LoginUserIp is null");
            return (Criteria) this;
        }

        public Criteria andLoginuseripIsNotNull() {
            addCriterion("LoginUserIp is not null");
            return (Criteria) this;
        }

        public Criteria andLoginuseripEqualTo(String value) {
            addCriterion("LoginUserIp =", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripNotEqualTo(String value) {
            addCriterion("LoginUserIp <>", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripGreaterThan(String value) {
            addCriterion("LoginUserIp >", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripGreaterThanOrEqualTo(String value) {
            addCriterion("LoginUserIp >=", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripLessThan(String value) {
            addCriterion("LoginUserIp <", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripLessThanOrEqualTo(String value) {
            addCriterion("LoginUserIp <=", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripLike(String value) {
            addCriterion("LoginUserIp like", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripNotLike(String value) {
            addCriterion("LoginUserIp not like", value, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripIn(List<String> values) {
            addCriterion("LoginUserIp in", values, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripNotIn(List<String> values) {
            addCriterion("LoginUserIp not in", values, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripBetween(String value1, String value2) {
            addCriterion("LoginUserIp between", value1, value2, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLoginuseripNotBetween(String value1, String value2) {
            addCriterion("LoginUserIp not between", value1, value2, "loginuserip");
            return (Criteria) this;
        }

        public Criteria andLogindescIsNull() {
            addCriterion("LoginDesc is null");
            return (Criteria) this;
        }

        public Criteria andLogindescIsNotNull() {
            addCriterion("LoginDesc is not null");
            return (Criteria) this;
        }

        public Criteria andLogindescEqualTo(String value) {
            addCriterion("LoginDesc =", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescNotEqualTo(String value) {
            addCriterion("LoginDesc <>", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescGreaterThan(String value) {
            addCriterion("LoginDesc >", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescGreaterThanOrEqualTo(String value) {
            addCriterion("LoginDesc >=", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescLessThan(String value) {
            addCriterion("LoginDesc <", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescLessThanOrEqualTo(String value) {
            addCriterion("LoginDesc <=", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescLike(String value) {
            addCriterion("LoginDesc like", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescNotLike(String value) {
            addCriterion("LoginDesc not like", value, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescIn(List<String> values) {
            addCriterion("LoginDesc in", values, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescNotIn(List<String> values) {
            addCriterion("LoginDesc not in", values, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescBetween(String value1, String value2) {
            addCriterion("LoginDesc between", value1, value2, "logindesc");
            return (Criteria) this;
        }

        public Criteria andLogindescNotBetween(String value1, String value2) {
            addCriterion("LoginDesc not between", value1, value2, "logindesc");
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