package com.carleasingsystem.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.carleasingsystem.api.Entities.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
