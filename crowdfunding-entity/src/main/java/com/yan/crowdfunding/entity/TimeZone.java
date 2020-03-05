package com.yan.crowdfunding.entity;

public class TimeZone {
    private Integer timeZoneId;

    private String useLeapSeconds;

    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public String getUseLeapSeconds() {
        return useLeapSeconds;
    }

    public void setUseLeapSeconds(String useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds == null ? null : useLeapSeconds.trim();
    }
}