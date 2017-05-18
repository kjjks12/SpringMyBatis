package kosta.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ��û�� � ��Ʈ�ѷ��� �����ϴ����� ã�Ƽ� �� ��Ʈ�ѷ��� �����ؼ� ȣ�����ش�.
		String command = request.getParameter("command");
		Controller controller = HandlerMapping.getInstance().createController(command);
		ModelAndView mv = null;
		try {
			mv = controller.excute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(mv.isRedirect()){
			response.sendRedirect(mv.getPath());
		}
		else{
			request.getRequestDispatcher(mv.getPath()).forward(request, response);
		}
		
	}

}
