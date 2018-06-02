package jp.co.willware.aca.safety;

import jp.co.willware.aca.safety.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SafetyConfirmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SafetyConfirmApplication.class, args);
    }

    @Autowired
    private SchedulerService schedulerService;

    @Scheduled(fixedDelay = 5000)
    public void startService() {
        System.out.println("start " + new Date());
        schedulerService.findOne(1L);
    }
}
