package com.example.patikacase.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kullanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adi;
    private String soyadi;
    private String eMail;
    private String telefon;
}
