When making a program you need to decide on the nouns, i.e. the variables that will hold state.  You also need to think about the verbs, or the things that will give live to your program.

 Use good objected oriented design tradecraft when designing your object.  
  - Think about the constructor and the value/s that should be passed in.  
  - Think about the getter methods you will want, sevearl getTheAction(); methods should exist.
  - Think about return types and don't cross up int's and double's.
  - Make sure you have a toString so you can see what is going on with your progam.
  - Speed to code and ensuring program correctness is very important, this is where maven comes in.

 For this program you need to think about a few things.

 You will want to init a logger in your programing for helping with debugging as a member variable.

     private Logger logger = Logger.getLogger(getClass().getName());

 it can be used as

     logger.info("My message here");

 Arrays can be initilizied straightaway at declartion time.

     int listOfInts[] = {3, 2, 1};
     Arrays.sort(listOfInts);

 Array lengths can be gotten with:

    listOfInts.length;

 For loops are also important, there are two styles to think about:

     for(int c = 0; c < listOfInts.length; c++)
     {
         logger.info(listOfInts[c])
     }

 and

     for(int i: listOfInts)
     {
         logger.info(i);
     }



 Every Object should have one, well except test cases, but we will cover that in a bit.

 Example toString()

     public String toString(){
         StringBuffer stringBuffer = new StringBuffer();

         stringBuffer.append("This is an output line");
         stringBuffer.append(System.lineSeparator());

         return stringBuffer.toString();
     }

 When programming it can be helpful to use a low fidelity tool like Google Sheets, Excel, Numbers, etc to model the mathematics so you know where you are trying to go.

 | Row  | Number | Number | Number | 
 | :---- | :----- | :----- | :----- |
 | 1 | 98     | 98     | You will want to add rows 5 and 6 when you model this
 | 2 | 97     | 87
 | 3 | 95     | 95
 | 4 |        | 100
 | etc.   |
 | etc.   |
 | Goals   |
 | Sum   | 280| etc.   |etc.   |
 | Average | etc.   |etc.   |
 | Median |etc.   |etc.   |
 |Variance|etc.   |etc.   |
 |Standard Deiation|etc.   |etc.   |
