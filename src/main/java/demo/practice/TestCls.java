package demo.practice;

public class TestCls {
    public static void main(String[] args) {
        String input = "dsf1323fsd^37@#@";
        int alphabets=0;
        int didgtCount=0;
        int splCharCOunt=0;
        for(Character ch:input.toCharArray()){
            if(Character.isDigit(ch)){
                didgtCount++;
            }else if(Character.isAlphabetic(ch)){
                alphabets++;
            }else{
                splCharCOunt++;
            }
        }
        System.out.println("alphabets : "+alphabets);
        System.out.println("didgtCount : "+didgtCount);
        System.out.println("splCharCOunt : "+splCharCOunt);
    }
}
