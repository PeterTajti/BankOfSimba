package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class BankAccountController {

    ArrayList<BankAccount> animals = new ArrayList<BankAccount>();

    @GetMapping("/show")
    public String renderIndex(Model model){
        animals.add(new BankAccount("Simba", 2000,"Lion", true, true));
        animals.add(new BankAccount("Timon", 1500,"Zebra", false, true));
        animals.add(new BankAccount("Pumbaa", 1500,"Zebra", false, true));
        animals.add(new BankAccount("Zazu", 900,"Bird",false, true));
        animals.add(new BankAccount("Ed", 1190,"Hyena", false, false));

        model.addAttribute("animals", this.animals);

        return "show";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/HTMLception")
    public String HTMLception(){
        return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    }
}
