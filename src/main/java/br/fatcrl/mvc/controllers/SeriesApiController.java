package br.fatcrl.mvc.controllers;
import br.fatcrl.mvc.models.Series;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/series")
public class SeriesApiController {

    private static final List<Series> series = new ArrayList<Series>();

    public SeriesApiController() {

        series.add(new Series("Greys Anatomy", 2015));
        series.add(new Series("Bridgerton", 2020));
        series.add(new Series("The Office", 2012));
        series.add(new Series("Friends", 2002));
    }

    @GetMapping
    public List<Series> getSeries(){
        return series;
    }
}
