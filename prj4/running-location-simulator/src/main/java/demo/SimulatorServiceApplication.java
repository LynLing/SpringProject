package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
public class SimulatorServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(SimulatorServiceApplication.class, args);
    }

    //schedualer implememnts Sping's taskExcutor
    @Bean
    public AsyncTaskExecutor taskExecutor(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(10);
        return scheduler;
    }
}
