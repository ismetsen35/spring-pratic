package com.example.patikacase.model;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "urunYorum")
public class UrunYorum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String yorum;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date yorumTarihi;
    @ManyToOne
    private Urun urun;
    @ManyToOne
    private Kullanici kullanici;
}
