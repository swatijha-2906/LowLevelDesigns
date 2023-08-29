package com.sj.parkinglot.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ContactInfo {
        private String phone;
        private String email;
        private Address address;

}
