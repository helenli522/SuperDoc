package com.example.demo.mapper;

import com.example.demo.bean.Document;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface DocumentMapper {
    //查所有
    List<Document> getAll();

    //根据DocID查询
    Document getDocById(Integer DocID);

    //删除
    void delete(Integer DocID);

    //增加
    void newDoc(Document document);

    //更新
    void update(Document document);
}
