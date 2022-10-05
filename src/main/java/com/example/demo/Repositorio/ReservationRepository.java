/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ReservationInterface;
import com.example.demo.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */

@Repository
public class ReservationRepository {
  @Autowired
    private ReservationInterface categoryCrudRepository;
    
    public List<Reservation> getAll (){
        return (List<Reservation>) categoryCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return categoryCrudRepository.findById(id);
    } 
    
    public Reservation save (Reservation reservation){
        return categoryCrudRepository.save(reservation);
    }
}
