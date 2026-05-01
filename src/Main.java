// this is a cmd line bro , why are you looking here

/*
    in this script , datatypes will be practiced
 */

/// documentation comments
/// @author kuttypuli
/// @version 0.0.1

import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

import learn.PcBuild;

public class Main {
    public static void main(String[] args){
        PcBuild pc = new PcBuild.Builder()
                .setName("SURYA")
                .setAge((byte) 20)
                .build();
        pc.display();
        return;
    }
};