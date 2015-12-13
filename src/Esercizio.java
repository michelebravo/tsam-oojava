
public class Esercizio {
	
	//Dato un array di interi, restituire la loro somma fino a che non viene ritrovato un valore negativo
	
	static int sumPos(int[] myarray){
		int sum=0;
		int i=0;
		for(int x: myarray){
			if(x>=0)
				sum+=x;
			else
				break;
		}
		
		return sum;
	}
	
	//Dato un numero n, restituire la somma dei primi n numeri interi positivi dispari
	
	static int sumOdd(int n){
		int sum=0;
		int i=0;
		int num=1;
		while (i<n){
			if(num%2==1){
				sum+=num;
				++num;
				++i;
			}else{
				++num;
			}
		}
		return sum;
	}
	
	//Dato un array di 10 elementi, calcolarne la media
	
	static double average(int[] myarray){
		int sum = 0;
		for(int x: myarray) {
			sum += x;
		}
		return (double)sum/myarray.length;
	}
	
	//Dato un intervallo [a, b] con a e b due interi positivi, restituire la somma di tutti i numeri
	//compresi all’interno dell’intervallo, estremi inclusi. Nel caso che b fosse minore di a,
	//calcolare la somma nell’intervallo [b,a]
	//Esempio:
	//sumInterval(3, 5) => 12
	//sumInterval(5, 3) => 12
	
	
	static int sumRange(int a,int b){
		int c;
		if(a>b){
			c=a;
			a=b;
			b=c;
		}
		int sum=0;
		while(a<=b){
			sum+=a;
			++a;
		}
		return sum;
	}
	
	
	public static void main(String[] args){
		
		//esercizio 1
		
		int[] a = new int[] {2,5,7,-1};
		
		int result = sumPos(a);
		
		System.out.println(result);
		
		//esercizio 2
		
		int b=sumOdd(10);
		
		System.out.println(b);
		
		//esercizio 3
		
		int[] c = new int[] {1,2,3,4,5,6,7,8,9,10};
				
		double re = average(c);
				
		System.out.println(re);
		
		//esercizio 4
		
		int res= sumRange(3,6);
		
		System.out.println(res);
		
	}

}
