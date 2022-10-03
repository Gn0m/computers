package com.example.computers.Object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notepad {

    private int id;
    private String name;
    private String [] features;
    private String [] img;

    public Notepad(int id, String name, String[] features,String [] img) {
        this.id = id;
        this.name = name;
        this.features = features;
        this.img = img;
    }
}
