package com.itheima.core.pojo; /**
 * @类名:TestTb
 * @描述:TODO
 * @作者:wanglei
 * @日期:19/8/3 下午9:40
 * @版本:1.0
 **/

import java.io.Serializable;
import java.util.Date;

/**
 *@类名:TestTb
 *@描述:TODO
 *@作者:wanglei
 *@日期:19/8/3 下午9:40
 *@版本:1.0
 **/
public class TestTb implements Serializable {


    private static final long serialVersionUID = 7528285139420837059L;

    private Integer id;
    private String name;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "TestTb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
