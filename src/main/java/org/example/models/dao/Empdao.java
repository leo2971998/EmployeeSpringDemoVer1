package org.example.models.dao;

import org.example.models.pojo.Emp;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class Empdao {
    HibernateTemplate template;

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    public List<Emp> Extract() {
        return template.loadAll(Emp.class); //loadAll is a method of hibernate template to extract the data
    }
}
