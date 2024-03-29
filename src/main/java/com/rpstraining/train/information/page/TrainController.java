package com.rpstraining.train.information.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Controller
public class TrainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/trainInfo")
    public String getTrainInfo(@RequestParam(required = false) Integer trainID, Model model) {
        if (trainID != null) {
            try {
                ResponseEntity<TrainInfo> response = restTemplate.getForEntity("http://localhost:8082/trains/details/" + trainID, TrainInfo.class);
                model.addAttribute("trainInfo", response.getBody());
            } catch (HttpServerErrorException e) {
                model.addAttribute("errorMessage", "There was an error retrieving the train details. Please try again later.");
            }
        }
        return "trainInfo";
    }


}
