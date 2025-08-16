public class SqueakyClean {
    public static String clean(String identifier) {
        StringBuilder cleanedId = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);

            if (currentChar == '-' && i > 0) { 
                capitalizeNext = true;
            } else if (Character.isWhitespace(currentChar)) {
                cleanedId.append('_');
            } else if (capitalizeNext) {
                if (Character.isLetter(currentChar)) {
                    cleanedId.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                }
            } else {
                switch (currentChar) {
                    case '4':
                        cleanedId.append('a');
                        break;
                    case '3':
                        cleanedId.append('e');
                        break;
                    case '0':
                        cleanedId.append('o');
                        break;
                    case '1':
                        cleanedId.append('l');
                        break;
                    case '7':
                        cleanedId.append('t');
                        break;
                    default:
                        if (Character.isLetter(currentChar)) {
                            cleanedId.append(currentChar);
                        }
                        break;
                }
            }
        }
        return cleanedId.toString();
    }
}