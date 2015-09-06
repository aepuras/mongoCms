package com.epuras.mongocms.admin.web.services;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import com.epuras.mongocms.admin.web.repository.AdminUIDao;
import com.epuras.mongocms.admin.web.repository.AdminUIDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adriane on 05/09/15.
 */

@Service
public class AdminUIServiceImpl implements AdminUIService {

    private AdminUIDao adminUIDao = new AdminUIDaoImpl();

    public List<MainMenuItem> getMainMenu() {
        return adminUIDao.getMainMenuItems();
    }
}
