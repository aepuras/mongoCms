package com.epuras.mongocms.admin.web.services;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;

import java.util.List;

/**
 * Created by adriane on 05/09/15.
 */
public interface AdminUIService {
    List<MainMenuItem> getMainMenu();
}
