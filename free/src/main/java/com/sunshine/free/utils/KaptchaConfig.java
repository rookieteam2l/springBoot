package com.sunshine.free.utils;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author : Free
 * @Date : Create in 16:02 2019-7-15
 * @Description:
 * @Modified By:
 * @Version: 1.0
 */
@Component
public class KaptchaConfig {

    @Bean
    public DefaultKaptcha getDefaultKaptcha() {
        com.google.code.kaptcha.impl.DefaultKaptcha defaultKaptcha = new com.google.code.kaptcha.impl.DefaultKaptcha();
        Properties properties = new Properties();
        // 图片边框
        properties.setProperty("kaptcha.border", "yes");
        // 边框颜色
        properties.setProperty("kaptcha.border.color", "105,179,90");
        // 字体颜色
        properties.setProperty("kaptcha.textproducer.font.color", "red");
        // 图片宽
        properties.setProperty("kaptcha.image.width", "110");
        // 图片高
        properties.setProperty("kaptcha.image.height", "40");
        // 字体大小
        properties.setProperty("kaptcha.textproducer.font.size", "40");
        // session key
        properties.setProperty("kaptcha.session.key", "code");
        // 验证码长度
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        // 字体
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        // 干扰 颜色，合法值： r,g,b 或者 white,black,blue，默认值black
        properties.setProperty("kaptcha.noise.color","blue");
         // 图片样式：
        //水纹 priv.kerlomz.kaptcha.impl.WaterRipple
        //鱼眼 priv.kerlomz.kaptcha.impl.FishEyeGimpy
        //阴影 priv.kerlomz.kaptcha.impl.ShadowGimpy, 默认值水纹
        properties.setProperty("priv.kaptcha.obscurificator.impl","ShadowGimpy");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }
}
