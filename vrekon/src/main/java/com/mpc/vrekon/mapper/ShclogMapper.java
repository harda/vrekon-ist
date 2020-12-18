package com.mpc.vrekon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mpc.vrekon.domain.Shclog;

/**
 * Created by hashem on 2/20/17.
 * Using MyBatis Annotations
 */
@Mapper
public interface ShclogMapper {
//    @Select("SELECT ID AS ID, USERNAME AS USERNAME, FIRST_NAME AS FIRSTNAME, LAST_NAME AS LASTNAME FROM TB_USER WHERE ID=#{userId}")
//    User getUserById(@Param("userId") int id);

    @Select("SELECT * FROM ("
    		+ "SELECT PAN, ACQUIRER, ISSUER, TRACE, LOCAL_DATE, TERMID, AMOUNT, LOCAL_TIME, RESPCODE "
    		+ " FROM SHCLOG UNION "
    		+ "SELECT PAN, ACQUIRER, ISSUER, TRACE, LOCAL_DATE, TERMID, AMOUNT, LOCAL_TIME, RESPCODE "
    		+ "FROM SHCLOG_REQ"
    		+ ") WHERE LOCAL_DATE = TO_DATE(#{shcdate},'DD-MM-YYYY')")
    List<Shclog> getAllByDate(@Param("shcdate") String date);
}
