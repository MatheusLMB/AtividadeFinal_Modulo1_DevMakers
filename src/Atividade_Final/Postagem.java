package Atividade_Final;

import java.util.ArrayList;

public class Postagem {
	
	public String data, hora, conteudo;
	public int idUsuario;
	public ArrayList<Comentario> comentarios = new ArrayList<Comentario>();

	public Postagem(int idUsuario, String data, String hora, String conteudo) {
		this.idUsuario = idUsuario;
		this.data = data;
		this.hora = hora;
		this.conteudo = conteudo;
	}
}
