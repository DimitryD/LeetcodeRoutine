package interview.zalando;

public class Task3 {
    public int solution(String S) {
        // stores the sum of all numbers in S
        int sum = 0;
        for (char c: S.toCharArray())
            sum += c - '0';

        // if number represented by S already divisible by 3 then start from 1
        int combinations = sum % 3 == 0 ? 1 : 0;
        // iterate through each number in S
        for (char number: S.toCharArray()) {
            number -= '0';
            // calculate sum without current number
            int reducedSum = sum - number;
            // iterate through digits (0-9)
            for (int i = 0; i < 10; i++)
                // check if new sum is divisible by 3 then add combination
                // check as well if it's not original number because this combination already counted
                if ((reducedSum + i) % 3 == 0 && number != i)
                    combinations++;

        }
        return combinations;
    }

}
