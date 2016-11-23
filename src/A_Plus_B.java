import acm.program.ConsoleProgram;

/*Íàïèñàòè ïðîöåäóðó îá÷èñëåííÿ çà ö³ëèì N>3 òàêèõ íàòóðàëüíèõ A ³ B, 
 * ùî 5A-2B=N, 
 * ïðè÷îìó A+B ì³í³ìàëüíî.*/
public class A_Plus_B extends ConsoleProgram {
	public void run() {
		int n = readInt("Ââåäèòå ÷èñëî áîëüøå 3 ");

		findIntegers(n);
	}

	private void findIntegers(int n) {
	
		int z = 0;
		int j= 0;
		int k = 0;
		int a = 0;
		int b = 0;
	
		
/*ñîçäàåì ìàññèâ ðàçìåðîì n è 
ìåòîäîì ïåðåáîðà ïðèñâàèâàåì ïåðâûì åãî ÿ÷åéêàì âñå ïîäõîäÿùèå çíà÷åíèÿ à è á*/
		
		int [][]newArray = new int [n][n];
		for (a = 0; a <n; a++){
			for (b = 0; b<n; b++){
			if (5*a * 2*b==n){
				
			  newArray[j][k]=a;	
			  k++;
			  newArray[j][k]=b;
			  j++;
			  z++;
			}
			}
		}
		
		/*ñîçäàåì íîâûé ìàññèâ èç ïàð öèôð, êîòîðûå ìû ïîëó÷èëè ïåðåáèðàÿ à è á
		 * åãî ðàçìåð ðàâåí êîëè÷åñòâó ïîäõîäÿùèõ ïàð*/
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
	println ("a = " + lastArray[index].getA() + " b = "+ lastArray[index].getB()+ "TESSSSSSSSSSST");
		
	}
	
		

	}

	



