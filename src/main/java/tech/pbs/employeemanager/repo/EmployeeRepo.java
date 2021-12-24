package tech.pbs.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.pbs.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
