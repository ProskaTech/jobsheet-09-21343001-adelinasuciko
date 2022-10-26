## Object-oriented Programming (Lab Work) Template Guides
Nama : Adelina Suciko

Nim : 21343001

Analisis job-9:

OOP berputar pada konsep dari object sebagai dasar element dari program anda. Ketika kita membandingkan dengan dunia nyata, kita dapat menemukan beberapa objek disekitar kita,seperti mobil,singa, manusia dan seterusnya. Object ini di karakterisasi oleh sifat / attributnya dan tingkah lakunya. Contohnya, objek sebuah mobil mempunyai sifat tipe transmisi, warna dan manufaktur, dimana ini bisa kita sebut sebagai Properti/Atribut. Mempunyai kelakuan berbelok, mengerem dan berakselerasi,Kelakuan ini bisa kita sebut sebagai Behavior/Method.

    Latihan 1: Pass By Value

    image

    Pass By Value dan Pass By Reference merupakan metode dalam mengirimkan parameter ke dalam sebuah fungsi, dimana didalam java disebut Behavior/Method . Pass By Value melewatkan parameter berdasarkan nilainya.
    Disini nilai parameter aktual akan dilewatkan pada saat pemanggilan method akan disalin ke parameter formal sehingga perubahan nilai pada method, tidak akan berpengaruh terhadap argument yang digunakan untuk memanggil method tersebut. Dengan kata lain, perubahan nilai tersebut hanya akan dikenali pada method yang bersangkutan saja.

    Latihan 2 : Pass By Reference

    image

    Pass By Reference melewatkan parameter berdasarkan referensinya. Pada cara ini , referensi dari argumen (bukan nilai argumen) akan dilewatkan kedalam parameter formal, bukan disalin.
    Dengan demikian, nilai yang digunakan di dalam method akan sama dengan nilai yang di tunjuk referensi.
    Melalui cara ini setiap perubahan nilai yang terjadi pada method juga akan berpengaruh terhadap argumen yang digunakan untuk memanggilnya.

    Perbandingan Object

    image

    Metode equals() membandingkan dua String berdasarkan kontennya. Sehingga, apabila dua buah String memiliki huruf-huruf yang sama, diurutan yang sama dan besar-kecil yang sama maka dua String ini akan dianggap sama.
    Pada Latihan ini,kita membandingkan 2 buah String yaitu, str1 dan str2 dengan simbol "==".

    Latihan 4 : Pemanggilan Method Menggunakan Parameter

    image
    image
    Dilanjutkan dengan membuat class baru untuk melanjutkan class diatas.
    image

    class baru hanya dapat mengakses kelas induk,jika class induk tidak private
