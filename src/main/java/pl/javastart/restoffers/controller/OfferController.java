package pl.javastart.restoffers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.javastart.restoffers.Repository.CategoryRepository;
import pl.javastart.restoffers.Repository.OfferRepository;
import pl.javastart.restoffers.model.Category;
import pl.javastart.restoffers.model.Offer;

import java.util.List;

@RestController
public class OfferController {
    private final OfferRepository offerRepository;

    @Autowired
    public OfferController(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @GetMapping("api/offers/count")
    public Integer countAllOffers() {
        return offerRepository.countAllBy();
    }

    @GetMapping("/api/offers")
    public List<Offer> getOffers(@RequestParam(required = false) String title) {
        if (title != null) {
            return offerRepository.findByTitleContainsIgnoreCase(title);
        } else {
            return offerRepository.findAll();
        }
    }

    @GetMapping("api/offers/{id}")
    public Offer getOffer(@PathVariable Long id) {
        return offerRepository.getById(id);
    }

}
