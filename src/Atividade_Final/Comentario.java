package Atividade_Final;

public class Comentario {
	
	public String data, hora, conteudo;
	public int idUsuario;
	
	public Comentario(int idUsuario, String data, String hora, String conteudo) {
		this.idUsuario = idUsuario;
		this.data = data;
		this.hora = hora;
		this.conteudo = conteudo;
	}
}
