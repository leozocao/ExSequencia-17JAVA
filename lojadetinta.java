import java.util.Scanner;

public class lojadetinta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    double area, litros, numSoLatas, numSoGaloes, precoSoLata, precoSoGalao;
    double folga, litroscomfolga;
    double numLatas, resto, galoesmisturados;

    System.out.print("Digite a área a ser pintada em metros quadrados: ");
    area = teclado.nextDouble();

    litros = area / 6;

    folga = (10 / 100.0f) * litros;
    litroscomfolga = litros + folga;
    
    numSoLatas = litroscomfolga / 18;
    numSoLatas = Math.ceil(numSoLatas);
    numSoGaloes = litroscomfolga / 3.6;
    numSoGaloes = Math.ceil(numSoGaloes);

    precoSoLata = numSoLatas * 80;
    precoSoGalao = numSoGaloes * 25;

    System.out.printf("Situação 1 (Apenas Latas): deve ser comprado %.0f latas de 18L pelo valor de R$%.2f \n", numSoLatas, precoSoLata);
    System.out.printf("Situação 2 (Apenas Galões): deve ser comprado %.0f galões de 3,6L pelo valor de R$%.2f \n", numSoGaloes, precoSoGalao);

    numLatas = litroscomfolga / 18;

    resto = litroscomfolga % 18;
    galoesmisturados = resto / 3.6;
    galoesmisturados = Math.ceil(galoesmisturados);

    if (numLatas < 1){
        System.out.printf("Situação 3 (Latas e Galões): deve ser comprado, para economizar, 0 Latas e %.0f Galões", galoesmisturados);
    } else {
        System.out.printf("Situação 3 - Latas e Galões: deve ser comprado, para economizar, %.0f Latas de 18L e %.0f Galões de 3,6L", numLatas, galoesmisturados);
    }


    teclado.close();

    }
}