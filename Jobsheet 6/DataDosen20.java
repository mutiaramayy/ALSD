public class DataDosen20 {
    Dosen20[] dataDosen = new Dosen20[10];
    int idx = 0;

    // Menambahkan data dosen ke dalam array
    public void tambah(Dosen20 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Menampilkan seluruh data dosen
    public void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong!");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    // Sorting usia secara Ascending (Bubble Sort)
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen20 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan secara Ascending berdasarkan usia.");
    }

    // Sorting usia secara Descending (Selection Sort)
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            // Swap elemen
            Dosen20 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data telah diurutkan secara Descending berdasarkan usia.");
    }

    // Sorting usia secara Descending (Insertion Sort)
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen20 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data telah diurutkan secara Descending menggunakan Insertion Sort.");
    }
}
