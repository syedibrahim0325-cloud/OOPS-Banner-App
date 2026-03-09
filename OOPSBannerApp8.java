public class OOPSBannerApp8 {

    // Inner class
    static class CharacterPatternMap {

        Character character;
        String[] pattern;

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public Character getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to create pattern maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
"      ******      ", 
"    **      **    ",  
"  **          **  ",
"  **          **  ",  
"  **          **  ", 
"  **          **  ",  
"  **          **  ",  
"    **      **    ", 
"      ******      ",
               
        };

        String[] P = {
"  ********      ",   
"  **      **    ",  
"  **        **  ",
"  **      **    ",  
"  ** ******     ",  
"  **            ",  
"  **            ",
"  **            ",  
"  **            ",        
        };

        String[] S = {
"     ******      ",
"   **            ",
"  **             ",
"    **           ",
"      ****       ",
"           **    ",
"            **   ",
"          **     ",
"    ******       ",
        };

        String[] space = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', O);
        maps[1] = new CharacterPatternMap('P', P);
        maps[2] = new CharacterPatternMap('S', S);
        maps[3] = new CharacterPatternMap(' ', space);

        return maps;
    }

    // Method to get pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // return space pattern if not found
        return charMaps[3].getPattern();
    }

    // Method to print banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 9;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}