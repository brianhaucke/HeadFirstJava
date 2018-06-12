package ChapterFive;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();


        int[] locations = {2,3,4};
        dot.setLocationCells(locations);


        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")){
            testResult = "Passed";
        }
        System.out.println(testResult);



//        for (int x = 0; x <= userGuess.length; x++){
//            String testResult = "failed";
//            String result = dot.checkYourself(userGuess[x]);
//
//            if (result.equals("hit")) {
//                testResult = "passed";
//            }
//
//            System.out.println(testResult);
//
//            //return testResult;
//
//        }


//        String testResult = "failed";

//        if (result.equals("hit")) {
//            testResult = "passed";
//        }

//        System.out.println(testResult);
//        return testResult;
//        return testResult;
    }
}
