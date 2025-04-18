// filepath: d:\BACKEND\Spring Boot VScode\AI-Paitent website\Backend\AiMedical\src\main\java\com\example\Repository\ReportRepository.java
package com.example.Repository;

import com.example.Model.Report;
import com.example.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByUser(User user);
}