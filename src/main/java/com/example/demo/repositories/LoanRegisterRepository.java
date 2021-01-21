package com.example.demo.repositories;

import com.example.demo.models.LoanRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRegisterRepository extends JpaRepository<LoanRegister, Long> {


}
