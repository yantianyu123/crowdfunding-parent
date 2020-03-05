package com.yan.crowdfunding.entity;

import java.util.ArrayList;
import java.util.List;

public class XSchemaIndexStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XSchemaIndexStatisticsExample() {
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

        public Criteria andTableSchemaIsNull() {
            addCriterion("table_schema is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("table_schema =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("table_schema <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("table_schema >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("table_schema >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("table_schema <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("table_schema <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("table_schema like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("table_schema not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("table_schema in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("table_schema not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("table_schema between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("table_schema not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNull() {
            addCriterion("index_name is null");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNotNull() {
            addCriterion("index_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNameEqualTo(String value) {
            addCriterion("index_name =", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotEqualTo(String value) {
            addCriterion("index_name <>", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThan(String value) {
            addCriterion("index_name >", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("index_name >=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThan(String value) {
            addCriterion("index_name <", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThanOrEqualTo(String value) {
            addCriterion("index_name <=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLike(String value) {
            addCriterion("index_name like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotLike(String value) {
            addCriterion("index_name not like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIn(List<String> values) {
            addCriterion("index_name in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotIn(List<String> values) {
            addCriterion("index_name not in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameBetween(String value1, String value2) {
            addCriterion("index_name between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotBetween(String value1, String value2) {
            addCriterion("index_name not between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedIsNull() {
            addCriterion("rows_selected is null");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedIsNotNull() {
            addCriterion("rows_selected is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedEqualTo(Long value) {
            addCriterion("rows_selected =", value, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedNotEqualTo(Long value) {
            addCriterion("rows_selected <>", value, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedGreaterThan(Long value) {
            addCriterion("rows_selected >", value, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_selected >=", value, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedLessThan(Long value) {
            addCriterion("rows_selected <", value, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedLessThanOrEqualTo(Long value) {
            addCriterion("rows_selected <=", value, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedIn(List<Long> values) {
            addCriterion("rows_selected in", values, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedNotIn(List<Long> values) {
            addCriterion("rows_selected not in", values, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedBetween(Long value1, Long value2) {
            addCriterion("rows_selected between", value1, value2, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andRowsSelectedNotBetween(Long value1, Long value2) {
            addCriterion("rows_selected not between", value1, value2, "rowsSelected");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyIsNull() {
            addCriterion("select_latency is null");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyIsNotNull() {
            addCriterion("select_latency is not null");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyEqualTo(Long value) {
            addCriterion("select_latency =", value, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyNotEqualTo(Long value) {
            addCriterion("select_latency <>", value, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyGreaterThan(Long value) {
            addCriterion("select_latency >", value, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("select_latency >=", value, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyLessThan(Long value) {
            addCriterion("select_latency <", value, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyLessThanOrEqualTo(Long value) {
            addCriterion("select_latency <=", value, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyIn(List<Long> values) {
            addCriterion("select_latency in", values, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyNotIn(List<Long> values) {
            addCriterion("select_latency not in", values, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyBetween(Long value1, Long value2) {
            addCriterion("select_latency between", value1, value2, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andSelectLatencyNotBetween(Long value1, Long value2) {
            addCriterion("select_latency not between", value1, value2, "selectLatency");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIsNull() {
            addCriterion("rows_inserted is null");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIsNotNull() {
            addCriterion("rows_inserted is not null");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedEqualTo(Long value) {
            addCriterion("rows_inserted =", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotEqualTo(Long value) {
            addCriterion("rows_inserted <>", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedGreaterThan(Long value) {
            addCriterion("rows_inserted >", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_inserted >=", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedLessThan(Long value) {
            addCriterion("rows_inserted <", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedLessThanOrEqualTo(Long value) {
            addCriterion("rows_inserted <=", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIn(List<Long> values) {
            addCriterion("rows_inserted in", values, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotIn(List<Long> values) {
            addCriterion("rows_inserted not in", values, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedBetween(Long value1, Long value2) {
            addCriterion("rows_inserted between", value1, value2, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotBetween(Long value1, Long value2) {
            addCriterion("rows_inserted not between", value1, value2, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyIsNull() {
            addCriterion("insert_latency is null");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyIsNotNull() {
            addCriterion("insert_latency is not null");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyEqualTo(Long value) {
            addCriterion("insert_latency =", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyNotEqualTo(Long value) {
            addCriterion("insert_latency <>", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyGreaterThan(Long value) {
            addCriterion("insert_latency >", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("insert_latency >=", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyLessThan(Long value) {
            addCriterion("insert_latency <", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyLessThanOrEqualTo(Long value) {
            addCriterion("insert_latency <=", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyIn(List<Long> values) {
            addCriterion("insert_latency in", values, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyNotIn(List<Long> values) {
            addCriterion("insert_latency not in", values, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyBetween(Long value1, Long value2) {
            addCriterion("insert_latency between", value1, value2, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyNotBetween(Long value1, Long value2) {
            addCriterion("insert_latency not between", value1, value2, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIsNull() {
            addCriterion("rows_updated is null");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIsNotNull() {
            addCriterion("rows_updated is not null");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedEqualTo(Long value) {
            addCriterion("rows_updated =", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotEqualTo(Long value) {
            addCriterion("rows_updated <>", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedGreaterThan(Long value) {
            addCriterion("rows_updated >", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_updated >=", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedLessThan(Long value) {
            addCriterion("rows_updated <", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedLessThanOrEqualTo(Long value) {
            addCriterion("rows_updated <=", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIn(List<Long> values) {
            addCriterion("rows_updated in", values, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotIn(List<Long> values) {
            addCriterion("rows_updated not in", values, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedBetween(Long value1, Long value2) {
            addCriterion("rows_updated between", value1, value2, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotBetween(Long value1, Long value2) {
            addCriterion("rows_updated not between", value1, value2, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyIsNull() {
            addCriterion("update_latency is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyIsNotNull() {
            addCriterion("update_latency is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyEqualTo(Long value) {
            addCriterion("update_latency =", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyNotEqualTo(Long value) {
            addCriterion("update_latency <>", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyGreaterThan(Long value) {
            addCriterion("update_latency >", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("update_latency >=", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyLessThan(Long value) {
            addCriterion("update_latency <", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyLessThanOrEqualTo(Long value) {
            addCriterion("update_latency <=", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyIn(List<Long> values) {
            addCriterion("update_latency in", values, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyNotIn(List<Long> values) {
            addCriterion("update_latency not in", values, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyBetween(Long value1, Long value2) {
            addCriterion("update_latency between", value1, value2, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyNotBetween(Long value1, Long value2) {
            addCriterion("update_latency not between", value1, value2, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIsNull() {
            addCriterion("rows_deleted is null");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIsNotNull() {
            addCriterion("rows_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedEqualTo(Long value) {
            addCriterion("rows_deleted =", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotEqualTo(Long value) {
            addCriterion("rows_deleted <>", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedGreaterThan(Long value) {
            addCriterion("rows_deleted >", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_deleted >=", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedLessThan(Long value) {
            addCriterion("rows_deleted <", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedLessThanOrEqualTo(Long value) {
            addCriterion("rows_deleted <=", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIn(List<Long> values) {
            addCriterion("rows_deleted in", values, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotIn(List<Long> values) {
            addCriterion("rows_deleted not in", values, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedBetween(Long value1, Long value2) {
            addCriterion("rows_deleted between", value1, value2, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotBetween(Long value1, Long value2) {
            addCriterion("rows_deleted not between", value1, value2, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyIsNull() {
            addCriterion("delete_latency is null");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyIsNotNull() {
            addCriterion("delete_latency is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyEqualTo(Long value) {
            addCriterion("delete_latency =", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyNotEqualTo(Long value) {
            addCriterion("delete_latency <>", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyGreaterThan(Long value) {
            addCriterion("delete_latency >", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("delete_latency >=", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyLessThan(Long value) {
            addCriterion("delete_latency <", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyLessThanOrEqualTo(Long value) {
            addCriterion("delete_latency <=", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyIn(List<Long> values) {
            addCriterion("delete_latency in", values, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyNotIn(List<Long> values) {
            addCriterion("delete_latency not in", values, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyBetween(Long value1, Long value2) {
            addCriterion("delete_latency between", value1, value2, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyNotBetween(Long value1, Long value2) {
            addCriterion("delete_latency not between", value1, value2, "deleteLatency");
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