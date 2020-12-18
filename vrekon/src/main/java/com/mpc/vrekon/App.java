package com.mpc.vrekon;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mpc.vrekon.domain.Shclog;
import com.mpc.vrekon.mapper.ShclogMapper;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
        
        try (SqlSession session = sqlSessionFactory.openSession()){
       
            
            ShclogMapper shclogMapper = session.getMapper(ShclogMapper.class);
            
            for(Shclog shclog : shclogMapper.get210ByDate("08-09-2020")){
            	System.out.println(shclog.getData());
            }
            
        	
        }
        
//        session.close();
    }
}
