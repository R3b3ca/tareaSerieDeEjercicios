public class ejercicioOnce {
    private int start;

    public static void main (String[]args){


        for (int x= 25;x<=50;x++){
            if(Evaluando(x)){
                System.out.println("el numero "+ x+ " es primo");
            }

        }


    }

    private static boolean Evaluando(int evaluar) {
        for (int x= 2; x<=7;x++) {
            if(evaluar%x==0){
                return false;

            }else{
                x=x%2==1?x++:x;

                /*if(x%2==1){
                x=x+1;
                }else{
                x=x;
                }
                */

            }
        }
        return true;
    }

}
