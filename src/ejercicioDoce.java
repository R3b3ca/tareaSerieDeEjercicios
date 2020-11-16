public class ejercicioDoce {
    public static void main (String [] args){


        for ( int i= 0, x= 0,j=1,temp=0; i<10;i++){
            if(i==0){
                System.out.println(0);

            }else {
                temp = x;
                x += j;
                j = temp;
                System.out.println(x);
            }




        }
    }
}
