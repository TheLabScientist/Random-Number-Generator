# Random Number Generator
This Java project allows you to generate a random sequence of numbers

## How To Use
Simply download the sources and execute it in your favourite IDE

## Code Explanations
Some code justifications so you understand. The class uses an object method `getNumber()` that returns a string of digits, which is the random number. The code should be easy to understand (hopefully). You can ofcourse, modify the code to your liking
### Instance
```
RandomNumber rn = new RandomNumber(12);
```

`12` is the length of the number

### Methods
#### `allowDuplicates(boolean)`
The `allowDuplicates(boolean)` method allows you to set wether a digit should appear only once or more times in a number. Because there are only 10 unique digits, when set to `false`, the length of the number must be 10 or under. Additionally, if the mixing is set to `Mix.EVEN` or `Mix.ODD`, the length of the number must be 5 or under since there are only 5 unique odd and even digits. The class has conditions in place to prevent the script from hanging. When this method is omitted, the default value is `true`

#### `setMixing(enum)`
The `setMixing(enum)` method allows you to generate numbers with only even or odd digits, or both. The method uses an enumeration argument. All values are:

| Arguments  | Description                  |
| ---------- | ---------------------------- |
| `Mix.BOTH` | Mix both even and odd digits |
| `Mix.EVEN` | Mix only even digits         |
| `Mix.ODD`  | Mix only odd digits          |

When this method is omitted, the default value is `Mix.BOTH`

#### `getNumber()`
The `getNumber()` method is an object method that builds and returns the generated number as a string


Made with love by **TheLabScientist (⁠◍⁠•⁠ᴗ⁠•⁠◍⁠)⁠❤**
