package com.lolicon.test;

import com.lolicon.test.mybatis.Test;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class TestMain {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(
                        TestMain.class.getResourceAsStream("/com/lolicon/test/res/mybatis/config.xml")
                );

        try(SqlSession session = sqlSessionFactory.openSession()){
            Test mapper = session.getMapper(Test.class);
            System.out.println(mapper.test1());
            System.out.println(mapper.test2());
        }
    }
}
