package com.yan.crowdfunding.entity;

public class EventsStatementsHistoryWithBLOBs extends EventsStatementsHistory {
    private String sqlText;

    private String digestText;

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText == null ? null : sqlText.trim();
    }

    public String getDigestText() {
        return digestText;
    }

    public void setDigestText(String digestText) {
        this.digestText = digestText == null ? null : digestText.trim();
    }
}