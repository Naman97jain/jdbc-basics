package com.spring.jdbc.notRecommended;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Easy but not recommended.
    	// For recommended way of data insertion in DB see package com.spring.jdbc.dao and com.spring.jdbc.entities.
    	System.out.println("Program is started...");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        String query = "Insert into student (id,name,city) values (?,?,?)";
        int result = template.update(query, 3, "Sagar", "Ambala");
        System.out.println("Number of records inserted = "+ result);
        context.close();
        
    }
}
