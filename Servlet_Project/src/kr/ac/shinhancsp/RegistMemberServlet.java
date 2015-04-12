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
		resp.getWriter().println("�̸�: "+m.getName() +"<br>");
		resp.getWriter().println("�ֹι�ȣ :"  +m.getSocialNumber() +"<br>");
		resp.getWriter().println("�й�: "+m.getHakname() +"<br>");
		resp.getWriter().println("��ȭ��ȣ: "+m.getTell() +"<br>");
		resp.getWriter().println("�ּ�: "+m.getAdd() +"<br>");
		if (req.getParameter("value")!=null)
			resp.getWriter().println("���忩�� : ���� ����"+"</br>");
		else
			resp.getWriter().println("���忩�� : ���� ����"+"</br>");
		resp.getWriter().println("gitID: "+m.getGitid() +"<br>");
		
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}