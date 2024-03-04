
public class media {
    public static void main(String[] args) {
        double m1 = (8+9+7) / 3.0;
        double m2 = (4+5+6) / 3.0;

        double somasDasMedidas = m1 + m2; 
        double mediaDasMedidas = (m1 + m2)/ 0.2;

        System.out.print("Medias das numeros 8, 9 e 7 = " + m1); 
        System.out.print("\nMedias das numeros 4, 5 e 6 = " + m2);
        System.out.println("\nSomas das medias = " + somasDasMedidas);
        System.out.println ("Media das medias = " + mediaDasMedidas);
    

    }
}