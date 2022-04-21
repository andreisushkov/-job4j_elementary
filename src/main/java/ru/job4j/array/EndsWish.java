package ru.job4j.array;

public class EndsWish {
    public static boolean endsWish(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
