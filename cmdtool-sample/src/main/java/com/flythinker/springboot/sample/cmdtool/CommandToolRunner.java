package com.flythinker.springboot.sample.cmdtool;

import com.flythinker.springboot.sample.cmdtool.dao.UserDAO;
import com.flythinker.springboot.sample.cmdtool.jpa.User;
import com.flythinker.springboot.sample.cmdtool.jpa.UserRepository;
import com.flythinker.springboot.sample.cmdtool.mapper.UserMapper;
import com.flythinker.springboot.sample.cmdtool.model.UserVO;
import com.flythinker.springboot.sample.cmdtool.service.DebugService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Component
public class CommandToolRunner  implements CommandLineRunner {

    public static Logger logger = LoggerFactory.getLogger(CommandLineRunner.class);

    @Autowired
    DebugService debugService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    UserDAO userDAO;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public void run(String... args) throws Exception {
        logger.info( "CommandToolRunner.run ... start " );
        try{
            //debugService.printDebugInfo();
            //userDAO.sampleForJdbcTemplate();
            stringRedisTemplate.opsForValue().set("test1","abc");

            User u = new User();
            u.setName("中文aa");
            //u.setName("aa");
            userRepository.save(u);
            Long userCount = userRepository.count();
            logger.info("userRepository.count: {}" , userCount );

            UserVO userVO = userMapper.getUserById(4L);
            logger.info("userMapper.getUserById: {}" , userVO );
        }catch(Exception ex){
            logger.error( "CommandToolRunner.run" , ex );
        }
        logger.info( "CommandToolRunner.run ... complete" );
        System.exit(0);//脚本运行结束，系统退出
    }
}
