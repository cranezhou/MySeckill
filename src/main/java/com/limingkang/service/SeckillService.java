package com.limingkang.service;

import com.limingkang.dto.Exposer;
import com.limingkang.dto.SeckillExecution;
import com.limingkang.entity.Seckill;
import com.limingkang.exception.RepeatKillException;
import com.limingkang.exception.SeckillCloseException;
import com.limingkang.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：站在“使用者”角度设计接口
 * 三个方面：方法定义粒度，参数，返回值
 */
public interface SeckillService {

    /**
     * 查询所有秒杀商品
     * @return
     */
    List<Seckill> getSeckill();

    /**
     * 查询单个秒杀商品
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 用户执行秒杀时，需要校验
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillCloseException,RepeatKillException,SeckillException;
}
