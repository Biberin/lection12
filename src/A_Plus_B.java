import acm.program.ConsoleProgram;

/*Написати процедуру обчислення за цілим N>3 таких натуральних A і B, 
 * що 5A-2B=N, 
 * причому A+B мінімально.*/
public class A_Plus_B extends ConsoleProgram {
	public void run() {
		int n = readInt("Введите число больше 3 ");

		findIntegers(n);
	}

	private void findIntegers(int n) {
		int z = 0;
		int j= 0;
		int k = 0;
		int a = 0;
		int b = 0;
	
		
/*создаем массив размером n и 
методом перебора присваиваем первым его ячейкам все подходящие значения а и б*/
		
		int [][]newArray = new int [n][n];
		for (a = 0; a <n; a++){
			for (b = 0; b<n; b++){
			if (5*a - 2*b==n){
				
			  newArray[j][k]=a;	
			  k++;
			  newArray[j][k]=b;
			  j++;
			  z++;
			}
			}
		}
		
		/*создаем новый массив из пар цифр, которые мы получили перебирая а и б
		 * его размер равен количеству подходящих пар*/
		k = 0;
		j = 0;
	
		
		Numbers []lastArray = new Numbers [z+1];
		
		for (int i = 0; i<z; i++){
			
				
			lastArray[i].setA(newArray [k][j]);
				lastArray[i].setB(newArray [k][j+=1]);
				k++;
				
		} 
		int max = lastArray[0].getSum();
	
	
	int index = 0;
	if (lastArray.length>1){
	for (int i = 0; i<lastArray.length; i++){
		if (max > lastArray[i].getSum()){
			max = lastArray[i].getSum();
		index=i;	
		}
		
	}}
	println ("a = " + lastArray[index].getA() + " b = "+ lastArray[index].getB());
		
	}
	
		

	}

	



