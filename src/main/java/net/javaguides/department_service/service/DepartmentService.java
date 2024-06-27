package net.javaguides.department_service.service;

import net.javaguides.department_service.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);

}
