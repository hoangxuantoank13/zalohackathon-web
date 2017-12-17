/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 */
package com.sk.recommendwebservice.servers;

import com.sk.core.jettyserver.SKWebServers;
import com.sk.recommendwebservice.handlers.HomeHandler;
import com.sk.recommendwebservice.handlers.PermissionHandler;
import com.sk.recommendwebservice.model.Mp3Model;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.util.resource.Resource;

/**
 *
 * @author namnq
 */
public class HServers {

    public boolean setupAndStart() {
        try {
            Mp3Model.Instance.init();
            SKWebServers servers = new SKWebServers("recommendwebservice");
            ContextHandler context = new ContextHandler();
            ResourceHandler rh = new ResourceHandler();
            rh.setBaseResource(Resource.newResource("./resource"));
            context.setHandler(rh);

            PermissionHandler permissionHandle = new PermissionHandler();
            ServletHandler handler = new ServletHandler();
            permissionHandle.setHandler(handler);

            handler.addServletWithMapping(HomeHandler.class, "/find");

            HandlerList handlers = new HandlerList();
            handlers.setHandlers(new Handler[]{permissionHandle, context});

            servers.setup(handlers);
            return servers.start();
        } catch (MalformedURLException ex) {
            Logger.getLogger(HServers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HServers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
