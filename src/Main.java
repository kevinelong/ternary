public class Main {
    public static void main(String[] args) {

        boolean isDiabetic = false;
        boolean isHungry = true;

        //THE LONG WAY
        String message = "";

        if(!isDiabetic && isHungry){
            message = "Eat the cake.";
        }else{
            message = "Don't eat the cake.";
        }

        System.out.println(message);

        //Ternary if/else in one line
        // result = expression ? "im true" : "im not true";
        System.out.println(!isDiabetic && isHungry ? "Eat the cake." : "Don't eat the cake.");
    }
}