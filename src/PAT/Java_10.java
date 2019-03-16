package PAT;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Java_10 {

	/*
	 * 18 15 10
	 * 75 72 45
	 * 4.16 4.8 4.5 
	 */
	public static class MoonCake implements Comparable<MoonCake>{


		/**
		 * @return the amount
		 */
		public double getAmount() {
			return amount;
		}


		/**
		 * @param amount the amount to set
		 */
		public void setAmount(double amount) {
			this.amount = amount;
		}


		/**
		 * @return the totalprice
		 */
		public double getTotalprice() {
			return totalprice;
		}


		/**
		 * @param totalprice the totalprice to set
		 */
		public void setTotalprice(double totalprice) {
			this.totalprice = totalprice;
		}


		/**
		 * @return the perPrice
		 */
		public double getPerPrice() {
			return perPrice;
		}


		/**
		 * @param perPrice the perPrice to set
		 */
		public void setPerPrice(double perPrice) {
			this.perPrice = perPrice;
		}


		public MoonCake(double amount, double totalprice, double perPrice) {
			super();
			this.amount = amount;
			this.totalprice = totalprice;
			this.perPrice = perPrice;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "MoonCake [amount=" + amount + ", totalprice=" + totalprice + ", perPrice=" + perPrice
					+ ", getAmount()=" + getAmount() + ", getTotalprice()=" + getTotalprice() + ", getPerPrice()="
					+ getPerPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

		private double amount;
		private double totalprice;
		private double perPrice;
		
		
		@Override
		public int compareTo(MoonCake o) {
			// TODO Auto-generated method stub
			return Double.compare(o.getPerPrice(), this.getPerPrice());
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N= scanner.nextInt();
		Double D = scanner.nextDouble();

		double[] keys=new double[N];
		double[] values=new double[N];

		ArrayList<MoonCake> moonCakes=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			keys[i] = scanner.nextDouble();
		}
		for(int i=0;i<N;i++) {
			values[i] = scanner.nextDouble();
		}
		for(int i=0;i<N;i++) {
			MoonCake moonCake = new MoonCake(keys[i], values[i], values[i]/keys[i]);
			moonCakes.add(moonCake);
		}		
		Collections.sort(moonCakes);

		double profit=0;
		for (MoonCake moonCake : moonCakes) {
			if(D-moonCake.getAmount()>0) {
				profit+=moonCake.getTotalprice();
				D-=moonCake.getAmount();
			}else {
				profit+=moonCake.getPerPrice()*(D);
				break;
			}
		}
			
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println(df.format(profit));
		
	}
		
}
