package com.example.roomwebapp.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity //Marks this class as a database table
@Table(name="ROOMS")
@Data //From Project Lombok
public class RoomEntity {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.UUID) //Automatically generates unique ID
    @Column(name = "ROOM_ID")//maps java field roomId to column name ROOM_ID
    private UUID roomId; //java field
    @Column(name="NAME")
    private String name;
    @Column(name = "NUMBER")
    private String number;
    @Column(name="BED_INFO")
    private String bedInfo;
}
