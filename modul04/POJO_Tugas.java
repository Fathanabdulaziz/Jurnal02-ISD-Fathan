
public class POJO_Tugas {
    private String Mata_Kuliah;
    private String Tugas;
    private String Deadline;

    
    public POJO_Tugas(String mata_Kuliah, String tugas, String deadline) {
        this.Mata_Kuliah = mata_Kuliah;
        this.Tugas = tugas;
        this.Deadline = deadline;
    }

    public String getMata_Kuliah() {
        return Mata_Kuliah;
    }

    public String getTugas() {
        return Tugas;
    }

    public String getDeadline() {
        return Tugas;
    }
    
    @Override
    public String toString() {
        return "\nMata Kuliah = " + Mata_Kuliah + ", tugas = " + Tugas + ", deadline = " + Deadline;
    }
}
   