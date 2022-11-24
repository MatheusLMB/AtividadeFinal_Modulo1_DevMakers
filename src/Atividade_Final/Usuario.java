package Atividade_Final;

import java.util.ArrayList;

public class Usuario {
	
	public String nome, login, senha;
	public ArrayList<Integer> seguindo, seguidores;
	
	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.seguindo = new ArrayList<Integer>();
		this.seguidores = new ArrayList<Integer>();
	}
	
	public boolean seguirUsuario(int idUsuario, int idUsuarioSeguido, Usuario usuarioSeguido) {
		for(int i = 0; i < seguindo.size(); i++) {
			if(seguindo.get(i) == idUsuarioSeguido) {
				return false;
			}
		}
		
		seguindo.add(idUsuarioSeguido);
		usuarioSeguido.seguidores.add(idUsuario);
		return true;
	}
	
	public boolean pararSeguirUsuario(int idUsuario, int idUsuarioSeguido, Usuario usuarioSeguido) {
		for(int i = 0; i < seguindo.size(); i++) {
			if(seguindo.get(i) == idUsuarioSeguido) {
				seguindo.remove(i);
			}
		}
		
		for(int i = 0; i < usuarioSeguido.seguidores.size(); i++) {
			if(usuarioSeguido.seguidores.get(i) == idUsuario) {
				usuarioSeguido.seguidores.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
}
