package lexile;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WordsController {

    @GetMapping("/wordlist")
    public String wordsForm(Model model) {
        model.addAttribute("words", new Words());
        return "wordlist";
    }

    @PostMapping("/wordlist")
    public String wordsSubmit(@ModelAttribute Words words) {
        return "complete";
    }

}
