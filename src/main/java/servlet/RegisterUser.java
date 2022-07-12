package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// フォワード先
		String forwardPath = null;

		// サーブレットクラスの動作を決定する「action」の値を
		// リクエストパラメータから取得
		String action = request.getParameter("action");

		// 「登録の開始」をリクエストされたときの処理
		if (action == null) {
			// フォワード先の指定
			forwardPath = "/WEB-INF/jsp/registerForm.jsp";
		}
		//登録画面から登録実行をリクエストされたとき
		else if (action.equals("done")) {
			// セッションスコープに保存された登録ユーザーを取得
			HttpSession session = request.getSession();
			User se_registerUser = (User) session.getAttribute("registerUser");

			// 応用：セッションの内容をリクエストスコープ内に保存
			request.setAttribute("registerUser", se_registerUser);

			// 登録処理呼び出し
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(se_registerUser);

			// 不要なセッションの破棄
			session.removeAttribute("registerUser");

			forwardPath = "/WEB-INF/jsp/registerDone.jsp";
		}

		RequestDispatcher disp = request.getRequestDispatcher(forwardPath);
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		// 登録するユーザ情報を設定
		User registerUser = new User(id, name, pass);

		// セッションスコープに登録ユーザーを保存
		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);

		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
		disp.forward(request, response);
	}

}
