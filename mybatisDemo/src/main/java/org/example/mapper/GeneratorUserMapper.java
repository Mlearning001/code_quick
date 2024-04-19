package org.example.mapper;

import java.util.List;
import org.example.bean.GeneratorUser;

public interface GeneratorUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    int insert(GeneratorUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    GeneratorUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    List<GeneratorUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    int updateByPrimaryKey(GeneratorUser record);
}