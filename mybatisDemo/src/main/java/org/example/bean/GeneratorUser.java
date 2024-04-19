package org.example.bean;

import lombok.Data;

@Data
public class GeneratorUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.age
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gender
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gender
     *
     * @return the value of t_user.gender
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gender
     *
     * @param gender the value for t_user.gender
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbggenerated Sat Apr 13 22:35:51 CST 2024
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}