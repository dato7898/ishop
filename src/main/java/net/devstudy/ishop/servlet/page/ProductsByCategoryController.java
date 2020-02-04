package net.devstudy.ishop.servlet.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.devstudy.ishop.servlet.AbstractController;
import net.devstudy.ishop.util.RoutingUtils;

@WebServlet("/products/*")
public class ProductsByCategoryController extends AbstractController {
	private final static int SUBSTRING_INDEX = "/products".length();
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().substring(SUBSTRING_INDEX);
		RoutingUtils.forwardToPage("products.jsp", req, resp);
	}
}
