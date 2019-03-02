package com.fang.service.impl;

import com.fang.pojo.Person;
import com.fang.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public String getPerson(int id) {
        Person person = new Person();
        switch (id) {
            case 1:
                person.setId(1);
                person.setName("小明");
                person.setSex("男");
                break;
            case 2:
                person.setId(2);
                person.setName("小梦");
                person.setSex("女");
                break;
            case 3:
                person.setId(3);
                person.setName("小方");
                person.setSex("男");
                break;
            default:
                person.setId(999);
                person.setName("不是个人吧");
                person.setSex("人妖");
                break;
        }
        return person.toString();
    }
}
