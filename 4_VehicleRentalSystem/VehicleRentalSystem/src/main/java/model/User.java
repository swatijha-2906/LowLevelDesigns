package model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class User {
    int userId;
    String divingLicense;

    public User(int userId, String divingLicense)
    {
        this.userId= userId;
        this.divingLicense= divingLicense;
    }
}
