package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccessoryfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessoryfileExample() {
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

        public Criteria andAccessoryIdIsNull() {
            addCriterion("AccessoryId is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdIsNotNull() {
            addCriterion("AccessoryId is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdEqualTo(Integer value) {
            addCriterion("AccessoryId =", value, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdNotEqualTo(Integer value) {
            addCriterion("AccessoryId <>", value, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdGreaterThan(Integer value) {
            addCriterion("AccessoryId >", value, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessoryId >=", value, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdLessThan(Integer value) {
            addCriterion("AccessoryId <", value, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("AccessoryId <=", value, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdIn(List<Integer> values) {
            addCriterion("AccessoryId in", values, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdNotIn(List<Integer> values) {
            addCriterion("AccessoryId not in", values, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryId between", value1, value2, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryId not between", value1, value2, "accessoryId");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FileId is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("FileId =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("FileId <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("FileId >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileId >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("FileId <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("FileId <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("FileId in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("FileId not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("FileId between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FileId not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameIsNull() {
            addCriterion("AccessoryName is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameIsNotNull() {
            addCriterion("AccessoryName is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameEqualTo(String value) {
            addCriterion("AccessoryName =", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameNotEqualTo(String value) {
            addCriterion("AccessoryName <>", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameGreaterThan(String value) {
            addCriterion("AccessoryName >", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("AccessoryName >=", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameLessThan(String value) {
            addCriterion("AccessoryName <", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameLessThanOrEqualTo(String value) {
            addCriterion("AccessoryName <=", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameLike(String value) {
            addCriterion("AccessoryName like", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameNotLike(String value) {
            addCriterion("AccessoryName not like", value, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameIn(List<String> values) {
            addCriterion("AccessoryName in", values, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameNotIn(List<String> values) {
            addCriterion("AccessoryName not in", values, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameBetween(String value1, String value2) {
            addCriterion("AccessoryName between", value1, value2, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessoryNameNotBetween(String value1, String value2) {
            addCriterion("AccessoryName not between", value1, value2, "accessoryName");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeIsNull() {
            addCriterion("AccessorySize is null");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeIsNotNull() {
            addCriterion("AccessorySize is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeEqualTo(Integer value) {
            addCriterion("AccessorySize =", value, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeNotEqualTo(Integer value) {
            addCriterion("AccessorySize <>", value, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeGreaterThan(Integer value) {
            addCriterion("AccessorySize >", value, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessorySize >=", value, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeLessThan(Integer value) {
            addCriterion("AccessorySize <", value, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeLessThanOrEqualTo(Integer value) {
            addCriterion("AccessorySize <=", value, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeIn(List<Integer> values) {
            addCriterion("AccessorySize in", values, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeNotIn(List<Integer> values) {
            addCriterion("AccessorySize not in", values, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeBetween(Integer value1, Integer value2) {
            addCriterion("AccessorySize between", value1, value2, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessorySizeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessorySize not between", value1, value2, "accessorySize");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeIsNull() {
            addCriterion("AccessoryType is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeIsNotNull() {
            addCriterion("AccessoryType is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeEqualTo(Integer value) {
            addCriterion("AccessoryType =", value, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeNotEqualTo(Integer value) {
            addCriterion("AccessoryType <>", value, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeGreaterThan(Integer value) {
            addCriterion("AccessoryType >", value, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessoryType >=", value, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeLessThan(Integer value) {
            addCriterion("AccessoryType <", value, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("AccessoryType <=", value, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeIn(List<Integer> values) {
            addCriterion("AccessoryType in", values, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeNotIn(List<Integer> values) {
            addCriterion("AccessoryType not in", values, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryType between", value1, value2, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andAccessoryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryType not between", value1, value2, "accessoryType");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathIsNull() {
            addCriterion("AccessoryPath is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathIsNotNull() {
            addCriterion("AccessoryPath is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathEqualTo(String value) {
            addCriterion("AccessoryPath =", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathNotEqualTo(String value) {
            addCriterion("AccessoryPath <>", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathGreaterThan(String value) {
            addCriterion("AccessoryPath >", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathGreaterThanOrEqualTo(String value) {
            addCriterion("AccessoryPath >=", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathLessThan(String value) {
            addCriterion("AccessoryPath <", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathLessThanOrEqualTo(String value) {
            addCriterion("AccessoryPath <=", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathLike(String value) {
            addCriterion("AccessoryPath like", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathNotLike(String value) {
            addCriterion("AccessoryPath not like", value, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathIn(List<String> values) {
            addCriterion("AccessoryPath in", values, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathNotIn(List<String> values) {
            addCriterion("AccessoryPath not in", values, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathBetween(String value1, String value2) {
            addCriterion("AccessoryPath between", value1, value2, "accessoryPath");
            return (Criteria) this;
        }

        public Criteria andAccessoryPathNotBetween(String value1, String value2) {
            addCriterion("AccessoryPath not between", value1, value2, "accessoryPath");
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