#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package controlador;

import java.sql.Connection;
import java.sql.SQLException;

import servicios.ConexionInterfaz;
import servicios.ConexionPostgresqlImplementacion;

public class Inicio {

	public static void main(String[] args) {
		ConexionInterfaz ci = new ConexionPostgresqlImplementacion();

		try (Connection conexion = ci.GenerarConexion()) {

			if (conexion != null) {
				System.out.println("Conexion exitosa");
			} else {
				System.out.println("No se pudo hacer la conexion");
			}

		} catch (SQLException e) {
			System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
		}
	}

}
