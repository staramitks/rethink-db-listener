package home.amit.rethinkdb.stream.rethink.config;
/*
User :- AmitSingh
Date :- 5/28/2024
Time :- 7:26 PM
Year :- 2024
*/

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RethinkDBConfig {

    @Value("${rethinkdb.host}")
    private String host;

    @Value("${rethinkdb.port}")
    private int port;

    @Value("${rethinkdb.dbname}")
    private String dbname;

    @Bean
    public RethinkDB rethinkDB() {
        return RethinkDB.r;
    }

    @Bean(destroyMethod = "close")
    public Connection connection() {
        return rethinkDB().connection().hostname(host).port(port).connect();
    }


    @Bean
    public String dbName() {
        return dbname;
    }
}