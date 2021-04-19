package com.hanselnpetal.config;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.ext.mysql.MySqlConnection;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean("mysqlTestSource")
    public IDatabaseConnection databaseConnection(DataSource dataSource) throws SQLException, DatabaseUnitException {
        return new MySqlConnection(dataSource.getConnection(), "spring_tdd");
    }
}
