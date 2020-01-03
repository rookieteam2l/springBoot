package com.sunshine.free.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.BASE64Encoder;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Free
 * @Date : Create in 16:32 2019-7-15
 * @Description:
 * @Modified By:
 * @Version: 1.0
 */
@Controller
public class KaptchaController {

    /**
     * 1、验证码工具
     */
    @Autowired
    DefaultKaptcha defaultKaptcha;

    /**
     * 2、生成验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @RequestMapping("/defaultKaptcha")
    public @ResponseBody
    Map<String,Object> defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            // 生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("rightCode", createText);
            // 使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }

        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();

        // 生成captcha的token
        // Map<String, Object> map = captchaService.createToken(text);
        Map<String, Object> map = new HashMap<>();
        map.put("img", encoder.encode(jpegOutputStream.toByteArray()));

        return map;
    }

    /**
     * 3、校对验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/imgvrifyControllerDefaultKaptcha")
    public ModelAndView imgvrifyControllerDefaultKaptcha(HttpServletRequest httpServletRequest,
                                                         HttpServletResponse httpServletResponse) {
        ModelAndView andView = new ModelAndView();
        String rightCode = (String) httpServletRequest.getSession().getAttribute("rightCode");
        String tryCode = httpServletRequest.getParameter("tryCode");
        System.out.println("rightCode:"+rightCode+" ———— tryCode:"+tryCode);
        if (!rightCode.equals(tryCode)) {
            andView.addObject("info", "错误的验证码");
            andView.setViewName("index");
        } else {
            andView.addObject("info", "登录成功");
            andView.setViewName("success");
        }
        return andView;
    }
}
