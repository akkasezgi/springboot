package com.eakkas.repository;

import com.eakkas.repository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Employee, Long> {
}
