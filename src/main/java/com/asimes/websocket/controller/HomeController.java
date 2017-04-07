package com.asimes.websocket.controller;

import com.asimes.websocket.pojo.CommonResponse;
import com.asimes.websocket.pojo.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Asimes on 2017/3/22.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/success")
    public String index() {
        //输出日志文件
        logger.info("成功输出日志啦");
        //返回一个index.jsp这个视图
        return "success";
    }


    /**
     * 返回json
     *
     * @return Object    返回类型
     * @Title: login
     * @author 梁巍巍
     * @date 2014-10-8 下午3:50:24
     */
    @RequestMapping("/login")
    @ResponseBody
    public Object login() {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(200);
        UserInfo info = new UserInfo();
        info.setAge(23);
        info.setGender(0);
        info.setName("Mogujun");
        info.setBirthDate("2015-09-05");
        info.setPersonalSign("表哥你很棒哦");
        info.setTelephone("15566666666");
        commonResponse.setData(info);
        commonResponse.setMessage("Success");
        logger.info(info.toString());
        return commonResponse;
    }


}
