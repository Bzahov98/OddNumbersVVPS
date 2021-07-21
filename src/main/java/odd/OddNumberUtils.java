package odd;

import odd.exeption.InvalidParameterException;

/**
 * Class for calculation of the sum of all Odd Numbers in the interval
 */
public class OddNumberUtils {

    /**
     * @param start start value in interval of { 0 / infinity }
     * @param end   end value in interval: { start / infinity }
     *              bigger than @start
     * @return returning sum of all on numbers in the interval of { start / end } values
     * @throws InvalidParameterException when start and end values are in wrong intervals
     */
    static int sumOddNumbers(int start, int end) throws InvalidParameterException {

        if (start < 0 || start > end) {
            // throws InvalidParameterException when input parameters are invalid
            throw new InvalidParameterException();
        }

        int result = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                result += i;
                //System.out.print(i + " result: " + result + "\n");
            }
        }
        return result;
    }
}
