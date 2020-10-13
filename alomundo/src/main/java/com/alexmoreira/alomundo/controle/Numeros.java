package com.alexmoreira.alomundo.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Numeros {
	
	@RequestMapping("/sorteio")
	public String GeraNumeros(Model modelo)
	{
		int[] numeros = new int[6];
		int i;
		
		for(i=0;i<6;i++) {
			numeros[i] = (int)(Math.random()*60)+1;
		}
		modelo.addAttribute("nros",numeros);
		return "sorteio";
	}
	@RequestMapping("/")
	public String inicio() {
		return "index";
		
	}
	@RequestMapping("/pagina2")
	public String pg2() {
		return "pagina2";
		
	}
	@RequestMapping("/pagina3")
	public String pg3() {
		return "pagina3";
		
	}
}
