import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/"); // 1.  The problem here is that the "." are not being replaced by "/" by editining the the regex to "\\.", we solve this problem and the "." replace the "."



        Random random = new Random();
        StringBuffer word = null;


        switch (random.nextInt(2)) {        // 3. if the bound is only 2 it will only take the case 0 and 1 and ignore case 2 so we need to add the bound to 3
            case 0:
                word = new StringBuffer("Y");
            case 1:
                word = new StringBuffer("F");
            case 2:
                word = new StringBuffer("T")  //2. the Y, F and I are chars and can not be added to a string so we need to convert them to strings.
        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
