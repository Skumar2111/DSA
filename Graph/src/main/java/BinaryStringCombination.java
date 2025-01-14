public class BinaryStringCombination {

    public static void main(String[] args) {
        String str = "00100101";

        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)== '1')
            {
                count ++;
            }
        }

        int combination = count * (count - 1) / 2;

        System.out.println(combination);
    }


}
