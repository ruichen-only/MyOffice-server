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

        public Criteria andMeetingidIsNull() {
            addCriterion("MeetingId is null");
            return (Criteria) this;
        }

        public Criteria andMeetingidIsNotNull() {
            addCriterion("MeetingId is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingidEqualTo(Integer value) {
            addCriterion("MeetingId =", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidNotEqualTo(Integer value) {
            addCriterion("MeetingId <>", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidGreaterThan(Integer value) {
            addCriterion("MeetingId >", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MeetingId >=", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidLessThan(Integer value) {
            addCriterion("MeetingId <", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidLessThanOrEqualTo(Integer value) {
            addCriterion("MeetingId <=", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidIn(List<Integer> values) {
            addCriterion("MeetingId in", values, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidNotIn(List<Integer> values) {
            addCriterion("MeetingId not in", values, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidBetween(Integer value1, Integer value2) {
            addCriterion("MeetingId between", value1, value2, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidNotBetween(Integer value1, Integer value2) {
            addCriterion("MeetingId not between", value1, value2, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNull() {
            addCriterion("MeetingName is null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNotNull() {
            addCriterion("MeetingName is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameEqualTo(String value) {
            addCriterion("MeetingName =", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotEqualTo(String value) {
            addCriterion("MeetingName <>", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThan(String value) {
            addCriterion("MeetingName >", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThanOrEqualTo(String value) {
            addCriterion("MeetingName >=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThan(String value) {
            addCriterion("MeetingName <", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThanOrEqualTo(String value) {
            addCriterion("MeetingName <=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLike(String value) {
            addCriterion("MeetingName like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotLike(String value) {
            addCriterion("MeetingName not like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIn(List<String> values) {
            addCriterion("MeetingName in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotIn(List<String> values) {
            addCriterion("MeetingName not in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameBetween(String value1, String value2) {
            addCriterion("MeetingName between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotBetween(String value1, String value2) {
            addCriterion("MeetingName not between", value1, value2, "meetingname");
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