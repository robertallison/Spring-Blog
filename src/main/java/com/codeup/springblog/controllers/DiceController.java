package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {

    public double doublerandomNumber = Math.random()*6;
    int randomNumber = (int)doublerandomNumber;

    @GetMapping("/roll-dice")
    public String Number() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/1")
    public String Number1() {
        return "roll-dice/1";
    }

    @GetMapping("/roll-dice/2")
    public String Number2() {
        return "roll-dice/2";
    }

    @GetMapping("/roll-dice/3")
    public String Number3() {
        return "roll-dice/3";
    }

    @GetMapping("/roll-dice/4")
    public String Number4() {
        return "roll-dice/4";
    }

    @GetMapping("/roll-dice/5")
    public String Number5() {
        return "roll-dice/5";
    }

    @GetMapping("/roll-dice/6")
    public String Number6() {
        return "roll-dice/6";
    }

}
