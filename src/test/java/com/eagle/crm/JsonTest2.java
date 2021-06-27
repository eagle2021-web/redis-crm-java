package com.eagle.crm;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.eagle.crm.entity.Customer;
import com.eagle.crm.service.impl.CustomerServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest

public class JsonTest2 {
    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @DisplayName("写入customer")
    @Test
    void write_customer() {
        String path = JsonTest.class.getClassLoader().getResource("json/customer.json").getPath();
        String s = JsonTest.readJsonFile(path);
        JSONArray parse = JSONArray.parseArray(s);
        for (Object o : parse) {
            JSONObject map = (JSONObject) o;
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            Customer customer = new Customer() {{
                setQq(map.get("QQ") + "");
                setAddress(map.get("address") + "");
                setSex(Byte.parseByte(map.get("sex") + ""));
                setDepartmentId(Integer.parseInt(map.get("departmentId") + ""));
                setType(map.get("type").toString());
                setUserid(map.getInteger("userId"));
                setWeChat(map.getString("weixin"));
                setPhone(map.getString("phone"));
                setName(map.getString("name"));
                setId(map.getInteger("id"));
//                setTime(new Date());
                setState(map.getByte("state"));
                setEmail(map.getString("email"));
            }};
           customerServiceImpl.save(customer);
        }
    }

}
