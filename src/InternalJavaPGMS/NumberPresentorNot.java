package InternalJavaPGMS;

public class NumberPresentorNot {

        public static void main(String args[]) {
            int num = 4;
            int count = 0;
            int Arrayint[] = {1, 132, 3,4,4,6,7};

            for (int i=0; i<=Arrayint.length-1;i++)
            {
                if (Arrayint[i]==num){
                    System.out.println(num+"--Present");
                    count++;
                }
            }

            if (count==0){
                System.out.println(num+"--Not Present");
            }

        }
    }

