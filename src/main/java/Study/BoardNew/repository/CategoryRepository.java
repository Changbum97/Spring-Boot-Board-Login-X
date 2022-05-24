package Study.BoardNew.repository;

import Study.BoardNew.domain.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {

    private final EntityManager em;
    public void save(Category category) { em.persist(category); }

    public List<Category> findAll() {
        return em.createQuery("select c from Category c", Category.class)
                .getResultList();
    }

    public Category findById(Long id) {
        return em.find(Category.class, id);
    }
}
