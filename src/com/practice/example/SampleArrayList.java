package com.practice.example;

public class SampleArrayList {

	private int defaultSize = 20;
	private int position;
	private int itemsArray[] = new int[defaultSize];

	public void add(int item) {
		if (position >= itemsArray.length) {
			itemsArray = growSize(itemsArray);
		}

		itemsArray[position++] = item;
	}

	public int[] growSize(int[] array1) {
		int itemsArray[] = new int[array1.length * 2];
		for (int i = 0; i < itemsArray.length; i++) {
			itemsArray[i] = array1[i];
		}
		return itemsArray;

	}

	public int get(int itemposition) {
		if (itemposition > position) {
			return -1;
		}
		return itemsArray[position];
	}

	public int remove(int itemposition) {
		if (itemposition >= position)
			return -1;
		int[] itemsArrayNew = new int[itemsArray.length - 1];
		for (int i = 0; i <= position; i++) {
			if (i == itemposition) {
				continue;
			}
			itemsArrayNew[i] = itemsArray[i];
		}
		itemsArray = itemsArrayNew;
		position--;
		return 0;
	}
	public String toString() {
		StringBuffer str=new StringBuffer();
		for(int i=0;i<position;i++) {
			str.append(itemsArray[i]+",");
		}
		return str.toString();
	}
	public static void main(String args[]) {
		SampleArrayList sample=new SampleArrayList();
		sample.add(20);
		sample.add(30);
		sample.add(-29);
		sample.add(10000000);
		for(int i=0;i<1000;i++) {
			sample.add(i);
			
		}
		System.out.println(sample.toString());
		for(int i=700;i<1000;i++) {
			sample.remove(i);

		}
		System.out.println(sample.toString());
	}

}
