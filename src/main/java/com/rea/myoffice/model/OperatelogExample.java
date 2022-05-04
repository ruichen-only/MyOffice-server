package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperatelogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperatelogExample() {
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

        public Criteria andOperateidIsNull() {
            addCriterion("OperateId is null");
            return (Criteria) this;
        }

        public Criteria andOperateidIsNotNull() {
            addCriterion("OperateId is not null");
            return (Criteria) this;
        }

        public Criteria andOperateidEqualTo(Integer value) {
            addCriterion("OperateId =", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotEqualTo(Integer value) {
            addCriterion("OperateId <>", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidGreaterThan(Integer value) {
            addCriterion("OperateId >", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperateId >=", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLessThan(Integer value) {
            addCriterion("OperateId <", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLessThanOrEqualTo(Integer value) {
            addCriterion("OperateId <=", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidIn(List<Integer> values) {
            addCriterion("OperateId in", values, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotIn(List<Integer> values) {
            addCriterion("OperateId not in", values, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidBetween(Integer value1, Integer value2) {
            addCriterion("OperateId between", value1, value2, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotBetween(Integer value1, Integer value2) {
            addCriterion("OperateId not between", value1, value2, "operateid");
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

        public Criteria andOperatenameIsNull() {
            addCriterion("OperateName is null");
            return (Criteria) this;
        }

        public Criteria andOperatenameIsNotNull() {
            addCriterion("OperateName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatenameEqualTo(String value) {
            addCriterion("OperateName =", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotEqualTo(String value) {
            addCriterion("OperateName <>", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameGreaterThan(String value) {
            addCriterion("OperateName >", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameGreaterThanOrEqualTo(String value) {
            addCriterion("OperateName >=", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLessThan(String value) {
            addCriterion("OperateName <", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLessThanOrEqualTo(String value) {
            addCriterion("OperateName <=", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLike(String value) {
            addCriterion("OperateName like", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotLike(String value) {
            addCriterion("OperateName not like", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameIn(List<String> values) {
            addCriterion("OperateName in", values, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotIn(List<String> values) {
            addCriterion("OperateName not in", values, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameBetween(String value1, String value2) {
            addCriterion("OperateName between", value1, value2, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotBetween(String value1, String value2) {
            addCriterion("OperateName not between", value1, value2, "operatename");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNull() {
            addCriterion("ObjectId is null");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNotNull() {
            addCriterion("ObjectId is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidEqualTo(String value) {
            addCriterion("ObjectId =", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotEqualTo(String value) {
            addCriterion("ObjectId <>", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThan(String value) {
            addCriterion("ObjectId >", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectId >=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThan(String value) {
            addCriterion("ObjectId <", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThanOrEqualTo(String value) {
            addCriterion("ObjectId <=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLike(String value) {
            addCriterion("ObjectId like", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotLike(String value) {
            addCriterion("ObjectId not like", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidIn(List<String> values) {
            addCriterion("ObjectId in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotIn(List<String> values) {
            addCriterion("ObjectId not in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidBetween(String value1, String value2) {
            addCriterion("ObjectId between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotBetween(String value1, String value2) {
            addCriterion("ObjectId not between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andOperatedescIsNull() {
            addCriterion("OperateDesc is null");
            return (Criteria) this;
        }

        public Criteria andOperatedescIsNotNull() {
            addCriterion("OperateDesc is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedescEqualTo(String value) {
            addCriterion("OperateDesc =", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescNotEqualTo(String value) {
            addCriterion("OperateDesc <>", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescGreaterThan(String value) {
            addCriterion("OperateDesc >", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescGreaterThanOrEqualTo(String value) {
            addCriterion("OperateDesc >=", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescLessThan(String value) {
            addCriterion("OperateDesc <", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescLessThanOrEqualTo(String value) {
            addCriterion("OperateDesc <=", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescLike(String value) {
            addCriterion("OperateDesc like", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescNotLike(String value) {
            addCriterion("OperateDesc not like", value, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescIn(List<String> values) {
            addCriterion("OperateDesc in", values, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescNotIn(List<String> values) {
            addCriterion("OperateDesc not in", values, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescBetween(String value1, String value2) {
            addCriterion("OperateDesc between", value1, value2, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatedescNotBetween(String value1, String value2) {
            addCriterion("OperateDesc not between", value1, value2, "operatedesc");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("OperateTime is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("OperateTime is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(Date value) {
            addCriterion("OperateTime =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(Date value) {
            addCriterion("OperateTime <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(Date value) {
            addCriterion("OperateTime >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OperateTime >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(Date value) {
            addCriterion("OperateTime <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OperateTime <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<Date> values) {
            addCriterion("OperateTime in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<Date> values) {
            addCriterion("OperateTime not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(Date value1, Date value2) {
            addCriterion("OperateTime between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OperateTime not between", value1, value2, "operatetime");
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