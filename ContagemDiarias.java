import java.util.Scanner;

public class ContagemDiarias {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String nome;
        int qtDiarias = 0;
        int tipo = 0;

        System.out.println("Qual seu nome:");
        nome = entrada.next();
        System.out.println("Qual o tipo de acomodação (1-Stantard, 2-Luxo, 3-Super Luxo):");
        tipo = entrada.nextInt();
        while (tipo != 1 && tipo != 2 && tipo != 3){
            System.out.println("Opção não existe. Tente novamente:");
            System.out.println("Qual o tipo de acomodação (1-Stantard, 2-Luxo, 3-Super Luxo):");
            tipo = entrada.nextInt();
        }
        System.out.println("Digite a quantidade de diarias?");
        qtDiarias = entrada.nextInt();

        double valorTotal =  calculo(qtDiarias, tipo);
        System.out.println("valor Total:"+ valorTotal);
        pagamento(valorTotal);

    }

    //Criando função

    public static double calculo(int qtDiarias, int tipo){
        double valorTotal = 0;

        switch(tipo){
            case 1:
                valorTotal = 380*qtDiarias;
                break;
            case 2:
                valorTotal = 450*qtDiarias;
                break;
            case 3:
                valorTotal = 560*qtDiarias;
                break;
        }
        return valorTotal;



    }//função

    public static void pagamento(double valorTotal){
        char tipoPag;

        System.out.println("Digite a forma de pagamento (V - à vista, P - parcelado)");
        tipoPag = entrada.next().toUpperCase().charAt(0);
        while (tipoPag != 'V' && tipoPag != 'P'){
            System.out.println("Letra incorreta, digite novamente:");
            System.out.println("Digite a forma de pagamento (V - à vista, P - parcelado)");
            tipoPag = entrada.next().toUpperCase().charAt(0);
        }
if (tipoPag == ('V')){
System.out.println("Valor total:" + (valorTotal*0.9));
} else{
    System.out.println("Valor total:" + valorTotal);
}


    }
}

