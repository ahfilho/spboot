package br.com.example.api.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.example.api.model.Model;

@Service
public class ModelServices {
	//uma list para receber os dados
	private static List<Model> md = new ArrayList<Model>();
	//lista estatica pra adicionar direto daqui
	static {    //ID+NOME+DATA+STATUS
		md.add(new Model(1,"estudar spring boot", new Date(),false));
		md.add(new Model(1,"estudar angular", new Date(),true));
		md.add(new Model(1,"estudar api rest", new Date(),false));
		md.add(new Model(1,"estudar html-css-JS", new Date(),true));

	}
	public List<Model> todosObjetos(){
		return md;
	}
	public List<Model> listadetarefas(boolean status) {
		List<Model> listModel = new ArrayList<Model>();
		for (Model model : listModel) {
		if(model.getStatus() == status) {
			listModel.add(model);
		}
		}
		return listModel;
	}
}
