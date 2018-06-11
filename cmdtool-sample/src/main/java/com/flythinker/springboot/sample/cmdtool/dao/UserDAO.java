package com.flythinker.springboot.sample.cmdtool.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Component
public class UserDAO {

    public static Logger logger = LoggerFactory.getLogger(UserDAO.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void sampleForJdbcTemplate()
    {
        Integer count = jdbcTemplate.queryForObject("select count(*) from user",Integer.class);
        logger.info( "sampleForJdbcTemplate count: {}",count );
    }

}
