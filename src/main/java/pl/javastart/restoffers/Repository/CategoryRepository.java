package pl.javastart.restoffers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.javastart.restoffers.model.Category;

import java.util.List;
import java.util.Set;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();

    @Query("SELECT c.name FROM Category c")
    Set<String> getCategoriesNames();

    //    Category getCategoryById(long id);
}
