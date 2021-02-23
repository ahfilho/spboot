package br.com.example.api.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.example.api.Service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	LoginService ls;

	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView index(@RequestParam String login, @RequestParam String senha) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginok");
		
		if (ls.valida(login, senha)) {
			mv.setViewName("loginok");
			mv.addObject("msg", "Olá!" + login);
		} else {
			mv.setViewName("login");
			
			mv.addObject("msg", "O login " + login + " não foi encontrado.");

		}
		return mv;
	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}

// transforme o metodo GET em um POST
/*
 * PEGA OS DADOS DO FORM E FAZ A VERIFICAÇÃO COM INJEÇÃO DE DEPENDENCIAS DO
 * AUTOWIRED
 * 
 * @RequestMapping(value = "/", method = RequestMethod.POST) public ModelAndView
 * index(@RequestParam String login, @RequestParam String senha) {
 * 
 * ModelAndView mv = new ModelAndView(); mv.setViewName("index"); if
 * (login.equals("admin") && senha.equals("123")) {
 * 
 * 
 * mv.addObject("msg", "Olá!" + login); } else { mv.addObject("msg", "O login "
 * + login + " não foi encontrado.");
 * 
 * } return mv;
 */

/*
 * quando se usa view, deve usar o MVC, model - view - controller
 * 
 * 
 * @RequestMapping("/login") public String login() { return "login"; }
 */
/*
 * @RequestMapping("/login") public ModelAndView login() {
 * 
 * LocalDateTime now = LocalDateTime.now(); DateTimeFormatter formatter =
 * DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
 * 
 * 
 * DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now()
 * ); String data = formatter.format(now);
 * 
 * ModelAndView mv = new ModelAndView(); mv.addObject("nome", "DINHO");
 * mv.addObject("data",data); mv.setViewName("login"); return mv; }
 */
