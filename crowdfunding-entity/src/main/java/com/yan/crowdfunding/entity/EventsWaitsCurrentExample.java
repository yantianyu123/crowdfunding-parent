package com.yan.crowdfunding.entity;

import java.util.ArrayList;
import java.util.List;

public class EventsWaitsCurrentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsWaitsCurrentExample() {
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

        public Criteria andThreadIdIsNull() {
            addCriterion("THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("THREAD_ID =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("THREAD_ID <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("THREAD_ID >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("THREAD_ID <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("THREAD_ID in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("THREAD_ID not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdIsNull() {
            addCriterion("END_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEndEventIdIsNotNull() {
            addCriterion("END_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEndEventIdEqualTo(Long value) {
            addCriterion("END_EVENT_ID =", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdNotEqualTo(Long value) {
            addCriterion("END_EVENT_ID <>", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdGreaterThan(Long value) {
            addCriterion("END_EVENT_ID >", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("END_EVENT_ID >=", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdLessThan(Long value) {
            addCriterion("END_EVENT_ID <", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdLessThanOrEqualTo(Long value) {
            addCriterion("END_EVENT_ID <=", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdIn(List<Long> values) {
            addCriterion("END_EVENT_ID in", values, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdNotIn(List<Long> values) {
            addCriterion("END_EVENT_ID not in", values, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdBetween(Long value1, Long value2) {
            addCriterion("END_EVENT_ID between", value1, value2, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdNotBetween(Long value1, Long value2) {
            addCriterion("END_EVENT_ID not between", value1, value2, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNull() {
            addCriterion("EVENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("EVENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("EVENT_NAME =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("EVENT_NAME <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("EVENT_NAME >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("EVENT_NAME <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("EVENT_NAME like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("EVENT_NAME not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("EVENT_NAME in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("EVENT_NAME not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("EVENT_NAME between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("EVENT_NAME not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andTimerStartIsNull() {
            addCriterion("TIMER_START is null");
            return (Criteria) this;
        }

        public Criteria andTimerStartIsNotNull() {
            addCriterion("TIMER_START is not null");
            return (Criteria) this;
        }

        public Criteria andTimerStartEqualTo(Long value) {
            addCriterion("TIMER_START =", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartNotEqualTo(Long value) {
            addCriterion("TIMER_START <>", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartGreaterThan(Long value) {
            addCriterion("TIMER_START >", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_START >=", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartLessThan(Long value) {
            addCriterion("TIMER_START <", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_START <=", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartIn(List<Long> values) {
            addCriterion("TIMER_START in", values, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartNotIn(List<Long> values) {
            addCriterion("TIMER_START not in", values, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartBetween(Long value1, Long value2) {
            addCriterion("TIMER_START between", value1, value2, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_START not between", value1, value2, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerEndIsNull() {
            addCriterion("TIMER_END is null");
            return (Criteria) this;
        }

        public Criteria andTimerEndIsNotNull() {
            addCriterion("TIMER_END is not null");
            return (Criteria) this;
        }

        public Criteria andTimerEndEqualTo(Long value) {
            addCriterion("TIMER_END =", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndNotEqualTo(Long value) {
            addCriterion("TIMER_END <>", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndGreaterThan(Long value) {
            addCriterion("TIMER_END >", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_END >=", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndLessThan(Long value) {
            addCriterion("TIMER_END <", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_END <=", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndIn(List<Long> values) {
            addCriterion("TIMER_END in", values, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndNotIn(List<Long> values) {
            addCriterion("TIMER_END not in", values, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndBetween(Long value1, Long value2) {
            addCriterion("TIMER_END between", value1, value2, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_END not between", value1, value2, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerWaitIsNull() {
            addCriterion("TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andTimerWaitIsNotNull() {
            addCriterion("TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimerWaitEqualTo(Long value) {
            addCriterion("TIMER_WAIT =", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitNotEqualTo(Long value) {
            addCriterion("TIMER_WAIT <>", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitGreaterThan(Long value) {
            addCriterion("TIMER_WAIT >", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_WAIT >=", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitLessThan(Long value) {
            addCriterion("TIMER_WAIT <", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_WAIT <=", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitIn(List<Long> values) {
            addCriterion("TIMER_WAIT in", values, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitNotIn(List<Long> values) {
            addCriterion("TIMER_WAIT not in", values, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitBetween(Long value1, Long value2) {
            addCriterion("TIMER_WAIT between", value1, value2, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_WAIT not between", value1, value2, "timerWait");
            return (Criteria) this;
        }

        public Criteria andSpinsIsNull() {
            addCriterion("SPINS is null");
            return (Criteria) this;
        }

        public Criteria andSpinsIsNotNull() {
            addCriterion("SPINS is not null");
            return (Criteria) this;
        }

        public Criteria andSpinsEqualTo(Integer value) {
            addCriterion("SPINS =", value, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsNotEqualTo(Integer value) {
            addCriterion("SPINS <>", value, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsGreaterThan(Integer value) {
            addCriterion("SPINS >", value, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPINS >=", value, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsLessThan(Integer value) {
            addCriterion("SPINS <", value, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsLessThanOrEqualTo(Integer value) {
            addCriterion("SPINS <=", value, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsIn(List<Integer> values) {
            addCriterion("SPINS in", values, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsNotIn(List<Integer> values) {
            addCriterion("SPINS not in", values, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsBetween(Integer value1, Integer value2) {
            addCriterion("SPINS between", value1, value2, "spins");
            return (Criteria) this;
        }

        public Criteria andSpinsNotBetween(Integer value1, Integer value2) {
            addCriterion("SPINS not between", value1, value2, "spins");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNull() {
            addCriterion("OBJECT_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNotNull() {
            addCriterion("OBJECT_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA =", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA <>", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThan(String value) {
            addCriterion("OBJECT_SCHEMA >", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA >=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThan(String value) {
            addCriterion("OBJECT_SCHEMA <", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA <=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLike(String value) {
            addCriterion("OBJECT_SCHEMA like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotLike(String value) {
            addCriterion("OBJECT_SCHEMA not like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIn(List<String> values) {
            addCriterion("OBJECT_SCHEMA in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotIn(List<String> values) {
            addCriterion("OBJECT_SCHEMA not in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaBetween(String value1, String value2) {
            addCriterion("OBJECT_SCHEMA between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotBetween(String value1, String value2) {
            addCriterion("OBJECT_SCHEMA not between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("OBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("OBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("OBJECT_NAME =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("OBJECT_NAME <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("OBJECT_NAME >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(String value) {
            addCriterion("OBJECT_NAME <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLike(String value) {
            addCriterion("OBJECT_NAME like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotLike(String value) {
            addCriterion("OBJECT_NAME not like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<String> values) {
            addCriterion("OBJECT_NAME in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<String> values) {
            addCriterion("OBJECT_NAME not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNull() {
            addCriterion("INDEX_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNotNull() {
            addCriterion("INDEX_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNameEqualTo(String value) {
            addCriterion("INDEX_NAME =", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotEqualTo(String value) {
            addCriterion("INDEX_NAME <>", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThan(String value) {
            addCriterion("INDEX_NAME >", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_NAME >=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThan(String value) {
            addCriterion("INDEX_NAME <", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThanOrEqualTo(String value) {
            addCriterion("INDEX_NAME <=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLike(String value) {
            addCriterion("INDEX_NAME like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotLike(String value) {
            addCriterion("INDEX_NAME not like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIn(List<String> values) {
            addCriterion("INDEX_NAME in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotIn(List<String> values) {
            addCriterion("INDEX_NAME not in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameBetween(String value1, String value2) {
            addCriterion("INDEX_NAME between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotBetween(String value1, String value2) {
            addCriterion("INDEX_NAME not between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNull() {
            addCriterion("OBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("OBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeEqualTo(String value) {
            addCriterion("OBJECT_TYPE =", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotEqualTo(String value) {
            addCriterion("OBJECT_TYPE <>", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThan(String value) {
            addCriterion("OBJECT_TYPE >", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_TYPE >=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThan(String value) {
            addCriterion("OBJECT_TYPE <", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_TYPE <=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLike(String value) {
            addCriterion("OBJECT_TYPE like", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotLike(String value) {
            addCriterion("OBJECT_TYPE not like", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIn(List<String> values) {
            addCriterion("OBJECT_TYPE in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotIn(List<String> values) {
            addCriterion("OBJECT_TYPE not in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_TYPE between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_TYPE not between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginIsNull() {
            addCriterion("OBJECT_INSTANCE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginIsNotNull() {
            addCriterion("OBJECT_INSTANCE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN =", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginNotEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN <>", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginGreaterThan(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN >", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN >=", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginLessThan(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN <", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN <=", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginIn(List<Long> values) {
            addCriterion("OBJECT_INSTANCE_BEGIN in", values, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginNotIn(List<Long> values) {
            addCriterion("OBJECT_INSTANCE_BEGIN not in", values, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginBetween(Long value1, Long value2) {
            addCriterion("OBJECT_INSTANCE_BEGIN between", value1, value2, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_INSTANCE_BEGIN not between", value1, value2, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdIsNull() {
            addCriterion("NESTING_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdIsNotNull() {
            addCriterion("NESTING_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID =", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdNotEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID <>", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdGreaterThan(Long value) {
            addCriterion("NESTING_EVENT_ID >", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID >=", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdLessThan(Long value) {
            addCriterion("NESTING_EVENT_ID <", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdLessThanOrEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID <=", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdIn(List<Long> values) {
            addCriterion("NESTING_EVENT_ID in", values, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdNotIn(List<Long> values) {
            addCriterion("NESTING_EVENT_ID not in", values, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdBetween(Long value1, Long value2) {
            addCriterion("NESTING_EVENT_ID between", value1, value2, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdNotBetween(Long value1, Long value2) {
            addCriterion("NESTING_EVENT_ID not between", value1, value2, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeIsNull() {
            addCriterion("NESTING_EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeIsNotNull() {
            addCriterion("NESTING_EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE =", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE <>", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeGreaterThan(String value) {
            addCriterion("NESTING_EVENT_TYPE >", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE >=", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeLessThan(String value) {
            addCriterion("NESTING_EVENT_TYPE <", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeLessThanOrEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE <=", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeLike(String value) {
            addCriterion("NESTING_EVENT_TYPE like", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotLike(String value) {
            addCriterion("NESTING_EVENT_TYPE not like", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeIn(List<String> values) {
            addCriterion("NESTING_EVENT_TYPE in", values, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotIn(List<String> values) {
            addCriterion("NESTING_EVENT_TYPE not in", values, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeBetween(String value1, String value2) {
            addCriterion("NESTING_EVENT_TYPE between", value1, value2, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotBetween(String value1, String value2) {
            addCriterion("NESTING_EVENT_TYPE not between", value1, value2, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("OPERATION =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("OPERATION <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("OPERATION >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("OPERATION <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("OPERATION <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("OPERATION like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("OPERATION not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("OPERATION in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("OPERATION not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("OPERATION between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("OPERATION not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesIsNull() {
            addCriterion("NUMBER_OF_BYTES is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesIsNotNull() {
            addCriterion("NUMBER_OF_BYTES is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesEqualTo(Long value) {
            addCriterion("NUMBER_OF_BYTES =", value, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesNotEqualTo(Long value) {
            addCriterion("NUMBER_OF_BYTES <>", value, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesGreaterThan(Long value) {
            addCriterion("NUMBER_OF_BYTES >", value, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_BYTES >=", value, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesLessThan(Long value) {
            addCriterion("NUMBER_OF_BYTES <", value, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesLessThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_BYTES <=", value, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesIn(List<Long> values) {
            addCriterion("NUMBER_OF_BYTES in", values, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesNotIn(List<Long> values) {
            addCriterion("NUMBER_OF_BYTES not in", values, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_BYTES between", value1, value2, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andNumberOfBytesNotBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_BYTES not between", value1, value2, "numberOfBytes");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNull() {
            addCriterion("FLAGS is null");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNotNull() {
            addCriterion("FLAGS is not null");
            return (Criteria) this;
        }

        public Criteria andFlagsEqualTo(Integer value) {
            addCriterion("FLAGS =", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotEqualTo(Integer value) {
            addCriterion("FLAGS <>", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThan(Integer value) {
            addCriterion("FLAGS >", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLAGS >=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThan(Integer value) {
            addCriterion("FLAGS <", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThanOrEqualTo(Integer value) {
            addCriterion("FLAGS <=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsIn(List<Integer> values) {
            addCriterion("FLAGS in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotIn(List<Integer> values) {
            addCriterion("FLAGS not in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsBetween(Integer value1, Integer value2) {
            addCriterion("FLAGS between", value1, value2, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotBetween(Integer value1, Integer value2) {
            addCriterion("FLAGS not between", value1, value2, "flags");
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