package com.ecommerce.user.userdetailservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@AllArgsConstructor
@Getter @Data
public class Vendor {
    @Id
    //TODO need to form informative user id
    //@GeneratedValue(strategy = GenerationType.)
    private int vendorId;
    @NotEmpty
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @Pattern(regexp = "(^$|[0-9]{6})", message = "mobile  number should be of 10 digits")
    private long mobile;
    @Email(message = "email address should be valid")
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty(message = "GST number is mandatory for seller.")
    private String gstNumber;

}
