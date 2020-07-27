package pl.javastart.restoffers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javastart.restoffers.Repository.OfferRepository;
import pl.javastart.restoffers.model.Offer;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OfferController {
    private OfferRepository offerRepository;

    @Autowired
    public OfferController(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @GetMapping("/offers")
    public List<Offer> getAll() {
        return offerRepository.findAll();
    }

    @GetMapping("/offers/count")
    public Integer countAll() {
        return offerRepository.countAllBy();
    }

}
