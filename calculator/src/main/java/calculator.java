import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class calculator extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title> Calculator </title></head></html>");
        double n1 = Double.parseDouble(request.getParameter("number1"));
        double n2 = Double.parseDouble(request.getParameter("number2"));
        double res = 0;
        String operator = request.getParameter("operator");
        if (operator.equals("+"))
            res = n1 + n2;
        if (operator.equals("*"))
            res = n1 * n2;
        if (operator.equals("-"))
            res = n1 - n2;
        if (operator.equals("/"))
            res = n1 / n2;
        out.println("<h2>Result: "+res+"</h2>");
        out.println("</body></html>");
    }
}




