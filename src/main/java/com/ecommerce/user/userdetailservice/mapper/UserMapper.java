package com.ecommerce.user.userdetailservice.mapper;

import com.ecommerce.user.userdetailservice.dto.UsersDto;
import com.ecommerce.user.userdetailservice.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UsersDto mapToUserDto(UsersDto usersDto, Users users) {
        return usersDto;
    }

    public static Users mapToUsers(UsersDto usersDto, Users users) {
        return  users;
    }
}
