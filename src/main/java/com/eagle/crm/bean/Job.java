package com.eagle.crm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Job {
    private int id;
    private String name;
    private String desc;
    private String power;
    private String time;
    private int state;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", power='" + power + '\'' +
                ", time='" + time + '\'' +
                ", state=" + state +
                '}';
    }
}
