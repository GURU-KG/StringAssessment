public class ReverseLine {
    public static void main(String[] args) {
        String str="   I Love    Java Programming";
        String res = str.trim();
        String words[]= res.split(" ");
        int first=0;
        int last = words.length-1;
        while(first <= last) {
            String temp = words[first];
            words[first] = words[last];
            words[last] = temp;
            first++;
            last--;
        }
        String solution = String.join(" ",words);
        System.out.println(solution);
    }
}
