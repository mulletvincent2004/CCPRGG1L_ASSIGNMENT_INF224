public class Assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("VINCENT JAY");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("RABANERA");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("MULLET");
        }
         // 4. Create a char array that consists all of the characters of your FIRST NAME and use a for loop to print each character of your FIRST NAME. 

     char[] firstnameCharacters = { 'V', 'I', 'N', 'C', 'E', 'N', 'T', 'J', 'A', 'Y' }; 

     for (int count4 = 0; count4 < firstnameCharacters.length; count4++){ 

         System.out.println(firstnameCharacters[count4]);

     } 

  
        
     // 5. Use a for loop to print the char array of your FIRST NAME in REVERSE order. 

     char[] firstnameReverse = { 'Y', 'A', 'J', 'T', 'N', 'E', 'C', 'N', 'I', 'V' }; 

     for (int count5 = 0; count5 < firstnameReverse.length; count5++){ 

         System.out.println(firstnameReverse[count5]); 
  }

  } 
}
