package pe.com.spring.console.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import pe.com.spring.console.model.InputParameter;
import pe.com.spring.console.service.IConsoleService;

@Controller
public class ConsoleController implements CommandLineRunner {
	
	@Autowired
	IConsoleService consoleService;

	@Override
	public void run(String... args) throws Exception {
		InputParameter inputParameter = new InputParameter();
		inputParameter.setValor1(args[0]);
		inputParameter.setValor2(args[1]);
		inputParameter.setValor3(args[2]);
		
		consoleService.process(inputParameter);
	}

}
