package com.ralap.user.mapper;

import com.ralap.user.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author: ralap
 * @date: created at 2017/10/23 19:56
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User selectUserById(Integer id);
}
