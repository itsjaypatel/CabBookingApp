package com.itsjaypatel.cabbookingapp.dtos;

import com.itsjaypatel.cabbookingapp.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {

    private UserDto user;

    private Double rating;
}
