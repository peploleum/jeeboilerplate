//package com.peploleum.jeebpmaster.servlet;
//
//import java.io.IOException;
//import java.io.StringWriter;
//
//import javax.inject.Inject;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyDto;
//import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyService;
//
//@WebServlet("/servlet")
//public class DummyServlet extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Inject
//	private DummyService dummyService;
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("HEY DUDE");
//		DummyDto produce = dummyService.produce();
//		try {
//			final StringWriter writer = new StringWriter();
//			final ObjectMapper mapper = new ObjectMapper();
//			mapper.writeValue(writer, produce);
//			final String message = writer.getBuffer().toString();
//			System.out.println(message);
//			resp.setStatus(HttpServletResponse.SC_OK);
//			resp.getWriter().write(message);
//			resp.getWriter().flush();
//			resp.getWriter().close();
//		} catch (final IOException e) {
//			//
//		}
//	}
//	
//}
