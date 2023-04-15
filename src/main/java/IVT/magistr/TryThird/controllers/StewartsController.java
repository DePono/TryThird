package IVT.magistr.TryThird.controllers;

import IVT.magistr.TryThird.models.Stewart;
import IVT.magistr.TryThird.services.StewartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class StewartsController {
    private final StewartService stewartService;
   @GetMapping("/stewarts")
    public String stewarts(Model model) {
        model.addAttribute("stewarts", stewartService.findAll());
        return "stewarts";
    }

    @PostMapping("/stewarts/create")
    public String create(Stewart stewart) {
        stewartService.save(stewart);
        return "redirect:/stewarts";
    }
    @PostMapping("/stewarts/delete/{id}")
    public String delete(@PathVariable Integer id) {
        stewartService.delete(id);
        return "redirect:/stewarts";
    }
}
