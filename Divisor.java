
import java.util.InputMismatchException;
import java.util.Scanner; 
public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		try {
			System.out.println("Digite o numerador: ");
			int num1 = scan.nextInt();
			System.out.println("Digite o denominador: ");
			int num2 = scan.nextInt();
			Double res = (double) num1/num2;
			if(res.isInfinite()){
				throw new ArithmeticException("Infinity");
			}
			System.out.println("Resultado: " + res );
		}	catch (ArithmeticException e){
			System.out.println("Impossivel dividir por zero");
		}	catch(InputMismatchException e){
			System.out.println("Tipo de Dados invalido!");
		}	finally{
			scan.close();}
	}
	
}
	