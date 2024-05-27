package com.ecommerce.user.userdetailservice.dto;

import com.ecommerce.user.userdetailservice.entity.Users;
import com.ecommerce.user.userdetailservice.entity.Vendor;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AddressDto {
    private Users user;
    private Vendor vendor;
    private String addressLine1;

    private String addressLine2;

    @NotEmpty
    private String city;
    @Pattern(regexp = "(^$|[0-9]{6})", message = "pin code should be 6 digits")
    private Integer pinCode;
}
