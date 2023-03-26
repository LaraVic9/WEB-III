import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalhos")
public class CabecalhosServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String host = req.getHeader("Host");
        String userAgent = req.getHeader("User-Agent");
        String acceptEncoding = req.getHeader("Accept-Encoding");
        String acceptLanguage = req.getHeader("Accept-Language");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Host: " + host + "</h1>");
        out.println("<h1>User-Agent: " + userAgent + "</h1>");
        out.println("<h1>Accept-Encoding: " + acceptEncoding + "</h1>");
        out.println("<h1>Accept-Language: " + acceptLanguage + "</h1>");
        out.println("</body></html>");
    }
}
