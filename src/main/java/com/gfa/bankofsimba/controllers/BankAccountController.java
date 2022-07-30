package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class BankAccountController {

    ArrayList<BankAccount> animals = new ArrayList<BankAccount>();

    @GetMapping("/show")
    public String renderIndex(Model model){
        animals.add(new BankAccount("Simba", 2000,"Lion"));
        animals.add(new BankAccount("Timon", 1500,"Zebra"));
        model.addAttribute("animals", this.animals);

        return "show";
    }
}
