package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author jy
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from public.t_user where id=#{param1} and username=#{param2}")
    User findById(int id, String username);
}
