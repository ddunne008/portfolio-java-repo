public class PunctuationSentenceCounter {
    public static void main(String[] args) {

        int punctuationCount = 0;
        String phrase;
        char c;
        phrase = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. .";




        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == '!') {
                punctuationCount++;
                if (phrase.charAt(i) == ',') {
                    punctuationCount++;
                    if (phrase.charAt(i) == '.') {
                        punctuationCount++;
                        if (phrase.charAt(i) == '-') {
                            punctuationCount++;
                            if (phrase.charAt(i) == '"') {
                                punctuationCount++;
                            }
                        }
                    }
                }

            }

            System.out.println("The total amount of punctuation in the Phrase is " + punctuationCount);

        }


        }


    }


