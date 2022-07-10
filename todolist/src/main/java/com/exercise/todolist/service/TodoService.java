package com.exercise.todolist.service;


import com.exercise.todolist.dao.TodoDao;
import com.exercise.todolist.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //此為業務邏輯層，可以將業務邏輯的程式碼撰寫在這裡
public class TodoService {
    @Autowired //讓Spring自動把屬性需要的對象從Spring容器找出来，並注入给該屬性，在這裡將TodoDao 注入在此
    TodoDao todoDao; // 取得Dao物件

    public Iterable<Todo> getTodos() { //利用todoDao DAO物件繼承CrudRepository介面 ，透過物件操作findAll()方法，取回資料庫ToDo的所有資料
        return todoDao.findAll();
    }

}
