public class ejercicioCincoE {

    public static void main(String[] args) {

        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

for (int i=0;i<numbers.length;i++){
 if (numbers[i]%5==0){
     System.out.println(numbers[i]);
 }if(numbers[i]==150){
     break;
    }
}
    }
}