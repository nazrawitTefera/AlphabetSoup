//nazrawit tefera
//9/24/2025
// this program allows adding words,removing letters,generating random letters and inserting the company name into the soup

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters+=word;
//precondition- word is a non-null string
//postconditions-adds the 'word ' to letters
    }
    

    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int length = letters.length();   // get the length
        int randIndex = (int)(Math.random() * length); // random number
        char a = letters.charAt(randIndex);            // get that character
        return a; // return the character
    }
    //Preconditions: letters can not be empty
    //Postconditions: it returns a random character from letters

    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int middle=letters.length()/2; //find the middle
        String firstPart=letters.substring(0,middle);  //letters before middle
        String secondPart=letters.substring(middle); //letters after middle
        String result=firstPart+company+secondPart;//puts together
        return "result";
    }


    //should remove the  available vowel from letters. If there are no vowels this method has no effect.
    //pre- none
    //post- letters will lose the first vowelit finds (a,e,i,o,u)
    public void removeFirstVowel(){
        //we check every vowel
        int index=letters.indexOf("a");
        if(index==-1){index=letters.indexOf("e");}
        if(index==-1){index=letters.indexOf("i");}
        if(index==-1){index=letters.indexOf("o");}
        if(index==-1){index=letters.indexOf("u");}
        if(index != -1){
            //cut the vowel out
            String before=letters.substring(0,index);
            String after=letters.substring(index+1);
            letters=before+after;
        }

        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int start=(nt)Math.random()*(letters.length()-num+1);
        String before=letters.substring(0,start);
        string after=letters.substring(start+num);
        letters=before+after;

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){// pre- word is not null post- if word is inside letters,it will be removed
        
       int index=letters.indexOf(word);//find the word
       if(index!=-1){
         String before= letters.substring(0,index);
         String after=letters.substring(index+word.length());
         letters=before+after;
       } 
    }
}
