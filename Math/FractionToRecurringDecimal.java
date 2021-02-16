/**

166. Fraction to Recurring Decimal
Medium

Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

If multiple answers are possible, return any of them.

It is guaranteed that the length of the answer string is less than 104 for all the given inputs.

 

Example 1:

Input: numerator = 1, denominator = 2
Output: "0.5"


**/


class Solution {
    
    
     private StringBuilder sb;
    private int indexAfterDeicmalDot;
    
    // key - remainder , value -> the index in the StrinbBuilder where it happened
    private Map<Long, Integer> repeatingRemainders;
    public String fractionToDecimal(int numerator, int denominator) {
        
        if (numerator == 0) {
            return "0";
        }
        
        sb = new StringBuilder();
        repeatingRemainders = new HashMap<>();
        fractionToDecimal(false, (long)numerator, (long)denominator);
        return sb.toString();
    }
    
    private void fractionToDecimal(boolean hasDecimalPoint, long numerator, long denominator) {
        
        // It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
        
        // this means that the number for example is not pi , as pi does not converge
        // this means that at a certain point there will be no remainder
        
        if (numerator < 0L || denominator < 0L) {
            if (numerator > 0L || denominator > 0L) {
                sb.insert(0, "-");
                fractionToDecimal(hasDecimalPoint, Math.abs(numerator), Math.abs(denominator));
                return;
            }
        }
        
        
        long divResult = numerator / denominator;
        long mul = divResult * denominator;
        long remainder = numerator - mul;
      
        if (remainder != 0 && repeatingRemainders.containsKey(remainder)) {
            // for example with 1/6 you will see the repeating remainder is 4
            // but this comes after you already have 1.1 in the string builder
            // this is why we need to keep the indexes of where the repatition started
            // and cannot juse just a set to indicate that the repetition has occurred
            int index = repeatingRemainders.get(remainder);
            sb.insert(index, "(");
            sb.append(divResult);
            sb.append(")");
            return;
        }
        if (numerator == 0) {
            return;
        }
        
        sb.append(divResult);
        if (remainder == 0) {
            return; 
        }
       
        if (indexAfterDeicmalDot > 0) {
            repeatingRemainders.put(remainder, sb.length());
        }
        if (!hasDecimalPoint) {
            sb.append(".");
            indexAfterDeicmalDot = sb.length();
            hasDecimalPoint = true;
        }
        fractionToDecimal(hasDecimalPoint, (numerator - mul) * 10, denominator);
    }
}
