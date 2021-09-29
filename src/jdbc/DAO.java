package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * 
 * @author AlisonAvelino
 *
 */

public class DAO {

	private Connection conexao;
	
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexão().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
	
	public void close () {
		try {
			getConexão().close();
		} catch (SQLException e) {
			
		} finally {
			conexao = null; 
		}
	}
	
	private void adicionarAtributos(PreparedStatement stmt, 
			Object[] atributos) throws SQLException {
		
		int indice = 1;
		for(Object atributo: atributos) {
			if(atributo instanceof String) {
				stmt.setString(indice, (String)atributo);	
			} else if(atributo instanceof String) {
				stmt.setInt(indice, (Integer)atributo);	
			}
			indice++;
		}
		
	}
	
	private Connection getConexão() {
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch(SQLException e) {
			
		}
		
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
