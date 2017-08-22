package com.lanou.mapper;

import com.lanou.bean.Mes;

import java.util.List;


public interface MessageBoardMapper {

    List<Mes> findAllMessage();


    void insertMessage(Mes message);
}
