package org.mosbach.dhbw.webservices.chatbot.service;

import org.mosbach.dhbw.webservices.chatbot.entity.EventListWrapper;
import org.mosbach.dhbw.webservices.chatbot.entity.RequestBodyObj;
import org.mosbach.dhbw.webservices.chatbot.entity.ReturnEntity;
import org.mosbach.dhbw.webservices.chatbot.entity.SingleEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service("ResultService")
public class ResultService {




    private Map<String, String> lookupTable;
    private String teamId;
    @Autowired
    private TeamLookupTable teamLookupTable;

    private int counter=0;

    public ReturnEntity getLastResultByTeam(RequestBodyObj teamRequest) {

        String teamName = teamRequest.getResult().getParameters().getTeams();
        lookupTable = teamLookupTable.getTable();
        ReturnEntity returnEntity = new ReturnEntity();
        try {
            String awayTeam = null;
            String homeTeam = null;
            teamId = lookupTable.get(teamName);
            URI url = new URI("https://www.thesportsdb.com/api/v1/json/1/eventslast.php?id=" + teamId);
            RestTemplate getResultList = new RestTemplate();
            EventListWrapper resultList = getResultList.getForObject(url,EventListWrapper.class);
            List<SingleEvent> eventList = resultList.getResults();

            for (Map.Entry<String, String> entry : lookupTable.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(eventList.get(0).getIdAwayTeam()))
                    awayTeam = key;
                if (value.equals(eventList.get(0).getIdHomeTeam()))
                    homeTeam = key;
            }

            if (counter == 0) {
                counter = 1;
                String returnString = "Zuletzt hat " + homeTeam + " gegen " + awayTeam + " mit " + eventList.get(0).getIntHomeScore() + ":" + eventList.get(0).getIntAwayScore() + " gespielt.";
                returnEntity.setDisplayText(returnString);
                returnEntity.setSpeech(returnString);
                return returnEntity;
            }
            if (counter == 1)
            {
                counter = 2;
                String returnString = homeTeam + " hat gegen " + awayTeam + " mit einem Ergebnis von " + eventList.get(0).getIntHomeScore() + ":" + eventList.get(0).getIntAwayScore() + " gespielt.";
                returnEntity.setDisplayText(returnString);
                returnEntity.setSpeech(returnString);
                return returnEntity;

            }
            if (counter == 2) {
                counter = 0;
                String returnString = eventList.get(0).getIntHomeScore() + ":" + eventList.get(0).getIntAwayScore() + " war das Ergebnis aus dem Spiel: " + homeTeam + " gegen " + awayTeam + ".";
                returnEntity.setDisplayText(returnString);
                returnEntity.setSpeech(returnString);
                return returnEntity;
            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return returnEntity;
    }
}
