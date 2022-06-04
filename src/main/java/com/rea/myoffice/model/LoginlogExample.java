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

        public Criteria andLoginIdIsNull() {
            addCriterion("LoginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LoginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Integer value) {
            addCriterion("LoginId =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Integer value) {
            addCriterion("LoginId <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Integer value) {
            addCriterion("LoginId >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginId >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Integer value) {
            addCriterion("LoginId <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Integer value) {
            addCriterion("LoginId <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Integer> values) {
            addCriterion("LoginId in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Integer> values) {
            addCriterion("LoginId not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Integer value1, Integer value2) {
            addCriterion("LoginId between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginId not between", value1, value2, "loginId");
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

        public Criteria andLoginTimeIsNull() {
            addCriterion("LoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("LoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("LoginTime =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("LoginTime <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("LoginTime >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginTime >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("LoginTime <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LoginTime <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("LoginTime in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("LoginTime not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LoginTime between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LoginTime not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andIfSuccessIsNull() {
            addCriterion("IfSuccess is null");
            return (Criteria) this;
        }

        public Criteria andIfSuccessIsNotNull() {
            addCriterion("IfSuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIfSuccessEqualTo(Integer value) {
            addCriterion("IfSuccess =", value, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessNotEqualTo(Integer value) {
            addCriterion("IfSuccess <>", value, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessGreaterThan(Integer value) {
            addCriterion("IfSuccess >", value, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("IfSuccess >=", value, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessLessThan(Integer value) {
            addCriterion("IfSuccess <", value, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("IfSuccess <=", value, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessIn(List<Integer> values) {
            addCriterion("IfSuccess in", values, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessNotIn(List<Integer> values) {
            addCriterion("IfSuccess not in", values, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessBetween(Integer value1, Integer value2) {
            addCriterion("IfSuccess between", value1, value2, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andIfSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("IfSuccess not between", value1, value2, "ifSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpIsNull() {
            addCriterion("LoginUserIp is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpIsNotNull() {
            addCriterion("LoginUserIp is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpEqualTo(String value) {
            addCriterion("LoginUserIp =", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpNotEqualTo(String value) {
            addCriterion("LoginUserIp <>", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpGreaterThan(String value) {
            addCriterion("LoginUserIp >", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("LoginUserIp >=", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpLessThan(String value) {
            addCriterion("LoginUserIp <", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpLessThanOrEqualTo(String value) {
            addCriterion("LoginUserIp <=", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpLike(String value) {
            addCriterion("LoginUserIp like", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpNotLike(String value) {
            addCriterion("LoginUserIp not like", value, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpIn(List<String> values) {
            addCriterion("LoginUserIp in", values, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpNotIn(List<String> values) {
            addCriterion("LoginUserIp not in", values, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpBetween(String value1, String value2) {
            addCriterion("LoginUserIp between", value1, value2, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginUserIpNotBetween(String value1, String value2) {
            addCriterion("LoginUserIp not between", value1, value2, "loginUserIp");
            return (Criteria) this;
        }

        public Criteria andLoginDescIsNull() {
            addCriterion("LoginDesc is null");
            return (Criteria) this;
        }

        public Criteria andLoginDescIsNotNull() {
            addCriterion("LoginDesc is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDescEqualTo(String value) {
            addCriterion("LoginDesc =", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescNotEqualTo(String value) {
            addCriterion("LoginDesc <>", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescGreaterThan(String value) {
            addCriterion("LoginDesc >", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescGreaterThanOrEqualTo(String value) {
            addCriterion("LoginDesc >=", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescLessThan(String value) {
            addCriterion("LoginDesc <", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescLessThanOrEqualTo(String value) {
            addCriterion("LoginDesc <=", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescLike(String value) {
            addCriterion("LoginDesc like", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescNotLike(String value) {
            addCriterion("LoginDesc not like", value, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescIn(List<String> values) {
            addCriterion("LoginDesc in", values, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescNotIn(List<String> values) {
            addCriterion("LoginDesc not in", values, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescBetween(String value1, String value2) {
            addCriterion("LoginDesc between", value1, value2, "loginDesc");
            return (Criteria) this;
        }

        public Criteria andLoginDescNotBetween(String value1, String value2) {
            addCriterion("LoginDesc not between", value1, value2, "loginDesc");
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