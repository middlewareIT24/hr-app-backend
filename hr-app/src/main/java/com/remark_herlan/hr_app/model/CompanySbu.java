package com.remark_herlan.hr_app.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * author: Naimul Hassan
 * 
 * date: 5/15/2025
 */

@Entity
@Table(name = "company_sbu")
public class CompanySbu {

	@Id
	private Long id;

	private String title;
	private String description;
	private Boolean isActive;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDate activationDate;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDate inactivationDate;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public LocalDate getActivationDate() {
		return activationDate;
	}

	public LocalDate getInactivationDate() {
		return inactivationDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}

	public void setInactivationDate(LocalDate inactivationDate) {
		this.inactivationDate = inactivationDate;
	}

}
