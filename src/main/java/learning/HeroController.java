package learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HeroController {

    @RequestMapping("/api/heroes")
    public List<Hero> getAll() {
        return Arrays.asList(
                new Hero(11, "Mr. Nice"),
                new Hero(12, "Narco"),
                new Hero(13, "Bombasto"),
                new Hero(14, "Celeritas"),
                new Hero(15, "Magneta"),
                new Hero(16, "RubberMan"),
                new Hero(17, "Dynama"),
                new Hero(18, "Dr IQ"),
                new Hero(19, "Magma"),
                new Hero(20, "Tornado"));
    }
}