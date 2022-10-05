/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.RoomInterface;
import com.example.demo.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class RoomRepository {
   @Autowired
    private RoomInterface categoryCrudRepository;
    
    public List<Room> getAll (){
        return (List<Room>) categoryCrudRepository.findAll();
    }
    public Optional<Room> getRoom(int id){
        return categoryCrudRepository.findById(id);
    } 
    
    public Room save (Room room){
        return categoryCrudRepository.save(room);
    } 
}
