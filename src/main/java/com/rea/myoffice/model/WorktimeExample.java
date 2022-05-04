package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorktimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorktimeExample() {
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

        public Criteria andWorktimeidIsNull() {
            addCriterion("WorkTimeId is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeidIsNotNull() {
            addCriterion("WorkTimeId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeidEqualTo(Integer value) {
            addCriterion("WorkTimeId =", value, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidNotEqualTo(Integer value) {
            addCriterion("WorkTimeId <>", value, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidGreaterThan(Integer value) {
            addCriterion("WorkTimeId >", value, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkTimeId >=", value, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidLessThan(Integer value) {
            addCriterion("WorkTimeId <", value, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidLessThanOrEqualTo(Integer value) {
            addCriterion("WorkTimeId <=", value, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidIn(List<Integer> values) {
            addCriterion("WorkTimeId in", values, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidNotIn(List<Integer> values) {
            addCriterion("WorkTimeId not in", values, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidBetween(Integer value1, Integer value2) {
            addCriterion("WorkTimeId between", value1, value2, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andWorktimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkTimeId not between", value1, value2, "worktimeid");
            return (Criteria) this;
        }

        public Criteria andOndutytimeIsNull() {
            addCriterion("OnDutyTime is null");
            return (Criteria) this;
        }

        public Criteria andOndutytimeIsNotNull() {
            addCriterion("OnDutyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOndutytimeEqualTo(Date value) {
            addCriterion("OnDutyTime =", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeNotEqualTo(Date value) {
            addCriterion("OnDutyTime <>", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeGreaterThan(Date value) {
            addCriterion("OnDutyTime >", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OnDutyTime >=", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeLessThan(Date value) {
            addCriterion("OnDutyTime <", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeLessThanOrEqualTo(Date value) {
            addCriterion("OnDutyTime <=", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeIn(List<Date> values) {
            addCriterion("OnDutyTime in", values, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeNotIn(List<Date> values) {
            addCriterion("OnDutyTime not in", values, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeBetween(Date value1, Date value2) {
            addCriterion("OnDutyTime between", value1, value2, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeNotBetween(Date value1, Date value2) {
            addCriterion("OnDutyTime not between", value1, value2, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeIsNull() {
            addCriterion("OffDutyTime is null");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeIsNotNull() {
            addCriterion("OffDutyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeEqualTo(Date value) {
            addCriterion("OffDutyTime =", value, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeNotEqualTo(Date value) {
            addCriterion("OffDutyTime <>", value, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeGreaterThan(Date value) {
            addCriterion("OffDutyTime >", value, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OffDutyTime >=", value, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeLessThan(Date value) {
            addCriterion("OffDutyTime <", value, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeLessThanOrEqualTo(Date value) {
            addCriterion("OffDutyTime <=", value, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeIn(List<Date> values) {
            addCriterion("OffDutyTime in", values, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeNotIn(List<Date> values) {
            addCriterion("OffDutyTime not in", values, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeBetween(Date value1, Date value2) {
            addCriterion("OffDutyTime between", value1, value2, "offdutytime");
            return (Criteria) this;
        }

        public Criteria andOffdutytimeNotBetween(Date value1, Date value2) {
            addCriterion("OffDutyTime not between", value1, value2, "offdutytime");
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