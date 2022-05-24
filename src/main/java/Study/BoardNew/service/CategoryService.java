package Study.BoardNew.service;

import Study.BoardNew.domain.Category;
import Study.BoardNew.domain.User;
import Study.BoardNew.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    public Long save(Category category) {
        categoryRepository.save(category);
        return category.getId();
    }

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Category findCategory(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }
}
