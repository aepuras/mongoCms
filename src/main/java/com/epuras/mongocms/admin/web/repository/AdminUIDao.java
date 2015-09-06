package com.epuras.mongocms.admin.web.repository;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import java.util.List;

/**
 * Created by adriane on 05/09/15.
 */
public interface AdminUIDao {
    List<MainMenuItem> getMainMenuItems();
}
