import org.usefullibs.greeter.Greeter;
import org.usefullibs.greeter.impl.HelloWorld;

import java.io.IOException;

public class GreetingServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Greeter greeter = new HelloWorld();
        String message = greeter.greet();
        response.getOutputStream().print(message);
    }
}
