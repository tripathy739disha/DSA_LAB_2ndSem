import java.util.*;
class Q7_ArrayMaxMin
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of elements in array ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements in array ");
      for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();
      int max=arr[0],min=arr[0];
      int maxCnt=0,minCnt=0;
      int foMax=-1,loMin=-1;
      for(int i=0;i<n;i++)
        {
       if(arr[i]>max) { 
    	   max=arr[i];
    	   foMax=i;
       }
       else if(max==arr[i]) 
    	   maxCnt++;
       if(arr[i]<min) 
    	   min=arr[i];
       else if(min==arr[i]) {
    	   minCnt++;
    	   loMin=i;
       }
        }
      
      
    /*  for(int i=0;i<n;i++)
      {
    	  if(arr[i]==max) maxCnt++;
    	  if(arr[i]==min) minCnt++;
      }
     
      
      
      for(int i=0;i<n;i++)
    	  if(arr[i]==max)
    	  {
    		  foMax=i;
    		  break;
    	  }
      for(int i=0;i<n;i++)
    	  if(arr[i]==min)
    	  {
    		  loMin=i;
    	  }
    	  */
      
      System.out.println("The maximum element is "+max+" and occurs "+maxCnt+" times");
      System.out.println("The minimum element is "+min+" and occurs "+minCnt+" times");
      System.out.println("First occurence of max element is at position "+(foMax+1));
      System.out.println("Last occurence of min element is at position "+(loMin+1));
    }
    
  }