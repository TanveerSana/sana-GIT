package miniProjectPackage;

import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		//Entering the option to choose the browser.
		System.out.println("Enter options to choose the browser\n1. For Chrome\n2. For firefox\n");
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			UnregErrorVerify ur = new UnregErrorVerify();
			if(a==1)
				ur.chromeDriver();
			else
				ur.firefoxDriver();
			//Invoking all the methods.
			ur.navigation();
			ur.windowMaximize();
			ur.login();
			ur.emailEntry("jobspari2@gmail.com");
			ur.passwordEntry("abc258");
			ur.submit();
			ur.errorVerification();
			ur.closeDriver();
		}
			
	}
		

}

