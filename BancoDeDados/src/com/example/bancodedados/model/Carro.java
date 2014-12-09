package com.example.bancodedados.model;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

public class Carro {
	
	public static String[] colunas = new String[] { Carros._ID, Carros.NOME,
		Carros.PLACA, Carros.ANO };

public static final String AUTHORITY = "com.example.bancodedados.model.carro";

public long id;
public String nome;
public String placa;
public int ano;

public Carro() {

}

public Carro(String nome, String placa, int ano) {
	super();
	this.nome = nome;
	this.placa = placa;
	this.ano = ano;

}

public Carro(long id, String nome, String placa, int ano) {
	super();
	this.id = id;
	this.nome = nome;
	this.placa = placa;
	this.ano = ano;

}

public static final class Carros implements BaseColumns {
	private Carros() {
	}

	public static final Uri CONTENT_URI = Uri.parse("content://"
			+ AUTHORITY + "/carros");
	public static final String CONTENT_TYPE = "vnd.android.curso.dir/vnd.google.carros";
	public static final String CONTENT_ITEM_TYPE = "vnd.android.curso.item/vnd.google.carros";
	public static final String DEFAULT_SORT_ORDER = "_id_ASC";

	public static final String NOME = "nome";
	public static final String ANO = "ano";
	public static final String PLACA = "placa";

	public static Uri getUriId(long id) {
			Uri uriCarro = ContentUris.withAppendedId(Carros.CONTENT_URI, id);
		return uriCarro;
	}

	@Override
	public String toString() {
		return "Nome: " +  NOME  + ", Placa " + PLACA + ", Ano " + ANO;
	}
}
	


}
