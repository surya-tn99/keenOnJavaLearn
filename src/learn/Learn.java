package learn;

public class Learn {
    public static void main(String[] args){

        PcBuild pc = new PcBuild.Builder()
                .setName("SURYA")
                .setAge((byte) 20)
                .build();

        pc.display();

        Basement bsmt  = new Basement();
        bsmt.allBasics();

        return;
    }
}
