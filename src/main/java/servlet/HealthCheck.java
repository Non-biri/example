package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストパラメータの取得
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		// 入力値をプロパティに設定
		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		// 健康診断を実行し結果を設定
		HealthCheckLogic hcl = new HealthCheckLogic();
		hcl.execute(health);

		// リクエストスコープに保存
		request.setAttribute("health", health);
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
		disp.forward(request, response);
	}

}
