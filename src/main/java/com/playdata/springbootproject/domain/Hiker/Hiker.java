package com.playdata.springbootproject.domain.Hiker;

import com.playdata.springbootproject.domain.AuditingEntity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Hiker extends AuditingEntity {

    @Id
    private String id;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String firstName;

    @Column(length = 20, nullable = false)
    private String lastName;

    @Column(length = 14, nullable = false)
    private String SSN;

    private int age;

    private String sex;

    private String phone;

    @Builder
    public Hiker(String id, String password, String firstName, String lastName, String SSN, int age, String sex, String phone) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public void update(String id, String password){
        this.id = id;
        this.password = password;
    }

}
