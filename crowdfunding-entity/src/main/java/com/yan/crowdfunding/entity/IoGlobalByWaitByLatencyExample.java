package com.yan.crowdfunding.entity;

import java.util.ArrayList;
import java.util.List;

public class IoGlobalByWaitByLatencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IoGlobalByWaitByLatencyExample() {
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

        public Criteria andEventNameIsNull() {
            addCriterion("event_name is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("event_name is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("event_name =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("event_name <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("event_name >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("event_name >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("event_name <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("event_name <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("event_name like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("event_name not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("event_name in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("event_name not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("event_name between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("event_name not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNull() {
            addCriterion("count_read is null");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNotNull() {
            addCriterion("count_read is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadEqualTo(Long value) {
            addCriterion("count_read =", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotEqualTo(Long value) {
            addCriterion("count_read <>", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThan(Long value) {
            addCriterion("count_read >", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThanOrEqualTo(Long value) {
            addCriterion("count_read >=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThan(Long value) {
            addCriterion("count_read <", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThanOrEqualTo(Long value) {
            addCriterion("count_read <=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadIn(List<Long> values) {
            addCriterion("count_read in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotIn(List<Long> values) {
            addCriterion("count_read not in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadBetween(Long value1, Long value2) {
            addCriterion("count_read between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotBetween(Long value1, Long value2) {
            addCriterion("count_read not between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNull() {
            addCriterion("count_write is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNotNull() {
            addCriterion("count_write is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteEqualTo(Long value) {
            addCriterion("count_write =", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotEqualTo(Long value) {
            addCriterion("count_write <>", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThan(Long value) {
            addCriterion("count_write >", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("count_write >=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThan(Long value) {
            addCriterion("count_write <", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThanOrEqualTo(Long value) {
            addCriterion("count_write <=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteIn(List<Long> values) {
            addCriterion("count_write in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotIn(List<Long> values) {
            addCriterion("count_write not in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteBetween(Long value1, Long value2) {
            addCriterion("count_write between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotBetween(Long value1, Long value2) {
            addCriterion("count_write not between", value1, value2, "countWrite");
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