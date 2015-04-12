package kr.ac.shinhancsp;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegistMemberServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		
		String name = req.getParameter("name");
		String socialNumber = req.getParameter("socialNumber");
		String hakname = req.getParameter("hakname");
		String tell = req.getParameter("tell");
		String add = req.getParameter("add");
		String value = req.getParameter("value");
		String gitid = req.getParameter("gitid");
		
		
		
		Member m = MemberManager.addMember(name,socialNumber, hakname, tell, add, value, gitid);
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("이름: "+m.getName() +"<br>");
		resp.getWriter().println("주민번호 :"  +m.getSocialNumber() +"<br>");
		resp.getWriter().println("학번: "+m.getHakname() +"<br>");
		resp.getWriter().println("전화번호: "+m.getTell() +"<br>");
		resp.getWriter().println("주소: "+m.getAdd() +"<br>");
		if (req.getParameter("value")!=null)
			resp.getWriter().println("팀장여부 : 팀장 있음"+"</br>");
		else
			resp.getWriter().println("팀장여부 : 팀장 없음"+"</br>");
		resp.getWriter().println("gitID: "+m.getGitid() +"<br>");
		
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}