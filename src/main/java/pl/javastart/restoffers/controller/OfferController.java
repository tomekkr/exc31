package pl.javastart.restoffers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.javastart.restoffers.Repository.OfferRepository;
import pl.javastart.restoffers.Service.OfferService;
import pl.javastart.restoffers.form.OfferForm;
import pl.javastart.restoffers.model.Offer;

import java.util.List;

@RestController
public class OfferController {
    private final OfferRepository offerRepository;
    private final OfferService offerService;

    @Autowired
    public OfferController(OfferRepository offerRepository, OfferService offerService) {
        this.offerRepository = offerRepository;
        this.offerService = offerService;
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

    @PostMapping("/api/offers")
    public void create(OfferForm offerForm) {
        Offer offer = new Offer();
        offer.setTitle(offerForm.getTitle());
        offer.setDescription(offerForm.getDescription());
        offer.setImgUrl(offerForm.getImgUrl());
        offer.setPrice(offerForm.getPrice());
        offer.setCategory(offerForm.getCategory());
        offerService.add(offer);
    }
}
