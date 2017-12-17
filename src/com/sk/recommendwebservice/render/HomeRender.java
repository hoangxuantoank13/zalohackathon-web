package com.sk.recommendwebservice.render;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.sk.recommendwebservice.model.Mp3Model;
import com.sk.recommendwebservice.object.LogMp3;
import com.sk.recommendwebservice.object.Mp3Meta;
import com.sk.recommendwebservice.object.UserLogMp3;
import com.sk.yawebservice.util.ArrayUtil;
import com.sk.yawebservice.util.JsonUtils;
import com.sk.yawebservice.util.ServletUtil;
import hapax.Template;
import hapax.TemplateDataDictionary;
import hapax.TemplateDictionary;
import hapax.TemplateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.bson.Document;

/**
 *
 * @author toanhx
 */
public class HomeRender extends LayoutRender {

    public static String render(HttpServletRequest req) {
        String result = null;
        try {

            Template temp = templateLoader.getTemplate("html/home");
            TemplateDataDictionary template = getBaseLayout(req);
            template.addSection("html/footer");

            int userId = ServletUtil.getIntParameter(req, "userId", -1);
            template.setVariable("userId", userId + "");
            if (userId != -1) {
                UserLogMp3 userLog = Mp3Model.Instance.getMp3OfUser(userId + "");
                TemplateDataDictionary mp3SeenSec = template.addSection("MP3_SEEN");
                TemplateDataDictionary tableMp3Seen = mp3SeenSec.addSection("html/table-view");

                tableMp3Seen.setVariable("TABLE_TITLE", "Mp3 Seen");
                tableMp3Seen.setVariable("TABLE_ID", "table-mp3-seen");

                TemplateDataDictionary headerTableMp3een = tableMp3Seen.addSection("HEADER_TABLE");
                headerTableMp3een.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "No.");
                headerTableMp3een.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Id");
                headerTableMp3een.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Name");
                headerTableMp3een.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Artist");
                headerTableMp3een.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Genre");

                TemplateDataDictionary mp3RecommentSec = template.addSection("MP3_RECOMMEND");
                TemplateDataDictionary tableMp3Recommend = mp3RecommentSec.addSection("html/table-view");

                tableMp3Recommend.setVariable("TABLE_TITLE", "Mp3 Recommend");
                tableMp3Recommend.setVariable("TABLE_ID", "table-mp3-recommend");

                TemplateDataDictionary headerTableMp3Recommend = tableMp3Recommend.addSection("HEADER_TABLE");
                headerTableMp3Recommend.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "No.");
                headerTableMp3Recommend.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Id");
                headerTableMp3Recommend.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Name");
                headerTableMp3Recommend.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Artist");
                headerTableMp3Recommend.addSection("COL_HEADER").setVariable("COL_HEADER_VALUE", "Genre");

                if (userLog != null) {
                    //Mp3 Seen
                    List<Mp3Meta> mp3Seens = new ArrayList();
                    Map<String, LogMp3> songListen = userLog.getSongListen();
                    Set<String> setMp3Seen = new HashSet();
                    if (songListen != null) {
                        setMp3Seen = songListen.keySet();
                        if (setMp3Seen != null && !setMp3Seen.isEmpty()) {
                            String[] toArray = setMp3Seen.toArray(new String[setMp3Seen.size()]);
                            List<String[]> splitArray = ArrayUtil.splitArray(toArray, 50);

                            for (String[] array : splitArray) {

                                List<Mp3Meta> mp3Meta = Mp3Model.Instance.getMp3Meta(Arrays.asList(array));
                                mp3Seens.addAll(mp3Meta);
                            }
                        }
                    }

                    int countVideo = 1;

                    for (Mp3Meta mp3Seen : mp3Seens) {
                        TemplateDataDictionary rowTable = tableMp3Seen.addSection("ROW_TABLE");
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", countVideo++ + "");
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Seen.getId() + "");
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Seen.getTitle());
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Seen.getArtists());
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Seen.getGenre());
                    }

                    //Mp3 Recommend
                    List<Mp3Meta> mp3Recommends = new ArrayList();
                    Set<String> setMp3Recommend = new HashSet();
                    Map<String, Double> songRecommend = userLog.getSongRecommend();

                    if (songRecommend != null && !songRecommend.isEmpty()) {
                        setMp3Recommend = songRecommend.keySet();
                    } else {
                        setMp3Recommend = new HashSet(Mp3Model.Instance.getSongRecommend(userId + ""));
                    }

                    
                    if (setMp3Recommend != null && !setMp3Recommend.isEmpty()) {
                        setMp3Recommend.removeAll(setMp3Seen);
                        String[] toArray = setMp3Recommend.toArray(new String[setMp3Recommend.size()]);
                        List<String[]> splitArray = ArrayUtil.splitArray(toArray, 50);

                        for (String[] array : splitArray) {

                            List<Mp3Meta> mp3Meta = Mp3Model.Instance.getMp3Meta(Arrays.asList(array));
                            mp3Recommends.addAll(mp3Meta);
                        }
                    }

                    int countComment = 1;

                    for (Mp3Meta mp3Recommend : mp3Recommends) {
                        TemplateDataDictionary rowTable = tableMp3Recommend.addSection("ROW_TABLE");
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", countComment++ + "");
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Recommend.getId() + "");
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Recommend.getTitle());
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Recommend.getArtists());
                        rowTable.addSection("COL_TABLE").setVariable("COL_TABLE_VALUE", mp3Recommend.getGenre());
                    }
                }
            }

            result = temp.renderToString(template);
        } catch (TemplateException ex) {
            try {
                Template temp = templateLoader.getTemplate("html/page_500");
                TemplateDataDictionary template = TemplateDictionary.create();
                result = temp.renderToString(template);
            } catch (TemplateException ex1) {
                Logger.getLogger(HomeRender.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
