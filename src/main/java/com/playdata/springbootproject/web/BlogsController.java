package com.playdata.springbootproject.web;
import com.playdata.springbootproject.service.BlogsService;
import com.playdata.springbootproject.web.Dto.BlogsResponseDto;
import com.playdata.springbootproject.web.Dto.BlogsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class BlogsController {
    private final BlogsService blogsService;
    @GetMapping("/blogs/{id}")
    public BlogsResponseDto findById(@PathVariable Long id) {
        return blogsService.findById(id);
    }

    @PostMapping("/blogs/save")
    public Long save(@RequestBody BlogsSaveRequestDto requestDto) {
        return blogsService.save(requestDto);
    }

    @PutMapping("/blogs/update")
    public Long update(@PathVariable Long id, @RequestBody BlogsSaveRequestDto requestDto) {
        return blogsService.update(id,requestDto);
    }
    @DeleteMapping("/blogs/delete")
    public Long delete(@PathVariable Long id) {
        blogsService.delete(id);
        return id;
    }
    @GetMapping("/blogs/{id}/update")
    public String blogUpdate(Model model, @PathVariable Long id) {
        model.addAttribute("blog", blogsService.findById(id));
        return "blog-update";
    }
}