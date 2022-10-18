public class CustomList {


    String[] arr;

    static int size = 0;

    CustomList(){

        arr = new String[10];

    }

    CustomList(int initialCapacity){

        arr = new String[initialCapacity];

    }

    void add(String newElement){

        if(size< arr.length){

            arr[size] = newElement;
            size++;

        }
        if(size == arr.length){

            // create new Array
            increaseArraySize();
        }


    }

    int getIndexOf(String element){

        for(int i=0;i<arr.length;i++){

            if(arr[i].equals(element)){
                return i;
            }

        }
        return -1;
    }

    void remove(String removeElement){

        int index = getIndexOf(removeElement);

        if(index!=-1){

            for(int i=index; i<size;i++){

                arr[i]= arr[i+1];
            }
            --size;

        }else{
            System.out.println("Element not found !");
        }



    }

    String get(int index){

            return arr[index];

    }


    void increaseArraySize(){

        int n = arr.length;

        String[] tmp = new String[n*2];

        for(int i=0;i<arr.length;i++){

            tmp[i] = arr[i];

        }

        arr = tmp;

    }


}
