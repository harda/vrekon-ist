package com.mpc.vrekon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpc.vrekon.domain.Shclog;
import com.mpc.vrekon.mapper.ShclogMapper;

/**
 * Created by hashem on 2/20/17.
 */
@Service
@Transactional
public class ShclogService {

    @Autowired
    private ShclogMapper shclogMapper;

    public List<Shclog> getAll() {
        return this.shclogMapper.getAllByDate("08-09-2020");
    }

}
