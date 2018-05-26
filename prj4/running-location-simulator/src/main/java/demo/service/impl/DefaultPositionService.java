package demo.service.impl;

import demo.model.CurrentPosition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import demo.service.PositionService;

@Slf4j

@Service
public class DefaultPositionService implements PositionService {
//    @Autowired
//    private RestTemplate restTemplate;


    //    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPositionService.class);
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${com.lyn.running.location.distribution}")
    private String runningLocationDistribution;

    @Override
    public void processPositionInfo(long id, CurrentPosition currentPosition, boolean sendPositionsToDistributionService) {
        //runningLocationDistribution = "http://localhost:9006";
        //String runningLocationDistribution = "http://running-location-distribution";
        if(sendPositionsToDistributionService){
            log.info(String.format("Thread %d Simulator is calling distribution Rest API", Thread.currentThread().getId()));
            this.restTemplate.postForLocation(runningLocationDistribution + "/api/location", currentPosition);
        }
    }
}
