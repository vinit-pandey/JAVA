class p18 {

    public static void main(String ar[]) {

        int num = Integer.parseInt(ar[0]), reversed = 0, remainder, original;

        original = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num  /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}