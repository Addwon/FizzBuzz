package weekonechallenge.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")

    public String printNumbers(){

//The first challenge...

        String result="";
/*
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
*/
//With the bonus...

        int count7=0,count17=0,count23=0;
        System.out.println("Enter the ending number: ");
        Scanner scanner = new Scanner(System.in);
        int endingNumber = scanner.nextInt();

        for(int i=1;i<=endingNumber;i++ ){

            if(i%3==0&&i%5==0)
                result+="FizzBuzz"+"\n";

            else if (i%3==0)
                result+="Fizz"+"\n";

            else if(i%5==0)
                result+="Buzz"+"\n";
            else
                result+=Integer.toString(i)+"\n";

            if(i%7==0)
                count7++;
            if(i%17==0)
                count17++;
            if(i%23==0)
                count23++;

        }

        System.out.println(result);
        result+="Number of multiples of 7:"+count7+"\n"+"Number of multiples of 17:"+count17+"\n"+"Number of multiples of 23:"+count23+"\n";
        return result;
    }
}
