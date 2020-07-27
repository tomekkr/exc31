package pl.javastart.restoffers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javastart.restoffers.Repository.OfferRepository;
import pl.javastart.restoffers.model.Offer;

import java.util.List;

@Controller
@RestController
public class OfferController {
    private final OfferRepository offerRepository;

    @Autowired
    public OfferController(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @GetMapping("/api/offers")
    public List<Offer> getAll() {
        return offerRepository.findAll();
    }

    @GetMapping("api/offers/count")
    public Integer countAll() {
        return offerRepository.countAllBy();
    }

}
