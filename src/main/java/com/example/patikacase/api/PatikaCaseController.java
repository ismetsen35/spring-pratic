package com.example.patikacase.api;

import com.example.patikacase.model.Urun;
import com.example.patikacase.model.UrunYorum;
import com.example.patikacase.service.KullaniciService;
import com.example.patikacase.service.UrunService;
import com.example.patikacase.service.UrunYorumService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/patika")
public class PatikaCaseController {

    private final KullaniciService kullaniciService;
    private final UrunService urunService;
    private final UrunYorumService urunYorumService;

    @GetMapping("/kullanici")
    public ResponseEntity<?> getAllKullanici() {
        return ResponseEntity.ok(kullaniciService.getAllKullanici());
    }

    @GetMapping("/urun")
    public ResponseEntity<?> getAllUrun() {
        return ResponseEntity.ok(urunService.getAllUrun());
    }

    @GetMapping("/urunyorum")
    public ResponseEntity<?> getAllUrunYorum() {
        return ResponseEntity.ok(urunYorumService.gelAllUrunYorum());
    }

    ///http://localhost:8080/patika/urunyorum/urun/1
    @GetMapping("/urunyorum/urun/{urunId}")
    public ResponseEntity<List<UrunYorum>> findByUrun_Id(@PathVariable Long urunId) {
        return ResponseEntity.ok(urunYorumService.findByUrun_Id(urunId));
    }

    ///http://localhost:8080/patika/urunyorum/yorumtarihi?startDate=2022-08-21&endDate=2022-08-22
    @GetMapping("/urunyorum/yorumtarihi")
    public ResponseEntity<List<UrunYorum>> findByYorumTarihiBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                                    @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return ResponseEntity.ok(urunYorumService.findByYorumTarihiBetween(startDate, endDate));
    }

    ///http://localhost:8080/patika/urunyorum/kullanici/1
    @GetMapping("/urunyorum/kullanici/{kullaniciId}")
    public ResponseEntity<List<UrunYorum>> findByKullanici_Id(@PathVariable Long kullaniciId) {
        return ResponseEntity.ok(urunYorumService.findByKullanici_Id(kullaniciId));
    }

    ///http://localhost:8080/patika/urunyorum/kullanici/yorumtarihi?kullaniciId=2&startDate=2022-08-21&endDate=2022-08-22
    @GetMapping("/urunyorum/kullanici/yorumtarihi")
    public ResponseEntity<List<UrunYorum>> findByKullanici_IdAndYorumTarihiBetween(@RequestParam Long kullaniciId,
                                                                                   @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                                                   @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return ResponseEntity.ok(urunYorumService.findByKullanici_IdAndYorumTarihiBetween(kullaniciId, startDate, endDate));
    }

    ///http://localhost:8080/patika/urun/sonkullanmatarihibefore?startDate=2022-08-22
    @GetMapping("/urun/sonkullanmatarihibefore")
    public ResponseEntity<List<Urun>> findBySonKullanmaTarihiBefore(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate) {
        return ResponseEntity.ok(urunService.findBySonKullanmaTarihiBefore(startDate));
    }
    ///http://localhost:8080/patika/urun/sonkullanmatarihiafter?startDate=2022-08-22
    @GetMapping("/urun/sonkullanmatarihiafter")
    public ResponseEntity<List<Urun>> findBySonKullanmaTarihiAfterOrSonKullanmaTarihiIsNull(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate) {
        return ResponseEntity.ok(urunService.findBySonKullanmaTarihiAfterOrSonKullanmaTarihiIsNull(startDate));
    }
}
