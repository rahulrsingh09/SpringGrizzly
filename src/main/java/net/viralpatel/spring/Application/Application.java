package net.viralpatel.spring.Application;

/**
 * Created by rizwan on 22/06/17.
 */
public class Application extends BaseSpringWebApplication {

    @Override
    public String applicationName() {
        return "springgradle";
    }

    @Override
    public void configure() {
        this.addInitParameter("com.sun.jersey.api.json.POJOMappingFeature","true");
        this.addInitParameter("com.sun.jersey.config.property.packages","net.viralpatel.spring.controller");
        this.addInitParameter("com.sun.jersey.config.feature.DisableWADL","true");
    }

    public static void main(String args[]) throws Exception{
        Application app = new Application();
        app.start();
    }
}
