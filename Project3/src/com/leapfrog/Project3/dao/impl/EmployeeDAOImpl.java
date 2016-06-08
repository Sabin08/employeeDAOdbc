/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Project3.dao.impl;

import com.leapfrog.Project3.dao.EmployeeDAO;
import com.leapfrog.Project3.entity.Employee;
import com.leapfrog.Project3.util.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sabin
 */
public class EmployeeDAOImpl implements EmployeeDAO{
     private DbConnection conn = new DbConnection();

    @Override
    public int insert(Employee e) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Employee e) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee searchById(int id) throws ClassNotFoundException, SQLException {
        Employee emp=null;
        String sql = "SELECT * FROM emp_details WHERE id=?";
            Class.forName("com.mysql.jdbc.Driver");
            
            conn.open();
            PreparedStatement stmt= conn.initStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = conn.executeQuery();
            while (rs.next()) {
                emp=new Employee();
                emp.setId(rs.getInt("id"));
                emp.setfName(rs.getString("first_name"));
                emp.setlName(rs.getString("last_name"));
                emp.setEmail(rs.getString("email"));
            }
            conn.close();
            return emp;
    }

    @Override
    public List<Employee> showAll() throws ClassNotFoundException, SQLException {
       List<Employee> empList=new ArrayList<>();
        String sql = "SELECT * FROM emp_details";
            Class.forName("com.mysql.jdbc.Driver");
            
            conn.open();
            PreparedStatement stmt= conn.initStatement(sql);
            
            ResultSet rs = conn.executeQuery();
            while (rs.next()) {
                Employee emp=new Employee();
                emp=new Employee();
                emp.setId(rs.getInt("id"));
                emp.setfName(rs.getString("first_name"));
                emp.setlName(rs.getString("last_name"));
                emp.setEmail(rs.getString("email"));
                empList.add(emp);
            }
            conn.close();
            return empList;
    }
    
}
