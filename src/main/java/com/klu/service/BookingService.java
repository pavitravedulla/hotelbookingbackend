package com.klu.service;


import com.klu.model.Booking;
import com.klu.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepo;

    public BookingService(BookingRepository bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepo.save(booking);
    }
}
