package com.itsjaypatel.cabbookingapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointDto {

    private double[] coordinates;

    private String type = "Point";
}
