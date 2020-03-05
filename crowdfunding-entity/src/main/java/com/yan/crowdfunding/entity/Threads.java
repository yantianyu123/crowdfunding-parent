package com.yan.crowdfunding.entity;

public class Threads {
    private Long threadId;

    private String name;

    private String type;

    private Long processlistId;

    private String processlistUser;

    private String processlistHost;

    private String processlistDb;

    private String processlistCommand;

    private Long processlistTime;

    private String processlistState;

    private Long parentThreadId;

    private String role;

    private String instrumented;

    private String history;

    private String connectionType;

    private Long threadOsId;

    private String processlistInfo;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getProcesslistId() {
        return processlistId;
    }

    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    public String getProcesslistUser() {
        return processlistUser;
    }

    public void setProcesslistUser(String processlistUser) {
        this.processlistUser = processlistUser == null ? null : processlistUser.trim();
    }

    public String getProcesslistHost() {
        return processlistHost;
    }

    public void setProcesslistHost(String processlistHost) {
        this.processlistHost = processlistHost == null ? null : processlistHost.trim();
    }

    public String getProcesslistDb() {
        return processlistDb;
    }

    public void setProcesslistDb(String processlistDb) {
        this.processlistDb = processlistDb == null ? null : processlistDb.trim();
    }

    public String getProcesslistCommand() {
        return processlistCommand;
    }

    public void setProcesslistCommand(String processlistCommand) {
        this.processlistCommand = processlistCommand == null ? null : processlistCommand.trim();
    }

    public Long getProcesslistTime() {
        return processlistTime;
    }

    public void setProcesslistTime(Long processlistTime) {
        this.processlistTime = processlistTime;
    }

    public String getProcesslistState() {
        return processlistState;
    }

    public void setProcesslistState(String processlistState) {
        this.processlistState = processlistState == null ? null : processlistState.trim();
    }

    public Long getParentThreadId() {
        return parentThreadId;
    }

    public void setParentThreadId(Long parentThreadId) {
        this.parentThreadId = parentThreadId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getInstrumented() {
        return instrumented;
    }

    public void setInstrumented(String instrumented) {
        this.instrumented = instrumented == null ? null : instrumented.trim();
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType == null ? null : connectionType.trim();
    }

    public Long getThreadOsId() {
        return threadOsId;
    }

    public void setThreadOsId(Long threadOsId) {
        this.threadOsId = threadOsId;
    }

    public String getProcesslistInfo() {
        return processlistInfo;
    }

    public void setProcesslistInfo(String processlistInfo) {
        this.processlistInfo = processlistInfo == null ? null : processlistInfo.trim();
    }
}