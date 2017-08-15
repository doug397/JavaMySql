package br.com.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import br.com.dominio.Usuario;

public class UsuarioDAO implements UsuarioCRUD {
	
	
	
	
	public boolean insertUser(Usuario user) throws ClassNotFoundException, SQLException{
		if(BD.getConnection()== null){
			return false;
		}
		String sql="INSERT INTO usuario(nome,email,senha)values(?,?,?)";
		PreparedStatement ps= (PreparedStatement) BD.getConnection().prepareStatement(sql);
		
	
		ps.setString(1,user.getNome());
		ps.setString(2,user.getEmail());
		ps.setString(3,user.getSenha());
		
		ps.executeUpdate();	
		return true;	
	}

	@Override
	public ArrayList<Usuario> getAllUsuario() throws ClassNotFoundException, SQLException {
		if(BD.getConnection()== null){
			return null;
		}
		ArrayList<Usuario> users = new ArrayList<>();
		
		String sql="SELECT codigo,nome,email,senha FROM usuario";
		PreparedStatement ps= (PreparedStatement) BD.getConnection().prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		
	
		
		return users;
	}

	@Override
	public Usuario getUserId() {
		
		return null;
	}
}
