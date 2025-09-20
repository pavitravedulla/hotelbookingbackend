package com.klu.controller;

import com.klu.model.Hotel;
import com.klu.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/list")
    public List<Hotel> getHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping("/add")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }
}
