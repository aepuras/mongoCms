package com.epuras.mongocms.admin.web.repository;

import com.epuras.mongocms.admin.web.domain.MainMenuItem;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by adriane on 05/09/15.
 */

@Repository
public class AdminUIDaoImpl implements AdminUIDao {

    public List<MainMenuItem> getMainMenuItems() {
        final Morphia morphia = new Morphia();

        // tell Morphia where to find your classes
        // can be called multiple times with different packages or classes
        morphia.mapPackage("com.epuras.mongocms.admin.web.domain");

        // create the Datastore connecting to the default port on the local host
        final Datastore datastore;

        String textUri = "mongodb://heroku_k5ddfh6h:sc0ulvuin15al4tqbkm9tgq21v@ds055792.mongolab.com:55792/heroku_k5ddfh6h";
        MongoClientURI uri = new MongoClientURI(textUri);
        MongoClient m = new MongoClient(uri);

        datastore = morphia.createDatastore(m, "heroku_k5ddfh6h");
        datastore.ensureIndexes();

        final Query<MainMenuItem> query = datastore.createQuery(MainMenuItem.class);
        final List<MainMenuItem> menuItems = query.asList();

        return menuItems;
    }
}
