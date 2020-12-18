package com.mpc.vrekon.mapper;

import com.mpc.vrekon.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hashem on 2/20/17.
 * Using MyBatis Annotations
 */
@Mapper
public interface UserMapper {
    @Select("SELECT ID AS ID, USERNAME AS USERNAME, FIRST_NAME AS FIRSTNAME, LAST_NAME AS LASTNAME FROM TB_USER WHERE ID=#{userId}")
    User getUserById(@Param("userId") int id);

    @Select("SELECT ID AS ID, USERNAME AS USERNAME, FIRST_NAME AS FIRSTNAME, LAST_NAME AS LASTNAME FROM TB_USER")
    List<User> getAll();
}
