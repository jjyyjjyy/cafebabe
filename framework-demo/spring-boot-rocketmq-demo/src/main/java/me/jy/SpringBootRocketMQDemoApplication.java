package me.jy;

import lombok.extern.slf4j.Slf4j;
import me.jy.domain.UserMessage;
import org.apache.rocketmq.client.apis.producer.SendReceipt;
import org.apache.rocketmq.client.core.RocketMQClientTemplate;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author jy
 */
@Slf4j
@SpringBootApplication
public class SpringBootRocketMQDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRocketMQDemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(RocketMQClientTemplate rocketMQClientTemplate) {
        return args -> {
            SendReceipt receipt = rocketMQClientTemplate.syncSendNormalMessage("user-topic", new UserMessage(1L, "greetings"));
            log.info("receipt: {}", receipt);
        };
    }
}
