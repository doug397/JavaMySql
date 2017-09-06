package test;

import java.sql.SQLException;

import br.com.database.BD;
import br.com.database.UsuarioDAO;
import br.com.dominio.Usuario;

public class Execute {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Usuario user= new Usuario();	
		user.setNome("Pablo Henrrique");
		user.setEmail("pablohenrique@edu.br");
		user.setSenha("henri");
		
		UsuarioDAO userDAo= new UsuarioDAO();
		userDAo.insertUser(user);
		
		System.out.println("Finalinado com Sucesso");
		System.out.println("Tudo Certo");
		
	}

}
