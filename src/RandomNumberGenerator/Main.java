package RandomNumberGenerator;

import RandomNumberGenerator.RandomNumber;
import RandomNumberGenerator.RandomNumber.Mix;

public class Main {
    
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber(12);
        rn.allowDuplicates(true);
        rn.setMixing(Mix.BOTH);
								     
        System.out.println(rn.getNumber());
    }
}