/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Project3;

import com.leapfrog.Project3.dao.EmployeeDAO;
import com.leapfrog.Project3.dao.impl.EmployeeDAOImpl;
import com.leapfrog.Project3.util.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sabin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            EmployeeDAO empdao=new EmployeeDAOImpl();
            empdao.showAll().forEach(c->{
                System.out.println(c.getfName());
            });
            System.out.println(empdao.searchById(1).getfName());
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }

}
