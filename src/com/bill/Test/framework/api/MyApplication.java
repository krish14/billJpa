/**
 * 
 */
/**
 * @author esolve
 *
 */
package com.bill.Test.framework.api;

import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;
 
@ApplicationPath("/")
public class MyApplication extends PackagesResourceConfig {
 
    public MyApplication() {
        super("com.bill.client");
    }
}