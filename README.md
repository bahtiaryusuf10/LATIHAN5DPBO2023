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
