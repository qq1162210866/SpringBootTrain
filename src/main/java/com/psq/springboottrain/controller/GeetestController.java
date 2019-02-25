package com.psq.springboottrain.controller;

import com.alibaba.fastjson.JSON;
import com.psq.springboottrain.config.GeetestConfig;
import com.psq.springboottrain.sdk.GeetestLib;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * 功能描述: 人机测试
 *
 * @Package: com.psq.springboottrain.controller
 * @ClassName: GeetestController
 * @auther: pengshiquan
 * @CreateDate: 2018/12/26 1:32 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/12/26 1:32 PM
 */
@RestController
@RequestMapping(value = "/gt")
@Api(description = "人机测试相关接口")
public class GeetestController {
    @ResponseBody
    @ApiOperation(value = "人机测试接口", notes = "第一次")
    @RequestMapping(value = "/validate-slide", method = {RequestMethod.GET})
    public void startCaptcha(HttpServletRequest request,
                             HttpServletResponse response) throws IOException {
        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(),
                GeetestConfig.isnewfailback());
        String resStr = "{}";
        String userid = "test";

        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("user_id", userid); //网站用户id
        param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
        param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP

        //进行验证预处理
        int gtServerStatus = gtSdk.preProcess(param);
        //将服务器状态设置到session中
        request.getSession().setAttribute(gtSdk.gtServerStatusSessionKey, gtServerStatus);
        //将userid设置到session中
        request.getSession().setAttribute("userid", userid);

        resStr = gtSdk.getResponseStr();
        PrintWriter out = response.getWriter();
        out.println(resStr);
    }

    @ResponseBody
    @ApiOperation(value = "人机测试接口", notes = "第二次")
    @RequestMapping(value = "/register-slide", method = {RequestMethod.POST})
    public String verifyLogin(HttpServletRequest request,
                              HttpServletResponse response) throws IOException {
        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(),
                GeetestConfig.isnewfailback());
        String challenge = request.getParameter(GeetestLib.fn_geetest_challenge);
        String validate = request.getParameter(GeetestLib.fn_geetest_validate);
        String seccode = request.getParameter(GeetestLib.fn_geetest_seccode);
        //从session中获取gt-server状态
        int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);
        //从session中获取userid
        String userid = (String) request.getSession().getAttribute("userid");
        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("user_id", userid); //网站用户id
        param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
        param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP
        int gtResult = 0;
        if (gt_server_status_code == 1) {
            //gt-server正常，向gt-server进行二次验证
            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
            System.err.println("gt-server正常，验证结果：" + gtResult + "");
        } else {
            // gt-server非正常情况下，进行failback模式验证
            System.err.println("failback:use your own server captcha validate");
            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
            System.err.println("gt-server非正常情况下，验证结果：" + gtResult + "");
        }
        if (gtResult == 1) {
            // 验证成功
            System.err.println("hahah");
            return "index";
        } else {
            // 验证失败
            return "redirect:";
        }
    }

}
