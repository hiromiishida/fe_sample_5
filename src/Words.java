public class Words {
     String[] word = new String[]{
            "importance",
            "inflation",
            "information",
            "innovation"
    };

    int freq(String str){
        int num = 0;

        for(String w: word) {
            num += (w.length() - w.replace(str, "").length()) / str.length();
        }

        return num;
    }

    int freqE(String str){
        int num = 0;

        for(String w: word){
            if(w.endsWith(str)){
                num++;
            }
        }
        return num;
    }
}