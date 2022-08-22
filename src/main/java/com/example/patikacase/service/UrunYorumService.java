package com.example.patikacase.service;

import com.example.patikacase.model.UrunYorum;

import java.util.Date;
import java.util.List;

public interface UrunYorumService {
    List<UrunYorum> gelAllUrunYorum();

    //List<UrunYorum> getUrunYorumListByUrunId(Long urunId);
    List<UrunYorum> findByUrun_Id(Long urunId);
    List<UrunYorum> findByYorumTarihiBetween(Date startDate, Date endDate);
    List<UrunYorum> findByKullanici_Id(Long kullaniciId);
    List<UrunYorum> findByKullanici_IdAndYorumTarihiBetween(Long kullaniciId, Date startDate, Date endDate);

}
