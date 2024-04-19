package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp1 {
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private User user;
}
