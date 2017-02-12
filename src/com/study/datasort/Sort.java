package com.study.datasort;

public class Sort {
	public static void test(){};
	
	public static int R[] = new int[]{22,44,65,46,544,54,218,987,88,777,11,33,32,11,44,52,20,343,21};
	public static void main(String[] args) {
//		popupSort();
//		selectedSort();
//		quickSort(R,0,R.length);
		insertSort(R,R.length);
	}

	public static int selectMinKey(int a[],int n,int i){
		int k = i;
		for(int j = i+1;j<n;++j){
			if(a[k] > a[j]) k = j;
		}
		return k;
	}
	
	//—°‘Ò≤Â»Î≈≈–Ú
	public static void selectedSort(){
		System.out.println("—°‘Ò≈≈–Ú");
		int k ,temp = 0;
		for(int i=0;i<R.length;++i){
			k = i;
			for(int j=i+1;j<R.length;++j){
				if(R[k] > R[j]) k = j;
			}
			if(k != i){
				temp = R[i];
				R[i] = R[k];
				R[k] = temp;
			}
		}
		
		print();
	}
	private static void print(){
		for(int a: R){
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println();
	}
	//√∞≈›≈≈–Ú≈≈–Ú
	public static void popupSort(){
		System.out.println("√∞≈›≈≈–Ú");
		for(int i=0;i<R.length;++i){
			int k=i ,temp = i;
			for(int j=0;j<R.length;++j){
				if(R[k] < R[j]) {
					k = j;
					temp = R[i];
					R[i] = R[k];
					R[k] = temp;
				}
			}
		}
		
		print();
	}
	
	
	public static void quick(int a[],int left,int right){
		
		int i = left;
		int j = right;
		int first = a[left];
		int tmp;
		
		while(true){
			while( (++i)<right-1 && a[i]<first);
			while( (--j)>left && a[j]>first);
			if(i>=j)break;
			tmp = a[i];
			a[i]=a[j];
			a[j]=tmp;
		}
		a[left] = a[j];
		a[j] = first;
		
		if(left < j) quick(a,left,j);
		if(right > i) quick(a,i,right); 
	}
	
	public static void swap(int a[],int i,int j){
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void quickSort(int a[],int left,int right){
		System.out.println("øÏÀŸ≈≈–Ú");
		quick(a, left, right);
		print();
	}
	
	public static void insertSort(int a[],int n){
		System.out.println("≤Â»Î≈≈–Ú");
		for(int i=1;i<n;i++){
			if(a[i] < a[i-1]){
				int tmp = a[i];
				int j = i-1;
				a[i] = a[i-1];
				while( j>=0 && a[j] > tmp ){
					a[j+1]= a[j];
					j--;
				}
				a[j+1] = tmp;
			}
		}
		print();
	}
}
