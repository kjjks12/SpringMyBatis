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

		// 요청이 어떤 컨트롤러를 실행하는지를 찾아서 그 컨트롤러를 생성해서 호출해준다.
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
