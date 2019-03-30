package org.mosbach.dhbw.webservices.chatbot.entity;

public class RequestResultFullfillmentMessages {
    private int type;
    private String speech;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }
}
