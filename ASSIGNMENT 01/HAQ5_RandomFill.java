class HAQ5_RandomFill{
  public static void main(String args[])
  {
    int arr[][]=new int[4][4];
    System.out.println("The matrix is ");
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        arr[i][j]=(int)(Math.random()*2);
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

   int rowI=0,rowSum=0,colI=0,colSum=0;;
    
    for(int i=0;i<4;i++){
      int s1=0,s2=0;
      for(int j=0;j<4;j++){
        s1+=arr[i][j];
      s2+=arr[j][i];
      if(s1>rowSum){
        rowSum=s1;
        rowI=i;
      }
      if(s2>colSum){
        colSum=s2;
        colI=i;
      }
  }}
    System.out.println("Largest row index = "+rowI);
    System.out.println("Largest col index = "+colI);
}
}

/* OUTPUT

  The matrix is 
  0 0 1 1 
  1 1 0 1 
  0 0 0 1 
  1 1 0 0 
  Largest row index = 1
  Largest col index = 3

  */