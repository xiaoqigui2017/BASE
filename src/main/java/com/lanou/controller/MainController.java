package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Mes;
import com.lanou.service.MessageBoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
public class MainController {
    @Resource
    private MessageBoardService messageBoardService;



    @RequestMapping (value = "/")
    public  String  test(){

        return "index";
    }


//    分页方法
    @RequestMapping (value = "/pagetest")
    @ResponseBody
    public PageInfo<Mes> pagetest(@RequestParam("pagenum")Integer pagenum,
                                  @RequestParam("pagesize")Integer pagesize){
        return messageBoardService.queryPage(pagenum,pagesize);
    }






    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<Mes> getAllMsg() {
        List<Mes> mesList = messageBoardService.findAllMesBoard();
        System.out.println(mesList);
        return mesList;
    }


    @RequestMapping (value = "/test")
    @ResponseBody
    public  String  gittest(){

        return "bbb";
    }














}
