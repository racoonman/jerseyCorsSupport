package org.racoonman.jcs;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

/**
 *
 * @author daniel
 */
public class App extends Thread {
    
    private static App INSTANCE;

    public static void main(String[] args) {
        App.INSTANCE = new App();
        
        URI uri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        GrizzlyHttpServerFactory.createHttpServer(uri, new TestApplication());
        
        INSTANCE.start();
    }
    
    @Override
    public void run() {
        try {
            synchronized (this) {
                System.out.println("Waiting...");
                wait();
            }
        } catch (InterruptedException ex) {
            System.out.println("interruptedException:" + ex.getMessage());
        }
    }
    
}
