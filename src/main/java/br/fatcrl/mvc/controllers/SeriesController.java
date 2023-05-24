package br.fatcrl.mvc.controllers;
import br.fatcrl.mvc.models.Series;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/series")
public class SeriesController {
    private static final List<Series> _series = new ArrayList<Series>();

    public SeriesController(){
        _series.add(new Series("Greys Anatomy", 2015));
        _series.add(new Series("Bridgerton", 2020));
        _series.add(new Series("The Office", 2012));
        _series.add(new Series("Friends", 2002));
    }

    @GetMapping
    public String getSeries(Model model){
        model.addAttribute("series", _series);
        return "series";
    }
}
