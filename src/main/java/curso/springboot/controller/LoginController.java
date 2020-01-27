package curso.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import curso.springboot.model.Pessoa;
import curso.springboot.model.Role;
import curso.springboot.model.Usuario;
import curso.springboot.repository.RoleRepository;
import curso.springboot.repository.UsuarioRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	

	
	@RequestMapping(method = RequestMethod.POST, value = "salvaNovoLogin")
	public String salvaNovoLogin( Usuario usuario, BindingResult bindingResult) {
		//todo receber um array de roles
		//Role role = roleRepository.findById(1L).get();
		
		//List<Role> listRole = new ArrayList<Role>();
		
		//listRole.add(usuario.getRoles());
		//usuario.getRoles()
		//usuario.getRoles().addAll(listRole);
		
		System.out.println("#################");
		System.out.println("#################");
		System.out.println("#################");
		System.out.println("#################");
		System.out.println("#################");
		System.out.println("#################");
			
		System.out.println(usuario.getRoles());
		

		
		usuarioRepository.save(usuario);

		return "login";
	}
	
		
	
	@RequestMapping(value = "/cadastrologin")
	public String inicioNovoLogin(Usuario usuario, BindingResult bindingResult) {
		System.out.println("cadastro login");
		
		return "cadastro/cadastrologin";
	}
	
	

}
