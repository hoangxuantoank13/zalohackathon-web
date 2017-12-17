package com.sk.recommendwebservice.render;


import com.sk.recommendwebservice.common.TemplateManager;
import hapax.TemplateDataDictionary;
import hapax.TemplateDictionary;
import hapax.TemplateLoader;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;

/**
 *
 * @author toanhx
 */
public class LayoutRender {

    protected static Logger _Logger = Logger.getLogger(LayoutRender.class);
    public static final TemplateLoader templateLoader = TemplateManager.getTemplateLoader("resource/production/");

    public static TemplateDataDictionary noParseHapax(String content, TemplateDataDictionary template) {
        template.setVariable(content, "{{" + content + "}}");
        return template;

    }

    public static TemplateDataDictionary showMsgBox(TemplateDataDictionary template, String msg) {
        template.addSection("html-v3/alertMessage").addSection("success").setVariable("message", msg);
        return template;
    }

    public static TemplateDataDictionary addAlertBox(TemplateDataDictionary template, int msg) {
        if (msg == 1) {
            template.addSection("html/alert_message").addSection("success").setVariable("title", "Insert Success");
        } else if (msg == 2) {
            template.addSection("html/alert_message").addSection("success").setVariable("title", "Update Success");
        } else if (msg == 0) {
            template.addSection("html/alert_message").addSection("error").setVariable("title", "Error. Please try again");
        } else if (msg == 3) {
            template.addSection("html/alert_message").addSection("success").setVariable("title", "Delete Sucess");

        } else if (msg == 20) {
            template.addSection("html/alert_message").addSection("success").setVariable("title", "Enable Sucess");
        } else if (msg == 21) {
            template.addSection("html/alert_message").addSection("success").setVariable("title", "Disable Sucess");
        } else if (msg == 30) {
            template.addSection("html/alert_message").addSection("success").setVariable("title", "In process...");
        }
        return template;
    }

    public static TemplateDataDictionary noParseHapaxMultiContent(List<String> contents, TemplateDataDictionary template) {
        for (String content : contents) {
            template.setVariable(content, "{{" + content + "}}");
        }
        return template;
    }

    public static TemplateDataDictionary getBaseLayout(HttpServletRequest req) {
        TemplateDataDictionary template = TemplateDictionary.create();
        TemplateDataDictionary headerSection = template.addSection("html/header");
        return template;
    }

    public static TemplateDataDictionary getTemplate(HttpServletRequest req) {
        TemplateDataDictionary template = TemplateDictionary.create();

        return template;
    }

}
