package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.Hiker.Hiker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class HikerSaveRequestDto {
    private String id;

    private String pw;

    private String firstName;

    private String lastName;

    private String SSN;

    private int age;

    private String sex;

    private String phone;

    public Hiker toEntity(){
        return Hiker.builder()
                .id(id)
                .pw(pw)
                .firstName(firstName)
                .lastName(lastName)
                .SSN(SSN)
                .age(age)
                .sex(sex)
                .phone(phone)
                .build();
    }
}
