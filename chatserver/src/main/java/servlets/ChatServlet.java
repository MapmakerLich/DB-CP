package servlets;

import util.Collector;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        PrintWriter stream = resp.getWriter();
        req.getPathInfo();
        try
        {
            Collector.printUsers(stream);
            Collector.printGroupChats(stream);
            Collector.printPrivateChats(stream);
            Collector.printMessages(stream);
        }
        catch (SQLException e)
        {
            System.out.println("Database error");
        }
    }
}
