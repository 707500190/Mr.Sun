package com.example.mall.tiny.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于生成MBG代码
 */
public class Generator {
    public static void main(String[] args) throws Exception {


        //MBG 执行过程在中的告警信息
        List<String> warnings = new ArrayList<>();
        //当生成的代码重复时，覆盖原代码
                boolean overWrite = true;
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback= new DefaultShellCallback(overWrite);
        //创建mbg
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
        //执行生成代码
        myBatisGenerator.generate(null);

        //输出警告信息
        for (String warning: warnings){

            System.out.print(warning);
        }

    }
}
