package pe.com.spring.console.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pe.com.spring.console.exception.ProcessException;
import pe.com.spring.console.model.InputParameter;
import pe.com.spring.console.service.IConsoleService;

@Slf4j
@Service
public class ConsoleService implements IConsoleService {

	@Override
	public void process(InputParameter input) throws Exception {
		log.info("Parameters from shell: {}", input.toString());
		
		String filePath = input.getValor1();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
        		log.info("Line value: {}", line);
            }

        } catch (Exception e) {
        	log.error("ERROR: {}", e.getMessage());
        	throw new ProcessException(e.getMessage());
        }
		
	}

}
