/* Random Number Generator - Copyright © TheLabScientist 2024
 * With this script, you can easily generate numbers for whatever
 * needs be
 */

package RandomNumberGenerator;

import RandomNumberGenerator.RandomNumber;
import RandomNumberGenerator.RandomNumber.Mix;

public class Main {
    
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber(12);
        rn.allowDuplicates(true); // Can be omitted
        rn.setMixing(Mix.BOTH); // Mix.BOTH | Mix.EVEN | Mix.ODD
								    
        System.out.println(rn.getNumber());
								 }
}