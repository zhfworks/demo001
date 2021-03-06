package com.example.demo001.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo001.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        Emp emp = new Emp();
        emp.setId(1L);
        emp.setName("name");
        //用于测试远程分支合并
        //20200315分支的代码
        return JSONObject.toJSONString(emp);
    }
}
