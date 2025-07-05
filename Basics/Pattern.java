public class Pattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(4);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(4);
       
        
    }
    static void pattern1(int n){
      for(int row=1; row<=n; row++){
        for(int col=1; col<=n; col++){
            if(col>=row){
                System.out.print("*");
            }
            else{
                System.out.print("");
            }
        }
        System.out.println();
      }
      System.out.println();
    }

    static void pattern2(int n){
        for(int row=1; row<=n; row++){
          for(int col=n; col>=1; col--){
              if(col<=row){
                  System.out.print("*");
              }
              else{
                  System.out.print("");
              }
          }
          System.out.println();
        }
        System.out.println();
      }

      static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(col == 1|| row==n|| col==row){
                System.out.print("*");
                }
                else{
                  System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
      }

      static void pattern4(int n){
        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
             System.out.println();
        }
      }

      static void pattern5(int n){
        for(int row=1 ; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
      }

      static void pattern6(int n){
        for(int row=n ; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
      }
       //Floyd's Triangle
      static void pattern7(int n){
        int num=1;
       for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
            System.out.print(" "+num+" ");
            num++;
        }
        System.out.println();
       }
      }

      static void pattern8(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if((row+col)%2==0){
                    System.out.print("1"+"");
                }else{
                    System.out.print("0"+"");
                }
            }
            System.out.println();
        }
      } 

      static void pattern9(int n){
        //upper half
        for(int row=1; row<=n; row++){
            for(int stars=1; stars<=row; stars++){
                System.out.print("*");
            }
            for(int spaces=1; spaces<=2*(n-row); spaces++){
                System.out.print(" ");
            }
            for(int stars=1; stars<=row; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int row=n; row>=1; row--){
            //stars
            for(int stars=1; stars<=row; stars++){
                System.out.print("*");
            }
            //spaces
            for(int spaces=1; spaces<=2*(n-row); spaces++){
                System.out.print(" ");
            }
            //stars
            for(int stars=1; stars<=row; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
      }

  static void pattern10(int n){
    for(int row=1; row<=n; row++){
        //spaces
        for(int spaces=1; spaces<=n-row; spaces++){
            System.out.print(" ");
        }
        for(int stars=1;stars<=n;stars++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

  static void pattern11(int n){
   for(int row=1; row<=n; row++){
    //spaces
    for(int spaces=1; spaces<=n-row; spaces++){
        System.out.print(" ");
    }
    //numbers-> print row no. , row no. times
    for(int num=1; num<=row; num++){
        System.out.print(row+"  ");
    }
    System.out.println();
   }
  }

  static void pattern12(int n){
    for(int row=1; row<=n; row++){
        //spaces
        for(int spaces=1; spaces<=n-row; spaces++){
            System.out.print(" ");
        }
        //1st half numbers
        for(int num=row; num>=1; num--){
            System.out.print(num+" ");
        }
        //2nd half numbers
        for(int num=2; num<=row; num++){
            System.out.print(num+" ");
        }
        System.out.println();
    }
  }
  
  static void pattern13(int n){
    //1st half
    for(int row=1; row<=n; row++){
        for(int spaces=1; spaces<=n-row; spaces++){
            System.out.print(" ");
        }
        for(int stars=1; stars<=2*row-1; stars++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int row=n; row>=1; row--){
        for(int spaces=1; spaces<=n-row; spaces++){
            System.out.print(" ");
        }
        for(int stars=1; stars<=2*row-1; stars++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

   
}
