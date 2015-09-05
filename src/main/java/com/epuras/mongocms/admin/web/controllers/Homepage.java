package com.epuras.mongocms.admin.web.controllers;

import com.epuras.mongocms.admin.web.AdminViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by adriane on 08/07/15.
 */
@Controller
public class Homepage {

    @RequestMapping(value = { "/admin", "/admin/welcome" }, method = RequestMethod.GET)
    public ModelAndView showHomepage(){
        AdminViewModel model = new AdminViewModel();
        model.setViewName("adminIndex");
        return model;
    }

    //Spring Security see this :
    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }

        model.setViewName("adminLogin");

        return model;
    }
}