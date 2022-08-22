package com.example.patikacase.service.Impl;

import com.example.patikacase.model.Urun;
import com.example.patikacase.repository.UrunRepository;
import com.example.patikacase.service.UrunService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@AllArgsConstructor
public class UrunServiceImpl implements UrunService {

    private final UrunRepository urunRepository;

    @Override
    public List<Urun> getAllUrun() {
        return (List<Urun>) urunRepository.findAll();
    }

    @Override
    public List<Urun> findBySonKullanmaTarihiBefore(Date startDate) {
        return urunRepository.findBySonKullanmaTarihiBefore(startDate);
    }

    @Override
    public List<Urun> findBySonKullanmaTarihiAfterOrSonKullanmaTarihiIsNull(Date startDate) {
        return urunRepository.findBySonKullanmaTarihiAfterOrSonKullanmaTarihiIsNull(startDate);
    }
}
