package com.mpc.vrekon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpc.vrekon.domain.Shclog;
import com.mpc.vrekon.mapper.ShclogMapper;

/**
 * Created by harda on 19 des 2020.
 */
@Service
@Transactional
public class ShclogService {

    @Autowired
    private ShclogMapper shclogMapper;

    /**
     * 
     * @param date, format dd-MM-yyyy
     * @return
     */
    public List<Shclog> get210ByDate(String date) {
        return this.shclogMapper.get210ByDate(date);
    }
    
    /**
     * 
     * @param date, format dd-MM-yyyy
     * @return
     */
    public List<Shclog> get420ByDateInShclog(String date) {
        return this.shclogMapper.get420ByDateInShclog(date);
    }
    
    /**
     * 
     * @param date, format dd-MM-yyyy
     * @return
     */
    public List<Shclog> get420ByDateInShclogReq(String date) {
        return this.shclogMapper.get420ByDateInShclogReq(date);
    }

}
