package com.example.demo;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;

@Mapper
public interface TestDao {

    @Select("select uuid,tran_date tranDate, amt from preprcmsg where uuid=#{uuid} and tran_date = #{trandate}")
    PreprcDo get(@Param("uuid")String uuid, @Param("trandate") LocalDateTime tranDate);
}
