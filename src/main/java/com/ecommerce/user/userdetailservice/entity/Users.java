package com.ecommerce.user.userdetailservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Data
public class Users {

    @Id
    //TODO need to form informative user id
    //@GeneratedValue(strategy = GenerationType.)
    private int userId;
    private String name;
    private long mobile;
    private String email;
    private String password;
    private String gstNumber;
    @OneToMany(mappedBy = "user")
    private List<Address> addresses;



}
