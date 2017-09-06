package br.com.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import br.com.dominio.Usuario;

public interface UsuarioDAOIF {
	
  public ArrayList<Usuario> getAllUsuario() throws ClassNotFoundException, SQLException;
	
  public	Usuario getUserId(int codigo);
  
  public void atualizar(Usuario usuario);

}
