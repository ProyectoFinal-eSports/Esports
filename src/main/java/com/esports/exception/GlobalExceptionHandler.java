package com.esports.exception;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.view.RedirectView;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(DangerException.class)
	public String danger(HttpSession session, DangerException ex) {
		return handleError(session, ex);
	}

	@ExceptionHandler(InfoException.class)
	public String info(HttpSession session, InfoException ex) {
		return handleError(session, ex);
	}

	@ExceptionHandler(RuntimeException.class)
	public String runtimeEx(HttpSession session, RuntimeException rex) {
		return handleError(session, rex);
	}

	private String handleError(HttpSession session, Exception e) {
		logger.info("handleError >>> : "+e);

		String mensaje = e.getMessage() != null && e.getMessage() != "" ? e.getMessage().split("@")[0]
				: "Ha ocurrido un error. Pulsa para volver a home";
		String link = e.getMessage() != null && e.getMessage() != "" && e.getMessage().split("@").length > 1
				? e.getMessage().split("@")[1]
				: "/";

		session.setAttribute("_mensaje", mensaje);
		session.setAttribute("_link", link);
		session.setAttribute("_severity", "info");
		session.setAttribute("view", "/info");

		//return new RedirectView("/_t/frame");

		return "redirect:/info";

		//return "/_t/frame";
	}
}
