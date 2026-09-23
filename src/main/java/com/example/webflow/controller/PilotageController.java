package com.example.webflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PilotageController {

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
}
