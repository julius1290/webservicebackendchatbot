package org.mosbach.dhbw.webservices.chatbot.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

@Service("TeamLookUpService")
public class TeamLookupTable {

    private Map<String, String> teamLookup = new TreeMap<>();


    private void setTable() {
        teamLookup.clear();
        teamLookup.put("FC Augsburg", "133652");
        teamLookup.put("Hertha BSC", "133658");
        teamLookup.put("SV Werder Bremen", "133662");
        teamLookup.put("Borussia Dortmund", "133650");
        teamLookup.put("Fortuna Düsseldorf 1895 e.V.", "133935");
        teamLookup.put("Eintracht Frankfurt", "133814");
        teamLookup.put("Sport-Club Freiburg", "133653");
        teamLookup.put("Hannover 96", "133656");
        teamLookup.put("TSG 1899 Hoffenheim", "133657");
        teamLookup.put("RB Leipzig", "134695");
        teamLookup.put("Bayer 04 Leverkusen", "133666");
        teamLookup.put("1. FSV Mainz 05", "133665");
        teamLookup.put("Borussia Mönchengladbach", "134779");
        teamLookup.put("FC Bayern München", "133664");
        teamLookup.put("1. FC Nürnberg", "133659");
        teamLookup.put("VfB Stuttgart", "133660");
        teamLookup.put("VfL Wolfsburg", "133655");
        teamLookup.put("FC Schalke 04", "133661");


    }

    public Map<String, String> getTable() {
        setTable();
        return teamLookup;
    }

}
