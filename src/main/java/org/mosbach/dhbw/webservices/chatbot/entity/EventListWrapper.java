package org.mosbach.dhbw.webservices.chatbot.entity;

import java.util.ArrayList;
import java.util.List;

public class EventListWrapper {

    private List<SingleEvent> results;

    public EventListWrapper() { this.results = new ArrayList<>(); }

    public List<SingleEvent> getResults() { return results; }

    public void setResults(List<SingleEvent> results) { this.results = results; }
}
