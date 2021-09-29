package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {
		 Connection conexao = FabricaConexao.getConexao();
		 
		 String sql = "CREATE IF NOT EXISTS TABLE pessoas ("
				 +"codigo INT AUTO_INCREMENT PRIMARY KEY,"
				 +"nome VARCHAR(80) NOT NULL"
				 +")";
		 
		 Statement stmt = conexao.createStatement();
		 stmt.execute(sql);
		 
		 System.out.println("Tabela criada com sucesso!");
		 conexao.close();
	}
	
}