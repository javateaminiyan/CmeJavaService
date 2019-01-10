package com.careercounsling.cme.service.Employee;

import com.careercounsling.cme.tables.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees, Long>, EmployeeRepositoryCustom {


}
