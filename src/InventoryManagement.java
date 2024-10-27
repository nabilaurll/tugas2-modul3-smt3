//sesudah refactor

import java.util.ArrayList;
import java.util.List;

/**
 * kelas utama untuk mengelola inventaris
 * kelas ini berisi metode main untuk menjalankan program
 */
public class InventoryManagement {
    public static void main (String[] args){
        Inventory inventory = new Inventory();
        inventory.printTotalInventoryValue();
    }
}

/**
 * antarmuka yang mendefinisikan produk dengan metode untuk menghitung total nilainya
 */
interface Product {
    /**
     * menghitung total nilai produk berdasarkan jumlah dan harga
     *
     * @return
     */
    double calculateTotalValue();
}

/**
 * kelas yang merepresentasikan produkA dengan jumlah harga tertentu
 * mengimplementasikan antarmuka product
 */
 class ProductA implements Product{ //encapsulate field (menyembunyikan detail implementasi dengan menggunakan variabel secara privat)
    private int quantity;
    private double price;

    /**
     * membuat produkA dengan jumlah dan harga yang ditentukan
     *
     * @param quantity
     * @param price
     */

    public ProductA(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * menghitung total nilai produkA
     *
     * @return total nilai dari produkA
     */
    @Override
    public double calculateTotalValue(){
        return  quantity * price;
    }
}

/**
 * kelas yang merepresentasikan produkB dengan jumlah harga tertentu
 * mengimplementasikan antarmuka product
 *
 */
class ProductB implements Product{ //encapsulate field (menyembunyikan detail implementasi dengan menggunakan variabel secara privat)
    private int quantity;
    private double price;

    /**
     * membuat produkB dengan jumlah dan harga yang ditentukan
     *
     * @param quantity
     * @param price
     */

    public ProductB(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * menghitung total nilai produkB
     *
     * @return total nilai dari produkB
     */
    @Override
    public double calculateTotalValue(){
        return quantity * price;
    }
}

/**
 * kelas yang merepresentasikan inventory yang mengelola daftar produk
 */
 class Inventory {
    private List<Product> products;

    /**
     * contructs inventaris dan menginisialisasi daftar produk
     */

    public Inventory(){
        this.products = new ArrayList<>();
        initializeProducts(); //extract method
    }

    /**
     * inisialisasi list produk dengan produk yg telah ditentukan sebelumnya
     */
    private void initializeProducts(){ //exctract method untuk menginisialisasi daftar produk, sehingga meningkatkan keterbacaan kode
        products.add(new ProductA(10,50000));
        products.add(new ProductB(5, 30000));
    }

    /**
     * kalkulasi total value dari semua produk di inventory
     * @return total inventory value
     */
    public double calculateTotalInventoryValue(){  //inline variable
        return products.stream().mapToDouble(Product::calculateTotalValue).sum();
    }

    /**
     * print total inventory value
     */
    public void printTotalInventoryValue(){  //rename method
        System.out.println("Total nilai inventaris : "+ calculateTotalInventoryValue());
    }
}
