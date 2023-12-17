package grafioschtrader.test.start;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;

import grafioschtrader.GrafioschtraderApplication;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = { "grafioschtrader" }, excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = GrafioschtraderApplication.class) })
@PropertySource("classpath:application-test.properties")
public class GTforTest {

	@Value("${name}")
	String name;
	
	@Value("${name1}")
	String name1;
	
	public static void main(String[] args) {
		SpringApplication.run(GTforTest.class, args);
	}
	
	@PostConstruct
	void started() {
		System.out.println(this.getClass().getSimpleName() + ":" + name);
		System.out.println(this.getClass().getSimpleName() + ":" + name1);
	}
}
