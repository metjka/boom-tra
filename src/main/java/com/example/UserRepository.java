package com.example;

import com.example.model.UserMoney;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by isalnikov on 9/30/2016.
 * Time 11:56 AM
 * transi
 */
public interface UserRepository extends CrudRepository<UserMoney,Long> {

}
