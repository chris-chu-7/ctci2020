/**

 * // This is the Master's API interface.

 * // You should not implement it, or speculate about its implementation

 * interface Master {

 *     public int guess(String word) {}

 * }

 */

class Solution {

  public void findSecretWord(String[] wordlist, Master master) {

        for (int i = 0, x = 0; i < 10 && x < 6; ++i) {

            System.out.println("i: " + i + " wordlist: " + Arrays.toString(wordlist));

            HashMap<String, Integer> count = new HashMap<>();

            for (String w1 : wordlist)

                for (String w2 : wordlist)

                    if (match(w1, w2) == 0)

                        count.put(w1, count.getOrDefault(w1 , 0) + 1);

            String guess = "";

            int min0 = 100;

            for (String w : wordlist){

                System.out.println("Word: " + w);

                System.out.println("Count: " + count.getOrDefault(w, 0));

                if (count.getOrDefault(w, 0) <= min0) {

                    guess = w;

                    min0 = count.getOrDefault(w, 0);

                }

            }

            System.out.println("Guess: " + guess) ;

            System.out.println("Minimum number of Zeros: " + min0);

            x = master.guess(guess);

            System.out.println("Master guess: " + x);

            List<String> wordlist2 = new ArrayList<String>();

            for (String w : wordlist){

                System.out.println("Word: " + w + " # matches: " + match(guess, w));

               if (match(guess, w) == x){

                    wordlist2.add(w); 

               }

            }

                

            wordlist = wordlist2.toArray(new String[0]);

            System.out.println("new wordlist: " + Arrays.toString(wordlist));

        }

    }

    

     public int match(String a, String b) {

        int matches = 0;

        for (int i = 0; i < a.length(); ++i)

            if (a.charAt(i) == b.charAt(i))

                matches ++;

        return matches;

    }    

}