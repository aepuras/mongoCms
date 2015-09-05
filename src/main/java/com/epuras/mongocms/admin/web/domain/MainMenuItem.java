package com.epuras.mongocms.admin.web.domain;

/**
 * Created by adriane on 20/08/15.
 */
public class MainMenuItem {
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
