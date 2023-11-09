import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AtomicInteger yesCount = new AtomicInteger(0);
    private AtomicInteger noCount = new AtomicInteger(0);
    private AtomicInteger dontCareCount = new AtomicInteger(0);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vote = request.getParameter("vote");

        if ("yes".equals(vote)) {
            yesCount.incrementAndGet();
        } else if ("no".equals(vote)) {
            noCount.incrementAndGet();
        } else if ("dontcare".equals(vote)) {
            dontCareCount.incrementAndGet();
        } else {
            // Handle invalid votes
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().write("Yes: " + yesCount + ", No: " + noCount + ", Don't Care: " + dontCareCount);
    }
}