package Team_ParkingLot.pre_project_Todo_app.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {


    @GetMapping("/")
    public String home() {
        return "To-do Application";
    }

}
