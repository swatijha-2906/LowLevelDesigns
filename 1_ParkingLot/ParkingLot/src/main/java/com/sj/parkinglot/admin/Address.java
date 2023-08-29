package com.sj.parkinglot.admin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}
