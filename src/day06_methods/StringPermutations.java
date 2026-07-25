package day06_methods;

public class StringPermutations {

    public void permutation(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String remaining = str.substring(0, i) + str.substring(i + 1);

            permutation(remaining, result + current);
        }
    }

    public static void main(String[] args) {

        StringPermutations obj = new StringPermutations();

        obj.permutation("ABC", "");  //obj.permutation("123", "");
    }
}

/*OUTPUT
* ABC
ACB
BAC
BCA
CAB
CBA
* */