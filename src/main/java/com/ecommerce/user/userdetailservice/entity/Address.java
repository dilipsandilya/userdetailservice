package com.ecommerce.user.userdetailservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Entity
@AllArgsConstructor
@Getter @Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer addressId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToOne(mappedBy = "address")
    private Vendor vendor;
    private String addressLine1;

    private String addressLine2;

    @NotEmpty
    private String city;
    @Pattern(regexp = "(^$|[0-9]{6})", message = "pin code should be 6 digits")
    private Integer pinCode;

}
