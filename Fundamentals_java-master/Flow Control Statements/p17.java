class p17 {

    public static void main(String ar[]) {

        int num = Integer.parseInt(ar[0]), reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}