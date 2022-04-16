package com.xiecode.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiecode.drug.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author xiewc
 * @since 2022-02-16
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
