package com.epuras.mongocms.admin.web;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import com.epuras.mongocms.admin.web.services.AdminUIService;
import com.epuras.mongocms.admin.web.services.AdminUIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by adriane on 21/08/15.
 */
public class AdminViewModel extends ModelAndView {

    private AdminUIService adminUIService = new AdminUIServiceImpl();

    public AdminViewModel(){
        List<MainMenuItem> mainMenuItems = adminUIService.getMainMenu();
        this.addObject("menuItems", mainMenuItems);
    }
}
