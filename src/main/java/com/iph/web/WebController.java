package com.iph.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class WebController {
    @GetMapping("/")
    public String portfolio(Model model) {
            return "portfolio";
    }
}
