package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by isalnikov on 9/30/2016.
 * Time 11:34 AM
 * transi
 */
@RestController
public class MoneyController {

    @Autowired
    MoneyService moneyService;

    @PostMapping("/money/{id}")
    public Long sendMoney(@PathVariable Long id, @RequestBody MoneyDTO moneyDTO) {
        Long yourMoney = moneyService.sendMoney(id, moneyDTO.idTo, moneyDTO.count);
        return yourMoney;
    }

}
