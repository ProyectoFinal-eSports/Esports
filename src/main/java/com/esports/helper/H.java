package com.esports.helper;

import javax.servlet.http.HttpSession;

import com.esports.exception.DangerException;
import com.esports.model.entity.User;

public class H {
	/**
	 * 
	 * @param rolExigido Tres posibilidades "anon", "auth", "admin"
	 * @param s          la sesión activa
	 * @throws DangerException si el rol no coincide con el del usuario activo
	 */
	public static void isRolOK(String rolExigido, HttpSession s) throws DangerException {
		String rolActual = "anon";

		if (s.getAttribute("user") != null) {
			rolActual = ((User) (s.getAttribute("user"))).isAdmin() ? "admin" : "auth";
		}

		if ((rolActual == "anon" || rolActual == "auth") && rolExigido == "admin") {
			throw new DangerException("Rol inadecuado");
		}

		if ((rolActual == "anon") && rolExigido == "auth") {
			throw new DangerException("Rol inadecuado");
		}

		if ((rolActual != "anon") && rolExigido == "anon") {
			throw new DangerException("Rol inadecuado");
		}

	}
}