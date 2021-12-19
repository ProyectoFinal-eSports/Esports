package com.esports.filter;

import com.esports.model.Constants;
import com.esports.model.SecurityRole;
import com.esports.model.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/admin/*", dispatcherTypes = {DispatcherType.REQUEST})
public class SecurityFilter extends HttpFilter {

    Logger log = LoggerFactory.getLogger(SecurityFilter.class);

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String homeUrl = "http://"+request.getServerName()+":"+request.getServerPort();

        log.info("security filter - authoring user");

        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect(homeUrl);
            return;
        }

        UserDTO userDto = (UserDTO) session.getAttribute(Constants.USER_SESSION);
        if (userDto == null || userDto.getSecurityRole() != SecurityRole.ADMIN) {
            response.sendRedirect(homeUrl);
            return;
        }

		chain.doFilter(request, response);
	}
}
