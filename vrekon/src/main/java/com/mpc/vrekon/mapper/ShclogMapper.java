package com.mpc.vrekon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mpc.vrekon.domain.Shclog;

@Mapper
public interface ShclogMapper {

    List<Shclog> get210ByDate(@Param("shcdate") String date);
}
