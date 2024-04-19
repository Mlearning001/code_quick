package org.example.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.example.bean.Emp1;
import org.example.bean.Emp2;
import org.example.bean.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 添加用户信息
     */
    int insertUser1(User user);

    int insertUser();

    User getUserById();

    User getUserByUserName(String name);

    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    User checkLoginByParam(@Param("name") String username, @Param("password") String password);

    List<User> getUserList2();

    @MapKey("id")
    Map<String, Object> getUserToMap();

    List<User> getUserByLike(@Param("name") String name);

    int deleteMore(@Param("ids") String ids);

    List<User> getUserByTable(@Param("tabName") String tabName);

    void insertUser2(User user);

    Emp1 getEmpAndDept(@Param("t_id") Integer eid);

    Emp1 getEmpAndUser(@Param("t_id") Integer eid);

    Emp2 getEmpAndUserList(@Param("t_id") Integer eid);

    List<Emp2> getByCondition(Emp2 emp2);

    int deleteByArray(@Param("ids") Integer[] ids);

    int insertMoreByList(@Param("emps") List<Emp2> emp2List);

    List<Emp2> getEmpByCondition(Emp2 emp);
}
