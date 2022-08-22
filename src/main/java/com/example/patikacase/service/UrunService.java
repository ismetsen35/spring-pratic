package com.example.patikacase.service;


import com.example.patikacase.model.Urun;

import java.util.Date;
import java.util.List;

public interface UrunService {

    List<Urun> getAllUrun();

    List<Urun> findBySonKullanmaTarihiBefore(Date startDate);
    List<Urun> findBySonKullanmaTarihiAfterOrSonKullanmaTarihiIsNull(Date startDate);
}
