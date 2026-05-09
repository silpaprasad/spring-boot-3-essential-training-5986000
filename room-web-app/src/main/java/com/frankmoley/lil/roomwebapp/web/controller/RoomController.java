package com.frankmoley.lil.roomwebapp.web.controller;

import com.frankmoley.lil.roomwebapp.data.entity.RoomEntity;
import com.frankmoley.lil.roomwebapp.data.repository.RoomRepository;
import com.frankmoley.lil.roomwebapp.web.model.Room;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping
    public  String getRoomsPage(Model model){
        List<RoomEntity> roomEntities = this.roomRepository.findAll();
        List<Room> rooms = new ArrayList<>(roomEntities.size());
        roomEntities.forEach(e->rooms.add(new Room(e.getRoomId(),e.getName(),e.getNumber(),e.getBedInfo())));
        model.addAttribute("rooms", rooms); //This sends data to the HTML page.
        return "rooms";
    }
}

//Browser request → Controller method
//        ↓
//roomRepository.findAll()
//        ↓
//Database → RoomEntity list
//        ↓
//Convert Entity → Room DTO
//        ↓
//model.addAttribute("rooms", rooms)
//        ↓
//Thymeleaf renders rooms.html
//        ↓
//<tr th:each="room : ${rooms}">
