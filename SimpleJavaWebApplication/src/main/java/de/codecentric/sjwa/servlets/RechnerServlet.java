/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.codecentric.sjwa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.codecentric.sjwa.model.BerechnungsWerte;
import de.codecentric.sjwa.operationen.Addition;

/**
 * CDI funktioniert auch in einem Servlet (3.0)
 */
@WebServlet(name = "RechnerServlet", urlPatterns = { "/rechner2" })
public class RechnerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private Addition addition;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text /html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			final BerechnungsWerte value = new BerechnungsWerte();
			value.setWert1(10L);
			value.setWert2(20L);
			out.println(addition.ausfuehren(value));
		} finally {
			out.close();
		}
	}

}
