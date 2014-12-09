package com.example.bancodedados;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bancodedados.model.Carro;

public class CarroListAdapter extends BaseAdapter {
	private List<Carro> lista;
	private LayoutInflater inflater;

	public CarroListAdapter(Context context, List<Carro> lista) {
		this.lista = lista;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public int getCount() {
		return lista.size();
	}

	public Object getItem(int position) {
		return lista.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// Recupera o Carro da posi��o atual
		Carro c = lista.get(position);

		/**
		 * At� o arquivo de layout /res/layout/carro_linha_tabela.xml pode ficar na biblioteca
		 */
		View view = inflater.inflate(R.layout.carro_linha_tabela, null);

		// Atualiza o valor do TextView
		TextView nome = (TextView) view.findViewById(R.id.nome);
		nome.setText(c.nome);

		TextView placa = (TextView) view.findViewById(R.id.placa);
		placa.setText(c.placa);

		TextView ano = (TextView) view.findViewById(R.id.ano);
		ano.setText(String.valueOf(c.ano));

		return view;
	}

}
