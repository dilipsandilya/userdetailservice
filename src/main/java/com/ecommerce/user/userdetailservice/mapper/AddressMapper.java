package com.ecommerce.user.userdetailservice.mapper;

import com.ecommerce.user.userdetailservice.dto.AddressDto;
import com.ecommerce.user.userdetailservice.entity.Address;
public class AddressMapper {

    public static AddressDto mapToAddressDto(Address address, AddressDto addressDto) {
        addressDto.setPinCode(address.getPinCode());
        //TODO : Map all respective data sets
        return addressDto;
    }

    public static  Address mapToAddress(AddressDto addressDto, Address address) {
        //TODO: Map all respective data sets

        return address;
    }
}
