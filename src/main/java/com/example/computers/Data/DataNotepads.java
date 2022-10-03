package com.example.computers.Data;

import com.example.computers.Object.Notepad;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class DataNotepads {

    private ArrayList<Notepad> notepads;

    public DataNotepads() {
        this.notepads = new ArrayList<>();
        fillingNotepads();
    }

    private void fillingNotepads() {
        int id = 0;
        String [] features = {"Windows 11 Домашняя - ASUS рекомендует Windows 11 Pro для бизнеса, (Бесплатное обновление до Windows 11*)"
                ,"До AMD Ryzen 9 5900HX","До NVIDIA GeForce RTX 3070 для ноутбуков","До 64 ГБ памяти, 2 слота SODIMM","До 4 ТБ SSD, 2 слота M.2 PCIe",
                "16” 4K OLED HDR 16:10 дисплей","ASUS Dial","USB 3.2 Gen 2 Type-C"};
        String [] img = {"img/h5600.png","img/h5600-1.png","img/h5600-2.png","img/h5600-3.png"};
        Notepad notepad = new Notepad(id, "ProArt Studiobook 16 OLED (H5600, AMD Ryzen 5000 серии)",features , img);
        notepads.add(notepad);
        id++;
        features = new String[]{"Windows 11 Домашняя - ASUS рекомендует Windows 11 Pro для бизнеса"
                , "Up to 12th Gen Intel® Core™ i7 processor", "Intel® Iris® Xe graphics", "Up to 1 TB PCIe 4.0 x4 with 6500 MB/s read speed",
                "Up to 32 GB LPDDR5 5200 MHz memory", "13.3 16:10 2.8K OLED NanoEdge touchscreen", "Long-lasting 67 Wh battery",
                "1.1 kg light for easy portability"};
        img = new String[]{"img/5302.png", "img/5302-1.png", "img/5302-2.png", "img/5302-3.png"};
        notepad = new Notepad(id, "Zenbook S 13 Flip OLED (UP5302, Intel 12 поколения)",features , img);
        notepads.add(notepad);
        id++;

        features = new String[]{"Windows 11 Домашняя - ASUS рекомендует Windows 11 Pro для бизнеса"
                , "До Intel Core i7-12700H", "До NVIDIA GeForce RTX 3050 Ti", "16’’ OLED-дисплей до 3,2K 120 Гц",
                "Дисплейный мультиплексор", "Thunderbolt 4 (USB-C)", "До 1 ТБ PCIe 4.0 SSD",
                "Dolby Atmos"};
        img = new String[]{"img/vivo.png", "img/vivo-1.png", "img/vivo-2.png", "img/vivo-3.png"};
        notepad = new Notepad(id, "Vivobook Pro 16 OLED (K6602)",features , img);
        notepads.add(notepad);
        id++;
    }
}
