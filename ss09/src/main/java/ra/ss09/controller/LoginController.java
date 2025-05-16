package ra.ss09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.ss09.model.Customer;
import ra.ss09.repository.CustomerRepository;

@Controller
public class LoginController {
    private final CustomerRepository customerRepository = new CustomerRepository();

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        Customer customer = customerRepository.checkLogin(username, password);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "home";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
