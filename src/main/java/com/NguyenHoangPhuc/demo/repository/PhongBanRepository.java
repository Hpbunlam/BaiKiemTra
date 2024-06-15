package com.NguyenHoangPhuc.demo.repository;

import com.NguyenHoangPhuc.demo.model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}