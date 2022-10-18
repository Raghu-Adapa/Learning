
class Main {

    public static void main(String[] args) {
        System.out.println("Hello !");


        /*

    A = 1;
    B=  3;

     * input arr = { 0 6 4 3 2 2 4 0 3 1}
          output = { A B B B b A B A B A}


     * */


     /*

     * input arr = { 0 4,3, 2 1 1 2 4 0 3 1}
          output = { A B B, B
     * */



        /*int[] req= {0,4,6,4,1,1,2,4,0,3,1};
        for (int i = 0; i < req.length; i++) {
            if (req[i] >= arr[mid]) {
                System.out.println(req[i] + "-" + "B");
            } else if (req[i] <= arr[mid]) {
                System.out.println(req[i] + "-" + "A");
            }



        }
*/

        int[] req= {0,6,4,1,1,2,4,0,3,1};
        int midFloor=0+(req.length-1-0)/2;
        for (int i = 0; i < req.length; i++) {
            if (req[i] >= midFloor) {
                System.out.println(req[i] + "-" + "B");
            } else if (req[i] <= midFloor) {
                System.out.println(req[i] + "-" + "A");
            }
        }

    }


}