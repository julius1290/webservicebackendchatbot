package org.mosbach.dhbw.webservices.chatbot.entity;

public class RequestResultMetadata {
    private String intentId;
    private String webhookUsed;
    private String webhookForSlotFillingUsed;
    private String isFallbackIntent;
    private String intentName;

    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    public String getWebhookUsed() {
        return webhookUsed;
    }

    public void setWebhookUsed(String webhookUsed) {
        this.webhookUsed = webhookUsed;
    }

    public String getWebhookForSlotFillingUsed() {
        return webhookForSlotFillingUsed;
    }

    public void setWebhookForSlotFillingUsed(String webhookForSlotFillingUsed) {
        this.webhookForSlotFillingUsed = webhookForSlotFillingUsed;
    }

    public String getIsFallbackIntent() {
        return isFallbackIntent;
    }

    public void setIsFallbackIntent(String isFallbackIntent) {
        this.isFallbackIntent = isFallbackIntent;
    }

    public String getIntentName() {
        return intentName;
    }

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }
}
