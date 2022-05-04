package com.rea.myoffice.model;

import java.util.ArrayList;
import java.util.List;

public class DepartinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartinfoExample() {
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

        public Criteria andDepartidIsNull() {
            addCriterion("DepartId is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("DepartId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(Integer value) {
            addCriterion("DepartId =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(Integer value) {
            addCriterion("DepartId <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(Integer value) {
            addCriterion("DepartId >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartId >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(Integer value) {
            addCriterion("DepartId <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartId <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<Integer> values) {
            addCriterion("DepartId in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<Integer> values) {
            addCriterion("DepartId not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(Integer value1, Integer value2) {
            addCriterion("DepartId between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartId not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNull() {
            addCriterion("DepartName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("DepartName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("DepartName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("DepartName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("DepartName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("DepartName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("DepartName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("DepartName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("DepartName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("DepartName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("DepartName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("DepartName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("DepartName not between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserIsNull() {
            addCriterion("PrincipalUser is null");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserIsNotNull() {
            addCriterion("PrincipalUser is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserEqualTo(String value) {
            addCriterion("PrincipalUser =", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserNotEqualTo(String value) {
            addCriterion("PrincipalUser <>", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserGreaterThan(String value) {
            addCriterion("PrincipalUser >", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserGreaterThanOrEqualTo(String value) {
            addCriterion("PrincipalUser >=", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserLessThan(String value) {
            addCriterion("PrincipalUser <", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserLessThanOrEqualTo(String value) {
            addCriterion("PrincipalUser <=", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserLike(String value) {
            addCriterion("PrincipalUser like", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserNotLike(String value) {
            addCriterion("PrincipalUser not like", value, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserIn(List<String> values) {
            addCriterion("PrincipalUser in", values, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserNotIn(List<String> values) {
            addCriterion("PrincipalUser not in", values, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserBetween(String value1, String value2) {
            addCriterion("PrincipalUser between", value1, value2, "principaluser");
            return (Criteria) this;
        }

        public Criteria andPrincipaluserNotBetween(String value1, String value2) {
            addCriterion("PrincipalUser not between", value1, value2, "principaluser");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoIsNull() {
            addCriterion("ConnectTelNo is null");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoIsNotNull() {
            addCriterion("ConnectTelNo is not null");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoEqualTo(Long value) {
            addCriterion("ConnectTelNo =", value, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoNotEqualTo(Long value) {
            addCriterion("ConnectTelNo <>", value, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoGreaterThan(Long value) {
            addCriterion("ConnectTelNo >", value, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("ConnectTelNo >=", value, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoLessThan(Long value) {
            addCriterion("ConnectTelNo <", value, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoLessThanOrEqualTo(Long value) {
            addCriterion("ConnectTelNo <=", value, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoIn(List<Long> values) {
            addCriterion("ConnectTelNo in", values, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoNotIn(List<Long> values) {
            addCriterion("ConnectTelNo not in", values, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoBetween(Long value1, Long value2) {
            addCriterion("ConnectTelNo between", value1, value2, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnecttelnoNotBetween(Long value1, Long value2) {
            addCriterion("ConnectTelNo not between", value1, value2, "connecttelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoIsNull() {
            addCriterion("ConnectMobileTelNo is null");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoIsNotNull() {
            addCriterion("ConnectMobileTelNo is not null");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo =", value, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoNotEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo <>", value, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoGreaterThan(Long value) {
            addCriterion("ConnectMobileTelNo >", value, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo >=", value, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoLessThan(Long value) {
            addCriterion("ConnectMobileTelNo <", value, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoLessThanOrEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo <=", value, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoIn(List<Long> values) {
            addCriterion("ConnectMobileTelNo in", values, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoNotIn(List<Long> values) {
            addCriterion("ConnectMobileTelNo not in", values, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoBetween(Long value1, Long value2) {
            addCriterion("ConnectMobileTelNo between", value1, value2, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andConnectmobiletelnoNotBetween(Long value1, Long value2) {
            addCriterion("ConnectMobileTelNo not between", value1, value2, "connectmobiletelno");
            return (Criteria) this;
        }

        public Criteria andFaxesIsNull() {
            addCriterion("Faxes is null");
            return (Criteria) this;
        }

        public Criteria andFaxesIsNotNull() {
            addCriterion("Faxes is not null");
            return (Criteria) this;
        }

        public Criteria andFaxesEqualTo(Long value) {
            addCriterion("Faxes =", value, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesNotEqualTo(Long value) {
            addCriterion("Faxes <>", value, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesGreaterThan(Long value) {
            addCriterion("Faxes >", value, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesGreaterThanOrEqualTo(Long value) {
            addCriterion("Faxes >=", value, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesLessThan(Long value) {
            addCriterion("Faxes <", value, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesLessThanOrEqualTo(Long value) {
            addCriterion("Faxes <=", value, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesIn(List<Long> values) {
            addCriterion("Faxes in", values, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesNotIn(List<Long> values) {
            addCriterion("Faxes not in", values, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesBetween(Long value1, Long value2) {
            addCriterion("Faxes between", value1, value2, "faxes");
            return (Criteria) this;
        }

        public Criteria andFaxesNotBetween(Long value1, Long value2) {
            addCriterion("Faxes not between", value1, value2, "faxes");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNull() {
            addCriterion("BranchId is null");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNotNull() {
            addCriterion("BranchId is not null");
            return (Criteria) this;
        }

        public Criteria andBranchidEqualTo(Integer value) {
            addCriterion("BranchId =", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotEqualTo(Integer value) {
            addCriterion("BranchId <>", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThan(Integer value) {
            addCriterion("BranchId >", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BranchId >=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThan(Integer value) {
            addCriterion("BranchId <", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThanOrEqualTo(Integer value) {
            addCriterion("BranchId <=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidIn(List<Integer> values) {
            addCriterion("BranchId in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotIn(List<Integer> values) {
            addCriterion("BranchId not in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidBetween(Integer value1, Integer value2) {
            addCriterion("BranchId between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("BranchId not between", value1, value2, "branchid");
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