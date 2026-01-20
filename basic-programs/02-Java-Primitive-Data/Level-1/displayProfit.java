class displayProfit{
	public static void main(String [] args){
		int costPrice=129,sellingPrice=191,profit;
		double profitPercentage;
		profit=sellingPrice-costPrice;
		profitPercentage=(profit*100)/costPrice;
		System.out.print("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	}
}