class Test {
  public static void main(String[] args) {

    // This is a comment
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is probably not going to be awesome!");
    
    // This is a comment
    System.out.println(3);
    System.out.println(358);
    System.out.println(50000);

    /*This is a comment that can go
      over umltiple lines as
      is being shown
    */

    System.out.println(3 + 3);
     
    String name = "John";
    System.out.println(name);

    int myNum = 15;
    System.out.println(myNum);

    // How to declare a variable then assign it a value later
    int myNum1;
    myNum1 = 15;
    System.out.println(myNum1);

    int myNum2 = 15;
    myNum2 = 20;  // myNum is now 20
    System.out.println(myNum2);


    // How to concatinate 
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;

    System.out.println(myFloatNum + " " + myLetter);


    // How to add to a number
    int x = 10;
    x += 5;
    System.out.println(x);



    String txt = "AbcdeFGHIJKlmnopQRSTuvwXYZ";
    System.out.println(txt.length());

    System.out.println(txt.toUpperCase());   // Outputs "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    System.out.println(txt.toLowerCase());   // Outputs "abcdefghijklmnopqrstuvwxyz"


    // More contatination
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));

    // Java Maths

    int wenis1 = Math.max(5, 10);
    System.out.println(wenis1);

    int wenis2 = Math.min(5, 10);
    System.out.println(wenis2);

    double wenis3 = Math.sqrt(64);
    System.out.println(wenis3);

    double wenis4 = Math.abs(-4.7);
    System.out.println(wenis4);

    // Math.random();

    int randomNum = (int)(Math.random() * 101);  // 0 to 100

    System.out.println(randomNum);

    int y = 10;
    int z = 9;
    System.out.println(y > z); // returns true, because 10 is higher than 9



    int myAge = 25;
    int votingAge = 18;

    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote.");
    }
  

    int time1 = 22;
    if (time1 < 10) {
      System.out.println("Good morning.");
    } else if (time1 < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    
    int time2 = 10;
    String result = (time2 < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }


    int p = 0;
    do {
      System.out.println(p);
      p++;
    }
    while (p < 5);



      for (int o = 0; o < 5; o++) {
        System.out.println(o);
      }

      // Outer loop
    for (int r = 1; r <= 2; r++) {
      System.out.println("Outer: " + r); // Executes 2 times
      
      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
    } 


    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String h : cars) {
      System.out.println(h);
    }


    for (int l = 0; l < 10; l++) {
      if (l == 4) {
        continue;
      }
      System.out.println(i);
    }

    int[] myArrayOfNum = {10, 20, 30, 40};
    System.out.println(myArrayOfNum[2]);


    int[][] myBumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myBumbers[1][2]); // Outputs 7





  }
}

