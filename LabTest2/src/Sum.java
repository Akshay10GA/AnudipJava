
public class Sum {

	public static int Add(int n){
        int addition = 0;
        for(int i = 1;i<=n;i++){
            addition = addition + i;
        }return addition;

    }
    public static void main(String args[]){
        int sum;
        sum = Add(100);
        System.out.println("Addition of numbers from 1 to 100 is : "+sum);
    }
}
