Bagian A — Pemeriksaan Konsep


Mengapa linkedlist membutuhkan variabel head?
= linkedlist membutuhkan head karena head berguna sebagai petunjuk yang akan memberi tahu letak node pertama dalam list. head menjadi awal untuk membaca list, kalau head tidak ada maka kita tidak tau yang mana yang menjadi awal dari list.
Analoginya seperti kererta. Jika kita tidak mempunyai head. maka kita tidak akan bisa masuk kedalam kereta karena tidak ada pintu di gerbong manapun dalam kereta. Sedangkan dengan adanya head kita bisa tau yang letak pintunya sesuai dengan head yang ditentukan. Kalau head ditentukan di node pertama maka seperti pintu ditentukan digerbang pertama dan jika head ditentukan di node ketiga maka pintu ditentukan digerbang ketiga. 

Mengapa setiap node menyimpan referensi next?
= karena next dalam node bertugas untuk memberikan petunjuk node selanjutnya dalam list. Jika next tidak ada. maka node pertama yang menjadi head tidak tau berjalan lanjut kemana.  

Mengapa penyisipan di awal lebih mudah dalam linkedlist daripada dalam array?
= karena kalau dalam linked list kita hanya perlu membuat noda baru dan mengganti pointer saja, misal ada dua node yaitu A dan B.  Node A berisi elemen 5 dan pointer mengarah ke node B. Ketika kita ingin menggantikan node A kita tinggal membuat satu node baru, misalnya node C. Lalu isi pointer di node C mengarah ke node A.

Sedangkan kalau array, ketika kita mau sisipkan kita perlu mengeser seluruh elemen sehingga memakan kompleksitas O(n) sebanyak n kali sedangkan linkedlist hanya O(1)


Bagian B — Membaca Kode


Dalam insertAtBeginning(), mengapa kita menulis:
newNode.next = head;
head = newNode;
dalam urutan itu?
= untuk menyambungkan node baru dalam list lama. Jadi baris pertama 'newNode.next = head;' untuk membuat node baru, lalu baris kedua 'head = newNode;' untuk pindahkan head nya di node baru sehingga node tau kalau headnya dipindahkan ke node baru.

Di display(), apa yang akan terjadi jika kita secara tidak sengaja menulis:
while (current.next != null)
bukannya:

while (current != null)
= karena kondisi 'while (current.next != null)' akan jalan kalau node berikutnya masih ada sedangkan kondisi 'while (current != null)' berarti node sekarang. Jadi dengan menggunakan kondisi 'while (current != null)' loop akan berhenti. 



Bagian C — Perbandingan dengan Array


Struktur mana yang lebih baik untuk akses acak yang cepat?
= Array lebih cepat untuk akses acak karena bisa diakses melalui index tetap disetiap elemen dan memakan hanya O(1) kompleksitas waktu. Sedangkan linkedlist tidak dapat lompat ke index tertentu karena tidak tetap dan bisa berubah-ubah, jadi selalu perlu mulai dari head sehingga memakan waktu kompleksitas O(n).

Struktur mana yang lebih baik untuk sering dimasukkan di awal?
= Linkedlist lebih baik untuk sering dimasukkan ke awal karena tidak perlu mengeser semua elemen seperti array berbeda dengan linked list hanya hanya menambahkan node baru, ubah pointer dan ubah headnya. Linkedlist lebih cepat dan efisien.

Mengapa linked list menggunakan lebih banyak memori daripada array?
= Linked list lebih banyak menggunakan memori karena perlu menyimpan elemen dan pointer dalam satu node. Sedangkan array hanya menyimpan elemen data saja.