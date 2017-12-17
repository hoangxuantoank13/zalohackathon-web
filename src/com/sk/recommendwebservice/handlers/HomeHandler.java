/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 */
package com.sk.recommendwebservice.handlers;

import com.sk.recommendwebservice.model.Mp3Model;
import com.sk.recommendwebservice.render.HomeRender;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 * @Note: Class handler xử lý http request, class handler được thiết kế để cho
 * phép tạo rất nhiều object, mỗi object tương đương với 1 request đầu vào
 * (object tạm thời), phần xử lý (hàm doProcess) chỉ đơn giản gọi lại phần xử lý
 * trong Model tương ứng
 *
 * => Không nên tạo thuộc tính thành viên trong class handler (vì sẽ có rất
 * nhiều object handler được tạo ra), hoặc chỉ tạo các thuộc tính primitive
 * types (boolean, char, short, int, long, float, double), hoặc chỉ tạo thuộc
 * tính static. Nếu cần thì hãy thêm trong class model tương ứng.
 *
 * @author namnq
 */
public class HomeHandler extends BaseHandler {

    private static final Logger _Logger = Logger.getLogger(HomeHandler.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            String html = HomeRender.render(req);
            printHtml(resp, html);
        } catch (IOException ex) {
            _Logger.error(ex.getMessage(), ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String userId = Mp3Model.Instance.getRandomUserId();
            this.printJson(resp, userId);
        } catch (IOException ex) {
            _Logger.error(ex.getMessage(), ex);
        }
    }
}
