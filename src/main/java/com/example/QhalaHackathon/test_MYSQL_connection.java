package com.example.QhalaHackathon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class test_MYSQL_connection implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            String result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'patients'", String.class);
            System.out.println("Database connection test result: " + result);
        } catch (Exception e) {
            System.err.println("Database connection test failed: " + e.getMessage());
        }
    }
}