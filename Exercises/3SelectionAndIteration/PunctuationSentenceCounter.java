public class PunctuationSentenceCounter {
    public static void main(String[] args) {

        int punctuationCount = 0;
        String phrase;
        phrase = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. .";




        for (int c = 0; c < phrase.length(); c++) {
            if (phrase.charAt(c) == '!' || c == ',' || c == '.' || c == '!' || c == '-' || c == '_') {
                punctuationCount++;

            }

            System.out.println("The total amount of punctuation in the Phrase is " + punctuationCount);

        }


        }


    }


