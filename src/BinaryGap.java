import java.util.Arrays;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(529));

    }

    public static int solution(int N) {
        String binario=Integer.toBinaryString(N);
        String[] gasps =binario.split("1");
        String[] validGasps;
        int count = binario.length() - binario.replaceAll("1","").length();
        if(count==gasps.length-1)
            validGasps= Arrays.copyOf(gasps, gasps.length-1);
        else
            validGasps=gasps;
        int maxGasp=0;
        for (String gasp: validGasps) {
            if(gasp.length()>maxGasp)
                maxGasp=gasp.length();
        }
        return maxGasp;
    }
}
