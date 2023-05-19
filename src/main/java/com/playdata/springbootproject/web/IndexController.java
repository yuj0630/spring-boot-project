package com.playdata.springbootproject.web;

import com.playdata.springbootproject.config.auth.SessionUser;
import com.playdata.springbootproject.service.PostsService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@CrossOrigin
@Controller
public class IndexController {
    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, HttpSession httpSession){

        //Model: 서버 템플릿 엔진에서 사용할 수 있는 객체를 저장할 수 있다.
        model.addAttribute("posts", postsService.findAllDesc());
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if(user!=null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";// src/main/resources/templetes/ + "index" + .mustach
    }
    @GetMapping("/sign")
    public String sign() {
        return "sign";
    }

    @GetMapping("/blogs")
    public String blogs() {
        return "blogs";
    }

    @GetMapping("/MyPage")
    public String MyPage() {
        return "MyPage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/news")
    public String news() {
        return "news";
    }

    @GetMapping("/MyPage/Setting")
    public String MyPageSetting() {
        return "MyPage-Setting";
    }

    @GetMapping("/MyPage/QA")
    public String MyPageQA() {
        return "MyPage-QA";
    }

    @GetMapping("/MyPage/Delete")
    public String MyPageDelete() {
        return "MyPage-Delete";
    }

    @GetMapping("/MyPage/update")
    public String MyPageupdate() {
        return "MyPage-update";
    }

    @GetMapping("/MyPage/myPosts")
    public String MyPagemyPosts() {
        return "MyPage-myPosts";
    }

    @GetMapping("/blogs/save")
    public String blogsave() {
        return "blogs-save";
    }

    @GetMapping("/blogs/update")
    public String blogupdate() {
        return "blogs-update";
    }
}
