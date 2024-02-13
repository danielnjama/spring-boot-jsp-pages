package org.example.webapp;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//    @RequestMapping(value = {"home","/"})
//    public String home(HttpServletRequest req)
//    {
//        String name = req.getParameter("name");
//        int age = Integer.parseInt(req.getParameter("age"));
//        req.setAttribute("name",name);
//        req.setAttribute("age",age);
//        return "index";
//
//        //Url will be like: http://127.0.0.1:8080/?name=dan8ny&age=121
//
//    }

    @RequestMapping(value = {"home","/"})
    public ModelAndView home(Alien alien)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",alien);

        mv.setViewName("index");

        return mv;
    }

    @RequestMapping("about")
    public String about()
    {
        return "about";

    }

    @RequestMapping("blog")
    public String blog()
    {
        return "blog";

    }

    @RequestMapping("class")
    public String classes()
    {
        return "class";

    }
}
