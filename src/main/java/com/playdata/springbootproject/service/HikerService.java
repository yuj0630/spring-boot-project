package com.playdata.springbootproject.service;

import com.playdata.springbootproject.domain.Hiker.Hiker;
import com.playdata.springbootproject.domain.Hiker.HikerRepository;
import com.playdata.springbootproject.web.Dto.HikerListResponseDto;
import com.playdata.springbootproject.web.Dto.HikerResponseDto;
import com.playdata.springbootproject.web.Dto.HikerSaveRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HikerService {
    private final HikerRepository hikerRepository;

    @Transactional
    public String save(HikerSaveRequestDto requestDto) {
        return hikerRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public String update(String id, HikerSaveRequestDto requestDto) {
        Hiker hiker = hikerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글을 찾을 수 없습니다. id=" + id));
        hiker.update(requestDto.getId(), requestDto.getPw());

        return id;
    }

    @Transactional
    public HikerResponseDto findById(String id) {
        Hiker hiker = hikerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글을 찾을 수 없습니다."));

        return new HikerResponseDto(hiker);
    }

    @Transactional
    public List<HikerListResponseDto> findAllDesc() {
        return hikerRepository.findAllDesc().stream()
                .map(HikerListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete(String id) {
        Hiker hiker = hikerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        hikerRepository.delete(hiker);
    }
}