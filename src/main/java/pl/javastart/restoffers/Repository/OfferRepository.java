package pl.javastart.restoffers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javastart.restoffers.model.Offer;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    List<Offer> findAll();

    Integer countAllBy();

    List<Offer> findByTitleContainsIgnoreCase(String title);

    Offer getById(Long id);
}
