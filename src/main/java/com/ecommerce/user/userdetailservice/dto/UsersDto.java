package com.ecommerce.user.userdetailservice.dto;

import com.ecommerce.user.userdetailservice.entity.Address;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class UsersDto {
    private String name;
    private long mobile;
    private String email;
    private String password;
    private String gstNumber;
    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
}
