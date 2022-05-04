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

        public Criteria andAccessoryidIsNull() {
            addCriterion("AccessoryId is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryidIsNotNull() {
            addCriterion("AccessoryId is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryidEqualTo(Integer value) {
            addCriterion("AccessoryId =", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotEqualTo(Integer value) {
            addCriterion("AccessoryId <>", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidGreaterThan(Integer value) {
            addCriterion("AccessoryId >", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessoryId >=", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLessThan(Integer value) {
            addCriterion("AccessoryId <", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLessThanOrEqualTo(Integer value) {
            addCriterion("AccessoryId <=", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidIn(List<Integer> values) {
            addCriterion("AccessoryId in", values, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotIn(List<Integer> values) {
            addCriterion("AccessoryId not in", values, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryId between", value1, value2, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryId not between", value1, value2, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andFileidIsNull() {
            addCriterion("FileId is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("FileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(Integer value) {
            addCriterion("FileId =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(Integer value) {
            addCriterion("FileId <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(Integer value) {
            addCriterion("FileId >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileId >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(Integer value) {
            addCriterion("FileId <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(Integer value) {
            addCriterion("FileId <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<Integer> values) {
            addCriterion("FileId in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<Integer> values) {
            addCriterion("FileId not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(Integer value1, Integer value2) {
            addCriterion("FileId between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("FileId not between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIsNull() {
            addCriterion("AccessoryName is null");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIsNotNull() {
            addCriterion("AccessoryName is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorynameEqualTo(String value) {
            addCriterion("AccessoryName =", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotEqualTo(String value) {
            addCriterion("AccessoryName <>", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameGreaterThan(String value) {
            addCriterion("AccessoryName >", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameGreaterThanOrEqualTo(String value) {
            addCriterion("AccessoryName >=", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLessThan(String value) {
            addCriterion("AccessoryName <", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLessThanOrEqualTo(String value) {
            addCriterion("AccessoryName <=", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLike(String value) {
            addCriterion("AccessoryName like", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotLike(String value) {
            addCriterion("AccessoryName not like", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIn(List<String> values) {
            addCriterion("AccessoryName in", values, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotIn(List<String> values) {
            addCriterion("AccessoryName not in", values, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameBetween(String value1, String value2) {
            addCriterion("AccessoryName between", value1, value2, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotBetween(String value1, String value2) {
            addCriterion("AccessoryName not between", value1, value2, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeIsNull() {
            addCriterion("AccessorySize is null");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeIsNotNull() {
            addCriterion("AccessorySize is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeEqualTo(Integer value) {
            addCriterion("AccessorySize =", value, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeNotEqualTo(Integer value) {
            addCriterion("AccessorySize <>", value, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeGreaterThan(Integer value) {
            addCriterion("AccessorySize >", value, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessorySize >=", value, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeLessThan(Integer value) {
            addCriterion("AccessorySize <", value, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeLessThanOrEqualTo(Integer value) {
            addCriterion("AccessorySize <=", value, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeIn(List<Integer> values) {
            addCriterion("AccessorySize in", values, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeNotIn(List<Integer> values) {
            addCriterion("AccessorySize not in", values, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeBetween(Integer value1, Integer value2) {
            addCriterion("AccessorySize between", value1, value2, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorysizeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessorySize not between", value1, value2, "accessorysize");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIsNull() {
            addCriterion("AccessoryType is null");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIsNotNull() {
            addCriterion("AccessoryType is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeEqualTo(Integer value) {
            addCriterion("AccessoryType =", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotEqualTo(Integer value) {
            addCriterion("AccessoryType <>", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeGreaterThan(Integer value) {
            addCriterion("AccessoryType >", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessoryType >=", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeLessThan(Integer value) {
            addCriterion("AccessoryType <", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeLessThanOrEqualTo(Integer value) {
            addCriterion("AccessoryType <=", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIn(List<Integer> values) {
            addCriterion("AccessoryType in", values, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotIn(List<Integer> values) {
            addCriterion("AccessoryType not in", values, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryType between", value1, value2, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessoryType not between", value1, value2, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andAccessorypathIsNull() {
            addCriterion("AccessoryPath is null");
            return (Criteria) this;
        }

        public Criteria andAccessorypathIsNotNull() {
            addCriterion("AccessoryPath is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorypathEqualTo(String value) {
            addCriterion("AccessoryPath =", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathNotEqualTo(String value) {
            addCriterion("AccessoryPath <>", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathGreaterThan(String value) {
            addCriterion("AccessoryPath >", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathGreaterThanOrEqualTo(String value) {
            addCriterion("AccessoryPath >=", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathLessThan(String value) {
            addCriterion("AccessoryPath <", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathLessThanOrEqualTo(String value) {
            addCriterion("AccessoryPath <=", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathLike(String value) {
            addCriterion("AccessoryPath like", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathNotLike(String value) {
            addCriterion("AccessoryPath not like", value, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathIn(List<String> values) {
            addCriterion("AccessoryPath in", values, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathNotIn(List<String> values) {
            addCriterion("AccessoryPath not in", values, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathBetween(String value1, String value2) {
            addCriterion("AccessoryPath between", value1, value2, "accessorypath");
            return (Criteria) this;
        }

        public Criteria andAccessorypathNotBetween(String value1, String value2) {
            addCriterion("AccessoryPath not between", value1, value2, "accessorypath");
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