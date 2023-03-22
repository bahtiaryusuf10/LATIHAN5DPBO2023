### Saya Muhammad Yusuf Bahtiar NIM 2107980 mengerjakan Latihan 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

<br>

## Deskripsi Tugas
Download this starter project: [starter project](https://drive.google.com/file/d/1TEnEay74nhGcSS9PPzQcxksIlaQhTiZ2/view?usp=sharing)

* Add more property (component type: any, except text field)
* Add method to reset form
* Refresh table after update and delete
* Add confirmation prompt before delete
* Build project (generate .jar file)

Result :

![Result](https://user-images.githubusercontent.com/100776170/226825159-64c3579c-ef65-4d58-ba21-53b0f1a2e14d.png)

<br>

## Desain GUI
![Desain-GUI](https://user-images.githubusercontent.com/100776170/226825485-0ad21503-1554-4ef8-874a-8e70b2a7ca16.png)

<br>

## Desain Program
Program didesain menjadi 2 class :
* *Menu*, dalam class ini terdapat 5 method utama diantaranya:
  + setTable   -> untuk membuat table yang memuat data mahasiswa dan akan ditampilkan ke layar
  + insertData -> untuk menambahkan data mahasiswa baru ke dalam list 
  + updateData -> untuk mengubah data mahasiswa yang terdapat di dalam list
  + deleteData -> untuk menghapus data mahasiswa dari list
  + resetForm  -> untuk membersihkan form masukkan (refresh table)
  
* *Mahasiswa*, dalam class ini terdapat 4 atribut diantaranya :
  + nim    -> berisikan NIM Mahasiswa, bertipe data `long`
  + nama   -> berisikan Nama Mahasiswa, bertipe data `string`
  + nilai  -> berisikan Nilai Mahasiswa, bertipe data `string`
  + gender -> berisikan Jenis Kelamin Mahasiswa, bertipe data `string`

  Tiap atribut memiliki setter dan getternya masing-masing yang berada pada class `Mahasiswa`.


Dalam latihan ini saya membuat beberapa interaksi ketika program digunakan oleh *user*, seperti memunculkan notifikasi ketika *user* berhasil menambahkan, mengubah, atau menghapus data. Selain itu, terdapat juga pemblokiran terhadap salah satu value dari *Combo Box*, yakni value dari opsi "-- Select One --". Jika *user* mencoba untuk memilih opsi tersebut saat hendak menambahkan data, maka tombol add tidak akan berfungsi (otomatis tidak akan memasukkan data ke dalam list). Lalu, jika *user* memilih opsi tersebut saat hendak mengubah data, maka akan menampilkan pesan erro bahwa opsi tersebut tidak valid dan akan me-reset form ketika *user* meng-klik 'ok' pada dialog yang muncul.

<br>

## Alur Program
Program akan menampilkan form yang terdiri dari 3 kolom isian bertipe textField, yakni untuk memasukkan data NIM, Nama, dan Nilai Mahasiswa serta terdapat 1 isian tarik-turun bertipe comboBox untuk memilih jenis kelamin Mahasiswa. 

1. Jika ingin menambah data, *user* dapat mengisi terlebih dahulu form tersebut lalu meng-klik tombol `Add` untuk menambahkan data ke dalam list. 
2. Jika ingin mengubah data, *user* harus meng-klik terlebih dahulu data mana yang akan di ubah pada tabel untuk memunculkan data tersebut pada form isian, ketika data telah muncul pada form, *user* dapat mengganti data tersebut dengan baru lalu meng-klik tombol `Update` untuk menyimpan perubahan.
3. Jika ingin menghapus data, sama seperti proses *update user* harus meng-klik terlebih dahulu data mana yang akan di hapus pada tabel lalu meng-klik tombol `Delete` untuk menghapus data dari list. 

Untuk setiap proses yang telah dilakukan oleh *user* akan langsung me-refresh form isian dan menampilkan data mahasiswa terkini pada tabel yang berada di bawah form isian, dan mekanisme tersebut akan dilakukan juga jika *user* meng-klik tombol `Cancel`.

<br>

## Dokumentasi
