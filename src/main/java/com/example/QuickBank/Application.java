package com.example.QuickBank;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    /*private static final Logger log = LoggerFactory.getLogger(Application.class);
    @Bean
    DataSource dataSource() {
        return new SimpleDriverDataSource() {
            {
                setDriverClass(com.mysql.cj.jdbc.Driver.class);
                setUsername("root");
                setUrl("jdbc:mysql://127.0.0.1:3306/tmfind?serverTimezone=Europe/Moscow");
                setPassword("");
            }
        };
    }

    @Bean
    ServiceImpl bookingService() {
        return new ServiceImpl();
    }


    @Bean
    JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        log.info("Creating tables");
        jdbcTemplate.execute("drop table BOOKINGS");
        jdbcTemplate.execute("create table BOOKINGS("
                + "ID serial, FIRST_NAME varchar(5) NOT NULL)");
        return jdbcTemplate;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        ServiceImpl bookingService = ctx.getBean(ServiceImpl.class);
        bookingService.book("Alice", "Bob", "Carol");


        try {
            bookingService.book("Chris", "Samuel");
        }
        catch (RuntimeException e) {
            log.info("v--- The following exception is expect because 'Samuel' is too big for the DB ---v");
            log.error(e.getMessage());
        }

        for (String person : bookingService.findAllBookings()) {
            log.info("So far, " + person + " is booked.");
        }
        log.info("You shouldn't see Chris or Samuel. Samuel violated DB constraints, and Chris was rolled back in the same TX");

        try {
            bookingService.book("Buddy", null);
        }
        catch (RuntimeException e) {
            log.info("v--- The following exception is expect because null is not valid for the DB ---v");
            log.error(e.getMessage());
        }

        for (String person : bookingService.findAllBookings()) {
            log.info("So far, " + person + " is booked.");
        }
        log.info("You shouldn't see Buddy or null. null violated DB constraints, and Buddy was rolled back in the same TX");

    }*/

}
