public class Main {

    public static void main(String[] args) {

        char[] arr = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            int name = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = (char) name;

            System.out.println(arr);
        }
    }
}