package Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//print acc to asceding of number
class customiseSortingUsingLamda {
	
	int no;
	String name;
	
	
	public customiseSortingUsingLamda(int no,String name)
	{
		this.no=no;
		this.name=name;
	}


	@Override
	public String toString() {
		return "customiseSortingUsingLamda [no=" + no + ", name=" + name + "]";
	}
	

	

}

class myans{
	public static void main(String[] args)
	{
		List<customiseSortingUsingLamda> l=new ArrayList<customiseSortingUsingLamda>();
		l.add(new customiseSortingUsingLamda(12,"megha"));
		l.add(new customiseSortingUsingLamda(1,"megha"));
		l.add(new customiseSortingUsingLamda(10,"megha"));
		l.add(new customiseSortingUsingLamda(8,"megha"));
		System.out.println("before sorting");
		System.out.println(l);
		
		System.out.println("after sorting acc to no");
		Collections.sort(l,(x1,x2)->(x1.no>x2.no)?-1:(x1.no<x2.no)?+1:0);
		System.out.println(l);
	}
}
