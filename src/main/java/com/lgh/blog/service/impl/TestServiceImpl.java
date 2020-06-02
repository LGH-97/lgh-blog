package com.lgh.blog.service.impl;

import com.lgh.blog.entity.Test;
import com.lgh.blog.mapper.TestMapper;
import com.lgh.blog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test getTestById(Integer id) {
        return testMapper.getTestById(id);
    }
}
