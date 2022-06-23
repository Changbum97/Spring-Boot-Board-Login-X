package Study.BoardNew;

import Study.BoardNew.domain.Category;
import Study.BoardNew.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class CategoryInit {

    private final CategoryService categoryService;

    @PostConstruct
    public void CM() {
        Category c1 = new Category();
        c1.setName("게시판1");
        categoryService.save(c1);
        Category c2 = new Category();
        c2.setName("게시판2");
        categoryService.save(c2);
        Category c3 = new Category();
        c3.setName("게시판3");
        categoryService.save(c3);
    }
}