public class Prime {

    public static void PrimeNumber(int n){
        boolean prime = false;
        if(n>2){
            System.out.print("Prime numbers from 1 to 20 are : 2 ");
            for(int i = 2;i<=20;i++){
                for(int j=2;j<(i);j++){
                    if(i%j==0){
                        prime = false;
                        break;
                    }else{
                        prime = true;
                    }
                }
                if (prime == true){
                    System.out.print(i+" ");
                }  
            }
        }
    }
    public static void main(String args[]) {
        PrimeNumber(20);
        
    }
    
}
