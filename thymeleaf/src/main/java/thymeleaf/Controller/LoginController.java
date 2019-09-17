package thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thymeleaf.Dto.LoginDto;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String executeLogin(@ModelAttribute("loginForm") LoginDto form, Model model) {
        return "/login";
    }
}
