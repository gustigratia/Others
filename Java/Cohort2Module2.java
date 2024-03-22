public class Main {

    public static void main(String[] args) {
        // Do not change
        
        task1("Rahman Arif/17-02-2003/Jakarta/M/A/WNI/Single");
        task1("Alice Rebecca/17-03-1984/London/F/O/WNA/Married");
        task2("Wanda");
        task3();
        task4("Eat and Tea");
    }
    
    public static String task1(String data){
        // Your code here
        // ...
        
        int startPosition = 0;
        //find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        //chop the string from the beginning to the first slash position (/ is excluded)
        String name = data.substring(startPosition, slashPosition);
        //split and reverse the name to correct firstname and lastname order
        String firstName = name.substring(name.indexOf(" ")+1, name.length());
        String lastName = data.substring(startPosition,name.indexOf(" "));
        //get the first character of first and last name
        String initial = ""+ name.charAt(name.indexOf(" ")+1) + name.charAt(startPosition);

        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition, slashPosition);
        //chop the year of birth yyyy
        String birthYear = birthDate.substring(6,10);
        //count the age
        int age = 2024 - (Integer.parseInt(birthYear));

        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the palce of birth
        String birthPlace = data.substring(startPosition, slashPosition);

        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the sex data M or F
        String sex = data.substring(startPosition,slashPosition);
        //change M to Male and F to Female
        sex= sex.replace("M", "Male");
        sex= sex.replace("F", "Female");

        //chop the string stored in variable named data from the fourth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the blood type data
        String bloodType = data.substring(startPosition, slashPosition);

        //chop the string stored in variable named data from the fifth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the citizenship data
        String citizen = data.substring(startPosition,slashPosition);
        //check whether local citizen
        boolean isLocalCitizenB = citizen.endsWith("I");
        //change true or false to Yes or No
        String isLocalCitizen =""+isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true","Yes");
        isLocalCitizen = isLocalCitizen.replace("false","No");

        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //chop the marital status data
        String maritalStatus = data.substring(startPosition);

        //generating the output
        String line1 = "Full Name: " + firstName + " "+lastName+ " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " + sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local Citizen: " + isLocalCitizen;
        String line7 = "Marital Status: " + maritalStatus;

        //store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3+ "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7;

        //print out the output
        System.out.println(output);

        return output; 
    }
    
    public static String task2(String name){
        // Your code here
        // ...

        //store all alphabet to single string
        //each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //change the input to lowercase, since tha alphabets are all in lowercase
        name = name.toLowerCase();

        //set the key
        int key = 5;

        //shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(0)) + key) % 26);
        String k2 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(1)) + key) % 26);
        String k3 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(2)) + key) % 26);
        String k4 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(3)) + key) % 26);
        String k5 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(4)) + key) % 26);


        //change the first character to upper case
        k1 = k1.toUpperCase();

        //generate the output
        String output = k1 + k2 + k3 + k4 + k5;

        //print out the output
        System.out.println(output);

        //return the output
        return output;
    }
    
    public static void task3(){

        //declare and initialize the variables

        int priceOfCoffee = 15000;
        int priceOfTea = 10000;
        int priceOfPizza = 45000;
        String currency = "$";
        int numOfCoffee = 3;
        int numOfTea =  5;
        int numOfPizza = 1;
        String nameOfCustomer = "Albert";

        double discountOfCoffee = priceOfCoffee*0.1;
        double discountOfTea = priceOfTea*0.15;
        double discountOfPizza = priceOfPizza*0.05;
        double coffee = (priceOfCoffee - discountOfCoffee)*numOfCoffee;
        double tea = (priceOfTea - discountOfTea)*numOfTea;
        double pizza = (priceOfPizza - discountOfPizza)*numOfPizza;
        double cashInHand = 200000;

        // count number of items
        int numOfItems = numOfPizza + numOfCoffee + numOfTea;

        // count the total price
        double totalPrice = coffee + tea + pizza;
        double tax = 0.11;
        // count the total price after tax
        double totalPriceAfterTax = totalPrice + (tax*totalPrice);
        // print total price
        System.out.println("Total Price: "+ currency + totalPrice);

        // count the change
        double change = cashInHand - totalPriceAfterTax;
        //printing the change
        System.out.println("Change: " + currency + change);

        // count amount of donation
        double donation = change % 1000;
        System.out.println("Donation: "+ currency + donation);


        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of items: " + numOfItems);
        System.out.println("Tea\t\t|\t" + numOfTea + "\t|\t"  + tea);
        System.out.println("Coffee\t|\t" + numOfCoffee + "\t|\t"  + coffee);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + pizza);
        System.out.println("Total Before Tax: "+ currency + totalPrice);
        System.out.println("Tax: " + tax*100 + "%");
        System.out.println("Total after tax: "+ currency + totalPriceAfterTax);
        System.out.println("Amount Paid: "+ currency + cashInHand);
        System.out.println("Change: " + currency + change);
        System.out.println("Donation Amount: " + currency + donation);
        System.out.println("\n-----------------------------------");
    }

    public static void task4(String input){
        int space1 = input.indexOf(" ");
        String word1 = input.substring(0,space1);
        int space2 = input.indexOf(" ", space1+1);
        String word2 = input.substring(space2+1);
        String word1low = word1.toLowerCase();
        String word2low = word2.toLowerCase();
        int let1 = word2low.indexOf(word1low.charAt(0));
        int let2 = word2low.indexOf(word1low.charAt(1));
        int let3 = word2low.indexOf(word1low.charAt(2));
        int total = let1 + let2 + let3;
        String totalstr = "" + total;
        String output = "is " + word1 + " and " + word2 + " Anagram? " + totalstr;
        output = output.replace("-1", "No, it is not.");
        output = output.replace("-2", "No, it is not.");
        output = output.replace("-3", "No, it is not.");
        output = output.replace("3", "Yes, it is.");
        output = output.replace("2", "No, it is not.");
        output = output.replace("1", "No, it is not.");
        output = output.replace("0", "No, it is not.");
        System.out.println(output);
    }
}
