package org.mosbach.dhbw.webservices.chatbot.entity;

public class RequestResultFullfillment {
    private String speech;
    private RequestResultFullfillmentMessages[] requestResultFullfillmentMessages;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public RequestResultFullfillmentMessages[] getRequestResultFullfillmentMessages() {
        return requestResultFullfillmentMessages;
    }

    public void setRequestResultFullfillmentMessages(RequestResultFullfillmentMessages[] requestResultFullfillmentMessages) {
        this.requestResultFullfillmentMessages = requestResultFullfillmentMessages;
    }
}
