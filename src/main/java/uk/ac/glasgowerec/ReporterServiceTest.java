package uk.ac.glasgowerec;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;
import uk.ac.glasgowerec.domain.Reporter;
import uk.ac.glasgowerec.service.ReporterService;

public class ReporterServiceTest {
	
	
	
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:jpa-app-context.xml");
		ctx.refresh();
		
		System.out.println("App context initialized successfully");
		
		ReporterService reporterService = ctx.getBean("reporterService", ReporterService.class);
		
		List<Reporter> reporters = reporterService.findAll();
		
		for (Reporter reporter: reporters) {
			System.out.println(reporter);
		}

	}


}
