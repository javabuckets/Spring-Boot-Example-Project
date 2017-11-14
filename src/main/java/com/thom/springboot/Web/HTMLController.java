package com.thom.springboot.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/14/2017
 */
@Controller
public class HTMLController {
    @RequestMapping(method = RequestMethod.GET, value = "")
    public String indexPage(HttpServletResponse response) {
        response.setHeader("Content-Type", "text/html");
        return "index";
    }
}
