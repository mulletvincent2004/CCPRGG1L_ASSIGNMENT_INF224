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
        // char array
        
        String[] myFirstName = {"V","I","N","C","E","N","T","J","A","Y"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"Y","A","J","T","N","E","C","N","I","V"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
}
    }
}
