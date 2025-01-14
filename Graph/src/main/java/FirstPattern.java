public class FirstPattern {

    public static void main(String[] args) {

        String name = "geeksForGeeks";
        String pattern = "For";

        int index = name.indexOf(pattern);

        if(index != -1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }



}
