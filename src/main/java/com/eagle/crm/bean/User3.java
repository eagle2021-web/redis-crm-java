package com.eagle.crm.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("crm_zhufeng.zhufeng_user")
public class User3 {

    /**
     * 所有属性都应该在数据库中
    */
//    @TableField(exist = false)  //当前属性表中不存在
//    private String userName;
//    @TableField(exist = false)
//    private String password;
//    //以下是数据库字段
//    private Long id;
//    private String name;
//    private Integer age;
//    private String email;
private Integer id;

    private String name;

    private String password;

    private Byte sex;

    private String email;

    private String phone;

    private Integer departmentId;

    private Integer jobId;

    private String description;

    private String time;

    private Byte state;

    @Override
    public String toString() {
        return "User3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", departmentId=" + departmentId +
                ", jobId=" + jobId +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", state=" + state +
                '}';
    }
}
