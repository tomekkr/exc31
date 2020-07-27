package pl.javastart.restoffers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.javastart.restoffers.Repository.CategoryRepository;
import pl.javastart.restoffers.model.Category;
import pl.javastart.restoffers.model.Offer;

import java.util.List;
import java.util.Set;

@RestController
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/api/categories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/api/categories/{id}")
    public int getOffersNumber(@PathVariable Long id) {
        Category category = categoryRepository.getCategoryById(id);
        Set<Offer> offers = category.getOffers();
        return offers.size();
    }
}
