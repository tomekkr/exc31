package pl.javastart.restoffers.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.restoffers.model.Offer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class OfferService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void add(Offer offer) {
        entityManager.persist(offer);
    }
}
