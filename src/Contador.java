import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        
        Scanner scanner = new Scanner(System.in);
        do {
                System.out.print("Digite o primeiro parâmetro: ");
                num1 = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite o segundo parâmetro: ");
                num2 = scanner.nextInt();
                scanner.nextLine();

                try
                {
                    contar(num1, num2);
                }catch(ParametrosInvalidosException e){
                    System.out.println("Erro!!! O primeiro parâmetro não pode ser maior que o segundo.");
                }
    
            }while (num1 > num2);

      scanner.close();  
    }


    public static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if (param1 < param2){
            int resultado = param2 - param1;

            for(int i = 0; i < resultado; i++){
                System.out.println("Imprimindo número " + (i + 1));
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    }
}
