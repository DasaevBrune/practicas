public class BinaryGapII {

    public static int solution(int N){
        int maxGap = 0;
        int currentGap = 0;
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);

        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1'){
                if (currentGap >= maxGap){
                    maxGap = currentGap;
                }
                currentGap = 0;
            }else {
                currentGap +=1;
            }
        }

        return maxGap;
    }

public static void main(String[] args) {
    System.out.println("Max gap is: " + solution(529) );
    }
}
