package com.example.TicketBookingApp.repository;

import com.example.TicketBookingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
