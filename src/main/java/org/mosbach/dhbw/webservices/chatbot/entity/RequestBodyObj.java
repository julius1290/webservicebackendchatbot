package org.mosbach.dhbw.webservices.chatbot.entity;

public class RequestBodyObj {

    private String id;
    private String timestamp;
    private String lang;
    private RequestResult result;
    private RequestBodyStatus status;
    private String sessionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public RequestResult getResult() {
        return result;
    }

    public void setResult(RequestResult result) {
        this.result = result;
    }

    public RequestBodyStatus getStatus() {
        return status;
    }

    public void setStatus(RequestBodyStatus status) {
        this.status = status;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}

