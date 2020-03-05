package com.yan.crowdfunding.entity;

import java.util.ArrayList;
import java.util.List;

public class OptimizerTraceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OptimizerTraceExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andMissingBytesBeyondMaxMemSizeIsNull() {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeIsNotNull() {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE =", value, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeNotEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE <>", value, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeGreaterThan(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE >", value, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE >=", value, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeLessThan(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE <", value, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeLessThanOrEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE <=", value, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeIn(List<Integer> values) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE in", values, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeNotIn(List<Integer> values) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE not in", values, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeBetween(Integer value1, Integer value2) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE between", value1, value2, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andMissingBytesBeyondMaxMemSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE not between", value1, value2, "missingBytesBeyondMaxMemSize");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesIsNull() {
            addCriterion("INSUFFICIENT_PRIVILEGES is null");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesIsNotNull() {
            addCriterion("INSUFFICIENT_PRIVILEGES is not null");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES =", value, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesNotEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES <>", value, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesGreaterThan(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES >", value, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES >=", value, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesLessThan(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES <", value, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesLessThanOrEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES <=", value, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesIn(List<Boolean> values) {
            addCriterion("INSUFFICIENT_PRIVILEGES in", values, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesNotIn(List<Boolean> values) {
            addCriterion("INSUFFICIENT_PRIVILEGES not in", values, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesBetween(Boolean value1, Boolean value2) {
            addCriterion("INSUFFICIENT_PRIVILEGES between", value1, value2, "insufficientPrivileges");
            return (Criteria) this;
        }

        public Criteria andInsufficientPrivilegesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("INSUFFICIENT_PRIVILEGES not between", value1, value2, "insufficientPrivileges");
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