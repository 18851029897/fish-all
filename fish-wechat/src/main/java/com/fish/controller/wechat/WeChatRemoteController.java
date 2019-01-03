package com.fish.controller.wechat;

import com.fish.common.back.DataResponse;
import com.fish.model.base.BaseChannel;
import com.fish.service.base.IBaseChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by fish on 2018/10/27.
 */
@Controller
@RequestMapping("wechat")
public class WeChatRemoteController {

    @Autowired
    private IBaseChannelService baseChannelService;


    @RequestMapping("channels")
    @ResponseBody
    public DataResponse findChannels() {
        List<BaseChannel> channels = this.baseChannelService.findChannels();
        return new DataResponse(1000, channels);
    }


    public static void main(String agrs[]) throws UnsupportedEncodingException {
        String str = "+1231312==";
        String temp = URLEncoder.encode(str, "utf-8");
        System.out.println(temp);
        System.out.println(URLEncoder.encode(temp, "utf-8"));
        //%2B1231312%3D%3D
    }
}
