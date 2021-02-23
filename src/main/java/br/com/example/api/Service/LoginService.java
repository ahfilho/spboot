package br.com.example.api.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	
	public boolean valida(String login, String senha) {
		if(login.equals("admin") && senha.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
}
