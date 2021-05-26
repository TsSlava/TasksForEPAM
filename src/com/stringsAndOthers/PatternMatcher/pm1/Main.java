package com.stringsAndOthers.PatternMatcher.pm1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static void sentencesByLong(String string) {
        Pattern pattern = Pattern.compile("[.]");
        String[] sentenсes = pattern.split(string);
        Pattern pattern2 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        for (String sentence : sentenсes) {
            String[] words = pattern2.split(sentence);
            String string3 = "";
            boolean isSorted = true;
            while (isSorted) {
                isSorted = false;
                for (int i = 1; i < words.length; i++) {
                    if (words[i].length() < words[i - 1].length()) {
                        String tmp = words[i];
                        words[i] = words[i - 1];
                        words[i - 1] = tmp;
                        isSorted = true;
                    }
                }

            }

            for (String word : words) {
                string3 += word + " ";
            }

            System.out.println(string3);
        }

    }

    public static void sortedByParagraphs(String string) {

        String[] slices = string.split("\t");
        int[] nums = new int[slices.length];
        for (int i = 0; i < slices.length; i++) {
            nums[i] = slices[i].split("[.!?]").length;
        }

        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = tmp;
                    isSorted = true;
                }
            }
        }

        int no = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < slices.length; j++) {
                if (nums[i] == slices[j].split("[.!?]").length && no != j) {
                    no = j;
                    System.out.println(slices[j]);
                    break;
                }
            }
        }

    }

    public static void sortedByLexeme(String string, String symbolOut) {
        Pattern pattern = Pattern.compile("[.]");
        String[] sentenсes = pattern.split(string);
        Pattern pattern2 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String symbol = symbolOut;
        Pattern pattern3 = Pattern.compile(symbol);
        for (String sentence : sentenсes) {
            String[] words = pattern2.split(sentence);
            int[] numsSorted = new int[words.length];
            int[] nums = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                int count = 0;
                Matcher matcher = pattern3.matcher(words[i]);
                while (matcher.find()) {
                    count++;
                }
                nums[i] = count;
                numsSorted[i] = count;
            }

            boolean isSorted = true;
            while (isSorted) {
                isSorted = false;
                for (int i = 1; i < numsSorted.length; i++) {
                    if (numsSorted[i] > numsSorted[i - 1]) {
                        int tmp = numsSorted[i];
                        numsSorted[i] = numsSorted[i - 1];
                        numsSorted[i - 1] = tmp;
                        isSorted = true;
                    }
                }
            }

            System.out.println("Исходное предложение: ");
            for (String word : words) {
                System.out.print(word + " ");
            }

            System.out.println();
            System.out.println();
            System.out.println("Отсортированные по алфавиту слова:");


            int no = 0;
            String[] wordsAlphabetical = new String[words.length];
            for (int i = 0; i < numsSorted.length; i++) {
                if (numsSorted[i] == 0) {
                    break;
                }
                for (int j = no; j < nums.length; j++) {
                    if (numsSorted[i] == nums[j]) {
                        no = j + 1;
                        wordsAlphabetical[i] = words[j];
                        if (numsSorted[i] != numsSorted[i + 1]) {
                            no = 0;
                        }
                        break;
                    }
                }

            }

            int start = 0;
            int count;
            int noJ = 0;
            int indexNum = 0;
            for (int i = noJ; i < numsSorted.length; i = noJ) {
                count = 0;
                if (numsSorted[i] == 0) {
                    break;
                }
                indexNum = numsSorted[i];
                noJ++;
                if (numsSorted[i] != numsSorted[i + 1]) {
                    System.out.println(wordsAlphabetical[i]);
                }
                if (numsSorted[i] == numsSorted[i + 1]) {
                    for (int j = i; j < numsSorted.length; j++) {

                        if (numsSorted[j] == 0) {
                            break;
                        }
                        if (numsSorted[j] == indexNum) {
                            start = i;
                            count++;
                            noJ = j + 1;
                        }
                    }

                    String[] array = new String[count];
                    for (int j = 0; j < array.length; j++) {
                        array[j] = wordsAlphabetical[start];
                        start++;
                    }
                    String st = null;
                    for (int k = 0; k < array.length; k++) {
                        for (int j = 0; j < array.length; j++) {
                            if (isGreaterThen(array[j], array[k])) {
                                st = array[k];
                                array[k] = array[j];
                                array[j] = st;
                            }
                        }
                    }

                    for (String x : array) {
                        System.out.println(x);
                    }
                }


            }

            System.out.println();
            System.out.println();
        }
    }

    public static String lexeme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ для сортировки");
        String symbol = scanner.next();
        String symbolEnd = "[" + symbol + "]";
        return symbolEnd;
    }


    public static void main(String[] args) {
        String string = "\tГерманская война, как известно, началась двадцать три года назад. То есть, когда она началась, \nто до Пушкина было не сто лет, а всего семьдесят семь (2).\n" +
                "\tА я родился, представьте себе, в 1879 году. Стало быть, был еще ближе к великому поэту. Не то \nчтобы я мог его видеть, но, как говорится, нас отделяло всего около сорока лет (3).\n" +
                "\tМоя же бабушка, еще того чище, родилась в 1836 году. То есть Пушкин мог ее видеть и даже брать \nна руки. Он мог ее нянчить, и она могла, чего доброго, плакать на руках, не предполагая, кто ее взял \nна ручки (3).\n" +
                "\tКонечно, вряд ли Пушкин мог ее нянчить, тем более что она жила в Калуге, а Пушкин, кажется, там \nне бывал, но можно допустить эту волнующую возможность, тем более что он мог бы, кажется, \nзаехать в Калугу повидать своих знакомых(1).\n" +
                "\tМой отец, опять-таки, родился в 1850 году. Но Пушкина тогда уже, к сожалению, не было, а то он, \nможет быть, даже и моего отца мог бы нянчить (2).\n";
        System.out.println("Исходная строка: ");
        System.out.println();
        System.out.println(string);
        System.out.println();
        System.out.println("Выберите действия над строкой:\n1 - Отсортировать абзацы по количеству предложений\n2 - Каждое предложение отсортировать по длине слова\n3 - Отсортировать лексемы по убыванию количества заданного символа\nВведите цифру:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case (1):
                sortedByParagraphs(string);
                break;
            case (2):
                sentencesByLong(string);
                break;
            case (3):
                sortedByLexeme(string, lexeme());
                break;
        }
    }
}
