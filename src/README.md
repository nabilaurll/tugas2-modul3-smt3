# InventoryManagement

## Deskripsi Proyek
`InventoryManagement` adalah aplikasi sederhana berbasis Java yang dirancang untuk mengelola sistem inventaris produk. Aplikasi ini menggunakan prinsip pemrograman berorientasi objek (OOP) dengan implementasi antarmuka, enkapsulasi, dan metode untuk menghitung nilai total dari produk yang ada dalam inventaris.

## Fitur
- **Penambahan Produk**: Mendukung penambahan produk dengan harga dan jumlah tertentu.
- **Perhitungan Nilai Inventaris**: Menghitung total nilai semua produk yang ada di dalam inventaris.
- **Dukungan untuk Berbagai Jenis Produk**: Memungkinkan untuk menambah berbagai jenis produk dengan metode yang diimplementasikan dari antarmuka `Product`.

## Struktur Proyek
- **InventoryManagement**: Kelas utama yang berfungsi sebagai titik masuk aplikasi.
- **Product Interface**: Antarmuka yang mendefinisikan metode `calculateTotalValue()` untuk menghitung nilai total produk.
- **ProductA dan ProductB**: Kelas produk yang masing-masing memiliki atribut jumlah dan harga.
- **Inventory**: Kelas yang mengelola daftar produk dan menghitung nilai total inventaris.

## Refactoring yang Diterapkan
- **Extract Interface**: Menggunakan antarmuka `Product` untuk menghitung nilai total produk.
- **Encapsulate Field**: Menyembunyikan atribut `quantity` dan `price` di dalam kelas produk (`ProductA` dan `ProductB`) agar tidak dapat diakses langsung dari luar.
- **Extract Method**: Memisahkan inisialisasi produk ke dalam metode `initializeProducts()` untuk meningkatkan keterbacaan.
- **Inline Variable**: Menggunakan *stream* untuk menghitung total nilai inventaris tanpa variabel sementara yang tidak perlu.
- **Rename Method**: Mengubah nama metode untuk memperjelas fungsinya, seperti `printTotalInventoryValue()`.

## Petunjuk Penggunaan
1. **Kloning Proyek**:
   ```bash
   git clone https://github.com/nabilaurll/tugas2-modul3-smt3.git
