int a[] = {1,2,3,4,5};

for (int k = 0; k < a.length; k++) {


    int temp = a[k];

    //first iteration
      // a[0] = a[5-(1+0)];
      //  = a[4]; //5
      // a[k] = a[5-(1-0)];
        a[k] = a[4];

      a[k] = a[a.length-(1-k)];
      
      //a[0] = a[5-(1+0)];
      //a[0] = a[4]; //5
        a[0] = 5
    //second iteration 
      a[k] = a[a.length-(1+k)];

      a[1] = a[5-]
      //a[1] = a[5-(1+1)];
      //a[1] = a[3]; //4

      a[a.length-(1+k)] = temp;

      console.log(a[k]);
      {0,0,0,0,0}

}


