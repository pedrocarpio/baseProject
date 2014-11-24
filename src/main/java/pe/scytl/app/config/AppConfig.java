package pe.scytl.app.config;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.net.UnknownHostException;

/**
 * Created by robertoespinoza on 20/11/14.
 */
@Configuration
@ComponentScan(basePackages = { "pe.scytl.app.service", "pe.scytl.app.dao" })
public class AppConfig {
/*
    @Value("${app.db.name}")
    private String appDbName;

    @Value("${db.host}")
    private String dbHost;

    @Value("${db.port}")
    private int dbPort;

    @Bean
    public DB db() throws UnknownHostException {
        return mongoClient().getDB(appDbName);
    }

    @Bean
    public MongoClient mongoClient() throws UnknownHostException {
        return new MongoClient(dbHost, dbPort);
    }
*/
}
