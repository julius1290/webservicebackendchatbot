package org.mosbach.dhbw.webservices.chatbot.controller;

import org.mosbach.dhbw.webservices.chatbot.entity.RequestBodyObj;
import org.mosbach.dhbw.webservices.chatbot.entity.ReturnEntity;
import org.mosbach.dhbw.webservices.chatbot.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ResultService resultService;

    @PostMapping("/getLastGames")
    public ReturnEntity getLastGameResultByTeam(@RequestBody RequestBodyObj requestBodyObj) {
        return resultService.getLastResultByTeam(requestBodyObj);
    }
}
