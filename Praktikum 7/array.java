public class array {
    public static void main(String[] args) {

        int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number : numbers) {
            sum += number;
        }

        // get the  total number of elements
        int arrayLength =  numbers.length;

        // calculate the average
        // convert the average from int to double
        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

// ArrayList = array dinamis yang lebih mudah diatur dr pada array statis (array
// biasa)
// ArrayList menggunakan tipe data yang bukan primitif
// ArrayList<Type> arrayList = new ArrayList<>();
// ArrayList<String> languages = new ArrayList<>();
// add() = menambahkan data pada ArrayList
// languages.add("Java");
// languages.add("Python");
// languages.add("PHP");
// get() = mengakses element dalam ArrayList
// String str = languages.get(1);
// set() = mengubah nilai element dalam ArrayList
// languages.set(0, "JavaScript");
// remove() = menghapus element pada ArrayList
// String str = languages.remove(2);
// size() = mengembalikan nilai panjang dari ArrayList
// sort() = mengurutkan element ArrayList
// contains() = mencari element tertentu dan mengembalikan nilai boolean
// isEmpty() = mengecek apalak ArrayList kosong atau tidak dan mengembalikan
// nilai boolean
// indexOf() = mencari element tertentu dan mengembalikan nilai index dari
// element tersebut
// clear() = menghapus semua element array