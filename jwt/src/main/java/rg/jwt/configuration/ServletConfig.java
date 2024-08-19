package rg.jwt.configuration;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

@Configuration
public class ServletConfig implements ServletContextInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		servletContext.addListener(new se.jiderhamn.classloader.leak.prevention.ClassLoaderLeakPreventor());

	}

}
