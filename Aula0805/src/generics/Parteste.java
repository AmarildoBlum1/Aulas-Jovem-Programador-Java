package generics;

public class Parteste {
    public static void main(String[] args) {
       
        Par<Integer, String> par1 = new Par<>(1, "Um");
        System.out.println(par1);

        Par<String, Double> par2 = new Par<>("Altura", 1.75);
        System.out.println(par2);
        
        Par<Float, Float> par3 = new Par<>(2.3f, 4.5f);

        par1.setPrimeiro(2);
        par1.setSegundo("Dois");
        System.out.println("Depois da alteração: " + par1);
    }
}
