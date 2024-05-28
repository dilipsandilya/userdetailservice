package com.ecommerce.user.userdetailservice.mapper;

import com.ecommerce.user.userdetailservice.dto.VendorDto;
import com.ecommerce.user.userdetailservice.entity.Vendor;

public class VendorMapper {

    public static VendorDto mapToVendorDto(VendorDto vendorDto, Vendor vendor) {
        return vendorDto;
    }

    public static Vendor mapToVendor(Vendor vendor, VendorDto vendorDto) {
        return vendor;
    }
}
