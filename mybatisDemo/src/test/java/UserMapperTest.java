import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.bean.Emp;
import org.example.bean.Emp1;
import org.example.bean.Emp2;
import org.example.bean.User;
import org.example.mapper.EmpMapper;
import org.example.mapper.UserMapper;
import org.example.util.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.ibatis.io.Resources.*;


public class UserMapperTest {
    @Test
    public void testInsertUser() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = userMapper.insertUser();
        User userById = userMapper.getUserById();
        System.out.println(userById);
        //提交事务
        //sqlSession.commit();
        System.out.println("result:" + result);
    }

    @Test
    public void checkLoginByMap() throws IOException {
        InputStream is = getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void insertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(4, "Tom", "123456", 12, "男", 1);
        mapper.insertUser1(user);
    }

    @Test
    public void checkLoginByParam() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin", "123456");
        System.out.println(user);
    }


    @Test
    public void getUserList() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList2();
        System.out.println(userList);
    }

    @Test
    public void getUserToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> userToMap = mapper.getUserToMap();
        System.out.println(userToMap);
    }

    @Test
    public void getUserByLike() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> key = mapper.getUserByLike("to");
        System.out.println(key);
    }

    @Test
    public void deleteMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count = mapper.deleteMore("1,2,3,8");
        System.out.println(count);
    }

    @Test
    public void getUserByTable() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserByTable("t_user");
        System.out.println(userList);
    }

    @Test
    public void getUserByTable2() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserByTable("t_user");
        System.out.println(userList);
    }

    @Test
    public void insertUser2() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "ton", "123", 23, "男", 1);
        mapper.insertUser2(user);
        System.out.println(user);
    }

    @Test
    public void getEmpAndDept() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Emp1 emp1AndDept = mapper.getEmpAndDept(4);
        System.out.println(emp1AndDept);
    }

    @Test
    public void getEmpAndUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Emp1 emp1AndDept = mapper.getEmpAndUser(4);
        System.out.println(emp1AndDept);
    }

    @Test
    public void getEmpAndUserList() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Emp2 empAndDept = mapper.getEmpAndUserList(4);
        System.out.println(empAndDept.getUserList());
    }

    /**
     * 通过条件查询数据
     */
    @Test
    public void getEmpByCondition() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Emp2 emp2 = new Emp2();
        emp2.setEid(4);
        emp2.setEmail("f");
        List<Emp2> result = mapper.getByCondition(emp2);
        System.out.println(result);
    }

    @Test
    public void deleteByArray() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer[] ids = new Integer[]{4, 5, 6};
        int count = mapper.deleteByArray(ids);
        System.out.println(count);
    }

    @Test
    public void insertMoreByList() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Emp2> emp2List  = Lists.newArrayList();

        for (int i = 0;i<100;i++){
            Emp2 emp2 = new Emp2();

            emp2.setEmpName("John Doe");
            emp2.setAge(30);
            emp2.setSex("Male");
            emp2.setEmail("john.doe@example.com");
            emp2List.add(emp2);
        }
        Emp2 emp1 = new Emp2();
        Emp2 emp2 = new Emp2();

        emp2.setEmpName("John Doe");
        emp2.setAge(30);
        emp2.setSex("Male");
        emp2.setEmail("john.doe@example.com");

        emp1.setEid(1);
        emp1.setEmpName("John Doe");
        emp1.setAge(30);
        emp1.setSex("Male");
        emp1.setEmail("john.doe@example.com");

        emp2List.add(emp1);
        emp2List.add(emp2);
        int count = mapper.insertMoreByList(emp2List);
        System.out.println(count);
    }

    @Test
    public void testPageHelper() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //访问第一页，每页四条数据
        PageHelper.startPage(2,4);
        List<Emp> emps = mapper.selectAll();
        emps.forEach(System.out::println);
    }

    @Test
    public void testPageHelper2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1, 4);
        List<Emp> emps = mapper.selectAll();
        PageInfo<Emp> page = new PageInfo<>(emps,5);
        System.out.println(page);
    }



}
