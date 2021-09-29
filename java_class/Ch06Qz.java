package java_class;

public class Ch06Qz {

	public static void main(String[] args) {
		
		
		for(int i=1;i<11;i++)
		{ int num=1;
			for(int k=0;k<10;k++)
		{
				if(isPrimeNumber(i*num)==true)
				{
					if(i*num==1)
					{
						System.out.printf("  %2d",i*num);
						num++;
					}else
					{
				        System.out.printf("(%2d)",i*num);
				        num++;
				    }
				}
				else
				{
					   System.out.printf("  %3d",i*num);
					   num++;
				}

		}
		   System.out.println("");
		}

	}
	
	static boolean isPrimeNumber(int num) {

		   for(int k = 2; k < num; k++){

		      if((num % k) == 0) return false;

		   }

		   return true;

		}

}
