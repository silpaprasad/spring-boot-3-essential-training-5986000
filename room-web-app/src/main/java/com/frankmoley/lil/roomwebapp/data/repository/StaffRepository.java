package com.frankmoley.lil.roomwebapp.data.repository;

import com.frankmoley.lil.roomwebapp.data.entity.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StaffRepository extends JpaRepository<StaffMember, UUID> {
}