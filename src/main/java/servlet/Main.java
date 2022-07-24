package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int max_col = 5, max_row = 5;

		String[][] tableArray = new String[max_row][max_col];

		for (int row_i = 0; row_i < tableArray.length; row_i++) {
			for (int col_j = 0; col_j < tableArray.length; col_j++) {
				String rgpName = "cell_" + col_j + row_i;
				tableArray[row_i][col_j] = request.getParameter(rgpName);
				if (tableArray[row_i][col_j].equals("none")) {
					tableArray[row_i][col_j] = "";
				}
			}
		}

		request.setAttribute("tableArray", tableArray);

		String path = "./WEB-INF/jsp/result.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(path);
		disp.forward(request, response);
	}

}
