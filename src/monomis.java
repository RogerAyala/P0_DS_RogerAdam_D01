package src;
import java.util.Scanner;

/*
Representem un monomi c x^i y^j, i, j ≥ 0, en la forma ijc
Feu un programa que llegeixi un enter n i una llista de n monomis de la forma anterior i escrigui
 el monomi de grau total màxim (fent servir ordre lexicografic invers). Si hi han dos monomis del ma-teix
grau pels quals s'assoleix el maxim el programa imprimirà la suma dels coeficients corresponents.

Entrada:
5
1 2 7
5 4 4,3
4 5 1,2
5 4 9
3 1 2

Sortida:
Monomi maxim: 5 4 1,330000e+01
**/
public class monomis {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entra el nombre de polnomis");
        int enter = scan.nextInt();

        int i, j;
        float c;
        int max_i = 0;
        int max_j = 0;
        float coef = 0;

        for(int x = 0; x < enter; x++){

            System.out.println("Entra i: ");
            i = scan.nextInt();
            System.out.println("Entra j: ");
            j = scan.nextInt();
            System.out.println("Entra coeficient: ");
            c = scan.nextFloat();

            if(i > max_i || (j > max_j && max_j > max_i)){
                max_i = i;
                max_j = j;
                coef = c;
            } else if (max_i == i || max_j == j){
                coef += c;
            }
        }

        System.out.println("Monomi màxim: " + max_i + " " + max_j + " "+ coef);
        System.out.format("Monomi maxim: %d %d %e\n", max_i, max_j, coef);
    }
}