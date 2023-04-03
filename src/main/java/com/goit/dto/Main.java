package com.goit.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try (InputStream stream = Main.class.getClassLoader().getResourceAsStream("fullName.json")){
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .serializeNulls()
                    .create();

            NameDto dto = gson.fromJson(new String(stream.readAllBytes()), NameDto.class);
            System.out.println(dto);
        }
    }
}