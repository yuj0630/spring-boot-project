package com.playdata.springbootproject.domain.Hiker;

import lombok.Getter;

import java.io.Serializable;
@Getter
public class SessionHikers implements Serializable {
    private String id;
    private String pw;
    public SessionHikers(Hiker hiker) {
        this.id = hiker.getId();
        this.pw = hiker.getPw();
    }
}