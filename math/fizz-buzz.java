class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            //fizzbuzz condition
            if(i%3==0 && i%5==0) {
                answer.add("FizzBuzz");
                //fizz condition
            } else if(i%3==0) {
                answer.add("Fizz");
                //buzz condition
            } else if(i%5==0) {
                answer.add("Buzz");
                //last condition
            } else {
                 answer.add(Integer.toString(i));
            }
        }
        return answer;
    }
}