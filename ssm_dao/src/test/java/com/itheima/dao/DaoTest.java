package com.itheima.dao;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) applicationContext.getBean("itemsDao");

        List<Items> list = itemsDao.findAll();
        for (Items im : list) {
            System.out.println(im);
        }
    }
}
