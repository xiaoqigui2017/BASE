package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Mes;

import java.util.List;

public interface MessageBoardService {


    List<Mes> findAllMesBoard();
    PageInfo<Mes> queryPage(Integer pageNum,Integer pageSize);



}
