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

        public Criteria andDepartIdIsNull() {
            addCriterion("DepartId is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DepartId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(Integer value) {
            addCriterion("DepartId =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(Integer value) {
            addCriterion("DepartId <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(Integer value) {
            addCriterion("DepartId >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartId >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(Integer value) {
            addCriterion("DepartId <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(Integer value) {
            addCriterion("DepartId <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<Integer> values) {
            addCriterion("DepartId in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<Integer> values) {
            addCriterion("DepartId not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(Integer value1, Integer value2) {
            addCriterion("DepartId between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartId not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("DepartName is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("DepartName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("DepartName =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("DepartName <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("DepartName >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartName >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("DepartName <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("DepartName <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("DepartName like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("DepartName not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("DepartName in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("DepartName not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("DepartName between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("DepartName not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserIsNull() {
            addCriterion("PrincipalUser is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserIsNotNull() {
            addCriterion("PrincipalUser is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserEqualTo(String value) {
            addCriterion("PrincipalUser =", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserNotEqualTo(String value) {
            addCriterion("PrincipalUser <>", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserGreaterThan(String value) {
            addCriterion("PrincipalUser >", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserGreaterThanOrEqualTo(String value) {
            addCriterion("PrincipalUser >=", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserLessThan(String value) {
            addCriterion("PrincipalUser <", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserLessThanOrEqualTo(String value) {
            addCriterion("PrincipalUser <=", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserLike(String value) {
            addCriterion("PrincipalUser like", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserNotLike(String value) {
            addCriterion("PrincipalUser not like", value, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserIn(List<String> values) {
            addCriterion("PrincipalUser in", values, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserNotIn(List<String> values) {
            addCriterion("PrincipalUser not in", values, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserBetween(String value1, String value2) {
            addCriterion("PrincipalUser between", value1, value2, "principalUser");
            return (Criteria) this;
        }

        public Criteria andPrincipalUserNotBetween(String value1, String value2) {
            addCriterion("PrincipalUser not between", value1, value2, "principalUser");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoIsNull() {
            addCriterion("ConnectTelNo is null");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoIsNotNull() {
            addCriterion("ConnectTelNo is not null");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoEqualTo(Long value) {
            addCriterion("ConnectTelNo =", value, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoNotEqualTo(Long value) {
            addCriterion("ConnectTelNo <>", value, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoGreaterThan(Long value) {
            addCriterion("ConnectTelNo >", value, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoGreaterThanOrEqualTo(Long value) {
            addCriterion("ConnectTelNo >=", value, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoLessThan(Long value) {
            addCriterion("ConnectTelNo <", value, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoLessThanOrEqualTo(Long value) {
            addCriterion("ConnectTelNo <=", value, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoIn(List<Long> values) {
            addCriterion("ConnectTelNo in", values, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoNotIn(List<Long> values) {
            addCriterion("ConnectTelNo not in", values, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoBetween(Long value1, Long value2) {
            addCriterion("ConnectTelNo between", value1, value2, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectTelNoNotBetween(Long value1, Long value2) {
            addCriterion("ConnectTelNo not between", value1, value2, "connectTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoIsNull() {
            addCriterion("ConnectMobileTelNo is null");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoIsNotNull() {
            addCriterion("ConnectMobileTelNo is not null");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo =", value, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoNotEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo <>", value, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoGreaterThan(Long value) {
            addCriterion("ConnectMobileTelNo >", value, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoGreaterThanOrEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo >=", value, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoLessThan(Long value) {
            addCriterion("ConnectMobileTelNo <", value, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoLessThanOrEqualTo(Long value) {
            addCriterion("ConnectMobileTelNo <=", value, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoIn(List<Long> values) {
            addCriterion("ConnectMobileTelNo in", values, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoNotIn(List<Long> values) {
            addCriterion("ConnectMobileTelNo not in", values, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoBetween(Long value1, Long value2) {
            addCriterion("ConnectMobileTelNo between", value1, value2, "connectMobileTelNo");
            return (Criteria) this;
        }

        public Criteria andConnectMobileTelNoNotBetween(Long value1, Long value2) {
            addCriterion("ConnectMobileTelNo not between", value1, value2, "connectMobileTelNo");
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

        public Criteria andBranchIdIsNull() {
            addCriterion("BranchId is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BranchId is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(Integer value) {
            addCriterion("BranchId =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(Integer value) {
            addCriterion("BranchId <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(Integer value) {
            addCriterion("BranchId >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BranchId >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(Integer value) {
            addCriterion("BranchId <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("BranchId <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<Integer> values) {
            addCriterion("BranchId in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<Integer> values) {
            addCriterion("BranchId not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("BranchId between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BranchId not between", value1, value2, "branchId");
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