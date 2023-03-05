import java.util.Scanner;
class Login{
				Scanner sc;
				String ur,pass;
				public Login(Scanner sc){
				this.sc=sc;
				insertData();

				}
  public void insertData(){
    System.out.println("Enter Username:");
    ur=sc.nextLine();
    
    System.out.println("Enter Password:");
    pass=sc.nextLine();
    validation();
  }
  public void validation(){
    if(ur.equals("admin")){
      if(pass.equals("admin")){
        System.out.println("\nSuccessfully Login \nwelcome Admin");
        
      }else{
        System.out.println("Wrong Password please try again ");
        
      }
    }else{
      System.out.println("Wrong Username please try again ");
    }
    }

}
class Login_Test{
  
  public static void main (String args[]){
	Scanner sc=new Scanner (System.in);
    Login l=new Login(sc);

	System.out.println("\n\n**********************************");
	System.out.println("      Book Store Management       ");
	System.out.println("**********************************");
	
	// Display menu
	System.out.println("\nWelcome to Apna Book Store:"); 
	System.out.println("Please Select Option: ");
	System.out.print("1:Books Details\n"); 
	System.out.print("2:Book Available\n");
	System.out.print("3:Issued Book\n");
	System.out.print("4:Return Book\n");
	System.out.print("5:Selling Book \n");
	System.out.println("6:Quit");

	System.out.println("Input your choice: ");
  }
}