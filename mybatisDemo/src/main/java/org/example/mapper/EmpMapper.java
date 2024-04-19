package org.example.mapper;

import java.util.List;
import org.example.bean.Emp;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    int deleteByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    Emp selectByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    List<Emp> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    int updateByPrimaryKey(Emp record);
}