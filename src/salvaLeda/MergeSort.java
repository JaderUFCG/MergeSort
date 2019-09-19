package salvaLeda;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		int[] v = {2,5,8,4,7,6,3};
		m.mergeSort(v, 0, 6); //teste
		System.out.println(Arrays.toString(v));
	}
	public void mergeSort(int[] v, int inicio, int fim){
		if(inicio<fim) {
			int meio = (inicio + fim)/2;
			
			mergeSort(v, inicio, meio);
			mergeSort(v,meio+1, fim);
			merge(v, inicio, meio, fim);
			}
	}
	public void merge(int[] v, int inicio, int meio, int fim) {
		int[] helper = new int[v.length];
		
		for(int i = inicio; i<= fim; i++) {
			helper[i] = v[i];
		}
		
		int i = inicio;
		int j = meio +  1;
		int k = inicio;
		
		while(i<= meio && j<= fim) {
			if(helper[i]< helper[j]) {
				v[k] = helper[i];
				i ++;
			}else {
				v[k] = helper[j];
				j ++;
			}
			k++;
		}
		while(i<=meio) {
			v[k] = helper[i];
			k++;
			i++;
		}
		while(j<=fim) {
			v[k] = helper[j];
			k++;
			j++;
		}
	}
}
