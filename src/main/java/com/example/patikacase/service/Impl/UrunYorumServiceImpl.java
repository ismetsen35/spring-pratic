package com.example.patikacase.service.Impl;

import com.example.patikacase.model.UrunYorum;
import com.example.patikacase.repository.UrunYorumRepository;
import com.example.patikacase.service.UrunYorumService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@AllArgsConstructor
public class UrunYorumServiceImpl implements UrunYorumService {

    private final UrunYorumRepository urunYorumRepository;

    @Override
    public List<UrunYorum> gelAllUrunYorum() {
        return (List<UrunYorum>) urunYorumRepository.findAll();
    }

    @Override
    public List<UrunYorum> findByUrun_Id(Long urunId) {
        return urunYorumRepository.findByUrun_Id(urunId);
    }

    //@Override
    //public List<UrunYorum> getUrunYorumListByUrunId(Long urunId) {
      //  return urunYorumRepository.getUrunYorumListByUrunId(urunId);
   // }

    @Override
    public List<UrunYorum> findByYorumTarihiBetween(Date startDate, Date endDate) {
        return urunYorumRepository.findByYorumTarihiBetween(startDate, endDate);
    }

    @Override
    public List<UrunYorum> findByKullanici_Id(Long kullaniciId) {
        return urunYorumRepository.findByKullanici_Id(kullaniciId);
    }

    @Override
    public List<UrunYorum> findByKullanici_IdAndYorumTarihiBetween(Long kullaniciId, Date startDate, Date endDate) {
        return urunYorumRepository.findByKullanici_IdAndYorumTarihiBetween(kullaniciId,startDate,endDate);
    }
}
