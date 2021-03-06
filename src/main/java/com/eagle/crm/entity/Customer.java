package com.eagle.crm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("zhufeng_customer")
public class Customer {
    private Integer id;

    private String name;

    private Byte sex;

    private String email;

    private String phone;

    private String qq;

    private String weChat;

    private String type;

    private String address;

    private Integer userid;

    private Integer departmentId;

    private Date time;

    private Byte state;

}