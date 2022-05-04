package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MynoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MynoteExample() {
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

        public Criteria andNoteidIsNull() {
            addCriterion("NoteId is null");
            return (Criteria) this;
        }

        public Criteria andNoteidIsNotNull() {
            addCriterion("NoteId is not null");
            return (Criteria) this;
        }

        public Criteria andNoteidEqualTo(Integer value) {
            addCriterion("NoteId =", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotEqualTo(Integer value) {
            addCriterion("NoteId <>", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThan(Integer value) {
            addCriterion("NoteId >", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoteId >=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThan(Integer value) {
            addCriterion("NoteId <", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThanOrEqualTo(Integer value) {
            addCriterion("NoteId <=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidIn(List<Integer> values) {
            addCriterion("NoteId in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotIn(List<Integer> values) {
            addCriterion("NoteId not in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidBetween(Integer value1, Integer value2) {
            addCriterion("NoteId between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotBetween(Integer value1, Integer value2) {
            addCriterion("NoteId not between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNotetitleIsNull() {
            addCriterion("NoteTitle is null");
            return (Criteria) this;
        }

        public Criteria andNotetitleIsNotNull() {
            addCriterion("NoteTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNotetitleEqualTo(String value) {
            addCriterion("NoteTitle =", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotEqualTo(String value) {
            addCriterion("NoteTitle <>", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleGreaterThan(String value) {
            addCriterion("NoteTitle >", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleGreaterThanOrEqualTo(String value) {
            addCriterion("NoteTitle >=", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleLessThan(String value) {
            addCriterion("NoteTitle <", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleLessThanOrEqualTo(String value) {
            addCriterion("NoteTitle <=", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleLike(String value) {
            addCriterion("NoteTitle like", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotLike(String value) {
            addCriterion("NoteTitle not like", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleIn(List<String> values) {
            addCriterion("NoteTitle in", values, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotIn(List<String> values) {
            addCriterion("NoteTitle not in", values, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleBetween(String value1, String value2) {
            addCriterion("NoteTitle between", value1, value2, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotBetween(String value1, String value2) {
            addCriterion("NoteTitle not between", value1, value2, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotecontentIsNull() {
            addCriterion("NoteContent is null");
            return (Criteria) this;
        }

        public Criteria andNotecontentIsNotNull() {
            addCriterion("NoteContent is not null");
            return (Criteria) this;
        }

        public Criteria andNotecontentEqualTo(String value) {
            addCriterion("NoteContent =", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentNotEqualTo(String value) {
            addCriterion("NoteContent <>", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentGreaterThan(String value) {
            addCriterion("NoteContent >", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentGreaterThanOrEqualTo(String value) {
            addCriterion("NoteContent >=", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentLessThan(String value) {
            addCriterion("NoteContent <", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentLessThanOrEqualTo(String value) {
            addCriterion("NoteContent <=", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentLike(String value) {
            addCriterion("NoteContent like", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentNotLike(String value) {
            addCriterion("NoteContent not like", value, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentIn(List<String> values) {
            addCriterion("NoteContent in", values, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentNotIn(List<String> values) {
            addCriterion("NoteContent not in", values, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentBetween(String value1, String value2) {
            addCriterion("NoteContent between", value1, value2, "notecontent");
            return (Criteria) this;
        }

        public Criteria andNotecontentNotBetween(String value1, String value2) {
            addCriterion("NoteContent not between", value1, value2, "notecontent");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CreateUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CreateUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CreateUser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CreateUser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CreateUser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CreateUser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CreateUser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CreateUser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CreateUser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CreateUser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CreateUser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CreateUser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CreateUser not between", value1, value2, "createuser");
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