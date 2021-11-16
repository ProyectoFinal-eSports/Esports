package com.esports.dto;

public class UserDTO {

	private Long id;
	private String loginname;
	private String password;
	private boolean admin;

	public UserDTO() {
	}

	public UserDTO(String loginname, String password) {
		super();
		this.loginname = loginname;
		this.password = password;
	}

	public UserDTO(Long id, String loginname, String password, boolean admin) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.admin = admin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDTO [id=");
		builder.append(id);
		builder.append(", loginname=");
		builder.append(loginname);
		builder.append(", password=");
		builder.append(password);
		builder.append(", admin=");
		builder.append(admin);
		builder.append("]");
		return builder.toString();
	}

}
