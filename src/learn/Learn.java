package learn;

import java.util.Scanner;

public class Learn {

    static void pubuild(){

        PcBuild pc = new PcBuild.Builder()
                .setName("SURYA")
                .setAge((byte) 20)
                .build();

        pc.display();

        Basement bsmt  = new Basement();
        bsmt.allBasics();
    }

    static byte getAge() throws AgeErrors{
        Scanner scan = new Scanner(System.in);

        return scan.nextByte();
    }

    static void tryCatchFinally() {

        byte age = 0;
        try {
            age = -1;
            System.out.print("Enter Your AGE : ");
            age = getAge();
            if (age < 0) {
                throw new AgeErrors("Age will not be negative");
            }
        }
        catch(AgeErrors ae) {
            System.out.print(ae.getMessage());
        }
        catch (Exception e) {
            System.out.print("Error Message : " + e.getMessage());
        }
        finally {
            if (age < 0) {
                System.out.println("INVALID AGE");
            }
            else{
                System.out.println("AGE : " + age);
            }
        }
    }

    public static void main(String[] args){
        tryCatchFinally();
        return;
    }
}
