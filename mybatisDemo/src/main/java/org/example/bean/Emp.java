package org.example.bean;

import lombok.Data;

@Data
public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.eid
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.empName
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    private String empname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.sex
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.email
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.age
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.eid
     *
     * @return the value of t_emp.eid
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.eid
     *
     * @param eid the value for t_emp.eid
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.empName
     *
     * @return the value of t_emp.empName
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.empName
     *
     * @param empname the value for t_emp.empName
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.sex
     *
     * @return the value of t_emp.sex
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.sex
     *
     * @param sex the value for t_emp.sex
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.email
     *
     * @return the value of t_emp.email
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.email
     *
     * @param email the value for t_emp.email
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.age
     *
     * @return the value of t_emp.age
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.age
     *
     * @param age the value for t_emp.age
     *
     * @mbggenerated Sat Apr 13 22:32:54 CST 2024
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}