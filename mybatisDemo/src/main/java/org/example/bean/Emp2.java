package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp2 {
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private List<User> userList;
}
