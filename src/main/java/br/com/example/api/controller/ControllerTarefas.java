package br.com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.example.api.Service.ModelServices;

@Controller
@RequestMapping("/tarefas")
public class ControllerTarefas {

	@Autowired
	ModelServices loginService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		
		ModelAndView mv = new  ModelAndView();
		mv.addObject("tarefas",loginService.todosObjetos());
		mv.setViewName("listar");
		
		return mv;
	}
}
