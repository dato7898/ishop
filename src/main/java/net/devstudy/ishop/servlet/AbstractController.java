package net.devstudy.ishop.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import net.devstudy.ishop.service.OrderService;
import net.devstudy.ishop.service.ProductService;
import net.devstudy.ishop.service.impl.ServiceManager;

public abstract class AbstractController extends HttpServlet {
	private ProductService productService;
	
	private OrderService orderService;

	@Override
	public final void init() throws ServletException {
		productService = ServiceManager.getInstance(getServletContext()).getProductService();
		orderService = ServiceManager.getInstance(getServletContext()).getOrderService();
	}

	public final ProductService getProductService() {
		return productService;
	}

	public final OrderService getOrderService() {
		return orderService;
	}
}
