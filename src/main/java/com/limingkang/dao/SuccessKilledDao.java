package com.limingkang.dao;

import com.limingkang.entity.SuccessKilled;

/**
 * Created by thinkit on 2017/7/20.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据id查询购买明细，并携带秒杀产品对象属性
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
