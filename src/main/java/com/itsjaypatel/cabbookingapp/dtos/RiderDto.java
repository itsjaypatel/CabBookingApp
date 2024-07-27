package com.itsjaypatel.cabbookingapp.dtos;

import com.itsjaypatel.cabbookingapp.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDto {

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserDto user;

    private Double rating;
}
