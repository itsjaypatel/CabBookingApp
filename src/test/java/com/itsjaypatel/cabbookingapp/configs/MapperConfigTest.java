package com.itsjaypatel.cabbookingapp.configs;

import com.itsjaypatel.cabbookingapp.dtos.PointDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MapperConfigTest {

    @Autowired
    private ModelMapper modelMapper;

    @Test
    void customMappingTest(){
        PointDto pointDto = new PointDto(new double[]{1,2});
        Point point = modelMapper.map(pointDto, Point.class);

        log.info("point :: {}",point.toString());
        log.info("pointdto :: {}",pointDto.toString());

        assertEquals(pointDto.getCoordinates()[0], point.getX());
        assertEquals(pointDto.getCoordinates()[1], point.getY());
    }

}