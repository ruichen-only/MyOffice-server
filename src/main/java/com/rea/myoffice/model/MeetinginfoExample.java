package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class MeetinginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetinginfoExample() {
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

        public Criteria andMeetingIdIsNull() {
            addCriterion("MeetingId is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("MeetingId is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Integer value) {
            addCriterion("MeetingId =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Integer value) {
            addCriterion("MeetingId <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Integer value) {
            addCriterion("MeetingId >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MeetingId >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Integer value) {
            addCriterion("MeetingId <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
            addCriterion("MeetingId <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Integer> values) {
            addCriterion("MeetingId in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Integer> values) {
            addCriterion("MeetingId not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
            addCriterion("MeetingId between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MeetingId not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNull() {
            addCriterion("MeetingName is null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNotNull() {
            addCriterion("MeetingName is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameEqualTo(String value) {
            addCriterion("MeetingName =", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotEqualTo(String value) {
            addCriterion("MeetingName <>", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThan(String value) {
            addCriterion("MeetingName >", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
            addCriterion("MeetingName >=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThan(String value) {
            addCriterion("MeetingName <", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThanOrEqualTo(String value) {
            addCriterion("MeetingName <=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLike(String value) {
            addCriterion("MeetingName like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotLike(String value) {
            addCriterion("MeetingName not like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIn(List<String> values) {
            addCriterion("MeetingName in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotIn(List<String> values) {
            addCriterion("MeetingName not in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameBetween(String value1, String value2) {
            addCriterion("MeetingName between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotBetween(String value1, String value2) {
            addCriterion("MeetingName not between", value1, value2, "meetingName");
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