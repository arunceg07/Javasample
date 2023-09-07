package InternalJavaPGMS;

public class PrimeandComposite {

    public void primnumber(int num){

        int count=0;

        for (int i=1; i<=num;i++)
        {
            float res = num%i;

            if (res==0){
                count++;
            }

        }

        boolean prim = count>2;

        if (!prim&&num>1){
            System.out.println(num+"--Prime Number--");
        }

        if (prim&&num>1){
            System.out.println(num+"--Composite Number--");
        }

    }


    public static void main(String args[]) {

        PrimeandComposite mC = new PrimeandComposite();

        for (int j=0; j<=1000;j++)
        {
            mC.primnumber(j);
        }


    }
}