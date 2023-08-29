package model;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Location {
    String address;
    String city;
    String state;
    String country;
    int pinCode;
}
