package com.sk.yawebservice.util;

import com.sk.recommendwebservice.common.Constant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import org.apache.commons.lang.math.NumberUtils;

public class ServletUtil {

    public static double getDoubleParameter(HttpServletRequest request, String paramName) {
        return getDoubleParameter(request, paramName, 0);
    }

    public static double getDoubleParameter(HttpServletRequest request, String paramName, int defaultValue) {
        if (request.getParameter(paramName) == null) {
            return defaultValue;
        }
        String paramString = request.getParameter(paramName);
        double paramValue = NumberUtils.toDouble(paramString, defaultValue);
        return paramValue;
    }

    public static int getIntParameter(HttpServletRequest request, String paramName) {
        return getIntParameter(request, paramName, 0);
    }

    public static int getIntParameter(HttpServletRequest request, String paramName, int defaultValue) {
        if (request.getParameter(paramName) == null) {
            return defaultValue;
        }

        String paramString = request.getParameter(paramName);
        int paramValue = NumberUtils.toInt(paramString);

        return (paramValue);
    }

    public static long getLongParameter(HttpServletRequest request, String paramName) {
        return getIntParameter(request, paramName, 0);
    }

    public static long getLongParameter(HttpServletRequest request, String paramName, long defaultValue) {
        if (request.getParameter(paramName) == null) {
            return defaultValue;
        }

        String paramString = request.getParameter(paramName);
        long paramValue = NumberUtils.toLong(paramString);

        return paramValue;
    }

    public static List<Integer> getListIntParameter(HttpServletRequest request, String paramName) {
        String separate = ",";
        return getListIntParameter(request, paramName, separate);
    }

    public static List<Integer> getListIntParameter(HttpServletRequest request, String paramName, String separate) {
        if (request.getParameter(paramName) == null) {
            return null;
        }
        String paramString = request.getParameter(paramName);
        if (paramString == null || paramString.isEmpty()) {
            return null;
        }
        String[] str_list = paramString.split(separate);
        if (str_list.length == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (String item : str_list) {
            int int_item = NumberUtils.toInt(item);
            list.add(int_item);
        }

        if (list.size() == 0) {
            return null;
        }
        return list;
    }

    public static String getStringParameter(HttpServletRequest request, String paramName) {
        return getStringParameter(request, paramName, "");
    }

    public static String getStringParameter(HttpServletRequest request, String paramName, String defaultValue) {
        if (request.getParameter(paramName) == null) {
            return defaultValue;
        }
        String paramString = StringUtils.strip_tags(request.getParameter(paramName).trim(), "");
        return paramString;

    }

    public static String getFullStringParameter(HttpServletRequest request, String paramName) {
        return getStringParameter(request, paramName, "");
    }

    public static String getFullStringParameter(HttpServletRequest request, String paramName, String defaultValue) {
        if (request.getParameter(paramName) == null) {
            return defaultValue;
        }
        String paramString = request.getParameter(paramName).toString();
        return paramString;

    }

    public static String[] getStringArrayParameter(HttpServletRequest request, String paramName) {
        if (request.getParameter(paramName) == null) {
            return new String[0];
        }
        String[] paramString = request.getParameterValues(paramName);
        return paramString;

    }

 
}
