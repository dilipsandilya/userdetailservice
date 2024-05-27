package com.ecommerce.user.userdetailservice.dto;

import com.ecommerce.user.userdetailservice.entity.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class VendorDto {
    private String name;
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
