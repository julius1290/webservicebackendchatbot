package org.mosbach.dhbw.webservices.chatbot.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

@Service("TeamLookUpService")
public class TeamLookupTable {

    private Map<String, String> teamLookup = new TreeMap<>();


    private void setTable() {
        teamLookup.clear();
        //First League
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

        //Second League
        teamLookup.put("FC Erzgebirge Aue", "134445");
        teamLookup.put("1. FC Union Berlin", "134690");
        teamLookup.put("DSC Arminia Bielefeld", "133852");
        teamLookup.put("VfL Bochum 1848", "133839");
        teamLookup.put("SV Darmstadt 98", "134693");
        teamLookup.put("SG Dynamo Dresden", "135655");
        teamLookup.put("MSV Duisburg", "133877");
        teamLookup.put("SpVgg Greuther Fürth", "134099");
        teamLookup.put("Hamburger SV", "133651");
        teamLookup.put("1. FC Heidenheim 1846", "134696");
        teamLookup.put("FC Ingolstadt 04", "134694");
        teamLookup.put("Holstein Kiel", "136027");
        teamLookup.put("1. FC Köln", "133654");
        teamLookup.put("1. FC Magdeburg", "136194");
        teamLookup.put("SC Paderborn 07", "134551");
        teamLookup.put("FC St. Pauli", "133813");
        teamLookup.put("SSV Jahn Regensburg", "136026");
        teamLookup.put("SV Sandhausen", "134691");



    }

    public Map<String, String> getTable() {
        setTable();
        return teamLookup;
    }

}
