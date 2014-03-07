package de.codecentric.sjwa.shop.beans;

import java.io.Serializable;
import java.security.Principal;

import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

@ManagedBean
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	@Resource(name = "jdbc/sjwaDB")
	private DataSource ds;

	public String login() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) fc.getExternalContext().getRequest();
		try {
			// Login using Servlet 3.0
			request.login(username, password);

			Principal principal = request.getUserPrincipal();

			// it's not possible to get the role, only to ask for it
			if (request.isUserInRole("admin")) {
				String msg = "User: " + principal.getName() + ", Role: admin";
				fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
				return "admin/startrek";
			} else if (request.isUserInRole("manager")) {
				String msg = "User: " + principal.getName() + ", Role: manager";
				fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
				return "manager/timesheet";
			} else if (request.isUserInRole("employee")) {
				String msg = "User: " + principal.getName() + ", Role: employee";
				fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
				return "employee/work";
			}
			return "du_musst_die_rollen_noch_definieren"; // hier sollte etwas
															// sinnvolles
															// passieren ;-)
		} catch (ServletException e) {
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "An Error Occured: Login failed", null));
			e.printStackTrace();
		}
		return "loginFailed";
	}

	public void logout() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);

		if (session != null) {
			session.invalidate();
		}

		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext, null, "/index.xhtml");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
