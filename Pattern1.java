public class Pattern1 {
    public static void main(String[] args) {
        
        /* 
            Single Loop, Nested Loops
            Via +

            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
        */

        int x = 0;
        int y = 5;
        int z = 0;
        while(y-->0) {
            while(x++<=y) {
                System.out.print("+ ");
            }
            System.out.println();
            x = 0;
            z++;
            if (z>9) {
                break;
            } else if(z>=5){
                y = z-4;
            }    
        }

    }
}