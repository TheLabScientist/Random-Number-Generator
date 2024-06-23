package RandomNumberGenerator;

public class RandomNumber {
    enum Mix {
        BOTH,
        EVEN,
        ODD
    }
    
    Mix mix = Mix.BOTH;
    
    int length;
    boolean allowDuplicates = true;
    
    public RandomNumber(int length) { // Constructor
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be larger than 0");
        }
    }
    
    // Allow duplicates method
    public void allowDuplicates(boolean value) {
        allowDuplicates = value;
    }
    
    // Set mixing method
    public void setMixing(Mix value) {
        switch (value) {
            case BOTH:
                mix = Mix.BOTH;
            break;
            
            case EVEN:
                mix = Mix.EVEN;
            break;
            
            case ODD:
                mix = Mix.ODD;
            break;
        }
    }
    
    // Get number method
    public Object getNumber() {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        boolean errorFound = false;
        String number = "";
        
        
        while (number.length() < this.length && !errorFound) { // Keep adding digits until desired length is reached. Stop when error found
            String randomDigit = Character.toString(digits[0 + (int)(Math.random() * ((9 - 0) + 1))]); // Get random digit from char array
            
            if (allowDuplicates) {
                switch (mix) {
                    case BOTH:
                        number += randomDigit;
                    break;
            
                    case EVEN:
                        // Check if the digit is divisible by 2 without a remainder. If it is, then it's even
                        if (Integer.parseInt(randomDigit) % 2 == 0) { 
                            number += randomDigit;
                        }
                    break;
            
                    case ODD:
                        if (Integer.parseInt(randomDigit) % 2 > 0) { 
                            number += randomDigit;
                        }
                    break;
                }
            } else {
                /* To prevent the script from hanging,
                 * we must prevent the loop from adding digits
                 * if there are not enough unique digits to added
                 */
                if (this.length <= 10) {
                    if (!number.contains(randomDigit)) {
                        switch (mix) {
                            case BOTH:
                                number += randomDigit;
                            break;
            
                            case EVEN:
                                if (this.length <= 5) {
                                    if (Integer.parseInt(randomDigit) % 2 == 0) { 
                                        number += randomDigit;
                                    }
                                } else {
                                    errorFound = true; // Needed because the break; statement would only break the case
                                    System.out.println("Error: Desired number length is greater than unique even digits");
                                }
                            break;
            
                            case ODD:
                                if (this.length <= 5) {
                                    if (Integer.parseInt(randomDigit) % 2 > 0) { 
                                        number += randomDigit;
                                    }
                                } else {
                                    errorFound = true;
                                    System.out.println("Error: Desired number length is greater than unique odd digits");
                                }
                            break;
                        }
                    }
                } else {
                    System.out.println("Error: Desired number length is greater than unique digits");
                    break;
                }
            }
        }
        
        return number;
    }
}