package br.com.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import br.com.dominio.Usuario;

public interface UsuarioCRUD {
	
	ArrayList<Usuario> getAllUsuario() throws ClassNotFoundException, SQLException;
	
	Usuario getUserId();

}
