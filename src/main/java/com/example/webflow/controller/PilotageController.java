package com.example.webflow.controller;

import com.example.webflow.dto.Commune;
import com.example.webflow.dto.Requete;
import com.example.webflow.service.PilotageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PilotageController {

    private final PilotageService pilotageService;

    public PilotageController(PilotageService pilotageService) {
        this.pilotageService = pilotageService;
    }

    @PostMapping("/fetchData")
    @ResponseBody
    public String fetchData(@RequestParam("nopermis") String nopermis)
    {
        try
        {
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        return nopermis.substring(0, 3) + "-" + nopermis.substring(3,6) + "-" + nopermis.substring(6,9);
    }

    @PostMapping(value = "/communes")
    @ResponseBody
    public List<Commune> fetchCommunesParDepartement(@RequestParam("departement") String departement){
        List<Commune> result = this.pilotageService.fetchCommunes(departement);
        return result;
    }

    @PostMapping(value="/requests")
    @ResponseBody
    public List<Requete> fetchRequetesParApplication(@RequestParam("app") String app){
        List<Requete> result = this.pilotageService.fetchRequetes(app);
        return result;
    }
}
