/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Project3.dao;

import com.leapfrog.Project3.entity.Employee;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sabin
 */
public interface EmployeeDAO {

    int insert(Employee emp)throws ClassNotFoundException,SQLException;

    int update(Employee emp)throws ClassNotFoundException,SQLException;

    int delete(int id)throws ClassNotFoundException,SQLException;

    Employee searchById(int id)throws ClassNotFoundException,SQLException;

    List<Employee> showAll()throws ClassNotFoundException,SQLException;
    
    boolean isEmailExist(String param)throws ClassNotFoundException,SQLException;
}
