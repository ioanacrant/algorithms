import java.util.*;
import java.io.*;

public class twosum{
    public static boolean[] checkHash(Hashtable<Long,Hashtable<Integer, Long>> bighash, long minLower, long maxLower, boolean[] sumtrues){
        for (long lower = minLower;lower<=maxLower;lower++){
            if (bighash.containsKey(lower)){
                Hashtable<Integer,Long> innerHash = bighash.get(lower);
                for (int innerHashIndex = 0; innerHashIndex<innerHash.size(); innerHashIndex++){
                    long a = innerHash.get(innerHashIndex);


                    for (int offset = -1 ; offset<=1 ; offset++){
                        if (bighash.containsKey(lower+offset)){
                            Hashtable<Integer,Long> offsetHash = bighash.get(lower+offset);
                            for (int secondInnerHashIndex = 0; secondInnerHashIndex<offsetHash.size(); secondInnerHashIndex++){
                                long b = offsetHash.get(secondInnerHashIndex);
                                if ((int)a+(int)b+10000 <=20000 && (int)a+(int)b+10000>=0){
                                    if (a!=b){
                                        sumtrues[(int)a+(int)b+10000]=true;
                                    }

                                }

                            }
                        }
                        if (bighash.containsKey(lower*-1+offset)){
                            Hashtable<Integer,Long> offsetHash = bighash.get(lower*-1+offset);
                            for (int secondInnerHashIndex = 0; secondInnerHashIndex<offsetHash.size(); secondInnerHashIndex++){
                                long b = offsetHash.get(secondInnerHashIndex);
                                if ((int)a+(int)b+10000 <=20000 && (int)a+(int)b+10000>=0){
                                    if (a!=b){
                                        sumtrues[(int)a+(int)b+10000]=true;

                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        return sumtrues;
    }
    public static void main(String[] args) throws IOException{
        Scanner inf = new Scanner(new BufferedReader(new FileReader("coursera/twosum.txt")));

        Hashtable<Long,Hashtable<Integer, Long>> bighash = new Hashtable<Long,Hashtable<Integer, Long>>();
        int count = 0;
        long minLower = 0;
        long maxLower = 0;
        while (inf.hasNextLine()){
            long num = Long.parseLong(inf.nextLine());
            long lowerBound = num/10000;
            if (lowerBound>maxLower){
                maxLower = lowerBound;
            }
            if (lowerBound<minLower){
                minLower = lowerBound;
            }
            if (bighash.containsKey(lowerBound)){
                Hashtable<Integer, Long> innerHash = bighash.get(lowerBound);
                innerHash.put(innerHash.size(), num);
            }
            else{
                Hashtable<Integer, Long> newInnerHash = new Hashtable<Integer, Long>();
                newInnerHash.put(newInnerHash.size(), num);
                bighash.put(lowerBound, newInnerHash);
            }

        }
        int n = 10000;
        int sumcount = 0;
        boolean[] sumtrues = new boolean[20001];
        for (boolean h: sumtrues){
            h=false;
        }

        checkHash(bighash, minLower, maxLower, sumtrues);

        int totcount=0;
        // System.out.print(bighash.toString());
        System.out.print(Arrays.toString(sumtrues));
        for (boolean war:sumtrues){
            if (war ==true ){
                totcount++;
            }
        }
        System.out.print(totcount);
    }
}
