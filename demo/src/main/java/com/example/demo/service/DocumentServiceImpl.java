package com.example.demo.service;

import com.example.demo.bean.Document;
import com.example.demo.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService{

    @Autowired
    private DocumentMapper documentMapper;

    @Override
    public List<Document> getAll(Integer DocID) {
        return documentMapper.getAll();
    }

    @Override
    public Document getDocById(Integer DocID) {
        return documentMapper.getDocById(DocID);
    }

    @Override
    public void delete(Integer DocID) {
        documentMapper.delete(DocID);
    }

    @Override
    public void update(Document document) {
        documentMapper.update(document);
    }

    @Override
    public void newDoc(Document document) {
        documentMapper.newDoc(document);
    }
}
