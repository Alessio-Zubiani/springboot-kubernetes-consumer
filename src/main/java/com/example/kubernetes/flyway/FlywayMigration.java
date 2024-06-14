package com.example.kubernetes.flyway;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FlywayMigration {
	
	@Bean
	public FlywayMigrationStrategy repairAndMigrateStrategy(final DataSource dataSource) {
		
		Flyway.configure()
        		.dataSource(dataSource)
        		.baselineOnMigrate(true)
        		.baselineVersion("0")
        		.outOfOrder(true)
        		.validateOnMigrate(true)
        		.ignoreMigrationPatterns("*:missing")
        		.load();
		
		return flyway -> {
            flyway.migrate();
		};
	}
	
}
