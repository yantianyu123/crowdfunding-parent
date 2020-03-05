package com.yan.crowdfunding.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysConfigExample() {
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

        public Criteria andVariableIsNull() {
            addCriterion("variable is null");
            return (Criteria) this;
        }

        public Criteria andVariableIsNotNull() {
            addCriterion("variable is not null");
            return (Criteria) this;
        }

        public Criteria andVariableEqualTo(String value) {
            addCriterion("variable =", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableNotEqualTo(String value) {
            addCriterion("variable <>", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableGreaterThan(String value) {
            addCriterion("variable >", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableGreaterThanOrEqualTo(String value) {
            addCriterion("variable >=", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableLessThan(String value) {
            addCriterion("variable <", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableLessThanOrEqualTo(String value) {
            addCriterion("variable <=", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableLike(String value) {
            addCriterion("variable like", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableNotLike(String value) {
            addCriterion("variable not like", value, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableIn(List<String> values) {
            addCriterion("variable in", values, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableNotIn(List<String> values) {
            addCriterion("variable not in", values, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableBetween(String value1, String value2) {
            addCriterion("variable between", value1, value2, "variable");
            return (Criteria) this;
        }

        public Criteria andVariableNotBetween(String value1, String value2) {
            addCriterion("variable not between", value1, value2, "variable");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNull() {
            addCriterion("set_time is null");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNotNull() {
            addCriterion("set_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetTimeEqualTo(Date value) {
            addCriterion("set_time =", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotEqualTo(Date value) {
            addCriterion("set_time <>", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThan(Date value) {
            addCriterion("set_time >", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("set_time >=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThan(Date value) {
            addCriterion("set_time <", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThanOrEqualTo(Date value) {
            addCriterion("set_time <=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIn(List<Date> values) {
            addCriterion("set_time in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotIn(List<Date> values) {
            addCriterion("set_time not in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeBetween(Date value1, Date value2) {
            addCriterion("set_time between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotBetween(Date value1, Date value2) {
            addCriterion("set_time not between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetByIsNull() {
            addCriterion("set_by is null");
            return (Criteria) this;
        }

        public Criteria andSetByIsNotNull() {
            addCriterion("set_by is not null");
            return (Criteria) this;
        }

        public Criteria andSetByEqualTo(String value) {
            addCriterion("set_by =", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByNotEqualTo(String value) {
            addCriterion("set_by <>", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByGreaterThan(String value) {
            addCriterion("set_by >", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByGreaterThanOrEqualTo(String value) {
            addCriterion("set_by >=", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByLessThan(String value) {
            addCriterion("set_by <", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByLessThanOrEqualTo(String value) {
            addCriterion("set_by <=", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByLike(String value) {
            addCriterion("set_by like", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByNotLike(String value) {
            addCriterion("set_by not like", value, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByIn(List<String> values) {
            addCriterion("set_by in", values, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByNotIn(List<String> values) {
            addCriterion("set_by not in", values, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByBetween(String value1, String value2) {
            addCriterion("set_by between", value1, value2, "setBy");
            return (Criteria) this;
        }

        public Criteria andSetByNotBetween(String value1, String value2) {
            addCriterion("set_by not between", value1, value2, "setBy");
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