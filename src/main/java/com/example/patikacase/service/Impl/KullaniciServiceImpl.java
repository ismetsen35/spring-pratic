package com.example.patikacase.service.Impl;

import com.example.patikacase.model.Kullanici;
import com.example.patikacase.repository.KullaniciRepositoy;
import com.example.patikacase.service.KullaniciService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class KullaniciServiceImpl implements KullaniciService {

    private final KullaniciRepositoy kullaniciRepositoy;

    @Override
    public List<Kullanici> getAllKullanici() {
        return (List<Kullanici>) kullaniciRepositoy.findAll();
    }
}
