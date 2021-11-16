package com.axis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.LoanApplication;

public interface IloanApplicationDao extends JpaRepository<LoanApplication, Integer> {

}
