package com.javacodegeeks.snippets.enterprise.cdibeans.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javacodegeeks.snippets.enterprise.cdibeans.GreetingCard;
import com.javacodegeeks.snippets.enterprise.cdibeans.GreetingType;
import com.javacodegeeks.snippets.enterprise.cdibeans.GreetingType.Greetings;
import com.javacodegeeks.snippets.enterprise.cdibeans.GreetingsProducer;

@WebServlet(name = "greetingServlet", urlPatterns = {"/sayHello"})
public class GreetingServlet extends HttpServlet {

	private static final long serialVersionUID = -1L;
	
	@Inject
	@GreetingsProducer
	@GreetingType(Greetings.HELLO)
	private GreetingCard greetingCard;

	@Inject
	@GreetingsProducer
	@GreetingType(Greetings.HI)
	private GreetingCard anotherGreetingCard;

	  public void init() throws ServletException {
	  }

	  public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + greetingCard.sayHello() + "</h1>");
	      out.println("<h1>" + anotherGreetingCard.sayHello() + "</h1>");
	  }
	  
	  public void destroy(){
	  }

}