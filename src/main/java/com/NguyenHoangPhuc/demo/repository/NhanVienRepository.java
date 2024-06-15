package com.NguyenHoangPhuc.demo.repository;

import com.NguyenHoangPhuc.demo.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    NhanVien searchNhanVienByTenNV(String keyword);
}