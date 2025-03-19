public class MahasiswaBerprestasi20 {
    Mahasiswa20[] listMhs = new Mahasiswa20[5];
    int idx;

    // Metode untuk menambahkan mahasiswa ke dalam list
    void tambah(Mahasiswa20 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // Metode untuk menampilkan daftar mahasiswa
    void tampil() {
        for (Mahasiswa20 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------------------");
        }
    }

    // Metode untuk mengurutkan mahasiswa berdasarkan IPK (Descending) dengan Bubble Sort
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa20 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    // Metode untuk mengurutkan mahasiswa berdasarkan IPK (Ascending) dengan Selection Sort
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Swap elemen
            Mahasiswa20 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // Metode untuk mengurutkan mahasiswa berdasarkan IPK (Ascending) dengan Insertion Sort
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa20 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
