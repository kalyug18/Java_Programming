*         *
**       **
***     ***
****   ****
***** *****
****   ****
***     ***
**       **
*         *


for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < i+1; j++) 
            {
                System.out.print("*");
            }
            
             for (int j = 0; j <= 2*(4-i); j++) 
            {
                System.out.print(' ');
            }
            
             for (int j = 0; j < i+1; j++) 
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
