package com.example.lab_work.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.lab_work.model.Model;

@Controller
public class LabController {

    @GetMapping("/")
    public String index(org.springframework.ui.Model uiModel) {
        uiModel.addAttribute("labData", new Model());
        return "index";
    }
    @PostMapping("/calculateFlat")
    public String calculateFlat(@ModelAttribute("labData") Model labData, org.springframework.ui.Model model) {
        labData.calculatedCapacity1();
        model.addAttribute("labData", labData);
        return "index";
    }

    @PostMapping("/calculateCyl")
    public String calculateCyl(@ModelAttribute("labData") Model labData, org.springframework.ui.Model model) {
        labData.calculatedCapacity2();
        model.addAttribute("labData", labData);
        return "index";
    }

    @PostMapping("/calculateSph")
    public String calculateSph(@ModelAttribute("labData") Model labData, org.springframework.ui.Model model) {
        labData.calculatedCapacity3();
        model.addAttribute("labData", labData);
        return "index";
    }
}