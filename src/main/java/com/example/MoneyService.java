package com.example;

import com.example.model.UserMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by isalnikov on 9/30/2016.
 * Time 12:01 PM
 * transi
 */
@Service
public class MoneyService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public Long sendMoney(Long id, Long idTo, Long count) {
        UserMoney from = userRepository.findOne(id);
        UserMoney to = userRepository.findOne(idTo);

        long fromCount = from.getMoney() - count;
        long toCount = to.getMoney() + count;

        from.setMoney(fromCount);
        to.setMoney(toCount);

        UserMoney save = userRepository.save(from);
        boom(fromCount , toCount);
        userRepository.save(to);
        return save.getMoney();
    }

    private void boom(long fromCount, long toCount) {
        throw new RuntimeException("Boom");
    }
}
