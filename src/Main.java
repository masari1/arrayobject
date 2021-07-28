public class Main {

        public static void main (String [] argsStrings){


            int [] numbers = new int [3];
            char [] characters = new char[4];
            String [] strings = new String [5];



           //Food [] schrank = new Food[3];





           Food food1 = new Food("pizza");
           Food food2 = new Food("hamburger");
           Food food3 = new Food("hotdog");

           Food [] schrank = {food1,food2,food3};

           
          // schrank[0] = food1;
           //schrank[1] = food2;
          // schrank[2] = food3;

        System.out.println(schrank[0].name);






















        }
}


