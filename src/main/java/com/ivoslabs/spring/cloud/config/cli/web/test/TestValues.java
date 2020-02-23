package com.ivoslabs.spring.cloud.config.cli.web.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ivoslabs.spring.cloud.config.cli.web.SomeService;

/**
 * Servlet to test de SomeService values <br>
 * http://127.0.0.1:8080/spring-cloud-conf-cli-web-impl-example/TestValues
 * 
 * @author imperezivan
 *
 */
@WebServlet(name = "TestValues", urlPatterns = { "/TestValues" })
public class TestValues extends HttpServlet {

    /** The constant serial Version UID */
    private static final long serialVersionUID = 1L;

    /** The logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(TestValues.class);

    /**
     * Creates a new TestValues
     */
    public TestValues() {
	super();
    }

    /*
     * 
     * (non-Javadoc)
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");

	try (PrintWriter out = response.getWriter()) {
	    response.addHeader(getServletName(), getServletInfo());
	    ServletContext context = super.getServletContext();
	    WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
	    out.print(ctx.getBean(SomeService.class).toString());
	} catch (Exception e) {
	    LOGGER.error(e.getMessage(), e);
	}

    }

    /*
     * 
     * (non-Javadoc)
     * 
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	try {
	    doGet(request, response);
	} catch (Exception e) {
	    LOGGER.error(e.getMessage(), e);
	}

    }

}
