public class Main {
    public static void main(String[] args) {
        try{

        }catch(Exception e){

        }catch (ArithmeticException e){

        }
    }

    //Como a superclasse Exception captura as exceções, até mesmo "ArithmeticException", esse código gera erro de compilação. Então, o bloco "catch"
    //nunca vai ser alcançado. Sendo assim, primeiro deveria capturar a subclasse e depois a superclasse.
}