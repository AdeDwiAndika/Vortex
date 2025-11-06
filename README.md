**PC Builder Tycoon - Core Engine v1.0**
**Tim**
`Ade Dwi Andika - 3124600091`
`Revalina Salsabila - 3124600120`

**Deskripsi Proyek**
PC Builder Tycoon adalah sistem simulasi perakitan PC yang dibangun menggunakan prinsip Object-Oriented Programming (OOP). Proyek ini memungkinkan pengguna untuk merakit PC virtual dengan memilih berbagai komponen inti dan periferal, kemudian menghitung total harga dan menghasilkan laporan build.

**Arsitektur & Keputusan Desain**
Arsitektur ini menggunakan interface Priceable sebagai kontrak untuk semua komponen yang memiliki harga, memastikan konsistensi dalam perhitungan biaya. Kita menerapkan abstract class untuk setiap kategori komponen (Inti, Penyimpanan, Periferal) yang mengimplementasikan Priceable, sehingga memudahkan penambahan komponen baru di masa depan tanpa mengubah class PC. Struktur package yang terpisah (inti, penyimpanan, periferal, core) memastikan separation of concerns dan meningkatkan maintainability kode.

**Personal Reflection**
## 1. Momen “Aha!” Terbesar  
Momen paling membuka wawasan bagi saya terjadi saat mengerjakan *Misi 2 (Feature Envy)* di kelas **PCReportGenerator**. Awalnya saya mengira memindahkan method hanya soal merapikan struktur kode. Namun, ketika saya memindahkan `generateReport()` ke dalam **PC.java** dan menghapus parameter `(PC pc)`, saya baru memahami bahwa ini bukan sekadar soal kerapian, melainkan soal *kepemilikan data*. Method tersebut sebenarnya “iri” karena bekerja dengan data milik kelas lain. Dengan memindahkannya ke kelas yang tepat (pemilik datanya), kita otomatis memperbaiki enkapsulasi sekaligus mengurangi *coupling* antar kelas.

---

## 2. Kelemahan Terbesar Saya/Tim  
Tim kami tidak menerima kritik atau umpan balik dari tim auditor.

---

## 3. Skill Baru Paling Berharga  
Kemampuan baru yang paling bernilai bagi saya adalah mengenali dan melakukan *refactoring* terhadap *code smell* seperti *Feature Envy*. Di dunia profesional, kita lebih sering membaca dan memperbaiki kode orang lain daripada menulis dari awal. Mampu mengenali kode yang “iri” (seperti di **PCReportGenerator**) atau kelas yang terlalu kompleks (seperti **Main** sebelum dibuat **PCBuilder**), lalu tahu cara memperbaikinya dengan teknik seperti *Move Method* atau *Extract Class*, adalah keterampilan penting untuk mencegah *technical debt* dan menjaga kualitas *codebase* tetap terpelihara.
