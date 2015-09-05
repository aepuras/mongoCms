package com.epuras.mongocms.admin.web;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adriane on 21/08/15.
 */
public class AdminViewModel extends ModelAndView {

    public AdminViewModel(){
        List<MainMenuItem> mainMenuItemList = new ArrayList<MainMenuItem>();
        MainMenuItem item1 = new MainMenuItem();
        item1.setName("UNU");
        item1.setUrl("UNU_URL");
        mainMenuItemList.add(item1);
        MainMenuItem item2 = new MainMenuItem();
        item2.setName("DOI");
        item2.setUrl("DOI_URL");
        mainMenuItemList.add(item2);

        this.addObject("menuItems", mainMenuItemList);
    }
}
