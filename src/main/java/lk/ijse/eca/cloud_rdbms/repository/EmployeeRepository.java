package lk.ijse.eca.cloud_rdbms.repository;

import lk.ijse.eca.cloud_rdbms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}