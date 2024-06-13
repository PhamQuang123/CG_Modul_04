package cg.baitap2.contronller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping(value = "")
    public String showForm() {
        return "index";
    }

    @PostMapping(value = "/translate")
    public String translate(@RequestParam String english, Model model) {
        Map<String, String> dict = new HashMap<>();
        dict.put("math", "môn toán");
        dict.put("physics", "môn lý");
        dict.put("chemistry", "hoá học");
        dict.put("cat", "con mèo");
        dict.put("dog", "con chó");
        dict.put("lion", "sư tử");
        dict.put("red", "màu đỏ");
        dict.put("green", "xanh lá cây");
        dict.put("yellow", "màu vàng");
        String vietnamese = null;
        String errMsg = null;
        if (dict.containsKey(english)) {
            vietnamese = dict.get(english);
            model.addAttribute("vietnamese", vietnamese);
            model.addAttribute("english", english);
        } else {
            errMsg = "tu dien chua cap nhat tu này.";
            model.addAttribute("errMsg", errMsg);
        }
        return "index";
    }
}
