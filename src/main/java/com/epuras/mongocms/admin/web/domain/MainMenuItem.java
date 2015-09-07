package com.epuras.mongocms.admin.web.domain;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by adriane on 20/08/15.
 */

@Entity("MainMenuItems")
public class MainMenuItem {
    @Id
    private ObjectId id;
    private String url;
    private String name;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}