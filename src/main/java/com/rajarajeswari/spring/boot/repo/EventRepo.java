package com.rajarajeswari.spring.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajarajeswari.spring.boot.entity.EventEntity;

public interface EventRepo  extends JpaRepository<EventEntity, String>{

}
