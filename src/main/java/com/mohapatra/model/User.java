package com.mohapatra.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.mohapatra.domain.USER_ROLE;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String email;

	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	private String fullName;
	private String mobile;

	private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;

	private Set<Address> addresses = new HashSet<>();

	private Set<Coupon> usedCoupon = new HashSet<>();
}
