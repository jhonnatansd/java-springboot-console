package pe.com.spring.console.handler;

import java.io.IOException;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import pe.com.spring.console.exception.ProcessException;

@Slf4j
@Component
public class HandlerCodeException implements ExitCodeExceptionMapper {
	
	@Override
	public int getExitCode(Throwable ex) {
		log.error("============================================================");
        log.error("Se ha producido un error en el proceso de carga");
        log.error("Descripción del error: {}", ex.getMessage());
        log.error("============================================================");
        
		if (ex.getCause() instanceof ProcessException) {
            return -1;
        } else if (ex.getCause() instanceof IOException) {
        	return -2;
        }
        return -3;
	}

}
