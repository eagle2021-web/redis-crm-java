package com.atguigu.admin;


import com.eagle.crm.bean.User3;
import com.eagle.crm.service.impl.UserServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("嵌套测试")
public class TestingAStackDemo {

    Stack<Object> stack;



    @ParameterizedTest
    @DisplayName("参数化测试")
    @ValueSource(ints = {1,2,3,4,5})
    void testParameterized(int i){
        System.out.println(i);
    }


    @ParameterizedTest
    @DisplayName("参数化测试")
    @MethodSource("stringProvider")
    void testParameterized2(String i){
        System.out.println(i);
    }


    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana","atguigu");
    }

    @Test
    @DisplayName("new Stack()")
    void isInstantiatedWithNew() {
        new Stack<>();
        //嵌套测试情况下，外层的Test不能驱动内层的Before(After)Each/All之类的方法提前/之后运行
        assertNull(stack);

    }

    @Nested
    @DisplayName("when new")
    class WhenNew {

        @BeforeEach
        void createNewStack() {
            stack = new Stack<>();
        }

        @Test
        @DisplayName("is empty")
        void isEmpty() {
            assertTrue(stack.isEmpty());
        }

        @Test
        @DisplayName("throws EmptyStackException when popped")
        void throwsExceptionWhenPopped() {
            assertThrows(EmptyStackException.class, stack::pop);
        }

        @Test
        @DisplayName("throws EmptyStackException when peeked")
        void throwsExceptionWhenPeeked() {
            assertThrows(EmptyStackException.class, stack::peek);
        }

        @Nested
        @DisplayName("after pushing an element")
        class AfterPushing {

            String anElement = "an element";

            @BeforeEach
            void pushAnElement() {
                stack.push(anElement);
            }

            /**
             * 内层的Test可以驱动外层的Before(After)Each/All之类的方法提前/之后运行
             */
            @Test
            @DisplayName("it is no longer empty")
            void isNotEmpty() {
                assertFalse(stack.isEmpty());
            }

            @Test
            @DisplayName("returns the element when popped and is empty")
            void returnElementWhenPopped() {
                assertEquals(anElement, stack.pop());
                assertTrue(stack.isEmpty());
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            void returnElementWhenPeeked() {
                assertEquals(anElement, stack.peek());
                assertFalse(stack.isEmpty());
            }
        }
    }

    @Controller
    public static class TableController {


        @Autowired
        UserServiceImpl userServiceImpl;

        /**
         *
         * @param a  不带请求参数或者参数类型不对  400；Bad Request  一般都是浏览器的参数没有传递正确
         * @return
         */
        @GetMapping("/basic_table")
        public String basic_table(@RequestParam("a") int a){

            int i = 10/0;
            return "table/basic_table";
        }

        @GetMapping("/user/delete/{id}")
        public String deleteUser(@PathVariable("id") Long id,
                                 @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                 RedirectAttributes ra){

            userServiceImpl.removeById(id);

            ra.addAttribute("pn",pn);
            return "redirect:/dynamic_table";
        }


        @GetMapping("/dynamic_table")
        public String dynamic_table(@RequestParam(value="pn",defaultValue = "1") Integer pn, Model model){
            //表格内容的遍历
    //        response.sendError
    //     List<User> users = Arrays.asList(new User("zhangsan", "123456"),
    //                new User("lisi", "123444"),
    //                new User("haha", "aaaaa"),
    //                new User("hehe ", "aaddd"));
    //        model.addAttribute("users",users);
    //
    //        if(users.size()>3){
    //            throw new UserTooManyException();
    //        }
            //从数据库中查出user表中的用户进行展示

            //构造分页参数
            Page<User3> page = new Page<>(pn, 2);
            //调用page进行分页
            Page<User3> userPage = userServiceImpl.page(page, null);


    //        userPage.getRecords()
    //        userPage.getCurrent()
    //        userPage.getPages()


            model.addAttribute("users",userPage);

            return "table/dynamic_table";
        }


        @GetMapping("/responsive_table")
        public String responsive_table(){
            return "table/responsive_table";
        }

        @GetMapping("/editable_table")
        public String editable_table(){
            return "table/editable_table";
        }
        @GetMapping(value = "user/all")
        @ResponseBody
        public List<User3> user3List(){
            List<User3> list = userServiceImpl.list();
            return list;
        }
    }
}
