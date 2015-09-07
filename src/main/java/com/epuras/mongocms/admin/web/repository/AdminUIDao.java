package com.epuras.mongocms.admin.web.repository;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by adriane on 05/09/15.
 */
public interface AdminUIDao {
    public List<MainMenuItem> getMainMenuItems();
}
