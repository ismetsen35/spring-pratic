package com.example.patikacase.repository;

import com.example.patikacase.model.Kullanici;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepositoy extends CrudRepository<Kullanici, Long> {


}
