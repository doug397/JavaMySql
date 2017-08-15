package test;

import java.sql.SQLException;

import br.com.database.BD;
import br.com.database.UsuarioDAO;
import br.com.dominio.Usuario;

public class Execute {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		BD bd= new BD();
		
		if(bd.getConnection()!=null){
			System.out.println("Conectado");
		}
		
		Usuario user= new Usuario();	
		user.setNome("Lariss");
		user.setEmail("laretipo.vasco@hotmail.com");
		user.setSenha("larissa");
		
		UsuarioDAO userDAo= new UsuarioDAO();
		userDAo.insertUser(user);
		
		System.out.println("Finalinado com Sucesso");
		
	}

}
