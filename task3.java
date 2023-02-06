java import.util.Массивы;
общедоступный  класс  Main
{
	main  аннулирует  статические  общедоступные (строка[] аргументов) {
		int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
		для (int  i =0; i < 10; i++){
		    переключатель (arr[i]){
		        0  случаев:
		            arr [i]=1;
		            перерыв;
		        1  случай:
		            arr [i]=0;
		            перерыв;
		        }
		}
		System.out.println(Массивы.toString(arr)); 
		int [] arr2 = новый  int [8];
		для (int  i = 0; i<8; i++){
		    arr2 [i] = 3*i;
		}
		System.out.println(Массивы.toString(arr2));
		int [] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		для (int  i = 0; i<12; i++){
		    если (arr3[i]<6){
		       arr3 [i]= arr3[i]*2;
		        }
		            }
		System.out.println(Массивы.toString(arr3));
		int[][] arr4 = новый  int[5][5]; 
		для (int  i = 0; i < 5; i++) { 
		    для (int  j = 0; j < 5; j++) {
		        если (i == j){
		             arr4 [i][j] = 1;
		         }
		         еще{
		             arr4 [i][j] = 0;
		         }
		         System.out.print(arr4[i][j] + " ");
		}
		System.out.println();
		}
	    }
    }
