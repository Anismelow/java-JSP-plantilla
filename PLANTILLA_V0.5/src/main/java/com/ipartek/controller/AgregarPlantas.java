package com.ipartek.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Plantas;


@WebServlet("/AgregarPlantas")
public class AgregarPlantas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre ="";
		if (request.getParameter("nombre") != null) {
			nombre = request.getParameter("nombre");
		};
		
		String estacion ="";
		if (request.getParameter("estacion")!= null) {
            estacion = request.getParameter("estacion");
        };
        
		int separacion = 0;
		if (request.getParameter("separacion")!= null) {
            separacion = Integer.parseInt(request.getParameter("separacion"));
        };
        
        
        
        Plantas planta = new Plantas();
        
        planta.setNombre(nombre);
        planta.setEstacion(estacion);
        planta.setSeparacion(separacion);
        
        System.out.println(planta.toString());
		
		
		
		//3
		DB_Helper db= new DB_Helper();
		Connection con=db.conectar();
		
		
		//5
		
	
		
		//7
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
