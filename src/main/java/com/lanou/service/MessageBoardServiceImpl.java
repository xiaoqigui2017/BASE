package com.lanou.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Mes;
import com.lanou.mapper.MessageBoardMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageBoardServiceImpl implements MessageBoardService{

@Resource
private MessageBoardMapper messageBoardMapper;


    public List<Mes> findAllMesBoard() {
        return messageBoardMapper.findAllMessage() ;
    }
//




//    分分页的方法
    public PageInfo<Mes> queryPage(Integer pageNum, Integer pageSize) {

        pageNum=pageNum==null?1:pageNum;
        pageSize=pageSize==null?5:pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Mes> list = messageBoardMapper.findAllMessage();

//        使用PageInfo对查询结果进行包装
        PageInfo<Mes> pageInfo = new PageInfo<Mes>(list);
        return pageInfo;
    }

//    public void insertMessage(Mes message) {
//        messageBoardMapper.insertMessage(message);
//    }
}
