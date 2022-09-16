package com.ravilyahya.coronavirustracker.controller;

import com.ravilyahya.coronavirustracker.model.LocationStats;
import com.ravilyahya.coronavirustracker.services.CoronaVirusDataService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {


    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        Long totalReportedCases = allStats.stream().mapToLong(LocationStats::getLatestTotalCases).sum();
        Long totalReportedNewCases = allStats.stream().mapToLong(LocationStats::getDiffFromPreviousDay).sum();

        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalReportedNewCases", totalReportedNewCases);
        model.addAttribute("locationStats", allStats);

        return "home";
    }
}
