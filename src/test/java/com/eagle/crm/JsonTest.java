package com.eagle.crm;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

@Slf4j
public class JsonTest {

    //读取json文件
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    @DisplayName("打印JSON")
    @Test
    void json_check(){
        String path = JsonTest.class.getClassLoader().getResource("json/customer.json").getPath();
        String s = readJsonFile(path);
//        String s = readJsonFile("..\\job.json");
        JSONArray parse = JSONArray.parseArray(s);
        for (Object o : parse) {
            JSONObject map = (JSONObject)o;
            System.out.println(map.size());
            return;
//            System.out.println(o);
        }
    }

}
