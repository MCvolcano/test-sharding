package com.example.demo;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collection;

public class TableShardingAlgorithm implements PreciseShardingAlgorithm<LocalDateTime> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<LocalDateTime> preciseShardingValue) {
        String tb_name = preciseShardingValue.getLogicTableName() + "_";
        //todo 12小时一张表，总共70张
        int l = (int) (preciseShardingValue.getValue().toInstant(ZoneOffset.ofHours(8)).toEpochMilli() / 1000 / 60 / 60 / 12 % 70);
        tb_name = tb_name + l;
        System.out.println("tb_name:" + tb_name);


        for (String each : collection) {
            System.out.println("t_order_:" + each);
            if (each.equals(tb_name)) {
                return each;
            }
        }

        throw new IllegalArgumentException();

    }

}