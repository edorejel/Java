/*
     * good logic
     * 
     *
    public static boolean isMatchAtIndex(String word, String pattern, int index) {
    	if (index < 0 || (index > word.length()-1) || index > pattern.length() -1){
    		return false;
    	}
    	if (pattern.charAt(index) == '_' || pattern.charAt(index) == word.charAt(index) ) {
    		return true;
    	}
    	return false;
    }
    */
    
    
    /*
     * 
     * good logic
     *
    public static boolean isMatch(String word, String pattern) {
    	if (word.length() != pattern.length()) {
    		return false;
    	}
    	for (int i = 0; i < word.length(); i++) {
    		if(isMatchAtIndex(word, pattern, i) ) {
    			return true;
    		}
    	}
    		
    	return false;
    }
    */

    /*
     * 
     * 
     *
    public static ArrayList<String> getMatches(ArrayList<String> wordList, String pattern){ 
        
    	
    	ArrayList<String> matches = new ArrayList<String>();
    	
    	for (String word: wordList) {
    		if (isMatch(word, pattern))
    			matches.add(word);
    		
    	}
    	
        return matches;
    }
        
        
}*/
}



	    	ArrayList<String> words = new ArrayList<>();
	        FileInputStream file = new FileInputStream(fileName);
	        Scanner fileScnr = new Scanner(file);
	        
	        while(fileScnr.hasNext()) {
	        	String newWord = fileScnr.next();
	        	words.add(newWord);
	        	
	        }
	        fileScnr.close();
	        //file.close();
	        return words;

	        /*try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        	String line;
	        	while ((line = br.readLine()) != null) {
	        		words.add(line.trim());
	        	}
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }*/
	        
	    }



		/* 

		System.out.print("Enter a file name to search in : ");
		fileName = scnr.next();
		
		try { 
			  wordList = getWordList(fileName); 
		  } catch (FileNotFoundException e)  { 
			  System.out.println("Error: File not found, exiting...");
			  return;
		  }
		  //dummy read to clear scnr
		  scnr.nextLine();
		  System.out.println("File read successfully, initiating pattern matcher...");
		 
		  String pattern = "";
		  System.out.println("Enter a pattern to match (or press Enter to exit):...");
		pattern = scnr.nextLine();

		  while(pattern.length() >0 ){ 
		  	
		    System.out.println(getMatches(wordList, pattern));
		 	System.out.println("Enter a pattern to match (or press Enter to exit):...");
		  	pattern = scnr.nextLine();
		  }
		  System.out.println("Exiting...");
