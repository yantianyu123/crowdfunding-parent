package com.yan.crowdfunding.entity;

public class GeneralLogWithBLOBs extends GeneralLog {
    private String userHost;

    private byte[] argument;

    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost == null ? null : userHost.trim();
    }

    public byte[] getArgument() {
        return argument;
    }

    public void setArgument(byte[] argument) {
        this.argument = argument;
    }
}