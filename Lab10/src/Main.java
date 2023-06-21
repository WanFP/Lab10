public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Ejercicio 1
    public static int diagonalDifference(List<List<Integer>> arr) {

        int primeraSuma = 0;
        int segundaSuma = 0;

        for(int i=0; i<arr.size(); i++){
            List<Integer> fila = arr.get(i);
            primeraSuma += fila.get(i);
            segundaSuma += fila.get(arr.size()-i-1);

        }
        return Math.abs(primeraSuma-segundaSuma);
    }

    //Ejercicio 2
    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for(int i=0; i<arr.size(); i++){

            if(arr.get(i)>0){
                positive++;
            }else if(arr.get(i)<0){
                negative++;
            }else
                zero++;
        }

        System.out.println(String.format("%.6f",(double)(positive/arr.size()))+"\n"+String.format("%.6f",(double)(negative/arr.size()))+"\n"+String.format("%.6f",(double)(zero/arr.size())));
    }


    //Ejercicio 3
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHgtCandle = candles.get(0);
        int count = 0;

        for(int candleHgt: candles){
            if (candleHgt>maxHgtCandle){
                maxHgtCandle = candleHgt;
                count = 1;
            }else if(candleHgt == maxHgtCandle){
                count++;
            }
        }
        return count;
    }

    //Ejercicio 4
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        while (!arr.isEmpty()){
            result.add(arr.size());
            int smallStick = Collections.min(arr);

            List<Integer> newSticks = new ArrayList<>();
            for(int stick: arr){
                int cut = stick - smallStick;
                if(cut>0){
                    newSticks.add(cut);

                }
            }
            arr =newSticks;

        }
        return result;
    }
}