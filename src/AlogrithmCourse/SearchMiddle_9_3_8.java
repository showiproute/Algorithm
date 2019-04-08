package AlogrithmCourse;

public class SearchMiddle_9_3_8 {
	public static int search(int[] X,int p,int q,
			int[] Y,int r,int s) {
		int midx,midy;
		if(((p+1)==q)&&(r+1==s)){
			if(X[p]<Y[r]) 
				return (X[q]<Y[r]?X[q]:Y[r]);
			else
				return (Y[s]<X[p]?Y[s]:X[p]);
		}else {
			if((p-q)%2==0) { //数组元素为奇数个
				midx=(p+q)/2;
				midy=(r+s)/2;
			}else {
				midx=(p+q)/2; //数组元素为偶数个
				midy=(r+s)/2+1;
			}
		   if(X[midx]<Y[midy])
			   return search(X, midx, q, Y, r, midy);
		   else if(X[midx]>Y[midy])
			   return search(X, p, midx, Y, midy, s);
		   else
			   return X[midx];
		}
		
		
	}
	
	
	
}
