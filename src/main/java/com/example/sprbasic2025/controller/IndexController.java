package com.example.sprbasic2025.controller;

import org.springframework.stereotype.Controller; // page controller, rest controller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index") // 주소를 나타냄(주소 이름이 같으면 스프링 자체가 실행되지 않음)
    @ResponseBody // 페이지를 리턴해줘야 하는데, JSON 형태로 리턴해주기 위한 코드(페이지 이동 안함)
    public String index(){
        return "내가 인덱스라니까";
    }

    @RequestMapping("/abc") // 주소를 나타냄
    @ResponseBody // 페이지를 리턴해줘야 하는데, JSON 형태로 리턴해주기 위한 코드
    public Map<String, Object> abc(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("22100622", "Lm JiHoon");
        return map;
    }

    // 일반 컨트롤러이고, 페이지를 리턴해줄꺼야!!
    @RequestMapping("/page") // 주소를 나타냄
    public String page(){
        return "page";
    }

}
