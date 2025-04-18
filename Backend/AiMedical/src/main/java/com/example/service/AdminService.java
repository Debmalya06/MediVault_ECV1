package com.example.service;

import com.example.Model.Admin;
import com.example.Repository.AdminRepository;
import com.example.dto.ApiResponseAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public ApiResponseAdmin login(String email, String password) {
        Optional<Admin> adminOptional = adminRepository.findByEmailAndPassword(email, password);
        if (adminOptional.isPresent()) {
            Admin admin = adminOptional.get();
            return new ApiResponseAdmin(true, "Admin Login successful", admin.getAdminname(), admin);
        } else {
            return new ApiResponseAdmin(false, "Invalid email or password");
        }
    }
}