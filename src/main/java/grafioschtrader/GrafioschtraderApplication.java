package grafioschtrader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import grafioschtrader.test.start.GTforTest;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = { "grafioschtrader" }, excludeFilters = {
	    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = GTforTest.class) })
public class GrafioschtraderApplication {

	@Value("${name}")
	String name;
	

	@Value("${name1}")
	String name1;
	
	public static void main(String[] args) {
		SpringApplication.run(GrafioschtraderApplication.class, args);
	}
	
	@PostConstruct
	void started() {
		System.out.println(this.getClass().getSimpleName() + ":" + name);
		System.out.println(this.getClass().getSimpleName() + ":" + name1);
	}
	
}
