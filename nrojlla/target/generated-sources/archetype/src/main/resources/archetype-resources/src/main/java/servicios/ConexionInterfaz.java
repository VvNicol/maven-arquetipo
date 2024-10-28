#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package servicios;

import java.sql.Connection;

/**
 * 
 */
public interface ConexionInterfaz {
	
	/**
	 * Conecta con la bd de postgresql
	 * @return Connection
	 * @author ${artifactId} 101024
	 */
	Connection GenerarConexion();

}
