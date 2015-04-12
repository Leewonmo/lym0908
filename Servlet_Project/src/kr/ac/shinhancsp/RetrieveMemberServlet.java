package kr.ac.shinhancsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RetrieveMemberServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");

		List<Member> memberList = MemberManager.getAllMembers();

		
		resp.getWriter().println("<HTML>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table border = 1>");
		for (Member m : memberList) {
			resp.getWriter().println("<tr>");
			resp.getWriter().println(
					"<td>" 
							+ m.getName() + "'>" + m.getName() + "</a>"
							+ "</td><td>" + m.getSocialNumber() + 
							"</td><td>"	+ m.getHakname() +
							"</td><td>"	+ m.getTell() +
							"</td><td>"	+ m.getAdd() +
							"</td><td>"	+ m.getValue() +
							"</td><td>"	+ m.getGitid() +
							
							
							 "</td>");
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</HTML>");

	}

}