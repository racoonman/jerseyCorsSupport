package org.racoonman.jcs;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author daniel
 */
public class TestApplication extends ResourceConfig {

    private static final String[] SCAN_PACKAGES = {"org.racoonman.jcs.testResource"};
    
    public TestApplication() {
        super(CorsSupportFilter.class);
        
        packages(SCAN_PACKAGES);
    }
    
}
