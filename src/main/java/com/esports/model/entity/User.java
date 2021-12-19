package com.esports.model.entity;

import com.esports.model.SecurityRole;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	// ================================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String loginname;

	private String password;

	private String firstname;

	private String surname;

	private String email;

	// ================================================

	@Column(name = "security_role")
	@Enumerated(value = EnumType.ORDINAL)
	private SecurityRole securityRole;

	public User() {
	}

	public User(String loginname, String password, String firstname, String surname, String email,
			SecurityRole securityRole) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.securityRole = securityRole;
	}

	public User(String loginname, String password) {
		this(loginname, password, SecurityRole.USER);
	}

	public User(String loginname, String password, SecurityRole securityRole) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.securityRole = securityRole;
	}

	// ================================================

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SecurityRole getSecurityRole() {
		return securityRole;
	}

	public void setSecurityRole(SecurityRole securityRole) {
		this.securityRole = securityRole;
	}
}
