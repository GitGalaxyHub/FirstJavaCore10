package modul4;


import java.util.Arrays;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        for (int i = 0; i < stocks.length; i++) {
            String count = stocks[i];
            String[] str = count.split(" ");
            int g = Integer.parseInt(str[1]);
            if (g<200){
                return Arrays.toString(str);
            }


        }
        return null;
    }
}
