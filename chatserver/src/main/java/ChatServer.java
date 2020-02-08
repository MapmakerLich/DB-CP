import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;

import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletHandler;

public class ChatServer {
    public static void main(String[] args)
    {
        Server server = new Server(8080);
        HandlerList handlers = new HandlerList();
        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping("servlets.ChatServlet", "/Users");
        handlers.setHandlers(new Handler[] {handler});
        server.setHandler(handlers);
        try
        {
            server.start();
        }
        catch (Exception e)
        {
            System.out.println("Server start error");
        }
    }
}
