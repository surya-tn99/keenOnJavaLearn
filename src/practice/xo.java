package practice;

import java.util.Scanner;

class xoInvalidPlaceExecption extends Exception {
    xoInvalidPlaceExecption(String msg){
        super(msg);
    }
}


class player{

    char playerSymbol ;

    player(char symbol){
        this.playerSymbol = symbol;
    }
}

class game_place_monitor{
    static char[] placeholder = new char[10];
    /*
    PLACE HOLDER
    1 | 2 | 3
    4 | 5 | 6
    7 | 8 | 9
     */
    static void setPlace(char symbol , int place) throws xoInvalidPlaceExecption{
        if (place == 0 ){
            throw new xoInvalidPlaceExecption("Invalid Place");
        }
        else if(placeholder[place] == '\u0000'){
            placeholder[place] = symbol;
        }
        else{
            throw new xoInvalidPlaceExecption("Place Already Occupied By " + placeholder[place]);
        }
    }
    static char display_symbol(char symbol){
        return symbol == '\u0000' ? ' ' : symbol;
    }
    static void show_place(){
        for(int i = 1 ; i <= 9 ; i+= 3){
            System.out.println(
                    display_symbol(placeholder[i] )+ " | " + display_symbol(placeholder[i+1]) + " | "
                     + display_symbol(placeholder[i+2]));
        }
        return;
    }
}
class game_referee extends game_place_monitor {

    static boolean checkSymbolOnPlace(int[] places){

        char Symbol = placeholder[places[0]];
        if(Symbol == '\u0000') return false;
        for(int place : places){
            if(placeholder[place] != Symbol){
                return false;
            }
        }
        return true;
    }

    static boolean isGameOver(){
        /*
        PLACE HOLDER
        1 | 2 | 3
        4 | 5 | 6
        7 | 8 | 9
         */
        if(checkSymbolOnPlace(new int[]{1 , 2 , 3})){
            return true;
        }
        else if(checkSymbolOnPlace(new int[]{1 , 4 , 7})){
            return true;
        }else if(checkSymbolOnPlace(new int[]{1 , 5 , 9})){
            return true;
        }else if(checkSymbolOnPlace(new int[]{4 , 5 , 6})){
            return true;
        }else if(checkSymbolOnPlace(new int[]{7 , 8 , 9})){
            return true;
        }else if(checkSymbolOnPlace(new int[]{2 , 5 , 8})){
            return true;
        } else if(checkSymbolOnPlace(new int[]{3 , 6 , 9})){
            return true;
        } else if(checkSymbolOnPlace(new int[]{3 , 5 , 7})){
            return true;
        }
        else {
            return false;
        }
    }
}

class xo extends game_referee{

    static void run(){
        boolean game_end_with_winner = false;
        player x  , o;
        //  create players
        x = new player('X');
        o = new player('O');

        // intro
        System.out.println("""
                    XO GAME
                dev 0_0 @surya-tn99
                
                PLACE ID 
                1 | 2 | 3
                4 | 5 | 6
                7 | 8 | 9
                
                """);

        // total available moves 9
        char current_player;

        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < 9 ; i++){

            if(i%2 == 0) current_player = 'X';
            else  current_player = 'O';

            show_place();

            System.out.print("PLAYER " + current_player + "'s MOVE :> ");

            while(true){
                try{
                    setPlace(current_player , scan.nextInt());
                    break;
                } catch (xoInvalidPlaceExecption e) {
                    System.out.println(e.getMessage());
                }
            }

            if(isGameOver()){
                show_place();
                System.out.printf("""
                            \n
                            *** GAME OVER ***
                            PLAYER %c WIN
                        """ , current_player);
                game_end_with_winner = true;
                break;
            }

        }
        if(!game_end_with_winner){
            System.out.println("\n*** GAME OVER — IT'S A DRAW! ***");
        }
    }
}
