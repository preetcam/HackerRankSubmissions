package com.practice.javarevisited;
import java.util.Scanner;
//We consider a word, , to be beautiful if the following two conditions are satisfied:
//
//        No two consecutive characters are the same.
//        No two consecutive characters are in the following vowel set: a, e, i, o, u, y. Note that we consider y to be a vowel in this challenge.
// 
// Print Yes if beautiful , No if not beautiful
public class StringsBeautiful {

    static boolean isBeautiful;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        char ch[]= w.toCharArray();

        //   # Print 'Yes' if the word is beautiful or 'No' if it is not.

        for(int i=0; i< ch.length-1; i++){
            if(  (ch[i] == ch[i+1]) || (( ch[i] =='a'||ch[i] =='e'||ch[i] =='i'||ch[i] =='o'||ch[i] =='u'||ch[i] =='A'||ch[i] =='A'||ch[i] =='I'||ch[i] =='O'||ch[i] =='U'||ch[i] =='Y'||ch[i] =='y' ) && ( ch[i+1] =='a'||ch[i+1] =='e'||ch[i+1] =='i'||ch[i+1] =='o'||ch[i+1] =='u'||ch[i+1] =='A'||ch[i+1] =='A'||ch[i+1] =='I'||ch[i+1] =='O'||ch[i+1] =='U'||ch[i+1] =='Y'||ch[i+1] =='y' )))
            { isBeautiful = false;break;}
            else{ isBeautiful = true;}
        }
        if(isBeautiful){System.out.println("Yes");}else{System.out.println("No");}
    }

}
