package weekonechallenge.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")

    public String printNumbers(){

        String result="";

        for(int i=1;i<=100;i++ ){

            if(i%3==0&&i%5==0)
                result+="FizzBuzz"+"\n";

            else if (i%3==0)
                result+="Fizz"+"\n";

            else if(i%5==0)
                result+="Buzz"+"\n";
            else
            result+=Integer.toString(i)+"\n";

        }
        System.out.println(result);
        return result;
    }
}
