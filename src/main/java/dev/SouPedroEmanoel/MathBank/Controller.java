package dev.SouPedroEmanoel.MathBank;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping
public class Controller {

    @GetMapping("/page")
    public String HelloWorld() {
        return "hello world";
    }
}
