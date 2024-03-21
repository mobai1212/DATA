package com.huyonghua.web;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huyonghua.domain.User;
import com.huyonghua.service.UserService;

/**
 * 用户控制器
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public ModelAndView login(User model, HttpSession session) {
        User user = userService.findUserByName(model.getUsername());

        System.out.println(user.getType());

        if (user == null || !user.getPassword().equals(model.getPassword())) {
            return new ModelAndView("redirect:/login.jsp");
        } else if (user.getType().equals("管理员")){
            session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("welcomeadmin");
            return mav;
        }else {
            session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("welcomeuser");
            return mav;
        }
    }
}