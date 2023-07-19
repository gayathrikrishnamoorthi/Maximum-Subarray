package sample;

import java.util.Scanner;

public class Maximum {
	
		public static int maximum(int arr[],int n,int b) {
			int max=0;
			for(int i=0;i<n;i++) {	
				int sum=0;
				for(int j=i;j<n;j++) 
				{
					sum+=arr[j];				
					if(sum<=b && sum >max) 
					{
					max=sum;
					}
				}
			}
			return max;
			
			
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int b=sc.nextInt();
			int value=maximum(arr,n,b);
			System.out.println(value);
		}
	}


