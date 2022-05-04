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

        public Criteria andFiletypeidIsNull() {
            addCriterion("FileTypeId is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeidIsNotNull() {
            addCriterion("FileTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeidEqualTo(Integer value) {
            addCriterion("FileTypeId =", value, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidNotEqualTo(Integer value) {
            addCriterion("FileTypeId <>", value, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidGreaterThan(Integer value) {
            addCriterion("FileTypeId >", value, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileTypeId >=", value, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidLessThan(Integer value) {
            addCriterion("FileTypeId <", value, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FileTypeId <=", value, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidIn(List<Integer> values) {
            addCriterion("FileTypeId in", values, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidNotIn(List<Integer> values) {
            addCriterion("FileTypeId not in", values, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidBetween(Integer value1, Integer value2) {
            addCriterion("FileTypeId between", value1, value2, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FileTypeId not between", value1, value2, "filetypeid");
            return (Criteria) this;
        }

        public Criteria andFiletypenameIsNull() {
            addCriterion("FileTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFiletypenameIsNotNull() {
            addCriterion("FileTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypenameEqualTo(String value) {
            addCriterion("FileTypeName =", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameNotEqualTo(String value) {
            addCriterion("FileTypeName <>", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameGreaterThan(String value) {
            addCriterion("FileTypeName >", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileTypeName >=", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameLessThan(String value) {
            addCriterion("FileTypeName <", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameLessThanOrEqualTo(String value) {
            addCriterion("FileTypeName <=", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameLike(String value) {
            addCriterion("FileTypeName like", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameNotLike(String value) {
            addCriterion("FileTypeName not like", value, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameIn(List<String> values) {
            addCriterion("FileTypeName in", values, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameNotIn(List<String> values) {
            addCriterion("FileTypeName not in", values, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameBetween(String value1, String value2) {
            addCriterion("FileTypeName between", value1, value2, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypenameNotBetween(String value1, String value2) {
            addCriterion("FileTypeName not between", value1, value2, "filetypename");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageIsNull() {
            addCriterion("FileTypeImage is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageIsNotNull() {
            addCriterion("FileTypeImage is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageEqualTo(String value) {
            addCriterion("FileTypeImage =", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageNotEqualTo(String value) {
            addCriterion("FileTypeImage <>", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageGreaterThan(String value) {
            addCriterion("FileTypeImage >", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageGreaterThanOrEqualTo(String value) {
            addCriterion("FileTypeImage >=", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageLessThan(String value) {
            addCriterion("FileTypeImage <", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageLessThanOrEqualTo(String value) {
            addCriterion("FileTypeImage <=", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageLike(String value) {
            addCriterion("FileTypeImage like", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageNotLike(String value) {
            addCriterion("FileTypeImage not like", value, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageIn(List<String> values) {
            addCriterion("FileTypeImage in", values, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageNotIn(List<String> values) {
            addCriterion("FileTypeImage not in", values, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageBetween(String value1, String value2) {
            addCriterion("FileTypeImage between", value1, value2, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypeimageNotBetween(String value1, String value2) {
            addCriterion("FileTypeImage not between", value1, value2, "filetypeimage");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixIsNull() {
            addCriterion("FileTypeSuffix is null");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixIsNotNull() {
            addCriterion("FileTypeSuffix is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixEqualTo(String value) {
            addCriterion("FileTypeSuffix =", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixNotEqualTo(String value) {
            addCriterion("FileTypeSuffix <>", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixGreaterThan(String value) {
            addCriterion("FileTypeSuffix >", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixGreaterThanOrEqualTo(String value) {
            addCriterion("FileTypeSuffix >=", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixLessThan(String value) {
            addCriterion("FileTypeSuffix <", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixLessThanOrEqualTo(String value) {
            addCriterion("FileTypeSuffix <=", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixLike(String value) {
            addCriterion("FileTypeSuffix like", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixNotLike(String value) {
            addCriterion("FileTypeSuffix not like", value, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixIn(List<String> values) {
            addCriterion("FileTypeSuffix in", values, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixNotIn(List<String> values) {
            addCriterion("FileTypeSuffix not in", values, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixBetween(String value1, String value2) {
            addCriterion("FileTypeSuffix between", value1, value2, "filetypesuffix");
            return (Criteria) this;
        }

        public Criteria andFiletypesuffixNotBetween(String value1, String value2) {
            addCriterion("FileTypeSuffix not between", value1, value2, "filetypesuffix");
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