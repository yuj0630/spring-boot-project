package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.Hiker.Hiker;
import lombok.Getter;

@Getter
public class HikerResponseDto {
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private String SSN;
    private int age;
    private String sex;
    private String phone;

    public HikerResponseDto(Hiker entity) {
        this.id = entity.getId();
        this.password = entity.getPassword();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.SSN = entity.getSSN();
        this.age = entity.getAge();
        this.sex = entity.getSex();
        this.phone = entity.getPhone();
    }
}

