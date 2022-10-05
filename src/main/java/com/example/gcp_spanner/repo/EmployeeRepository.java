package com.example.gcp_spanner.repo;

import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;
import org.springframework.stereotype.Repository;

import com.example.gcp_spanner.model.Employee;

@Repository
public interface EmployeeRepository extends SpannerRepository<Employee, Integer> {

}
