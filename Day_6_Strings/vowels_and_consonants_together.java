

class vowels_and_consonants_together {
    public static void main(String[] args) {
        String str = "java program";
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                // Check if vowel
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels += ch;
                } else {
                    consonants += ch;
                }
            }
        }

        System.out.println("Vowels word: " + vowels);
        System.out.println("Consonants word: " + consonants);
    }
}
