package ge.tsu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service/calculatorService/", name = "Calculator")
public interface ICalculatorService {
    @WebResult(name = "return",targetNamespace = "")
    @RequestWrapper(
            localName = "sum",
            targetNamespace = "http://service/calculatorServiceSum",
            className = "ge.tsu.SumRequest")
    @WebMethod(action = "urn:Sum")
    @ResponseWrapper(
            localName = "answerResponse",
            targetNamespace = "http://service/calculatorServiceSum",
            className = "ge.tsu.SumResponse")
    String sum(@WebParam(name = "num1") int num1, @WebParam(name = "num2")int num2);


    @WebResult(name = "return",targetNamespace = "")
    @RequestWrapper(localName = "sub",
            targetNamespace = "http://service/calculatorServiceSub",
            className = "ge.tsu.SubRequest")
    @WebMethod(action = "urn:sub")
    @ResponseWrapper(localName = "answerResponse",
            targetNamespace = "http://service/calculatorServiceSub",
            className = "ge.tsu.SubResponse")
    String sub(@WebParam(name = "num1") int num1, @WebParam(name = "num2")int num2);


    @WebResult(name = "return",targetNamespace = "")
    @RequestWrapper(localName = "mul",
            targetNamespace = "http://service/calculatorServiceMul",
            className = "ge.tsu.MulRequest")
    @WebMethod(action = "urn:mul")
    @ResponseWrapper(localName = "answerResponse",
            targetNamespace = "http://service/calculatorServiceMul",
            className = "ge.tsu.MulResponse")
    String mul(@WebParam(name = "num1") int num1, @WebParam(name = "num2")int num2);

    @WebResult(name = "return",targetNamespace = "")
    @RequestWrapper(localName = "div",
            targetNamespace = "http://service/calculatorServiceDiv",
            className = "ge.tsu.DivRequest")
    @WebMethod(action = "urn:sub")
    @ResponseWrapper(localName = "answerResponse",
            targetNamespace = "http://service/calculatorServiceDiv",
            className = "ge.tsu.DivResponse")
    String div(@WebParam(name = "num1") int num1, @WebParam(name = "num2")int num2);
}
