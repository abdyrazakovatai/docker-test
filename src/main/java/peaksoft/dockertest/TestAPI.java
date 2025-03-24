package peaksoft.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestAPI {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye!";
    }
}
