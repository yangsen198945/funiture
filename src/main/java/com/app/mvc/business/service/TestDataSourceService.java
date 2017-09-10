package com.app.mvc.business.service;

import com.app.mvc.business.dao.TestDao;
import com.app.mvc.business.domain.Test;
import com.app.mvc.datasource.DataSources;
import com.app.mvc.datasource.RoutingDataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jimin on 16/3/22.
 */
@Service
public class TestDataSourceService {

    @Resource
    private TestDao testDao;

    @RoutingDataSource(DataSources.LOG)
    public void save(String msg) {
        Test test = Test.builder().text(msg).build();
        testDao.save(test);
    }
}
