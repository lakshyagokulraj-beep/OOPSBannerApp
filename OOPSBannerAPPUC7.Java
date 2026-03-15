public class OOPSBannerAppUC7 {

    public static void main(String[] args) {

        String input = "OOPS";
        StringBuilder[] output = new StringBuilder[5];

      
        for (int i = 0; i < 5; i++) {
            output[i] = new StringBuilder();
        }

    
        for (char ch : input.toCharArray()) {
            CharacterPatternMap pattern = CharacterPatternMap.getPattern(ch);

            if (pattern != null) {
                String[] rows = pattern.getPattern();

                for (int i = 0; i < rows.length; i++) {
                    output[i].append(rows[i]).append("  ");
                }
            }
        }

      
        for (StringBuilder row : output) {
            System.out.println(row);
        }
    }

    
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        
        public static CharacterPatternMap getPattern(char ch) {

            switch (Character.toUpperCase(ch)) {

                case 'O':
                    return new CharacterPatternMap('O', new String[]{
                            " *** ",
                            "*   *",
                            "*   *",
                            "*   *",
                            " *** "
                    });

                case 'P':
                    return new CharacterPatternMap('P', new String[]{
                            "**** ",
                            "*   *",
                            "**** ",
                            "*    ",
                            "*    "
                    });

                case 'S':
                    return new CharacterPatternMap('S', new String[]{
                            " ****",
                            "*    ",
                            " *** ",
                            "    *",
                            "**** "
                    });

                default:
                    return null;
            }
        }
    }
}
