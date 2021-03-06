package pe.com.spring.console.handler;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class HandlerResponse {
	
	@EventListener
    public void exitConsole(ExitCodeEvent event) {
		if (event.getExitCode() == 1) {
			log.info("Proceso terminado correctamente");
			System.out.println("OK");
		} else {
			log.error("Proceso fallido");
			System.out.println("FAILED");
		}
    }

}
