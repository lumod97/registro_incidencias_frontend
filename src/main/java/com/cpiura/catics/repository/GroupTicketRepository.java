package com.cpiura.catics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpiura.catics.entity.GroupTicket;

@Repository
public interface GroupTicketRepository extends JpaRepository<GroupTicket, Integer> {
    List<GroupTicket> findTop10ByOrderByIdDesc(); // If you want to order by the 'date' field
}