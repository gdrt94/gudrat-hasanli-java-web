/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gudrat
 */
public class MobileFilter implements Filter {
    
    
    private FilterConfig filterConfig = null;
    
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        
        Throwable problem = null;
        try {
            //--Message-- UserAgentServlet klassını web.xml-dən Welcome file etdim
        String UA = req.getHeader("User-Agent");
        
        if(UA.indexOf("iPhone")>-1||UA.indexOf("Android")>-1) 
        {
            req.getSession().getServletContext().getRequestDispatcher("/mobile.jsp").forward(request, response);
        }
        
        chain.doFilter(request, response);
        //--Message-- response objectinin sendRedirect metodundan istifadə etmədim,
        // çünki bu zaman url klientin browser-inə göndərilir sonra isə təzədən serverə həmin 
        // url ilə müraciət olunur. Bu metoddan başqa WebApp-yə müraciət olunanda istifadə etmək
        // məqsədə uyğundur
        
        
        
        /*if(session.getAttribute("username") != null && 
                    session.getAttribute("loginTime") != null) {
                System.out.println("User " + session.getAttribute("username")  + " is logged in, continue processing.");
                chain.doFilter(request, response);
            } else {
                System.out.println("User is not logged in, redirect to login page.");
                res.sendRedirect("index.jsp");
            }*/
            
            
        } catch (Throwable t) {
            problem = t;
            t.printStackTrace();
        }
        
    }

    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;    
    }
           
}
