public class ArraySegregate {

	public static void main(String[] args) {
		int arr[]= {1,1,0,0,1,0,1,0};
		int zero=0,one=0;
		for(int i=0;i<8;i++)
		{
			if(arr[i]==0)
			{
				zero++;
			}
			if(arr[i]==1)
			{
				one++;
			}
		}
		System.out.println(" zeros "+ zero +" one "+ one);
		for(int i=0;i<zero;i++)
		{
			arr[i]=0;
		}
		for(int i=zero;i<8;i++)
		{
			arr[i]=1;
		}
		System.out.println("segregated array elements are");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}






