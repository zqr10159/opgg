package com.example.opgg.controller;

import com.example.opgg.service.impl.championsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class baseController {
    @Autowired
    private championsServiceImpl championsService;
    @RequestMapping("/idname")
    @ResponseBody
    public List<Map<Long, String>> getIdName(){
        List<Map<Long, String>> idName = championsService.searchAllchampion();
        return idName;
    }
}
