import java.util.*;
class DA
{
	int []array=new int[5];
	int count=0;
	public void add(int arr){
	if(count<array.length)
	{
	array[count]=arr;
	count++;
	}
	else{
	int [] temp=new int[count*2];
	for(int i=0;i<array.length;i++){
	temp[i]=array[i];
	}
	array=temp;
	array[count]=arr;
	count++;
	}
	}
	public static void main(String []args){
	DyanmicArray  d=new DyanmicArray();
	d.add(45);
	d.add(87);
	d.add(99);
	d.add(24);
	d.add(98);
	d.add(63);
	for(int i=0;i<d.array.length;i++){
		System.out.print(d.array[i]+"");
	}
	}
	}
	