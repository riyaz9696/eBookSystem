import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/bookingSystem")
public class BookingSystem extends HttpServlet
{
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    String name=req.getParameter("name");
    String address=req.getParameter("address");
    String college=req.getParameter("college");
    String city=req.getParameter("city");
    String state=req.getParameter("state");
    String country=req.getParameter("country");

    out.println(name);
    out.println(address);
    out.println(college);
    out.println(city);
    out.println(state);
    out.println(country);
  }

}