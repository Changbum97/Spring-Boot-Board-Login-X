package Study.BoardNew.controller;

import Study.BoardNew.domain.Category;
import Study.BoardNew.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CategoryService categoryService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/makeCategory")
    public String CM() {
        Category c1 = new Category();
        c1.setName("게시판1");
        categoryService.save(c1);
        Category c2 = new Category();
        c2.setName("게시판2");
        categoryService.save(c2);
        Category c3 = new Category();
        c3.setName("게시판3");
        categoryService.save(c3);

        return "redirect:/";
    }
}
