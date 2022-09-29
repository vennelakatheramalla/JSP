package com.iq.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iq.model.Employee;
import com.iq.service.EmployeeService;
import com.iq.service.EmployeeServiceImpl;

public class FindAllEmpServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeService employeeService=new EmployeeServiceImpl();
		List<Employee>employees=employeeService.findAll();
		req.setAttribute("employees", employees);
		RequestDispatcher rd=req.getRequestDispatcher("findAll.jsp");
		rd.forward(req, resp);
		
//		resp.setContentType("text/html");
//		PrintWriter out=resp.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<table border='1px'>");
//		out.println("<tr><th>Eid</th><th>Ename</th><th>Esal</th></tr>");
//		for (Employee employee : employees) {
//			out.println("<tr><td>" + employee.getEid() +"</td><td>" + employee.getEname() + "</td><td>" + employee.getEsal()+" </td></tr>");
//			
//		}
//		
//		out.println("</table>");
//		out.println("</body>");
//		out.println("</html>");
	}

}
