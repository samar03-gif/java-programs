class sixteen{
 
    // method to convert binary to decimal
    int binaryToDecimal(long binary)
    {
 
        // variable to store the converted
        // binary number
        int decimalNumber = 0, i = 0;
 
        // loop to extract the digits of the binary
        while (binary > 0) {
 
            // extracting the digits by getting
            // remainder on dividing by 10 and
            // multiplying by increasing integral
            // powers of 2
            decimalNumber
                += Math.pow(2, i++) * (binary % 10);
 
            // updating the binary by eliminating
            // the last digit on division by 10
            binary /= 10;
        }
 
        // returning the decimal number
        return decimalNumber;
    }
 
    // method to convert decimal to hexadecimal
    String decimalToHex(long binary)
    {
        // variable to store the output of the
        // binaryToDecimal() method
        int decimalNumber = binaryToDecimal(binary);
 
        // converting the integer to the desired
        // hex string using toHexString() method
        String hexNumber
            = Integer.toHexString(decimalNumber);
 
        // converting the string to uppercase
        // for uniformity
        hexNumber = hexNumber.toUpperCase();
 
        // returning the final hex string
        return hexNumber;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
        // instantiating the class
        sixteen ob = new sixteen();
 
        long num = 10011110;
       
        // calling and printing the output
        // of decimalToHex() method
        System.out.println("Inputted number : " +num);
        System.out.println(ob.decimalToHex(10011110));
    }
}