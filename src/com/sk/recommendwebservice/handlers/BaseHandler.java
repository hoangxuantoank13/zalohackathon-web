/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sk.recommendwebservice.handlers;


import com.sk.core.configer.SKConfig;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author toanhx
 */


public class BaseHandler extends HttpServlet {

	protected static Logger _Logger = Logger.getLogger(BaseHandler.class);

	public static final String ORIGIN = "";
	private static final String Category = SKConfig.Instance.getString(BaseHandler.class, "baseHandler", "request_log", "STICKER_TRACKING_TOOL");

	public void printHtml(HttpServletResponse resp, String content) throws IOException {
		resp.setContentType("text/html; charset=UTF-8");
		print(resp, content);
	}

	public void printJson(HttpServletResponse resp, String content) throws IOException {
		resp.addHeader("Content-Type", "text/javascript; charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		resp.addHeader("Access-Control-Allow-Origin", ORIGIN);
		resp.addHeader("Access-Control-Allow-Credentials", "true");
		resp.setContentType("application/json; charset=utf-8");

		PrintWriter out = resp.getWriter();
		out.println(content);
		out.close();

	}

	public void printJsonData(HttpServletResponse resp, String content) throws IOException {
		resp.addHeader("Content-Type", "text/javascript; charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println(content);
		out.close();
	}

	public void print(HttpServletResponse resp, String content) throws IOException {
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(content);
		out.close();
	}
}
