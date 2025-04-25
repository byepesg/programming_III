
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        String operation = request.getParameter("operation");
        double result = 0;
        String symbol = "";

        switch (operation) {
            case "add":
                result = number1 + number2;
                symbol = "+";
                break;
            case "subtract":
                result = number1 - number2;
                symbol = "-";
                break;
            case "multiply":
                result = number1 * number2;
                symbol = "*";
                break;
            case "divide":
                if (number2 == 0) {
                    result = Double.NaN; // Not a number
                } else {
                    result = number1 / number2;
                }
                symbol = "/";
                break;
        }

        // Response output
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Calculation Result</title></head><body>");
        out.println("<h2>Result</h2>");
        if (Double.isNaN(result)) {
            out.println("<p>Error: Division by zero is not allowed.</p>");
        } else {
            out.println("<p>" + number1 + " " + symbol + " " + number2 + " = " + result + "</p>");
        }
        out.println("</body></html>");
    }
}
