/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coder.controllerServlets;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coder.dao.CurdOperationsImpl;
/**
 *
 * @author CODER ACJHP
 */
@WebServlet(name = "NewUser", urlPatterns = {"/NewUser"})
public class NewUser extends HttpServlet {
    
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final  CurdOperationsImpl operationFactory = new CurdOperationsImpl();
	private static final Logger LOGGER = Logger.getLogger(CurdOperationsImpl.class.getName());

    public static void clear(String name, String lastName, String nickName, String password, String password2, String email) {
        name = "";
        lastName = "";
        nickName = "";
        password = "";
        password2= "";
        email = "";
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

