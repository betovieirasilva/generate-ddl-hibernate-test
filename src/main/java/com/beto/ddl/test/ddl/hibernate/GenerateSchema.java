package com.beto.ddl.test.ddl.hibernate;

import com.beto.ddl.test.model.Estado;
import com.beto.ddl.test.model.Municipio;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;

public class GenerateSchema {
    
    private Configuration hibernateConfiguration;
    private final Dialect DIALECT_MYSQL = new org.hibernate.dialect.MySQLDialect();

    public static void main(String args[]) {
        new GenerateSchema().generate();
    }

    public void generate() {
        Configuration conf = createHibernateConfig();
        
        System.out.println("--------");
        String scripts[] = conf.generateSchemaCreationScript(DIALECT_MYSQL);
        for(String script : scripts) {
            System.out.println(script);
        }
        System.out.println("--------");
    }

    private Configuration createHibernateConfig() {
        hibernateConfiguration = new Configuration();
        
        hibernateConfiguration.addAnnotatedClass(Municipio.class);
        hibernateConfiguration.addAnnotatedClass(Estado.class);
        
        return hibernateConfiguration.configure("/META-INF/hibernate.cfg.xml");
    }

}
