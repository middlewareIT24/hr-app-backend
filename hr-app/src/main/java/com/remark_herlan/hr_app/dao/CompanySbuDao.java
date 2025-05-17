package com.remark_herlan.hr_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.remark_herlan.hr_app.model.CompanySbu;

/**
 * author: Naimul Hassan
 * 
 * date: 5/17/2025
 */

@Repository
public interface CompanySbuDao extends JpaRepository<CompanySbu, Long> {

}
