/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Project3;

import com.leapfrog.Project3.dao.EmployeeDAO;
import com.leapfrog.Project3.dao.impl.EmployeeDAOImpl;
import com.leapfrog.Project3.entity.Employee;
import com.leapfrog.Project3.util.DbConnection;
import com.leapfrog.Project3.util.ui.EmployeeUI;
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
        new EmployeeUI().setVisible(true);
    }

}
