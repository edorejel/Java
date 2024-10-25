/*
no arrays or other storage structurs may be used
*/

import java.util.Scanner;



public class Initials {
    
    public static String toInitials(String str){
        
    	
    int strLength = str.length();
    int strLastIndex = str.length()-1;
    int whiteSpace = str.indexOf(' ');
    int whiteSpace1 = str.lastIndexOf(' ');
    
    String whiteSpace2 = Integer.toString(whiteSpace);//search for first white space in a name, two names
    String whiteSpace3 = Integer.toString(whiteSpace1);//search for second white space in the name, three names
    
    
    String firstName = "";
    String secondName = "";
    String thirdName2 = "";
    char firstInitial1 = 0;
    char secondInitial2 = 0;
    char firstInit = 0;
    
    
       
   
    //verified logic for one names
   if (str.contains(whiteSpace2) && (str.contains(whiteSpace3))) {
	   if (str.contains(whiteSpace2)) {
		   if (!(str.contains(whiteSpace2)))    {
    		//if (str.contains(whiteSpace2)) {
    			//if (str.contains(whiteSpace2) && (str.contains(whiteSpace3))) {
			 //verified logic for three names
				thirdName2 = str.substring(str.lastIndexOf(" "), strLength);
				System.out.println(thirdName2.strip() + " third name verified YYYYYYYYYYYYY--------------------------");
				
				char thirdInitial = thirdName2.charAt(1);
				String.valueOf(thirdInitial);
				System.out.println(thirdInitial + " ******");

				return String.valueOf(firstInitial1) + ". " + String.valueOf(secondInitial2)+ ". " + String.valueOf(thirdInitial);
//}
				}
    				firstName = str.substring(str.indexOf(str));
    				firstInit = str.charAt(0);
    				return String.valueOf(firstInit) + ".>>>>>>>>>>>>>>>>>>>>>>> ";
    		}
    					secondName = str.substring(str.indexOf(" "), /*str.lastIndexOf(" ")*/ str.length());
    					System.out.println(firstName.strip() +  " first name--------------------------");
    					System.out.println(secondName.strip() + " second name verified YYYYYYYYYYYYY--------------------------");
    					//logic works to get first initial
    					firstInitial1 = str.charAt(0);
    					String.valueOf(firstInitial1);
    					System.out.println(firstInitial1 + " ******");
        
    					secondInitial2 = secondName.charAt(1);
    					String.valueOf(secondInitial2);
    					System.out.println(secondInitial2 + " *****");
    					return String.valueOf(firstInitial1) + ". " + String.valueOf(secondInitial2)+ ". ";
    		}
    						
    
    
    return "invalid";
}
    
    
    /*if ((str.contains(whiteSpace2)) && (str.length() > 3)) {*/
    
     
    	

    	  
    
    
 
    
    

	/*if (String.valueOf(thirdInitial) != null) {
      
           return firstInitial1 + ". " + secondInitial2 + ". " + thirdInitial +". ";
	} else if (String.valueOf(secondInitial2) != null ) {
		
		return firstInitial1 + ". " + secondInitial2 + ". ";
	}
	return firstInitial1 + ". ";
    } }
    
    
    
    /*
    return "test";
    */
    
     //verified logic for two names
    	//secondName = str.substring(str.indexOf(" "), str.lastIndexOf(" "));
    	
	//logic works to get second initial
	
   
    //verified logic for three names
    /*thirdName2 = str.substring(str.lastIndexOf(" "), strLength);
    System.out.println(thirdName2.strip() + " third name verified YYYYYYYYYYYYY--------------------------");
	char thirdInitial = thirdName2.charAt(1);
	String.valueOf(thirdInitial);
	System.out.println(thirdInitial + " ******");
    
    
    
    return String.valueOf(firstInitial1);*/
    
    
    
    

	/*if (String.valueOf(thirdInitial) != null) {
      
           return firstInitial1 + ". " + secondInitial2 + ". " + thirdInitial +". ";
	} else if (String.valueOf(secondInitial2) != null ) {
		
		return firstInitial1 + ". " + secondInitial2 + ". ";
	}
	return firstInitial1 + ". ";
    } }*/
      /*
      if ((str.contains(" ") && str.contains(firstName) && str.contains(secondName) && str.contains(thirdName2) ) ) {
			
		
		return firstInitial1 + ". " + secondInitial2 + ". " + thirdInitial + ". ";
    
    }
	return firstInitial1 + ". ";
    }*/
        	
    
     
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String str = sc.nextLine();
		
		String str2 = toInitials(str);
		
		System.out.println("Initials for "+str+" : "+str2);
	}
}



















/*
public class Initials {
    
    public static String toInitials(String str){
        
    	
    	String name = str;
    	String firstName;
    	
    	String whiteSpace = " ";
    	
    	int length = str.length();
    	
    	int indexOfWhiteSpace = str.indexOf(' ');
    	
    	
    	if (name.contains(whiteSpace) ) {
    		
    		firstName = str.substring(0, indexOfWhiteSpace);
    		System.out.println(name + "inside");	
    	}
    	
    	
    	if (name.toString().contains(whiteSpace) ) {
    		
    		name = str.substring(indexOfWhiteSpace, length);
    	    System.out.println(name + "inside"); 		
    	}
    	
    	   	
    	if (!(name.toString().contains(whiteSpace) )) {
    		name = str.substring(0, length);
    		System.out.println(name);
    		System.out.println("inside function single name");
    	}
    		
    	//char myString1 = String.valueOf(name).charAt(0);
		char firstInitial = String.valueOf(name).charAt(0);
		String firstInitial1 = String.valueOf(firstInitial);
		char lastInitial = String.valueOf(name).charAt(0);
		String lastInitial1 = String.valueOf(lastInitial);
		
		//char myString2 = (char) (String.valueOf(lastName).charAt(1));
		
		
    	
    	
    	
        return firstInitial1 + ". " + lastInitial1 + ". ";
    
    }
     
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String str = sc.nextLine();
		
		String str2 = toInitials(str);
		System.out.println("Initials for "+str+" : "+str2);
	}
}*/
