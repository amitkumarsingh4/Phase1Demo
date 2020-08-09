package com.simplilearn.threading;

public class BankTxThrow {


	public static void transaction(boolean tx) {
		//boolean tx = true;
		try {
			if(tx) {
				System.out.println("Transaction succesful");
				}else {
					
				throw new Exception("My exception");	
					
				}
					} catch (Exception e) {
						System.out.println("Catch exception");
					}
				
		} 

		public static void main(String[] args) {
			
			transaction(true);
			transaction(false);

		}

}


//Ex: login ->age>18--> access allowed --> throw error -> access denied
//Ex: calculator >+ - * / -> different custom exception for each