package com.sk.recommendwebservice.handlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.HandlerWrapper;

/**
 *
 * @author toanhx
 */
public class PermissionHandler extends HandlerWrapper {

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstPath = null;
        String[] token = target.split("/");
        if (token.length > 1) {
            firstPath = token[1];
        }

        if (target.matches("(.*)\\.(css|html|js|png|jpg|gif|jpeg|xtm|woff2|woff|ttf)$")) {
            //super.handle(target, baseRequest, request, response);
            //Dont process at there. Resource will process.
        } else {
            if (target.equals("/find")) {
                super.handle(target, baseRequest, request, response);
            } else {
                response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
                response.sendRedirect("/find");
            }
        }
    }

}
