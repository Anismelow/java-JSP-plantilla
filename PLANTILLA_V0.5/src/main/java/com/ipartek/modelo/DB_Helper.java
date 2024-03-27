package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Helper implements IConexion{
	
	public Connection conectar(){
		Connection con=null;
		
		try {
			Class.forName(BD_DRIVER);
			con=DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASS);
			System.out.println("Conexion ok");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR DE SQL EN LA CONEXION");
		}
		return con;
	}
	
	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("Conexion cerrada");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}
	
	
	
	

}
