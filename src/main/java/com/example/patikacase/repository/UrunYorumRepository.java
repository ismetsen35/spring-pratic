package com.example.patikacase.repository;

import com.example.patikacase.model.UrunYorum;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface UrunYorumRepository extends CrudRepository<UrunYorum, Long> {
    List<UrunYorum> findByUrun_Id(Long urunId);

    List<UrunYorum> findByYorumTarihiBetween(Date startDate, Date endDate);

    List<UrunYorum> findByKullanici_Id(Long kullaniciId);

    List<UrunYorum> findByKullanici_IdAndYorumTarihiBetween(Long kullaniciId, Date startDate, Date endDate);
}
