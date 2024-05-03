

package sisrh.filter;

 

import java.io.*;

import javax.servlet.*;

import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;

 

 

@WebFilter("*")

public class AuditoriaFilter implements Filter {

 

         @Override

         public void init(final FilterConfig filterConfig) throws ServletException {

         }

 

         @Override

         public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)

                         throws IOException, ServletException {

                 HttpServletRequest httpRequest = (HttpServletRequest) request;

                 String ipAddress = request.getLocalAddr();             

          

                 System.out.println(ipAddress + ":" + httpRequest.getRequestURI().toString());  

                

                 chain.doFilter(httpRequest, response);

         }

 

         @Override

         public void destroy() {

         }

}