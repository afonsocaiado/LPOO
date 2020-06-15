public class Application {
    public static void main(String[] args) {
        Zebra[] zebras = new Zebra[10];

        zebras[0] = new Zebra();
        
        System.out.println(zebras.length + "\n");

        for (Zebra z : zebras)
            System.out.println(z);
    }
}
