package com.example.patikacase.repository;

import com.example.patikacase.model.Urun;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface UrunRepository extends CrudRepository<Urun,Long> {
    List<Urun> findBySonKullanmaTarihiBefore(Date startDate);
    List<Urun> findBySonKullanmaTarihiAfterOrSonKullanmaTarihiIsNull(Date startDate);
}
