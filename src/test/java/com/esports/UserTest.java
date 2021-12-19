package com.esports;

import com.esports.model.SecurityRole;
import com.esports.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTest {

	@Test
	void givenUser_whenAssignSecurityRole_thenSecurityRoleIsAssigned() {
		SecurityRole role = SecurityRole.ADMIN;
		User user = new User("lolo", "pass");
		User userAdmin = new User("admin", "pass", SecurityRole.ADMIN);

		Assertions.assertTrue(SecurityRole.values().length > 0);
		Assertions.assertTrue(role.getRoles().size() > 0);
		Assertions.assertEquals(role.toString(), "ADMIN");
		Assertions.assertEquals(user.getSecurityRole(), SecurityRole.USER);
		Assertions.assertEquals(userAdmin.getSecurityRole(), SecurityRole.ADMIN);
		Assertions.assertEquals(1, SecurityRole.ADMIN.ordinal());
	}

}
