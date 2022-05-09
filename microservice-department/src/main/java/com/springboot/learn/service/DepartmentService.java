package com.springboot.learn.service;

import com.springboot.learn.entity.Department;
import com.springboot.learn.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of service");
        return departmentRepository.save(department);
    }
    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findDepartmentById of service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
