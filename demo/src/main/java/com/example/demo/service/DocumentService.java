package com.example.demo.service;

import com.example.demo.bean.Document;

import java.util.List;

public interface DocumentService {

    List<Document> getAll(Integer DocID);
    Document getDocById(Integer DocID);
    void delete(Integer DocID);
    void update(Document document);
    void newDoc(Document document);
}
