package com.example.computers.Object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class News {
    private int id;
    private String header;
    private String fullHeader;
    private String text;
    private String img;
    private String fulltext;

    public News(int id,String header, String text, String img) {
        this.id = id;
        this.header = header;
        this.text = text;
        this.img = img;
    }
}
