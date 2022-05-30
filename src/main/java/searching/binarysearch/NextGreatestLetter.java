package searching.binarysearch;

public class NextGreatestLetter {

    public static void main(String[] args) {

        NextGreatestLetter ngl = new NextGreatestLetter();
        char[] letters = {'c', 'f', 'j'};

        char result = ngl.nextGreatestLetter(letters, 'g');
        System.out.println(result);
    }

    public char nextGreatestLetter(char[] letters, char target) {

        int n = letters.length;

        int start = 0;
        int end = n-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % n];

    }
}
