package com.example.computers.Object;

import lombok.Getter;

@Getter
public class Img {
    private String url;
    private String name;

    public Img( String url, String name) {
        this.url = url;
        this.name = name;
    }
}
