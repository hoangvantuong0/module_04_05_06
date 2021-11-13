package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("")
    public String getPageIndex(){
        return "home";
    }

    @GetMapping(value = "/calculator")
    public String calculate(@RequestParam String number1, @RequestParam String number2, @RequestParam String cal, Model model){
        if(number1==""|number2==""){
            model.addAttribute("result","please input number!");
            return "home";
        }
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);
        } catch (Exception e){
            model.addAttribute("result","input number");
            return "home";
        }
        Integer result;
        switch (cal){
            case "Addition":
                result = num1+num2;
                break;
            case "Subtraction":
                result = num1-num2;
                break;
            case "Multiplication":
                result = num1*num2;
                break;
            case "Division":
                if (num2 == 0){
                    model.addAttribute("result","Can not divide by 0");
                    return "home";
                } else {
                    result = num1/num2;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + cal);
        }
        model.addAttribute("result",result);
        return "home";
    }

}