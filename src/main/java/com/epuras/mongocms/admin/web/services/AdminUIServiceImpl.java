package com.epuras.mongocms.admin.web.services;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import com.epuras.mongocms.admin.web.repository.AdminUIDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adriane on 05/09/15.
 */

@Service
public class AdminUIServiceImpl implements AdminUIService {

    @Autowired
    private AdminUIDao adminUIDao;

    public List<MainMenuItem> getMainMenu() {
        return adminUIDao.getMainMenuItems();
    }
}
