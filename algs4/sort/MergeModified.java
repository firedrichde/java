package sort;

public class MergeModified extends SortExample{
		
	public static void Sort(Comparable[] a) {
		Comparable[] tmp=new Comparable[a.length];
		sort(a,0,a.length-1,tmp);
	}
	
	private static void sort(Comparable[] a,int lo,int hi,Comparable[] tmp) {
		if(hi<=lo+15) {
			insert(a,lo,hi) ;
			return;
		}
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid,tmp);
		sort(a,mid+1,hi,tmp);
		if(less(a[mid],a[mid+1]))
			return;
		merge(a,lo,mid,hi,tmp);
	}
	
	private static void merge(Comparable[] a,int lo,int mid,int hi,Comparable[] tmp) {
		for(int i=lo;i<=hi;i++) {
			tmp[i]=a[i];
		}
		int i=lo;
		int j=mid+1;
		for(int k=lo;k<=hi;k++) {
			if(i>mid)
				a[k]=tmp[j++];
			else if(j>hi)
				a[k]=tmp[i++];
			else if(less(tmp[i],tmp[j]))
				a[k]=tmp[i++];
			else
				a[k]=tmp[j++];
		}
	}
	
	private static void insert(Comparable[] a,int lo,int hi) {
		for(int k=lo;k<hi;k++) {
			for(int j=k+1;j>lo;j--) {
				if(less(a[j],a[j-1]))
					exch(a,j,j-1);
			}
		}
	}
	

}
          