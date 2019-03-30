package org.mosbach.dhbw.webservices.chatbot.entity;

public class RequestResult {
    private String source;
    private String resolvedQuery;
    private String speech;
    private String action;
    private Boolean actionIncomplete;
    private RequestResulParameters parameters;
    private String[] contexts;
    private RequestResultMetadata metadata;
    private RequestResultFullfillment fullfillment;
    private String score;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getResolvedQuery() {
        return resolvedQuery;
    }

    public void setResolvedQuery(String resolvedQuery) {
        this.resolvedQuery = resolvedQuery;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getActionIncomplete() {
        return actionIncomplete;
    }

    public void setActionIncomplete(Boolean actionIncomplete) {
        this.actionIncomplete = actionIncomplete;
    }

    public RequestResulParameters getParameters() {
        return parameters;
    }

    public void setParameters(RequestResulParameters parameters) {
        this.parameters = parameters;
    }

    public String[] getContexts() {
        return contexts;
    }

    public void setContexts(String[] contexts) {
        this.contexts = contexts;
    }

    public RequestResultMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(RequestResultMetadata metadata) {
        this.metadata = metadata;
    }

    public RequestResultFullfillment getFullfillment() {
        return fullfillment;
    }

    public void setFullfillment(RequestResultFullfillment fullfillment) {
        this.fullfillment = fullfillment;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
