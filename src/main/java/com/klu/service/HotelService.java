package com.klu.service;

import com.klu.model.Hotel;
import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotels();
    Hotel addHotel(Hotel hotel);
}
