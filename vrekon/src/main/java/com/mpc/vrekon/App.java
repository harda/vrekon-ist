package com.mpc.vrekon;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mpc.vrekon.domain.Shclog;
import com.mpc.vrekon.mapper.ShclogMapper;

public class App {
    public static void main(String[] args) {
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	String date = dateFormat.format(new Date());
    	if(args.length >= 1){
    		try {
				dateFormat.parse(args[0]);
				date = args[0];
			} catch (ParseException e) {
				System.err.print("error date format!!");
				e.printStackTrace();
				return;
			}
    	}
    	
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
        
        try (SqlSession session = sqlSessionFactory.openSession()){
       
            
            ShclogMapper shclogMapper = session.getMapper(ShclogMapper.class);
            
            FileOutputStream outputStream = new FileOutputStream("istfile"+date+".txt");
            
            for(Shclog shclog : shclogMapper.get210ByDate(date)){
            	System.out.println(shclog.getData());
            	outputStream.write((shclog.getData()+"\n").getBytes());
            }
            
            outputStream.close();
        	
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
//        session.close();
    }
}
