package home.amit.rethinkdb.stream.rethink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StreamRethinkChangeListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamRethinkChangeListenerApplication.class, args);

	}

}
