package com.pratap.gradle.servlet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CouponServletTest {

	@Mock
	private HttpServletRequest request;
	
	@Mock
	private HttpServletResponse response;
	
	@Mock
	private RequestDispatcher dispatcher;

	@Before
	public void setup() throws Exception{
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testDoGet() throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(printWriter);
		new CouponServlet().doGet(request, response);
		assertEquals("SUPERSALE", stringWriter.toString());
	}
	
	@Test
	public void testDoPost() throws Exception {
		when(request.getParameter("coupon")).thenReturn("SUPERSALE");
		when(request.getRequestDispatcher("response.jsp")).thenReturn(dispatcher);
		
		new CouponServlet().doPost(request, response);
		
		verify(request).setAttribute("discount", "Discount for coupon SUPERSALE is 45%");
		verify(dispatcher).forward(request, response);
	}
}
