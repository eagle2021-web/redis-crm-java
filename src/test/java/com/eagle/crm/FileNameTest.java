package com.eagle.crm;

import org.junit.Test;

import java.io.File;

public class FileNameTest {
    public static void main(String[] args) {
//        getFileName();
    }
    @Test
    public void getFileName() {
        String path = "C:\\Users\\eagle2020\\Desktop\\图片"; // 路径
        File f = new File(path);//获取路径  F:\测试目录
        if (!f.exists()) {
            System.out.println(path + " not exists");//不存在就输出
            return;
        }

        File fa[] = f.listFiles();//用数组接收  F:\笔记总结\C#, F:\笔记总结\if语句.txt
        for (int i = 0; i < fa.length; i++) {//循环遍历
            File fs = fa[i];//获取数组中的第i个
            if (fs.isDirectory()) {
                System.out.println(fs.getName() + " [目录]");//如果是目录就
                // 输出
                System.out.println(fs.getAbsolutePath());
            } else {
                System.out.println(fs.getName());//否则直接输出
            }
        }
    }
}
