package com.itheima.service;

import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");

        ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsServiceImpl");

        Items items = new Items();
        items.setName("华为");
        items.setPic("1.jpg");
        items.setPrice(888f);
        items.setCreatetime(new Date());
        itemsService.save(items);
        List<Items>list = itemsService.findAll();
        for (Items items1 : list) {
            System.out.println(items1);
        }

    }
}
