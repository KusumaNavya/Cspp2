import java.io.*;
import java.util.*;
class Frequency {
    Frequency() {

    }
    public Hashtable<String, Integer> loadWordstodict (File f)
    throws Exception {
        FileInputStream fileinp = new FileInputStream(f);
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(fileinp));
        String str;
        Hashtable<String, Integer> dictionary = new Hashtable<String, Integer>();
        try {
            int c = 0;
            while ((str = reader.readLine()) != null) {
                String s = str.replaceAll("[^a-z A-Z 0-9 _]", "").toLowerCase();
                String[] line = s.split(" ");
                for (int i = 0; i < line.length; i++) {
                    if (dictionary.containsKey(line[i])) {
                        dictionary.put(line[i], dictionary.get(line[i]) + 1);
                    } else {
                        dictionary.put(line[i], 1);
                    }
                    c++;
                }
            }
        } catch (Exception e) {
            throw new Exception("File not found");
        }
        return dictionary;
    }
}
class Distance {
    Distance() {

    }
    public double Euclidean(Hashtable<String, Integer> dict1) {
        long sum = 0;
        for (Map.Entry<String, Integer> m : dict1.entrySet()) {
            sum += m.getValue() * m.getValue();
        }
        double prod = Math.sqrt(sum);
        return prod;
    }
    public double DotProduct(Hashtable<String, Integer> dict1,
                             Hashtable<String, Integer> dict2) {
        String key;
        int sum = 0;
        for (Map.Entry<String, Integer> m : dict1.entrySet()) {
            key = m.getKey();
            if (dict2.containsKey(key)) {
                int val1 = dict1.get(key);
                int val2 = dict2.get(key);
                sum += (val1 * val2);
            }
        }
        return sum;
    }
    public double similarity(Hashtable<String, Integer> dictionary1,
                             Hashtable<String, Integer> dictionary2) {
        double a = Euclidean(dictionary1);
        double b = Euclidean(dictionary2);
        double num = a * b;
        double deno = DotProduct(dictionary1, dictionary2);
        double result = deno / num;
        result = result * 100;
        return Math.round(result);
    }
}

class Solution {
    Solution () {

    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String foldername = scan.nextLine();
            final File folder = new File(foldername);
            File[] allfiles = folder.listFiles();
            String s = "\t\t";
            for (File fil : allfiles) {
                s += fil.getName() + "\t";
            }
            s += "\n";
            if (allfiles.length != 0) {
                for (File file1 : allfiles) {
                    s += file1.getName() + "\t\t";
                    for (File file2 : allfiles) {
                        Frequency f = new Frequency();
                        Distance d = new Distance();
                        s += d.similarity(f.loadWordstodict(file1), f.loadWordstodict(file2)) + "\t\t";
                    }
                    s += "\n";
                }
                System.out.println(s);
            } else {
                System.out.println("empty directory");
            }
        } else {
            System.out.println("empty directory");
        }
    }
}