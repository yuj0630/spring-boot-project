package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.Hiker.Hiker;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class HikerListResponseDto {
    private String id;
    private String pw;
    private String firstName;
    private String lastName;
    private String SSN;
    private int age;
    private String sex;
    private String phone;
    public HikerListResponseDto(Hiker entity) {
        this.id = entity.getId();
        this.pw = entity.getPw();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.SSN = entity.getSSN();
        this.age = entity.getAge();
        this.sex = entity.getSex();
        this.phone = entity.getPhone();
    }
}
