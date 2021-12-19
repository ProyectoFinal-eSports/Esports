package com.esports.model.dto;

import com.esports.model.SecurityRole;

public class UserDTO {

	private Long id;
	private String loginname;
	private String password;
	private String firstname;
	private String surname;
	private String email;
	private SecurityRole securityRole = SecurityRole.USER;
	private Boolean admin = false;

	public UserDTO() {
	}

	public UserDTO(Long id) {
		this.id = id;
	}

	public UserDTO(String loginname, String password, String firstname, String surname, String email,
			SecurityRole securityRole) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.securityRole = securityRole;
	}

	public UserDTO(String loginname, String password) {
		this(loginname, password, SecurityRole.USER);
	}

	public UserDTO(String loginname, String password, SecurityRole securityRole) {
		this.loginname = loginname;
		this.password = password;
		this.securityRole = securityRole;
	}

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

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "UserDTO{" + "id=" + id + ", loginname='" + loginname + '\'' + ", password='" + password + '\''
				+ ", securityRole=" + securityRole + ", admin=" + admin + '}';
	}
}
