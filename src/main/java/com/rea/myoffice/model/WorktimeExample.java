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

        public Criteria andWorkTimeIdIsNull() {
            addCriterion("WorkTimeId is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIsNotNull() {
            addCriterion("WorkTimeId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdEqualTo(Integer value) {
            addCriterion("WorkTimeId =", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotEqualTo(Integer value) {
            addCriterion("WorkTimeId <>", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdGreaterThan(Integer value) {
            addCriterion("WorkTimeId >", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkTimeId >=", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLessThan(Integer value) {
            addCriterion("WorkTimeId <", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("WorkTimeId <=", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIn(List<Integer> values) {
            addCriterion("WorkTimeId in", values, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotIn(List<Integer> values) {
            addCriterion("WorkTimeId not in", values, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("WorkTimeId between", value1, value2, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkTimeId not between", value1, value2, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIsNull() {
            addCriterion("OnDutyTime is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIsNotNull() {
            addCriterion("OnDutyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeEqualTo(Date value) {
            addCriterion("OnDutyTime =", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNotEqualTo(Date value) {
            addCriterion("OnDutyTime <>", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeGreaterThan(Date value) {
            addCriterion("OnDutyTime >", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OnDutyTime >=", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeLessThan(Date value) {
            addCriterion("OnDutyTime <", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeLessThanOrEqualTo(Date value) {
            addCriterion("OnDutyTime <=", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIn(List<Date> values) {
            addCriterion("OnDutyTime in", values, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNotIn(List<Date> values) {
            addCriterion("OnDutyTime not in", values, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeBetween(Date value1, Date value2) {
            addCriterion("OnDutyTime between", value1, value2, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNotBetween(Date value1, Date value2) {
            addCriterion("OnDutyTime not between", value1, value2, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeIsNull() {
            addCriterion("OffDutyTime is null");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeIsNotNull() {
            addCriterion("OffDutyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeEqualTo(Date value) {
            addCriterion("OffDutyTime =", value, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeNotEqualTo(Date value) {
            addCriterion("OffDutyTime <>", value, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeGreaterThan(Date value) {
            addCriterion("OffDutyTime >", value, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OffDutyTime >=", value, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeLessThan(Date value) {
            addCriterion("OffDutyTime <", value, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeLessThanOrEqualTo(Date value) {
            addCriterion("OffDutyTime <=", value, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeIn(List<Date> values) {
            addCriterion("OffDutyTime in", values, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeNotIn(List<Date> values) {
            addCriterion("OffDutyTime not in", values, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeBetween(Date value1, Date value2) {
            addCriterion("OffDutyTime between", value1, value2, "offDutyTime");
            return (Criteria) this;
        }

        public Criteria andOffDutyTimeNotBetween(Date value1, Date value2) {
            addCriterion("OffDutyTime not between", value1, value2, "offDutyTime");
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