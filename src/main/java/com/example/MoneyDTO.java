package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by isalnikov on 9/30/2016.
 * Time 11:54 AM
 * transi
 */
public class MoneyDTO {

    @JsonProperty("id")
    Long idTo;

    @JsonProperty("count")
    Long count;

}
