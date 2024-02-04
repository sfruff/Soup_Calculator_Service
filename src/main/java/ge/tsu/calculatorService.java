package ge.tsu;

import javax.jws.WebService;
import javax.validation.constraints.Null;

@WebService(serviceName = "CalculatorService",
        portName = "CalculatorPort",
        targetNamespace = "http://service/calculatorService/",
        endpointInterface = "ge.tsu.ICalculatorService")
public class calculatorService implements ICalculatorService{
    @Override
    public String sum(int num1, int num2) {
        return String.valueOf(num1+num2);
    }

    @Override
    public String sub(int num1, int num2) {
        return String.valueOf(num1-num2);
    }

    @Override
    public String mul(int num1, int num2) {
        return String.valueOf(num1*num2);
    }

    @Override
    public String div(int num1, int num2) {
        String answer = "Null";
        if(num2 != 0)
            answer = String.valueOf(num1/num2);

        return answer;
    }

}
