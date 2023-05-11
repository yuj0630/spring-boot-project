package com.playdata.springbootproject.web;

import com.playdata.springbootproject.service.HikerService;
import com.playdata.springbootproject.web.Dto.HikerResponseDto;
import com.playdata.springbootproject.web.Dto.HikerSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/MyPage")
@RestController
public class HikerController {
    private final HikerService hikerService;

    @PostMapping("/myPosts")
    public String save(@RequestBody HikerSaveRequestDto requestDto) {
        return hikerService.save(requestDto);
    }

    @PutMapping("/update")
    public String update(@PathVariable String id, @RequestBody HikerSaveRequestDto requestDto) {
        hikerService.update(id, requestDto);
        return "회원 정보가 수정되었습니다.";
    }

    @GetMapping("/api/v1/hiker/{id}")
    public HikerResponseDto findById(@PathVariable String id) {
        return hikerService.findById(id);
    }

    @DeleteMapping("/Delete")
    public String delete(@PathVariable String id) {
        hikerService.delete(id);
        return "회원 탈퇴가 완료되었습니다.";
    }
}