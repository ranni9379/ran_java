package collection1;

public class MyArray {
	int[] arr;
	
	//정수 추가 메서드
	public void add(int num) {
		if(arr == null) {
			arr = new int[1];
		}else {
			int[] temp = new int[arr.length+1];
			for(int i=0; i<arr.length; i++) {
				temp[i] =arr[i];
			}
			arr=temp;
		}
		arr[arr.length-1]=num;
	}
	public int get(int index) {
		return arr[index];
	}
	//인덱스 지정하여 정수 출력 메서드

}
