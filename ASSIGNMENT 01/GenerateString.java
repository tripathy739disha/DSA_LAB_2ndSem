
/*
ARC
CAR
RCA
 */

	public class GenerateString{
		  static void exchange(char chArr[],int i,int j)
		  {
		    char t=chArr[i];
		    chArr[i]=chArr[j];
		    chArr[j]=t;
		  }
		  static void generateStr(char chArr[],int startIndex,int endIndex)
		  {
		    if(startIndex==endIndex)
		    {
		     String s=new String(chArr);
		      System.out.println(s);
		    }
		    else {
		      for(int index=startIndex;index<endIndex;index++)
		      {
		        exchange(chArr,startIndex,index);
		        generateStr(chArr,startIndex+1,endIndex);
		        exchange(chArr,startIndex,index );
		      }
		    }
		  }
		  public static void main(String[] args) {
				
				char ch[]= {'C','A','R'};
				int n=ch.length;
				generateStr(ch,0,n);
		  
		}
	}
		

	/*
	 * public class PossibleStringSwap {
	 * public static void main(String[] args) {
		
		char ch[]= {'C','A','R'};
		int n=ch.length;
		int i=0,j=0;
		while(i<n || j<n)
		{
			if(j==n)
				{
				for(int k=0;k<n;k++)
					System.out.print(ch[k]);
				System.out.println();
				i
				j=i;
				}
			char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			j++;
			
		}

	}
	}
	*/


