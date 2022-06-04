package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class FiletypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FiletypeinfoExample() {
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

        public Criteria andFileTypeIdIsNull() {
            addCriterion("FileTypeId is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdIsNotNull() {
            addCriterion("FileTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdEqualTo(Integer value) {
            addCriterion("FileTypeId =", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotEqualTo(Integer value) {
            addCriterion("FileTypeId <>", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdGreaterThan(Integer value) {
            addCriterion("FileTypeId >", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileTypeId >=", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdLessThan(Integer value) {
            addCriterion("FileTypeId <", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("FileTypeId <=", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdIn(List<Integer> values) {
            addCriterion("FileTypeId in", values, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotIn(List<Integer> values) {
            addCriterion("FileTypeId not in", values, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("FileTypeId between", value1, value2, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FileTypeId not between", value1, value2, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameIsNull() {
            addCriterion("FileTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameIsNotNull() {
            addCriterion("FileTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameEqualTo(String value) {
            addCriterion("FileTypeName =", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotEqualTo(String value) {
            addCriterion("FileTypeName <>", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameGreaterThan(String value) {
            addCriterion("FileTypeName >", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("FileTypeName >=", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameLessThan(String value) {
            addCriterion("FileTypeName <", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameLessThanOrEqualTo(String value) {
            addCriterion("FileTypeName <=", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameLike(String value) {
            addCriterion("FileTypeName like", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotLike(String value) {
            addCriterion("FileTypeName not like", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameIn(List<String> values) {
            addCriterion("FileTypeName in", values, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotIn(List<String> values) {
            addCriterion("FileTypeName not in", values, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameBetween(String value1, String value2) {
            addCriterion("FileTypeName between", value1, value2, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotBetween(String value1, String value2) {
            addCriterion("FileTypeName not between", value1, value2, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageIsNull() {
            addCriterion("FileTypeImage is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageIsNotNull() {
            addCriterion("FileTypeImage is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageEqualTo(String value) {
            addCriterion("FileTypeImage =", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageNotEqualTo(String value) {
            addCriterion("FileTypeImage <>", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageGreaterThan(String value) {
            addCriterion("FileTypeImage >", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageGreaterThanOrEqualTo(String value) {
            addCriterion("FileTypeImage >=", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageLessThan(String value) {
            addCriterion("FileTypeImage <", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageLessThanOrEqualTo(String value) {
            addCriterion("FileTypeImage <=", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageLike(String value) {
            addCriterion("FileTypeImage like", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageNotLike(String value) {
            addCriterion("FileTypeImage not like", value, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageIn(List<String> values) {
            addCriterion("FileTypeImage in", values, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageNotIn(List<String> values) {
            addCriterion("FileTypeImage not in", values, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageBetween(String value1, String value2) {
            addCriterion("FileTypeImage between", value1, value2, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeImageNotBetween(String value1, String value2) {
            addCriterion("FileTypeImage not between", value1, value2, "fileTypeImage");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixIsNull() {
            addCriterion("FileTypeSuffix is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixIsNotNull() {
            addCriterion("FileTypeSuffix is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixEqualTo(String value) {
            addCriterion("FileTypeSuffix =", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixNotEqualTo(String value) {
            addCriterion("FileTypeSuffix <>", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixGreaterThan(String value) {
            addCriterion("FileTypeSuffix >", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("FileTypeSuffix >=", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixLessThan(String value) {
            addCriterion("FileTypeSuffix <", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixLessThanOrEqualTo(String value) {
            addCriterion("FileTypeSuffix <=", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixLike(String value) {
            addCriterion("FileTypeSuffix like", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixNotLike(String value) {
            addCriterion("FileTypeSuffix not like", value, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixIn(List<String> values) {
            addCriterion("FileTypeSuffix in", values, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixNotIn(List<String> values) {
            addCriterion("FileTypeSuffix not in", values, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixBetween(String value1, String value2) {
            addCriterion("FileTypeSuffix between", value1, value2, "fileTypeSuffix");
            return (Criteria) this;
        }

        public Criteria andFileTypeSuffixNotBetween(String value1, String value2) {
            addCriterion("FileTypeSuffix not between", value1, value2, "fileTypeSuffix");
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