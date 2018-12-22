package com.alzo;

import com.alzo.cdi.boundary.CDIResource;
import com.alzo.ejb.boundary.EJBResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author alzo.com
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final HashSet<Class<?>> classes = new HashSet<>();
        classes.add(CDIResource.class);
        classes.add(EJBResource.class);
        return classes;
    }
}
