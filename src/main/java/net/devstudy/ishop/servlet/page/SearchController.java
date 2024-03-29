package net.devstudy.ishop.servlet.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.devstudy.ishop.servlet.AbstractController;
import net.devstudy.ishop.util.RoutingUtils;

@WebServlet("/search")
public class SearchController extends AbstractController {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("productCount", 24);
		RoutingUtils.forwardToPage("search-result.jsp", req, resp);
	}
}
