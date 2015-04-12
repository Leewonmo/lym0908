package com.shinhan.cspclass;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
class RetrieceTeamMemberServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp, String key)
			throws IOException 
	{
		req.setCharacterEncoding("EUC-KR");
		resp.setContentType("text/html;charset=UTF-8");
		
		List<TeamMember> memberList = MemberManager.getAllMembers();
		
		
		/*resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");*/
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table>");
		
		
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>이름:</td>");
		resp.getWriter().println("<td>주민번호:</td>");
		resp.getWriter().println("<td>학번:</td>");
		resp.getWriter().println("<td>전화번호:</td>");
		resp.getWriter().println("<td>주소:</td>");
		resp.getWriter().println("<td>체크아이디:</td>");
		resp.getWriter().println("<td>아이디:</td>");
		resp.getWriter().println("<td>팀장여부:</td>");
		resp.getWriter().println("<td>gitID:</td>");
		resp.getWriter().println("</tr>");
	
		
		
		
		
		resp.getWriter().println("<tr>");
		for(TeamMember tm : memberList)
		{
			resp.getWriter().println("<tr>");
			
//			pw.println("<tr>");
//			pw.println("<td>" + "<a href = '/readmember?name="
//					+ m.getName() + "'>" + m.getName() + "</a>" + "</td><td>"
//					+ m.getHak() + "</td><td>" + m.getPhone() + "</td><td>"
//					+ m.getEmail() + "</td><td>" + m.getCacao() + "</td><td>"
//					+ m.getCheck() + "</td><td>" + m.getGit() + "</td><td>"
//					+ "<a href = '/memberdelete?key=" + m.getKey() + "'>삭제</td>");
//			pw.println("</tr>");
			
			resp.getWriter().println
			("<td>"+"<a href='/readteammember?name="+tm.getName() + ">" + tm.getName() +"</a>"+ 
					"</td><td>" + tm.getSocialNum() + 
					"</td><td>" + tm.getHakname() + 
					"</td><td>" + tm.getTell() + 
					"</td><td>" + tm.getAdd() + 
					"</td><td>" + tm.getCkid() +
					 "</td><td>"+ tm.getId() +  
					 "</td><td>" + tm.getValue()+ 
					 "</td><td>" + tm.getGitid() + "</td><td>");
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</tr>");

		resp.getWriter().println("</table>");
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
