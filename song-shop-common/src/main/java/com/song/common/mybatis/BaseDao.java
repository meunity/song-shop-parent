package com.song.common.mybatis;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;

/**
 * created on 2019/3/7 19:19
 *
 * @author nfboy_liusong@163.com
 * @version 1.0.0
 */
public interface BaseDao {

    /**
     * @InsertProvider 注解作用， 自定义sql语句.
     */
    @InsertProvider(type = BaseProvider.class,method="save")
    public void save(@Param("object")Object object, @Param("table")String table);

}
