package Patika_3_Week.Odevler.ListeSınıfı;

public class MyList<T> {
    private T[] array;
    private int size = 0; // Kaç eleman var
    private int capacity; // Dizi kapasitesi

    // Varsayılan constructor - kapasite 10
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    // Kapasiteyi kullanıcıdan alan constructor
    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    // Eleman ekleme metodu
    public void add(T data) {
        if (size >= capacity) {
            // Yer kalmadıysa kapasiteyi iki katına çıkar
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];

            if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);

            array = newArray;
        }

        array[size++] = data; // Elemanı ekle ve boyutu arttır
    }

    // Eleman sayısını döner
    public int size() {
        return size;
    }

    // Kapasiteyi döner
    public int getCapacity() {
        return capacity;
    }
}
