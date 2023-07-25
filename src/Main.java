public class Main {
    public static void main(String[] args) {
        System.out.println(henry(1,3));

    }
      static int henry(int a,int b){
        int henry=0;
        int max=Integer.MAX_VALUE;
        int perfectCount=0;

        for (int i=1;i<=max;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if (i%j ==0){
                    sum+=j;
                }
            }
            if(sum==i){
                perfectCount++;
                if (perfectCount==a)
                {
                    henry+=sum;
                }
                else if (perfectCount==b) {
                   henry+=sum;
                   break;
                }
            }


        }
        return henry;

      }
}

