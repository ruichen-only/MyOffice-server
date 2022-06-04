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

        public Criteria andNoteIdIsNull() {
            addCriterion("NoteId is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("NoteId is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Integer value) {
            addCriterion("NoteId =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Integer value) {
            addCriterion("NoteId <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Integer value) {
            addCriterion("NoteId >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoteId >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Integer value) {
            addCriterion("NoteId <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("NoteId <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Integer> values) {
            addCriterion("NoteId in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Integer> values) {
            addCriterion("NoteId not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("NoteId between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NoteId not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNull() {
            addCriterion("NoteTitle is null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNotNull() {
            addCriterion("NoteTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleEqualTo(String value) {
            addCriterion("NoteTitle =", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotEqualTo(String value) {
            addCriterion("NoteTitle <>", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThan(String value) {
            addCriterion("NoteTitle >", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NoteTitle >=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThan(String value) {
            addCriterion("NoteTitle <", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("NoteTitle <=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLike(String value) {
            addCriterion("NoteTitle like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotLike(String value) {
            addCriterion("NoteTitle not like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIn(List<String> values) {
            addCriterion("NoteTitle in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotIn(List<String> values) {
            addCriterion("NoteTitle not in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleBetween(String value1, String value2) {
            addCriterion("NoteTitle between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotBetween(String value1, String value2) {
            addCriterion("NoteTitle not between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteContentIsNull() {
            addCriterion("NoteContent is null");
            return (Criteria) this;
        }

        public Criteria andNoteContentIsNotNull() {
            addCriterion("NoteContent is not null");
            return (Criteria) this;
        }

        public Criteria andNoteContentEqualTo(String value) {
            addCriterion("NoteContent =", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotEqualTo(String value) {
            addCriterion("NoteContent <>", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentGreaterThan(String value) {
            addCriterion("NoteContent >", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentGreaterThanOrEqualTo(String value) {
            addCriterion("NoteContent >=", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLessThan(String value) {
            addCriterion("NoteContent <", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLessThanOrEqualTo(String value) {
            addCriterion("NoteContent <=", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLike(String value) {
            addCriterion("NoteContent like", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotLike(String value) {
            addCriterion("NoteContent not like", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentIn(List<String> values) {
            addCriterion("NoteContent in", values, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotIn(List<String> values) {
            addCriterion("NoteContent not in", values, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentBetween(String value1, String value2) {
            addCriterion("NoteContent between", value1, value2, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotBetween(String value1, String value2) {
            addCriterion("NoteContent not between", value1, value2, "noteContent");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CreateUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CreateUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CreateUser =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CreateUser <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CreateUser >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUser >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CreateUser <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CreateUser <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CreateUser like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CreateUser not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CreateUser in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CreateUser not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CreateUser between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CreateUser not between", value1, value2, "createUser");
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