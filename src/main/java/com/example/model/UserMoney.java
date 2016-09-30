package com.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by isalnikov on 9/30/2016.
 * Time 11:41 AM
 * transi
 */
@Data
@Entity
@Table
public class UserMoney {

    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "money")
    Long money;

}
