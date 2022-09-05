public class Calculator {

    public int number;
    public int number2;
    public double number3;
    public double number4;

    public Calculator(int number, int number2, double number3, double number4){
        this.number = number;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }

    public int add(){
        return number + number2;
    }

    public int subtract(){
        return number - number2;
    }

    public int multiply(){
        return number * number2;
    }

    public double divide(){
        return number3 / number4;
    }

}
