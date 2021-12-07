package com.example.QuickCon20;

import com.example.QuickCon20.dao.BankAccountDAO;
import com.example.QuickCon20.entity.BankAccount;
import com.example.QuickCon20.exeption.BankTransactionException;
import com.example.QuickCon20.model.BankAccountInfo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
//dd
@SpringBootApplication
@EnableAutoConfiguration(exclude = { //
        DataSourceAutoConfiguration.class, //
        DataSourceTransactionManagerAutoConfiguration.class, //
        HibernateJpaAutoConfiguration.class })
public class QuickCon2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BankAccountDAO bankDAO = context.getBean(BankAccountDAO.class);
        List<BankAccountInfo> info = bankDAO.listBankAccountInfo();
        BankAccount rauf = new BankAccount();
        rauf.setBalance(1L);
        rauf.setFullName("Rauf almudibdallah");
        bankDAO.add(rauf);

        BankAccount seva = new BankAccount();
        seva.setBalance(200000L);
        seva.setFullName("Seva God");
        bankDAO.add(seva);
        try{
            bankDAO.addAmount(1l,100);
        }catch (BankTransactionException e){
            System.out.println(e.getMessage());
        }

        try {
            bankDAO.sendMoney(5L, 4L, 1000);
        }catch (BankTransactionException e){
            System.out.println(e.getMessage());
        }


    }



}
