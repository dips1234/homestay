package com.app.homestay.repository;

import com.app.homestay.entity.Homestay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeStayRepository extends JpaRepository<Homestay,Integer> {
}
