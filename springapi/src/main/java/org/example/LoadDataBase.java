package org.example;

import org.slf4j.LoggerFactory;

import java.beans.BeanProperty;

@Configuration
public class LoadDataBase {
private static final Logger = LoggerFactory.getLogger(LoadDataBase.class);
@Bean
CommandLineRunner initDatabase(EmployeeRepository repository){

    return args-> {
    log.info("Preloading" + repository.save(new Employee("ram","student")));
        log.info("Preloading" + repository.save(new Employee("shyam","serviceman")));

    };
}

}



