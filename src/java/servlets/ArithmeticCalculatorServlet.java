package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ericm
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "-----");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        int result = 0;

        if (operation == null || operation.equals("")) {
            request.setAttribute("message", "-----");
        } else if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("message", "invalid");
        } else {
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);

            if (operation.equals("+")) {
                result = firstNum + secondNum;
            } else if (operation.equals("-")) {
                result = firstNum - secondNum;
            } else if (operation.equals("*")) {
                result = firstNum * secondNum;
            } else if (operation.equals("%")) {
                result = firstNum % secondNum;
            }

            request.setAttribute("message", result);
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
